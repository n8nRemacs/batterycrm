package en0;

import Y61.k;
import Y61.l;
import androidx.media3.exoplayer.analytics.m;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;

/* compiled from: OpenBottomSheetEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Len0/c;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_review-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: en0.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C40136c implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f395367b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Long f395368c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f395369d;

    public C40136c(@l String str, @l Long l12) {
        this.f395367b = str;
        this.f395368c = l12;
        this.f395369d = new ParametrizedClickStreamEvent(11160, 1, "Открытие шторки с полным отзывом из галереи отзывов", C35755b0.c(P0.g(new Q("uid", str), new Q("review_id", l12))));
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40136c)) {
            return false;
        }
        C40136c c40136c = (C40136c) obj;
        return L.f(this.f395367b, c40136c.f395367b) && L.f(this.f395368c, c40136c.f395368c);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF82866b() {
        return this.f395369d.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f395369d.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF82867c() {
        return this.f395369d.f90248c;
    }

    public final int hashCode() {
        String str = this.f395367b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l12 = this.f395368c;
        return iHashCode + (l12 != null ? l12.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OpenBottomSheetEvent(userId=");
        sb2.append(this.f395367b);
        sb2.append(", reviewId=");
        return m.m(sb2, this.f395368c, ')');
    }
}
