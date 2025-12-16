package com.avito.android.hotel_booking.mvi;

import RI.b;
import com.avito.android.hotel.model.HotelBookingFormItem;
import com.avito.android.hotel.model.HotelBookingFormResponse;
import com.avito.android.hotel.model.HotelBookingInputItem;
import com.avito.android.hotel.model.HotelBookingParameter;
import com.avito.android.hotel_booking.mvi.entity.HotelBookingInternalAction;
import com.avito.android.hotel_booking.mvi.entity.HotelBookingState;
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
@DebugMetadata(c = "com.avito.android.hotel_booking.mvi.HotelBookingActor$onInputFocusCleared$1", f = "HotelBookingActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super HotelBookingInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ b.h f163835q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ HotelBookingState f163836r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g f163837s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b.h hVar, HotelBookingState hotelBookingState, g gVar, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f163835q = hVar;
        this.f163836r = hotelBookingState;
        this.f163837s = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new d(this.f163835q, this.f163836r, this.f163837s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super HotelBookingInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        List<HotelBookingFormItem> items;
        Object next;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        String str = this.f163835q.f14276a;
        if (str == null) {
            return G0.f406611a;
        }
        HotelBookingFormResponse.Form form = this.f163836r.f163875i;
        if (form != null && (items = form.getItems()) != null) {
            Iterator<T> it = items.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                HotelBookingFormItem hotelBookingFormItem = (HotelBookingFormItem) next;
                HotelBookingParameter hotelBookingParameter = hotelBookingFormItem instanceof HotelBookingParameter ? (HotelBookingParameter) hotelBookingFormItem : null;
                if (L.f(hotelBookingParameter != null ? hotelBookingParameter.getId() : null, str)) {
                    break;
                }
            }
            HotelBookingFormItem hotelBookingFormItem2 = (HotelBookingFormItem) next;
            if (hotelBookingFormItem2 != null) {
                HotelBookingInputItem hotelBookingInputItem = (HotelBookingInputItem) (hotelBookingFormItem2 instanceof HotelBookingInputItem ? hotelBookingFormItem2 : null);
                if (hotelBookingInputItem != null) {
                    this.f163837s.f163900b.c(hotelBookingInputItem);
                    return G0.f406611a;
                }
            }
        }
        return G0.f406611a;
    }
}
