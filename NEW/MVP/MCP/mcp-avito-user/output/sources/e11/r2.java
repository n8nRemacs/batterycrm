package e11;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes7.dex */
public class r2 {

    /* renamed from: b, reason: collision with root package name */
    @j.P
    public static volatile r2 f394775b;

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public final SharedPreferences f394776a;

    public r2(@j.N SharedPreferences sharedPreferences) {
        this.f394776a = sharedPreferences;
    }

    @j.N
    public static r2 a(@j.N Context context) {
        r2 r2Var = f394775b;
        if (r2Var == null) {
            synchronized (r2.class) {
                try {
                    r2Var = f394775b;
                    if (r2Var == null) {
                        r2Var = new r2(context.getSharedPreferences("mytarget_prefs", 0));
                        f394775b = r2Var;
                    }
                } finally {
                }
            }
        }
        return r2Var;
    }

    @SuppressLint({"ApplySharedPref"})
    public final void b(@j.N String str, @j.P String str2) {
        try {
            SharedPreferences.Editor editorEdit = this.f394776a.edit();
            editorEdit.putString(str, str2);
            editorEdit.commit();
        } catch (Throwable th2) {
            th2.toString();
        }
    }

    @j.N
    public final String c(@j.N String str) {
        try {
            String string = this.f394776a.getString(str, null);
            return string != null ? string : "";
        } catch (Throwable th2) {
            th2.toString();
            return "";
        }
    }
}
