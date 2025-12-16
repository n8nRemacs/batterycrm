package com.avito.android.hotel_booking.mvi;

import com.avito.android.hotel.model.HotelBookingFormItem;
import com.avito.android.hotel_booking.mvi.entity.HotelBookingInternalAction;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: HotelBookingInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/hotel_booking/mvi/entity/HotelBookingInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.hotel_booking.mvi.HotelBookingInteractor$createBooking$1", f = "HotelBookingInteractor.kt", i = {0}, l = {70, 86, 88, 98, 131, 133}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes13.dex */
final class p extends SuspendLambda implements Y41.p<InterfaceC43172j<? super HotelBookingInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ String f163936A;

    /* renamed from: q, reason: collision with root package name */
    public int f163937q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f163938r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ t f163939s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ List<Integer> f163940t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ List<HotelBookingFormItem> f163941u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f163942v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Integer f163943w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f163944x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f163945y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ String f163946z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p(t tVar, List<Integer> list, List<? extends HotelBookingFormItem> list2, String str, Integer num, String str2, String str3, String str4, String str5, Continuation<? super p> continuation) {
        super(2, continuation);
        this.f163939s = tVar;
        this.f163940t = list;
        this.f163941u = list2;
        this.f163942v = str;
        this.f163943w = num;
        this.f163944x = str2;
        this.f163945y = str3;
        this.f163946z = str4;
        this.f163936A = str5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        p pVar = new p(this.f163939s, this.f163940t, this.f163941u, this.f163942v, this.f163943w, this.f163944x, this.f163945y, this.f163946z, this.f163936A, continuation);
        pVar.f163938r = obj;
        return pVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super HotelBookingInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((p) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c3  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.hotel_booking.mvi.p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
