package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes2.dex */
public final class hia implements ui8 {
    public final bwf a;
    public final bwf b;
    public final gia c;

    public hia(k18 k18Var, k18 k18Var2, k18 k18Var3) {
        this.a = new bwf(new rv1(k18Var2, k18Var3, 1));
        bwf bwfVar = new bwf(new es9(this, 2, k18Var));
        this.b = bwfVar;
        this.c = (gia) bwfVar.getValue();
    }

    public final void a(long j) {
        eia eiaVar = (eia) ((gia) this.b.getValue());
        if (eiaVar.e()) {
            ReentrantLock reentrantLock = eiaVar.f;
            reentrantLock.lock();
            try {
                eiaVar.e.a(j);
                reentrantLock.unlock();
                eiaVar.d();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.n8a r18) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            bwf r2 = r1.b
            java.lang.Object r2 = r2.getValue()
            gia r2 = (defpackage.gia) r2
            eia r2 = (defpackage.eia) r2
            r2.getClass()
            boolean r3 = r0.i()
            if (r3 != 0) goto L76
            boolean r3 = r2.e()
            if (r3 != 0) goto L1e
            goto L76
        L1e:
            java.util.concurrent.locks.ReentrantLock r3 = r2.f
            r3.lock()
            long[] r4 = r0.b     // Catch: java.lang.Throwable -> L5e
            long[] r0 = r0.a     // Catch: java.lang.Throwable -> L5e
            int r5 = r0.length     // Catch: java.lang.Throwable -> L5e
            int r5 = r5 + (-2)
            if (r5 < 0) goto L6b
            r6 = 0
            r7 = r6
        L2e:
            r8 = r0[r7]     // Catch: java.lang.Throwable -> L5e
            long r10 = ~r8     // Catch: java.lang.Throwable -> L5e
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L66
            int r10 = r7 - r5
            int r10 = ~r10     // Catch: java.lang.Throwable -> L5e
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L48:
            if (r12 >= r10) goto L64
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L60
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r4[r13]     // Catch: java.lang.Throwable -> L5e
            n8a r15 = r2.e     // Catch: java.lang.Throwable -> L5e
            r15.a(r13)     // Catch: java.lang.Throwable -> L5e
            goto L60
        L5e:
            r0 = move-exception
            goto L72
        L60:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L48
        L64:
            if (r10 != r11) goto L6b
        L66:
            if (r7 == r5) goto L6b
            int r7 = r7 + 1
            goto L2e
        L6b:
            r3.unlock()
            r2.d()
            return
        L72:
            r3.unlock()
            throw r0
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hia.b(n8a):void");
    }

    @Override // defpackage.ui8
    public final void c() {
        ((gia) this.b.getValue()).a();
    }

    public final void d(Collection collection) {
        eia eiaVar = (eia) ((gia) this.b.getValue());
        eiaVar.getClass();
        if (collection.isEmpty() || !eiaVar.e()) {
            return;
        }
        ReentrantLock reentrantLock = eiaVar.f;
        reentrantLock.lock();
        try {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                eiaVar.e.a(((Number) it.next()).longValue());
            }
            reentrantLock.unlock();
            eiaVar.d();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
