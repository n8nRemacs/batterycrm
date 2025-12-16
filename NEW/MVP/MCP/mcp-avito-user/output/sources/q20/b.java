package Q20;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.multigeo_flow.domain.AddressItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: JobMultiGeoActions.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"LQ20/b;", "", "a", "b", "c", "d", "e", "f", "g", "LQ20/b$a;", "LQ20/b$b;", "LQ20/b$c;", "LQ20/b$d;", "LQ20/b$e;", "LQ20/b$f;", "LQ20/b$g;", "_avito_multigeo-flow_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface b {

    /* compiled from: JobMultiGeoActions.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQ20/b$a;", "LQ20/b;", "_avito_multigeo-flow_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f13431a;

        public a(@k String str) {
            this.f13431a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f13431a, ((a) obj).f13431a);
        }

        public final int hashCode() {
            return this.f13431a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("CloseFlow(jwt="), this.f13431a, ')');
        }
    }

    /* compiled from: JobMultiGeoActions.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LQ20/b$b;", "LQ20/b;", "<init>", "()V", "_avito_multigeo-flow_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Q20.b$b, reason: collision with other inner class name */
    public static final class C0882b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0882b f13432a = new C0882b();
    }

    /* compiled from: JobMultiGeoActions.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQ20/b$c;", "LQ20/b;", "_avito_multigeo-flow_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final AddressItem f13433a;

        public c(@k AddressItem addressItem) {
            this.f13433a = addressItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f13433a, ((c) obj).f13433a);
        }

        public final int hashCode() {
            return this.f13433a.hashCode();
        }

        @k
        public final String toString() {
            return "OpenOptions(item=" + this.f13433a + ')';
        }
    }

    /* compiled from: JobMultiGeoActions.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQ20/b$d;", "LQ20/b;", "_avito_multigeo-flow_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f13434a;

        public d(@k String str) {
            this.f13434a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f13434a, ((d) obj).f13434a);
        }

        public final int hashCode() {
            return this.f13434a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowAdded(address="), this.f13434a, ')');
        }
    }

    /* compiled from: JobMultiGeoActions.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQ20/b$e;", "LQ20/b;", "_avito_multigeo-flow_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f13435a;

        public e(@k String str) {
            this.f13435a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f13435a, ((e) obj).f13435a);
        }

        public final int hashCode() {
            return this.f13435a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowDeleted(address="), this.f13435a, ')');
        }
    }

    /* compiled from: JobMultiGeoActions.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQ20/b$f;", "LQ20/b;", "_avito_multigeo-flow_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f13436a;

        public f(@k String str) {
            this.f13436a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f13436a, ((f) obj).f13436a);
        }

        public final int hashCode() {
            return this.f13436a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowEdited(address="), this.f13436a, ')');
        }
    }

    /* compiled from: JobMultiGeoActions.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LQ20/b$g;", "LQ20/b;", "<init>", "()V", "_avito_multigeo-flow_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class g implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final g f13437a = new g();
    }
}
