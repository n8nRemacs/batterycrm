package Xd;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;

/* compiled from: OnefTrackStatusEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LXd/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_auth-tracker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Xd.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* data */ class C16991b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f18984b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f18985c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f18986d;

    public C16991b(@k String str, boolean z12) {
        this.f18984b = str;
        this.f18985c = z12;
        this.f18986d = new ParametrizedClickStreamEvent(9020, 3, P0.g(new Q("one_f_session_id", str), new Q("success", Boolean.valueOf(z12))), null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16991b)) {
            return false;
        }
        C16991b c16991b = (C16991b) obj;
        return L.f(this.f18984b, c16991b.f18984b) && this.f18985c == c16991b.f18985c;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF270967b() {
        return this.f18986d.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f18986d.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF270968c() {
        return this.f18986d.f90248c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f18985c) + (this.f18984b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OnefTrackStatusEvent(id=");
        sb2.append(this.f18984b);
        sb2.append(", isSucceeded=");
        return r.x(sb2, this.f18985c, ')');
    }
}
