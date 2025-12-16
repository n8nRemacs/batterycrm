package rG0;

import androidx.appcompat.app.r;
import com.avito.android.avito_map.AvitoMapBounds;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.remote.error.ApiError;
import com.avito.android.universal_map.map.common.marker.Marker;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import qG0.C47293d;

/* compiled from: UniversalMapOneTimeEvent.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u0082\u0001\f\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"LrG0/b;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "LrG0/b$a;", "LrG0/b$b;", "LrG0/b$c;", "LrG0/b$d;", "LrG0/b$e;", "LrG0/b$f;", "LrG0/b$g;", "LrG0/b$h;", "LrG0/b$i;", "LrG0/b$j;", "LrG0/b$k;", "LrG0/b$l;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rG0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC47542b {

    /* compiled from: UniversalMapOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LrG0/b$a;", "LrG0/b;", "<init>", "()V", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rG0.b$a */
    public static final class a implements InterfaceC47542b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f429699a = new a();
    }

    /* compiled from: UniversalMapOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LrG0/b$b;", "LrG0/b;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rG0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C12366b implements InterfaceC47542b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final AvitoMapBounds f429700a;

        public C12366b(@Y61.k AvitoMapBounds avitoMapBounds) {
            this.f429700a = avitoMapBounds;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C12366b) {
                return L.f(this.f429700a, ((C12366b) obj).f429700a);
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(false) + (this.f429700a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "MoveCameraToBounds(bounds=" + this.f429700a + ", animate=false)";
        }
    }

    /* compiled from: UniversalMapOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LrG0/b$c;", "LrG0/b;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rG0.b$c */
    public static final /* data */ class c implements InterfaceC47542b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final AvitoMapPoint f429701a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f429702b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final Float f429703c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f429704d;

        public c(@Y61.k AvitoMapPoint avitoMapPoint, boolean z12, @Y61.l Float f12, boolean z13) {
            this.f429701a = avitoMapPoint;
            this.f429702b = z12;
            this.f429703c = f12;
            this.f429704d = z13;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f429701a, cVar.f429701a) && this.f429702b == cVar.f429702b && L.f(this.f429703c, cVar.f429703c) && this.f429704d == cVar.f429704d;
        }

        public final int hashCode() {
            int i12 = r.i(this.f429701a.hashCode() * 31, 31, this.f429702b);
            Float f12 = this.f429703c;
            return Boolean.hashCode(this.f429704d) + ((i12 + (f12 == null ? 0 : f12.hashCode())) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("MoveCameraToState(point=");
            sb2.append(this.f429701a);
            sb2.append(", animate=");
            sb2.append(this.f429702b);
            sb2.append(", zoomLevel=");
            sb2.append(this.f429703c);
            sb2.append(", applyLatitudeDiff=");
            return r.x(sb2, this.f429704d, ')');
        }
    }

    /* compiled from: UniversalMapOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LrG0/b$d;", "LrG0/b;", "<init>", "()V", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rG0.b$d */
    public static final class d implements InterfaceC47542b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final d f429705a = new d();
    }

    /* compiled from: UniversalMapOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LrG0/b$e;", "LrG0/b;", "<init>", "()V", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rG0.b$e */
    public static final class e implements InterfaceC47542b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final e f429706a = new e();
    }

    /* compiled from: UniversalMapOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LrG0/b$f;", "LrG0/b;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rG0.b$f */
    public static final /* data */ class f implements InterfaceC47542b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final C47293d f429707a;

        public f(@Y61.k C47293d c47293d) {
            this.f429707a = c47293d;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f429707a, ((f) obj).f429707a);
        }

        public final int hashCode() {
            return this.f429707a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ShowFiltersTooltip(tooltipData=" + this.f429707a + ')';
        }
    }

    /* compiled from: UniversalMapOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LrG0/b$g;", "LrG0/b;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rG0.b$g */
    public static final /* data */ class g implements InterfaceC47542b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ApiError f429708a;

        public g(@Y61.k ApiError apiError) {
            this.f429708a = apiError;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f429708a, ((g) obj).f429708a);
        }

        public final int hashCode() {
            return this.f429708a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return AK.c.n(new StringBuilder("ShowSnackBarError(error="), this.f429708a, ')');
        }
    }

    /* compiled from: UniversalMapOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LrG0/b$h;", "LrG0/b;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rG0.b$h */
    public static final /* data */ class h implements InterfaceC47542b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ApiError f429709a;

        public h(@Y61.k ApiError apiError) {
            this.f429709a = apiError;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && L.f(this.f429709a, ((h) obj).f429709a);
        }

        public final int hashCode() {
            return this.f429709a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return AK.c.n(new StringBuilder("ShowToastError(error="), this.f429709a, ')');
        }
    }

    /* compiled from: UniversalMapOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LrG0/b$i;", "LrG0/b;", "<init>", "()V", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rG0.b$i */
    public static final class i implements InterfaceC47542b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final i f429710a = new i();
    }

    /* compiled from: UniversalMapOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LrG0/b$j;", "LrG0/b;", "<init>", "()V", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rG0.b$j */
    public static final class j implements InterfaceC47542b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final j f429711a = new j();
    }

    /* compiled from: UniversalMapOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LrG0/b$k;", "LrG0/b;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rG0.b$k */
    public static final /* data */ class k implements InterfaceC47542b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Marker.Pin f429712a;

        public k(@Y61.k Marker.Pin pin) {
            this.f429712a = pin;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && L.f(this.f429712a, ((k) obj).f429712a);
        }

        public final int hashCode() {
            return this.f429712a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "TriggerShowLegacySavedLocation(pin=" + this.f429712a + ')';
        }
    }

    /* compiled from: UniversalMapOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LrG0/b$l;", "LrG0/b;", "<init>", "()V", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rG0.b$l */
    public static final class l implements InterfaceC47542b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final l f429713a = new l();
    }
}
