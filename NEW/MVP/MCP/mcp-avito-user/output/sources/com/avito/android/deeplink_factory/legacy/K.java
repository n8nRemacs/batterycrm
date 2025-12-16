package com.avito.android.deeplink_factory.legacy;

import android.net.Uri;
import com.avito.android.deep_linking.links.BeduinUniversalPageLink;
import com.avito.android.remote.model.text.TooltipAttribute;
import kotlin.Metadata;

/* compiled from: LegacyDeepLinkFactory.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/deep_linking/links/BeduinUniversalPageLink;", TooltipAttribute.PARAM_DEEP_LINK, "Landroid/net/Uri;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class K extends kotlin.jvm.internal.N implements Y41.l<Uri, BeduinUniversalPageLink> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ E2 f134238l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(E2 e22) {
        super(1);
        this.f134238l = e22;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x003a  */
    @Override // Y41.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.deep_linking.links.BeduinUniversalPageLink invoke(android.net.Uri r12) throws com.avito.android.deep_linking.links.error.DeeplinkParsingError.WrongParameterValue {
        /*
            r11 = this;
            android.net.Uri r12 = (android.net.Uri) r12
            com.avito.android.deeplink_factory.legacy.E2 r0 = r11.f134238l
            r0.getClass()
            java.lang.String r0 = "requestUrl"
            java.lang.String r2 = Ku.i.n(r12, r0)
            java.lang.String r0 = "presentationStyle"
            java.lang.String r3 = r12.getQueryParameter(r0)
            java.lang.String r0 = "screenName"
            java.lang.String r4 = r12.getQueryParameter(r0)
            java.lang.String r0 = "forcedThemeMode"
            java.lang.String r6 = r12.getQueryParameter(r0)
            java.lang.String r0 = "theme"
            java.lang.String r7 = r12.getQueryParameter(r0)
            com.avito.android.deep_linking.links.BottomSheetContentPaddings$a r0 = com.avito.android.deep_linking.links.BottomSheetContentPaddings.f133056c
            java.lang.String r1 = "bottomSheetContentPaddings"
            java.lang.String r12 = r12.getQueryParameter(r1)
            r0.getClass()
            com.avito.android.deep_linking.links.BottomSheetContentPaddings r0 = com.avito.android.deep_linking.links.BottomSheetContentPaddings.TOP
            java.lang.String r1 = r0.f133059b
            boolean r1 = kotlin.jvm.internal.L.f(r12, r1)
            if (r1 == 0) goto L3c
        L3a:
            r8 = r0
            goto L47
        L3c:
            com.avito.android.deep_linking.links.BottomSheetContentPaddings r1 = com.avito.android.deep_linking.links.BottomSheetContentPaddings.NONE
            java.lang.String r5 = r1.f133059b
            boolean r12 = kotlin.jvm.internal.L.f(r12, r5)
            if (r12 == 0) goto L3a
            r8 = r1
        L47:
            com.avito.android.deep_linking.links.BeduinUniversalPageLink r12 = new com.avito.android.deep_linking.links.BeduinUniversalPageLink
            r5 = 0
            r9 = 8
            r10 = 0
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.deeplink_factory.legacy.K.invoke(java.lang.Object):java.lang.Object");
    }
}
