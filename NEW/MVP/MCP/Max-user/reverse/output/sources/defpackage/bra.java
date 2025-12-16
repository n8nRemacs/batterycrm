package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class bra extends k3 {
    public final /* synthetic */ int b;
    public final Object c;
    public final Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bra(vqa vqaVar, Object obj, Object obj2, int i) {
        super(vqaVar);
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // defpackage.vqa
    public final void o(vta vtaVar) {
        switch (this.b) {
            case 0:
                try {
                    Object obj = ((kn6) this.c).a;
                    Objects.requireNonNull(obj, "The initialSupplier returned a null value");
                    this.a.a(new ara(vtaVar, obj, (ycd) this.d, 0));
                    break;
                } catch (Throwable th) {
                    raj.c(th);
                    cd5.c(th, vtaVar);
                    return;
                }
            default:
                this.a.a(new uy4(vtaVar, (gu3) this.c, (p6) this.d));
                break;
        }
    }
}
