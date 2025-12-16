package L91;

import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes9.dex */
public final class x extends SuspendLambda implements Y41.p {

    /* renamed from: q, reason: collision with root package name */
    public int f9851q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f9852r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ z f9853s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(z zVar, Continuation continuation) {
        super(2, continuation);
        this.f9853s = zVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        x xVar = new x(this.f9853s, continuation);
        xVar.f9852r = obj;
        return xVar;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((x) create((ru.mts.biometry.sdk.domain.entity.polling.status.d) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0068 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.f9851q
            r2 = 2
            r3 = 1
            L91.z r4 = r5.f9853s
            if (r1 == 0) goto L20
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            kotlin.C42729a0.b(r6)
            goto L69
        L14:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1c:
            kotlin.C42729a0.b(r6)
            goto L57
        L20:
            kotlin.C42729a0.b(r6)
            java.lang.Object r6 = r5.f9852r
            ru.mts.biometry.sdk.domain.entity.polling.status.d r6 = (ru.mts.biometry.sdk.domain.entity.polling.status.d) r6
            ru.mts.biometry.sdk.domain.entity.polling.status.d r1 = ru.mts.biometry.sdk.domain.entity.polling.status.d.f436401e
            if (r6 != r1) goto L2e
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        L2e:
            ru.mts.biometry.sdk.domain.entity.polling.status.d r1 = ru.mts.biometry.sdk.domain.entity.polling.status.d.f436402f
            if (r6 == r1) goto L69
            boolean r6 = r4.f9864N
            if (r6 == 0) goto L57
            z91.s r6 = z91.e.f443908b
            if (r6 == 0) goto L4f
            kotlin.C r6 = r6.f443927g
            java.lang.Object r6 = r6.getValue()
            Z91.b r6 = (Z91.b) r6
            E91.b r1 = C91.a.f2018e
            E91.d r1 = r1.f3819e
            r5.f9851q = r3
            java.lang.Object r6 = r6.a(r1, r5)
            if (r6 != r0) goto L57
            return r0
        L4f:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "DI delegate is null"
            r6.<init>(r0)
            throw r6
        L57:
            kotlinx.coroutines.flow.Z1 r6 = r4.f9865O
            L91.u r1 = L91.u.f9849a
            r6.setValue(r1)
            r5.f9851q = r2
            r1 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r6 = kotlinx.coroutines.C43131e0.b(r1, r5)
            if (r6 != r0) goto L69
            return r0
        L69:
            W91.h r6 = r4.f9860J
            r0 = 0
            r6.f17823e = r0
            C91.h r6 = r4.f9861K
            r0 = 0
            r6.f2041e = r0
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: L91.x.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
