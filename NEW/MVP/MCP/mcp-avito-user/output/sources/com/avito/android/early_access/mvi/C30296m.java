package com.avito.android.early_access.mvi;

import com.avito.android.early_access.mvi.entity.EarlyAccessInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: EarlyAccessBootstrap.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "orderId", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/early_access/mvi/entity/EarlyAccessInternalAction;", "<anonymous>", "(J)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.early_access.mvi.EarlyAccessBootstrap$observeEarlyAccessPaymentStatusChanged$1", f = "EarlyAccessBootstrap.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.early_access.mvi.m, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C30296m extends SuspendLambda implements Y41.p<Long, Continuation<? super InterfaceC43160i<? extends EarlyAccessInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ long f145513q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C30297n f145514r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30296m(C30297n c30297n, Continuation<? super C30296m> continuation) {
        super(2, continuation);
        this.f145514r = c30297n;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C30296m c30296m = new C30296m(this.f145514r, continuation);
        c30296m.f145513q = ((Number) obj).longValue();
        return c30296m;
    }

    @Override // Y41.p
    public final Object invoke(Long l12, Continuation<? super InterfaceC43160i<? extends EarlyAccessInternalAction>> continuation) {
        return ((C30296m) create(Long.valueOf(l12.longValue()), continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return this.f145514r.f145515a.b(this.f145513q);
    }
}
