package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes2.dex */
public final class xz7 {
    public static final int a = kti.d(100 * vw4.d().getDisplayMetrics().density);
    public static final s8a b = new s8a(6);
    public static int c;
    public static SharedPreferences d;
    public static final tcf e;
    public static final tcf f;

    static {
        tcf tcfVarA = ucf.a(Boolean.FALSE);
        e = tcfVarA;
        f = tcfVarA;
    }

    public static int a(Context context) {
        s8a s8aVar = b;
        if (s8aVar.e == 0) {
            SharedPreferences sharedPreferences = d;
            if (sharedPreferences == null) {
                sharedPreferences = context.getApplicationContext().getSharedPreferences("keyboard_prefs", 0);
            }
            if (d == null) {
                d = sharedPreferences;
            }
            int iMax = Math.max(context.getResources().getDisplayMetrics().widthPixels, context.getResources().getDisplayMetrics().heightPixels) / 3;
            s8aVar.d(sharedPreferences.getInt("pref_keyboard_height_portrait", iMax), "pref_keyboard_height_portrait");
            s8aVar.d(sharedPreferences.getInt("pref_keyboard_height_portrait", iMax), "pref_keyboard_height_landscape");
        }
        int iB = s8aVar.b(1 == context.getResources().getConfiguration().orientation ? "pref_keyboard_height_portrait" : "pref_keyboard_height_landscape");
        return iB >= 0 ? s8aVar.c[iB] : Math.max(context.getResources().getDisplayMetrics().widthPixels, context.getResources().getDisplayMetrics().heightPixels) / 3;
    }

    public static boolean b(int i) {
        return i > a;
    }
}
