package defpackage;

import java.util.Random;

/* loaded from: classes.dex */
public abstract class t3 extends k7d {
    @Override // defpackage.k7d
    public final int a(int i) {
        return ((-i) >> 31) & (g().nextInt() >>> (32 - i));
    }

    @Override // defpackage.k7d
    public final int b() {
        return g().nextInt();
    }

    @Override // defpackage.k7d
    public final int c(int i) {
        return g().nextInt(i);
    }

    @Override // defpackage.k7d
    public final long d() {
        return g().nextLong();
    }

    public abstract Random g();

    public final boolean h() {
        return g().nextBoolean();
    }

    public final double i() {
        return g().nextDouble();
    }

    public final float j() {
        return g().nextFloat();
    }
}
