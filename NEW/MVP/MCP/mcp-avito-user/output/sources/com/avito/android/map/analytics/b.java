package com.avito.android.map.analytics;

import Y61.k;
import Y61.l;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.event.X;
import com.avito.android.analytics.event.Y0;
import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import com.avito.android.map.MapArguments;
import com.avito.android.map_core.analytics.event.PinDescription;
import com.avito.android.map_core.analytics.event.SourceAction;
import com.avito.android.map_core.analytics.event.l;
import com.avito.android.map_core.analytics.event.n;
import com.avito.android.map_core.analytics.event.p;
import com.avito.android.map_core.analytics.event.r;
import com.avito.android.remote.model.SearchParams;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
import java.util.Collections;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MapAnalyticsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map/analytics/b;", "Lcom/avito/android/map/analytics/a;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f184827a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.analytics.provider.e f184828b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final e f184829c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final MapArguments f184830d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final E f184831e;

    /* renamed from: f, reason: collision with root package name */
    public long f184832f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public TreeClickStreamParent f184833g;

    @Inject
    public b(@k InterfaceC28373a interfaceC28373a, @k com.avito.android.analytics.provider.e eVar, @k e eVar2, @k MapArguments mapArguments, @k E e12) {
        this.f184827a = interfaceC28373a;
        this.f184828b = eVar;
        this.f184829c = eVar2;
        this.f184830d = mapArguments;
        this.f184831e = e12;
        this.f184832f = eVar.a();
        this.f184833g = mapArguments.f184817i;
    }

    @Override // com.avito.android.map.analytics.a
    public final void a() {
        long jA2 = this.f184828b.a();
        this.f184832f = jA2;
        this.f184827a.c(new com.avito.android.map_core.analytics.event.g(jA2, this.f184833g, 2738, 0));
        this.f184833g = new TreeClickStreamParent(this.f184832f, this.f184830d.f184820l, null, null);
    }

    @Override // com.avito.android.map.analytics.a
    public final void b(@l LatLngBounds latLngBounds) {
        this.f184827a.c(new com.avito.android.map_core.analytics.event.c(this.f184828b.a(), this.f184833g, latLngBounds != null ? com.avito.android.map_core.utils.d.c(latLngBounds) : null, this.f184829c.getF184839a()));
    }

    @Override // com.avito.android.map.analytics.a
    public final void c(@k SearchParams searchParams, @l String str) {
        this.f184827a.c(new l.b(searchParams, str));
    }

    @Override // com.avito.android.map.analytics.a
    public final void d(@k SearchParams searchParams) {
        this.f184827a.c(new com.avito.android.map_core.analytics.event.b(searchParams, this.f184829c.getF184839a()));
    }

    @Override // com.avito.android.map.analytics.a
    public final void e(@k ArrayList arrayList, @k SearchParams searchParams) {
        this.f184827a.c(new X(this.f184828b.a(), this.f184833g, Collections.singletonList(arrayList), this.f184829c.getF184839a(), searchParams));
    }

    @Override // com.avito.android.map.analytics.a
    public final void f() {
        this.f184827a.c(new com.avito.android.map_core.analytics.event.h(this.f184828b.a(), this.f184833g, 2739, 0));
    }

    @Override // com.avito.android.map.analytics.a
    public final void g(@Y61.l LatLngBounds latLngBounds, int i12, @Y61.l String str, @Y61.l Float f12, @k PinDescription.Type type, @k PinDescription.State state, @k PinDescription.Highlight highlight, @Y61.l String str2) {
        long jA2 = this.f184828b.a();
        this.f184827a.c(new com.avito.android.map_core.analytics.event.d(jA2, this.f184833g, "none", latLngBounds != null ? com.avito.android.map_core.utils.d.c(latLngBounds) : null, str, i12, this.f184829c.getF184839a(), f12 != null ? Integer.valueOf((int) f12.floatValue()) : null, type, state, highlight, str2));
        new TreeClickStreamParent(jA2, this.f184830d.f184820l, null, null);
    }

    @Override // com.avito.android.map.analytics.a
    public final void h(@Y61.l String str) {
        this.f184827a.c(new r(this.f184831e.a(), str));
    }

    @Override // com.avito.android.map.analytics.a
    public final void i(@k SearchParams searchParams, long j12, @Y61.l LatLngBounds latLngBounds, @Y61.l Float f12, boolean z12, @Y61.l SourceAction sourceAction) {
        long jA2 = this.f184828b.a();
        this.f184832f = jA2;
        this.f184827a.c(new p(jA2, this.f184833g, searchParams, j12, latLngBounds != null ? com.avito.android.map_core.utils.d.c(latLngBounds) : null, this.f184829c.a(), f12 != null ? Integer.valueOf((int) f12.floatValue()) : null, z12 ? "personal_geo_map" : null, sourceAction));
        this.f184833g = new TreeClickStreamParent(this.f184832f, this.f184830d.f184820l, null, null);
    }

    @Override // com.avito.android.map.analytics.a
    public final void j() {
        this.f184827a.c(new Y0(this.f184830d.f184818j));
    }

    @Override // com.avito.android.map.analytics.a
    public final void k(@Y61.l LatLngBounds latLngBounds, @Y61.l Float f12) {
        this.f184827a.c(new n(this.f184828b.a(), this.f184833g, latLngBounds != null ? com.avito.android.map_core.utils.d.c(latLngBounds) : null, this.f184829c.getF184839a(), f12 != null ? Integer.valueOf((int) f12.floatValue()) : null));
    }

    @Override // com.avito.android.map.analytics.a
    public final void l(@k SearchParams searchParams, @Y61.l String str) {
        this.f184827a.c(new l.a(searchParams, str));
    }

    @Override // com.avito.android.map.analytics.a
    public final void m(@Y61.l LatLngBounds latLngBounds, @Y61.l Float f12) {
        this.f184827a.c(new com.avito.android.map_core.analytics.event.k(this.f184828b.a(), this.f184833g, latLngBounds != null ? com.avito.android.map_core.utils.d.c(latLngBounds) : null, this.f184829c.getF184839a(), f12 != null ? Integer.valueOf((int) f12.floatValue()) : null));
    }
}
