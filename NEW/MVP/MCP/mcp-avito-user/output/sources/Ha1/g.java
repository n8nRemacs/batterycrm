package ha1;

import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* loaded from: classes9.dex */
public final class g extends SuspendLambda implements Y41.p {

    /* renamed from: q, reason: collision with root package name */
    public int f397235q;

    /* renamed from: r, reason: collision with root package name */
    public int f397236r;

    /* renamed from: s, reason: collision with root package name */
    public ru.mts.biometry.sdk.feature.recognition.ui.camera.i f397237s;

    /* renamed from: t, reason: collision with root package name */
    public int f397238t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.recognition.ui.camera.i f397239u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ru.mts.biometry.sdk.feature.recognition.ui.camera.i iVar, Continuation continuation) {
        super(2, continuation);
        this.f397239u = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new g(this.f397239u, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:10|(1:12)|13|30|14|(1:16)(1:17)|18|(1:20)|21|24|(1:26)|27|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
    
        r10 = kotlin.Z.f406624c;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x006e -> B:27:0x0071). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.f397238t
            r2 = 1
            if (r1 == 0) goto L1d
            if (r1 != r2) goto L15
            int r1 = r9.f397236r
            int r3 = r9.f397235q
            ru.mts.biometry.sdk.feature.recognition.ui.camera.i r4 = r9.f397237s
            kotlin.C42729a0.b(r10)
            goto L71
        L15:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1d:
            kotlin.C42729a0.b(r10)
            ru.mts.biometry.sdk.feature.recognition.ui.camera.i r10 = r9.f397239u
            ha1.w r1 = r10.i5()
            ha1.p r1 = r1.f397271L
            int r1 = r1.f397251a
            r3 = 0
            r4 = r10
            r8 = r3
            r3 = r1
            r1 = r8
        L2f:
            if (r1 >= r3) goto L73
            Ba1.f r10 = r4.f436496j0
            if (r10 != 0) goto L36
            r10 = 0
        L36:
            r10.getClass()
            int r5 = kotlin.Z.f406624c     // Catch: java.lang.Throwable -> L57
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L57
            r6 = 29
            if (r5 < r6) goto L46
            android.os.VibrationEffect r5 = Ba1.C13127e.m()     // Catch: java.lang.Throwable -> L57
            goto L4d
        L46:
            r5 = 50
            r7 = -1
            android.os.VibrationEffect r5 = android.os.VibrationEffect.createOneShot(r5, r7)     // Catch: java.lang.Throwable -> L57
        L4d:
            android.os.Vibrator r10 = r10.f1499a     // Catch: java.lang.Throwable -> L57
            if (r10 == 0) goto L54
            r10.vibrate(r5)     // Catch: java.lang.Throwable -> L57
        L54:
            kotlin.G0 r10 = kotlin.G0.f406611a     // Catch: java.lang.Throwable -> L57
            goto L59
        L57:
            int r10 = kotlin.Z.f406624c
        L59:
            Ba1.o r10 = r4.e5()
            r10.a()
            r9.f397237s = r4
            r9.f397235q = r3
            r9.f397236r = r1
            r9.f397238t = r2
            r5 = 300(0x12c, double:1.48E-321)
            java.lang.Object r10 = kotlinx.coroutines.C43131e0.b(r5, r9)
            if (r10 != r0) goto L71
            return r0
        L71:
            int r1 = r1 + r2
            goto L2f
        L73:
            kotlin.G0 r10 = kotlin.G0.f406611a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ha1.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
