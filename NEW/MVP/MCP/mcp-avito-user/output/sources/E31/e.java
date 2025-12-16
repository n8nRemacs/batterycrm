package e31;

import Y41.p;
import e.h;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.n2;

/* loaded from: classes8.dex */
public final class e extends SuspendLambda implements p {

    /* renamed from: q, reason: collision with root package name */
    public int f394938q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ f f394939r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, Continuation continuation) {
        super(2, continuation);
        this.f394939r = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new e(this.f394939r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return new e(this.f394939r, (Continuation) obj2).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f394938q;
        if (i12 == 0) {
            C42729a0.b(obj);
            f fVar = this.f394939r;
            n2 n2VarB = C43175k.b(((h) fVar.f394941b).f394238k);
            C39942d c39942d = new C39942d(fVar);
            this.f394938q = 1;
            if (n2VarB.collect(c39942d, this) == coroutine_suspended) {
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
