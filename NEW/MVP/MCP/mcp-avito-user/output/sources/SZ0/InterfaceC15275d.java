package Sz0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalColor;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TagType.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"LSz0/d;", "", "a", "b", "c", "d", "e", "LSz0/d$a;", "LSz0/d$b;", "LSz0/d$c;", "LSz0/d$d;", "LSz0/d$e;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Sz0.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC15275d {

    /* compiled from: TagType.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSz0/d$a;", "LSz0/d;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Sz0.d$a */
    public static final /* data */ class a implements InterfaceC15275d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final UniversalColor f15254a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final DeepLink f15255b;

        public a(@k UniversalColor universalColor, @l DeepLink deepLink) {
            this.f15254a = universalColor;
            this.f15255b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f15254a, aVar.f15254a) && L.f(this.f15255b, aVar.f15255b);
        }

        public final int hashCode() {
            int iHashCode = this.f15254a.hashCode() * 31;
            DeepLink deepLink = this.f15255b;
            return iHashCode + (deepLink == null ? 0 : deepLink.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("End(color=");
            sb2.append(this.f15254a);
            sb2.append(", deeplink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f15255b, ')');
        }
    }

    /* compiled from: TagType.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSz0/d$b;", "LSz0/d;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Sz0.d$b */
    public static final /* data */ class b implements InterfaceC15275d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final UniversalColor f15256a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final DeepLink f15257b;

        public b(@k UniversalColor universalColor, @l DeepLink deepLink) {
            this.f15256a = universalColor;
            this.f15257b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f15256a, bVar.f15256a) && L.f(this.f15257b, bVar.f15257b);
        }

        public final int hashCode() {
            int iHashCode = this.f15256a.hashCode() * 31;
            DeepLink deepLink = this.f15257b;
            return iHashCode + (deepLink == null ? 0 : deepLink.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Middle(color=");
            sb2.append(this.f15256a);
            sb2.append(", deeplink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f15257b, ')');
        }
    }

    /* compiled from: TagType.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LSz0/d$c;", "LSz0/d;", "<init>", "()V", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Sz0.d$c */
    public static final /* data */ class c implements InterfaceC15275d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f15258a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1359273870;
        }

        @k
        public final String toString() {
            return "None";
        }
    }

    /* compiled from: TagType.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSz0/d$d;", "LSz0/d;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Sz0.d$d, reason: collision with other inner class name */
    public static final /* data */ class C1043d implements InterfaceC15275d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final UniversalColor f15259a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f15260b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f15261c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f15262d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f15263e;

        /* renamed from: f, reason: collision with root package name */
        public final int f15264f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final DeepLink f15265g;

        public C1043d(@k UniversalColor universalColor, @k String str, @l String str2, boolean z12, boolean z13, int i12, @l DeepLink deepLink) {
            this.f15259a = universalColor;
            this.f15260b = str;
            this.f15261c = str2;
            this.f15262d = z12;
            this.f15263e = z13;
            this.f15264f = i12;
            this.f15265g = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1043d)) {
                return false;
            }
            C1043d c1043d = (C1043d) obj;
            return L.f(this.f15259a, c1043d.f15259a) && L.f(this.f15260b, c1043d.f15260b) && L.f(this.f15261c, c1043d.f15261c) && this.f15262d == c1043d.f15262d && this.f15263e == c1043d.f15263e && this.f15264f == c1043d.f15264f && L.f(this.f15265g, c1043d.f15265g);
        }

        public final int hashCode() {
            int iD2 = H.d(this.f15259a.hashCode() * 31, 31, this.f15260b);
            String str = this.f15261c;
            int iE2 = r.e(this.f15264f, r.i(r.i((iD2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f15262d), 31, this.f15263e), 31);
            DeepLink deepLink = this.f15265g;
            return iE2 + (deepLink != null ? deepLink.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Start(color=");
            sb2.append(this.f15259a);
            sb2.append(", title=");
            sb2.append(this.f15260b);
            sb2.append(", subtitle=");
            sb2.append(this.f15261c);
            sb2.append(", areTextColorsInverse=");
            sb2.append(this.f15262d);
            sb2.append(", shouldShowIndicator=");
            sb2.append(this.f15263e);
            sb2.append(", tagLengthInDays=");
            sb2.append(this.f15264f);
            sb2.append(", deeplink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f15265g, ')');
        }
    }

    /* compiled from: TagType.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSz0/d$e;", "LSz0/d;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Sz0.d$e */
    public static final /* data */ class e implements InterfaceC15275d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final C1043d f15266a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final a f15267b;

        public e(@k C1043d c1043d, @k a aVar) {
            this.f15266a = c1043d;
            this.f15267b = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.f15266a, eVar.f15266a) && L.f(this.f15267b, eVar.f15267b);
        }

        public final int hashCode() {
            return this.f15267b.hashCode() + (this.f15266a.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "StartEnd(start=" + this.f15266a + ", end=" + this.f15267b + ')';
        }
    }
}
