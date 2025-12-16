package com.avito.android.extended_profile_tabs.mvi;

import com.avito.android.arch.mvi.t;
import com.avito.android.extended_profile_tabs.mvi.entity.ExtendedProfileTabsInternalAction;
import dB.InterfaceC39553b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ExtendedProfileTabsOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/extended_profile_tabs/mvi/h;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/extended_profile_tabs/mvi/entity/ExtendedProfileTabsInternalAction;", "LdB/b;", "<init>", "()V", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h implements t<ExtendedProfileTabsInternalAction, InterfaceC39553b> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC39553b b(ExtendedProfileTabsInternalAction extendedProfileTabsInternalAction) {
        ExtendedProfileTabsInternalAction extendedProfileTabsInternalAction2 = extendedProfileTabsInternalAction;
        if (extendedProfileTabsInternalAction2 instanceof ExtendedProfileTabsInternalAction.DataLoaded ? true : extendedProfileTabsInternalAction2 instanceof ExtendedProfileTabsInternalAction.DataLoading ? true : extendedProfileTabsInternalAction2 instanceof ExtendedProfileTabsInternalAction.LoadingError ? true : extendedProfileTabsInternalAction2 instanceof ExtendedProfileTabsInternalAction.SelectBrandTab ? true : extendedProfileTabsInternalAction2 instanceof ExtendedProfileTabsInternalAction.SelectRatingTab ? true : extendedProfileTabsInternalAction2 instanceof ExtendedProfileTabsInternalAction.HandleTabNavigationDeeplink ? true : extendedProfileTabsInternalAction2 instanceof ExtendedProfileTabsInternalAction.SelectSearchTab) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
