package Dc0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.BeduinV2;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ProfileSummaryFeatureState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LDc0/f;", "", "a", "_avito_profile-tab_summary_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f3276a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.profile_tab.summary.e f3277b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ZS.b f3278c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a f3279d;

    /* compiled from: ProfileSummaryFeatureState.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LDc0/f$a;", "", "a", "b", "c", "d", "LDc0/f$a$a;", "LDc0/f$a$b;", "LDc0/f$a$c;", "LDc0/f$a$d;", "_avito_profile-tab_summary_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {

        /* compiled from: ProfileSummaryFeatureState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDc0/f$a$a;", "LDc0/f$a;", "_avito_profile-tab_summary_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Dc0.f$a$a, reason: collision with other inner class name */
        public static final /* data */ class C0174a implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final ZS.b f3280a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final BeduinV2 f3281b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final List<String> f3282c;

            public C0174a(@k ZS.b bVar, @k BeduinV2 beduinV2, @k List<String> list) {
                this.f3280a = bVar;
                this.f3281b = beduinV2;
                this.f3282c = list;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0174a)) {
                    return false;
                }
                C0174a c0174a = (C0174a) obj;
                return L.f(this.f3280a, c0174a.f3280a) && L.f(this.f3281b, c0174a.f3281b) && L.f(this.f3282c, c0174a.f3282c);
            }

            public final int hashCode() {
                return this.f3282c.hashCode() + ((this.f3281b.hashCode() + (this.f3280a.hashCode() * 31)) * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Content(scenarioIdentity=");
                sb2.append(this.f3280a);
                sb2.append(", content=");
                sb2.append(this.f3281b);
                sb2.append(", blockIds=");
                return H.p(sb2, this.f3282c, ')');
            }
        }

        /* compiled from: ProfileSummaryFeatureState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDc0/f$a$b;", "LDc0/f$a;", "_avito_profile-tab_summary_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final ApiError f3283a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final Throwable f3284b;

            public b(@k ApiError apiError, @l Throwable th2) {
                this.f3283a = apiError;
                this.f3284b = th2;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return L.f(this.f3283a, bVar.f3283a) && L.f(this.f3284b, bVar.f3284b);
            }

            public final int hashCode() {
                int iHashCode = this.f3283a.hashCode() * 31;
                Throwable th2 = this.f3284b;
                return iHashCode + (th2 == null ? 0 : th2.hashCode());
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Error(apiError=");
                sb2.append(this.f3283a);
                sb2.append(", cause=");
                return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f3284b, ')');
            }
        }

        /* compiled from: ProfileSummaryFeatureState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LDc0/f$a$c;", "LDc0/f$a;", "<init>", "()V", "_avito_profile-tab_summary_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final c f3285a = new c();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -690076656;
            }

            @k
            public final String toString() {
                return "Loading";
            }
        }

        /* compiled from: ProfileSummaryFeatureState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LDc0/f$a$d;", "LDc0/f$a;", "<init>", "()V", "_avito_profile-tab_summary_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class d implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final d f3286a = new d();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return -1841734428;
            }

            @k
            public final String toString() {
                return "None";
            }
        }
    }

    public f(@k String str, @k com.avito.android.profile_tab.summary.e eVar, @k ZS.b bVar, @k a aVar) {
        this.f3276a = str;
        this.f3277b = eVar;
        this.f3278c = bVar;
        this.f3279d = aVar;
    }

    public static f a(f fVar, com.avito.android.profile_tab.summary.e eVar, a aVar, int i12) {
        String str = fVar.f3276a;
        if ((i12 & 2) != 0) {
            eVar = fVar.f3277b;
        }
        ZS.b bVar = fVar.f3278c;
        if ((i12 & 8) != 0) {
            aVar = fVar.f3279d;
        }
        fVar.getClass();
        return new f(str, eVar, bVar, aVar);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return L.f(this.f3276a, fVar.f3276a) && L.f(this.f3277b, fVar.f3277b) && L.f(this.f3278c, fVar.f3278c) && L.f(this.f3279d, fVar.f3279d);
    }

    public final int hashCode() {
        return this.f3279d.hashCode() + ((this.f3278c.hashCode() + ((this.f3277b.hashCode() + (this.f3276a.hashCode() * 31)) * 31)) * 31);
    }

    @k
    public final String toString() {
        return "ProfileSummaryFeatureState(itemViewType=" + this.f3276a + ", params=" + this.f3277b + ", scenarioIdentity=" + this.f3278c + ", data=" + this.f3279d + ')';
    }

    public /* synthetic */ f(String str, com.avito.android.profile_tab.summary.e eVar, ZS.b bVar, a aVar, int i12, C42822w c42822w) {
        this(str, eVar, bVar, (i12 & 8) != 0 ? a.d.f3286a : aVar);
    }
}
