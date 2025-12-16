package com.avito.android.confirm_documents_bottom_sheet.mvi;

import com.avito.android.confirm_documents_bottom_sheet.models.ConfirmDocumentsInternalAction;
import com.avito.android.confirm_documents_bottom_sheet.mvi.n;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ConfirmDocumentsOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/confirm_documents_bottom_sheet/mvi/o;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/confirm_documents_bottom_sheet/models/ConfirmDocumentsInternalAction;", "Lcom/avito/android/confirm_documents_bottom_sheet/mvi/n;", "<init>", "()V", "_avito_gig_confirm_documents_bottom_sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class o implements com.avito.android.arch.mvi.t<ConfirmDocumentsInternalAction, n> {
    @Inject
    public o() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final n b(ConfirmDocumentsInternalAction confirmDocumentsInternalAction) {
        ConfirmDocumentsInternalAction confirmDocumentsInternalAction2 = confirmDocumentsInternalAction;
        if (confirmDocumentsInternalAction2 instanceof ConfirmDocumentsInternalAction.a) {
            return new n.a(((ConfirmDocumentsInternalAction.a) confirmDocumentsInternalAction2).f125588b);
        }
        return null;
    }
}
