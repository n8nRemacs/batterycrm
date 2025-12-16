package com.avito.android.mortgage.document_upload.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.arch.mvi.t;
import com.avito.android.mortgage.document_upload.mvi.entity.DocumentUploadInternalAction;
import f00.InterfaceC40195b;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DocumentUploadOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mortgage/document_upload/mvi/i;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/mortgage/document_upload/mvi/entity/DocumentUploadInternalAction;", "Lf00/b;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class i implements t<DocumentUploadInternalAction, InterfaceC40195b> {
    @Inject
    public i() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC40195b b(DocumentUploadInternalAction documentUploadInternalAction) {
        InterfaceC40195b cVar;
        DocumentUploadInternalAction documentUploadInternalAction2 = documentUploadInternalAction;
        boolean z12 = false;
        if (documentUploadInternalAction2 instanceof DocumentUploadInternalAction.FileValidationError) {
            DocumentUploadInternalAction.FileValidationError fileValidationError = (DocumentUploadInternalAction.FileValidationError) documentUploadInternalAction2;
            return !fileValidationError.f199411c ? new InterfaceC40195b.g(com.avito.android.printable_text.b.c(R.string.documents_upload_part_file_requirements_error, new Serializable[0])) : fileValidationError.f199410b == 1 ? new InterfaceC40195b.g(com.avito.android.printable_text.b.c(R.string.documents_upload_single_file_requirements_error, new Serializable[0])) : new InterfaceC40195b.g(com.avito.android.printable_text.b.c(R.string.documents_upload_multiple_file_requirements_error, new Serializable[0]));
        }
        C42822w c42822w = null;
        if (documentUploadInternalAction2 instanceof DocumentUploadInternalAction.OpenPreviousStepScreen) {
            cVar = new InterfaceC40195b.d(((DocumentUploadInternalAction.OpenPreviousStepScreen) documentUploadInternalAction2).f199420b, z12, 2, c42822w);
        } else if (documentUploadInternalAction2 instanceof DocumentUploadInternalAction.OpenNextStepScreen) {
            cVar = new InterfaceC40195b.d(((DocumentUploadInternalAction.OpenNextStepScreen) documentUploadInternalAction2).f199419b, true);
        } else {
            if (documentUploadInternalAction2 instanceof DocumentUploadInternalAction.NavigateBack) {
                return InterfaceC40195b.a.f395533a;
            }
            if (documentUploadInternalAction2 instanceof DocumentUploadInternalAction.CloseAllDocumentsScreens) {
                return InterfaceC40195b.C11120b.f395534a;
            }
            if (documentUploadInternalAction2 instanceof DocumentUploadInternalAction.NavigationFailure) {
                cVar = new InterfaceC40195b.g(com.avito.android.printable_text.b.f(((DocumentUploadInternalAction.NavigationFailure) documentUploadInternalAction2).f199417b.getMessage()));
            } else if (documentUploadInternalAction2 instanceof DocumentUploadInternalAction.RemoteFileDeleteFailed) {
                cVar = new InterfaceC40195b.g(com.avito.android.printable_text.b.f(((DocumentUploadInternalAction.RemoteFileDeleteFailed) documentUploadInternalAction2).f199422c.getMessage()));
            } else {
                if (documentUploadInternalAction2 instanceof DocumentUploadInternalAction.AddFilesClick) {
                    return InterfaceC40195b.e.f395538a;
                }
                if (documentUploadInternalAction2 instanceof DocumentUploadInternalAction.AddPhotoClick) {
                    return InterfaceC40195b.f.f395539a;
                }
                if (!(documentUploadInternalAction2 instanceof DocumentUploadInternalAction.HandleDeeplink)) {
                    return null;
                }
                cVar = new InterfaceC40195b.c(((DocumentUploadInternalAction.HandleDeeplink) documentUploadInternalAction2).f199413b);
            }
        }
        return cVar;
    }
}
