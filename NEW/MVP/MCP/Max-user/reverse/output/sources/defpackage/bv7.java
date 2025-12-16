package defpackage;

import android.net.Uri;

/* loaded from: classes.dex */
public final class bv7 extends i3 {
    public static final bv7 c = new bv7(11);

    public static Uri L0(long j, String str, String str2, boolean z) {
        hi4 hi4Var = new hi4();
        hi4Var.a = ":join";
        hi4Var.c(Long.valueOf(j), "id");
        hi4Var.c(str2, "link");
        hi4Var.c(Boolean.valueOf(z), "channel");
        hi4Var.c(Boolean.TRUE, "no_anim");
        if (str != null) {
            hi4Var.c(str, "title");
        }
        return hi4Var.a();
    }
}
