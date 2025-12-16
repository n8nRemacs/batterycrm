package da1;

import Y41.p;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* loaded from: classes9.dex */
public final class j extends SuspendLambda implements p {

    /* renamed from: q, reason: collision with root package name */
    public int f393925q;

    /* renamed from: r, reason: collision with root package name */
    public int f393926r;

    /* renamed from: s, reason: collision with root package name */
    public ru.mts.biometry.sdk.feature.passport.ui.camera.m f393927s;

    /* renamed from: t, reason: collision with root package name */
    public int f393928t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.passport.ui.camera.m f393929u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ru.mts.biometry.sdk.feature.passport.ui.camera.m mVar, Continuation continuation) {
        super(2, continuation);
        this.f393929u = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new j(this.f393929u, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0052 -> B:13:0x0055). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.f393928t
            r2 = 1
            if (r1 == 0) goto L1d
            if (r1 != r2) goto L15
            int r1 = r8.f393926r
            int r3 = r8.f393925q
            ru.mts.biometry.sdk.feature.passport.ui.camera.m r4 = r8.f393927s
            kotlin.C42729a0.b(r9)
            goto L55
        L15:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1d:
            kotlin.C42729a0.b(r9)
            ru.mts.biometry.sdk.feature.passport.ui.camera.m r9 = r8.f393929u
            kotlin.reflect.n[] r1 = ru.mts.biometry.sdk.feature.passport.ui.camera.m.f436487n0
            r3 = 0
            r1 = r1[r3]
            Ba1.k r1 = r9.f436488h0
            androidx.lifecycle.M0 r1 = r1.a(r9)
            L91.z r1 = (L91.z) r1
            L91.r r1 = r1.f9862L
            int r1 = r1.f9845a
            r4 = r9
            r7 = r3
            r3 = r1
            r1 = r7
        L37:
            if (r1 >= r3) goto L57
            da1.a r9 = ru.mts.biometry.sdk.feature.passport.ui.camera.m.f436486m0
            aa1.e r9 = r4.g5()
            Ba1.o r9 = r9.f20928b
            r9.a()
            r8.f393927s = r4
            r8.f393925q = r3
            r8.f393926r = r1
            r8.f393928t = r2
            r5 = 300(0x12c, double:1.48E-321)
            java.lang.Object r9 = kotlinx.coroutines.C43131e0.b(r5, r8)
            if (r9 != r0) goto L55
            return r0
        L55:
            int r1 = r1 + r2
            goto L37
        L57:
            kotlin.G0 r9 = kotlin.G0.f406611a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: da1.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
