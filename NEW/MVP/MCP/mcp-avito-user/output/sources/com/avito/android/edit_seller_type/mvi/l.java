package com.avito.android.edit_seller_type.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.edit_seller_type.mvi.entity.EditSellerTypeInternalAction;
import com.avito.android.edit_seller_type.mvi.entity.c;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: EditSellerTypeReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/edit_seller_type/mvi/l;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/edit_seller_type/mvi/entity/EditSellerTypeInternalAction;", "Lcom/avito/android/edit_seller_type/mvi/entity/c;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class l implements u<EditSellerTypeInternalAction, com.avito.android.edit_seller_type.mvi.entity.c> {
    @Inject
    public l() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final com.avito.android.edit_seller_type.mvi.entity.c a(EditSellerTypeInternalAction editSellerTypeInternalAction, com.avito.android.edit_seller_type.mvi.entity.c cVar) {
        EditSellerTypeInternalAction editSellerTypeInternalAction2 = editSellerTypeInternalAction;
        com.avito.android.edit_seller_type.mvi.entity.c cVar2 = cVar;
        if (editSellerTypeInternalAction2.equals(EditSellerTypeInternalAction.Loading.f146786b)) {
            return c.C4273c.f146810b;
        }
        if (editSellerTypeInternalAction2 instanceof EditSellerTypeInternalAction.Error) {
            return new c.b(((EditSellerTypeInternalAction.Error) editSellerTypeInternalAction2).f146785b);
        }
        if (editSellerTypeInternalAction2 instanceof EditSellerTypeInternalAction.ShowContent) {
            return ((EditSellerTypeInternalAction.ShowContent) editSellerTypeInternalAction2).f146790b;
        }
        if (!(editSellerTypeInternalAction2 instanceof EditSellerTypeInternalAction.OptionSelected)) {
            return editSellerTypeInternalAction2 instanceof EditSellerTypeInternalAction.SellerTypeSaveLoading ? c.g.a((c.g) cVar2, null, false, 63) : cVar2;
        }
        c.g gVar = (c.g) cVar2;
        return c.g.a(gVar, gVar.f146828e.a(((EditSellerTypeInternalAction.OptionSelected) editSellerTypeInternalAction2).f146789b), !r3.equals(gVar.f146829f), 87);
    }
}
