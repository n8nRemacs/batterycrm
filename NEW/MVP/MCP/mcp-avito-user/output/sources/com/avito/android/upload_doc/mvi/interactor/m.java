package com.avito.android.upload_doc.mvi.interactor;

import com.avito.android.deep_linking.links.GigUploadDocDeeplink;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: GigUploadDocMapper.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_gig_upload-doc_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class m {
    @Y61.k
    public static final String a(@Y61.k GigUploadDocDeeplink.FlowType flowType) {
        if (flowType instanceof GigUploadDocDeeplink.FlowType.Certificate) {
            return "send_photo_certificate";
        }
        if (flowType instanceof GigUploadDocDeeplink.FlowType.MedicalDocument) {
            return "send_photo_medbook";
        }
        if (flowType instanceof GigUploadDocDeeplink.FlowType.MedicalDocumentAttestation) {
            return "send_photo_medbook_attestation";
        }
        if (flowType instanceof GigUploadDocDeeplink.FlowType.FioChange) {
            return "send_fio_doc";
        }
        if (flowType instanceof GigUploadDocDeeplink.FlowType.Default) {
            return ((GigUploadDocDeeplink.FlowType.Default) flowType).f133338c;
        }
        throw new NoWhenBranchMatchedException();
    }
}
