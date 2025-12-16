package vu0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.service_order_map.serviceordermap.ServiceOrderMapView;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServiceOrderMapOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lvu0/a;", "", "a", "b", "c", "d", "e", "Lvu0/a$a;", "Lvu0/a$b;", "Lvu0/a$c;", "Lvu0/a$d;", "Lvu0/a$e;", "_avito_service-order-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vu0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC49384a {

    /* compiled from: ServiceOrderMapOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvu0/a$a;", "Lvu0/a;", "<init>", "()V", "_avito_service-order-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vu0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C12798a implements InterfaceC49384a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C12798a f441038a = new C12798a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C12798a);
        }

        public final int hashCode() {
            return -2013424891;
        }

        @k
        public final String toString() {
            return "Back";
        }
    }

    /* compiled from: ServiceOrderMapOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lvu0/a$b;", "Lvu0/a;", "_avito_service-order-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vu0.a$b */
    public static final /* data */ class b implements InterfaceC49384a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f441039a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Double f441040b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Double f441041c;

        public b(@l Double d12, @l Double d13, @l String str) {
            this.f441039a = str;
            this.f441040b = d12;
            this.f441041c = d13;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f441039a, bVar.f441039a) && L.f(this.f441040b, bVar.f441040b) && L.f(this.f441041c, bVar.f441041c);
        }

        public final int hashCode() {
            String str = this.f441039a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Double d12 = this.f441040b;
            int iHashCode2 = (iHashCode + (d12 == null ? 0 : d12.hashCode())) * 31;
            Double d13 = this.f441041c;
            return iHashCode2 + (d13 != null ? d13.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CloseWithResult(address=");
            sb2.append(this.f441039a);
            sb2.append(", lat=");
            sb2.append(this.f441040b);
            sb2.append(", lng=");
            return com.avito.android.authorization.auto_recovery.phone_confirm.b.h(sb2, this.f441041c, ')');
        }
    }

    /* compiled from: ServiceOrderMapOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvu0/a$c;", "Lvu0/a;", "<init>", "()V", "_avito_service-order-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vu0.a$c */
    public static final /* data */ class c implements InterfaceC49384a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f441042a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -326316923;
        }

        @k
        public final String toString() {
            return "ShowCommonErrorToast";
        }
    }

    /* compiled from: ServiceOrderMapOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvu0/a$d;", "Lvu0/a;", "<init>", "()V", "_avito_service-order-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vu0.a$d */
    public static final /* data */ class d implements InterfaceC49384a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f441043a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 204468062;
        }

        @k
        public final String toString() {
            return "ShowRationaleLocationRequest";
        }
    }

    /* compiled from: ServiceOrderMapOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lvu0/a$e;", "Lvu0/a;", "_avito_service-order-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vu0.a$e */
    public static final /* data */ class e implements InterfaceC49384a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Coordinates f441044a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f441045b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ServiceOrderMapView.ZoomLevel f441046c;

        public e(@k Coordinates coordinates, boolean z12, @k ServiceOrderMapView.ZoomLevel zoomLevel) {
            this.f441044a = coordinates;
            this.f441045b = z12;
            this.f441046c = zoomLevel;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.f441044a, eVar.f441044a) && this.f441045b == eVar.f441045b && this.f441046c == eVar.f441046c;
        }

        public final int hashCode() {
            return this.f441046c.hashCode() + r.i(this.f441044a.hashCode() * 31, 31, this.f441045b);
        }

        @k
        public final String toString() {
            return "UpdatePinCoordinates(coords=" + this.f441044a + ", animated=" + this.f441045b + ", zoomLevel=" + this.f441046c + ')';
        }
    }
}
