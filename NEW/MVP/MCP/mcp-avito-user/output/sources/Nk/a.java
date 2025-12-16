package NK;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: IacCallLauncher.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"LNK/a;", "", "a", "b", "_avito_iac-dialer_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface a {

    /* compiled from: IacCallLauncher.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNK/a$a;", "", "_avito_iac-dialer_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: NK.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0728a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f11363a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f11364b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f11365c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f11366d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f11367e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final Long f11368f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final Map<String, String> f11369g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final Map<String, String> f11370h;

        public C0728a(@k String str, @k String str2, boolean z12, @k String str3, @k String str4, @l Long l12, @l Map map, @l Map map2) {
            this.f11363a = str;
            this.f11364b = str2;
            this.f11365c = str3;
            this.f11366d = str4;
            this.f11367e = z12;
            this.f11368f = l12;
            this.f11369g = map;
            this.f11370h = map2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0728a)) {
                return false;
            }
            C0728a c0728a = (C0728a) obj;
            return L.f(this.f11363a, c0728a.f11363a) && L.f(this.f11364b, c0728a.f11364b) && L.f(this.f11365c, c0728a.f11365c) && L.f(this.f11366d, c0728a.f11366d) && this.f11367e == c0728a.f11367e && L.f(this.f11368f, c0728a.f11368f) && L.f(this.f11369g, c0728a.f11369g) && L.f(this.f11370h, c0728a.f11370h);
        }

        public final int hashCode() {
            int i12 = r.i(H.d(H.d(H.d(this.f11363a.hashCode() * 31, 31, this.f11364b), 31, this.f11365c), 31, this.f11366d), 31, this.f11367e);
            Long l12 = this.f11368f;
            int iHashCode = (i12 + (l12 == null ? 0 : l12.hashCode())) * 31;
            Map<String, String> map = this.f11369g;
            int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
            Map<String, String> map2 = this.f11370h;
            return iHashCode2 + (map2 != null ? map2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("StartNewCallParams(callId=");
            sb2.append(this.f11363a);
            sb2.append(", from=");
            sb2.append(this.f11364b);
            sb2.append(", to=");
            sb2.append(this.f11365c);
            sb2.append(", scenario=");
            sb2.append(this.f11366d);
            sb2.append(", isVideo=");
            sb2.append(this.f11367e);
            sb2.append(", itemId=");
            sb2.append(this.f11368f);
            sb2.append(", extraInfo=");
            sb2.append(this.f11369g);
            sb2.append(", analyticsExtraParams=");
            return r.w(sb2, this.f11370h, ')');
        }
    }

    /* compiled from: IacCallLauncher.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNK/a$b;", "", "_avito_iac-dialer_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f11371a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f11372b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f11373c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f11374d;

        public b(@k String str, @k String str2, @k String str3, boolean z12) {
            this.f11371a = str;
            this.f11372b = str2;
            this.f11373c = str3;
            this.f11374d = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f11371a, bVar.f11371a) && L.f(this.f11372b, bVar.f11372b) && L.f(this.f11373c, bVar.f11373c) && this.f11374d == bVar.f11374d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f11374d) + H.d(H.d(this.f11371a.hashCode() * 31, 31, this.f11372b), 31, this.f11373c);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("StartRecallFromSystemApiParams(callId=");
            sb2.append(this.f11371a);
            sb2.append(", scenario=");
            sb2.append(this.f11372b);
            sb2.append(", prevCallId=");
            sb2.append(this.f11373c);
            sb2.append(", isVideo=");
            return r.x(sb2, this.f11374d, ')');
        }
    }

    void a(@k b bVar);

    void b(@k C0728a c0728a);
}
