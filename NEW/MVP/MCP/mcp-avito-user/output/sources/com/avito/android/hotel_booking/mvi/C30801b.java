package com.avito.android.hotel_booking.mvi;

import com.avito.android.hotel.model.HotelBookingFormItem;
import com.avito.android.hotel.model.HotelBookingFormResponse;
import com.avito.android.hotel.model.HotelBookingInfo;
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
@DebugMetadata(c = "com.avito.android.hotel_booking.mvi.HotelBookingActor$onBookingDescriptionClick$1", f = "HotelBookingActor.kt", i = {}, l = {120}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.hotel_booking.mvi.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C30801b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super HotelBookingInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f163827q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f163828r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ HotelBookingState f163829s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ g f163830t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30801b(HotelBookingState hotelBookingState, g gVar, Continuation<? super C30801b> continuation) {
        super(2, continuation);
        this.f163829s = hotelBookingState;
        this.f163830t = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C30801b c30801b = new C30801b(this.f163829s, this.f163830t, continuation);
        c30801b.f163828r = obj;
        return c30801b;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super HotelBookingInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C30801b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        List<HotelBookingFormItem> items;
        String targetParameterId;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f163827q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f163828r;
            HotelBookingState hotelBookingState = this.f163829s;
            HotelBookingFormResponse.Form form = hotelBookingState.f163875i;
            if (form == null || (items = form.getItems()) == null) {
                return G0.f406611a;
            }
            HotelBookingInfo info = hotelBookingState.f163875i.getInfo();
            if (info == null || (targetParameterId = info.getTargetParameterId()) == null) {
                return G0.f406611a;
            }
            MI.a aVar = this.f163830t.f163900b;
            String str = hotelBookingState.f163871e;
            if (str == null) {
                str = "";
            }
            aVar.b(str);
            Iterator<HotelBookingFormItem> it = items.iterator();
            int i13 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i13 = -1;
                    break;
                }
                HotelBookingFormItem next = it.next();
                HotelBookingParameter hotelBookingParameter = next instanceof HotelBookingParameter ? (HotelBookingParameter) next : null;
                if (L.f(hotelBookingParameter != null ? hotelBookingParameter.getId() : null, targetParameterId)) {
                    break;
                }
                i13++;
            }
            HotelBookingInternalAction.ClickBookingDescription clickBookingDescription = new HotelBookingInternalAction.ClickBookingDescription(i13);
            this.f163827q = 1;
            if (interfaceC43172j.emit(clickBookingDescription, this) == coroutine_suspended) {
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
