package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class eta extends AtomicReference implements bta {
    public ata a;
    public int b;
    public final int c;

    public eta() {
        ata ataVar = new ata(null);
        this.a = ataVar;
        set(ataVar);
        this.c = 1;
    }

    @Override // defpackage.bta
    public final void a() {
        ata ataVar = new ata(tma.a);
        this.a.set(ataVar);
        this.a = ataVar;
        this.b++;
        ata ataVar2 = (ata) get();
        if (ataVar2.a != null) {
            ata ataVar3 = new ata(null);
            ataVar3.lazySet(ataVar2.get());
            set(ataVar3);
        }
    }

    @Override // defpackage.bta
    public final void b(Object obj) {
        ata ataVar = new ata(obj);
        this.a.set(ataVar);
        this.a = ataVar;
        int i = this.b + 1;
        this.b = i;
        if (i > this.c) {
            this.b--;
            set((ata) ((ata) get()).get());
        }
    }

    @Override // defpackage.bta
    public final void c(zsa zsaVar) {
        if (zsaVar.getAndIncrement() != 0) {
            return;
        }
        int iAddAndGet = 1;
        do {
            ata ataVar = (ata) zsaVar.c;
            if (ataVar == null) {
                ataVar = (ata) get();
                zsaVar.c = ataVar;
            }
            while (!zsaVar.d) {
                ata ataVar2 = (ata) ataVar.get();
                if (ataVar2 != null) {
                    if (tma.a(zsaVar.b, ataVar2.a)) {
                        zsaVar.c = null;
                        return;
                    }
                    ataVar = ataVar2;
                } else {
                    zsaVar.c = ataVar;
                    iAddAndGet = zsaVar.addAndGet(-iAddAndGet);
                }
            }
            zsaVar.c = null;
            return;
        } while (iAddAndGet != 0);
    }

    @Override // defpackage.bta
    public final void d(Throwable th) {
        ata ataVar = new ata(new rma(th));
        this.a.set(ataVar);
        this.a = ataVar;
        this.b++;
        ata ataVar2 = (ata) get();
        if (ataVar2.a != null) {
            ata ataVar3 = new ata(null);
            ataVar3.lazySet(ataVar2.get());
            set(ataVar3);
        }
    }
}
