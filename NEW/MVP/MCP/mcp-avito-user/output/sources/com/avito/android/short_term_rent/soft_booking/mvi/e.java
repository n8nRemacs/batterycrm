package com.avito.android.short_term_rent.soft_booking.mvi;

import com.avito.android.deep_linking.links.CalendarLink;
import com.avito.android.short_term_rent.soft_booking.mvi.entity.StrSoftBookingInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
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
@DebugMetadata(c = "com.avito.android.short_term_rent.soft_booking.mvi.StrSoftBookingActor$handleDateRangeFieldChanged$1", f = "StrSoftBookingActor.kt", i = {}, l = {150}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class e extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StrSoftBookingInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f282702q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f282703r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C34981a f282704s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.short_term_rent.soft_booking.mvi.state.a f282705t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC44950a.f f282706u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(C34981a c34981a, com.avito.android.short_term_rent.soft_booking.mvi.state.a aVar, InterfaceC44950a.f fVar, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f282704s = c34981a;
        this.f282705t = aVar;
        this.f282706u = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        e eVar = new e(this.f282704s, this.f282705t, this.f282706u, continuation);
        eVar.f282703r = obj;
        return eVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super StrSoftBookingInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f282702q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f282703r;
            C34981a c34981a = this.f282704s;
            c34981a.f282673d.a();
            com.avito.android.short_term_rent.soft_booking.mvi.state.a aVar = this.f282705t;
            C47157a c47157a = aVar.f282795d;
            CalendarLink.b.C3988b c3988b = this.f282706u.f422338a;
            X xA2 = c34981a.f282670a.a(C47157a.a(c47157a, c3988b.f133080b, c3988b.f133081c, null, null, null, null, 252), aVar.f282796e, aVar.f282797f, aVar.f282798g, aVar.f282799h, aVar.f282804m, aVar.f282802k);
            this.f282702q = 1;
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
