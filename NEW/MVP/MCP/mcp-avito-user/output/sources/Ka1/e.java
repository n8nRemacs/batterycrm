package ka1;

import B91.I;
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
public final class e extends SuspendLambda implements p {

    /* renamed from: q, reason: collision with root package name */
    public int f406394q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.recognition.ui.result.g f406395r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ I f406396s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ru.mts.biometry.sdk.feature.recognition.ui.result.g gVar, I i12, Continuation continuation) {
        super(2, continuation);
        this.f406395r = gVar;
        this.f406396s = i12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new e(this.f406395r, this.f406396s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f406394q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Lifecycle.State state = Lifecycle.State.f46682e;
            ru.mts.biometry.sdk.feature.recognition.ui.result.g gVar = this.f406395r;
            d dVar = new d(gVar, this.f406396s, null);
            this.f406394q = 1;
            if (C23056p0.b(gVar, state, dVar, this) == coroutine_suspended) {
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
