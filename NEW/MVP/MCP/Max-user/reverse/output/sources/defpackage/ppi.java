package defpackage;

import android.content.Context;
import one.me.sdk.camerax.vms.processor.VideoMessageProcessorException;

/* loaded from: classes.dex */
public abstract class ppi {
    public static cl3 a(String str, String str2) {
        na0 na0Var = new na0(str, str2);
        bl3 bl3VarB = cl3.b(na0.class);
        bl3VarB.c = 1;
        bl3VarB.g = new i62(12, na0Var);
        return bl3VarB.b();
    }

    public static void b(u75 u75Var) {
        if (u75Var.equals(u75.f)) {
            throw new VideoMessageProcessorException("The specified dynamic range=" + u75Var + " is not supported yet", null);
        }
    }

    public static cl3 c(String str, os5 os5Var) {
        bl3 bl3VarB = cl3.b(na0.class);
        bl3VarB.c = 1;
        bl3VarB.a(vt4.a(Context.class));
        bl3VarB.g = new dq4(str, 9, os5Var);
        return bl3VarB.b();
    }

    public static final boolean d(int i, int i2) {
        return (i & i2) == i2;
    }
}
