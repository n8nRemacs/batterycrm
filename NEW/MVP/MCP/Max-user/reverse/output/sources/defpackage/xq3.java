package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class xq3 extends pv0 {
    public final int u0;

    public xq3(int i, int i2) {
        super(i);
        this.u0 = i2;
        if (i2 != 1) {
            if (i < 1) {
                throw new IllegalArgumentException(wy1.e(i, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + vid.a(pv0.class).b() + " instead").toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b5, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J(java.lang.Object r17, boolean r18) {
        /*
            r16 = this;
            r0 = r16
            qqg r8 = defpackage.qqg.a
            int r1 = r0.u0
            r9 = 3
            if (r1 != r9) goto L18
            java.lang.Object r1 = super.g(r17)
            boolean r2 = r1 instanceof defpackage.ma2
            if (r2 == 0) goto L17
            boolean r2 = r1 instanceof defpackage.la2
            if (r2 == 0) goto L16
            goto L17
        L16:
            return r8
        L17:
            return r1
        L18:
            kotlinx.coroutines.internal.Symbol r6 = defpackage.rv0.d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = defpackage.pv0.X
            java.lang.Object r1 = r1.get(r0)
            oa2 r1 = (defpackage.oa2) r1
        L22:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = defpackage.pv0.b
            long r2 = r2.getAndIncrement(r0)
            r4 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r4 = r4 & r2
            r7 = 0
            boolean r7 = r0.u(r2, r7)
            int r10 = defpackage.rv0.b
            long r11 = (long) r10
            long r2 = r4 / r11
            long r13 = r4 % r11
            int r13 = (int) r13
            long r14 = r1.id
            int r14 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r14 == 0) goto L54
            oa2 r2 = defpackage.pv0.c(r0, r2, r1)
            if (r2 != 0) goto L53
            if (r7 == 0) goto L22
            java.lang.Throwable r1 = r0.r()
            la2 r2 = new la2
            r2.<init>(r1)
            return r2
        L53:
            r1 = r2
        L54:
            r3 = r17
            r2 = r13
            int r13 = defpackage.pv0.e(r0, r1, r2, r3, r4, r6, r7)
            if (r13 == 0) goto Lb6
            r3 = 1
            if (r13 == r3) goto Lb5
            r3 = 2
            if (r13 == r3) goto L8f
            if (r13 == r9) goto L87
            r2 = 4
            if (r13 == r2) goto L70
            r2 = 5
            if (r13 == r2) goto L6c
            goto L22
        L6c:
            r1.cleanPrev()
            goto L22
        L70:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = defpackage.pv0.c
            long r2 = r2.get(r0)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L7d
            r1.cleanPrev()
        L7d:
            java.lang.Throwable r1 = r0.r()
            la2 r2 = new la2
            r2.<init>(r1)
            return r2
        L87:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "unexpected"
            r1.<init>(r2)
            throw r1
        L8f:
            if (r7 == 0) goto L9e
            r1.onSlotCleaned()
            java.lang.Throwable r1 = r0.r()
            la2 r2 = new la2
            r2.<init>(r1)
            return r2
        L9e:
            boolean r3 = r6 instanceof defpackage.ojh
            if (r3 == 0) goto La5
            ojh r6 = (defpackage.ojh) r6
            goto La6
        La5:
            r6 = 0
        La6:
            if (r6 == 0) goto Lad
            int r13 = r2 + r10
            r6.a(r1, r13)
        Lad:
            long r3 = r1.id
            long r3 = r3 * r11
            long r1 = (long) r2
            long r3 = r3 + r1
            r0.m(r3)
        Lb5:
            return r8
        Lb6:
            r1.cleanPrev()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xq3.J(java.lang.Object, boolean):java.lang.Object");
    }

    @Override // defpackage.pv0, defpackage.cde
    public final Object g(Object obj) {
        return J(obj, false);
    }

    @Override // defpackage.pv0, defpackage.cde
    public final Object h(Object obj, Continuation continuation) throws Throwable {
        if (J(obj, true) instanceof la2) {
            throw r();
        }
        return qqg.a;
    }

    @Override // defpackage.pv0
    public final boolean x() {
        return this.u0 == 2;
    }
}
