package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.v2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39184v2<T> extends G0<T> {
    public AbstractC39184v2(long j12, long j13) {
        super(j12, j13);
    }

    @Override // com.yandex.metrica.impl.ob.G0
    @j.P
    public synchronized T a() {
        return (T) super.a();
    }

    @Override // com.yandex.metrica.impl.ob.G0
    public synchronized void b(@j.N T t12) {
        super.b((AbstractC39184v2<T>) t12);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0016  */
    @Override // com.yandex.metrica.impl.ob.G0
    @j.InterfaceC42148d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean b() {
        /*
            r1 = this;
            monitor-enter(r1)
            com.yandex.metrica.impl.ob.G<T> r0 = r1.f378159a     // Catch: java.lang.Throwable -> L14
            boolean r0 = r0.b()     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto L16
            com.yandex.metrica.impl.ob.G<T> r0 = r1.f378159a     // Catch: java.lang.Throwable -> L14
            boolean r0 = r0.d()     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L12
            goto L16
        L12:
            r0 = 0
            goto L17
        L14:
            r0 = move-exception
            goto L19
        L16:
            r0 = 1
        L17:
            monitor-exit(r1)
            return r0
        L19:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L14
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.AbstractC39184v2.b():boolean");
    }
}
