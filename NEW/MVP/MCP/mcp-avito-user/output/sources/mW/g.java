package mW;

import Y61.k;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: LocationStorageEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LmW/g;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_user-location_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f414552b;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g(@Y61.k java.util.HashMap<com.avito.android.location.LocationSource, java.lang.String> r9, @Y61.l com.avito.android.location.LocationSource r10, @Y61.l java.lang.String r11) {
        /*
            r8 = this;
            r8.<init>()
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "ls1:"
            r1.<init>(r2)
            com.avito.android.location.LocationSource r2 = com.avito.android.location.LocationSource.f181712d
            java.lang.Object r2 = r9.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            r4 = 0
            java.lang.String r5 = "0"
            if (r2 == 0) goto L2a
            int r6 = r2.length()
            if (r6 != 0) goto L28
            r2 = r4
        L28:
            if (r2 != 0) goto L2b
        L2a:
            r2 = r5
        L2b:
            r1.append(r2)
            r2 = 44
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r6 = "ls2:"
            r1.<init>(r6)
            com.avito.android.location.LocationSource r6 = com.avito.android.location.LocationSource.f181711c
            java.lang.Object r6 = r9.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L54
            int r7 = r6.length()
            if (r7 != 0) goto L52
            r6 = r4
        L52:
            if (r6 != 0) goto L55
        L54:
            r6 = r5
        L55:
            r1.append(r6)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            com.avito.android.location.LocationSource r1 = com.avito.android.location.LocationSource.f181713e
            java.lang.Object r9 = r9.get(r1)
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L78
            int r1 = r9.length()
            if (r1 != 0) goto L73
            goto L74
        L73:
            r4 = r9
        L74:
            if (r4 != 0) goto L77
            goto L78
        L77:
            r5 = r4
        L78:
            java.lang.String r9 = "ls3:"
            java.lang.String r9 = r9.concat(r5)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            java.lang.String r0 = "from_page"
            r3.put(r0, r9)
            if (r10 == 0) goto Laf
            int r9 = r10.ordinal()
            r10 = 3
            switch(r9) {
                case 0: goto La5;
                case 1: goto La3;
                case 2: goto La6;
                case 3: goto La6;
                case 4: goto La1;
                case 5: goto L9f;
                case 6: goto L9d;
                case 7: goto L9a;
                default: goto L94;
            }
        L94:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        L9a:
            r10 = 8
            goto La6
        L9d:
            r10 = 7
            goto La6
        L9f:
            r10 = 6
            goto La6
        La1:
            r10 = 5
            goto La6
        La3:
            r10 = 1
            goto La6
        La5:
            r10 = 2
        La6:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            java.lang.String r10 = "from_block"
            r3.put(r10, r9)
        Laf:
            if (r11 == 0) goto Lb6
            java.lang.String r9 = "lid"
            r3.put(r9, r11)
        Lb6:
            kotlin.G0 r9 = kotlin.G0.f406611a
            com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent r9 = new com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent
            r5 = 8
            r6 = 0
            r1 = 3379(0xd33, float:4.735E-42)
            r2 = 2
            r4 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8.f414552b = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mW.g.<init>(java.util.HashMap, com.avito.android.location.LocationSource, java.lang.String):void");
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF19677b() {
        return this.f414552b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f414552b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF19678c() {
        return this.f414552b.f90248c;
    }
}
