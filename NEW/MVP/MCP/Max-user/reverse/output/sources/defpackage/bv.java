package defpackage;

import ru.ok.tamtam.loader.AsyncHistoryLoader$AsyncHistoryLoaderException;

/* loaded from: classes2.dex */
public final /* synthetic */ class bv implements gu3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ul2 b;

    public /* synthetic */ bv(ul2 ul2Var, int i) {
        this.a = i;
        this.b = ul2Var;
    }

    @Override // defpackage.gu3
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        switch (this.a) {
            case 0:
                this.b.s0.b();
                break;
            case 1:
                ((y3b) this.b.X).a(new AsyncHistoryLoader$AsyncHistoryLoaderException("loadPrev: exception", th));
                break;
            case 2:
                this.b.Z.b();
                break;
            default:
                ul2 ul2Var = this.b;
                wqi.b(ul2Var.a, "load: exception", th);
                ((y3b) ul2Var.X).a(new AsyncHistoryLoader$AsyncHistoryLoaderException("load: exception", th));
                break;
        }
    }
}
