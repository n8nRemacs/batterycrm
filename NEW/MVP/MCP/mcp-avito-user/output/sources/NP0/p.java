package NP0;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: LocationParameter.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LNP0/p;", "", "a", "b", "LNP0/p$a;", "LNP0/p$b;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface p {

    /* compiled from: LocationParameter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNP0/p$a;", "LNP0/p;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements p {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f11508a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f11509b;

        public a(boolean z12, boolean z13) {
            this.f11508a = z12;
            this.f11509b = z13;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f11508a == aVar.f11508a && this.f11509b == aVar.f11509b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f11509b) + (Boolean.hashCode(this.f11508a) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Default(hasPopularLocations=");
            sb2.append(this.f11508a);
            sb2.append(", hasFastRecentSearches=");
            return androidx.appcompat.app.r.x(sb2, this.f11509b, ')');
        }
    }

    /* compiled from: LocationParameter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNP0/p$b;", "LNP0/p;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements p {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f11510a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f11511b;

        public b(boolean z12, boolean z13) {
            this.f11510a = z12;
            this.f11511b = z13;
        }

        public static b a(b bVar, boolean z12, boolean z13, int i12) {
            if ((i12 & 1) != 0) {
                z12 = bVar.f11510a;
            }
            if ((i12 & 2) != 0) {
                z13 = bVar.f11511b;
            }
            bVar.getClass();
            return new b(z12, z13);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f11510a == bVar.f11510a && this.f11511b == bVar.f11511b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f11511b) + (Boolean.hashCode(this.f11510a) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("GeoInputExpanded(isSuggestsSkeletonVisible=");
            sb2.append(this.f11510a);
            sb2.append(", isRecentSearchProcessing=");
            return androidx.appcompat.app.r.x(sb2, this.f11511b, ')');
        }

        public /* synthetic */ b(boolean z12, boolean z13, int i12, C42822w c42822w) {
            this(z12, (i12 & 2) != 0 ? false : z13);
        }
    }
}
