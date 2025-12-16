package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class jo5 implements di4 {
    public static final jo5 a = new jo5();
    public static final ko5 b = ko5.b;

    @Override // defpackage.di4
    public final ki4 a() {
        return b;
    }

    @Override // defpackage.di4
    public final ni4 b(String str, gi4 gi4Var, Bundle bundle) {
        if (!b.a.contains(gi4Var)) {
            return null;
        }
        ko5.b.getClass();
        if (gi4Var.equals(ko5.c)) {
            return new ni4(str, gi4Var, bundle, 0, null, new np1(bundle, 3), 24);
        }
        throw new IllegalStateException(az1.h("unknown screen ", gi4Var));
    }
}
