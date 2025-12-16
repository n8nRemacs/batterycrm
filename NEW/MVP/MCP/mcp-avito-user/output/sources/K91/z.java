package K91;

import android.os.Bundle;
import androidx.core.os.C22777e;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.Z1;
import ru.mts.biometry.api.FlowException;

/* loaded from: classes9.dex */
public final class z extends SuspendLambda implements Y41.p {

    /* renamed from: q, reason: collision with root package name */
    public int f9333q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f9334r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ A f9335s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(A a12, Continuation continuation) {
        super(2, continuation);
        this.f9335s = a12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        z zVar = new z(this.f9335s, continuation);
        zVar.f9334r = obj;
        return zVar;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((z) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        I91.d dVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f9333q;
        A a12 = this.f9335s;
        Z1 z12 = a12.f9300L;
        W91.h hVar = a12.f9298J;
        Z1 z13 = a12.f9301M;
        try {
            if (i12 == 0) {
                C42729a0.b(obj);
                hVar.f17823e = true;
                int i13 = Z.f406624c;
                z13.setValue(v.f9329a);
                Object value = z12.getValue();
                q qVar = value instanceof q ? (q) value : null;
                if (qVar == null || (dVar = qVar.f9325a) == null) {
                    throw new NullPointerException();
                }
                I91.c cVar = a12.f9297E;
                this.f9333q = 1;
                Object objH = cVar.f8027a.h(dVar.f8030c, dVar.f8031d, dVar.f8032e, dVar.f8034g, dVar.f8035h, dVar.f8036i, dVar.f8037j, this);
                if (objH != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objH = G0.f406611a;
                }
                if (objH == coroutine_suspended) {
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
        Throwable thB = Z.b(bVar);
        if (thB == null) {
            y yVar = new y(a12, null);
            C91.h hVar2 = a12.f9299K;
            hVar2.getClass();
            hVar2.f2041e = yVar;
            Bundle bundleA = C22777e.a();
            Object value2 = z12.getValue();
            q qVar2 = value2 instanceof q ? (q) value2 : null;
            I91.d dVar2 = qVar2 != null ? qVar2.f9325a : null;
            if (dVar2 != null) {
                bundleA.putString("fullAddress", dVar2.f8029b);
            }
            z13.setValue(new w(bundleA));
        } else {
            hVar.f17823e = false;
            z13.setValue(thB instanceof FlowException ? new t(((FlowException) thB).f436292b) : s.f9326a);
        }
        return G0.f406611a;
    }
}
