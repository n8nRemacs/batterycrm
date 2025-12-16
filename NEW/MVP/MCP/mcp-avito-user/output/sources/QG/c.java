package Qg;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;

/* compiled from: EncodingErrorEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQg/c;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_barcode-encoder_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class c implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f13973b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f13974c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f13975d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f13976e;

    public c(@k String str, @k String str2, @k String str3) {
        this.f13973b = str;
        this.f13974c = str2;
        this.f13975d = str3;
        this.f13976e = new ParametrizedClickStreamEvent(7854, 2, "Ошибка генерации баркода", P0.g(new Q("barcode_type", str), new Q("barcode_string", str2), new Q(CrashHianalyticsData.STACK_TRACE, str3)));
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f13973b, cVar.f13973b) && L.f(this.f13974c, cVar.f13974c) && L.f(this.f13975d, cVar.f13975d);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF75431b() {
        return this.f13976e.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f13976e.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF75432c() {
        return this.f13976e.f90248c;
    }

    public final int hashCode() {
        return this.f13975d.hashCode() + H.d(this.f13973b.hashCode() * 31, 31, this.f13974c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EncodingErrorEvent(barcodeType=");
        sb2.append(this.f13973b);
        sb2.append(", barcodeString=");
        sb2.append(this.f13974c);
        sb2.append(", stackTrace=");
        return C22026a.c(sb2, this.f13975d, ')');
    }
}
