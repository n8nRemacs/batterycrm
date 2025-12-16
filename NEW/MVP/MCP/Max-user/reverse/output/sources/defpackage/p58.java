package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class p58 implements di4 {
    public static final p58 a = new p58();
    public static final q58 b = q58.b;

    @Override // defpackage.di4
    public final ki4 a() {
        return b;
    }

    @Override // defpackage.di4
    public final ni4 b(String str, gi4 gi4Var, Bundle bundle) {
        if (q58.b.a.contains(gi4Var)) {
            return new ni4(str, gi4Var, bundle, 0, li4.c, new np1(bundle, 8), 8);
        }
        return null;
    }
}
