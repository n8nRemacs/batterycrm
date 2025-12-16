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
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: HotelBookingActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/hotel_booking/mvi/entity/HotelBookingInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.hotel_booking.mvi.HotelBookingActor$process$2", f = "HotelBookingActor.kt", i = {}, l = {72}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class f extends SuspendLambda implements Y41.p<InterfaceC43172j<? super HotelBookingInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f163894q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f163895r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ HotelBookingState f163896s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ RI.b f163897t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ g f163898u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(RI.b bVar, g gVar, HotelBookingState hotelBookingState, Continuation continuation) {
        super(2, continuation);
        this.f163896s = hotelBookingState;
        this.f163897t = bVar;
        this.f163898u = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        f fVar = new f(this.f163897t, this.f163898u, this.f163896s, continuation);
        fVar.f163895r = obj;
        return fVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super HotelBookingInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        HotelBookingInstallmentsItem hotelBookingInstallmentsItem;
        ParametrizedEvent onClickEvent;
        List<HotelBookingFormItem> items;
        Object next;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f163894q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f163895r;
            HotelBookingState hotelBookingState = this.f163896s;
            HotelBookingFormResponse.Form form = hotelBookingState.f163875i;
            RI.b bVar = this.f163897t;
            if (form == null || (items = form.getItems()) == null) {
                hotelBookingInstallmentsItem = null;
            } else {
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
                    HotelBookingInstallmentsItem hotelBookingInstallmentsItem2 = (HotelBookingInstallmentsItem) next;
                    b.l lVar = (b.l) bVar;
                    if (lVar.f14281a != null && L.f(hotelBookingInstallmentsItem2.getId(), lVar.f14281a)) {
                        break;
                    }
                }
                hotelBookingInstallmentsItem = (HotelBookingInstallmentsItem) next;
            }
            g gVar = this.f163898u;
            if (hotelBookingInstallmentsItem != null && (onClickEvent = hotelBookingInstallmentsItem.getOnClickEvent()) != null) {
                gVar.f163900b.a(((b.l) bVar).f14282b, onClickEvent);
            }
            b.l lVar2 = (b.l) bVar;
            if (!L.f(hotelBookingInstallmentsItem != null ? hotelBookingInstallmentsItem.getValue() : null, lVar2.f14283c)) {
                InterfaceC43160i<HotelBookingInternalAction> interfaceC43160iD = gVar.d(hotelBookingState, lVar2.f14281a, lVar2.f14283c);
                this.f163894q = 1;
                if (C43175k.u(this, interfaceC43160iD, interfaceC43172j) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
