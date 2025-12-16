package ca1;

import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* renamed from: ca1.p, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C27150p extends SuspendLambda implements Y41.p {

    /* renamed from: q, reason: collision with root package name */
    public int f57953q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f57954r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C27154t f57955s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f57956t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27150p(C27154t c27154t, String str, Continuation continuation) {
        super(2, continuation);
        this.f57955s = c27154t;
        this.f57956t = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C27150p c27150p = new C27150p(this.f57955s, this.f57956t, continuation);
        c27150p.f57954r = obj;
        return c27150p;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C27150p) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.f57953q
            ca1.t r2 = r5.f57955s
            r3 = 1
            kotlinx.coroutines.flow.Z1 r4 = r2.f57967K
            if (r1 == 0) goto L1d
            if (r1 != r3) goto L15
            kotlin.C42729a0.b(r6)     // Catch: java.lang.Throwable -> L13
            goto L38
        L13:
            r6 = move-exception
            goto L3d
        L15:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1d:
            kotlin.C42729a0.b(r6)
            java.lang.Object r6 = r5.f57954r
            kotlinx.coroutines.T r6 = (kotlinx.coroutines.T) r6
            ca1.n r6 = ca1.C27148n.f57952a
            r4.setValue(r6)
            java.lang.String r6 = r5.f57956t
            int r1 = kotlin.Z.f406624c     // Catch: java.lang.Throwable -> L13
            I91.b r1 = r2.f57965E     // Catch: java.lang.Throwable -> L13
            r5.f57953q = r3     // Catch: java.lang.Throwable -> L13
            java.lang.Object r6 = r1.a(r6, r5)     // Catch: java.lang.Throwable -> L13
            if (r6 != r0) goto L38
            return r0
        L38:
            java.util.List r6 = (java.util.List) r6     // Catch: java.lang.Throwable -> L13
            int r0 = kotlin.Z.f406624c     // Catch: java.lang.Throwable -> L13
            goto L45
        L3d:
            int r0 = kotlin.Z.f406624c
            kotlin.Z$b r0 = new kotlin.Z$b
            r0.<init>(r6)
            r6 = r0
        L45:
            java.lang.Throwable r0 = kotlin.Z.b(r6)
            if (r0 != 0) goto L5d
            java.util.List r6 = (java.util.List) r6
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L54
            goto L5d
        L54:
            ca1.k r0 = new ca1.k
            r0.<init>(r6)
            r4.setValue(r0)
            goto L62
        L5d:
            ca1.l r6 = ca1.C27146l.f57950a
            r4.setValue(r6)
        L62:
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ca1.C27150p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
