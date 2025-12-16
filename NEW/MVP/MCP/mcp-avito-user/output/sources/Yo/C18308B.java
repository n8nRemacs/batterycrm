package Yo;

import androidx.compose.runtime.internal.P;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: EventOnPublish.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LYo/B;", "LYo/j;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Yo.B, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C18308B implements j {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Map<String, Object> f19661b;

    public C18308B(@Y61.k String str) {
        this.f19661b = Collections.singletonMap("phone", str);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF19687b() {
        return 10580;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f19661b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF19688c() {
        return 0;
    }
}
