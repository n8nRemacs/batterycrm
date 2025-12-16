package defpackage;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class dyg {
    public static final long b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static dyg d;
    public final lwf a;

    public dyg(lwf lwfVar) {
        this.a = lwfVar;
    }

    public final boolean a(ab0 ab0Var) {
        if (TextUtils.isEmpty(ab0Var.c)) {
            return true;
        }
        long j = ab0Var.f + ab0Var.e;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.a.getClass();
        return j < timeUnit.toSeconds(System.currentTimeMillis()) + b;
    }
}
