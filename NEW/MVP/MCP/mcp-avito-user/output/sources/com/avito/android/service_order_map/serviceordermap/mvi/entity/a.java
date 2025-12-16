package com.avito.android.service_order_map.serviceordermap.mvi.entity;

import Y61.k;
import Y61.l;
import com.avito.android.avito_map.AvitoMapBounds;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.geo_common.model.location_picker.AddressSuggestion;
import com.avito.android.service_order_map.serviceordermap.mvi.entity.ServiceOrderMapState;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServiceOrderMapAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/a;", "", "a", "b", "c", "d", "e", "f", "g", "Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/a$a;", "Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/a$b;", "Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/a$c;", "Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/a$d;", "Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/a$e;", "Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/a$f;", "Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/a$g;", "_avito_service-order-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface a {

    /* compiled from: ServiceOrderMapAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/a$a;", "Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/a;", "<init>", "()V", "_avito_service-order-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.service_order_map.serviceordermap.mvi.entity.a$a, reason: collision with other inner class name */
    public static final /* data */ class C8292a implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C8292a f278787a = new C8292a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C8292a);
        }

        public final int hashCode() {
            return 1178789836;
        }

        @k
        public final String toString() {
            return "BackPressed";
        }
    }

    /* compiled from: ServiceOrderMapAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/a$b;", "Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/a;", "_avito_service-order-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ServiceOrderMapState.MapMode f278788a;

        public b(@k ServiceOrderMapState.MapMode mapMode) {
            this.f278788a = mapMode;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f278788a == ((b) obj).f278788a;
        }

        public final int hashCode() {
            return this.f278788a.hashCode();
        }

        @k
        public final String toString() {
            return "ChangeMode(mode=" + this.f278788a + ')';
        }
    }

    /* compiled from: ServiceOrderMapAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/a$c;", "Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/a;", "<init>", "()V", "_avito_service-order-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f278789a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 321762304;
        }

        @k
        public final String toString() {
            return "FindMe";
        }
    }

    /* compiled from: ServiceOrderMapAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/a$d;", "Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/a;", "<init>", "()V", "_avito_service-order-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f278790a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 667065645;
        }

        @k
        public final String toString() {
            return "MainButtonClicked";
        }
    }

    /* compiled from: ServiceOrderMapAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/a$e;", "Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/a;", "_avito_service-order-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final AvitoMapPoint f278791a;

        public e(@k AvitoMapPoint avitoMapPoint) {
            this.f278791a = avitoMapPoint;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f278791a, ((e) obj).f278791a);
        }

        public final int hashCode() {
            return this.f278791a.hashCode();
        }

        @k
        public final String toString() {
            return "MapSettled(mapPoint=" + this.f278791a + ')';
        }
    }

    /* compiled from: ServiceOrderMapAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/a$f;", "Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/a;", "_avito_service-order-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f278792a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final AvitoMapBounds f278793b;

        public f(@k String str, @l AvitoMapBounds avitoMapBounds) {
            this.f278792a = str;
            this.f278793b = avitoMapBounds;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return L.f(this.f278792a, fVar.f278792a) && L.f(this.f278793b, fVar.f278793b);
        }

        public final int hashCode() {
            int iHashCode = this.f278792a.hashCode() * 31;
            AvitoMapBounds avitoMapBounds = this.f278793b;
            return iHashCode + (avitoMapBounds == null ? 0 : avitoMapBounds.hashCode());
        }

        @k
        public final String toString() {
            return "SearchChanged(query=" + this.f278792a + ", bounds=" + this.f278793b + ')';
        }
    }

    /* compiled from: ServiceOrderMapAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/a$g;", "Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/a;", "_avito_service-order-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final AddressSuggestion f278794a;

        public g(@k AddressSuggestion addressSuggestion) {
            this.f278794a = addressSuggestion;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f278794a, ((g) obj).f278794a);
        }

        public final int hashCode() {
            return this.f278794a.hashCode();
        }

        @k
        public final String toString() {
            return "SuggestedLocationClicked(suggestion=" + this.f278794a + ')';
        }
    }
}
