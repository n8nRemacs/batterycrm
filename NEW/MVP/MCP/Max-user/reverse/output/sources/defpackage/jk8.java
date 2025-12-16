package defpackage;

import java.time.Instant;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public final /* synthetic */ class jk8 implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ lk8 b;

    public /* synthetic */ jk8(lk8 lk8Var, int i) {
        this.a = i;
        this.b = lk8Var;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        tlb tlbVar = (tlb) obj;
        switch (this.a) {
            case 0:
                tlbVar.c.accept(tlbVar.b);
                vqc vqcVar = this.b.f;
                Instant.now();
                vqcVar.getClass();
                break;
            case 1:
                this.b.g.remove(tlbVar.b.m());
                break;
            default:
                this.b.g.remove(tlbVar.b.m());
                break;
        }
    }
}
