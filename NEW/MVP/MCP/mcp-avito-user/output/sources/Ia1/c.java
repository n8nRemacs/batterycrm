package ia1;

import Y41.p;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import ru.mts.biometry.api.dataSource.o;
import ru.mts.biometry.sdk.feature.recognition.ui.error.g;
import y91.InterfaceC50089b;
import z91.e;
import z91.s;

/* loaded from: classes9.dex */
public final class c extends SuspendLambda implements p {

    /* renamed from: q, reason: collision with root package name */
    public int f398566q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f398567r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, Continuation continuation) {
        super(2, continuation);
        this.f398567r = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new c(this.f398567r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f398566q;
        if (i12 == 0) {
            C42729a0.b(obj);
            this.f398567r.requireContext();
            s sVar = e.f443908b;
            if (sVar == null) {
                throw new IllegalArgumentException("DI delegate is null");
            }
            o oVar = sVar.a().f436313b;
            this.f398566q = 1;
            InterfaceC50089b interfaceC50089b = oVar.f436354c;
            if (interfaceC50089b == null) {
                interfaceC50089b = null;
            }
            Object objG = interfaceC50089b.g(this);
            if (objG != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objG = G0.f406611a;
            }
            if (objG == coroutine_suspended) {
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
