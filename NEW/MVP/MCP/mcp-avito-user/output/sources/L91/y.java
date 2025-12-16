package L91;

import android.content.Context;
import android.graphics.Bitmap;
import ba1.AbstractC25617i;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Z;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.Z1;

/* loaded from: classes9.dex */
public final class y extends SuspendLambda implements Y41.p {

    /* renamed from: q, reason: collision with root package name */
    public int f9854q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f9855r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ z f9856s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Bitmap f9857t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Context f9858u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, Bitmap bitmap, Context context, Continuation continuation) {
        super(2, continuation);
        this.f9856s = zVar;
        this.f9857t = bitmap;
        this.f9858u = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        y yVar = new y(this.f9856s, this.f9857t, this.f9858u, continuation);
        yVar.f9855r = obj;
        return yVar;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((y) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.Collection] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f9854q;
        z zVar = this.f9856s;
        try {
            if (i12 == 0) {
                C42729a0.b(obj);
                Z1 z12 = zVar.f9865O;
                Bitmap bitmap = this.f9857t;
                z12.setValue(new v(Ba1.i.a(bitmap)));
                r rVar = zVar.f9862L;
                ArrayList arrayListI0 = C42745f0.i0(bitmap, rVar.f9846b);
                zVar.f9862L = new r(rVar.f9845a, arrayListI0);
                Context context = this.f9858u;
                int i13 = Z.f406624c;
                Y91.b bVar2 = zVar.f9859E;
                this.f9854q = 1;
                bVar2.getClass();
                Object objG = C43259k.g(C43262l0.f411947c, new Y91.a(bVar2, arrayListI0, context, null), this);
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
            bVar = G0.f406611a;
            int i14 = Z.f406624c;
        } catch (Throwable th2) {
            int i15 = Z.f406624c;
            bVar = new Z.b(th2);
        }
        if (!(bVar instanceof Z.b)) {
            r rVar2 = zVar.f9862L;
            zVar.f9862L = new r(rVar2.f9845a, C42784z0.f406748b);
            x xVar = new x(zVar, null);
            C91.h hVar = zVar.f9861K;
            hVar.getClass();
            hVar.f2041e = xVar;
        }
        Throwable thB = Z.b(bVar);
        if (thB != null) {
            W91.h hVar2 = zVar.f9860J;
            hVar2.f17823e = false;
            if (!(thB instanceof CancellationException)) {
                AbstractC25617i.a(hVar2);
            }
        }
        return G0.f406611a;
    }
}
