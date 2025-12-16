package defpackage;

import java.util.function.Consumer;

/* loaded from: classes3.dex */
public final /* synthetic */ class plf implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ qlf b;

    public /* synthetic */ plf(qlf qlfVar, int i) {
        this.a = i;
        this.b = qlfVar;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                qlf qlfVar = this.b;
                qlfVar.a.b.l(new olf(qlfVar, 0), epi.a(r0.a) + 9, hf5.d, new plf(qlfVar, 0), true);
                break;
            case 1:
                qlf.y(this.b, (atc) obj);
                break;
            default:
                qlf qlfVar2 = this.b;
                qlfVar2.a.b.k((atc) obj, new plf(qlfVar2, 2), false);
                break;
        }
    }
}
