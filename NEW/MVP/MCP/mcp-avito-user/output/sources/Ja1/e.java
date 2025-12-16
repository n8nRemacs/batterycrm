package ja1;

import Y41.p;
import ba1.AbstractC25617i;
import fa1.C40389c;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import y91.InterfaceC50089b;

/* loaded from: classes9.dex */
public final class e extends SuspendLambda implements p {

    /* renamed from: q, reason: collision with root package name */
    public int f405654q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f405655r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f405656s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, Continuation continuation) {
        super(2, continuation);
        this.f405656s = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        e eVar = new e(this.f405656s, continuation);
        eVar.f405655r = obj;
        return eVar;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f405654q;
        f fVar = this.f405656s;
        try {
            if (i12 == 0) {
                C42729a0.b(obj);
                int i13 = Z.f406624c;
                C40389c c40389c = fVar.f405657E;
                this.f405654q = 1;
                InterfaceC50089b interfaceC50089b = c40389c.f395966a.f436354c;
                if (interfaceC50089b == null) {
                    interfaceC50089b = null;
                }
                Object objF = interfaceC50089b.f(this);
                if (objF != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objF = G0.f406611a;
                }
                if (objF != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objF = G0.f406611a;
                }
                if (objF == coroutine_suspended) {
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
            AbstractC25617i.a(fVar.f405658J);
        }
        return G0.f406611a;
    }
}
