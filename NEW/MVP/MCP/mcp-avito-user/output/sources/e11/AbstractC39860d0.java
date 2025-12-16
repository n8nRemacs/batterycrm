package e11;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;

/* renamed from: e11.d0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39860d0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public final HashMap f394564a = new HashMap();

    public static boolean b(@j.N Context context, @j.N String str) {
        int iCheckCallingOrSelfPermission;
        try {
            iCheckCallingOrSelfPermission = context.checkCallingOrSelfPermission(str);
        } catch (Throwable th2) {
            th2.getMessage();
            iCheckCallingOrSelfPermission = -1;
        }
        return iCheckCallingOrSelfPermission == 0;
    }

    public final synchronized void a(@j.N String str, @j.P String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (str2 == null) {
            f(str);
        } else {
            this.f394564a.put(str, str2);
        }
    }

    @j.P
    public final synchronized String c(@j.N String str) {
        return (String) this.f394564a.get(str);
    }

    public final synchronized void d(@j.N HashMap map) {
        map.putAll(this.f394564a);
    }

    public final synchronized void e() {
        this.f394564a.clear();
    }

    public final synchronized boolean f(@j.N String str) {
        if (!this.f394564a.containsKey(str)) {
            return false;
        }
        this.f394564a.remove(str);
        return true;
    }
}
