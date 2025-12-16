package com.avito.android.map_core.analytics.event;

import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ClickSelectDatesEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map_core/analytics/event/e;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito-discouraged_avito-libs_search-map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class e implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f185622b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f185623c;

    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e(@Y61.k java.lang.String r9) {
        /*
            r8 = this;
            r8.<init>()
            r8.f185622b = r9
            com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent r7 = new com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent
            int r0 = r9.hashCode()
            r1 = -1939100487(0xffffffff8c6bacb9, float:-1.8155718E-31)
            if (r0 == r1) goto L33
            r1 = -1217487446(0xffffffffb76e9daa, float:-1.42226145E-5)
            if (r0 == r1) goto L27
            r1 = 1880183383(0x70115257, float:1.7989948E29)
            if (r0 == r1) goto L1b
            goto L3b
        L1b:
            java.lang.String r0 = "collapsed"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L24
            goto L3b
        L24:
            java.lang.String r9 = "list_and_preview"
            goto L40
        L27:
            java.lang.String r0 = "hidden"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L30
            goto L3b
        L30:
            java.lang.String r9 = "only_map"
            goto L40
        L33:
            java.lang.String r0 = "expanded"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L3e
        L3b:
            java.lang.String r9 = "undefined"
            goto L40
        L3e:
            java.lang.String r9 = "only_list"
        L40:
            kotlin.Q r0 = new kotlin.Q
            java.lang.String r1 = "from_page"
            r0.<init>(r1, r9)
            kotlin.Q[] r9 = new kotlin.Q[]{r0}
            java.util.HashMap r3 = kotlin.collections.P0.e(r9)
            r2 = 0
            r4 = 0
            r1 = 11941(0x2ea5, float:1.6733E-41)
            r5 = 8
            r6 = 0
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8.f185623c = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.map_core.analytics.event.e.<init>(java.lang.String):void");
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && L.f(this.f185622b, ((e) obj).f185622b);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83080b() {
        return this.f185623c.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f185623c.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83081c() {
        return this.f185623c.f90248c;
    }

    public final int hashCode() {
        return this.f185622b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return C22026a.c(new StringBuilder("ClickSelectDatesEvent(panelState="), this.f185622b, ')');
    }
}
