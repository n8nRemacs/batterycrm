package com.avito.android.str_seller_orders_important_to_note.mvi;

import aA0.b;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.str_seller_orders_important_to_note.mvi.entity.StrSellerImportantToNoteInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: StrSellerImportantToNoteOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/str_seller_orders_important_to_note/mvi/k;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/str_seller_orders_important_to_note/mvi/entity/StrSellerImportantToNoteInternalAction;", "LaA0/b;", "<init>", "()V", "_avito_str-seller-orders-important-to-note_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class k implements t<StrSellerImportantToNoteInternalAction, aA0.b> {
    @Inject
    public k() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final aA0.b b(StrSellerImportantToNoteInternalAction strSellerImportantToNoteInternalAction) {
        aA0.b cVar;
        StrSellerImportantToNoteInternalAction strSellerImportantToNoteInternalAction2 = strSellerImportantToNoteInternalAction;
        if (strSellerImportantToNoteInternalAction2 instanceof StrSellerImportantToNoteInternalAction.Close) {
            return b.a.f20789a;
        }
        if (strSellerImportantToNoteInternalAction2 instanceof StrSellerImportantToNoteInternalAction.SendFinishResult) {
            return b.d.f20792a;
        }
        if (strSellerImportantToNoteInternalAction2 instanceof StrSellerImportantToNoteInternalAction.ShowError) {
            StrSellerImportantToNoteInternalAction.ShowError showError = (StrSellerImportantToNoteInternalAction.ShowError) strSellerImportantToNoteInternalAction2;
            cVar = new b.f(showError.f291399b, showError.f291400c);
        } else if (strSellerImportantToNoteInternalAction2 instanceof StrSellerImportantToNoteInternalAction.LaunchDeeplink) {
            cVar = new b.C1486b(((StrSellerImportantToNoteInternalAction.LaunchDeeplink) strSellerImportantToNoteInternalAction2).f291394b);
        } else if (strSellerImportantToNoteInternalAction2 instanceof StrSellerImportantToNoteInternalAction.ShowConfirmationBottomSheet) {
            StrSellerImportantToNoteInternalAction.ShowConfirmationBottomSheet showConfirmationBottomSheet = (StrSellerImportantToNoteInternalAction.ShowConfirmationBottomSheet) strSellerImportantToNoteInternalAction2;
            cVar = new b.e(showConfirmationBottomSheet.f291397b, showConfirmationBottomSheet.f291398c);
        } else {
            if (!(strSellerImportantToNoteInternalAction2 instanceof StrSellerImportantToNoteInternalAction.OpenWebView)) {
                return null;
            }
            cVar = new b.c(((StrSellerImportantToNoteInternalAction.OpenWebView) strSellerImportantToNoteInternalAction2).f291395b);
        }
        return cVar;
    }
}
