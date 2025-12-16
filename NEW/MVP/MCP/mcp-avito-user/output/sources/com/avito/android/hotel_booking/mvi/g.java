package com.avito.android.hotel_booking.mvi;

import RI.b;
import com.avito.android.arch.mvi.a;
import com.avito.android.hotel.model.HotelBookingFormItem;
import com.avito.android.hotel.model.HotelBookingFormResponse;
import com.avito.android.hotel_booking.mvi.entity.HotelBookingInternalAction;
import com.avito.android.hotel_booking.mvi.entity.HotelBookingState;
import com.avito.android.util.O2;
import com.facebook.imageutils.JfifUtil;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: HotelBookingActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/hotel_booking/mvi/g;", "Lcom/avito/android/arch/mvi/a;", "LRI/b;", "Lcom/avito/android/hotel_booking/mvi/entity/HotelBookingInternalAction;", "Lcom/avito/android/hotel_booking/mvi/entity/HotelBookingState;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g implements com.avito.android.arch.mvi.a<RI.b, HotelBookingInternalAction, HotelBookingState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final t f163899a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final MI.a f163900b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.hotel_booking.domain.j f163901c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.hotel_booking.domain.d f163902d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.hotel_booking.domain.a f163903e;

    /* compiled from: HotelBookingActor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/hotel_booking/mvi/entity/HotelBookingInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.hotel_booking.mvi.HotelBookingActor$updateParameter$1", f = "HotelBookingActor.kt", i = {0, 1, 1}, l = {210, JfifUtil.MARKER_SOI, 223}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "newItems"}, s = {"L$0", "L$0", "L$1"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super HotelBookingInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public List f163904q;

        /* renamed from: r, reason: collision with root package name */
        public int f163905r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f163906s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f163907t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ HotelBookingState f163908u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ T f163909v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ g f163910w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, HotelBookingState hotelBookingState, T t12, g gVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f163907t = str;
            this.f163908u = hotelBookingState;
            this.f163909v = t12;
            this.f163910w = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f163907t, this.f163908u, this.f163909v, this.f163910w, continuation);
            aVar.f163906s = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super HotelBookingInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:43:0x0091  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x00d3  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x00f6  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x0104  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0107  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x00f1 A[SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 292
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.hotel_booking.mvi.g.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public g(@Y61.k t tVar, @Y61.k MI.a aVar, @Y61.k com.avito.android.hotel_booking.domain.j jVar, @Y61.k com.avito.android.hotel_booking.domain.d dVar, @Y61.k com.avito.android.hotel_booking.domain.a aVar2) {
        this.f163899a = tVar;
        this.f163900b = aVar;
        this.f163901c = jVar;
        this.f163902d = dVar;
        this.f163903e = aVar2;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<HotelBookingInternalAction> b(RI.b bVar, HotelBookingState hotelBookingState) {
        InterfaceC43160i<HotelBookingInternalAction> c43210w;
        RI.b bVar2 = bVar;
        HotelBookingState hotelBookingState2 = hotelBookingState;
        if (bVar2 instanceof b.C0948b) {
            return new C43210w(HotelBookingInternalAction.CloseScreen.f163852b);
        }
        if (bVar2 instanceof b.n) {
            return c(hotelBookingState2, null);
        }
        if (bVar2 instanceof b.f) {
            return C43175k.G(new C30802c(hotelBookingState2, (b.f) bVar2, null));
        }
        if (bVar2 instanceof b.d) {
            b.d dVar = (b.d) bVar2;
            return d(hotelBookingState2, dVar.f14270a, dVar.f14271b);
        }
        if (bVar2 instanceof b.i) {
            b.i iVar = (b.i) bVar2;
            return d(hotelBookingState2, iVar.f14277a, iVar.f14278b);
        }
        if (bVar2 instanceof b.h) {
            return C43175k.G(new d((b.h) bVar2, hotelBookingState2, this, null));
        }
        if (bVar2 instanceof b.e) {
            String str = hotelBookingState2.f163868b;
            if (str != null) {
                HotelBookingFormResponse.Form form = hotelBookingState2.f163875i;
                List<HotelBookingFormItem> items = form != null ? form.getItems() : null;
                if (items == null) {
                    items = C42784z0.f406748b;
                }
                List<HotelBookingFormItem> list = items;
                t tVar = this.f163899a;
                tVar.getClass();
                return new C43137a0(new q(2, null), C43175k.I(tVar.f163967e.a(), C43175k.G(new p(tVar, hotelBookingState2.f163870d, list, str, hotelBookingState2.f163869c, hotelBookingState2.f163871e, hotelBookingState2.f163872f, hotelBookingState2.f163873g, hotelBookingState2.f163874h, null))));
            }
            c43210w = C43175k.w();
        } else {
            if (bVar2 instanceof b.c) {
                return C43175k.G(new C30801b(hotelBookingState2, this, null));
            }
            if (bVar2 instanceof b.j) {
                c43210w = new C43210w(new HotelBookingInternalAction.ChangeKeyboardVisibility(((b.j) bVar2).f14279a));
            } else {
                if (bVar2 instanceof b.g) {
                    return C43175k.G(new C30800a((b.g) bVar2, this, hotelBookingState2, null));
                }
                if (!(bVar2 instanceof b.o)) {
                    if (bVar2 instanceof b.m) {
                        b.m mVar = (b.m) bVar2;
                        return d(hotelBookingState2, mVar.f14284a, mVar.f14285b);
                    }
                    if (bVar2 instanceof b.a) {
                        this.f163900b.q(((b.a) bVar2).f14267a);
                        return C43175k.w();
                    }
                    if (bVar2 instanceof b.k) {
                        return C43175k.G(new e(bVar2, this, hotelBookingState2, null));
                    }
                    if (bVar2 instanceof b.l) {
                        return C43175k.G(new f(bVar2, this, hotelBookingState2, null));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                c43210w = new C43210w(new HotelBookingInternalAction.ClickDeeplink(((b.o) bVar2).f14287a, h.f163911a));
            }
        }
        return c43210w;
    }

    public final InterfaceC43160i<HotelBookingInternalAction> c(HotelBookingState hotelBookingState, Map<String, String> map) {
        String str = hotelBookingState.f163868b;
        if (str == null) {
            return C43175k.w();
        }
        HotelBookingFormResponse.Form form = hotelBookingState.f163875i;
        if (map == null) {
            List<HotelBookingFormItem> items = form != null ? form.getItems() : null;
            if (items == null) {
                items = C42784z0.f406748b;
            }
            map = this.f163903e.a(items);
        }
        return this.f163899a.b(str, hotelBookingState.f163869c, hotelBookingState.f163870d, hotelBookingState.f163871e, hotelBookingState.f163872f, hotelBookingState.f163873g, hotelBookingState.f163874h, map, O2.a(form != null ? form.getItems() : null));
    }

    public final <T> InterfaceC43160i<HotelBookingInternalAction> d(HotelBookingState hotelBookingState, String str, T t12) {
        return C43175k.G(new a(str, hotelBookingState, t12, this, null));
    }
}
