package defpackage;

import android.os.Bundle;

/* loaded from: classes2.dex */
public abstract class l3f implements di4 {
    public final k3f a;

    public l3f() {
        k3f k3fVar = new k3f();
        e(k3fVar);
        this.a = k3fVar;
    }

    @Override // defpackage.di4
    public final ki4 a() {
        return this.a;
    }

    @Override // defpackage.di4
    public final ni4 b(String str, gi4 gi4Var, Bundle bundle) {
        if (this.a.a.contains(gi4Var)) {
            return new ni4(str, gi4Var, bundle, 0, c(), d(bundle), 8);
        }
        return null;
    }

    public li4 c() {
        return new li4((q8g) null, 3);
    }

    public abstract mi4 d(Bundle bundle);

    public abstract void e(k3f k3fVar);
}
