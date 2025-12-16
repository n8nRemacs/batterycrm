package com.avito.android.passport.profile_add;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.passport.profile_add.analytics.AnalyticScreen;
import com.avito.android.passport.profile_add.create_flow.host.ExtendedProfileCreationHostFragment;
import com.avito.android.passport.profile_add.create_flow.host.Navigation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: PassportAddProfileActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/passport/profile_add/PassportAddProfileActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PassportAddProfileActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public static final a f211167n = new a(null);

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final h f211168m = new h();

    /* compiled from: PassportAddProfileActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/passport/profile_add/PassportAddProfileActivity$a;", "", "<init>", "()V", "", "EXTRA_FIRST_SCREEN_ARG", "Ljava/lang/String;", "EXTRA_NAVIGATION_ARG", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.activity_passport_add_profile;
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onBackPressed() {
        List<Fragment> listP = getSupportFragmentManager().P();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listP) {
            if (obj instanceof com.avito.android.ui.fragments.c) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((com.avito.android.ui.fragments.c) it.next()).i0()) {
                return;
            }
        }
        if (getSupportFragmentManager().L() > 1) {
            getSupportFragmentManager().Y();
        } else {
            finish();
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        ProfileCreateExtendedFlow profileCreateExtendedFlow;
        super.onCreate(bundle);
        if (bundle == null) {
            Intent intent = getIntent();
            int i12 = Build.VERSION.SDK_INT;
            Parcelable parcelableExtra = i12 >= 33 ? (Parcelable) intent.getParcelableExtra("passport.add_profile.navigation_arg", Navigation.class) : intent.getParcelableExtra("passport.add_profile.navigation_arg");
            if (parcelableExtra == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Navigation navigation2 = (Navigation) parcelableExtra;
            Intent intent2 = getIntent();
            AnalyticScreen analyticScreen = (AnalyticScreen) (i12 >= 33 ? (Parcelable) intent2.getParcelableExtra("passport.add_profile.first_screen_arg", AnalyticScreen.class) : intent2.getParcelableExtra("passport.add_profile.first_screen_arg"));
            this.f211168m.getClass();
            if (navigation2 instanceof Navigation.SelectSpecific) {
                profileCreateExtendedFlow = ((Navigation.SelectSpecific) navigation2).f211369b.f211619f;
            } else if (navigation2 instanceof Navigation.SelectVertical) {
                profileCreateExtendedFlow = ((Navigation.SelectVertical) navigation2).f211370b.f211807c;
            } else if (navigation2 instanceof Navigation.SetProfileName) {
                profileCreateExtendedFlow = ((Navigation.SetProfileName) navigation2).f211371b.f212035e;
            } else {
                if (!(navigation2 instanceof Navigation.VerificationPopup)) {
                    if (navigation2 instanceof Navigation.Close) {
                        throw new IllegalStateException("Create ExtendedProfileCreationHostFragment with Navigation.Close");
                    }
                    if (!navigation2.equals(Navigation.Back.f211366b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new IllegalStateException("Create ExtendedProfileCreationHostFragment with Navigation.Back");
                }
                profileCreateExtendedFlow = ((Navigation.VerificationPopup) navigation2).f211372b.f212202d;
            }
            ExtendedProfileCreationHostFragment.f211360o0.getClass();
            ExtendedProfileCreationHostFragment extendedProfileCreationHostFragmentA = ExtendedProfileCreationHostFragment.a.a(profileCreateExtendedFlow, navigation2, analyticScreen);
            H hE2 = getSupportFragmentManager().e();
            hE2.n(R.id.fragment_container, extendedProfileCreationHostFragmentA, null);
            hE2.c(null);
            hE2.e();
        }
    }
}
