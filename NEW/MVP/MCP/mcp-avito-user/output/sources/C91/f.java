package C91;

import Y41.p;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.mts.biometry.api.entity.state.ApiIdentificationState;

/* loaded from: classes9.dex */
public final class f extends SuspendLambda implements p {

    /* renamed from: q, reason: collision with root package name */
    public ru.mts.biometry.sdk.domain.entity.polling.status.b f2030q;

    /* renamed from: r, reason: collision with root package name */
    public ru.mts.biometry.sdk.domain.entity.polling.status.a f2031r;

    /* renamed from: s, reason: collision with root package name */
    public int f2032s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f2033t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ h f2034u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, Continuation continuation) {
        super(2, continuation);
        this.f2034u = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        f fVar = new f(this.f2034u, continuation);
        fVar.f2033t = obj;
        return fVar;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((ApiIdentificationState) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:112:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0251 A[RETURN] */
    /* JADX WARN: Type inference failed for: r9v8, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C91.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
