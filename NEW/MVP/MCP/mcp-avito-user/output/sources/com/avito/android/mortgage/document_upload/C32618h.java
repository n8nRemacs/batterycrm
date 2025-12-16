package com.avito.android.mortgage.document_upload;

import com.avito.android.mortgage.document_upload.DocumentUploadFragment;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: DocumentUploadFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.mortgage.document_upload.h, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final /* synthetic */ class C32618h extends kotlin.jvm.internal.H implements Y41.a<G0> {
    @Override // Y41.a
    public final G0 invoke() {
        DocumentUploadFragment documentUploadFragment = (DocumentUploadFragment) this.receiver;
        DocumentUploadFragment.a aVar = DocumentUploadFragment.f199027B0;
        if (documentUploadFragment.getParentFragmentManager().L() == 0) {
            documentUploadFragment.requireActivity().finish();
        } else {
            documentUploadFragment.getParentFragmentManager().Y();
        }
        return G0.f406611a;
    }
}
