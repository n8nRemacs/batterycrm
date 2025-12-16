package rM;

import com.avito.android.iac_util_deeplinks.public_module.control_flow.RunExecutableArgsLink;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RunExecutableArgsLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LrM/a;", "Lev/a;", "Lcom/avito/android/iac_util_deeplinks/public_module/control_flow/RunExecutableArgsLink;", "_avito_iac-util-deeplinks_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rM.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C47563a extends AbstractC40161a<RunExecutableArgsLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f429760f;

    @Inject
    public C47563a(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f429760f = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0019 A[SYNTHETIC] */
    @Override // ev.AbstractC40161a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.os.Bundle r7, com.avito.android.deep_linking.links.DeepLink r8, java.lang.String r9) {
        /*
            r6 = this;
            com.avito.android.iac_util_deeplinks.public_module.control_flow.RunExecutableArgsLink r8 = (com.avito.android.iac_util_deeplinks.public_module.control_flow.RunExecutableArgsLink) r8
            java.lang.String r9 = "RunExecutableArgsLinkHandler"
            r0 = 0
            if (r7 == 0) goto L79
            boolean r1 = r7.isEmpty()
            if (r1 == 0) goto Le
            goto L79
        Le:
            java.util.ArrayList r8 = r8.f169290b
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r8 = r8.iterator()
        L19:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L61
            java.lang.Object r2 = r8.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = r7.containsKey(r2)
            if (r3 != 0) goto L40
            com.avito.android.util.V2 r3 = com.avito.android.util.V2.f318762a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "args of RunExecutableArgsLinkHandler does not contain key: "
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.j(r9, r2, r0)
        L3e:
            r3 = r0
            goto L5b
        L40:
            android.os.Parcelable r3 = r7.getParcelable(r2)     // Catch: java.lang.Exception -> L47
            com.avito.android.deep_linking.links.DeepLink r3 = (com.avito.android.deep_linking.links.DeepLink) r3     // Catch: java.lang.Exception -> L47
            goto L5b
        L47:
            com.avito.android.util.V2 r3 = com.avito.android.util.V2.f318762a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "error when getting deeplink from handler args with key: "
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.d(r9, r2)
            goto L3e
        L5b:
            if (r3 == 0) goto L19
            r1.add(r3)
            goto L19
        L61:
            com.avito.android.iac_util_deeplinks.public_module.control_flow.SetExecutableArgsLink$b r7 = com.avito.android.iac_util_deeplinks.public_module.control_flow.SetExecutableArgsLink.b.f169293b
            r8 = 0
            com.avito.android.deep_linking.links.DeepLink[] r8 = new com.avito.android.deep_linking.links.DeepLink[r8]
            java.lang.Object[] r8 = r1.toArray(r8)
            com.avito.android.deep_linking.links.DeepLink[] r8 = (com.avito.android.deep_linking.links.DeepLink[]) r8
            int r9 = r8.length
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r9)
            com.avito.android.deep_linking.links.DeepLink[] r8 = (com.avito.android.deep_linking.links.DeepLink[]) r8
            com.avito.android.deeplink_handler.handler.composite.a r9 = r6.f429760f
            r6.i(r7, r9, r8)
            goto L8c
        L79:
            com.avito.android.util.V2 r8 = com.avito.android.util.V2.f318762a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "args of RunExecutableArgsLinkHandler is null or empty: "
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r8.j(r9, r7, r0)
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rM.C47563a.a(android.os.Bundle, com.avito.android.deep_linking.links.DeepLink, java.lang.String):void");
    }
}
