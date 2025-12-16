package HP0;

import Y61.k;
import com.google.gson.annotations.c;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: WebViewInnerEvent.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u000b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\rR&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LHP0/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "", "eventId", "version", "", "", "", "params", "<init>", "(IILjava/util/Map;)V", "I", "getEventId", "()I", "getVersion", "Ljava/util/Map;", "getParams", "()Ljava/util/Map;", "_avito_webview_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements com.avito.android.analytics.provider.clickstream.a {

    @c("id")
    private final int eventId;

    @c("params")
    @k
    private final Map<String, Object> params;

    @c("version")
    private final int version;

    public b(int i12, int i13, @k Map<String, ? extends Object> map) {
        this.eventId = i12;
        this.version = i13;
        this.params = map;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    public final int getEventId() {
        return this.eventId;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.params;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    public final int getVersion() {
        return this.version;
    }
}
