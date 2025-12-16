package mh;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;

/* compiled from: BblNextStepClickEvent.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmh/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: mh.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* data */ class C44081a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final int f414659b;

    /* renamed from: c, reason: collision with root package name */
    public final int f414660c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<Integer> f414661d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final List<Integer> f414662e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f414663f;

    public C44081a(int i12, int i13, @k List<Integer> list, @k List<Integer> list2) {
        this.f414659b = i12;
        this.f414660c = i13;
        this.f414661d = list;
        this.f414662e = list2;
        this.f414663f = new ParametrizedClickStreamEvent(11343, 3, P0.g(new Q("bbl_chosen_option", Integer.valueOf(i12)), new Q("bbl_chosen_limit", Integer.valueOf(i13)), new Q("bbl_focused_options", list), new Q("bbl_focused_limits", list2)), null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44081a)) {
            return false;
        }
        C44081a c44081a = (C44081a) obj;
        return this.f414659b == c44081a.f414659b && this.f414660c == c44081a.f414660c && L.f(this.f414661d, c44081a.f414661d) && L.f(this.f414662e, c44081a.f414662e);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f414663f.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f414663f.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f414663f.f90248c;
    }

    public final int hashCode() {
        return this.f414662e.hashCode() + H.e(r.e(this.f414660c, Integer.hashCode(this.f414659b) * 31, 31), 31, this.f414661d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BblNextStepClickEvent(chosenOption=");
        sb2.append(this.f414659b);
        sb2.append(", chosenLimit=");
        sb2.append(this.f414660c);
        sb2.append(", focusedOptions=");
        sb2.append(this.f414661d);
        sb2.append(", focusedLimits=");
        return H.p(sb2, this.f414662e, ')');
    }
}
