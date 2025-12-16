package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class sta extends AtomicReference implements py4, Runnable {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ sta(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.py4
    public final void dispose() {
        switch (this.a) {
            case 0:
                ty4.a(this);
                break;
            default:
                ty4.a(this);
                break;
        }
    }

    @Override // defpackage.py4
    public final boolean e() {
        switch (this.a) {
            case 0:
                return get() == ty4.a;
            default:
                return ty4.c((py4) get());
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                vta vtaVar = (vta) this.b;
                if (!e()) {
                    vtaVar.f(0L);
                    lazySet(cd5.a);
                    vtaVar.b();
                    break;
                }
                break;
            default:
                ((v2f) this.b).a(0L);
                break;
        }
    }
}
