package oG0;

import Y61.k;
import Y61.l;
import android.graphics.Bitmap;
import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.avito_map.AvitoMapMarker;
import com.avito.android.avito_map.AvitoMapPoint;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import pG0.InterfaceC46949a;
import qG0.C47291b;

/* compiled from: UniversalMapView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"LoG0/d;", "LpG0/a;", "a", "b", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: oG0.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC44640d extends InterfaceC46949a {

    /* compiled from: UniversalMapView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LoG0/d$a;", "", "a", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: oG0.d$a */
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f419645a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AvitoMapPoint f419646b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final C12180a f419647c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final AvitoMapMarker.Anchor f419648d;

        /* renamed from: e, reason: collision with root package name */
        public final float f419649e;

        /* compiled from: UniversalMapView.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LoG0/d$a$a;", "", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: oG0.d$a$a, reason: collision with other inner class name */
        public static final class C12180a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final Bitmap f419650a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f419651b;

            /* renamed from: c, reason: collision with root package name */
            public final boolean f419652c;

            /* renamed from: d, reason: collision with root package name */
            @k
            public String f419653d;

            public C12180a(Bitmap bitmap, boolean z12, boolean z13, String str, int i12, C42822w c42822w) {
                z12 = (i12 & 2) != 0 ? false : z12;
                z13 = (i12 & 4) != 0 ? false : z13;
                str = (i12 & 8) != 0 ? "" : str;
                this.f419650a = bitmap;
                this.f419651b = z12;
                this.f419652c = z13;
                this.f419653d = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C12180a)) {
                    return false;
                }
                C12180a c12180a = (C12180a) obj;
                return this.f419651b == c12180a.f419651b && this.f419652c == c12180a.f419652c && L.f(this.f419653d, c12180a.f419653d);
            }

            public final int hashCode() {
                return this.f419653d.hashCode() + r.i(Boolean.hashCode(this.f419651b) * 31, 31, this.f419652c);
            }
        }

        public a(@k String str, @k AvitoMapPoint avitoMapPoint, @k C12180a c12180a, @k AvitoMapMarker.Anchor anchor, float f12) {
            this.f419645a = str;
            this.f419646b = avitoMapPoint;
            this.f419647c = c12180a;
            this.f419648d = anchor;
            this.f419649e = f12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f419645a, aVar.f419645a) && L.f(this.f419646b, aVar.f419646b) && L.f(this.f419647c, aVar.f419647c) && this.f419648d == aVar.f419648d && Float.compare(this.f419649e, aVar.f419649e) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f419649e) + ((this.f419648d.hashCode() + ((this.f419647c.hashCode() + ((this.f419646b.hashCode() + (this.f419645a.hashCode() * 31)) * 31)) * 31)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Marker(id=");
            sb2.append(this.f419645a);
            sb2.append(", latLng=");
            sb2.append(this.f419646b);
            sb2.append(", bitmap=");
            sb2.append(this.f419647c);
            sb2.append(", anchor=");
            sb2.append(this.f419648d);
            sb2.append(", zIndex=");
            return r.k(')', this.f419649e, sb2);
        }
    }

    /* compiled from: UniversalMapView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LoG0/d$b;", "", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: oG0.d$b */
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Set<a> f419654a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final C47291b f419655b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Boolean f419656c;

        public b(@k Set<a> set, @l C47291b c47291b, @l Boolean bool) {
            this.f419654a = set;
            this.f419655b = c47291b;
            this.f419656c = bool;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f419654a, bVar.f419654a) && L.f(this.f419655b, bVar.f419655b) && L.f(this.f419656c, bVar.f419656c);
        }

        public final int hashCode() {
            int iHashCode = this.f419654a.hashCode() * 31;
            C47291b c47291b = this.f419655b;
            int iHashCode2 = (iHashCode + (c47291b == null ? 0 : c47291b.hashCode())) * 31;
            Boolean bool = this.f419656c;
            return iHashCode2 + (bool != null ? bool.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("State(markers=");
            sb2.append(this.f419654a);
            sb2.append(", camera=");
            sb2.append(this.f419655b);
            sb2.append(", showProgress=");
            return C0.g(sb2, this.f419656c, ')');
        }

        public /* synthetic */ b(Set set, C47291b c47291b, Boolean bool, int i12, C42822w c42822w) {
            this(set, c47291b, (i12 & 4) != 0 ? null : bool);
        }
    }
}
