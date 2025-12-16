package com.avito.android.short_term_rent.soft_booking.mvi;

import com.avito.android.guests_selector.io.GuestsSelectorChildOutput;
import com.avito.android.guests_selector.io.GuestsSelectorOutput;
import com.avito.android.short_term_rent.common.entity.GuestsDetailedValue;
import com.avito.android.short_term_rent.soft_booking.mvi.entity.StrSoftBookingInternalAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.X;
import ow0.InterfaceC44950a;
import pw0.C47157a;
import pw0.C47160d;

/* compiled from: StrSoftBookingActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.short_term_rent.soft_booking.mvi.StrSoftBookingActor$handleGuestsSelectorResult$1", f = "StrSoftBookingActor.kt", i = {}, l = {236}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class h extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StrSoftBookingInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f282747q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f282748r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C34981a f282749s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.short_term_rent.soft_booking.mvi.state.a f282750t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC44950a.i f282751u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(C34981a c34981a, com.avito.android.short_term_rent.soft_booking.mvi.state.a aVar, InterfaceC44950a.i iVar, Continuation<? super h> continuation) {
        super(2, continuation);
        this.f282749s = c34981a;
        this.f282750t = aVar;
        this.f282751u = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        h hVar = new h(this.f282749s, this.f282750t, this.f282751u, continuation);
        hVar.f282748r = obj;
        return hVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super StrSoftBookingInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((h) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        GuestsDetailedValue guestsDetailedValue;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f282747q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f282748r;
            C34981a c34981a = this.f282749s;
            c34981a.f282673d.j();
            com.avito.android.short_term_rent.soft_booking.mvi.state.a aVar = this.f282750t;
            C47160d c47160d = aVar.f282795d.f428852f;
            Integer version = (c47160d == null || (guestsDetailedValue = c47160d.f428865c) == null) ? null : guestsDetailedValue.getVersion();
            InterfaceC44950a.i iVar = this.f282751u;
            List<GuestsSelectorChildOutput> list = iVar.f422343a.f161449c;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((GuestsSelectorChildOutput) it.next()).f161446b);
            }
            GuestsSelectorOutput guestsSelectorOutput = iVar.f422343a;
            Boolean bool = guestsSelectorOutput.f161450d;
            int size = arrayList.size();
            int i13 = guestsSelectorOutput.f161448b;
            GuestsDetailedValue guestsDetailedValue2 = new GuestsDetailedValue(version, Boxing.boxInt(size + i13), Boxing.boxInt(i13), arrayList, bool);
            C47157a c47157a = aVar.f282795d;
            C47160d c47160d2 = c47157a.f428852f;
            X xA2 = c34981a.f282670a.a(C47157a.a(c47157a, null, null, null, null, c47160d2 != null ? new C47160d(c47160d2.f428863a, c47160d2.f428864b, guestsDetailedValue2, c47160d2.f428866d, c47160d2.f428867e, c47160d2.f428868f, c47160d2.f428869g, c47160d2.f428870h) : null, null, 223), aVar.f282796e, aVar.f282797f, aVar.f282798g, aVar.f282799h, aVar.f282804m, aVar.f282802k);
            this.f282747q = 1;
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
