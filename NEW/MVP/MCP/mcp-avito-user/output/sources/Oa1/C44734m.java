package oa1;

import Y41.p;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43131e0;

/* renamed from: oa1.m, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C44734m extends SuspendLambda implements p {

    /* renamed from: q, reason: collision with root package name */
    public int f419925q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f419926r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C44736o f419927s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44734m(C44736o c44736o, Continuation continuation) {
        super(2, continuation);
        this.f419927s = c44736o;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C44734m c44734m = new C44734m(this.f419927s, continuation);
        c44734m.f419926r = obj;
        return c44734m;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C44734m) create((ru.mts.biometry.sdk.domain.entity.polling.status.d) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f419925q;
        C44736o c44736o = this.f419927s;
        if (i12 == 0) {
            C42729a0.b(obj);
            if (((ru.mts.biometry.sdk.domain.entity.polling.status.d) this.f419926r) == ru.mts.biometry.sdk.domain.entity.polling.status.d.f436404h) {
                return G0.f406611a;
            }
            c44736o.f419936L.setValue(C44730i.f419922a);
            this.f419925q = 1;
            if (C43131e0.b(1000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        c44736o.f419935K.f17823e = false;
        c44736o.f419934J.f2041e = null;
        return G0.f406611a;
    }
}
