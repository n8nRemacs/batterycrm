package defpackage;

import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingDeque;

/* loaded from: classes2.dex */
public final /* synthetic */ class zjb implements tm6, gu3, w2f {
    public final /* synthetic */ dkb a;
    public final /* synthetic */ long b;

    public /* synthetic */ zjb(dkb dkbVar, long j) {
        this.a = dkbVar;
        this.b = j;
    }

    @Override // defpackage.gu3
    public void accept(Object obj) {
        wqi.e("dkb", "handleMediaTypingError", (Throwable) obj);
        long j = this.b;
        LinkedBlockingDeque linkedBlockingDeque = dkb.c(j).a;
        if (!linkedBlockingDeque.isEmpty()) {
            try {
                linkedBlockingDeque.pop();
            } catch (NoSuchElementException unused) {
            }
        }
        if (linkedBlockingDeque.isEmpty()) {
            return;
        }
        this.a.e(j);
    }

    @Override // defpackage.tm6
    public Object apply(Object obj) {
        wk3 wk3Var;
        long j = this.b;
        if (j == 0) {
            wk3Var = e2f.g(0L);
        } else {
            wqi.c("dkb", "sendMediaTyping %d", Long.valueOf(j));
            wk3Var = new wk3(2, new zjb(this.a, j));
        }
        return wk3Var.n();
    }

    @Override // defpackage.w2f
    public void i(i2f i2fVar) {
        akb akbVar;
        ConcurrentHashMap concurrentHashMap = dkb.b;
        long j = this.b;
        bkb bkbVar = (bkb) concurrentHashMap.get(Long.valueOf(j));
        if (bkbVar == null || (akbVar = (akb) bkbVar.a.peek()) == null) {
            i2fVar.onError(new Throwable("No media typing to send"));
        } else {
            this.a.d(j, akbVar.a);
            i2fVar.a(Long.valueOf(akbVar.b));
        }
    }
}
