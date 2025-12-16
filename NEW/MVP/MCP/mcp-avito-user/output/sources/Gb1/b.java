package Gb1;

import Y41.p;
import e.InterfaceC39835a;
import e.h;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n2;

/* loaded from: classes9.dex */
public final class b extends SuspendLambda implements p {

    /* renamed from: q, reason: collision with root package name */
    public int f6607q;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new b(2, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return new b(2, (Continuation) obj2).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.C] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f6607q;
        if (i12 == 0) {
            C42729a0.b(obj);
            n2 n2Var = ((h) ((InterfaceC39835a) f.f6611a.getValue())).f394241n;
            a aVar = a.f6606b;
            this.f6607q = 1;
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
