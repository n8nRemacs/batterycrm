package Q20;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.UserAddressLink;
import com.avito.android.multigeo_flow.domain.AddressItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: JobMultiGeoActions.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"LQ20/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "LQ20/a$a;", "LQ20/a$b;", "LQ20/a$c;", "LQ20/a$d;", "LQ20/a$e;", "LQ20/a$f;", "LQ20/a$g;", "LQ20/a$h;", "_avito_multigeo-flow_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface a {

    /* compiled from: JobMultiGeoActions.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQ20/a$a;", "LQ20/a;", "_avito_multigeo-flow_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Q20.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0881a implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final UserAddressLink.Result.Success.Added f13423a;

        public C0881a(@k UserAddressLink.Result.Success.Added added) {
            this.f13423a = added;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0881a) && L.f(this.f13423a, ((C0881a) obj).f13423a);
        }

        public final int hashCode() {
            return this.f13423a.hashCode();
        }

        @k
        public final String toString() {
            return "AddAddress(result=" + this.f13423a + ')';
        }
    }

    /* compiled from: JobMultiGeoActions.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LQ20/a$b;", "LQ20/a;", "<init>", "()V", "_avito_multigeo-flow_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f13424a = new b();
    }

    /* compiled from: JobMultiGeoActions.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQ20/a$c;", "LQ20/a;", "_avito_multigeo-flow_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final AddressItem f13425a;

        public c(@k AddressItem addressItem) {
            this.f13425a = addressItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f13425a, ((c) obj).f13425a);
        }

        public final int hashCode() {
            return this.f13425a.hashCode();
        }

        @k
        public final String toString() {
            return "AddressClicked(item=" + this.f13425a + ')';
        }
    }

    /* compiled from: JobMultiGeoActions.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LQ20/a$d;", "LQ20/a;", "<init>", "()V", "_avito_multigeo-flow_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f13426a = new d();
    }

    /* compiled from: JobMultiGeoActions.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQ20/a$e;", "LQ20/a;", "_avito_multigeo-flow_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final AddressItem f13427a;

        public e(@k AddressItem addressItem) {
            this.f13427a = addressItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f13427a, ((e) obj).f13427a);
        }

        public final int hashCode() {
            return this.f13427a.hashCode();
        }

        @k
        public final String toString() {
            return "DeleteAddressClicked(item=" + this.f13427a + ')';
        }
    }

    /* compiled from: JobMultiGeoActions.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQ20/a$f;", "LQ20/a;", "_avito_multigeo-flow_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final UserAddressLink.Result.Success.Modified f13428a;

        public f(@k UserAddressLink.Result.Success.Modified modified) {
            this.f13428a = modified;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f13428a, ((f) obj).f13428a);
        }

        public final int hashCode() {
            return this.f13428a.hashCode();
        }

        @k
        public final String toString() {
            return "EditAddress(result=" + this.f13428a + ')';
        }
    }

    /* compiled from: JobMultiGeoActions.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQ20/a$g;", "LQ20/a;", "_avito_multigeo-flow_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final AddressItem f13429a;

        public g(@k AddressItem addressItem) {
            this.f13429a = addressItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f13429a, ((g) obj).f13429a);
        }

        public final int hashCode() {
            return this.f13429a.hashCode();
        }

        @k
        public final String toString() {
            return "EditAddressClicked(item=" + this.f13429a + ')';
        }
    }

    /* compiled from: JobMultiGeoActions.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LQ20/a$h;", "LQ20/a;", "<init>", "()V", "_avito_multigeo-flow_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class h implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final h f13430a = new h();
    }
}
