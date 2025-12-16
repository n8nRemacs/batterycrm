package com.avito.android.safedeal.universal_delivery_type;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.UniversalDeliveryTypeDeeplink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.safedeal.universal_delivery_type.ReloadReason;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import l41.r;
import rv.C47918a;
import sv.C48421d;

/* compiled from: UniversalDeliveryTypeDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/safedeal/universal_delivery_type/i;", "Lev/a;", "Lcom/avito/android/deep_linking/links/UniversalDeliveryTypeDeeplink;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i extends AbstractC40161a<UniversalDeliveryTypeDeeplink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Context f256628f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f256629g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.b f256630h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f256631i = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: UniversalDeliveryTypeDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements r {
        public a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(i.this);
        }
    }

    /* compiled from: UniversalDeliveryTypeDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "screenResult", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            i.this.j(new xv.g(xv.f.a(((C47918a) obj).f437157c)));
        }
    }

    @Inject
    public i(@Y61.k Context context, @Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k a.b bVar) {
        this.f256628f = context;
        this.f256629g = interfaceC4053a;
        this.f256630h = bVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        UniversalDeliveryTypeDeeplink universalDeliveryTypeDeeplink = (UniversalDeliveryTypeDeeplink) deepLink;
        ReloadReason.a aVar = ReloadReason.f256398b;
        String str2 = universalDeliveryTypeDeeplink.f133755i;
        aVar.getClass();
        ReloadReason reloadReasonA = ReloadReason.a.a(str2);
        UniversalDeliveryTypeParams universalDeliveryTypeParams = new UniversalDeliveryTypeParams(universalDeliveryTypeDeeplink.f133748b, universalDeliveryTypeDeeplink.f133749c, universalDeliveryTypeDeeplink.f133750d, universalDeliveryTypeDeeplink.f133751e, universalDeliveryTypeDeeplink.f133752f, universalDeliveryTypeDeeplink.f133753g, universalDeliveryTypeDeeplink.f133754h, null, reloadReasonA);
        UniversalDeliveryTypeActivity.f256401C.getClass();
        this.f256629g.J(new Intent(this.f256628f, (Class<?>) UniversalDeliveryTypeActivity.class).putExtra("extra_params", universalDeliveryTypeParams), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f256631i.b(this.f256630h.Q().N(new a()).t0(new b()));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f256631i.e();
    }
}
