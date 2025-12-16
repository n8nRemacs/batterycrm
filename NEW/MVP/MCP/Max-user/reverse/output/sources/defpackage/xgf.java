package defpackage;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class xgf implements di4 {
    public static final xgf a = new xgf();
    public static final ygf b = ygf.b;

    @Override // defpackage.di4
    public final ki4 a() {
        return b;
    }

    @Override // defpackage.di4
    public final ni4 b(String str, gi4 gi4Var, Bundle bundle) {
        if (!b.a.contains(gi4Var)) {
            return null;
        }
        ygf.b.getClass();
        if (gi4Var.equals(ygf.c)) {
            return new ni4(str, gi4Var, bundle, 1, new li4(new nte(17), new nte(18)), new kdc(l8j.i("sticker_id", bundle), bundle, 3));
        }
        throw new IllegalStateException(az1.h("invalid route ", gi4Var));
    }
}
