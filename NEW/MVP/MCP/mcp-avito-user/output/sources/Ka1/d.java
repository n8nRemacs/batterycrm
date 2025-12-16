package ka1;

import B91.I;
import Ba1.k;
import Y41.p;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.reflect.n;
import kotlinx.coroutines.T;

/* loaded from: classes9.dex */
public final class d extends SuspendLambda implements p {

    /* renamed from: q, reason: collision with root package name */
    public int f406391q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.recognition.ui.result.g f406392r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ I f406393s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ru.mts.biometry.sdk.feature.recognition.ui.result.g gVar, I i12, Continuation continuation) {
        super(2, continuation);
        this.f406392r = gVar;
        this.f406393s = i12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new d(this.f406392r, this.f406393s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f406391q;
        if (i12 == 0) {
            C42729a0.b(obj);
            n[] nVarArr = ru.mts.biometry.sdk.feature.recognition.ui.result.g.f436504j0;
            ru.mts.biometry.sdk.feature.recognition.ui.result.g gVar = this.f406392r;
            k kVar = gVar.f436506i0;
            n nVar = ru.mts.biometry.sdk.feature.recognition.ui.result.g.f436504j0[0];
            j jVar = (j) kVar.a(gVar);
            C42658c c42658c = new C42658c(gVar, this.f406393s);
            this.f406391q = 1;
            if (jVar.f406408K.collect(c42658c, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
