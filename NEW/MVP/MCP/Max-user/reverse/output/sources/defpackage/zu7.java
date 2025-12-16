package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class zu7 implements di4 {
    public static final zu7 a = new zu7();
    public static final av7 b = av7.b;

    @Override // defpackage.di4
    public final ki4 a() {
        return b;
    }

    @Override // defpackage.di4
    public final ni4 b(String str, gi4 gi4Var, Bundle bundle) {
        if (!b.a.contains(gi4Var)) {
            return null;
        }
        li4 li4Var = new li4(new i77(19), new i77(20));
        av7.b.getClass();
        if (gi4Var.equals(av7.c)) {
            return new ni4(str, gi4Var, bundle, 0, li4Var, new np1(bundle, 7), 8);
        }
        throw new IllegalStateException(az1.h("unknown screen ", gi4Var));
    }
}
