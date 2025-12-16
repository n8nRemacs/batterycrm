package com.avito.android.upload_doc.deeplink;

import Ku.AbstractC14350a;
import com.avito.android.deep_linking.links.GigUploadDocDeeplink;
import kotlin.Metadata;

/* compiled from: GigUploadDocDeeplinkParser.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/upload_doc/deeplink/f;", "LKu/a;", "Lcom/avito/android/deep_linking/links/GigUploadDocDeeplink;", "<init>", "()V", "_avito_gig_upload-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f extends AbstractC14350a<GigUploadDocDeeplink> {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    @Override // Ku.AbstractC14350a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.deep_linking.links.DeepLink r(android.net.Uri r1, com.google.gson.Gson r2, com.avito.android.deep_linking.x r3) {
        /*
            r0 = this;
            java.lang.String r2 = "flowType"
            java.lang.String r1 = r1.getQueryParameter(r2)
            if (r1 == 0) goto L4b
            int r2 = r1.hashCode()
            switch(r2) {
                case -1705824564: goto L3d;
                case -709624112: goto L2e;
                case 380588764: goto L1f;
                case 1952399767: goto L10;
                default: goto Lf;
            }
        Lf:
            goto L4b
        L10:
            java.lang.String r2 = "certificate"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L19
            goto L4b
        L19:
            com.avito.android.deep_linking.links.GigUploadDocDeeplink$FlowType$Certificate r2 = new com.avito.android.deep_linking.links.GigUploadDocDeeplink$FlowType$Certificate
            r2.<init>(r1)
            goto L54
        L1f:
            java.lang.String r2 = "fioChange"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L28
            goto L4b
        L28:
            com.avito.android.deep_linking.links.GigUploadDocDeeplink$FlowType$FioChange r2 = new com.avito.android.deep_linking.links.GigUploadDocDeeplink$FlowType$FioChange
            r2.<init>(r1)
            goto L54
        L2e:
            java.lang.String r2 = "attestation"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L37
            goto L4b
        L37:
            com.avito.android.deep_linking.links.GigUploadDocDeeplink$FlowType$MedicalDocumentAttestation r2 = new com.avito.android.deep_linking.links.GigUploadDocDeeplink$FlowType$MedicalDocumentAttestation
            r2.<init>(r1)
            goto L54
        L3d:
            java.lang.String r2 = "medicalDocument"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L4b
            com.avito.android.deep_linking.links.GigUploadDocDeeplink$FlowType$MedicalDocument r2 = new com.avito.android.deep_linking.links.GigUploadDocDeeplink$FlowType$MedicalDocument
            r2.<init>(r1)
            goto L54
        L4b:
            com.avito.android.deep_linking.links.GigUploadDocDeeplink$FlowType$Default r2 = new com.avito.android.deep_linking.links.GigUploadDocDeeplink$FlowType$Default
            if (r1 != 0) goto L51
            java.lang.String r1 = ""
        L51:
            r2.<init>(r1)
        L54:
            com.avito.android.deep_linking.links.GigUploadDocDeeplink r1 = new com.avito.android.deep_linking.links.GigUploadDocDeeplink
            r1.<init>(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.upload_doc.deeplink.f.r(android.net.Uri, com.google.gson.Gson, com.avito.android.deep_linking.x):com.avito.android.deep_linking.links.DeepLink");
    }
}
