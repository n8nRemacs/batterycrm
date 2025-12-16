package ja1;

import Y41.p;
import androidx.view.C23056p0;
import androidx.view.Lifecycle;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* loaded from: classes9.dex */
public final class c extends SuspendLambda implements p {

    /* renamed from: q, reason: collision with root package name */
    public int f405651q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.recognition.ui.intro.e f405652r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ru.mts.biometry.sdk.feature.recognition.ui.intro.e eVar, Continuation continuation) {
        super(2, continuation);
        this.f405652r = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new c(this.f405652r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f405651q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Lifecycle.State state = Lifecycle.State.f46682e;
            ru.mts.biometry.sdk.feature.recognition.ui.intro.e eVar = this.f405652r;
            b bVar = new b(eVar, null);
            this.f405651q = 1;
            if (C23056p0.b(eVar, state, bVar, this) == coroutine_suspended) {
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
