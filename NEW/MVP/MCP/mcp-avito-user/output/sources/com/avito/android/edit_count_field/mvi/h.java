package com.avito.android.edit_count_field.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.edit_count_field.mvi.entity.EditCountFieldInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import uy.InterfaceC49126b;

/* compiled from: EditCountFieldOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/edit_count_field/mvi/h;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/edit_count_field/mvi/entity/EditCountFieldInternalAction;", "Luy/b;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h implements t<EditCountFieldInternalAction, InterfaceC49126b> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC49126b b(EditCountFieldInternalAction editCountFieldInternalAction) {
        EditCountFieldInternalAction editCountFieldInternalAction2 = editCountFieldInternalAction;
        if (editCountFieldInternalAction2 instanceof EditCountFieldInternalAction.Error) {
            return new InterfaceC49126b.C12737b(((EditCountFieldInternalAction.Error) editCountFieldInternalAction2).f146642b);
        }
        if (editCountFieldInternalAction2 instanceof EditCountFieldInternalAction.IncorrectValuesError) {
            return new InterfaceC49126b.c(((EditCountFieldInternalAction.IncorrectValuesError) editCountFieldInternalAction2).f146643b);
        }
        if (editCountFieldInternalAction2 instanceof EditCountFieldInternalAction.SubmitSuccess) {
            return new InterfaceC49126b.a(((EditCountFieldInternalAction.SubmitSuccess) editCountFieldInternalAction2).f146648b);
        }
        return null;
    }
}
