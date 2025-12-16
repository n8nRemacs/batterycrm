package com.avito.android.universal_map.map.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.universal_map.map.mvi.entity.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: UniversalMapState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/e;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class e extends q {

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final a f305593h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final e f305594i = new e(a.b.f305557a, new c(null, null, null, null, 15, null), new b(false, null, null, null, 15, null), new d(null, null, false, null, 15, null), new MapState(false, null, null, null, null, null, 63, null), true);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.universal_map.map.mvi.entity.a f305595b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final c f305596c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final b f305597d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final d f305598e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final MapState f305599f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f305600g;

    /* compiled from: UniversalMapState.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/e$a;", "", "<init>", "()V", "", "UNKNOWN_USER_LOCATION_LATITUDE", "D", "UNKNOWN_USER_LOCATION_LONGITUDE", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public e(@k com.avito.android.universal_map.map.mvi.entity.a aVar, @k c cVar, @k b bVar, @k d dVar, @k MapState mapState, boolean z12) {
        this.f305595b = aVar;
        this.f305596c = cVar;
        this.f305597d = bVar;
        this.f305598e = dVar;
        this.f305599f = mapState;
        this.f305600g = z12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10, types: [com.avito.android.universal_map.map.mvi.entity.a] */
    public static e a(e eVar, a.C9378a c9378a, c cVar, b bVar, d dVar, MapState mapState, int i12) {
        a.C9378a c9378a2 = c9378a;
        if ((i12 & 1) != 0) {
            c9378a2 = eVar.f305595b;
        }
        a.C9378a c9378a3 = c9378a2;
        if ((i12 & 2) != 0) {
            cVar = eVar.f305596c;
        }
        c cVar2 = cVar;
        if ((i12 & 4) != 0) {
            bVar = eVar.f305597d;
        }
        b bVar2 = bVar;
        if ((i12 & 8) != 0) {
            dVar = eVar.f305598e;
        }
        d dVar2 = dVar;
        if ((i12 & 16) != 0) {
            mapState = eVar.f305599f;
        }
        MapState mapState2 = mapState;
        boolean z12 = (i12 & 32) != 0 ? eVar.f305600g : false;
        eVar.getClass();
        return new e(c9378a3, cVar2, bVar2, dVar2, mapState2, z12);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f305595b, eVar.f305595b) && L.f(this.f305596c, eVar.f305596c) && L.f(this.f305597d, eVar.f305597d) && L.f(this.f305598e, eVar.f305598e) && L.f(this.f305599f, eVar.f305599f) && this.f305600g == eVar.f305600g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f305600g) + ((this.f305599f.hashCode() + ((this.f305598e.hashCode() + ((this.f305597d.hashCode() + ((this.f305596c.hashCode() + (this.f305595b.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UniversalMapState(beduinFormState=");
        sb2.append(this.f305595b);
        sb2.append(", pointInfoState=");
        sb2.append(this.f305596c);
        sb2.append(", filtersState=");
        sb2.append(this.f305597d);
        sb2.append(", pointsState=");
        sb2.append(this.f305598e);
        sb2.append(", mapState=");
        sb2.append(this.f305599f);
        sb2.append(", firstShow=");
        return r.x(sb2, this.f305600g, ')');
    }
}
