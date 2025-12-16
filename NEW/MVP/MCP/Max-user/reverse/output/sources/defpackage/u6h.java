package defpackage;

import android.view.View;

/* loaded from: classes2.dex */
public final class u6h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ v6h c;
    public final /* synthetic */ b5h d;
    public final /* synthetic */ w8h o;

    public /* synthetic */ u6h(v6h v6hVar, v6h v6hVar2, b5h b5hVar, w8h w8hVar, int i) {
        this.a = i;
        this.b = v6hVar;
        this.c = v6hVar2;
        this.d = b5hVar;
        this.o = w8hVar;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, k18] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                v6h v6hVar = this.c;
                if (!v6hVar.o.u()) {
                    v6h.f(v6hVar, this.d, this.o);
                    break;
                }
                break;
            default:
                v6h v6hVar2 = this.c;
                if (!dqi.r(v6hVar2.o.c) && !v6hVar2.o.u()) {
                    v6h.f(v6hVar2, this.d, this.o);
                    break;
                }
                break;
        }
    }
}
