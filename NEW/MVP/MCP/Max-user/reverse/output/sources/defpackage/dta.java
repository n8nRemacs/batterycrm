package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class dta implements lta {
    public final AtomicReference a;
    public final ysa b;

    public dta(AtomicReference atomicReference, ysa ysaVar) {
        this.a = atomicReference;
        this.b = ysaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lta
    public final void a(vta vtaVar) {
        cta ctaVar;
        loop0: while (true) {
            ctaVar = (cta) this.a.get();
            if (ctaVar != null) {
                break;
            }
            cta ctaVar2 = new cta(this.b.call(), this.a);
            AtomicReference atomicReference = this.a;
            while (!atomicReference.compareAndSet(null, ctaVar2)) {
                if (atomicReference.get() != null) {
                    break;
                }
            }
            ctaVar = ctaVar2;
            break loop0;
        }
        zsa zsaVar = new zsa(ctaVar, vtaVar);
        vtaVar.c(zsaVar);
        AtomicReference atomicReference2 = ctaVar.c;
        loop2: while (true) {
            zsa[] zsaVarArr = (zsa[]) atomicReference2.get();
            if (zsaVarArr != cta.Y) {
                int length = zsaVarArr.length;
                zsa[] zsaVarArr2 = new zsa[length + 1];
                System.arraycopy(zsaVarArr, 0, zsaVarArr2, 0, length);
                zsaVarArr2[length] = zsaVar;
                while (!atomicReference2.compareAndSet(zsaVarArr, zsaVarArr2)) {
                    if (atomicReference2.get() != zsaVarArr) {
                        break;
                    }
                }
                break loop2;
            }
            break;
        }
        if (zsaVar.d) {
            ctaVar.a(zsaVar);
        } else {
            ctaVar.a.c(zsaVar);
        }
    }
}
