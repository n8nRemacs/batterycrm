package com.avito.android.advert.deeplinks;

import Ku.AbstractC14350a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.AdvertDetailsLink;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsDeepLinkParser.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert/deeplinks/l;", "LKu/a;", "Lcom/avito/android/deep_linking/links/AdvertDetailsLink;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class l extends AbstractC14350a<AdvertDetailsLink> {
    @Inject
    public l() {
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ab  */
    @Override // Ku.AbstractC14350a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.deep_linking.links.DeepLink r(android.net.Uri r13, com.google.gson.Gson r14, com.avito.android.deep_linking.x r15) throws com.avito.android.deep_linking.links.error.DeeplinkParsingError.WrongParameterValue, java.io.UnsupportedEncodingException {
        /*
            r12 = this;
            java.lang.String r14 = "itemId"
            java.lang.String r1 = Ku.i.n(r13, r14)
            java.lang.String r14 = "context"
            java.lang.String r2 = r13.getQueryParameter(r14)
            java.lang.String r14 = "sourceScreen"
            java.lang.String r3 = r13.getQueryParameter(r14)
            java.lang.String r14 = "selectedPageFromStories"
            java.lang.String r4 = r13.getQueryParameter(r14)
            java.lang.String r14 = "needShowGallery"
            java.lang.String r14 = r13.getQueryParameter(r14)
            r15 = 0
            if (r14 == 0) goto L2b
            boolean r14 = java.lang.Boolean.parseBoolean(r14)
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
            r5 = r14
            goto L2c
        L2b:
            r5 = r15
        L2c:
            java.lang.String r14 = "segment"
            java.lang.String r14 = r13.getQueryParameter(r14)
            if (r14 == 0) goto L6c
            int r0 = r14.hashCode()
            r6 = -1906712829(0xffffffff8e59df03, float:-2.6854691E-30)
            if (r0 == r6) goto L60
            r6 = 1011602672(0x3c4bd4f0, float:0.012440905)
            if (r0 == r6) goto L55
            r6 = 1495196634(0x591ee3da, float:2.7952232E15)
            if (r0 == r6) goto L48
            goto L6c
        L48:
            java.lang.String r0 = "avitoForBusiness"
            boolean r14 = r14.equals(r0)
            if (r14 != 0) goto L51
            goto L6c
        L51:
            com.avito.android.deep_linking.links.AdvertDetailsLink$Segment r14 = com.avito.android.deep_linking.links.AdvertDetailsLink.Segment.f132966e
        L53:
            r6 = r14
            goto L6f
        L55:
            java.lang.String r0 = "avitoBlack"
            boolean r14 = r14.equals(r0)
            if (r14 == 0) goto L6c
            com.avito.android.deep_linking.links.AdvertDetailsLink$Segment r14 = com.avito.android.deep_linking.links.AdvertDetailsLink.Segment.f132964c
            goto L53
        L60:
            java.lang.String r0 = "avitoMall"
            boolean r14 = r14.equals(r0)
            if (r14 != 0) goto L69
            goto L6c
        L69:
            com.avito.android.deep_linking.links.AdvertDetailsLink$Segment r14 = com.avito.android.deep_linking.links.AdvertDetailsLink.Segment.f132965d
            goto L53
        L6c:
            com.avito.android.deep_linking.links.AdvertDetailsLink$Segment r14 = com.avito.android.deep_linking.links.AdvertDetailsLink.Segment.f132963b
            goto L53
        L6f:
            java.lang.String r14 = "callIdForEmitCall"
            java.lang.String r7 = r13.getQueryParameter(r14)
            java.lang.String r14 = "addressId"
            java.lang.String r14 = r13.getQueryParameter(r14)
            if (r14 == 0) goto L87
            int r14 = java.lang.Integer.parseInt(r14)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r8 = r14
            goto L88
        L87:
            r8 = r15
        L88:
            java.lang.String r14 = "fromPage"
            java.lang.String r9 = r13.getQueryParameter(r14)
            java.lang.String r14 = "image"
            java.lang.String r14 = r13.getQueryParameter(r14)
            if (r14 == 0) goto Lab
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r0 = r0.toString()
            java.net.URLDecoder.decode(r14, r0)
            android.net.Uri r14 = android.net.Uri.parse(r14)
            if (r14 == 0) goto Lab
            com.avito.android.remote.model.Image r14 = com.avito.android.remote.model.ImageKt.toImage(r14)
            r10 = r14
            goto Lac
        Lab:
            r10 = r15
        Lac:
            java.lang.String r14 = "gigShiftId"
            java.lang.String r14 = r13.getQueryParameter(r14)
            java.lang.String r0 = "gigAction"
            java.lang.String r13 = r13.getQueryParameter(r0)
            java.lang.String r0 = "apply"
            boolean r13 = kotlin.jvm.internal.L.f(r13, r0)
            if (r13 == 0) goto Lc3
            com.avito.android.deep_linking.links.AdvertDetailsLink$GigAction r13 = com.avito.android.deep_linking.links.AdvertDetailsLink.GigAction.f132958b
            goto Lc4
        Lc3:
            r13 = r15
        Lc4:
            com.avito.android.deep_linking.links.AdvertDetailsLink$GigParams r0 = new com.avito.android.deep_linking.links.AdvertDetailsLink$GigParams
            r0.<init>(r14, r13)
            if (r14 != 0) goto Ld0
            if (r13 == 0) goto Lce
            goto Ld0
        Lce:
            r11 = r15
            goto Ld1
        Ld0:
            r11 = r0
        Ld1:
            com.avito.android.deep_linking.links.AdvertDetailsLink r13 = new com.avito.android.deep_linking.links.AdvertDetailsLink
            r0 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.deeplinks.l.r(android.net.Uri, com.google.gson.Gson, com.avito.android.deep_linking.x):com.avito.android.deep_linking.links.DeepLink");
    }
}
