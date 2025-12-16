package com.avito.android.extended_profile_selection_create.image.mvi;

import JA.b;
import com.avito.android.arch.mvi.t;
import com.avito.android.extended_profile_selection_create.image.mvi.entity.ExtendedProfileSetSelectionImageInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ExtendedProfileSetSelectionImageOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/image/mvi/l;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/extended_profile_selection_create/image/mvi/entity/ExtendedProfileSetSelectionImageInternalAction;", "LJA/b;", "<init>", "()V", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class l implements t<ExtendedProfileSetSelectionImageInternalAction, JA.b> {
    @Inject
    public l() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final JA.b b(ExtendedProfileSetSelectionImageInternalAction extendedProfileSetSelectionImageInternalAction) {
        ExtendedProfileSetSelectionImageInternalAction extendedProfileSetSelectionImageInternalAction2 = extendedProfileSetSelectionImageInternalAction;
        if (extendedProfileSetSelectionImageInternalAction2 instanceof ExtendedProfileSetSelectionImageInternalAction.OpenPhotoPicker) {
            return new b.c(((ExtendedProfileSetSelectionImageInternalAction.OpenPhotoPicker) extendedProfileSetSelectionImageInternalAction2).f151773b);
        }
        if (extendedProfileSetSelectionImageInternalAction2 instanceof ExtendedProfileSetSelectionImageInternalAction.OpenImageEditor) {
            return new b.C0514b(((ExtendedProfileSetSelectionImageInternalAction.OpenImageEditor) extendedProfileSetSelectionImageInternalAction2).f151772b);
        }
        if (extendedProfileSetSelectionImageInternalAction2 instanceof ExtendedProfileSetSelectionImageInternalAction.SetSelectionImageError) {
            ExtendedProfileSetSelectionImageInternalAction.SetSelectionImageError setSelectionImageError = (ExtendedProfileSetSelectionImageInternalAction.SetSelectionImageError) extendedProfileSetSelectionImageInternalAction2;
            return new b.d(setSelectionImageError.f151774b, setSelectionImageError.f151775c);
        }
        if (extendedProfileSetSelectionImageInternalAction2 instanceof ExtendedProfileSetSelectionImageInternalAction.SetSelectionIncorrectValuesError) {
            return new b.e(((ExtendedProfileSetSelectionImageInternalAction.SetSelectionIncorrectValuesError) extendedProfileSetSelectionImageInternalAction2).f151778b);
        }
        if (extendedProfileSetSelectionImageInternalAction2 instanceof ExtendedProfileSetSelectionImageInternalAction.SetSelectionImageSuccess) {
            return b.a.f8830a;
        }
        if (extendedProfileSetSelectionImageInternalAction2 instanceof ExtendedProfileSetSelectionImageInternalAction.CloseScreen) {
            return b.a.f8830a;
        }
        if (extendedProfileSetSelectionImageInternalAction2 instanceof ExtendedProfileSetSelectionImageInternalAction.InitState ? true : extendedProfileSetSelectionImageInternalAction2 instanceof ExtendedProfileSetSelectionImageInternalAction.ImageUpdate ? true : extendedProfileSetSelectionImageInternalAction2 instanceof ExtendedProfileSetSelectionImageInternalAction.SetSelectionImageLoading) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
