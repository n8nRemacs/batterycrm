package Yu;

import Ku.AbstractC14350a;
import com.avito.android.deep_linking.links.StoreDeeplink;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: StoreDeeplinkParser.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LYu/q;", "LKu/a;", "Lcom/avito/android/deep_linking/links/StoreDeeplink;", "<init>", "()V", "_avito_deeplink-handler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class q extends AbstractC14350a<StoreDeeplink> {
    @Inject
    public q() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    @Override // Ku.AbstractC14350a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.deep_linking.links.DeepLink r(android.net.Uri r1, com.google.gson.Gson r2, com.avito.android.deep_linking.x r3) {
        /*
            r0 = this;
            java.lang.String r2 = "store"
            java.lang.String r1 = r1.getQueryParameter(r2)
            if (r1 == 0) goto L4c
            int r2 = r1.hashCode()
            switch(r2) {
                case -1365313007: goto L40;
                case -1104280514: goto L34;
                case 458192173: goto L28;
                case 1588972232: goto L1c;
                case 1671460753: goto L10;
                default: goto Lf;
            }
        Lf:
            goto L4c
        L10:
            java.lang.String r2 = "GalaxyStore"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L19
            goto L4c
        L19:
            com.avito.android.deep_linking.links.Store r1 = com.avito.android.deep_linking.links.Store.f133679g
            goto L4e
        L1c:
            java.lang.String r2 = "GetApps"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L25
            goto L4c
        L25:
            com.avito.android.deep_linking.links.Store r1 = com.avito.android.deep_linking.links.Store.f133677e
            goto L4e
        L28:
            java.lang.String r2 = "GooglePlay"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L31
            goto L4c
        L31:
            com.avito.android.deep_linking.links.Store r1 = com.avito.android.deep_linking.links.Store.f133676d
            goto L4e
        L34:
            java.lang.String r2 = "RuStore"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L3d
            goto L4c
        L3d:
            com.avito.android.deep_linking.links.Store r1 = com.avito.android.deep_linking.links.Store.f133678f
            goto L4e
        L40:
            java.lang.String r2 = "AppGallery"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L49
            goto L4c
        L49:
            com.avito.android.deep_linking.links.Store r1 = com.avito.android.deep_linking.links.Store.f133680h
            goto L4e
        L4c:
            com.avito.android.deep_linking.links.Store r1 = com.avito.android.deep_linking.links.Store.f133676d
        L4e:
            com.avito.android.deep_linking.links.StoreDeeplink r2 = new com.avito.android.deep_linking.links.StoreDeeplink
            r2.<init>(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Yu.q.r(android.net.Uri, com.google.gson.Gson, com.avito.android.deep_linking.x):com.avito.android.deep_linking.links.DeepLink");
    }
}
