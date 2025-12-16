package com.avito.android.select_field.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.select_field.mvi.entity.SelectFieldInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import sq0.InterfaceC48400b;

/* compiled from: SelectFieldOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/select_field/mvi/h;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/select_field/mvi/entity/SelectFieldInternalAction;", "Lsq0/b;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h implements t<SelectFieldInternalAction, InterfaceC48400b> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC48400b b(SelectFieldInternalAction selectFieldInternalAction) {
        SelectFieldInternalAction selectFieldInternalAction2 = selectFieldInternalAction;
        if (selectFieldInternalAction2 instanceof SelectFieldInternalAction.Error) {
            return new InterfaceC48400b.c(((SelectFieldInternalAction.Error) selectFieldInternalAction2).f267196b);
        }
        if (selectFieldInternalAction2 instanceof SelectFieldInternalAction.IncorrectValuesError) {
            return new InterfaceC48400b.d(((SelectFieldInternalAction.IncorrectValuesError) selectFieldInternalAction2).f267197b);
        }
        if (selectFieldInternalAction2 instanceof SelectFieldInternalAction.OpenSelector) {
            return new InterfaceC48400b.C12647b(((SelectFieldInternalAction.OpenSelector) selectFieldInternalAction2).f267199b);
        }
        if (selectFieldInternalAction2 instanceof SelectFieldInternalAction.SubmitSuccess) {
            return new InterfaceC48400b.a(((SelectFieldInternalAction.SubmitSuccess) selectFieldInternalAction2).f267201b);
        }
        return null;
    }
}
