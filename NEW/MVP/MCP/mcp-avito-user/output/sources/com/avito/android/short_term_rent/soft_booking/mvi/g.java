package com.avito.android.short_term_rent.soft_booking.mvi;

import com.avito.android.short_term_rent.soft_booking.mvi.entity.StrSoftBookingInternalAction;
import com.avito.android.short_term_rent.soft_booking.mvi.state.viewstate.entity.GuestCountOption;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.X;
import ow0.InterfaceC44950a;
import pw0.C47157a;

/* compiled from: StrSoftBookingActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.short_term_rent.soft_booking.mvi.StrSoftBookingActor$handleGuestCountSelected$1", f = "StrSoftBookingActor.kt", i = {}, l = {199}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class g extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StrSoftBookingInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f282742q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f282743r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C34981a f282744s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC44950a.h f282745t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.short_term_rent.soft_booking.mvi.state.a f282746u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(C34981a c34981a, InterfaceC44950a.h hVar, com.avito.android.short_term_rent.soft_booking.mvi.state.a aVar, Continuation<? super g> continuation) {
        super(2, continuation);
        this.f282744s = c34981a;
        this.f282745t = hVar;
        this.f282746u = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        g gVar = new g(this.f282744s, this.f282745t, this.f282746u, continuation);
        gVar.f282743r = obj;
        return gVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super StrSoftBookingInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((g) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f282742q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f282743r;
            C34981a c34981a = this.f282744s;
            c34981a.f282673d.j();
            Object objG = C42745f0.G(this.f282745t.f422341b);
            GuestCountOption guestCountOption = objG instanceof GuestCountOption ? (GuestCountOption) objG : null;
            if (guestCountOption == null) {
                return G0.f406611a;
            }
            com.avito.android.short_term_rent.soft_booking.mvi.state.a aVar = this.f282746u;
            X xA2 = c34981a.f282670a.a(C47157a.a(aVar.f282795d, null, null, guestCountOption, null, null, null, 247), aVar.f282796e, aVar.f282797f, aVar.f282798g, aVar.f282799h, aVar.f282804m, aVar.f282802k);
            this.f282742q = 1;
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
