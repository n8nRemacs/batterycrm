package O91;

import Ba1.y;
import java.util.ArrayList;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* loaded from: classes9.dex */
public final class k extends SuspendLambda implements Y41.p {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f12050q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ o f12051r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o oVar, Continuation continuation) {
        super(2, continuation);
        this.f12051r = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        k kVar = new k(this.f12051r, continuation);
        kVar.f12050q = obj;
        return kVar;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        o oVar = this.f12051r;
        try {
            int i12 = Z.f406624c;
            oVar.f12060E.getClass();
            bVar = M91.a.a();
        } catch (Throwable th2) {
            int i13 = Z.f406624c;
            bVar = new Z.b(th2);
        }
        if (Z.b(bVar) == null) {
            l lVar = (l) bVar;
            ArrayList arrayList = lVar.f12052a;
            oVar.f12064M = arrayList;
            oVar.f12065N.setValue(arrayList);
            oVar.f12062K.setValue(lVar.f12053b);
        } else {
            oVar.f12061J.c(new W91.e(y.b(null), "ERROR_SCREEN"));
        }
        return G0.f406611a;
    }
}
