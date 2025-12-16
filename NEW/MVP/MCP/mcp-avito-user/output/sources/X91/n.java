package X91;

import ba1.AbstractC25617i;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* loaded from: classes9.dex */
public final class n extends SuspendLambda implements Y41.p {

    /* renamed from: q, reason: collision with root package name */
    public int f18742q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f18743r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ o f18744s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, Continuation continuation) {
        super(2, continuation);
        this.f18744s = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        n nVar = new n(this.f18744s, continuation);
        nVar.f18743r = obj;
        return nVar;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f18742q;
        try {
            if (i12 == 0) {
                C42729a0.b(obj);
                z91.s sVar = z91.e.f443908b;
                if (sVar == null) {
                    throw new IllegalArgumentException("DI delegate is null");
                }
                sVar.b().f17823e = true;
                o oVar = this.f18744s;
                int i13 = Z.f406624c;
                U91.d dVar = oVar.f18746J;
                this.f18742q = 1;
                Object objL = dVar.f16242a.f436344a.l(this);
                if (objL != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objL = G0.f406611a;
                }
                if (objL != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objL = G0.f406611a;
                }
                if (objL == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            bVar = G0.f406611a;
            int i14 = Z.f406624c;
        } catch (Throwable th2) {
            int i15 = Z.f406624c;
            bVar = new Z.b(th2);
        }
        if (Z.b(bVar) != null) {
            z91.s sVar2 = z91.e.f443908b;
            if (sVar2 == null) {
                throw new IllegalArgumentException("DI delegate is null");
            }
            AbstractC25617i.a(sVar2.b());
        }
        z91.s sVar3 = z91.e.f443908b;
        if (sVar3 == null) {
            throw new IllegalArgumentException("DI delegate is null");
        }
        sVar3.b().f17823e = false;
        return G0.f406611a;
    }
}
