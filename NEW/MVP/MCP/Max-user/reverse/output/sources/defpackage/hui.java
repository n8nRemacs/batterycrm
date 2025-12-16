package defpackage;

import java.util.Collection;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public abstract class hui {
    public static final int a(int i, int i2, int i3) {
        int i4 = i - (i % 16);
        int i5 = i4 / i2;
        if (i5 == 9) {
            return i4;
        }
        int i6 = i2 * 9;
        int i7 = i6 % 16;
        if (i7 == 0) {
            return i6;
        }
        int i8 = i6 - i7;
        int i9 = 9 - i5;
        int i10 = i3 - i8;
        return (i9 <= 0 || i10 <= 0) ? i8 : (Math.min(i9, i10 / 16) * 16) + i8;
    }

    public static final Object b(Collection collection, Continuation continuation) {
        return collection.isEmpty() ? hd5.a : new ne0((bs4[]) collection.toArray(new bs4[0])).a(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(java.util.ArrayList r4, defpackage.q44 r5) {
        /*
            boolean r0 = r5 instanceof defpackage.pe0
            if (r0 == 0) goto L13
            r0 = r5
            pe0 r0 = (defpackage.pe0) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L18
        L13:
            pe0 r0 = new pe0
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.o
            int r1 = r0.X
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            java.util.Iterator r4 = r0.d
            defpackage.g8j.b(r5)
            goto L36
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.g8j.b(r5)
            java.util.Iterator r4 = r4.iterator()
        L36:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L4f
            java.lang.Object r5 = r4.next()
            qt7 r5 = (defpackage.qt7) r5
            r0.d = r4
            r0.X = r2
            java.lang.Object r5 = r5.join(r0)
            g84 r1 = defpackage.g84.a
            if (r5 != r1) goto L36
            return r1
        L4f:
            qqg r4 = defpackage.qqg.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hui.c(java.util.ArrayList, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0050 -> B:19:0x0053). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(defpackage.qt7[] r6, defpackage.q44 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.oe0
            if (r0 == 0) goto L13
            r0 = r7
            oe0 r0 = (defpackage.oe0) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            oe0 r0 = new oe0
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.Y
            int r1 = r0.Z
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            int r6 = r0.X
            int r1 = r0.o
            java.lang.Object[] r3 = r0.d
            qt7[] r3 = (defpackage.qt7[]) r3
            defpackage.g8j.b(r7)
            r7 = r3
            goto L53
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            defpackage.g8j.b(r7)
            int r7 = r6.length
            r1 = 0
            r5 = r7
            r7 = r6
            r6 = r5
        L3e:
            if (r1 >= r6) goto L55
            r3 = r7[r1]
            r0.d = r7
            r0.o = r1
            r0.X = r6
            r0.Z = r2
            java.lang.Object r3 = r3.join(r0)
            g84 r4 = defpackage.g84.a
            if (r3 != r4) goto L53
            return r4
        L53:
            int r1 = r1 + r2
            goto L3e
        L55:
            qqg r6 = defpackage.qqg.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hui.d(qt7[], q44):java.lang.Object");
    }

    public static final void e(esg esgVar) {
        esgVar.d(50, new yv6(8));
        esgVar.d(51, new yv6(9));
        esgVar.d(52, new yv6(10));
        esgVar.d(53, new yv6(11));
        esgVar.d(54, new bf8(5));
        esgVar.d(55, new bf8(6));
    }
}
