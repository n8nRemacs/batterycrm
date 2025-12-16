package com.avito.android.mortgage.document_upload;

import androidx.fragment.app.FragmentManager;
import com.avito.android.mortgage.document_upload.DocumentUploadFragment;
import com.avito.android.mortgage.root.MortgageRootFragment;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: DocumentUploadFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.mortgage.document_upload.i, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final /* synthetic */ class C32619i extends kotlin.jvm.internal.H implements Y41.a<G0> {
    @Override // Y41.a
    public final G0 invoke() {
        DocumentUploadFragment documentUploadFragment = (DocumentUploadFragment) this.receiver;
        DocumentUploadFragment.a aVar = DocumentUploadFragment.f199027B0;
        String canonicalName = MortgageRootFragment.class.getCanonicalName();
        if (documentUploadFragment.getParentFragmentManager().L() != 0) {
            FragmentManager parentFragmentManager = documentUploadFragment.getParentFragmentManager();
            int iL2 = parentFragmentManager.L();
            int i12 = 0;
            while (true) {
                if (i12 >= iL2) {
                    documentUploadFragment.getParentFragmentManager().a0(1, null);
                    break;
                }
                if (kotlin.jvm.internal.L.f(parentFragmentManager.K(i12).getName(), canonicalName)) {
                    documentUploadFragment.getParentFragmentManager().a0(0, canonicalName);
                    break;
                }
                i12++;
            }
        } else {
            documentUploadFragment.requireActivity().finish();
        }
        return G0.f406611a;
    }
}
