package com.avito.android.passport.profile_add;

import com.avito.android.P1;
import com.avito.android.deep_linking.links.ProfileCreateExtendedLink;
import com.avito.android.passport.profile_add.ProfileCreateExtendedFlow;
import com.avito.android.passport.profile_add.create_flow.host.ExtendedProfileCreationHostFragment;
import com.avito.android.passport.profile_add.create_flow.host.Navigation;
import com.avito.android.passport.profile_add.create_flow.select_vertical.SelectVerticalArguments;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.UUID;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ProfileCreateExtendedFragmentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport/profile_add/h;", "Lcom/avito/android/P1;", "<init>", "()V", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class h implements P1 {
    @Inject
    public h() {
    }

    @Override // com.avito.android.P1
    @Y61.k
    public final ExtendedProfileCreationHostFragment a(@Y61.k ProfileCreateExtendedLink profileCreateExtendedLink) {
        ProfileCreateExtendedFlow.f211169c.getClass();
        ProfileCreateExtendedFlow profileCreateExtendedFlowA = ProfileCreateExtendedFlow.a.a(profileCreateExtendedLink);
        Navigation.SelectVertical selectVertical = new Navigation.SelectVertical(new SelectVerticalArguments(UUID.randomUUID().toString(), profileCreateExtendedFlowA, profileCreateExtendedLink.f133595c, false, null, null, 56, null));
        ExtendedProfileCreationHostFragment.f211360o0.getClass();
        return ExtendedProfileCreationHostFragment.a.a(profileCreateExtendedFlowA, selectVertical, null);
    }
}
