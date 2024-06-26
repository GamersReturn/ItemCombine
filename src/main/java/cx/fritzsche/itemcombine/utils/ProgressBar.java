package cx.fritzsche.itemcombine.utils;

import com.google.common.base.Strings;
import org.bukkit.ChatColor;

public class ProgressBar {
    public static String getProgressBar(int current, int max, int totalBars, char symbol, ChatColor completedColor, ChatColor notCompletedColor) {
        float percent = (float) current / (float) max;
        int progressBars = (int) ((float) totalBars * percent);
        return Strings.repeat("" + completedColor + symbol, progressBars) + Strings.repeat("" + notCompletedColor + symbol, totalBars - progressBars);
    }
}
