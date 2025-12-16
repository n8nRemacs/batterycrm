package com.avito.android.hotel_available_rooms.mvi;

import Ju.InterfaceC14249c;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.CalendarLink;
import com.avito.android.guests_selector.b;
import com.avito.android.guests_selector.io.GuestsSelectorChildOutput;
import com.avito.android.hotel_available_rooms.HotelAvailableRoomsOpenParams;
import com.avito.android.hotel_available_rooms.di.A;
import com.avito.android.hotel_available_rooms.domain.models.HotelDateFilter;
import com.avito.android.hotel_available_rooms.domain.models.HotelFilters;
import com.avito.android.hotel_available_rooms.domain.models.HotelGuestFilter;
import com.avito.android.hotel_available_rooms.mvi.entity.HotelAvailableRoomsInternalAction;
import com.avito.android.remote.error.ApiError;
import com.avito.android.util.R0;
import com.yandex.metrica.YandexMetricaDefaultValues;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.channels.I0;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: HotelAvailableRoomsInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_available_rooms/mvi/l;", "Lcom/avito/android/hotel_available_rooms/mvi/k;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final SimpleDateFormat f163158a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ZI.a f163159b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.hotel_available_rooms.domain.converters.d f163160c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final R0 f163161d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final GI.a f163162e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public N0 f163163f;

    /* compiled from: HotelAvailableRoomsInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/hotel_available_rooms/mvi/entity/HotelAvailableRoomsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.hotel_available_rooms.mvi.HotelAvailableRoomsInteractorImpl$handleDeeplinkResult$1", f = "HotelAvailableRoomsInteractor.kt", i = {0, 0, 1, 1}, l = {120, 130, 138}, m = "invokeSuspend", n = {"$this$flow", "dateFilter", "$this$flow", "guestFilter"}, s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super HotelAvailableRoomsInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public Parcelable f163164q;

        /* renamed from: r, reason: collision with root package name */
        public int f163165r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f163166s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ InterfaceC14249c f163167t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ l f163168u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ HotelFilters f163169v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f163170w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC14249c interfaceC14249c, l lVar, HotelFilters hotelFilters, String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f163167t = interfaceC14249c;
            this.f163168u = lVar;
            this.f163169v = hotelFilters;
            this.f163170w = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f163167t, this.f163168u, this.f163169v, this.f163170w, continuation);
            aVar.f163166s = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super HotelAvailableRoomsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            HotelGuestFilter hotelGuestFilter;
            InterfaceC43172j interfaceC43172j2;
            HotelDateFilter hotelDateFilter;
            HotelFilters hotelFiltersA;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f163165r;
            l lVar = this.f163168u;
            HotelFilters hotelFilters = this.f163169v;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j3 = (InterfaceC43172j) this.f163166s;
                InterfaceC14249c interfaceC14249c = this.f163167t;
                if (interfaceC14249c instanceof CalendarLink.b.C3988b) {
                    CalendarLink.b.C3988b c3988b = (CalendarLink.b.C3988b) interfaceC14249c;
                    String str = lVar.f163158a.format(c3988b.f133080b);
                    String str2 = lVar.f163158a.format(c3988b.f133081c);
                    HotelDateFilter hotelDateFilter2 = hotelFilters.f162795c;
                    if (hotelDateFilter2 == null) {
                        hotelDateFilter2 = new HotelDateFilter(null, null, null, 7, null);
                    }
                    HotelDateFilter hotelDateFilter3 = new HotelDateFilter(str, str2, hotelDateFilter2.f162793d);
                    HotelAvailableRoomsInternalAction.UpdateDateFilter updateDateFilter = new HotelAvailableRoomsInternalAction.UpdateDateFilter(hotelDateFilter3);
                    this.f163166s = interfaceC43172j3;
                    this.f163164q = hotelDateFilter3;
                    this.f163165r = 1;
                    if (interfaceC43172j3.emit(updateDateFilter, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    interfaceC43172j2 = interfaceC43172j3;
                    hotelDateFilter = hotelDateFilter3;
                    hotelFiltersA = HotelFilters.a(hotelFilters, null, hotelDateFilter, 1);
                } else {
                    if (!(interfaceC14249c instanceof b.C4726b)) {
                        return G0.f406611a;
                    }
                    HotelGuestFilter hotelGuestFilter2 = hotelFilters.f162794b;
                    if (hotelGuestFilter2 == null) {
                        hotelGuestFilter2 = new HotelGuestFilter(null, null, null, null, null, null, 63, null);
                    }
                    b.C4726b c4726b = (b.C4726b) interfaceC14249c;
                    Integer numBoxInt = Boxing.boxInt(c4726b.f161391b.f161448b);
                    List<GuestsSelectorChildOutput> list = c4726b.f161391b.f161449c;
                    ArrayList arrayList = new ArrayList();
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        Integer numY0 = C43066x.y0(((GuestsSelectorChildOutput) it.next()).f161446b);
                        if (numY0 != null) {
                            arrayList.add(numY0);
                        }
                    }
                    HotelGuestFilter hotelGuestFilter3 = new HotelGuestFilter(hotelGuestFilter2.f162796b, hotelGuestFilter2.f162797c, hotelGuestFilter2.f162798d, hotelGuestFilter2.f162799e, numBoxInt, arrayList);
                    HotelAvailableRoomsInternalAction.UpdateGuestFilter updateGuestFilter = new HotelAvailableRoomsInternalAction.UpdateGuestFilter(hotelGuestFilter3);
                    this.f163166s = interfaceC43172j3;
                    this.f163164q = hotelGuestFilter3;
                    this.f163165r = 2;
                    if (interfaceC43172j3.emit(updateGuestFilter, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    interfaceC43172j = interfaceC43172j3;
                    hotelGuestFilter = hotelGuestFilter3;
                    hotelFiltersA = HotelFilters.a(hotelFilters, hotelGuestFilter, null, 2);
                    interfaceC43172j2 = interfaceC43172j;
                }
            } else if (i12 == 1) {
                hotelDateFilter = (HotelDateFilter) this.f163164q;
                interfaceC43172j2 = (InterfaceC43172j) this.f163166s;
                C42729a0.b(obj);
                hotelFiltersA = HotelFilters.a(hotelFilters, null, hotelDateFilter, 1);
            } else {
                if (i12 != 2) {
                    if (i12 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                hotelGuestFilter = (HotelGuestFilter) this.f163164q;
                interfaceC43172j = (InterfaceC43172j) this.f163166s;
                C42729a0.b(obj);
                hotelFiltersA = HotelFilters.a(hotelFilters, hotelGuestFilter, null, 2);
                interfaceC43172j2 = interfaceC43172j;
            }
            InterfaceC43160i<HotelAvailableRoomsInternalAction> interfaceC43160iB = lVar.b(this.f163170w, hotelFiltersA);
            this.f163166s = null;
            this.f163164q = null;
            this.f163165r = 3;
            if (C43175k.u(this, interfaceC43160iB, interfaceC43172j2) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: HotelAvailableRoomsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/hotel_available_rooms/mvi/entity/HotelAvailableRoomsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.hotel_available_rooms.mvi.HotelAvailableRoomsInteractorImpl$initialize$1", f = "HotelAvailableRoomsInteractor.kt", i = {0, 0}, l = {73, 80}, m = "invokeSuspend", n = {"$this$flow", "filters"}, s = {"L$0", "L$1"})
    public static final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super HotelAvailableRoomsInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public HotelFilters f163171q;

        /* renamed from: r, reason: collision with root package name */
        public int f163172r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f163173s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ HotelAvailableRoomsOpenParams f163174t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ l f163175u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(HotelAvailableRoomsOpenParams hotelAvailableRoomsOpenParams, l lVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f163174t = hotelAvailableRoomsOpenParams;
            this.f163175u = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(this.f163174t, this.f163175u, continuation);
            bVar.f163173s = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super HotelAvailableRoomsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            HotelFilters hotelFilters;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f163172r;
            HotelAvailableRoomsOpenParams hotelAvailableRoomsOpenParams = this.f163174t;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j2 = (InterfaceC43172j) this.f163173s;
                Integer num = null;
                Integer num2 = null;
                HotelFilters hotelFilters2 = new HotelFilters(new HotelGuestFilter(num, num2, null, null, Boxing.boxInt(hotelAvailableRoomsOpenParams.f162664e), hotelAvailableRoomsOpenParams.f162666g, 15, null), new HotelDateFilter(hotelAvailableRoomsOpenParams.f162662c, hotelAvailableRoomsOpenParams.f162663d, null, 4, null));
                HotelAvailableRoomsInternalAction.Init init = new HotelAvailableRoomsInternalAction.Init(hotelAvailableRoomsOpenParams.f162661b, hotelFilters2);
                this.f163173s = interfaceC43172j2;
                this.f163171q = hotelFilters2;
                this.f163172r = 1;
                if (interfaceC43172j2.emit(init, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                interfaceC43172j = interfaceC43172j2;
                hotelFilters = hotelFilters2;
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                hotelFilters = this.f163171q;
                interfaceC43172j = (InterfaceC43172j) this.f163173s;
                C42729a0.b(obj);
            }
            InterfaceC43160i<HotelAvailableRoomsInternalAction> interfaceC43160iB = this.f163175u.b(hotelAvailableRoomsOpenParams.f162661b, hotelFilters);
            this.f163173s = null;
            this.f163171q = null;
            this.f163172r = 2;
            if (C43175k.u(this, interfaceC43160iB, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: HotelAvailableRoomsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/I0;", "Lcom/avito/android/hotel_available_rooms/mvi/entity/HotelAvailableRoomsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.hotel_available_rooms.mvi.HotelAvailableRoomsInteractorImpl$loadAvailableRooms$1", f = "HotelAvailableRoomsInteractor.kt", i = {}, l = {YandexMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.p<I0<? super HotelAvailableRoomsInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f163176q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f163177r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f163179t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ HotelFilters f163180u;

        /* compiled from: HotelAvailableRoomsInteractor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.hotel_available_rooms.mvi.HotelAvailableRoomsInteractorImpl$loadAvailableRooms$1$1", f = "HotelAvailableRoomsInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f163181q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ l f163182r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ String f163183s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ HotelFilters f163184t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ I0<HotelAvailableRoomsInternalAction> f163185u;

            /* compiled from: HotelAvailableRoomsInteractor.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.hotel_available_rooms.mvi.l$c$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C4769a extends H implements Y41.p<HotelAvailableRoomsInternalAction, Continuation<? super G0>, Object>, SuspendFunction {
                @Override // Y41.p
                public final Object invoke(HotelAvailableRoomsInternalAction hotelAvailableRoomsInternalAction, Continuation<? super G0> continuation) {
                    return ((I0) this.receiver).send(hotelAvailableRoomsInternalAction, continuation);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(l lVar, String str, HotelFilters hotelFilters, I0<? super HotelAvailableRoomsInternalAction> i02, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f163182r = lVar;
                this.f163183s = str;
                this.f163184t = hotelFilters;
                this.f163185u = i02;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f163182r, this.f163183s, this.f163184t, this.f163185u, continuation);
                aVar.f163181q = obj;
                return aVar;
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                List<Integer> list;
                Integer num;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                T t12 = (T) this.f163181q;
                l lVar = this.f163182r;
                N0 n02 = lVar.f163163f;
                ArrayList arrayList = null;
                if (n02 != null) {
                    n02.c(null);
                }
                HotelFilters hotelFilters = this.f163184t;
                HotelDateFilter hotelDateFilter = hotelFilters.f162795c;
                String str = hotelDateFilter != null ? hotelDateFilter.f162791b : null;
                String str2 = hotelDateFilter != null ? hotelDateFilter.f162792c : null;
                HotelGuestFilter hotelGuestFilter = hotelFilters.f162794b;
                Long lValueOf = (hotelGuestFilter == null || (num = hotelGuestFilter.f162800f) == null) ? null : Long.valueOf(num.intValue());
                if (hotelGuestFilter != null && (list = hotelGuestFilter.f162801g) != null) {
                    List<Integer> list2 = list;
                    arrayList = new ArrayList(C42745f0.q(list2, 10));
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Long.valueOf(((Number) it.next()).intValue()));
                    }
                }
                ArrayList arrayList2 = arrayList;
                String str3 = this.f163183s;
                lVar.f163163f = C43175k.K(new C43197r1(new C4769a(2, this.f163185u, I0.class, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0), (str3 == null || str == null || str2 == null || lValueOf == null) ? new C43210w(new HotelAvailableRoomsInternalAction.ContentError(new ApiError.Failure("params and itemId is required"))) : C43175k.I(lVar.f163161d.a(), C43175k.G(new m(lVar, str3, str, str2, arrayList2, lValueOf, null)))), t12);
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, HotelFilters hotelFilters, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f163179t = str;
            this.f163180u = hotelFilters;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = l.this.new c(this.f163179t, this.f163180u, continuation);
            cVar.f163177r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(I0<? super HotelAvailableRoomsInternalAction> i02, Continuation<? super G0> continuation) {
            return ((c) create(i02, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f163176q;
            if (i12 == 0) {
                C42729a0.b(obj);
                a aVar = new a(l.this, this.f163179t, this.f163180u, (I0) this.f163177r, null);
                this.f163176q = 1;
                if (U.c(aVar, this) == coroutine_suspended) {
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

    /* compiled from: HotelAvailableRoomsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/hotel_available_rooms/mvi/entity/HotelAvailableRoomsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.hotel_available_rooms.mvi.HotelAvailableRoomsInteractorImpl$loadAvailableRooms$2", f = "HotelAvailableRoomsInteractor.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super HotelAvailableRoomsInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f163186q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f163187r;

        public d() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            d dVar = new d(2, continuation);
            dVar.f163187r = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super HotelAvailableRoomsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f163186q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f163187r;
                HotelAvailableRoomsInternalAction.ContentLoading contentLoading = new HotelAvailableRoomsInternalAction.ContentLoading();
                this.f163186q = 1;
                if (interfaceC43172j.emit(contentLoading, this) == coroutine_suspended) {
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

    @Inject
    public l(@Y61.k @A SimpleDateFormat simpleDateFormat, @Y61.k ZI.a aVar, @Y61.k com.avito.android.hotel_available_rooms.domain.converters.d dVar, @Y61.k R0 r02, @Y61.k GI.a aVar2) {
        this.f163158a = simpleDateFormat;
        this.f163159b = aVar;
        this.f163160c = dVar;
        this.f163161d = r02;
        this.f163162e = aVar2;
    }

    @Override // com.avito.android.hotel_available_rooms.mvi.k
    @Y61.k
    public final InterfaceC43160i<HotelAvailableRoomsInternalAction> a(@Y61.l String str, @Y61.k InterfaceC14249c interfaceC14249c, @Y61.l String str2, @Y61.k HotelFilters hotelFilters) {
        return !L.f(str, "hotel_available_rooms_filters_request_key") ? C43175k.w() : C43175k.G(new a(interfaceC14249c, this, hotelFilters, str2, null));
    }

    @Override // com.avito.android.hotel_available_rooms.mvi.k
    @Y61.k
    public final InterfaceC43160i<HotelAvailableRoomsInternalAction> b(@Y61.l String str, @Y61.k HotelFilters hotelFilters) {
        return C43175k.I(this.f163161d.a(), new C43137a0(new d(2, null), C43175k.h(new c(str, hotelFilters, null))));
    }

    @Override // com.avito.android.hotel_available_rooms.mvi.k
    @Y61.k
    public final InterfaceC43160i<HotelAvailableRoomsInternalAction> c(@Y61.k HotelAvailableRoomsOpenParams hotelAvailableRoomsOpenParams) {
        return C43175k.G(new b(hotelAvailableRoomsOpenParams, this, null));
    }
}
