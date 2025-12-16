package hc;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.event.auto_select.FromPage;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SelectButtonClickedEvent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lhc/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "a", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: hc.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* data */ class C40911a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final C11264a f397284g = new C11264a(null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final FromPage f397285b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f397286c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f397287d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f397288e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f397289f;

    /* compiled from: SelectButtonClickedEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhc/a$a;", "", "<init>", "()V", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: hc.a$a, reason: collision with other inner class name */
    public static final class C11264a {
        public /* synthetic */ C11264a(C42822w c42822w) {
            this();
        }

        public C11264a() {
        }
    }

    public C40911a(@k FromPage fromPage, @k String str, @l String str2, @l String str3) {
        this.f397285b = fromPage;
        this.f397286c = str;
        this.f397287d = str2;
        this.f397288e = str3;
        this.f397289f = new ParametrizedClickStreamEvent(8109, 2, C35755b0.c(P0.j(new Q("iid", str2), new Q("from_page", fromPage.f90021b), new Q("target_page", str), new Q("component_slug", str3))), null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40911a)) {
            return false;
        }
        C40911a c40911a = (C40911a) obj;
        return this.f397285b == c40911a.f397285b && L.f(this.f397286c, c40911a.f397286c) && L.f(this.f397287d, c40911a.f397287d) && L.f(this.f397288e, c40911a.f397288e);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f397289f.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f397289f.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f397289f.f90248c;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f397285b.hashCode() * 31, 31, this.f397286c);
        String str = this.f397287d;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f397288e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectButtonClickedEvent(fromPage=");
        sb2.append(this.f397285b);
        sb2.append(", buttonTitle=");
        sb2.append(this.f397286c);
        sb2.append(", advertId=");
        sb2.append(this.f397287d);
        sb2.append(", componentSlug=");
        return C22026a.c(sb2, this.f397288e, ')');
    }

    public /* synthetic */ C40911a(FromPage fromPage, String str, String str2, String str3, int i12, C42822w c42822w) {
        this(fromPage, str, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? null : str3);
    }
}
