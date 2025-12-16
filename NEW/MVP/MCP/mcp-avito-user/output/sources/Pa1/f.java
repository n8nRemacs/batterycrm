package pa1;

import Y41.p;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.reflect.n;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.Z1;

/* loaded from: classes9.dex */
public final class f extends SuspendLambda implements p {

    /* renamed from: q, reason: collision with root package name */
    public int f428610q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.registration.ui.gallery.g f428611r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ru.mts.biometry.sdk.feature.registration.ui.gallery.g gVar, Continuation continuation) {
        super(2, continuation);
        this.f428611r = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new f(this.f428611r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f428610q;
        if (i12 == 0) {
            C42729a0.b(obj);
            C47042a c47042a = ru.mts.biometry.sdk.feature.registration.ui.gallery.g.f436513m0;
            ru.mts.biometry.sdk.feature.registration.ui.gallery.g gVar = this.f428611r;
            n nVar = ru.mts.biometry.sdk.feature.registration.ui.gallery.g.f436514n0[0];
            Z1 z12 = ((l) gVar.f436515h0.a(gVar)).f428621K;
            e eVar = new e(gVar);
            this.f428610q = 1;
            if (z12.collect(eVar, this) == coroutine_suspended) {
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
