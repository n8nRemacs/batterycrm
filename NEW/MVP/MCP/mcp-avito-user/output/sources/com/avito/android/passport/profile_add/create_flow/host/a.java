package com.avito.android.passport.profile_add.create_flow.host;

import Y41.l;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.passport.profile_add.create_flow.host.ExtendedProfileCreationHostFragment;
import com.avito.android.passport.profile_add.create_flow.host.Navigation;
import com.avito.android.passport.profile_add.create_flow.select_specific.SelectSpecificFragment;
import com.avito.android.passport.profile_add.create_flow.select_vertical.SelectVerticalFragment;
import com.avito.android.passport.profile_add.create_flow.set_profile_name.SetProfileNameFragment;
import com.avito.android.passport.profile_add.create_flow.verification_popup.VerificationPopupFragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ExtendedProfileCreationHostFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/host/Navigation;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/passport/profile_add/create_flow/host/Navigation;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class a extends N implements l<Navigation, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ExtendedProfileCreationHostFragment f211373l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ExtendedProfileCreationHostFragment extendedProfileCreationHostFragment) {
        super(1);
        this.f211373l = extendedProfileCreationHostFragment;
    }

    @Override // Y41.l
    public final G0 invoke(Navigation navigation2) {
        Navigation navigation3 = navigation2;
        boolean z12 = navigation3 instanceof Navigation.SelectVertical;
        ExtendedProfileCreationHostFragment extendedProfileCreationHostFragment = this.f211373l;
        if (z12) {
            ExtendedProfileCreationHostFragment.a aVar = ExtendedProfileCreationHostFragment.f211360o0;
            SelectVerticalFragment.f211812E0.getClass();
            SelectVerticalFragment selectVerticalFragment = new SelectVerticalFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("passport.add_profile.select_vertical.select_vertical_args", ((Navigation.SelectVertical) navigation3).f211370b);
            selectVerticalFragment.setArguments(bundle);
            H hE2 = extendedProfileCreationHostFragment.getChildFragmentManager().e();
            hE2.n(R.id.fragment_container, selectVerticalFragment, null);
            hE2.c(null);
            hE2.e();
        } else if (navigation3 instanceof Navigation.SelectSpecific) {
            ExtendedProfileCreationHostFragment.a aVar2 = ExtendedProfileCreationHostFragment.f211360o0;
            SelectSpecificFragment.f211624C0.getClass();
            SelectSpecificFragment selectSpecificFragment = new SelectSpecificFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("passport.add_profile.select_specific.select_specific_args", ((Navigation.SelectSpecific) navigation3).f211369b);
            selectSpecificFragment.setArguments(bundle2);
            H hE3 = extendedProfileCreationHostFragment.getChildFragmentManager().e();
            hE3.n(R.id.fragment_container, selectSpecificFragment, null);
            hE3.c(null);
            hE3.e();
        } else if (navigation3 instanceof Navigation.SetProfileName) {
            ExtendedProfileCreationHostFragment.a aVar3 = ExtendedProfileCreationHostFragment.f211360o0;
            H hE4 = extendedProfileCreationHostFragment.getChildFragmentManager().e();
            SetProfileNameFragment.f212039E0.getClass();
            SetProfileNameFragment setProfileNameFragment = new SetProfileNameFragment();
            Bundle bundle3 = new Bundle();
            bundle3.putParcelable("passport.add_profile.set_profile_name.args", ((Navigation.SetProfileName) navigation3).f211371b);
            setProfileNameFragment.setArguments(bundle3);
            hE4.n(R.id.fragment_container, setProfileNameFragment, null);
            hE4.c(null);
            hE4.e();
        } else if (navigation3 instanceof Navigation.VerificationPopup) {
            ExtendedProfileCreationHostFragment.a aVar4 = ExtendedProfileCreationHostFragment.f211360o0;
            H hE5 = extendedProfileCreationHostFragment.getChildFragmentManager().e();
            VerificationPopupFragment.f212207x0.getClass();
            VerificationPopupFragment verificationPopupFragment = new VerificationPopupFragment();
            Bundle bundle4 = new Bundle();
            bundle4.putParcelable("passport.add_profile.verification_popup.verification_popup_args", ((Navigation.VerificationPopup) navigation3).f211372b);
            verificationPopupFragment.setArguments(bundle4);
            hE5.n(R.id.fragment_container, verificationPopupFragment, null);
            hE5.c(null);
            hE5.e();
        } else if (navigation3 instanceof Navigation.Back) {
            extendedProfileCreationHostFragment.requireActivity().onBackPressed();
        } else if (navigation3 instanceof Navigation.Close) {
            ActivityC22955m activityC22955mRequireActivity = extendedProfileCreationHostFragment.requireActivity();
            Intent intent = activityC22955mRequireActivity.getIntent();
            Navigation.Close close = (Navigation.Close) navigation3;
            intent.putExtra("PassportAddProfileActivity_result", close.f211368c);
            if (close.f211367b) {
                activityC22955mRequireActivity.setResult(-1, intent);
            }
            activityC22955mRequireActivity.finish();
        }
        return G0.f406611a;
    }
}
