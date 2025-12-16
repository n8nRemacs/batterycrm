package d;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* renamed from: d.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39446e extends SuspendLambda implements Y41.p {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C39447f f393119q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f393120r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39446e(C39447f c39447f, String str, Continuation continuation) {
        super(2, continuation);
        this.f393119q = c39447f;
        this.f393120r = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C39446e(this.f393119q, this.f393120r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C39446e) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        C39447f c39447f = this.f393119q;
        G41.a aVar = c39447f.f393123c;
        String str = this.f393120r;
        ((G41.i) aVar).c(str == null ? "" : str, true);
        ((G41.i) c39447f.f393123c).b(str != null ? str : "", false);
        return G0.f406611a;
    }
}
