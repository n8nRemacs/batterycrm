package com.avito.android.safedeal.universal_delivery_type.courier.select_location;

import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.UniversalDeliveryCourierLocationSelectLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.delivery_location_suggest.DeliveryLocationSuggestParams;
import com.avito.android.delivery_location_suggest.h;
import ev.AbstractC40161a;
import hj.AbstractC40946b;
import hj.InterfaceC40947c;
import javax.inject.Inject;
import kotlin.Metadata;
import sv.C48421d;

/* compiled from: UniversalDeliveryCourierLocationSelectDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/safedeal/universal_delivery_type/courier/select_location/a;", "Lev/a;", "Lcom/avito/android/deep_linking/links/UniversalDeliveryCourierLocationSelectLink;", "a", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a extends AbstractC40161a<UniversalDeliveryCourierLocationSelectLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.b f256556f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f256557g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final Context f256558h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final h f256559i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f256560j = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: UniversalDeliveryCourierLocationSelectDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/safedeal/universal_delivery_type/courier/select_location/a$a;", "LJu/c$b;", "Lhj/c;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.safedeal.universal_delivery_type.courier.select_location.a$a, reason: collision with other inner class name */
    public static final /* data */ class C7685a implements InterfaceC14249c.b, InterfaceC40947c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AbstractC40946b.c f256561b;

        public C7685a(@k AbstractC40946b.c cVar) {
            this.f256561b = cVar;
        }

        @Override // hj.InterfaceC40947c
        @k
        public final AbstractC40946b a() {
            return this.f256561b;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C7685a) && this.f256561b.equals(((C7685a) obj).f256561b);
        }

        public final int hashCode() {
            return this.f256561b.hashCode();
        }

        @k
        public final String toString() {
            return "LocationSelectedResult(beduinDeeplinkResult=" + this.f256561b + ')';
        }
    }

    @Inject
    public a(@k a.b bVar, @k a.InterfaceC4053a interfaceC4053a, @k Context context, @k h hVar) {
        this.f256556f = bVar;
        this.f256557g = interfaceC4053a;
        this.f256558h = context;
        this.f256559i = hVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        UniversalDeliveryCourierLocationSelectLink universalDeliveryCourierLocationSelectLink = (UniversalDeliveryCourierLocationSelectLink) deepLink;
        io.reactivex.rxjava3.disposables.c cVar = this.f256560j;
        cVar.e();
        this.f256557g.J(this.f256559i.a(this.f256558h, new DeliveryLocationSuggestParams.ItemLocationId(universalDeliveryCourierLocationSelectLink.f133744b, universalDeliveryCourierLocationSelectLink.f133745c)), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
        cVar.b(this.f256556f.Q().N(new b(this)).d0(new c(this, universalDeliveryCourierLocationSelectLink)).t0(new d(this)));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f256560j.e();
    }
}
