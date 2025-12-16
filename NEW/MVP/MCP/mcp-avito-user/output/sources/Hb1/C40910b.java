package hb1;

import T11.f;
import Y61.k;
import jb1.C42350a;
import jb1.c;

/* renamed from: hb1.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C40910b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C42350a f397281a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final c f397282b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final f f397283c;

    public C40910b(@k C42350a c42350a, @k c cVar, @k f fVar) {
        this.f397281a = c42350a;
        this.f397282b = cVar;
        this.f397283c = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof hb1.C40909a
            if (r0 == 0) goto L13
            r0 = r6
            hb1.a r0 = (hb1.C40909a) r0
            int r1 = r0.f397280t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f397280t = r1
            goto L18
        L13:
            hb1.a r0 = new hb1.a
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f397278r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f397280t
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L3a
            if (r2 == r3) goto L34
            if (r2 != r4) goto L2c
            kotlin.C42729a0.b(r6)
            goto L6d
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            hb1.b r2 = r0.f397277q
            kotlin.C42729a0.b(r6)
            goto L4f
        L3a:
            kotlin.C42729a0.b(r6)
            r0.f397277q = r5
            r0.f397280t = r3
            jb1.a r6 = r5.f397281a
            ab1.i r6 = r6.f405671a
            bb1.n r6 = r6.f21042a
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r2 = r5
        L4f:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L70
            T11.f r6 = r2.f397283c
            java.lang.String r3 = "client sdk mode changed"
            r6.info(r3)
            r6 = 0
            r0.f397277q = r6
            r0.f397280t = r4
            jb1.c r6 = r2.f397282b
            r2 = 0
            java.lang.Object r6 = r6.a(r2, r0)
            if (r6 != r1) goto L6d
            return r1
        L6d:
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        L70:
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: hb1.C40910b.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
