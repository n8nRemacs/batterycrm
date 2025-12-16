package ja1;

import Ba1.k;
import Y41.p;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.reflect.n;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.n2;

/* loaded from: classes9.dex */
public final class b extends SuspendLambda implements p {

    /* renamed from: q, reason: collision with root package name */
    public int f405649q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.recognition.ui.intro.e f405650r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ru.mts.biometry.sdk.feature.recognition.ui.intro.e eVar, Continuation continuation) {
        super(2, continuation);
        this.f405650r = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new b(this.f405650r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f405649q;
        if (i12 == 0) {
            C42729a0.b(obj);
            n[] nVarArr = ru.mts.biometry.sdk.feature.recognition.ui.intro.e.f436502i0;
            ru.mts.biometry.sdk.feature.recognition.ui.intro.e eVar = this.f405650r;
            k kVar = eVar.f436503h0;
            n nVar = ru.mts.biometry.sdk.feature.recognition.ui.intro.e.f436502i0[0];
            n2 n2Var = ((f) kVar.a(eVar)).f405659K;
            C42342a c42342a = new C42342a(eVar);
            this.f405649q = 1;
            if (n2Var.collect(c42342a, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
