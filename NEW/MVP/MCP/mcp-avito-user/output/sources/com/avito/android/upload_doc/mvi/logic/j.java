package com.avito.android.upload_doc.mvi.logic;

import OG0.c;
import com.avito.android.arch.mvi.t;
import com.avito.android.upload_doc.mvi.entities.GigUploadDocInternalAction;
import com.avito.android.upload_doc.view.document.GigUploadDocDocumentItem;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: GigUploadDocOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/upload_doc/mvi/logic/j;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/upload_doc/mvi/entities/GigUploadDocInternalAction;", "LOG0/c;", "<init>", "()V", "_avito_gig_upload-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j implements t<GigUploadDocInternalAction, OG0.c> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final OG0.c b(GigUploadDocInternalAction gigUploadDocInternalAction) {
        GigUploadDocInternalAction gigUploadDocInternalAction2 = gigUploadDocInternalAction;
        if (gigUploadDocInternalAction2 instanceof GigUploadDocInternalAction.PickDocument) {
            GigUploadDocDocumentItem gigUploadDocDocumentItem = ((GigUploadDocInternalAction.PickDocument) gigUploadDocInternalAction2).f306864b;
            return new c.C0784c(gigUploadDocDocumentItem.f307011b, gigUploadDocDocumentItem.f307014e);
        }
        if (gigUploadDocInternalAction2 instanceof GigUploadDocInternalAction.AddDocument) {
            return new c.e(((GigUploadDocInternalAction.AddDocument) gigUploadDocInternalAction2).f306850d);
        }
        if (gigUploadDocInternalAction2 instanceof GigUploadDocInternalAction.SendDocumentsDone) {
            return new c.b(((GigUploadDocInternalAction.SendDocumentsDone) gigUploadDocInternalAction2).f306866b);
        }
        if (gigUploadDocInternalAction2 instanceof GigUploadDocInternalAction.SendDocumentsError) {
            return c.d.f12134a;
        }
        if (gigUploadDocInternalAction2 instanceof GigUploadDocInternalAction.Close) {
            return c.a.f12130a;
        }
        if (gigUploadDocInternalAction2 instanceof GigUploadDocInternalAction.AgreeToTerms ? true : gigUploadDocInternalAction2 instanceof GigUploadDocInternalAction.DisagreeToTerms ? true : gigUploadDocInternalAction2 instanceof GigUploadDocInternalAction.RemoveDocument ? true : gigUploadDocInternalAction2 instanceof GigUploadDocInternalAction.ShowContent ? true : gigUploadDocInternalAction2 instanceof GigUploadDocInternalAction.ShowError ? true : gigUploadDocInternalAction2 instanceof GigUploadDocInternalAction.DocumentError ? true : gigUploadDocInternalAction2 instanceof GigUploadDocInternalAction.DocumentLoaded ? true : gigUploadDocInternalAction2 instanceof GigUploadDocInternalAction.DocumentLoading ? true : gigUploadDocInternalAction2 instanceof GigUploadDocInternalAction.ShowLoading ? true : gigUploadDocInternalAction2 instanceof GigUploadDocInternalAction.SendDocumentsLoading) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
