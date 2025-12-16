package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class fta extends ArrayList implements bta {
    public volatile int a;

    @Override // defpackage.bta
    public final void a() {
        add(tma.a);
        this.a++;
    }

    @Override // defpackage.bta
    public final void b(Object obj) {
        add(obj);
        this.a++;
    }

    @Override // defpackage.bta
    public final void c(zsa zsaVar) {
        if (zsaVar.getAndIncrement() != 0) {
            return;
        }
        vta vtaVar = zsaVar.b;
        int iAddAndGet = 1;
        while (!zsaVar.d) {
            int i = this.a;
            Integer num = (Integer) zsaVar.c;
            int iIntValue = num != null ? num.intValue() : 0;
            while (iIntValue < i) {
                if (tma.a(vtaVar, get(iIntValue)) || zsaVar.d) {
                    return;
                } else {
                    iIntValue++;
                }
            }
            zsaVar.c = Integer.valueOf(iIntValue);
            iAddAndGet = zsaVar.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
    }

    @Override // defpackage.bta
    public final void d(Throwable th) {
        add(new rma(th));
        this.a++;
    }
}
