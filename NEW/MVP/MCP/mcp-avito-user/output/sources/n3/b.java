package N3;

import Y61.k;
import Y61.l;
import com.avito.android.adapter.analytic.ReviewPageFrom;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.remote.model.AvatarStatus;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: ReviewPhotoOpenEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LN3/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_rating_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f11177b;

    public b(int i12, @l Long l12, @k String str, @l String str2) {
        this.f11177b = new ParametrizedClickStreamEvent(4687, 3, C35755b0.c(P0.g(new Q("review_id", l12), new Q("photo_position", Integer.valueOf(i12)), new Q("page_from", str), new Q("review_type", str2))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f11177b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f11177b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f11177b.f90248c;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b(Long l12, int i12, String str, String str2, int i13, C42822w c42822w) {
        if ((i13 & 4) != 0) {
            ReviewPageFrom[] reviewPageFromArr = ReviewPageFrom.f68398b;
            str = AvatarStatus.REVIEW;
        }
        this(i12, l12, str, str2);
    }
}
