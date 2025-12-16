package com.avito.android.hotel_available_rooms.mvi;

import JI.a;
import com.avito.android.hotel_available_rooms.domain.models.HotelAvailableRoomsData;
import com.avito.android.hotel_available_rooms.domain.models.HotelRoom;
import com.avito.android.hotel_available_rooms.mvi.entity.HotelAvailableRoomsInternalAction;
import com.avito.android.hotel_available_rooms.mvi.entity.HotelAvailableRoomsState;
import com.avito.android.remote.model.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
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

/* compiled from: HotelAvailableRoomsActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/hotel_available_rooms/mvi/entity/HotelAvailableRoomsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.hotel_available_rooms.mvi.HotelAvailableRoomsActor$onGalleryItemClick$1", f = "HotelAvailableRoomsActor.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super HotelAvailableRoomsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f163087q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f163088r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ HotelAvailableRoomsState f163089s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a.h f163090t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(HotelAvailableRoomsState hotelAvailableRoomsState, a.h hVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f163089s = hotelAvailableRoomsState;
        this.f163090t = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f163089s, this.f163090t, continuation);
        aVar.f163088r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super HotelAvailableRoomsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        ArrayList arrayList;
        a.h hVar;
        Object next;
        List<Image> list;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f163087q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f163088r;
            HotelAvailableRoomsState hotelAvailableRoomsState = this.f163089s;
            HotelAvailableRoomsData hotelAvailableRoomsData = hotelAvailableRoomsState.f163123d;
            if (hotelAvailableRoomsData != null && (arrayList = hotelAvailableRoomsData.f162772d) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (obj2 instanceof HotelRoom) {
                        arrayList2.add(obj2);
                    }
                }
                Iterator it = arrayList2.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hVar = this.f163090t;
                    if (!zHasNext) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (L.f(((HotelRoom) next).f162802b, hVar.f8854a)) {
                        break;
                    }
                }
                HotelRoom hotelRoom = (HotelRoom) next;
                if (hotelRoom != null && (list = hotelRoom.f162803c) != null) {
                    int i13 = hVar.f8855b;
                    HotelAvailableRoomsData hotelAvailableRoomsData2 = hotelAvailableRoomsState.f163123d;
                    Map<String, String> map = hotelAvailableRoomsData2.f162770b;
                    String str = map != null ? map.get("cid") : null;
                    Map<String, String> map2 = hotelAvailableRoomsData2.f162770b;
                    HotelAvailableRoomsInternalAction.ShowFullscreenGallery showFullscreenGallery = new HotelAvailableRoomsInternalAction.ShowFullscreenGallery(list, i13, hVar.f8854a, str, map2 != null ? map2.get("iid") : null, hotelAvailableRoomsState.f163125f);
                    this.f163087q = 1;
                    if (interfaceC43172j.emit(showFullscreenGallery, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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
