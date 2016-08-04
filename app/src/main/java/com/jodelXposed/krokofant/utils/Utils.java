package com.jodelXposed.krokofant.utils;

import android.content.Context;

import java.util.ArrayList;

import static de.robv.android.xposed.XposedHelpers.callMethod;
import static de.robv.android.xposed.XposedHelpers.callStaticMethod;
import static de.robv.android.xposed.XposedHelpers.findClass;

public class Utils {
    public static Context getSystemContext() {
        Object activityThread = callStaticMethod(findClass("android.app.ActivityThread", null), "currentActivityThread");
        return (Context) callMethod(activityThread, "getSystemContext");
    }

    /**
     * These are the only accepted Colors by the Jodel Server, credits to pydel by rolsdorph
     */
    public static class Colors {
        public static ArrayList<String> Colors = new ArrayList<String>() {{
            add("#FFFF9908"); //Orange
            add("#FFFFBA00"); //Yellow
            add("#FFDD5F5F"); //Red
            add("#FF06A3CB"); //Blue
            add("#FF8ABDB0"); //Bluegrayish
            add("#FF9EC41C"); //Green
        }};
    }
}
