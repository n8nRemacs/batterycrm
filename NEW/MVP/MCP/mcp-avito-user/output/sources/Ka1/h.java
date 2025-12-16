package ka1;

import Y41.p;
import ba1.AbstractC25617i;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import ru.mts.biometry.api.dataSource.o;
import y91.InterfaceC50089b;

/* loaded from: classes9.dex */
public final class h extends SuspendLambda implements p {

    /* renamed from: q, reason: collision with root package name */
    public int f406400q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f406401r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j f406402s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, Continuation continuation) {
        super(2, continuation);
        this.f406402s = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        h hVar = new h(this.f406402s, continuation);
        hVar.f406401r = obj;
        return hVar;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f406400q;
        j jVar = this.f406402s;
        try {
            if (i12 == 0) {
                C42729a0.b(obj);
                int i13 = Z.f406624c;
                fa1.d dVar = jVar.f406406E;
                this.f406400q = 1;
                o oVar = dVar.f395969b;
                InterfaceC50089b interfaceC50089b = oVar.f436354c;
                if (interfaceC50089b == null) {
                    interfaceC50089b = null;
                }
                Object objE = interfaceC50089b.e(oVar.f436355d, this);
                if (objE != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objE = G0.f406611a;
                }
                if (objE != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objE = G0.f406611a;
                }
                if (objE == coroutine_suspended) {
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
            AbstractC25617i.a(jVar.f406407J);
        }
        return G0.f406611a;
    }
}
