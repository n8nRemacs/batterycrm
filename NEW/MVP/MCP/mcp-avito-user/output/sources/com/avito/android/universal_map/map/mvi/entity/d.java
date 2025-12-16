package com.avito.android.universal_map.map.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.universal_map.remote.model.MapMode;
import com.avito.android.universal_map.remote.model.UniversalMapPointsRectResult;
import com.avito.android.universal_map.remote.model.UniversalPreselectMapPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: UniversalMapState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/d;", "", "a", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final MapMode f305585a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final UniversalPreselectMapPoint f305586b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f305587c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a f305588d;

    /* compiled from: UniversalMapState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/d$a;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/universal_map/map/mvi/entity/d$a$a;", "Lcom/avito/android/universal_map/map/mvi/entity/d$a$b;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a {

        /* compiled from: UniversalMapState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/d$a$a;", "Lcom/avito/android/universal_map/map/mvi/entity/d$a;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.universal_map.map.mvi.entity.d$a$a, reason: collision with other inner class name */
        public static final /* data */ class C9383a extends a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final UniversalMapPointsRectResult f305589a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final UniversalPreselectMapPoint f305590b;

            /* renamed from: c, reason: collision with root package name */
            public final boolean f305591c;

            public /* synthetic */ C9383a(UniversalMapPointsRectResult universalMapPointsRectResult, UniversalPreselectMapPoint universalPreselectMapPoint, boolean z12, int i12, C42822w c42822w) {
                this(universalMapPointsRectResult, (i12 & 2) != 0 ? null : universalPreselectMapPoint, (i12 & 4) != 0 ? false : z12);
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C9383a)) {
                    return false;
                }
                C9383a c9383a = (C9383a) obj;
                return L.f(this.f305589a, c9383a.f305589a) && L.f(this.f305590b, c9383a.f305590b) && this.f305591c == c9383a.f305591c;
            }

            public final int hashCode() {
                int iHashCode = this.f305589a.hashCode() * 31;
                UniversalPreselectMapPoint universalPreselectMapPoint = this.f305590b;
                return Boolean.hashCode(this.f305591c) + ((iHashCode + (universalPreselectMapPoint == null ? 0 : universalPreselectMapPoint.hashCode())) * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Content(pointsRectResult=");
                sb2.append(this.f305589a);
                sb2.append(", savedLocation=");
                sb2.append(this.f305590b);
                sb2.append(", resetSelectedPin=");
                return r.x(sb2, this.f305591c, ')');
            }

            public C9383a(@k UniversalMapPointsRectResult universalMapPointsRectResult, @l UniversalPreselectMapPoint universalPreselectMapPoint, boolean z12) {
                super(null);
                this.f305589a = universalMapPointsRectResult;
                this.f305590b = universalPreselectMapPoint;
                this.f305591c = z12;
            }
        }

        /* compiled from: UniversalMapState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/d$a$b;", "Lcom/avito/android/universal_map/map/mvi/entity/d$a;", "<init>", "()V", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final b f305592a = new b();

            public b() {
                super(null);
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d() {
        this(null, null, false, null, 15, null);
    }

    public static d a(d dVar, MapMode mapMode, UniversalPreselectMapPoint universalPreselectMapPoint, a aVar, int i12) {
        if ((i12 & 1) != 0) {
            mapMode = dVar.f305585a;
        }
        if ((i12 & 2) != 0) {
            universalPreselectMapPoint = dVar.f305586b;
        }
        boolean z12 = (i12 & 4) != 0 ? dVar.f305587c : false;
        if ((i12 & 8) != 0) {
            aVar = dVar.f305588d;
        }
        dVar.getClass();
        return new d(mapMode, universalPreselectMapPoint, z12, aVar);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f305585a == dVar.f305585a && L.f(this.f305586b, dVar.f305586b) && this.f305587c == dVar.f305587c && L.f(this.f305588d, dVar.f305588d);
    }

    public final int hashCode() {
        MapMode mapMode = this.f305585a;
        int iHashCode = (mapMode == null ? 0 : mapMode.hashCode()) * 31;
        UniversalPreselectMapPoint universalPreselectMapPoint = this.f305586b;
        return this.f305588d.hashCode() + r.i((iHashCode + (universalPreselectMapPoint != null ? universalPreselectMapPoint.hashCode() : 0)) * 31, 31, this.f305587c);
    }

    @k
    public final String toString() {
        return "PointsState(mapMode=" + this.f305585a + ", preselectedPin=" + this.f305586b + ", showLegacySavedLocationEnabled=" + this.f305587c + ", contentState=" + this.f305588d + ')';
    }

    public d(@l MapMode mapMode, @l UniversalPreselectMapPoint universalPreselectMapPoint, boolean z12, @k a aVar) {
        this.f305585a = mapMode;
        this.f305586b = universalPreselectMapPoint;
        this.f305587c = z12;
        this.f305588d = aVar;
    }

    public /* synthetic */ d(MapMode mapMode, UniversalPreselectMapPoint universalPreselectMapPoint, boolean z12, a aVar, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : mapMode, (i12 & 2) != 0 ? null : universalPreselectMapPoint, (i12 & 4) != 0 ? true : z12, (i12 & 8) != 0 ? a.b.f305592a : aVar);
    }
}
