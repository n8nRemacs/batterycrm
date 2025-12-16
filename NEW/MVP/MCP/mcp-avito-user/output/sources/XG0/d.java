package XG0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.analytics.screens.mvi.q;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: UserAddressListMviState.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"LXG0/d;", "Lcom/avito/android/analytics/screens/mvi/q;", "<init>", "()V", "a", "b", "c", "d", "e", "f", "LXG0/d$a;", "LXG0/d$c;", "LXG0/d$d;", "LXG0/d$e;", "LXG0/d$f;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class d extends q {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final b f18800b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final e f18801c = e.f18808d;

    /* compiled from: UserAddressListMviState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LXG0/d$a;", "LXG0/d;", "<init>", "()V", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends d {

        /* renamed from: d, reason: collision with root package name */
        @k
        public static final a f18802d = new a();

        public a() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -548575404;
        }

        @k
        public final String toString() {
            return "ApiError";
        }
    }

    /* compiled from: UserAddressListMviState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LXG0/d$b;", "", "<init>", "()V", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: UserAddressListMviState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LXG0/d$c;", "LXG0/d;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends d {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final ArrayList f18803d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f18804e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f18805f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f18806g;

        public c(@l String str, @k ArrayList arrayList, boolean z12, boolean z13) {
            super(null);
            this.f18803d = arrayList;
            this.f18804e = str;
            this.f18805f = z12;
            this.f18806g = z13;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f18803d, cVar.f18803d) && L.f(this.f18804e, cVar.f18804e) && this.f18805f == cVar.f18805f && this.f18806g == cVar.f18806g;
        }

        public final int hashCode() {
            int iHashCode = this.f18803d.hashCode() * 31;
            String str = this.f18804e;
            return Boolean.hashCode(this.f18806g) + r.i((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f18805f);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Data(data=");
            sb2.append(this.f18803d);
            sb2.append(", title=");
            sb2.append(this.f18804e);
            sb2.append(", isAddAddressEnabled=");
            sb2.append(this.f18805f);
            sb2.append(", isInfoBannerShow=");
            return r.x(sb2, this.f18806g, ')');
        }
    }

    /* compiled from: UserAddressListMviState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LXG0/d$d;", "LXG0/d;", "<init>", "()V", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: XG0.d$d, reason: collision with other inner class name */
    public static final /* data */ class C1326d extends d {

        /* renamed from: d, reason: collision with root package name */
        @k
        public static final C1326d f18807d = new C1326d();

        public C1326d() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C1326d);
        }

        public final int hashCode() {
            return 1807449031;
        }

        @k
        public final String toString() {
            return "Empty";
        }
    }

    /* compiled from: UserAddressListMviState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LXG0/d$e;", "LXG0/d;", "<init>", "()V", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e extends d {

        /* renamed from: d, reason: collision with root package name */
        @k
        public static final e f18808d = new e();

        public e() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -1604053204;
        }

        @k
        public final String toString() {
            return "Load";
        }
    }

    /* compiled from: UserAddressListMviState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LXG0/d$f;", "LXG0/d;", "<init>", "()V", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f extends d {

        /* renamed from: d, reason: collision with root package name */
        @k
        public static final f f18809d = new f();

        public f() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 1390239936;
        }

        @k
        public final String toString() {
            return "NetworkError";
        }
    }

    public /* synthetic */ d(C42822w c42822w) {
        this();
    }

    public d() {
    }
}
