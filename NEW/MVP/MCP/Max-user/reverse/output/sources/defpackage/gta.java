package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class gta extends vqa {
    public final vqa a;
    public final AtomicReference b;
    public final ysa c;
    public final dta d;

    public gta(dta dtaVar, vqa vqaVar, AtomicReference atomicReference, ysa ysaVar) {
        this.d = dtaVar;
        this.a = vqaVar;
        this.b = atomicReference;
        this.c = ysaVar;
    }

    @Override // defpackage.vqa
    public final void o(vta vtaVar) {
        this.d.a(vtaVar);
    }

    public final void t() {
        AtomicReference atomicReference = this.b;
        cta ctaVar = (cta) atomicReference.get();
        if (ctaVar == null || !ctaVar.e()) {
            return;
        }
        while (!atomicReference.compareAndSet(ctaVar, null) && atomicReference.get() == ctaVar) {
        }
    }
}
