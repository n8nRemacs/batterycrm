package e31;

import Y41.p;
import e.h;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.Z1;

/* renamed from: e31.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C39941c extends SuspendLambda implements p {

    /* renamed from: q, reason: collision with root package name */
    public int f394935q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ f f394936r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39941c(f fVar, Continuation continuation) {
        super(2, continuation);
        this.f394936r = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C39941c(this.f394936r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return new C39941c(this.f394936r, (Continuation) obj2).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f394935q;
        if (i12 == 0) {
            C42729a0.b(obj);
            f fVar = this.f394936r;
            Z1 z12 = ((h) fVar.f394941b).f394237j;
            C39940b c39940b = new C39940b(fVar);
            this.f394935q = 1;
            if (z12.collect(c39940b, this) == coroutine_suspended) {
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
