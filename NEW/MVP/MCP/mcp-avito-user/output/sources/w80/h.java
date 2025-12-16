package W80;

import W80.d;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PositionInfoState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LW80/h;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class h extends q {

    /* renamed from: b, reason: collision with root package name */
    public final long f17796b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f17797c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a f17798d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final d f17799e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Set<String> f17800f;

    /* compiled from: PositionInfoState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LW80/h$a;", "", "a", "b", "LW80/h$a$a;", "LW80/h$a$b;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {

        /* compiled from: PositionInfoState.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LW80/h$a$a;", "LW80/h$a;", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: W80.h$a$a, reason: collision with other inner class name */
        public static final /* data */ class C1255a implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C1255a f17801a = new C1255a();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C1255a);
            }

            public final int hashCode() {
                return -613074534;
            }

            @k
            public final String toString() {
                return "ByDefault";
            }
        }

        /* compiled from: PositionInfoState.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LW80/h$a$b;", "LW80/h$a;", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final b f17802a = new b();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -306886527;
            }

            @k
            public final String toString() {
                return "ByLazyInitAction";
            }
        }
    }

    public h(long j12, String str, a aVar, d dVar, Set set, int i12, C42822w c42822w) {
        this(j12, str, (i12 & 4) != 0 ? a.C1255a.f17801a : aVar, (i12 & 8) != 0 ? d.C1254d.f17789a : dVar, (i12 & 16) != 0 ? B0.f406639b : set);
    }

    public static h a(h hVar, String str, d dVar, Set set, int i12) {
        long j12 = hVar.f17796b;
        if ((i12 & 2) != 0) {
            str = hVar.f17797c;
        }
        String str2 = str;
        a aVar = hVar.f17798d;
        if ((i12 & 16) != 0) {
            set = hVar.f17800f;
        }
        hVar.getClass();
        return new h(j12, str2, aVar, dVar, set);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f17796b == hVar.f17796b && L.f(this.f17797c, hVar.f17797c) && L.f(this.f17798d, hVar.f17798d) && L.f(this.f17799e, hVar.f17799e) && L.f(this.f17800f, hVar.f17800f);
    }

    public final int hashCode() {
        return this.f17800f.hashCode() + ((this.f17799e.hashCode() + ((this.f17798d.hashCode() + H.d(Long.hashCode(this.f17796b) * 31, 31, this.f17797c)) * 31)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PositionInfoState(itemId=");
        sb2.append(this.f17796b);
        sb2.append(", periodId=");
        sb2.append(this.f17797c);
        sb2.append(", initStrategy=");
        sb2.append(this.f17798d);
        sb2.append(", infoData=");
        sb2.append(this.f17799e);
        sb2.append(", closedBanners=");
        return AK.c.u(sb2, this.f17800f, ')');
    }

    public h(long j12, @k String str, @k a aVar, @k d dVar, @k Set<String> set) {
        this.f17796b = j12;
        this.f17797c = str;
        this.f17798d = aVar;
        this.f17799e = dVar;
        this.f17800f = set;
    }
}
