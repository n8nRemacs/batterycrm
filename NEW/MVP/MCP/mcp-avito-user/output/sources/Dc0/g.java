package Dc0;

import Y61.k;
import Y61.l;
import com.avito.android.remote.error.ApiError;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ProfileSummaryState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LDc0/g;", "", "a", "_avito_profile-tab_summary_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.profile_tab.summary.e f3287a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ZS.b f3288b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final a f3289c;

    /* compiled from: ProfileSummaryState.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LDc0/g$a;", "", "a", "b", "c", "d", "LDc0/g$a$a;", "LDc0/g$a$b;", "LDc0/g$a$c;", "LDc0/g$a$d;", "_avito_profile-tab_summary_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {

        /* compiled from: ProfileSummaryState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDc0/g$a$a;", "LDc0/g$a;", "_avito_profile-tab_summary_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Dc0.g$a$a, reason: collision with other inner class name */
        public static final /* data */ class C0175a implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final LinkedHashMap f3290a;

            public C0175a(@k LinkedHashMap linkedHashMap) {
                this.f3290a = linkedHashMap;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0175a) && this.f3290a.equals(((C0175a) obj).f3290a);
            }

            public final int hashCode() {
                return this.f3290a.hashCode();
            }

            @k
            public final String toString() {
                return org.webrtc.h.e(new StringBuilder("Content(itemsById="), this.f3290a, ')');
            }
        }

        /* compiled from: ProfileSummaryState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDc0/g$a$b;", "LDc0/g$a;", "_avito_profile-tab_summary_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final ApiError f3291a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final Throwable f3292b;

            public b(@k ApiError apiError, @l Throwable th2) {
                this.f3291a = apiError;
                this.f3292b = th2;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return L.f(this.f3291a, bVar.f3291a) && L.f(this.f3292b, bVar.f3292b);
            }

            public final int hashCode() {
                int iHashCode = this.f3291a.hashCode() * 31;
                Throwable th2 = this.f3292b;
                return iHashCode + (th2 == null ? 0 : th2.hashCode());
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Error(apiError=");
                sb2.append(this.f3291a);
                sb2.append(", cause=");
                return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f3292b, ')');
            }
        }

        /* compiled from: ProfileSummaryState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LDc0/g$a$c;", "LDc0/g$a;", "<init>", "()V", "_avito_profile-tab_summary_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final c f3293a = new c();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 596138410;
            }

            @k
            public final String toString() {
                return "Loading";
            }
        }

        /* compiled from: ProfileSummaryState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LDc0/g$a$d;", "LDc0/g$a;", "<init>", "()V", "_avito_profile-tab_summary_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class d implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final d f3294a = new d();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return -1554072182;
            }

            @k
            public final String toString() {
                return "None";
            }
        }
    }

    public g(@k com.avito.android.profile_tab.summary.e eVar, @k ZS.b bVar, @k a aVar) {
        this.f3287a = eVar;
        this.f3288b = bVar;
        this.f3289c = aVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return L.f(this.f3287a, gVar.f3287a) && L.f(this.f3288b, gVar.f3288b) && L.f(this.f3289c, gVar.f3289c);
    }

    public final int hashCode() {
        return this.f3289c.hashCode() + ((this.f3288b.hashCode() + (this.f3287a.hashCode() * 31)) * 31);
    }

    @k
    public final String toString() {
        return "ProfileSummaryState(params=" + this.f3287a + ", scenarioIdentity=" + this.f3288b + ", data=" + this.f3289c + ')';
    }

    public /* synthetic */ g(com.avito.android.profile_tab.summary.e eVar, ZS.b bVar, a aVar, int i12, C42822w c42822w) {
        this(eVar, bVar, (i12 & 4) != 0 ? a.d.f3294a : aVar);
    }
}
