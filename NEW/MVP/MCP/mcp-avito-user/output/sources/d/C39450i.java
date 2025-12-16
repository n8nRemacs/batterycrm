package d;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* renamed from: d.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39450i extends SuspendLambda implements Y41.p {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ j f393136q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f393137r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39450i(j jVar, String str, Continuation continuation) {
        super(2, continuation);
        this.f393136q = jVar;
        this.f393137r = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C39450i(this.f393136q, this.f393137r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C39450i) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        j jVar = this.f393136q;
        G41.i iVar = (G41.i) jVar.f393140c;
        String str = this.f393137r;
        iVar.c(str, true);
        ((G41.i) jVar.f393140c).b(str, false);
        return G0.f406611a;
    }
}
