package Cd0;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.publish.scanner_v2.analytics.ScannerFromPage;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ItemAddAutoStsPhotoStart.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCd0/c0;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Cd0.c0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C13255c0 implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final kotlin.Q<String, String> f2427b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f2428c;

    public C13255c0(@Y61.k kotlin.Q<String, String> q12, @Y61.l ScannerFromPage scannerFromPage) {
        this.f2427b = q12;
        LinkedHashMap linkedHashMapJ = kotlin.collections.P0.j(q12);
        if (scannerFromPage != null) {
            linkedHashMapJ.put("from_page", scannerFromPage.f239338b);
        }
        kotlin.G0 g02 = kotlin.G0.f406611a;
        this.f2428c = new ParametrizedClickStreamEvent(2872, 1, linkedHashMapJ, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83080b() {
        return this.f2428c.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f2428c.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83081c() {
        return this.f2428c.f90248c;
    }

    @Y61.k
    public final String toString() {
        return com.avito.android.authorization.auto_recovery.phone_confirm.b.i(new StringBuilder("ItemAddAutoStsPhotoStart(eventId = 2872, sessionId="), this.f2427b, ')');
    }

    public /* synthetic */ C13255c0(kotlin.Q q12, ScannerFromPage scannerFromPage, int i12, C42822w c42822w) {
        this(q12, (i12 & 2) != 0 ? null : scannerFromPage);
    }
}
