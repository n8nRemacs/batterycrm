package hc;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.event.auto_select.FromPage;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.builders.d;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SelectComponentShownEvent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lhc/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "a", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: hc.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* data */ class C40912b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final a f397290g = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f397291b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final FromPage f397292c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f397293d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f397294e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f397295f;

    /* compiled from: SelectComponentShownEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhc/b$a;", "", "<init>", "()V", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: hc.b$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static C40912b a(@k String str, @k String str2, @l String str3) {
            return new C40912b(FromPage.f90014d, str, str2, str3);
        }

        public a() {
        }
    }

    public C40912b(@k FromPage fromPage, @l String str, @l String str2, @l String str3) {
        this.f397291b = str;
        this.f397292c = fromPage;
        this.f397293d = str2;
        this.f397294e = str3;
        d dVar = new d();
        if (str != null) {
            dVar.put("iid", str);
        }
        dVar.put("from_page", fromPage.f90021b);
        if (str2 != null) {
            dVar.put("target_page", str2);
        }
        if (str3 != null) {
            dVar.put("component_slug", str3);
        }
        G0 g02 = G0.f406611a;
        this.f397295f = new ParametrizedClickStreamEvent(8108, 3, dVar.b(), null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40912b)) {
            return false;
        }
        C40912b c40912b = (C40912b) obj;
        return L.f(this.f397291b, c40912b.f397291b) && this.f397292c == c40912b.f397292c && L.f(this.f397293d, c40912b.f397293d) && L.f(this.f397294e, c40912b.f397294e);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f397295f.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f397295f.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f397295f.f90248c;
    }

    public final int hashCode() {
        String str = this.f397291b;
        int iHashCode = (this.f397292c.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        String str2 = this.f397293d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f397294e;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectComponentShownEvent(advertId=");
        sb2.append(this.f397291b);
        sb2.append(", fromPage=");
        sb2.append(this.f397292c);
        sb2.append(", title=");
        sb2.append(this.f397293d);
        sb2.append(", componentSlug=");
        return C22026a.c(sb2, this.f397294e, ')');
    }

    public /* synthetic */ C40912b(String str, FromPage fromPage, String str2, String str3, int i12, C42822w c42822w) {
        this(fromPage, (i12 & 1) != 0 ? null : str, str2, (i12 & 8) != 0 ? null : str3);
    }
}
