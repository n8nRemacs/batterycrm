package com.avito.android.order.feature;

import D80.a;
import Q50.a;
import T50.a;
import U50.a;
import V50.a;
import W50.a;
import Y41.l;
import Y50.a;
import Z40.a;
import a60.InterfaceC19686a;
import android.view.View;
import c60.InterfaceC26947a;
import com.avito.android.lib.design.button.Button;
import com.avito.android.order.feature.OrderFragment;
import com.avito.android.orders.feature.beduin_orders_list.BeduinOrdersFragment;
import com.avito.android.parameters_sheet.i;
import com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.ReAgentSetProfileNameFragment;
import com.avito.android.passport.profile_add.create_flow.select_specific.SelectSpecificFragment;
import com.avito.android.passport.profile_add.create_flow.select_vertical.SelectVerticalFragment;
import com.avito.android.passport.profile_add.create_flow.set_profile_name.SetProfileNameFragment;
import com.avito.android.passport.profile_add.create_flow.verification_popup.VerificationPopupFragment;
import com.avito.android.passport.profile_add.merge.accounts_profile_error.AccountsProfileErrorFragment;
import com.avito.android.passport.profile_add.merge.check.CheckMergePossibilityFragment;
import com.avito.android.passport.profile_add.merge.code_request.CodeRequestFragment;
import com.avito.android.passport.profile_add.merge.full_screen_error_dialog.FullScreenUserDialogFragment;
import com.avito.android.passport.profile_add.merge.profile_to_convert.ProfileToConvertFragment;
import com.avito.android.password_tip.PasswordTipInput;
import com.avito.android.personal_filters.filters_change_dialog.PersonalFiltersChangeDialogFragment;
import com.avito.android.phone_reverification_info.PhoneReverificationInfoActivity;
import com.avito.android.phone_reverification_info.k;
import com.avito.android.photo_gallery.LegacyPhotoGalleryActivity;
import com.avito.android.photo_gallery.PhotoGalleryActivity;
import com.avito.android.photo_list_view.blueprints.m;
import com.avito.android.photo_list_view.z;
import com.avito.android.photo_list_view_group_selection.PhotoItemGroupSelectionActivity;
import com.avito.android.player.view.PlayerFragment;
import com.avito.android.player.view.j;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.banner.BannerItem;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import e60.InterfaceC39956a;
import e80.InterfaceC39964a;
import g70.InterfaceC40541a;
import kotlin.G0;
import y70.InterfaceC50076a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f209509b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f209510c;

    public /* synthetic */ c(Object obj, int i12) {
        this.f209509b = i12;
        this.f209510c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        d0 player;
        d0 player2;
        l<String, G0> lVar;
        Double dB2 = null;
        Object obj = this.f209510c;
        switch (this.f209509b) {
            case 0:
                OrderFragment.a aVar = OrderFragment.f209481G0;
                ((OrderFragment) obj).requireActivity().onBackPressed();
                break;
            case 1:
                BeduinOrdersFragment.a aVar2 = BeduinOrdersFragment.f209960E0;
                ((BeduinOrdersFragment) obj).s5().accept(new a.d(null, 1, null));
                break;
            case 2:
                ((i) obj).f210842a.accept(G0.f406611a);
                break;
            case 3:
                ReAgentSetProfileNameFragment.a aVar3 = ReAgentSetProfileNameFragment.f211382C0;
                ((ReAgentSetProfileNameFragment) obj).t5().accept(a.b.f13468a);
                break;
            case 4:
                SelectSpecificFragment.a aVar4 = SelectSpecificFragment.f211624C0;
                ((SelectSpecificFragment) obj).t5().accept(a.c.f15364a);
                break;
            case 5:
                SelectVerticalFragment.a aVar5 = SelectVerticalFragment.f211812E0;
                ((SelectVerticalFragment) obj).t5().accept(a.c.f16182a);
                break;
            case 6:
                SetProfileNameFragment.a aVar6 = SetProfileNameFragment.f212039E0;
                ((SetProfileNameFragment) obj).v5().accept(a.c.f16912a);
                break;
            case 7:
                VerificationPopupFragment.a aVar7 = VerificationPopupFragment.f212207x0;
                ((VerificationPopupFragment) obj).t5().accept(a.c.f17740a);
                break;
            case 8:
                AccountsProfileErrorFragment.a aVar8 = AccountsProfileErrorFragment.f212383A0;
                ((com.avito.android.passport.profile_add.merge.accounts_profile_error.h) ((AccountsProfileErrorFragment) obj).f212386o0.getValue()).accept(a.b.f19295a);
                break;
            case 9:
                CheckMergePossibilityFragment.a aVar9 = CheckMergePossibilityFragment.f212597x0;
                ((com.avito.android.passport.profile_add.merge.check.f) ((CheckMergePossibilityFragment) obj).f212600o0.getValue()).accept(InterfaceC19686a.C1482a.f20741a);
                break;
            case 10:
                CodeRequestFragment.a aVar10 = CodeRequestFragment.f212821B0;
                CodeRequestFragment codeRequestFragment = (CodeRequestFragment) obj;
                codeRequestFragment.r5().accept(new InterfaceC26947a.d(codeRequestFragment.q5().getDeformattedText()));
                break;
            case 11:
                FullScreenUserDialogFragment.a aVar11 = FullScreenUserDialogFragment.f213050u0;
                com.avito.android.passport.profile_add.merge.b.c(((FullScreenUserDialogFragment) obj).requireActivity(), false, null);
                break;
            case 12:
                ProfileToConvertFragment.a aVar12 = ProfileToConvertFragment.f213078w0;
                ((ProfileToConvertFragment) obj).q5().accept(InterfaceC39956a.C11053a.f394957a);
                break;
            case 13:
                int i12 = PasswordTipInput.f213950i;
                PasswordTipInput passwordTipInput = (PasswordTipInput) obj;
                boolean z12 = !passwordTipInput.f213953d;
                passwordTipInput.f213953d = z12;
                CE0.a.a(passwordTipInput.f213951b, z12, null, null);
                break;
            case 14:
                PersonalFiltersChangeDialogFragment personalFiltersChangeDialogFragment = (PersonalFiltersChangeDialogFragment) obj;
                if (!personalFiltersChangeDialogFragment.f215708l0) {
                    personalFiltersChangeDialogFragment.f215709m0 = (Button) view;
                    ((com.avito.android.personal_filters.filters_change_dialog.g) personalFiltersChangeDialogFragment.f215706j0.getValue()).accept(new InterfaceC40541a.b(personalFiltersChangeDialogFragment.f215707k0));
                    break;
                }
                break;
            case 15:
                int i13 = PhoneReverificationInfoActivity.f216041v;
                ((k) ((PhoneReverificationInfoActivity) obj).f216043n.getValue()).accept(InterfaceC50076a.C12887a.f442943a);
                break;
            case 16:
                LegacyPhotoGalleryActivity.a aVar13 = LegacyPhotoGalleryActivity.f216531m0;
                ((LegacyPhotoGalleryActivity) obj).onBackPressed();
                break;
            case 17:
                int i14 = PhotoGalleryActivity.f216648B;
                ((PhotoGalleryActivity) obj).onBackPressed();
                break;
            case 18:
                ((z) obj).f218359a.r();
                break;
            case 19:
                ((m) obj).f218150g.performClick();
                break;
            case 20:
                ((com.avito.android.photo_list_view.re23.c) obj).f218199a.r();
                break;
            case 21:
                int i15 = PhotoItemGroupSelectionActivity.f218362r;
                ((com.avito.android.photo_list_view_group_selection.mvi.l) ((PhotoItemGroupSelectionActivity) obj).f218364n.getValue()).accept(InterfaceC39964a.b.f394975a);
                break;
            case 22:
                ((com.avito.android.photo_list_view_groups.f) obj).f218543a.r();
                break;
            case 23:
                Y41.a<G0> aVar14 = ((com.avito.android.photo_picker.gallery.gallery_list.i) obj).f219542e;
                if (aVar14 != null) {
                    aVar14.invoke();
                    break;
                }
                break;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                Y41.a<G0> aVar15 = ((com.avito.android.photo_picker.gallery.gallery_list.re23.c) obj).f219562e;
                if (aVar15 != null) {
                    aVar15.invoke();
                    break;
                }
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Y41.a<G0> aVar16 = ((com.avito.android.photo_picker.legacy.thumbnail_list.k) obj).f219903f;
                if (aVar16 != null) {
                    aVar16.invoke();
                    break;
                }
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                PlayerFragment.a aVar17 = PlayerFragment.f220234F0;
                PlayerFragment playerFragment = (PlayerFragment) obj;
                j jVarE5 = playerFragment.E5();
                StyledPlayerView styledPlayerView = playerFragment.f220247z0;
                Double dValueOf = (styledPlayerView == null || (player2 = styledPlayerView.getPlayer()) == null) ? null : Double.valueOf(player2.getCurrentPosition() / 1000.0d);
                StyledPlayerView styledPlayerView2 = playerFragment.f220247z0;
                if (styledPlayerView2 != null && (player = styledPlayerView2.getPlayer()) != null) {
                    dB2 = J80.g.b(player);
                }
                jVarE5.accept(new a.C0150a(dValueOf, dB2));
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                int i16 = com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.e.f221018f;
                ((com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.e) obj).d();
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                BannerItem bannerItem = ((com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.banner.f) obj).f220883b;
                if (bannerItem != null && (lVar = bannerItem.f220860g) != null) {
                    lVar.invoke(bannerItem.f220855b);
                    break;
                }
                break;
            default:
                com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.query.a aVar18 = ((com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.query.g) obj).f221111k;
                if (aVar18 != null) {
                    aVar18.f221091i.invoke(aVar18.f221084b);
                    break;
                }
                break;
        }
    }
}
