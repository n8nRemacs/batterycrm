package va1;

import Y41.p;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.reflect.n;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.Z1;

/* loaded from: classes9.dex */
public final class d extends SuspendLambda implements p {

    /* renamed from: q, reason: collision with root package name */
    public int f440847q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.selfie.ui.uploadselfie.g f440848r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ru.mts.biometry.sdk.feature.selfie.ui.uploadselfie.g gVar, Continuation continuation) {
        super(2, continuation);
        this.f440848r = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new d(this.f440848r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f440847q;
        if (i12 == 0) {
            C42729a0.b(obj);
            C49291a c49291a = ru.mts.biometry.sdk.feature.selfie.ui.uploadselfie.g.f436527i0;
            ru.mts.biometry.sdk.feature.selfie.ui.uploadselfie.g gVar = this.f440848r;
            n nVar = ru.mts.biometry.sdk.feature.selfie.ui.uploadselfie.g.f436528j0[0];
            Z1 z12 = ((m) gVar.f436529h0.a(gVar)).f440867M;
            c cVar = new c(gVar);
            this.f440847q = 1;
            if (z12.collect(cVar, this) == coroutine_suspended) {
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
