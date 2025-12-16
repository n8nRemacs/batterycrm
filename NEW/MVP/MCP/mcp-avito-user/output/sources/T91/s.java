package T91;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.Z1;

/* loaded from: classes9.dex */
public final class s extends SuspendLambda implements Y41.p {

    /* renamed from: q, reason: collision with root package name */
    public int f15472q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ z f15473r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(z zVar, Continuation continuation) {
        super(2, continuation);
        this.f15473r = zVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new s(this.f15473r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f15472q;
        z zVar = this.f15473r;
        if (i12 == 0) {
            C42729a0.b(obj);
            Z91.b bVar = zVar.f15490E;
            E91.d dVar = C91.a.f2018e.f3819e;
            this.f15472q = 1;
            obj = bVar.a(dVar, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        String str = (String) obj;
        zVar.f15493L.setValue(new C15344b(str, str.length() == 0, str.length() != 12));
        Z1 z12 = zVar.f15493L;
        do {
            value = z12.getValue();
        } while (!z12.N3(value, new C15344b(str, ((C15344b) value).f15442c, str.length() != 12)));
        return G0.f406611a;
    }
}
