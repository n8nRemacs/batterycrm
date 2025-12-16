package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class hh4 extends nk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hh4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void e() {
    }

    @Override // defpackage.nk0
    public final void a() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                ((AtomicBoolean) this.b).set(true);
                break;
            case 2:
                ((cd8) this.b).a();
                break;
            case 3:
                ((fd8) this.b).a();
                break;
            case 4:
                ((qe8) this.b).a();
                break;
            case 5:
                ((fd8) this.b).a();
                break;
            default:
                z6c z6cVar = (z6c) this.b;
                if (z6cVar.n()) {
                    z6cVar.b.c();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.nk0
    public void b() {
        switch (this.a) {
            case 0:
                ih4 ih4Var = (ih4) this.b;
                if (((mk0) ih4Var.c).f()) {
                    ih4Var.g.c();
                    break;
                }
                break;
        }
    }
}
