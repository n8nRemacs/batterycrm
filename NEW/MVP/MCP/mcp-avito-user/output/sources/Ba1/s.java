package Ba1;

import android.os.SystemClock;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* loaded from: classes9.dex */
public final class s extends SuspendLambda implements Y41.p {

    /* renamed from: q, reason: collision with root package name */
    public int f1532q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ l0.g f1533r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f1534s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f1535t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ CoroutineContext f1536u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43172j f1537v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f1538w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(l0.g gVar, long j12, long j13, CoroutineContext coroutineContext, InterfaceC43172j interfaceC43172j, Object obj, Continuation continuation) {
        super(2, continuation);
        this.f1533r = gVar;
        this.f1534s = j12;
        this.f1535t = j13;
        this.f1536u = coroutineContext;
        this.f1537v = interfaceC43172j;
        this.f1538w = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new s(this.f1533r, this.f1534s, this.f1535t, this.f1536u, this.f1537v, this.f1538w, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f1532q;
        l0.g gVar = this.f1533r;
        if (i12 == 0) {
            C42729a0.b(obj);
            long j12 = gVar.f406841b - this.f1534s;
            this.f1532q = 1;
            if (C43131e0.b(j12, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            C42729a0.b(obj);
        }
        if (this.f1535t == gVar.f406841b) {
            gVar.f406841b = SystemClock.uptimeMillis() + 200;
            r rVar = new r(this.f1537v, this.f1538w, null);
            this.f1532q = 2;
            if (C43259k.g(this.f1536u, rVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return G0.f406611a;
    }
}
