package com.avito.android.advert.item.geo_distance;

import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.geo_distance.c;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.geo_distance.AdvertDetailsGeoDistance;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.K;
import java.util.Calendar;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.text.C43059p;
import kotlin.text.C43066x;
import x5.InterfaceC49771a;

/* compiled from: AdvertDetailsAddressGeoDistanceItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/geo_distance/g;", "Lcom/avito/android/advert/item/geo_distance/f;", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g implements f {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f75689b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.component.toast.util.c f75690c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final c f75691d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final m f75692e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC49771a f75693f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public volatile a f75694g = a.b.f75698a;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public volatile AdvertDetailsAddressGeoDistanceItem f75695h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public DF0.a f75696i;

    /* compiled from: AdvertDetailsAddressGeoDistanceItemPresenter.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/advert/item/geo_distance/g$a;", "", "<init>", "()V", "a", "b", "c", "d", "Lcom/avito/android/advert/item/geo_distance/g$a$a;", "Lcom/avito/android/advert/item/geo_distance/g$a$b;", "Lcom/avito/android/advert/item/geo_distance/g$a$c;", "Lcom/avito/android/advert/item/geo_distance/g$a$d;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a {

        /* compiled from: AdvertDetailsAddressGeoDistanceItemPresenter.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/geo_distance/g$a$a;", "Lcom/avito/android/advert/item/geo_distance/g$a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.advert.item.geo_distance.g$a$a, reason: collision with other inner class name */
        public static final class C2249a extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final AttributedText f75697a;

            public C2249a(@Y61.k AttributedText attributedText) {
                super(null);
                this.f75697a = attributedText;
            }
        }

        /* compiled from: AdvertDetailsAddressGeoDistanceItemPresenter.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/geo_distance/g$a$b;", "Lcom/avito/android/advert/item/geo_distance/g$a;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final b f75698a = new b();

            public b() {
                super(null);
            }

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 910942443;
            }

            @Y61.k
            public final String toString() {
                return "IDLE";
            }
        }

        /* compiled from: AdvertDetailsAddressGeoDistanceItemPresenter.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/geo_distance/g$a$c;", "Lcom/avito/android/advert/item/geo_distance/g$a;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final c f75699a = new c();

            public c() {
                super(null);
            }

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 1901962405;
            }

            @Y61.k
            public final String toString() {
                return "Loading";
            }
        }

        /* compiled from: AdvertDetailsAddressGeoDistanceItemPresenter.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/geo_distance/g$a$d;", "Lcom/avito/android/advert/item/geo_distance/g$a;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class d extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final d f75700a = new d();

            public d() {
                super(null);
            }

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return 322300101;
            }

            @Y61.k
            public final String toString() {
                return "NotExistRoutes";
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AdvertDetailsAddressGeoDistanceItemPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ DeepLink f75702m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(DeepLink deepLink) {
            super(0);
            this.f75702m = deepLink;
        }

        @Override // Y41.a
        public final G0 invoke() {
            b.a.a(g.this.f75689b, this.f75702m, null, null, 6);
            return G0.f406611a;
        }
    }

    @Inject
    public g(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.component.toast.util.c cVar, @Y61.k c cVar2, @Y61.k m mVar, @Y61.k InterfaceC49771a interfaceC49771a) {
        this.f75689b = aVar;
        this.f75690c = cVar;
        this.f75691d = cVar2;
        this.f75692e = mVar;
        this.f75693f = interfaceC49771a;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k kVar = (k) eVar;
        AdvertDetailsAddressGeoDistanceItem advertDetailsAddressGeoDistanceItem = (AdvertDetailsAddressGeoDistanceItem) aVar;
        this.f75693f.a(advertDetailsAddressGeoDistanceItem.f75668f);
        if (L.f(this.f75695h, advertDetailsAddressGeoDistanceItem) && !L.f(this.f75694g, a.b.f75698a)) {
            k(this.f75694g, kVar);
            return;
        }
        this.f75695h = advertDetailsAddressGeoDistanceItem;
        AttributedText attributedText = advertDetailsAddressGeoDistanceItem.f75666d.getAttributedText();
        AdvertDetailsGeoDistance.MeasureOnClientData measureOnClientData = advertDetailsAddressGeoDistanceItem.f75666d.getMeasureOnClientData();
        Coordinates coordinates = advertDetailsAddressGeoDistanceItem.f75667e;
        DF0.a aVar2 = this.f75696i;
        if (aVar2 != null) {
            aVar2.cancel();
        }
        if (attributedText != null) {
            this.f75693f.b(new InterfaceC49771a.C12844a(null, null, null, C43066x.z0(new C43059p("\\D").f(attributedText.getText(), "")), 7, null));
            a.C2249a c2249a = new a.C2249a(attributedText);
            this.f75694g = c2249a;
            k(c2249a, kVar);
            return;
        }
        if (measureOnClientData == null || coordinates == null) {
            a.d dVar = a.d.f75700a;
            this.f75694g = dVar;
            k(dVar, kVar);
            return;
        }
        a.c cVar = a.c.f75699a;
        this.f75694g = cVar;
        k(cVar, kVar);
        DF0.b bVar = new DF0.b(measureOnClientData.getUserCoords().getLat(), measureOnClientData.getUserCoords().getLng());
        DF0.b bVar2 = new DF0.b(coordinates.getLatitude(), coordinates.getLongitude());
        h hVar = new h(this, measureOnClientData, kVar);
        i iVar = new i(0, this, g.class, "handleError", "handleError()V", 0);
        c cVar2 = this.f75691d;
        cVar2.getClass();
        Calendar calendar = Calendar.getInstance();
        K.a(calendar);
        calendar.set(11, 8);
        G0 g02 = G0.f406611a;
        this.f75696i = cVar2.f75677a.a(bVar, bVar2, calendar.getTimeInMillis(), new c.a(new d(cVar2, hVar, iVar)));
    }

    @Override // com.avito.android.advert.item.geo_distance.f
    public final void f0() {
        DF0.a aVar = this.f75696i;
        if (aVar != null) {
            aVar.cancel();
        }
        this.f75691d.f75677a.onStop();
        if (L.f(this.f75694g, a.c.f75699a)) {
            this.f75694g = a.b.f75698a;
        }
    }

    public final void k(a aVar, k kVar) {
        G0 g02;
        AdvertDetailsGeoDistance advertDetailsGeoDistance;
        DeepLink hintDeeplink;
        if (L.f(aVar, a.b.f75698a) ? true : L.f(aVar, a.d.f75700a)) {
            kVar.bn();
            kVar.Wz();
            kVar.LD();
            kVar.tG();
            return;
        }
        if (L.f(aVar, a.c.f75699a)) {
            kVar.WN();
            kVar.zN();
            kVar.Wz();
            kVar.LD();
            return;
        }
        if (aVar instanceof a.C2249a) {
            kVar.bn();
            kVar.zN();
            kVar.di(((a.C2249a) aVar).f75697a);
            AdvertDetailsAddressGeoDistanceItem advertDetailsAddressGeoDistanceItem = this.f75695h;
            if (advertDetailsAddressGeoDistanceItem == null || (advertDetailsGeoDistance = advertDetailsAddressGeoDistanceItem.f75666d) == null || (hintDeeplink = advertDetailsGeoDistance.getHintDeeplink()) == null) {
                g02 = null;
            } else {
                kVar.fK(new b(hintDeeplink));
                g02 = G0.f406611a;
            }
            if (g02 == null) {
                kVar.LD();
            }
        }
    }
}
