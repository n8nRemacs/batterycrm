package vc0;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: ExtendedProfileAddExamplePhotoEvent.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lvc0/c;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vc0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C49304c implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f440895b;

    public C49304c(@Y61.k String str) {
        this.f440895b = new ParametrizedClickStreamEvent(5338, 0, "ext_profile_add_example_photo", Collections.singletonMap("uid", str));
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF19127b() {
        return this.f440895b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f440895b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF11770c() {
        return this.f440895b.f90248c;
    }
}
