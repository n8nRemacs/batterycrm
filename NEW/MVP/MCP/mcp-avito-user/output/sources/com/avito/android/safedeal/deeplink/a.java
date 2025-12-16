package com.avito.android.safedeal.deeplink;

import Y61.k;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.DeliveryCourierLocationSelectLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.publish.FlowType;
import com.avito.android.publish.PublishIntentFactory;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.safedeal.deeplink.d;
import com.avito.android.suggest_locations.InterfaceC35139d;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import l41.g;
import l41.r;
import okhttp3.internal.http2.Http2;
import rv.C47918a;
import sv.C48421d;

/* compiled from: DeliveryCourierLocationSelectLinkDeeplinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/safedeal/deeplink/a;", "Lev/a;", "Lcom/avito/android/deep_linking/links/DeliveryCourierLocationSelectLink;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a extends AbstractC40161a<DeliveryCourierLocationSelectLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.b f256026f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f256027g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final InterfaceC35139d f256028h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final PublishIntentFactory f256029i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f256030j = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: DeliveryCourierLocationSelectLinkDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.safedeal.deeplink.a$a, reason: collision with other inner class name */
    public static final class C7665a<T> implements r {
        public C7665a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(a.this);
        }
    }

    /* compiled from: DeliveryCourierLocationSelectLinkDeeplinkHandler.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            Intent intent = ((C47918a) obj).f437157c;
            if (intent != null) {
            }
            a.this.j(new d.a());
        }
    }

    @Inject
    public a(@k a.b bVar, @k a.InterfaceC4053a interfaceC4053a, @k InterfaceC35139d interfaceC35139d, @k PublishIntentFactory publishIntentFactory) {
        this.f256026f = bVar;
        this.f256027g = interfaceC4053a;
        this.f256028h = interfaceC35139d;
        this.f256029i = publishIntentFactory;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        AddressParameter.Value value;
        Intent intentG;
        if (bundle != null) {
            value = (AddressParameter.Value) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle.getParcelable(AddressParameter.TYPE, AddressParameter.Value.class) : bundle.getParcelable(AddressParameter.TYPE));
        } else {
            value = null;
        }
        if (L.f(bundle != null ? bundle.getString("location_picker_mode") : null, "location_picker_mode_suggestion")) {
            String text = value != null ? value.getText() : null;
            if (text == null) {
                text = "";
            }
            intentG = this.f256028h.a(null, null, null, text, PublishIntentFactory.LocationPickerChooseButtonLocation.f231992c, null, (32576 & 64) != 0 ? PublishIntentFactory.SuggestLocationsFlowType.Default.f231995b : null, (32576 & 128) != 0 ? null : null, (32576 & 256) != 0 ? null : null, (32576 & 2048) != 0 ? null : null, (32576 & 8192) != 0 ? null : null, (32576 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : Boolean.TRUE);
        } else {
            intentG = this.f256029i.g((2046 & 1) != 0 ? null : value, (2046 & 4) != 0 ? null : null, (2046 & 8) != 0 ? null : null, (2046 & 16) != 0 ? PublishIntentFactory.LocationPickerChooseButtonLocation.f231991b : PublishIntentFactory.LocationPickerChooseButtonLocation.f231992c, (2046 & 32) != 0 ? null : null, (2046 & 64) != 0 ? null : null, (2046 & 128) != 0 ? null : null, (2046 & 256) == 0, (2046 & 1024) != 0 ? null : null, FlowType.f231902b);
        }
        this.f256027g.J(intentG, C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f256030j.b(this.f256026f.Q().N(new C7665a()).t0(new b()));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f256030j.e();
    }
}
