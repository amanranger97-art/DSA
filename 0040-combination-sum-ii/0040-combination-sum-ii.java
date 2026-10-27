
import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);

        List<List<Integer>> ans = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), ans);
        return ans;
    }
    void backtrack(int[] candidates, int remaining, int start,
                   List<Integer> current, List<List<Integer>> ans) {
        if (remaining == 0) {
            ans.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i < candidates.length; i++) {

            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }
            if (candidates[i] > remaining) {
                break;
            }
            current.add(candidates[i]);

            backtrack(candidates, remaining - candidates[i],
                      i + 1, current, ans);
            current.remove(current.size() - 1);
        }
    }
}
