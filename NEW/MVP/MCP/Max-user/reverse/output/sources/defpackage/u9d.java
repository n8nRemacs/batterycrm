package defpackage;

import android.view.View;

/* loaded from: classes2.dex */
public final class u9d extends n2 implements wad {
    public y8d X;
    public boolean Y;
    public boolean d;
    public em6 o;

    public u9d() {
        super(new llc(2));
        this.d = true;
    }

    @Override // defpackage.wad
    public final void g(xl9 xl9Var, boolean z) {
        ((e9d) T()).setOnChipClickListener(this.o);
        y8d y8dVar = this.X;
        if (y8dVar != null) {
            ((e9d) T()).setChipObserver(y8dVar);
        }
        ((e9d) T()).setStackFromEnd(this.Y);
        ((e9d) T()).setIncoming(this.d);
        ((e9d) T()).f(xl9Var, z);
        y();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    @Override // defpackage.wad
    public final void l(yt0 yt0Var, boolean z) {
        ?? r0 = this.c;
        if (r0.e()) {
            e9d e9dVar = (e9d) T();
            e9dVar.getClass();
            int i = 0;
            while (i < e9dVar.getChildCount()) {
                int i2 = i + 1;
                View childAt = e9dVar.getChildAt(i);
                if (childAt == null) {
                    throw new IndexOutOfBoundsException();
                }
                c9d c9dVar = (c9d) childAt;
                cu0 cu0Var = yt0Var.d.a;
                wt0 wt0Var = yt0Var.a.c;
                if (z) {
                    c9dVar.o = wt0Var.a;
                    c9dVar.s0 = wt0Var.b;
                    c9dVar.t0 = cu0Var.a;
                    c9dVar.u0 = cu0Var.b;
                } else {
                    c9dVar.o = wt0Var.c;
                    c9dVar.s0 = wt0Var.d;
                    c9dVar.t0 = cu0Var.c;
                    c9dVar.u0 = cu0Var.d;
                }
                c9dVar.invalidate();
                i = i2;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    @Override // defpackage.wad
    public final void r(boolean z) {
        ?? r0 = this.c;
        if (r0.e()) {
            ((e9d) T()).f(null, z);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    @Override // defpackage.wad
    public final void setChipObserver(y8d y8dVar) {
        if (this.c.e()) {
            ((e9d) T()).setChipObserver(y8dVar);
        } else {
            this.X = y8dVar;
        }
    }

    @Override // defpackage.wad
    public final void setIsIncoming(boolean z) {
        this.d = z;
    }

    @Override // defpackage.wad
    public final void setOnClickListener(em6 em6Var) {
        this.o = em6Var;
    }

    @Override // defpackage.wad
    public final void setStackFromEnd(boolean z) {
        this.Y = z;
    }
}
