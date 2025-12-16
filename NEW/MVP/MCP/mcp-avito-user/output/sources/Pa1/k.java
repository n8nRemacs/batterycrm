package pa1;

import Y41.p;
import android.graphics.Bitmap;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.Z1;
import la1.C43717a;

/* loaded from: classes9.dex */
public final class k extends SuspendLambda implements p {

    /* renamed from: q, reason: collision with root package name */
    public int f428615q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f428616r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l f428617s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Bitmap f428618t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, Bitmap bitmap, Continuation continuation) {
        super(2, continuation);
        this.f428617s = lVar;
        this.f428618t = bitmap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        k kVar = new k(this.f428617s, this.f428618t, continuation);
        kVar.f428616r = obj;
        return kVar;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f428615q;
        l lVar = this.f428617s;
        Z1 z12 = lVar.f428621K;
        try {
            if (i12 == 0) {
                C42729a0.b(obj);
                z12.setValue(i.f428614a);
                Bitmap bitmap = this.f428618t;
                int i13 = Z.f406624c;
                la1.c cVar = lVar.f428619E;
                this.f428615q = 1;
                cVar.getClass();
                Object objG = C43259k.g(C43262l0.f411947c, new C43717a(bitmap, null), this);
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
        if (Z.b(bVar) == null) {
            Aa1.b.b(lVar.f428620J);
        } else {
            z12.setValue(h.f428613a);
        }
        return G0.f406611a;
    }
}
