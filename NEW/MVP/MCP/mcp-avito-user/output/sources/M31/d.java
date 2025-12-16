package m31;

import Y41.p;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n2;

/* loaded from: classes8.dex */
public final class d extends SuspendLambda implements p {

    /* renamed from: q, reason: collision with root package name */
    public int f414288q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Ub1.b f414289r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Ub1.b bVar, Continuation continuation) {
        super(2, continuation);
        this.f414289r = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new d(this.f414289r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return new d(this.f414289r, (Continuation) obj2).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f414288q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Ub1.b bVar = this.f414289r;
            n2 n2Var = ((O51.d) bVar.getConfigRamStorage()).f12008e;
            C43875c c43875c = new C43875c(bVar);
            this.f414288q = 1;
            if (n2Var.collect(c43875c, this) == coroutine_suspended) {
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
