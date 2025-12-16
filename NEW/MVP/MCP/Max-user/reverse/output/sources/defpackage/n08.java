package defpackage;

import java.util.Random;

/* loaded from: classes.dex */
public final class n08 extends Random {
    public final j7d a = k7d.a;
    public boolean b;

    @Override // java.util.Random
    public final int next(int i) {
        this.a.getClass();
        return k7d.b.a(i);
    }

    @Override // java.util.Random
    public final boolean nextBoolean() {
        this.a.getClass();
        return k7d.b.h();
    }

    @Override // java.util.Random
    public final void nextBytes(byte[] bArr) {
        this.a.getClass();
        k7d.b.g().nextBytes(bArr);
    }

    @Override // java.util.Random
    public final double nextDouble() {
        this.a.getClass();
        return k7d.b.i();
    }

    @Override // java.util.Random
    public final float nextFloat() {
        this.a.getClass();
        return k7d.b.j();
    }

    @Override // java.util.Random
    public final int nextInt() {
        this.a.getClass();
        return k7d.b.b();
    }

    @Override // java.util.Random
    public final long nextLong() {
        this.a.getClass();
        return k7d.b.d();
    }

    @Override // java.util.Random
    public final void setSeed(long j) {
        if (this.b) {
            throw new UnsupportedOperationException("Setting seed is not supported.");
        }
        this.b = true;
    }

    @Override // java.util.Random
    public final int nextInt(int i) {
        this.a.getClass();
        return k7d.b.c(i);
    }
}
