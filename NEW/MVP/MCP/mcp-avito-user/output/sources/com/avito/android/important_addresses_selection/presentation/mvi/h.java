package com.avito.android.important_addresses_selection.presentation.mvi;

import SM.b;
import com.avito.android.arch.mvi.t;
import com.avito.android.component.toast.f;
import com.avito.android.important_addresses_selection.presentation.mvi.entity.ImportantAddressesSelectionInternalAction;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ImportantAddressesSelectionOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/important_addresses_selection/presentation/mvi/h;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/important_addresses_selection/presentation/mvi/entity/ImportantAddressesSelectionInternalAction;", "LSM/b;", "<init>", "()V", "_avito_important-addresses-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class h implements t<ImportantAddressesSelectionInternalAction, SM.b> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final SM.b b(ImportantAddressesSelectionInternalAction importantAddressesSelectionInternalAction) {
        ImportantAddressesSelectionInternalAction importantAddressesSelectionInternalAction2 = importantAddressesSelectionInternalAction;
        if (importantAddressesSelectionInternalAction2 instanceof ImportantAddressesSelectionInternalAction.CloseWithResult) {
            return new b.a(((ImportantAddressesSelectionInternalAction.CloseWithResult) importantAddressesSelectionInternalAction2).f169881b);
        }
        if (importantAddressesSelectionInternalAction2 instanceof ImportantAddressesSelectionInternalAction.CloseWithoutResult) {
            return b.C1008b.f14923a;
        }
        if (importantAddressesSelectionInternalAction2 instanceof ImportantAddressesSelectionInternalAction.FollowDeepLink) {
            return new b.c(((ImportantAddressesSelectionInternalAction.FollowDeepLink) importantAddressesSelectionInternalAction2).f169883b);
        }
        if (!(importantAddressesSelectionInternalAction2 instanceof ImportantAddressesSelectionInternalAction.ShowError)) {
            return null;
        }
        f.c.f125255c.getClass();
        return new b.d(f.c.a.b(), ToastBarPosition.f181046d, ((ImportantAddressesSelectionInternalAction.ShowError) importantAddressesSelectionInternalAction2).f169885b);
    }
}
