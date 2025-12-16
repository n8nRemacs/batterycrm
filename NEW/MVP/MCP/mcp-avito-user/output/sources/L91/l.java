package L91;

import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* loaded from: classes9.dex */
public final class l extends SuspendLambda implements Y41.p {

    /* renamed from: q, reason: collision with root package name */
    public int f9831q;

    /* renamed from: r, reason: collision with root package name */
    public int f9832r;

    /* renamed from: s, reason: collision with root package name */
    public ru.mts.biometry.sdk.feature.document.camera.ui.n f9833s;

    /* renamed from: t, reason: collision with root package name */
    public int f9834t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.document.camera.ui.n f9835u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ru.mts.biometry.sdk.feature.document.camera.ui.n nVar, Continuation continuation) {
        super(2, continuation);
        this.f9835u = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new l(this.f9835u, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0057 -> B:18:0x005a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.f9834t
            ru.mts.biometry.sdk.feature.document.camera.ui.n r2 = r9.f9835u
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L26
            if (r1 == r4) goto L22
            if (r1 != r3) goto L1a
            int r1 = r9.f9832r
            int r5 = r9.f9831q
            ru.mts.biometry.sdk.feature.document.camera.ui.n r6 = r9.f9833s
            kotlin.C42729a0.b(r10)
            goto L5a
        L1a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L22:
            kotlin.C42729a0.b(r10)
            goto L34
        L26:
            kotlin.C42729a0.b(r10)
            r9.f9834t = r4
            r5 = 1500(0x5dc, double:7.41E-321)
            java.lang.Object r10 = kotlinx.coroutines.C43131e0.b(r5, r9)
            if (r10 != r0) goto L34
            return r0
        L34:
            kotlin.reflect.n[] r10 = ru.mts.biometry.sdk.feature.document.camera.ui.n.f436424m0
            R91.j r10 = r2.e5()
            r1 = 0
            r10.f14152k = r1
            L91.z r10 = r2.f5()
            L91.r r10 = r10.f9862L
            int r10 = r10.f9845a
            r5 = r10
            r6 = r2
        L47:
            if (r1 >= r5) goto L69
            r9.f9833s = r6
            r9.f9831q = r5
            r9.f9832r = r1
            r9.f9834t = r3
            r7 = 300(0x12c, double:1.48E-321)
            java.lang.Object r10 = kotlinx.coroutines.C43131e0.b(r7, r9)
            if (r10 != r0) goto L5a
            return r0
        L5a:
            kotlin.reflect.n[] r10 = ru.mts.biometry.sdk.feature.document.camera.ui.n.f436424m0
            kotlin.C r10 = r6.f436427j0
            java.lang.Object r10 = r10.getValue()
            Ba1.o r10 = (Ba1.o) r10
            r10.a()
            int r1 = r1 + r4
            goto L47
        L69:
            r10 = 0
            r2.f436428k0 = r10
            kotlin.G0 r10 = kotlin.G0.f406611a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: L91.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
