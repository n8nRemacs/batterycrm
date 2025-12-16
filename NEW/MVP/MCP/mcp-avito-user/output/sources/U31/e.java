package u31;

import Y41.p;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.Z1;

/* loaded from: classes8.dex */
public final class e extends SuspendLambda implements p {

    /* renamed from: q, reason: collision with root package name */
    public int f439760q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ f f439761r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, Continuation continuation) {
        super(2, continuation);
        this.f439761r = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new e(this.f439761r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return new e(this.f439761r, (Continuation) obj2).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f439760q;
        if (i12 == 0) {
            C42729a0.b(obj);
            f fVar = this.f439761r;
            Z1 z12 = ((B81.e) fVar.f439762E).f897d;
            C48789d c48789d = new C48789d(fVar);
            this.f439760q = 1;
            if (z12.collect(c48789d, this) == coroutine_suspended) {
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
