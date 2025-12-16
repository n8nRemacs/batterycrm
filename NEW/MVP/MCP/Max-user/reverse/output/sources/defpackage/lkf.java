package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final /* synthetic */ class lkf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ okf b;

    public /* synthetic */ lkf(okf okfVar, int i) {
        this.a = i;
        this.b = okfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                RecyclerView recyclerView = this.b.o;
                if (!recyclerView.Z()) {
                    recyclerView.Y();
                    break;
                }
                break;
            default:
                this.b.t0.set(true);
                break;
        }
    }
}
