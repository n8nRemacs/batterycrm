package com.avito.android.hotel_available_rooms.mvi;

import com.avito.android.error.z;
import com.avito.android.hotel_available_rooms.domain.models.HotelAvailableRoomsData;
import com.avito.android.hotel_available_rooms.domain.models.HotelItem;
import com.avito.android.hotel_available_rooms.domain.models.HotelRoom;
import com.avito.android.hotel_available_rooms.mvi.entity.HotelAvailableRoomsInternalAction;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.ApiException;
import com.avito.android.util.C35936s;
import eJ.C40010b;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: HotelAvailableRoomsInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.hotel_available_rooms.mvi.HotelAvailableRoomsInteractorImpl$requestHotelAvailableRooms$1", f = "HotelAvailableRoomsInteractor.kt", i = {0}, l = {158, 173, 177}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes13.dex */
final class m extends SuspendLambda implements Y41.p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f163188q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f163189r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l f163190s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f163191t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f163192u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f163193v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ArrayList f163194w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Long f163195x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(l lVar, String str, String str2, String str3, ArrayList arrayList, Long l12, Continuation continuation) {
        super(2, continuation);
        this.f163190s = lVar;
        this.f163191t = str;
        this.f163192u = str2;
        this.f163193v = str3;
        this.f163194w = arrayList;
        this.f163195x = l12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        Long l12 = this.f163195x;
        m mVar = new m(this.f163190s, this.f163191t, this.f163192u, this.f163193v, this.f163194w, l12, continuation);
        mVar.f163189r = obj;
        return mVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((m) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f163188q;
        l lVar = this.f163190s;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f163189r;
            ZI.a aVar = lVar.f163159b;
            this.f163189r = interfaceC43172j;
            this.f163188q = 1;
            obj = aVar.b(this.f163191t, this.f163192u, this.f163193v, this.f163194w, this.f163195x, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2 && i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            interfaceC43172j = (InterfaceC43172j) this.f163189r;
            C42729a0.b(obj);
        }
        TypedResult typedResult = (TypedResult) obj;
        boolean z12 = typedResult instanceof TypedResult.Success;
        String str = this.f163191t;
        if (z12) {
            HotelAvailableRoomsData hotelAvailableRoomsDataA = lVar.f163160c.a((C40010b) ((TypedResult.Success) typedResult).getResult());
            ArrayList arrayList = hotelAvailableRoomsDataA.f162772d;
            int i13 = 0;
            if (arrayList != null && !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if ((((HotelItem) it.next()) instanceof HotelRoom) && (i13 = i13 + 1) < 0) {
                        C42745f0.G0();
                        throw null;
                    }
                }
            }
            lVar.f163162e.b(i13, str, hotelAvailableRoomsDataA.f162770b);
            HotelAvailableRoomsInternalAction.ContentLoaded contentLoaded = new HotelAvailableRoomsInternalAction.ContentLoaded(hotelAvailableRoomsDataA);
            this.f163189r = null;
            this.f163188q = 2;
            if (interfaceC43172j.emit(contentLoaded, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (!(typedResult instanceof TypedResult.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            TypedResult.Error error = (TypedResult.Error) typedResult;
            ApiException apiExceptionA = C35936s.a(error.getError(), error.getCause());
            lVar.f163162e.a(str);
            HotelAvailableRoomsInternalAction.ContentError contentError = new HotelAvailableRoomsInternalAction.ContentError(z.n(apiExceptionA));
            this.f163189r = null;
            this.f163188q = 3;
            if (interfaceC43172j.emit(contentError, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return G0.f406611a;
    }
}
