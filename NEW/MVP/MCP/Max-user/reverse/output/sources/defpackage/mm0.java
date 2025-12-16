package defpackage;

/* loaded from: classes.dex */
public final class mm0 implements py4, zr {
    public boolean X;
    public volatile boolean Y;
    public long Z;
    public final vta a;
    public final nm0 b;
    public boolean c;
    public boolean d;
    public lk6 o;

    public mm0(vta vtaVar, nm0 nm0Var) {
        this.a = vtaVar;
        this.b = nm0Var;
    }

    public final void a(long j, Object obj) {
        if (this.Y) {
            return;
        }
        if (!this.X) {
            synchronized (this) {
                try {
                    if (this.Y) {
                        return;
                    }
                    if (this.Z == j) {
                        return;
                    }
                    if (this.d) {
                        lk6 lk6Var = this.o;
                        if (lk6Var == null) {
                            lk6Var = new lk6(2, (byte) 0);
                            this.o = lk6Var;
                        }
                        lk6Var.m(obj);
                        return;
                    }
                    this.c = true;
                    this.X = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        test(obj);
    }

    @Override // defpackage.py4
    public final void dispose() {
        if (this.Y) {
            return;
        }
        this.Y = true;
        this.b.v(this);
    }

    @Override // defpackage.py4
    public final boolean e() {
        return this.Y;
    }

    @Override // defpackage.m7c
    public final boolean test(Object obj) {
        return this.Y || tma.a(this.a, obj);
    }
}
