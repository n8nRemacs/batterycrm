package com.avito.android.edit_seller_type.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.edit_seller_type.mvi.entity.EditSellerTypeInternalAction;
import com.avito.android.edit_seller_type.mvi.entity.b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: EditSellerTypeOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/edit_seller_type/mvi/j;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/edit_seller_type/mvi/entity/EditSellerTypeInternalAction;", "Lcom/avito/android/edit_seller_type/mvi/entity/b;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class j implements t<EditSellerTypeInternalAction, com.avito.android.edit_seller_type.mvi.entity.b> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final com.avito.android.edit_seller_type.mvi.entity.b b(EditSellerTypeInternalAction editSellerTypeInternalAction) {
        com.avito.android.edit_seller_type.mvi.entity.b cVar;
        EditSellerTypeInternalAction editSellerTypeInternalAction2 = editSellerTypeInternalAction;
        if (editSellerTypeInternalAction2.equals(EditSellerTypeInternalAction.Close.f146781b)) {
            return b.a.f146799a;
        }
        if (editSellerTypeInternalAction2 instanceof EditSellerTypeInternalAction.OpenConfirmationDialog) {
            cVar = new b.d(((EditSellerTypeInternalAction.OpenConfirmationDialog) editSellerTypeInternalAction2).f146787b);
        } else {
            if (editSellerTypeInternalAction2.equals(EditSellerTypeInternalAction.DismissDialog.f146784b)) {
                return b.C4272b.f146800a;
            }
            if (editSellerTypeInternalAction2 instanceof EditSellerTypeInternalAction.SellerTypeSaveError) {
                cVar = new b.f();
            } else if (editSellerTypeInternalAction2 instanceof EditSellerTypeInternalAction.OpenDeeplink) {
                cVar = new b.e(((EditSellerTypeInternalAction.OpenDeeplink) editSellerTypeInternalAction2).f146788b);
            } else {
                if (!(editSellerTypeInternalAction2 instanceof EditSellerTypeInternalAction.ConfirmTypeChange)) {
                    return null;
                }
                EditSellerTypeInternalAction.ConfirmTypeChange confirmTypeChange = (EditSellerTypeInternalAction.ConfirmTypeChange) editSellerTypeInternalAction2;
                cVar = new b.c(confirmTypeChange.f146782b, confirmTypeChange.f146783c);
            }
        }
        return cVar;
    }
}
