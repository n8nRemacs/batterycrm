package com.avito.android.extended_profile_selection_create.name.mvi;

import KA.b;
import com.avito.android.arch.mvi.t;
import com.avito.android.extended_profile_selection_create.image.ExtendedProfileSetSelectionImageConfig;
import com.avito.android.extended_profile_selection_create.name.ExtendedProfileSetSelectionNameConfig;
import com.avito.android.extended_profile_selection_create.name.mvi.entity.ExtendedProfileSetSelectionNameInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ExtendedProfileSetSelectionNameOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/name/mvi/j;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/extended_profile_selection_create/name/mvi/entity/ExtendedProfileSetSelectionNameInternalAction;", "LKA/b;", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class j implements t<ExtendedProfileSetSelectionNameInternalAction, KA.b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ExtendedProfileSetSelectionNameConfig f151925b;

    @Inject
    public j(@Y61.k ExtendedProfileSetSelectionNameConfig extendedProfileSetSelectionNameConfig) {
        this.f151925b = extendedProfileSetSelectionNameConfig;
    }

    @Override // com.avito.android.arch.mvi.t
    public final KA.b b(ExtendedProfileSetSelectionNameInternalAction extendedProfileSetSelectionNameInternalAction) {
        ExtendedProfileSetSelectionNameInternalAction extendedProfileSetSelectionNameInternalAction2 = extendedProfileSetSelectionNameInternalAction;
        if (extendedProfileSetSelectionNameInternalAction2 instanceof ExtendedProfileSetSelectionNameInternalAction.SetSelectionNameError) {
            ExtendedProfileSetSelectionNameInternalAction.SetSelectionNameError setSelectionNameError = (ExtendedProfileSetSelectionNameInternalAction.SetSelectionNameError) extendedProfileSetSelectionNameInternalAction2;
            return new b.C0559b(setSelectionNameError.f151908b, setSelectionNameError.f151909c);
        }
        if (extendedProfileSetSelectionNameInternalAction2 instanceof ExtendedProfileSetSelectionNameInternalAction.SetSelectionIncorrectValuesError) {
            return new b.c(((ExtendedProfileSetSelectionNameInternalAction.SetSelectionIncorrectValuesError) extendedProfileSetSelectionNameInternalAction2).f151907b);
        }
        if (extendedProfileSetSelectionNameInternalAction2 instanceof ExtendedProfileSetSelectionNameInternalAction.SetSelectionNameSuccess) {
            ExtendedProfileSetSelectionNameConfig extendedProfileSetSelectionNameConfig = this.f151925b;
            ExtendedProfileSetSelectionNameInternalAction.SetSelectionNameSuccess setSelectionNameSuccess = (ExtendedProfileSetSelectionNameInternalAction.SetSelectionNameSuccess) extendedProfileSetSelectionNameInternalAction2;
            return new b.a(new ExtendedProfileSetSelectionImageConfig(extendedProfileSetSelectionNameConfig.f151803b, extendedProfileSetSelectionNameConfig.f151804c, extendedProfileSetSelectionNameConfig.f151805d, extendedProfileSetSelectionNameConfig.f151806e, setSelectionNameSuccess.f151911b, setSelectionNameSuccess.f151912c, extendedProfileSetSelectionNameConfig.f151807f, extendedProfileSetSelectionNameConfig.f151808g));
        }
        if (extendedProfileSetSelectionNameInternalAction2 instanceof ExtendedProfileSetSelectionNameInternalAction.IsPublicChange ? true : extendedProfileSetSelectionNameInternalAction2 instanceof ExtendedProfileSetSelectionNameInternalAction.SetSelectionNameLoading ? true : extendedProfileSetSelectionNameInternalAction2 instanceof ExtendedProfileSetSelectionNameInternalAction.InitState ? true : extendedProfileSetSelectionNameInternalAction2 instanceof ExtendedProfileSetSelectionNameInternalAction.EmptyNameError ? true : extendedProfileSetSelectionNameInternalAction2 instanceof ExtendedProfileSetSelectionNameInternalAction.TypingText) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
