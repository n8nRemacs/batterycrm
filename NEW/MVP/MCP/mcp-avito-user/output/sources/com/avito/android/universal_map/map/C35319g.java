package com.avito.android.universal_map.map;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.universal_map.analytics.RequestType;
import com.avito.android.universal_map.map.di.InterfaceC35301g;
import com.avito.android.universal_map.map.di.InterfaceC35307m;
import com.avito.android.universal_map.map.di.InterfaceC35309o;
import com.avito.android.universal_map.map.di.InterfaceC35310p;
import com.avito.android.universal_map.remote.model.Cluster;
import com.avito.android.universal_map.remote.model.UniversalMapPointsRectResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import lG0.C43633a;

/* compiled from: UniversalMapAnalyticsInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/g;", "Lcom/avito/android/universal_map/map/f;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.universal_map.map.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35319g implements InterfaceC35318f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f305174a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.P f305175b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f305176c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final ParametrizedEvent f305177d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f305178e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f305179f;

    @Inject
    public C35319g(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.P p12, @InterfaceC35309o @Y61.k String str, @Y61.l @InterfaceC35310p String str2, @InterfaceC35301g @Y61.k String str3, @Y61.l @InterfaceC35307m ParametrizedEvent parametrizedEvent) {
        this.f305174a = interfaceC28373a;
        this.f305175b = p12;
        this.f305176c = str3;
        this.f305177d = parametrizedEvent;
        this.f305178e = str2 == null ? "not defined" : str2;
        this.f305179f = C43066x.p0(str, '?');
    }

    @Override // com.avito.android.universal_map.map.InterfaceC35318f
    public final void a() {
        this.f305174a.c(new C43633a(true, null, RequestType.f304759c, this.f305178e, this.f305179f, null, null, this.f305176c, this.f305175b.f().invoke(), null, null, 1634, null));
    }

    @Override // com.avito.android.universal_map.map.InterfaceC35318f
    public final void b() {
        this.f305174a.c(new C43633a(true, null, RequestType.f304760d, this.f305178e, this.f305179f, null, null, this.f305176c, this.f305175b.f().invoke(), null, null, 1634, null));
    }

    @Override // com.avito.android.universal_map.map.InterfaceC35318f
    public final void c() {
        ParametrizedEvent parametrizedEvent = this.f305177d;
        if (parametrizedEvent != null) {
            this.f305174a.c(com.avito.android.analytics.a0.a(parametrizedEvent));
        }
    }

    @Override // com.avito.android.universal_map.map.InterfaceC35318f
    public final void d(@Y61.k AvitoMapPoint avitoMapPoint, @Y61.k AvitoMapPoint avitoMapPoint2, boolean z12) {
        RequestType requestType = RequestType.f304758b;
        Boolean boolValueOf = Boolean.valueOf(z12);
        String strInvoke = this.f305175b.f().invoke();
        List listU = C42745f0.U(String.valueOf(avitoMapPoint.getLatitude()), String.valueOf(avitoMapPoint.getLongitude()), String.valueOf(avitoMapPoint2.getLatitude()), String.valueOf(avitoMapPoint2.getLongitude()));
        this.f305174a.c(new C43633a(false, null, requestType, this.f305178e, this.f305179f, boolValueOf, null, this.f305176c, strInvoke, listU, null, 1090, null));
    }

    @Override // com.avito.android.universal_map.map.InterfaceC35318f
    public final void e() {
        this.f305174a.c(new C43633a(false, null, RequestType.f304759c, this.f305178e, this.f305179f, null, null, this.f305176c, this.f305175b.f().invoke(), null, null, 1634, null));
    }

    @Override // com.avito.android.universal_map.map.InterfaceC35318f
    public final void f() {
        this.f305174a.c(new C43633a(false, null, RequestType.f304760d, this.f305178e, this.f305179f, null, null, this.f305176c, this.f305175b.f().invoke(), null, null, 1634, null));
    }

    @Override // com.avito.android.universal_map.map.InterfaceC35318f
    public final void g(@Y61.k AvitoMapPoint avitoMapPoint, @Y61.k AvitoMapPoint avitoMapPoint2, boolean z12, @Y61.k UniversalMapPointsRectResult universalMapPointsRectResult) {
        Boolean boolValueOf = Boolean.valueOf(universalMapPointsRectResult.g().isEmpty() && universalMapPointsRectResult.c().isEmpty());
        RequestType requestType = RequestType.f304758b;
        Boolean boolValueOf2 = Boolean.valueOf(z12);
        Integer numValueOf = Integer.valueOf(universalMapPointsRectResult.g().size());
        String strInvoke = this.f305175b.f().invoke();
        List listU = C42745f0.U(String.valueOf(avitoMapPoint.getLatitude()), String.valueOf(avitoMapPoint.getLongitude()), String.valueOf(avitoMapPoint2.getLatitude()), String.valueOf(avitoMapPoint2.getLongitude()));
        List<Cluster> listC = universalMapPointsRectResult.c();
        ArrayList arrayList = new ArrayList(C42745f0.q(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(((Cluster) it.next()).getCount());
        }
        this.f305174a.c(new C43633a(true, boolValueOf, requestType, this.f305178e, this.f305179f, boolValueOf2, numValueOf, this.f305176c, strInvoke, listU, arrayList));
    }
}
