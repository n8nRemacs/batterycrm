package defpackage;

import android.util.Pair;

/* loaded from: classes.dex */
public final class e8g extends ws4 {
    public final /* synthetic */ f8g c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e8g(f8g f8gVar, hj0 hj0Var) {
        super(hj0Var);
        this.c = f8gVar;
    }

    @Override // defpackage.ws4, defpackage.hj0
    public final void d() {
        this.b.c();
        m();
    }

    @Override // defpackage.ws4, defpackage.hj0
    public final void f(Throwable th) {
        this.b.e(th);
        m();
    }

    @Override // defpackage.hj0
    public final void h(int i, Object obj) {
        this.b.g(i, obj);
        if (hj0.a(i)) {
            m();
        }
    }

    public final void m() {
        Pair pair;
        synchronized (this.c) {
            try {
                pair = (Pair) this.c.c.poll();
                if (pair == null) {
                    f8g f8gVar = this.c;
                    f8gVar.b--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (pair != null) {
            this.c.d.execute(new owf(this, 1, pair));
        }
    }
}
