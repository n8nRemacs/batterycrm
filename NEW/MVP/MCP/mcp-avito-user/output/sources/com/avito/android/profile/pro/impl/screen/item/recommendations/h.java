package com.avito.android.profile.pro.impl.screen.item.recommendations;

import D90.a;
import Db0.InterfaceC13382a;
import K90.a;
import M90.a;
import Vc0.InterfaceC15664a;
import Xc0.InterfaceC16989a;
import Y41.l;
import ad0.InterfaceC19870a;
import android.graphics.PointF;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.view.O0;
import com.avito.android.R;
import com.avito.android.deep_linking.links.ClickStreamLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.MyAdvertLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.edit_address.entity.ExtendedProfilesSettingsAddress;
import com.avito.android.lib.design.input.Input;
import com.avito.android.profile.pro.impl.screen.item.widget_group.title.ProfileProWidgetGroupTitleItem;
import com.avito.android.profile.pro.impl.screen.item.widget_group.widget.ProfileProWidgetItem;
import com.avito.android.profile.remove.ProfileRemoveActivity;
import com.avito.android.profile.remove.analytics.ProfileRemoveAnalytics;
import com.avito.android.profile.remove.m;
import com.avito.android.profile.remove.screen.ProfileRemoveItemsFragment;
import com.avito.android.profile.remove.screen.get_money.HowToReturnMoneyFragment;
import com.avito.android.profile.remove.screen.get_money.HowToReturnMoneyParams;
import com.avito.android.profile_settings.p;
import com.avito.android.profile_settings_basic.adapter.basic_info.BasicInfoItem;
import com.avito.android.profile_settings_basic.adapter.basic_info.s;
import com.avito.android.profile_vk_linking.linked_group.t;
import com.avito.android.profile_vk_linking.start.n;
import com.avito.android.promo_snippet.list.next_button.PromoNextButtonItem;
import com.avito.android.promoblock.TnsPromoBlockItem;
import com.avito.android.publish.details.C33775o;
import com.avito.android.publish.details.auto_description.k;
import com.avito.android.publish.items.button.DeepLinkActionButtonItem;
import com.avito.android.publish.items.video_upload.VideoUploadItemView;
import com.avito.android.publish.price_list.items.selected.v;
import com.avito.android.publish.price_list.items.selected.w;
import com.avito.android.publish.realty_address_submission.RealtyAddressSubmissionBottomSheetDialog;
import com.avito.android.publish.slots.contact_method.publish.item.ContactMethodType;
import com.avito.android.remote.model.category_parameters.CategoryPublishStep;
import com.avito.android.remote.model.category_parameters.slot.imv.BubbleInfo;
import com.avito.android.remote.model.profile_removal.ButtonTypes;
import com.avito.android.remote.model.submission.RealtyAddressSubmissionResultAction;
import com.avito.android.util.D6;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.G0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;
import yd0.C50229c;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f223429b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f223430c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f223431d;

    public /* synthetic */ h(int i12, Object obj, Object obj2) {
        this.f223429b = i12;
        this.f223430c = obj;
        this.f223431d = obj2;
    }

    /* JADX WARN: Type inference failed for: r4v19, types: [Y41.l, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r5v21, types: [Y41.l, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r6v2, types: [com.avito.android.publish.screen.step.params.view.actions.r, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f223431d;
        Object obj2 = this.f223430c;
        switch (this.f223429b) {
            case 0:
                l<? super D90.a, G0> lVar = ((j) obj2).f223438f;
                if (lVar != null) {
                    lVar.invoke(new a.h(((ProfileProRecommendationsItem) obj).f223405d));
                    return;
                }
                return;
            case 1:
                int i12 = com.avito.android.profile.pro.impl.screen.item.widget_group.title.g.f223581e;
                ((l) obj2).invoke(new a.A((ProfileProWidgetGroupTitleItem) obj));
                return;
            case 2:
                int i13 = com.avito.android.profile.pro.impl.screen.item.widget_group.widget.g.f223606g;
                ((l) obj2).invoke(new a.B((ProfileProWidgetItem) obj));
                return;
            case 3:
                com.avito.android.profile.remove.i iVar = ((ProfileRemoveActivity) obj2).f223758m;
                (iVar != null ? iVar : null).accept(new a.C0556a(((m.a) obj).f223939a));
                return;
            case 4:
                ProfileRemoveItemsFragment.a aVar = ProfileRemoveItemsFragment.f223972w0;
                L90.a aVar2 = (L90.a) obj2;
                ProfileRemoveItemsFragment profileRemoveItemsFragment = (ProfileRemoveItemsFragment) obj;
                ProfileRemoveAnalytics profileRemoveAnalytics = profileRemoveItemsFragment.f223977r0;
                ProfileRemoveAnalytics profileRemoveAnalytics2 = profileRemoveAnalytics != null ? profileRemoveAnalytics : null;
                String strA = profileRemoveAnalytics2.f223772b.a();
                if (strA != null) {
                    profileRemoveAnalytics2.f223771a.c(new C50229c(strA));
                }
                ButtonTypes buttonTypes = aVar2.f9815c;
                int i14 = buttonTypes == null ? -1 : ProfileRemoveItemsFragment.b.f223983a[buttonTypes.ordinal()];
                O0 o02 = profileRemoveItemsFragment.f223981v0;
                if (i14 == 1) {
                    ((com.avito.android.profile.remove.screen.c) o02.getValue()).accept(a.c.f10422a);
                    return;
                }
                DeepLink deepLink = aVar2.f9814b;
                if (deepLink != null) {
                    ((com.avito.android.profile.remove.screen.c) o02.getValue()).accept(new a.b(deepLink));
                    return;
                }
                return;
            case 5:
                HowToReturnMoneyFragment.a aVar3 = HowToReturnMoneyFragment.f224046r0;
                DeepLink deepLink2 = ((HowToReturnMoneyParams) obj2).f224055e;
                if (deepLink2 != null) {
                    com.avito.android.deeplink_handler.handler.composite.a aVar4 = ((HowToReturnMoneyFragment) obj).f224047n0;
                    if (aVar4 == null) {
                        aVar4 = null;
                    }
                    b.a.a(aVar4, deepLink2, null, null, 6);
                    return;
                }
                return;
            case 6:
                ((p) obj2).f228497a.accept(new InterfaceC13382a.b((DeepLink) obj));
                return;
            case 7:
                int i15 = s.f228645k;
                BasicInfoItem.TextField textField = (BasicInfoItem.TextField) obj2;
                if (textField != null) {
                    if (L.f(textField.f228605e, Boolean.FALSE)) {
                        return;
                    }
                }
                ((Y41.a) obj).invoke();
                return;
            case 8:
                com.avito.android.profile_settings_extended.adapter.about.j jVar = (com.avito.android.profile_settings_extended.adapter.about.j) obj2;
                jVar.f229120d.setMaxLines(Integer.MAX_VALUE);
                D6.w(jVar.f229121e);
                Y41.a aVar5 = (Y41.a) obj;
                if (aVar5 != null) {
                    aVar5.invoke();
                    return;
                }
                return;
            case 9:
                int i16 = com.avito.android.profile_settings_extended.adapter.geo.m.f229472h;
                ((l) obj2).invoke((ExtendedProfilesSettingsAddress) obj);
                return;
            case 10:
                ((l0.a) obj2).f406838b = true;
                ((com.avito.android.lib.design.bottom_sheet.d) obj).dismiss();
                return;
            case 11:
                ((com.avito.android.profile_vk_linking.group_management.j) obj2).f231188c.accept((InterfaceC15664a) obj);
                return;
            case 12:
                ((t) obj2).f231330c.accept(new InterfaceC16989a.b((DeepLink) obj));
                return;
            case 13:
                ((n) obj2).f231487c.accept(new InterfaceC19870a.b((DeepLink) obj));
                return;
            case 14:
                int i17 = com.avito.android.promo_snippet.list.next_button.c.f231747d;
                ((l) obj2).invoke(((PromoNextButtonItem) obj).f231741c);
                return;
            case 15:
                ((com.avito.android.promoblock.l) obj2).f231803h.accept((TnsPromoBlockItem.b) obj);
                return;
            case 16:
                com.avito.android.publish.cpa_tariff.c cVar = (com.avito.android.publish.cpa_tariff.c) obj;
                ((Y41.p) obj2).invoke(cVar.f232433c.getDeformattedText(), cVar.f232434d.getDeformattedText());
                return;
            case 17:
                CategoryPublishStep.Params.NavigationButton navigationButton = (CategoryPublishStep.Params.NavigationButton) obj;
                ((C33775o) obj2).f234858b.d(navigationButton.getAction(), navigationButton.getConfirmation(), navigationButton.getDeepLink(), navigationButton.getBeduinActions(), navigationButton.getParamsToFill());
                return;
            case 18:
                if (((k) obj2).f233551l.findViewById(R.id.error_view) == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                }
                ((N) obj).invoke(Boolean.valueOf(!D6.y((ViewGroup) r13)));
                return;
            case 19:
                int i18 = com.avito.android.publish.enrichment_feedback.b.f235637H;
                Input.f179303W.getClass();
                com.avito.android.publish.enrichment_feedback.b bVar = (com.avito.android.publish.enrichment_feedback.b) obj2;
                bVar.V(Input.f179304a0, false, null, false);
                ((Y41.p) obj).invoke(bVar.f235638E.getDeformattedText(), bVar);
                return;
            case 20:
                ((N) obj2).invoke((BubbleInfo) obj);
                return;
            case 21:
                ((com.avito.android.publish.items.button.g) obj2).f236791b.accept(((DeepLinkActionButtonItem) obj).f236785e);
                return;
            case 22:
                PointF pointF = com.avito.android.publish.items.video_upload.k.f237311N;
                ((com.avito.android.job.cv_info_actualization.ui.items.radio.g) obj2).onClick(view);
                ((com.avito.android.publish.items.video_upload.k) obj).Lg(VideoUploadItemView.State.f237254b, null);
                return;
            case 23:
                ClickStreamLink clickStreamLink = (ClickStreamLink) obj2;
                if (clickStreamLink != null) {
                    b.a.a(((com.avito.android.publish.items.video_upload.k) obj).f237327d, clickStreamLink, null, null, 6);
                    return;
                } else {
                    PointF pointF2 = com.avito.android.publish.items.video_upload.k.f237311N;
                    return;
                }
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                l<? super Integer, G0> lVar2 = ((v) obj2).f238746c;
                if (lVar2 != null) {
                    lVar2.invoke(Integer.valueOf(((com.avito.android.publish.price_list.items.selected.a) obj).f238710a));
                    return;
                }
                return;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                w wVar = (w) obj2;
                wVar.n3(!wVar.f238756f);
                ((l) obj).invoke(Boolean.valueOf(wVar.f238756f));
                return;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                l<? super Integer, G0> lVar3 = ((w) obj2).f238753c;
                if (lVar3 != null) {
                    lVar3.invoke(Integer.valueOf(((com.avito.android.publish.price_list.items.selected.a) obj).f238710a));
                    return;
                }
                return;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                RealtyAddressSubmissionBottomSheetDialog.a aVar6 = RealtyAddressSubmissionBottomSheetDialog.f239040k0;
                RealtyAddressSubmissionResultAction realtyAddressSubmissionResultAction = (RealtyAddressSubmissionResultAction) obj2;
                RealtyAddressSubmissionBottomSheetDialog realtyAddressSubmissionBottomSheetDialog = (RealtyAddressSubmissionBottomSheetDialog) obj;
                if (!(realtyAddressSubmissionResultAction.getDeepLink() instanceof MyAdvertLink.Activate)) {
                    com.avito.android.deeplink_handler.handler.composite.a aVar7 = realtyAddressSubmissionBottomSheetDialog.f239041h0;
                    if (aVar7 == null) {
                        aVar7 = null;
                    }
                    b.a.a(aVar7, realtyAddressSubmissionResultAction.getDeepLink(), null, null, 6);
                    return;
                }
                com.avito.android.deeplink_handler.handler.composite.a aVar8 = realtyAddressSubmissionBottomSheetDialog.f239041h0;
                if (aVar8 == null) {
                    aVar8 = null;
                }
                DeepLink deepLink3 = realtyAddressSubmissionResultAction.getDeepLink();
                Bundle bundle = new Bundle();
                bundle.putBoolean("key_should_finish_after_activation", false);
                G0 g02 = G0.f406611a;
                b.a.a(aVar8, deepLink3, null, bundle, 2);
                return;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                CategoryPublishStep.Params.NavigationButton navigationButton2 = (CategoryPublishStep.Params.NavigationButton) obj;
                ((com.avito.android.publish.screen.step.params.view.actions.h) obj2).f241557b.d(navigationButton2.getAction(), navigationButton2.getConfirmation(), navigationButton2.getDeepLink(), navigationButton2.getBeduinActions(), navigationButton2.getParamsToFill());
                return;
            default:
                l<? super ContactMethodType, G0> lVar4 = ((com.avito.android.publish.slots.contact_method.publish.item.d) obj2).f243343n;
                if (lVar4 != null) {
                    lVar4.invoke((ContactMethodType) obj);
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ h(l lVar, BubbleInfo bubbleInfo) {
        this.f223429b = 20;
        this.f223430c = (N) lVar;
        this.f223431d = bubbleInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ h(k kVar, l lVar) {
        this.f223429b = 18;
        this.f223430c = kVar;
        this.f223431d = (N) lVar;
    }
}
