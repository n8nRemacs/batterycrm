package com.avito.android.hotel_booking.mvi;

import RI.b;
import com.avito.android.hotel.model.HotelBookingFormItem;
import com.avito.android.hotel.model.HotelBookingFormResponse;
import com.avito.android.hotel.model.HotelBookingInstallmentsItem;
import com.avito.android.hotel_booking.mvi.entity.HotelBookingInternalAction;
import com.avito.android.hotel_booking.mvi.entity.HotelBookingState;
import com.avito.android.remote.model.ParametrizedEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: HotelBookingActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/hotel_booking/mvi/entity/HotelBookingInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.hotel_booking.mvi.HotelBookingActor$process$1", f = "HotelBookingActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class e extends SuspendLambda implements Y41.p<InterfaceC43172j<? super HotelBookingInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ HotelBookingState f163838q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f163839r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ RI.b f163840s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(RI.b bVar, g gVar, HotelBookingState hotelBookingState, Continuation continuation) {
        super(2, continuation);
        this.f163838q = hotelBookingState;
        this.f163839r = gVar;
        this.f163840s = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new e(this.f163840s, this.f163839r, this.f163838q, continuation);
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super HotelBookingInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        List<HotelBookingFormItem> items;
        Object next;
        ParametrizedEvent onShowEvent;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        HotelBookingFormResponse.Form form = this.f163838q.f163875i;
        if (form != null && (items = form.getItems()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : items) {
                if (obj2 instanceof HotelBookingInstallmentsItem) {
                    arrayList.add(obj2);
                }
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                HotelBookingInstallmentsItem hotelBookingInstallmentsItem = (HotelBookingInstallmentsItem) next;
                b.k kVar = (b.k) this.f163840s;
                if (kVar.f14280a != null && L.f(hotelBookingInstallmentsItem.getId(), kVar.f14280a)) {
                    break;
                }
            }
            HotelBookingInstallmentsItem hotelBookingInstallmentsItem2 = (HotelBookingInstallmentsItem) next;
            if (hotelBookingInstallmentsItem2 != null && (onShowEvent = hotelBookingInstallmentsItem2.getOnShowEvent()) != null) {
                this.f163839r.f163900b.q(onShowEvent);
            }
        }
        return G0.f406611a;
    }
}
