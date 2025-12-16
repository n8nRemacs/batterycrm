package com.avito.android.passport.profile_add.merge;

import Y41.l;
import Y61.k;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.H;
import androidx.view.C19918B;
import androidx.view.x;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.deep_linking.links.PrintableTextUserDialog;
import com.avito.android.passport.deeplinks.PassportSelectBusinessVrfLink;
import com.avito.android.passport.network.model.BusinessVrfDuplication;
import com.avito.android.passport.network.model.MergeAccountsProfile;
import com.avito.android.passport.network.model.PassportUserDialogWithProfile;
import com.avito.android.passport.profile_add.create.duplication_finish.BusinessVerificationDuplicationFinishFragment;
import com.avito.android.passport.profile_add.merge.accounts_profile_error.AccountsProfileErrorFragment;
import com.avito.android.passport.profile_add.merge.business_vrf_duplication.BusinessVrfDuplicationFragment;
import com.avito.android.passport.profile_add.merge.code_confirm.CodeConfirmFragment;
import com.avito.android.passport.profile_add.merge.code_request.CodeRequestFragment;
import com.avito.android.passport.profile_add.merge.domain.MergeFlow;
import com.avito.android.passport.profile_add.merge.full_screen_error_dialog.FullScreenUserDialogFragment;
import com.avito.android.passport.profile_add.merge.profiles_list.ProfilesListFragment;
import com.avito.android.passport.profile_add.merge.select_business_vrf.SelectBusinessVrfFragment;
import com.avito.android.passport.profile_add.merge.select_business_vrf.SelectBusinessVrfOpenParams;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PassportMergeAccountsActivity.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/PassportMergeAccountsActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PassportMergeAccountsActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final a f212380m = new a(null);

    /* compiled from: PassportMergeAccountsActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0006R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0006¨\u0006\u001a"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/PassportMergeAccountsActivity$a;", "", "<init>", "()V", "", "EXTRA_BUSINESS_VRF_DUPLICATION", "Ljava/lang/String;", "EXTRA_BUSINESS_VRF_DUPLICATION_PROFILE_CREATION", "EXTRA_MERGE_FLOW", "EXTRA_MERGE_PROFILES_LIST", "EXTRA_MERGE_SELECT_BUSINESS_VRF_FLOW", "EXTRA_MERGE_USER_DIALOG_WITH_PROFILE", "EXTRA_SCREEN_NAME", "EXTRA_SELECT_BUSINESS_VRF_DRAFT_ID", "EXTRA_USER_BACK_ICON", "EXTRA_USER_DIALOG", "SCREEN_BUSINESS_VRF_DUPLICATION_FINISH", "SCREEN_BUSINESS_VRF_DUPLICATION_PROFILE_CREATION", "SCREEN_CHECK_MERGE_POSSIBILITY", "SCREEN_CONFIRM_OWNERSHIP", "SCREEN_FULL_USER_DIALOG", "SCREEN_PROFILES_LIST", "SCREEN_PROFILE_ERROR", "SCREEN_SELECT_BUSINESS_VRF", "TEST_SCREEN_BUSINESS_VRF_DUPLICATION", "TEST_SCREEN_PROFILE_TO_CONVERT", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: PassportMergeAccountsActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/activity/x;", "Lkotlin/G0;", "invoke", "(Landroidx/activity/x;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<x, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(x xVar) {
            com.avito.android.passport.profile_add.merge.b.a(PassportMergeAccountsActivity.this);
            return G0.f406611a;
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.fragment_container;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void a2(Intent intent) {
        Object serializableExtra;
        Object serializableExtra2;
        String stringExtra;
        String stringExtra2 = intent.getStringExtra("passport.add_profile.screen_name");
        if (stringExtra2 != null) {
            switch (stringExtra2.hashCode()) {
                case -1105854339:
                    if (stringExtra2.equals("passport.add_profile.merge.profile_error")) {
                        Parcelable parcelableExtra = Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("passport.add_profile.merge.user_dialog_with_profile", PassportUserDialogWithProfile.class) : intent.getParcelableExtra("passport.add_profile.merge.user_dialog_with_profile");
                        PassportUserDialogWithProfile passportUserDialogWithProfile = parcelableExtra instanceof PassportUserDialogWithProfile ? (PassportUserDialogWithProfile) parcelableExtra : null;
                        if (passportUserDialogWithProfile != null) {
                            H hE2 = getSupportFragmentManager().e();
                            hE2.c(AccountsProfileErrorFragment.class.getName());
                            AccountsProfileErrorFragment.f212383A0.getClass();
                            hE2.n(R.id.fragment_container, AccountsProfileErrorFragment.a.a(passportUserDialogWithProfile), null);
                            hE2.e();
                            break;
                        }
                    }
                    break;
                case -838727761:
                    if (stringExtra2.equals("passport.add_profile.merge.business_vrf_duplication")) {
                        Object parcelableExtra2 = Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("passport.add_profile.merge.business_vrf_duplication", BusinessVrfDuplication.class) : intent.getParcelableExtra("passport.add_profile.merge.business_vrf_duplication");
                        BusinessVrfDuplication businessVrfDuplication = parcelableExtra2 instanceof BusinessVrfDuplication ? (BusinessVrfDuplication) parcelableExtra2 : null;
                        if (businessVrfDuplication != null) {
                            com.avito.android.passport.profile_add.merge.b.f(this, businessVrfDuplication);
                            break;
                        }
                    }
                    break;
                case -805945033:
                    if (stringExtra2.equals("passport.add_profile.merge.full_screen_error_dialog")) {
                        Parcelable parcelableExtra3 = Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("passport.add_profile.merge.user_dialog", PrintableTextUserDialog.class) : intent.getParcelableExtra("passport.add_profile.merge.user_dialog");
                        PrintableTextUserDialog printableTextUserDialog = parcelableExtra3 instanceof PrintableTextUserDialog ? (PrintableTextUserDialog) parcelableExtra3 : null;
                        if (printableTextUserDialog != null) {
                            com.avito.android.passport.profile_add.merge.b.b(this);
                            H hE3 = getSupportFragmentManager().e();
                            hE3.c(FullScreenUserDialogFragment.class.getName());
                            FullScreenUserDialogFragment.f213050u0.getClass();
                            hE3.n(R.id.fragment_container, FullScreenUserDialogFragment.a.a(printableTextUserDialog), null);
                            hE3.e();
                            break;
                        }
                    }
                    break;
                case -652363110:
                    if (stringExtra2.equals("passport.add_profile.merge.profile_to_convert")) {
                        ArrayList parcelableArrayListExtra = Build.VERSION.SDK_INT >= 33 ? intent.getParcelableArrayListExtra("passport.add_profile.merge.profile_to_convert_list", MergeAccountsProfile.class) : intent.getParcelableArrayListExtra("passport.add_profile.merge.profile_to_convert_list");
                        if (parcelableArrayListExtra != null) {
                            com.avito.android.passport.profile_add.merge.b.g(this, parcelableArrayListExtra);
                            break;
                        }
                    }
                    break;
                case -538999714:
                    if (stringExtra2.equals("passport.add_profile.merge.profiles_list")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            serializableExtra = intent.getSerializableExtra("passport.add_profile.merge.merge_flow", MergeFlow.class);
                        } else {
                            Object serializableExtra3 = intent.getSerializableExtra("passport.add_profile.merge.merge_flow");
                            if (!(serializableExtra3 instanceof MergeFlow)) {
                                serializableExtra3 = null;
                            }
                            serializableExtra = (MergeFlow) serializableExtra3;
                        }
                        MergeFlow mergeFlow = serializableExtra instanceof MergeFlow ? (MergeFlow) serializableExtra : null;
                        if (mergeFlow != null) {
                            com.avito.android.passport.profile_add.merge.b.b(this);
                            H hE4 = getSupportFragmentManager().e();
                            hE4.c(CodeConfirmFragment.class.getName());
                            ProfilesListFragment.f213192A0.getClass();
                            hE4.n(R.id.fragment_container, ProfilesListFragment.a.a(mergeFlow), null);
                            hE4.e();
                            break;
                        }
                    }
                    break;
                case -210437883:
                    if (stringExtra2.equals("passport.add_profile.create.business_vrf_duplication_finish")) {
                        H hE5 = getSupportFragmentManager().e();
                        hE5.c(BusinessVerificationDuplicationFinishFragment.class.getName());
                        BusinessVerificationDuplicationFinishFragment.f211270r0.getClass();
                        hE5.n(R.id.fragment_container, new BusinessVerificationDuplicationFinishFragment(), null);
                        hE5.e();
                        break;
                    }
                    break;
                case -147974439:
                    if (stringExtra2.equals("passport.add_profile.merge.select_business_vrf")) {
                        String stringExtra3 = intent.getStringExtra("passport.add_profile.draft_id");
                        if (Build.VERSION.SDK_INT >= 33) {
                            serializableExtra2 = intent.getSerializableExtra("passport.add_profile.select_business_vrf_flow", PassportSelectBusinessVrfLink.Flow.class);
                        } else {
                            Object serializableExtra4 = intent.getSerializableExtra("passport.add_profile.select_business_vrf_flow");
                            if (!(serializableExtra4 instanceof PassportSelectBusinessVrfLink.Flow)) {
                                serializableExtra4 = null;
                            }
                            serializableExtra2 = (PassportSelectBusinessVrfLink.Flow) serializableExtra4;
                        }
                        PassportSelectBusinessVrfLink.Flow flow = serializableExtra2 instanceof PassportSelectBusinessVrfLink.Flow ? (PassportSelectBusinessVrfLink.Flow) serializableExtra2 : null;
                        if (flow != null) {
                            H hE6 = getSupportFragmentManager().e();
                            hE6.c(SelectBusinessVrfFragment.class.getName());
                            SelectBusinessVrfFragment.a aVar = SelectBusinessVrfFragment.f213348t0;
                            SelectBusinessVrfOpenParams selectBusinessVrfOpenParams = new SelectBusinessVrfOpenParams(flow, stringExtra3);
                            aVar.getClass();
                            SelectBusinessVrfFragment selectBusinessVrfFragment = new SelectBusinessVrfFragment();
                            selectBusinessVrfFragment.f213355s0.setValue(selectBusinessVrfFragment, SelectBusinessVrfFragment.f213349u0[0], selectBusinessVrfOpenParams);
                            hE6.n(R.id.fragment_container, selectBusinessVrfFragment, null);
                            hE6.e();
                            break;
                        }
                    }
                    break;
                case 743495693:
                    if (stringExtra2.equals("passport.add_profile.create.business_vrf_duplication") && (stringExtra = intent.getStringExtra("passport.add_profile.merge.business_vrf_duplication_profile_creation")) != null) {
                        H hE7 = getSupportFragmentManager().e();
                        hE7.c(BusinessVrfDuplicationFragment.class.getName());
                        BusinessVrfDuplicationFragment.f212459D0.getClass();
                        hE7.n(R.id.fragment_container, BusinessVrfDuplicationFragment.a.b(stringExtra), null);
                        hE7.e();
                        break;
                    }
                    break;
                case 1844474887:
                    if (stringExtra2.equals("passport.add_profile.merge.check_possibility")) {
                        com.avito.android.passport.profile_add.merge.b.e(this);
                        break;
                    }
                    break;
                case 1974752187:
                    if (stringExtra2.equals("passport.add_profile.merge.confirm_ownership")) {
                        boolean booleanExtra = intent.getBooleanExtra("passport.add_profile.merge.back_icon", false);
                        com.avito.android.passport.profile_add.merge.b.b(this);
                        H hE8 = getSupportFragmentManager().e();
                        CodeRequestFragment.f212821B0.getClass();
                        hE8.n(R.id.fragment_container, CodeRequestFragment.a.a(booleanExtra), null);
                        hE8.c(CodeRequestFragment.class.getName());
                        hE8.e();
                        break;
                    }
                    break;
            }
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        C19918B.a(getF21241d(), this, new b(), 2);
        if (bundle == null) {
            a2(getIntent());
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onNewIntent(@k Intent intent) {
        super.onNewIntent(intent);
        a2(intent);
    }
}
