package rG0;

import Y61.k;
import Y61.l;
import Zi.InterfaceC19564a;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.universal_map.map.common.marker.Marker;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import qG0.C47290a;

/* compiled from: UniversalMapAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"LrG0/a;", "", "<init>", "()V", "a", "b", "c", "d", "e", "f", "LrG0/a$a;", "LrG0/a$b;", "LrG0/a$c;", "LrG0/a$d;", "LrG0/a$e;", "LrG0/a$f;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rG0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC47541a {

    /* compiled from: UniversalMapAction.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"LrG0/a$a;", "LrG0/a;", "<init>", "()V", "a", "b", "c", "d", "LrG0/a$a$a;", "LrG0/a$a$b;", "LrG0/a$a$c;", "LrG0/a$a$d;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rG0.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC12359a extends AbstractC47541a {

        /* compiled from: UniversalMapAction.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LrG0/a$a$a;", "LrG0/a$a;", "<init>", "()V", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: rG0.a$a$a, reason: collision with other inner class name */
        public static final class C12360a extends AbstractC12359a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C12360a f429672a = new C12360a();

            public C12360a() {
                super(null);
            }
        }

        /* compiled from: UniversalMapAction.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LrG0/a$a$b;", "LrG0/a$a;", "<init>", "()V", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: rG0.a$a$b */
        public static final class b extends AbstractC12359a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final b f429673a = new b();

            public b() {
                super(null);
            }
        }

        /* compiled from: UniversalMapAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LrG0/a$a$c;", "LrG0/a$a;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: rG0.a$a$c */
        public static final /* data */ class c extends AbstractC12359a {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f429674a;

            public c() {
                super(null);
                this.f429674a = true;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.f429674a == ((c) obj).f429674a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f429674a);
            }

            @k
            public final String toString() {
                return r.x(new StringBuilder("HideFiltersBottomSheet(isNativeClose="), this.f429674a, ')');
            }
        }

        /* compiled from: UniversalMapAction.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LrG0/a$a$d;", "LrG0/a$a;", "<init>", "()V", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: rG0.a$a$d */
        public static final class d extends AbstractC12359a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final d f429675a = new d();

            public d() {
                super(null);
            }
        }

        public /* synthetic */ AbstractC12359a(C42822w c42822w) {
            this();
        }

        public AbstractC12359a() {
            super(null);
        }
    }

    /* compiled from: UniversalMapAction.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u000e\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000e\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, d2 = {"LrG0/a$b;", "LrG0/a;", "<init>", "()V", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "LrG0/a$b$a;", "LrG0/a$b$b;", "LrG0/a$b$c;", "LrG0/a$b$d;", "LrG0/a$b$e;", "LrG0/a$b$f;", "LrG0/a$b$g;", "LrG0/a$b$h;", "LrG0/a$b$i;", "LrG0/a$b$j;", "LrG0/a$b$k;", "LrG0/a$b$l;", "LrG0/a$b$m;", "LrG0/a$b$n;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rG0.a$b */
    public static abstract class b extends AbstractC47541a {

        /* compiled from: UniversalMapAction.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LrG0/a$b$a;", "LrG0/a$b;", "<init>", "()V", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: rG0.a$b$a, reason: collision with other inner class name */
        public static final class C12361a extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C12361a f429676a = new C12361a();

            public C12361a() {
                super(null);
            }
        }

        /* compiled from: UniversalMapAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LrG0/a$b$b;", "LrG0/a$b;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: rG0.a$b$b, reason: collision with other inner class name */
        public static final /* data */ class C12362b extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final Marker.a f429677a;

            public C12362b(@Y61.k Marker.a aVar) {
                super(null);
                this.f429677a = aVar;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C12362b) && L.f(this.f429677a, ((C12362b) obj).f429677a);
            }

            public final int hashCode() {
                return this.f429677a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "ClusterClicked(cluster=" + this.f429677a + ')';
            }
        }

        /* compiled from: UniversalMapAction.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LrG0/a$b$c;", "LrG0/a$b;", "<init>", "()V", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: rG0.a$b$c */
        public static final class c extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final c f429678a = new c();

            public c() {
                super(null);
            }
        }

        /* compiled from: UniversalMapAction.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LrG0/a$b$d;", "LrG0/a$b;", "<init>", "()V", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: rG0.a$b$d */
        public static final class d extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final d f429679a = new d();

            public d() {
                super(null);
            }
        }

        /* compiled from: UniversalMapAction.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LrG0/a$b$e;", "LrG0/a$b;", "<init>", "()V", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: rG0.a$b$e */
        public static final class e extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final e f429680a = new e();

            public e() {
                super(null);
            }
        }

        /* compiled from: UniversalMapAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LrG0/a$b$f;", "LrG0/a$b;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: rG0.a$b$f */
        public static final /* data */ class f extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f429681a;

            public f(@Y61.k String str) {
                super(null);
                this.f429681a = str;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && L.f(this.f429681a, ((f) obj).f429681a);
            }

            public final int hashCode() {
                return this.f429681a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return C22026a.c(new StringBuilder("MarkerClicked(markerId="), this.f429681a, ')');
            }
        }

        /* compiled from: UniversalMapAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LrG0/a$b$g;", "LrG0/a$b;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: rG0.a$b$g */
        public static final /* data */ class g extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final AvitoMapPoint f429682a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final Float f429683b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(@Y61.k AvitoMapPoint avitoMapPoint) {
                super(null);
                Float fValueOf = Float.valueOf(12.0f);
                this.f429682a = avitoMapPoint;
                this.f429683b = fValueOf;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                g gVar = (g) obj;
                return L.f(this.f429682a, gVar.f429682a) && L.f(this.f429683b, gVar.f429683b);
            }

            public final int hashCode() {
                int i12 = r.i(this.f429682a.hashCode() * 31, 31, false);
                Float f12 = this.f429683b;
                return i12 + (f12 != null ? f12.hashCode() : 0);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("MoveCameraToState(point=");
                sb2.append(this.f429682a);
                sb2.append(", animate=false, zoomLevel=");
                return org.webrtc.h.d(sb2, this.f429683b, ')');
            }
        }

        /* compiled from: UniversalMapAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LrG0/a$b$h;", "LrG0/a$b;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: rG0.a$b$h */
        public static final /* data */ class h extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final Marker.Pin f429684a;

            public h(@Y61.k Marker.Pin pin) {
                super(null);
                this.f429684a = pin;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof h) && L.f(this.f429684a, ((h) obj).f429684a);
            }

            public final int hashCode() {
                return this.f429684a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "PinClicked(pin=" + this.f429684a + ')';
            }
        }

        /* compiled from: UniversalMapAction.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LrG0/a$b$i;", "LrG0/a$b;", "<init>", "()V", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: rG0.a$b$i */
        public static final class i extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final i f429685a = new i();

            public i() {
                super(null);
            }
        }

        /* compiled from: UniversalMapAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LrG0/a$b$j;", "LrG0/a$b;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: rG0.a$b$j */
        public static final /* data */ class j extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final Marker.Pin f429686a;

            public j(@Y61.k Marker.Pin pin) {
                super(null);
                this.f429686a = pin;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof j) && L.f(this.f429686a, ((j) obj).f429686a);
            }

            public final int hashCode() {
                return this.f429686a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "ShowLegacySavedLocation(pin=" + this.f429686a + ')';
            }
        }

        /* compiled from: UniversalMapAction.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LrG0/a$b$k;", "LrG0/a$b;", "<init>", "()V", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: rG0.a$b$k */
        public static final class k extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final k f429687a = new k();

            public k() {
                super(null);
            }
        }

        /* compiled from: UniversalMapAction.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LrG0/a$b$l;", "LrG0/a$b;", "<init>", "()V", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: rG0.a$b$l */
        public static final class l extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final l f429688a = new l();

            public l() {
                super(null);
            }
        }

        /* compiled from: UniversalMapAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LrG0/a$b$m;", "LrG0/a$b;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: rG0.a$b$m */
        public static final /* data */ class m extends b {

            /* renamed from: a, reason: collision with root package name */
            public final double f429689a;

            /* renamed from: b, reason: collision with root package name */
            public final double f429690b;

            public m(double d12, double d13) {
                super(null);
                this.f429689a = d12;
                this.f429690b = d13;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof m)) {
                    return false;
                }
                m mVar = (m) obj;
                return Double.compare(this.f429689a, mVar.f429689a) == 0 && Double.compare(this.f429690b, mVar.f429690b) == 0;
            }

            public final int hashCode() {
                return Double.hashCode(this.f429690b) + (Double.hashCode(this.f429689a) * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("UserLocationChanged(latitude=");
                sb2.append(this.f429689a);
                sb2.append(", longitude=");
                return androidx.compose.ui.graphics.colorspace.e.o(sb2, this.f429690b, ')');
            }
        }

        /* compiled from: UniversalMapAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LrG0/a$b$n;", "LrG0/a$b;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: rG0.a$b$n */
        public static final /* data */ class n extends b {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f429691a;

            public n(boolean z12) {
                super(null);
                this.f429691a = z12;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof n) && this.f429691a == ((n) obj).f429691a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f429691a);
            }

            @Y61.k
            public final String toString() {
                return r.x(new StringBuilder("UserLocationNotFound(isPermissionDenied="), this.f429691a, ')');
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
            super(null);
        }
    }

    /* compiled from: UniversalMapAction.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LrG0/a$c;", "LrG0/a;", "<init>", "()V", "a", "b", "c", "LrG0/a$c$a;", "LrG0/a$c$b;", "LrG0/a$c$c;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rG0.a$c */
    public static abstract class c extends AbstractC47541a {

        /* compiled from: UniversalMapAction.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LrG0/a$c$a;", "LrG0/a$c;", "<init>", "()V", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: rG0.a$c$a, reason: collision with other inner class name */
        public static final class C12363a extends c {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C12363a f429692a = new C12363a();

            public C12363a() {
                super(null);
            }
        }

        /* compiled from: UniversalMapAction.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LrG0/a$c$b;", "LrG0/a$c;", "<init>", "()V", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: rG0.a$c$b */
        public static final class b extends c {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final b f429693a = new b();

            public b() {
                super(null);
            }
        }

        /* compiled from: UniversalMapAction.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LrG0/a$c$c;", "LrG0/a$c;", "<init>", "()V", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: rG0.a$c$c, reason: collision with other inner class name */
        public static final class C12364c extends c {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C12364c f429694a = new C12364c();

            public C12364c() {
                super(null);
            }
        }

        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
            super(null);
        }
    }

    /* compiled from: UniversalMapAction.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LrG0/a$d;", "LrG0/a;", "<init>", "()V", "a", "b", "LrG0/a$d$a;", "LrG0/a$d$b;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rG0.a$d */
    public static abstract class d extends AbstractC47541a {

        /* compiled from: UniversalMapAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LrG0/a$d$a;", "LrG0/a$d;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: rG0.a$d$a, reason: collision with other inner class name */
        public static final /* data */ class C12365a extends d {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final C47290a f429695a;

            public C12365a(@k C47290a c47290a) {
                super(null);
                this.f429695a = c47290a;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C12365a) {
                    return L.f(this.f429695a, ((C12365a) obj).f429695a);
                }
                return false;
            }

            public final int hashCode() {
                return Boolean.hashCode(false) + (this.f429695a.hashCode() * 31);
            }

            @k
            public final String toString() {
                return "LoadPins(event=" + this.f429695a + ", clearSelectedPin=false)";
            }
        }

        /* compiled from: UniversalMapAction.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LrG0/a$d$b;", "LrG0/a$d;", "<init>", "()V", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: rG0.a$d$b */
        public static final class b extends d {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final b f429696a = new b();

            public b() {
                super(null);
            }
        }

        public /* synthetic */ d(C42822w c42822w) {
            this();
        }

        public d() {
            super(null);
        }
    }

    /* compiled from: UniversalMapAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LrG0/a$e;", "LrG0/a;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rG0.a$e */
    public static final /* data */ class e extends AbstractC47541a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final InterfaceC19564a f429697a;

        public e(@l InterfaceC19564a interfaceC19564a) {
            super(null);
            this.f429697a = interfaceC19564a;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f429697a, ((e) obj).f429697a);
        }

        public final int hashCode() {
            InterfaceC19564a interfaceC19564a = this.f429697a;
            if (interfaceC19564a == null) {
                return 0;
            }
            return interfaceC19564a.hashCode();
        }

        @k
        public final String toString() {
            return "ScreenVisible(actionsStore=" + this.f429697a + ')';
        }
    }

    /* compiled from: UniversalMapAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LrG0/a$f;", "LrG0/a;", "<init>", "()V", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rG0.a$f */
    public static final class f extends AbstractC47541a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final f f429698a = new f();

        public f() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC47541a(C42822w c42822w) {
        this();
    }

    public AbstractC47541a() {
    }
}
