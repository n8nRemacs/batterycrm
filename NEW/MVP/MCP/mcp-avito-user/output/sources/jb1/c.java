package jb1;

import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.jvm.internal.N;
import mb1.InterfaceC44046a;

/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC44046a f405677a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final qb1.g f405678b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f405679c;

    public static final class a extends N implements Y41.a<T11.f> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ T11.f f405680l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ c f405681m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(T11.f fVar, c cVar) {
            super(0);
            this.f405680l = fVar;
            this.f405681m = cVar;
        }

        @Override // Y41.a
        public final T11.f invoke() {
            return this.f405680l.c(this.f405681m);
        }
    }

    public c(@Y61.k InterfaceC44046a interfaceC44046a, @Y61.k qb1.g gVar, @Y61.k T11.f fVar) {
        this.f405677a = interfaceC44046a;
        this.f405678b = gVar;
        this.f405679c = C42727D.c(new a(fVar, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(boolean r7, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof jb1.C42351b
            if (r0 == 0) goto L13
            r0 = r8
            jb1.b r0 = (jb1.C42351b) r0
            int r1 = r0.f405676u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f405676u = r1
            goto L18
        L13:
            jb1.b r0 = new jb1.b
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f405674s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f405676u
            r3 = 3
            r4 = 1
            r5 = 2
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L42
            if (r2 == r5) goto L37
            if (r2 != r3) goto L2f
            kotlin.C42729a0.b(r8)
            goto L99
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            jb1.c r7 = r0.f405672q
            kotlin.C42729a0.b(r8)
            kotlin.Z r8 = (kotlin.Z) r8
            r8.getClass()
            goto L8b
        L42:
            boolean r7 = r0.f405673r
            jb1.c r2 = r0.f405672q
            kotlin.C42729a0.b(r8)
            goto L5d
        L4a:
            kotlin.C42729a0.b(r8)
            r0.f405672q = r6
            r0.f405673r = r7
            r0.f405676u = r4
            qb1.g r8 = r6.f405678b
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r1) goto L5c
            return r1
        L5c:
            r2 = r6
        L5d:
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L7d
            if (r7 == 0) goto L7d
            kotlin.C r7 = r2.f405679c
            java.lang.Object r7 = r7.getValue()
            T11.f r7 = (T11.f) r7
            java.lang.String r4 = "Push token exists, need to remote delete token"
            r7.info(r4)
            r0.f405672q = r2
            r0.f405676u = r5
            mb1.a r7 = r2.f405677a
            java.lang.Object r7 = r7.c(r8, r0)
            if (r7 != r1) goto L8a
            return r1
        L7d:
            kotlin.C r7 = r2.f405679c
            java.lang.Object r7 = r7.getValue()
            T11.f r7 = (T11.f) r7
            java.lang.String r8 = "Push token is null, no need to remote delete token"
            r7.info(r8)
        L8a:
            r7 = r2
        L8b:
            qb1.g r7 = r7.f405678b
            r8 = 0
            r0.f405672q = r8
            r0.f405676u = r3
            java.lang.Object r7 = r7.e(r0)
            if (r7 != r1) goto L99
            return r1
        L99:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: jb1.c.a(boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
