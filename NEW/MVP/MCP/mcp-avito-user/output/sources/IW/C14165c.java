package Iw;

import Iw.d;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.model.District;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.metro_lines.MetroResponseBody;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: LocationGroupState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LIw/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Iw.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C14165c extends q {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final a f8620g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final C14165c f8621h = new C14165c(SearchParams.INSTANCE.getEMPTY(), null, null, false, d.b.f8628a);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SearchParams f8622b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final List<District> f8623c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final MetroResponseBody f8624d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8625e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final d f8626f;

    /* compiled from: LocationGroupState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LIw/c$a;", "", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Iw.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C14165c(@k SearchParams searchParams, @l List<District> list, @l MetroResponseBody metroResponseBody, boolean z12, @k d dVar) {
        this.f8622b = searchParams;
        this.f8623c = list;
        this.f8624d = metroResponseBody;
        this.f8625e = z12;
        this.f8626f = dVar;
    }

    public static C14165c a(C14165c c14165c, SearchParams searchParams, List list, MetroResponseBody metroResponseBody, d dVar, int i12) {
        if ((i12 & 1) != 0) {
            searchParams = c14165c.f8622b;
        }
        SearchParams searchParams2 = searchParams;
        if ((i12 & 2) != 0) {
            list = c14165c.f8623c;
        }
        List list2 = list;
        if ((i12 & 4) != 0) {
            metroResponseBody = c14165c.f8624d;
        }
        MetroResponseBody metroResponseBody2 = metroResponseBody;
        boolean z12 = c14165c.f8625e;
        if ((i12 & 16) != 0) {
            dVar = c14165c.f8626f;
        }
        c14165c.getClass();
        return new C14165c(searchParams2, list2, metroResponseBody2, z12, dVar);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14165c)) {
            return false;
        }
        C14165c c14165c = (C14165c) obj;
        return L.f(this.f8622b, c14165c.f8622b) && L.f(this.f8623c, c14165c.f8623c) && L.f(this.f8624d, c14165c.f8624d) && this.f8625e == c14165c.f8625e && L.f(this.f8626f, c14165c.f8626f);
    }

    public final int hashCode() {
        int iHashCode = this.f8622b.hashCode() * 31;
        List<District> list = this.f8623c;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        MetroResponseBody metroResponseBody = this.f8624d;
        return this.f8626f.hashCode() + r.i((iHashCode2 + (metroResponseBody != null ? metroResponseBody.hashCode() : 0)) * 31, 31, this.f8625e);
    }

    @k
    public final String toString() {
        return "LocationGroupState(searchParams=" + this.f8622b + ", districts=" + this.f8623c + ", metroResponseBody=" + this.f8624d + ", screenShownAnalyticsEventWasSent=" + this.f8625e + ", viewState=" + this.f8626f + ')';
    }
}
