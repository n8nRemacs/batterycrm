package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class y63 implements di4 {
    public static final y63 a = new y63();
    public static final z63 b = z63.b;

    @Override // defpackage.di4
    public final ki4 a() {
        return b;
    }

    @Override // defpackage.di4
    public final ni4 b(String str, gi4 gi4Var, Bundle bundle) {
        if (!b.a.contains(gi4Var)) {
            return null;
        }
        li4 li4Var = new li4(new fu2(13), new fu2(14));
        if (gi4Var.equals(z63.c)) {
            return new ni4(str, gi4Var, bundle, 1, li4Var, new g(8));
        }
        throw new IllegalStateException(az1.h("invalid route ", gi4Var));
    }
}
