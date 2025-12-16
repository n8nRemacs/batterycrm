package defpackage;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class ohf implements di4 {
    public static final ohf a = new ohf();
    public static final phf b = phf.b;

    @Override // defpackage.di4
    public final ki4 a() {
        return b;
    }

    @Override // defpackage.di4
    public final ni4 b(String str, gi4 gi4Var, Bundle bundle) {
        if (!b.a.contains(gi4Var)) {
            return null;
        }
        phf.b.getClass();
        if (gi4Var.equals(phf.c)) {
            return new ni4(str, gi4Var, bundle, 1, null, new np1(bundle, 12), 16);
        }
        throw new IllegalStateException(az1.h("invalid route ", gi4Var));
    }
}
