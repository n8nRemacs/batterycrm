package G41;

import Y41.p;
import java.util.Objects;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.Z1;

/* loaded from: classes8.dex */
public final class g extends SuspendLambda implements p {

    /* renamed from: q, reason: collision with root package name */
    public kotlinx.coroutines.sync.a f6324q;

    /* renamed from: r, reason: collision with root package name */
    public Object f6325r;

    /* renamed from: s, reason: collision with root package name */
    public N41.g f6326s;

    /* renamed from: t, reason: collision with root package name */
    public int f6327t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ i f6328u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ N41.g f6329v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, N41.g gVar, Continuation continuation) {
        super(2, continuation);
        this.f6328u = iVar;
        this.f6329v = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new g(this.f6328u, this.f6329v, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        i iVar;
        kotlinx.coroutines.sync.a aVar;
        N41.g gVar;
        N41.g gVar2;
        kotlinx.coroutines.sync.a aVar2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f6327t;
        try {
            if (i12 == 0) {
                C42729a0.b(obj);
                i iVar2 = this.f6328u;
                kotlinx.coroutines.sync.d dVar = iVar2.f6333d;
                this.f6324q = dVar;
                this.f6325r = iVar2;
                N41.g gVar3 = this.f6329v;
                this.f6326s = gVar3;
                this.f6327t = 1;
                if (dVar.b(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                iVar = iVar2;
                aVar = dVar;
                gVar = gVar3;
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gVar2 = (N41.g) this.f6325r;
                    aVar2 = this.f6324q;
                    try {
                        C42729a0.b(obj);
                        Objects.toString(gVar2);
                        G0 g02 = G0.f406611a;
                        aVar2.d(null);
                        return g02;
                    } catch (Throwable th2) {
                        th = th2;
                        aVar = aVar2;
                        aVar.d(null);
                        throw th;
                    }
                }
                gVar = this.f6326s;
                iVar = (i) this.f6325r;
                aVar = this.f6324q;
                C42729a0.b(obj);
            }
            Z1 z12 = iVar.f6331b;
            this.f6324q = aVar;
            this.f6325r = gVar;
            this.f6326s = null;
            this.f6327t = 2;
            if (z12.emit(gVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            gVar2 = gVar;
            aVar2 = aVar;
            Objects.toString(gVar2);
            G0 g022 = G0.f406611a;
            aVar2.d(null);
            return g022;
        } catch (Throwable th3) {
            th = th3;
            aVar.d(null);
            throw th;
        }
    }
}
