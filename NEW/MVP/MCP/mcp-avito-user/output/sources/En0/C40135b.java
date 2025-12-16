package en0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;

/* compiled from: ImageScrolledEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Len0/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_review-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: en0.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C40135b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f395362b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Long f395363c;

    /* renamed from: d, reason: collision with root package name */
    public final int f395364d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f395365e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f395366f;

    public C40135b(int i12, @l Long l12, @l String str, @k String str2) {
        this.f395362b = str;
        this.f395363c = l12;
        this.f395364d = i12;
        this.f395365e = str2;
        this.f395366f = new ParametrizedClickStreamEvent(11173, 2, "Просмотр фото в галерее отзывов", C35755b0.c(P0.g(new Q("uid", str), new Q("review_id", l12), new Q("from_source", str2), new Q("photo_position", Integer.valueOf(i12)))));
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40135b)) {
            return false;
        }
        C40135b c40135b = (C40135b) obj;
        return L.f(this.f395362b, c40135b.f395362b) && L.f(this.f395363c, c40135b.f395363c) && this.f395364d == c40135b.f395364d && L.f(this.f395365e, c40135b.f395365e);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF75431b() {
        return this.f395366f.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f395366f.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF75432c() {
        return this.f395366f.f90248c;
    }

    public final int hashCode() {
        String str = this.f395362b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l12 = this.f395363c;
        return this.f395365e.hashCode() + r.e(this.f395364d, (iHashCode + (l12 != null ? l12.hashCode() : 0)) * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImageScrolledEvent(userId=");
        sb2.append(this.f395362b);
        sb2.append(", reviewId=");
        sb2.append(this.f395363c);
        sb2.append(", position=");
        sb2.append(this.f395364d);
        sb2.append(", fromPage=");
        return C22026a.c(sb2, this.f395365e, ')');
    }
}
