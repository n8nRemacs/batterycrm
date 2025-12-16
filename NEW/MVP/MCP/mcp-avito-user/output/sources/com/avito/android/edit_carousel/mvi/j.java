package com.avito.android.edit_carousel.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.edit_carousel.mvi.entity.EditCarouselInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import ty.InterfaceC48739b;

/* compiled from: EditCarouselOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/edit_carousel/mvi/j;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction;", "Lty/b;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class j implements t<EditCarouselInternalAction, InterfaceC48739b> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC48739b b(EditCarouselInternalAction editCarouselInternalAction) {
        EditCarouselInternalAction editCarouselInternalAction2 = editCarouselInternalAction;
        if (editCarouselInternalAction2 instanceof EditCarouselInternalAction.HeaderSelectItemAction) {
            return new InterfaceC48739b.c(((EditCarouselInternalAction.HeaderSelectItemAction) editCarouselInternalAction2).f146471b);
        }
        if (editCarouselInternalAction2 instanceof EditCarouselInternalAction.SelectSortType) {
            return new InterfaceC48739b.d(((EditCarouselInternalAction.SelectSortType) editCarouselInternalAction2).f146479b);
        }
        if (editCarouselInternalAction2 instanceof EditCarouselInternalAction.CarouselModificationSuccess) {
            return InterfaceC48739b.C12696b.f439691a;
        }
        if (editCarouselInternalAction2 instanceof EditCarouselInternalAction.CarouselModificationFailure) {
            return new InterfaceC48739b.f(((EditCarouselInternalAction.CarouselModificationFailure) editCarouselInternalAction2).f146468b);
        }
        if (editCarouselInternalAction2 instanceof EditCarouselInternalAction.RefreshAdverts) {
            return InterfaceC48739b.e.f439694a;
        }
        if (editCarouselInternalAction2 instanceof EditCarouselInternalAction.LeaveScreen) {
            return InterfaceC48739b.a.f439690a;
        }
        if (editCarouselInternalAction2 instanceof EditCarouselInternalAction.InitEditMode ? true : editCarouselInternalAction2 instanceof EditCarouselInternalAction.OnNamePicked ? true : editCarouselInternalAction2 instanceof EditCarouselInternalAction.OnSortTypePicked ? true : editCarouselInternalAction2 instanceof EditCarouselInternalAction.OnQueryUpdated ? true : editCarouselInternalAction2 instanceof EditCarouselInternalAction.AdvertsLoadingInProgress ? true : editCarouselInternalAction2 instanceof EditCarouselInternalAction.AdvertsLoaded ? true : editCarouselInternalAction2 instanceof EditCarouselInternalAction.AdvertsLoadingError ? true : editCarouselInternalAction2 instanceof EditCarouselInternalAction.CarouselModificationInProgress ? true : editCarouselInternalAction2 instanceof EditCarouselInternalAction.SwitchModeToSearch ? true : editCarouselInternalAction2 instanceof EditCarouselInternalAction.SwitchModeToEdit ? true : editCarouselInternalAction2 instanceof EditCarouselInternalAction.AdvertDeleteItemAction ? true : editCarouselInternalAction2 instanceof EditCarouselInternalAction.AdvertSelectedItemAction ? true : editCarouselInternalAction2 instanceof EditCarouselInternalAction.PagingBarItemAction ? true : editCarouselInternalAction2 instanceof EditCarouselInternalAction.SwapAdverts) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
