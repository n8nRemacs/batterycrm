package com.avito.android.beduin.v2.page.impl.deeplinks;

import Ku.AbstractC14350a;
import androidx.compose.runtime.internal.P;
import com.avito.android.beduin.v2.page.BeduinV2BottomSheetDeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinV2BottomSheetDeepLinkParser.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/v2/page/impl/deeplinks/c;", "LKu/a;", "Lcom/avito/android/beduin/v2/page/BeduinV2BottomSheetDeepLink;", "<init>", "()V", "_design-modules_beduin-v2-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c extends AbstractC14350a<BeduinV2BottomSheetDeepLink> {

    /* compiled from: BeduinV2BottomSheetDeepLinkParser.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a<BeduinV2BottomSheetDeepLink.ContentPaddings> f105104a = kotlin.enums.c.a(BeduinV2BottomSheetDeepLink.ContentPaddings.values());
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    @Override // Ku.AbstractC14350a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.deep_linking.links.DeepLink r(android.net.Uri r11, com.google.gson.Gson r12, com.avito.android.deep_linking.x r13) throws com.avito.android.deep_linking.links.error.DeeplinkParsingError.WrongParameterValue {
        /*
            r10 = this;
            java.lang.String r12 = "pagePath"
            java.lang.String r1 = Ku.i.n(r11, r12)
            java.lang.String r12 = "screenName"
            java.lang.String r2 = Ku.i.n(r11, r12)
            java.lang.String r12 = "height"
            java.lang.String r12 = r11.getQueryParameter(r12)
            if (r12 != 0) goto L16
            java.lang.String r12 = "fit"
        L16:
            r3 = r12
            java.lang.String r12 = "scrollOnKeyboardShown"
            r13 = 0
            boolean r4 = r11.getBooleanQueryParameter(r12, r13)
            java.lang.String r12 = "contentPaddings"
            java.lang.String r12 = r11.getQueryParameter(r12)
            if (r12 == 0) goto L49
            kotlin.enums.a<com.avito.android.beduin.v2.page.BeduinV2BottomSheetDeepLink$ContentPaddings> r0 = com.avito.android.beduin.v2.page.impl.deeplinks.c.a.f105104a
            kotlin.collections.c r0 = (kotlin.collections.AbstractC42738c) r0
            java.util.Iterator r0 = r0.iterator()
        L2e:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r5 = r0.next()
            r6 = r5
            com.avito.android.beduin.v2.page.BeduinV2BottomSheetDeepLink$ContentPaddings r6 = (com.avito.android.beduin.v2.page.BeduinV2BottomSheetDeepLink.ContentPaddings) r6
            java.lang.String r6 = r6.f104774b
            boolean r6 = r6.equals(r12)
            if (r6 == 0) goto L2e
            goto L45
        L44:
            r5 = 0
        L45:
            com.avito.android.beduin.v2.page.BeduinV2BottomSheetDeepLink$ContentPaddings r5 = (com.avito.android.beduin.v2.page.BeduinV2BottomSheetDeepLink.ContentPaddings) r5
            if (r5 != 0) goto L4c
        L49:
            com.avito.android.beduin.v2.page.BeduinV2BottomSheetDeepLink$ContentPaddings r12 = com.avito.android.beduin.v2.page.BeduinV2BottomSheetDeepLink.ContentPaddings.f104769c
            r5 = r12
        L4c:
            java.lang.String r12 = "theme"
            java.lang.String r6 = r11.getQueryParameter(r12)
            java.lang.String r12 = "scenarioParentId"
            java.lang.String r7 = r11.getQueryParameter(r12)
            java.lang.String r12 = "scenarioId"
            java.lang.String r8 = r11.getQueryParameter(r12)
            java.lang.String r12 = "enableComposeRenderer"
            boolean r9 = r11.getBooleanQueryParameter(r12, r13)
            com.avito.android.beduin.v2.page.BeduinV2BottomSheetDeepLink r11 = new com.avito.android.beduin.v2.page.BeduinV2BottomSheetDeepLink
            r0 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.beduin.v2.page.impl.deeplinks.c.r(android.net.Uri, com.google.gson.Gson, com.avito.android.deep_linking.x):com.avito.android.deep_linking.links.DeepLink");
    }
}
