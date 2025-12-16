package com.avito.android.universal_map.map;

import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.A4;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import io.reactivex.rxjava3.internal.operators.observable.C41982q1;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.P0;
import tG0.InterfaceC48553b;

/* compiled from: UniversalMapInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/O;", "Lcom/avito/android/universal_map/map/J;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class O implements J {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC48553b> f304803a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.error.f f304804b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f304805c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35318f f304806d;

    @Inject
    public O(@Y61.k h31.e<InterfaceC48553b> eVar, @Y61.k com.avito.android.remote.error.f fVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC35318f interfaceC35318f) {
        this.f304803a = eVar;
        this.f304804b = fVar;
        this.f304805c = interfaceC35745a5;
        this.f304806d = interfaceC35318f;
    }

    @Override // com.avito.android.universal_map.map.J
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.observable.O a(@Y61.k final String str, @Y61.k final AvitoMapPoint avitoMapPoint, @Y61.k final AvitoMapPoint avitoMapPoint2, @Y61.l final Float f12, @Y61.k final Map map, @Y61.l final Map map2, @Y61.l final Map map3, boolean z12) {
        return new io.reactivex.rxjava3.internal.operators.observable.F(new l41.s() { // from class: com.avito.android.universal_map.map.K
            @Override // l41.s
            public final Object get() {
                InterfaceC48553b interfaceC48553b = this.f304789b.f304803a.get();
                AvitoMapPoint avitoMapPoint3 = avitoMapPoint;
                Map<String, Double> mapG = P0.g(new kotlin.Q("topLeft[lat]", Double.valueOf(avitoMapPoint3.getLatitude())), new kotlin.Q("topLeft[lng]", Double.valueOf(avitoMapPoint3.getLongitude())));
                AvitoMapPoint avitoMapPoint4 = avitoMapPoint2;
                Map<String, Double> mapG2 = P0.g(new kotlin.Q("bottomRight[lat]", Double.valueOf(avitoMapPoint4.getLatitude())), new kotlin.Q("bottomRight[lng]", Double.valueOf(avitoMapPoint4.getLongitude())));
                A4.f318516a.getClass();
                Map<String, String> mapH = A4.h(map, "extraParameters");
                Map mapC = map2;
                if (mapC == null) {
                    mapC = P0.c();
                }
                Map<String, String> mapH2 = A4.h(mapC, "checkedFilters");
                Map mapC2 = map3;
                if (mapC2 == null) {
                    mapC2 = P0.c();
                }
                return interfaceC48553b.a(str, mapG, mapG2, mapH, mapH2, A4.h(mapC2, "selectedPinParameters"), f12);
            }
        }).x0(this.f304805c.a()).d0(L.f304797b).r0(P2.c.f318721a).m0(new M(this)).G(new N(this, avitoMapPoint, avitoMapPoint2, z12));
    }

    @Override // com.avito.android.universal_map.map.J
    @Y61.k
    public final io.reactivex.rxjava3.core.z<TypedResult<uG0.d>> b(@Y61.k String str, @Y61.l Float f12, @Y61.l Map<String, ? extends Object> map) {
        C41982q1 c41982q1X0 = new io.reactivex.rxjava3.internal.operators.observable.F(new com.avito.android.advert.deeplinks.delivery.p(this, str, map, 15)).x0(this.f304805c.a());
        Long lValueOf = f12 != null ? Long.valueOf((long) (f12.floatValue() * 1000)) : null;
        return lValueOf != null ? c41982q1X0.E0(lValueOf.longValue(), TimeUnit.MILLISECONDS, null, io.reactivex.rxjava3.schedulers.b.f404942b) : c41982q1X0;
    }
}
