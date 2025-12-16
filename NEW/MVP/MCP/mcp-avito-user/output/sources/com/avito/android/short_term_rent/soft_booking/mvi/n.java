package com.avito.android.short_term_rent.soft_booking.mvi;

import com.avito.android.short_term_rent.soft_booking.mvi.entity.StrSoftBookingInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.X;
import ow0.InterfaceC44950a;

/* compiled from: StrSoftBookingActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.short_term_rent.soft_booking.mvi.StrSoftBookingActor$handleRefundToggleClick$1", f = "StrSoftBookingActor.kt", i = {}, l = {490}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class n extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StrSoftBookingInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f282777q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f282778r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC44950a.v f282779s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.short_term_rent.soft_booking.mvi.state.a f282780t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C34981a f282781u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(InterfaceC44950a.v vVar, com.avito.android.short_term_rent.soft_booking.mvi.state.a aVar, C34981a c34981a, Continuation<? super n> continuation) {
        super(2, continuation);
        this.f282779s = vVar;
        this.f282780t = aVar;
        this.f282781u = c34981a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        n nVar = new n(this.f282779s, this.f282780t, this.f282781u, continuation);
        nVar.f282778r = obj;
        return nVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super StrSoftBookingInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((n) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f282777q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f282778r;
            InterfaceC44950a.v vVar = this.f282779s;
            String str = vVar.f422359a;
            com.avito.android.short_term_rent.soft_booking.mvi.state.a aVar = this.f282780t;
            pw0.k kVar = aVar.f282805n;
            if (L.f(str, kVar != null ? kVar.f428884b : null)) {
                return G0.f406611a;
            }
            X xA2 = this.f282781u.f282670a.a(aVar.f282795d, aVar.f282796e, aVar.f282797f, aVar.f282798g, aVar.f282799h, aVar.f282804m, Boxing.boxBoolean(L.f(vVar.f422359a, "noRefund")));
            this.f282777q = 1;
            if (C43175k.u(this, xA2, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
