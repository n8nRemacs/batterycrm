package com.avito.android.hotel_booking.deeplink.enter_data;

import Y41.p;
import Y61.k;
import Y61.l;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.hotel_booking.EnterData;
import com.avito.android.hotel_booking.Group;
import com.avito.android.hotel_booking.HotelBookingEnterDataDeeplink;
import com.avito.android.hotel_booking.enter_data.EnterDataFragment;
import com.avito.android.hotel_booking.enter_data.EnterDataOpenParams;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.util.R0;
import ev.AbstractC40161a;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.rx3.y;
import rv.C47919b;

/* compiled from: HotelBookingEnterDataDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/hotel_booking/deeplink/enter_data/a;", "Lev/a;", "Lcom/avito/android/hotel_booking/HotelBookingEnterDataDeeplink;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a extends AbstractC40161a<HotelBookingEnterDataDeeplink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.d f163304f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.f f163305g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final C43238h f163306h;

    /* compiled from: HotelBookingEnterDataDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/b;", "result", "Lkotlin/G0;", "<anonymous>", "(Lrv/b;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.hotel_booking.deeplink.enter_data.HotelBookingEnterDataDeeplinkHandler$onCreate$1", f = "HotelBookingEnterDataDeeplinkHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.hotel_booking.deeplink.enter_data.a$a, reason: collision with other inner class name */
    public static final class C4778a extends SuspendLambda implements p<C47919b, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f163307q;

        public C4778a(Continuation<? super C4778a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C4778a c4778a = a.this.new C4778a(continuation);
            c4778a.f163307q = obj;
            return c4778a;
        }

        @Override // Y41.p
        public final Object invoke(C47919b c47919b, Continuation<? super G0> continuation) {
            return ((C4778a) create(c47919b, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            ArrayList parcelableArrayList = ((C47919b) this.f163307q).f437159b.getParcelableArrayList("enter_data_result_key");
            a aVar = a.this;
            if (parcelableArrayList != null) {
                aVar.j(new HotelBookingEnterDataDeeplink.b.a(parcelableArrayList));
            } else {
                aVar.j(HotelBookingEnterDataDeeplink.b.C4774b.f163249b);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public a(@k a.d dVar, @k a.f fVar, @k R0 r02) {
        this.f163304f = dVar;
        this.f163305g = fVar;
        this.f163306h = U.a(r02.b());
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        EnterDataFragment.a aVar = EnterDataFragment.f163474n0;
        EnterData enterData = ((HotelBookingEnterDataDeeplink) deepLink).f163247b;
        String title = enterData.getTitle();
        ParametrizedEvent onTextChangeEvent = enterData.getOnTextChangeEvent();
        List<Group> groups = enterData.getGroups();
        aVar.getClass();
        EnterDataFragment enterDataFragment = new EnterDataFragment();
        EnterDataOpenParams enterDataOpenParams = new EnterDataOpenParams(title, onTextChangeEvent, groups);
        enterDataFragment.f163481m0.setValue(enterDataFragment, EnterDataFragment.f163475o0[0], enterDataOpenParams);
        this.f163304f.w1(enterDataFragment, "enterData");
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        C43175k.K(new C43197r1(new C4778a(null), y.a(this.f163305g.l1("enterData"))), this.f163306h);
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        U.b(this.f163306h, null);
    }
}
