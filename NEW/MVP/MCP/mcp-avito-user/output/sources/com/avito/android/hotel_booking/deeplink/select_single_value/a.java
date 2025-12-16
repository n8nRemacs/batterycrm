package com.avito.android.hotel_booking.deeplink.select_single_value;

import Y41.p;
import Y61.k;
import Y61.l;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.hotel_booking.HotelBookingSelectSingleValueDeeplink;
import com.avito.android.hotel_booking.SelectValueData;
import com.avito.android.hotel_booking.Value;
import com.avito.android.hotel_booking.select_single_value.SelectSingleValueFragment;
import com.avito.android.hotel_booking.select_single_value.SelectSingleValueOpenParams;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.util.R0;
import ev.AbstractC40161a;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.rx3.y;
import rv.C47919b;

/* compiled from: HotelBookingSelectSingleValueDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/hotel_booking/deeplink/select_single_value/a;", "Lev/a;", "Lcom/avito/android/hotel_booking/HotelBookingSelectSingleValueDeeplink;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a extends AbstractC40161a<HotelBookingSelectSingleValueDeeplink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.d f163325f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.f f163326g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final C43238h f163327h;

    /* compiled from: HotelBookingSelectSingleValueDeeplinkHandler.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/b;", "result", "Lkotlin/G0;", "<anonymous>", "(Lrv/b;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.hotel_booking.deeplink.select_single_value.HotelBookingSelectSingleValueDeeplinkHandler$onCreate$1", f = "HotelBookingSelectSingleValueDeeplinkHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.hotel_booking.deeplink.select_single_value.a$a, reason: collision with other inner class name */
    public static final class C4780a extends SuspendLambda implements p<C47919b, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f163328q;

        public C4780a(Continuation<? super C4780a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C4780a c4780a = a.this.new C4780a(continuation);
            c4780a.f163328q = obj;
            return c4780a;
        }

        @Override // Y41.p
        public final Object invoke(C47919b c47919b, Continuation<? super G0> continuation) {
            return ((C4780a) create(c47919b, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            Bundle bundle = ((C47919b) this.f163328q).f437159b;
            Value value = (Value) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle.getParcelable("result_key", Value.class) : bundle.getParcelable("result_key"));
            a aVar = a.this;
            if (value != null) {
                aVar.j(new HotelBookingSelectSingleValueDeeplink.b.a(value));
            } else {
                aVar.j(HotelBookingSelectSingleValueDeeplink.b.C4776b.f163262b);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public a(@k a.d dVar, @k a.f fVar, @k R0 r02) {
        this.f163325f = dVar;
        this.f163326g = fVar;
        this.f163327h = U.a(r02.b());
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        SelectSingleValueFragment.a aVar = SelectSingleValueFragment.f164053n0;
        SelectValueData selectValueData = ((HotelBookingSelectSingleValueDeeplink) deepLink).f163260b;
        String title = selectValueData.getTitle();
        ParametrizedEvent onClickEvent = selectValueData.getOnClickEvent();
        List<Value> listD = selectValueData.d();
        aVar.getClass();
        SelectSingleValueFragment selectSingleValueFragment = new SelectSingleValueFragment();
        SelectSingleValueOpenParams selectSingleValueOpenParams = new SelectSingleValueOpenParams(title, onClickEvent, listD);
        selectSingleValueFragment.f164060m0.setValue(selectSingleValueFragment, SelectSingleValueFragment.f164054o0[0], selectSingleValueOpenParams);
        this.f163325f.w1(selectSingleValueFragment, "selectSingleValue");
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        C43175k.K(new C43197r1(new C4780a(null), y.a(this.f163326g.l1("selectSingleValue"))), this.f163327h);
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        U.b(this.f163327h, null);
    }
}
