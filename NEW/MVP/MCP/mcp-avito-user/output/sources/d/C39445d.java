package d;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* renamed from: d.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39445d extends SuspendLambda implements Y41.p {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C39447f f393117q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f393118r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39445d(C39447f c39447f, String str, Continuation continuation) {
        super(2, continuation);
        this.f393117q = c39447f;
        this.f393118r = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C39445d(this.f393117q, this.f393118r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C39445d) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        G41.a aVar = this.f393117q.f393123c;
        String str = this.f393118r;
        if (str == null) {
            str = "";
        }
        ((G41.i) aVar).c(str, false);
        return G0.f406611a;
    }
}
