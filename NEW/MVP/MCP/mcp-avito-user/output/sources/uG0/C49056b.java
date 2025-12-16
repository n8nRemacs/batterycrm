package ug0;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.util.C35755b0;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: RatingAddAnswerPhotoPickerOpenEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lug0/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ug0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C49056b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f440221b;

    public C49056b(@l Long l12) {
        this.f440221b = new ParametrizedClickStreamEvent(7291, 1, C35755b0.c(Collections.singletonMap("review_id", l12)), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF19677b() {
        return this.f440221b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f440221b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF19678c() {
        return this.f440221b.f90248c;
    }
}
