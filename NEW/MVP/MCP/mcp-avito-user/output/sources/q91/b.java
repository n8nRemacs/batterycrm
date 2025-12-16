package Q91;

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
    public int f13575q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.document.intro.ui.e f13576r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ru.mts.biometry.sdk.feature.document.intro.ui.e eVar, Continuation continuation) {
        super(2, continuation);
        this.f13576r = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new b(this.f13576r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f13575q;
        if (i12 == 0) {
            C42729a0.b(obj);
            n[] nVarArr = ru.mts.biometry.sdk.feature.document.intro.ui.e.f436443i0;
            ru.mts.biometry.sdk.feature.document.intro.ui.e eVar = this.f13576r;
            n nVar = ru.mts.biometry.sdk.feature.document.intro.ui.e.f436443i0[0];
            n2 n2Var = ((f) eVar.f436444h0.a(eVar)).f13584E;
            a aVar = new a(eVar);
            this.f13575q = 1;
            if (n2Var.collect(aVar, this) == coroutine_suspended) {
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
