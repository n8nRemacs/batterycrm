package com.avito.android.hotel_booking.deeplink.select_radio;

import Y41.p;
import Y61.k;
import Y61.l;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.hotel_booking.HotelBookingSelectRadioDeeplink;
import com.avito.android.hotel_booking.RadioGroup;
import com.avito.android.hotel_booking.RadioItem;
import com.avito.android.hotel_booking.select_radio.SelectRadioFragment;
import com.avito.android.hotel_booking.select_radio.SelectRadioOpenParams;
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

/* compiled from: HotelBookingSelectRadioDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/hotel_booking/deeplink/select_radio/a;", "Lev/a;", "Lcom/avito/android/hotel_booking/HotelBookingSelectRadioDeeplink;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a extends AbstractC40161a<HotelBookingSelectRadioDeeplink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.d f163315f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.f f163316g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final C43238h f163317h;

    /* compiled from: HotelBookingSelectRadioDeeplinkHandler.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/b;", "result", "Lkotlin/G0;", "<anonymous>", "(Lrv/b;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.hotel_booking.deeplink.select_radio.HotelBookingSelectRadioDeeplinkHandler$onCreate$1", f = "HotelBookingSelectRadioDeeplinkHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.hotel_booking.deeplink.select_radio.a$a, reason: collision with other inner class name */
    public static final class C4779a extends SuspendLambda implements p<C47919b, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f163318q;

        public C4779a(Continuation<? super C4779a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C4779a c4779a = a.this.new C4779a(continuation);
            c4779a.f163318q = obj;
            return c4779a;
        }

        @Override // Y41.p
        public final Object invoke(C47919b c47919b, Continuation<? super G0> continuation) {
            return ((C4779a) create(c47919b, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            Bundle bundle = ((C47919b) this.f163318q).f437159b;
            RadioItem radioItem = (RadioItem) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle.getParcelable("select_radio_result_key", RadioItem.class) : bundle.getParcelable("select_radio_result_key"));
            a aVar = a.this;
            if (radioItem != null) {
                aVar.j(new HotelBookingSelectRadioDeeplink.b.a(radioItem));
            } else {
                aVar.j(HotelBookingSelectRadioDeeplink.b.C4775b.f163259b);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public a(@k a.d dVar, @k a.f fVar, @k R0 r02) {
        this.f163315f = dVar;
        this.f163316g = fVar;
        this.f163317h = U.a(r02.b());
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        SelectRadioFragment.a aVar = SelectRadioFragment.f163976n0;
        RadioGroup radioGroup = ((HotelBookingSelectRadioDeeplink) deepLink).f163257b;
        String title = radioGroup.getTitle();
        ParametrizedEvent onClickEvent = radioGroup.getOnClickEvent();
        List<RadioItem> items = radioGroup.getItems();
        aVar.getClass();
        SelectRadioFragment selectRadioFragment = new SelectRadioFragment();
        SelectRadioOpenParams selectRadioOpenParams = new SelectRadioOpenParams(title, onClickEvent, items);
        selectRadioFragment.f163983m0.setValue(selectRadioFragment, SelectRadioFragment.f163977o0[0], selectRadioOpenParams);
        this.f163315f.w1(selectRadioFragment, "select_radio_key");
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        C43175k.K(new C43197r1(new C4779a(null), y.a(this.f163316g.l1("select_radio_key"))), this.f163317h);
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        U.b(this.f163317h, null);
    }
}
