package com.avito.android.publish.slots.delivery_addresses;

import Eo0.InterfaceC13515a;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.C22960s;
import com.avito.android.adapter.gallery.GalleryItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.lib.design.switcher.Switcher;
import com.avito.android.publish.slots.delivery_summary.re23.q;
import com.avito.android.publish.slots.images_groups_recommendations.item.Recommendation;
import com.avito.android.publish.start_publish.DialogC34131f;
import com.avito.android.publish.start_publish.DialogC34133h;
import com.avito.android.rating.details.RatingDetailsFragment;
import com.avito.android.rating.details.adapter.summary.SummaryItem;
import com.avito.android.rating.info_screen.RatingDetailsInfoActivity;
import com.avito.android.rating_form.api.remote.model.RatingFormAddValueType;
import com.avito.android.rating_form.info.RatingFormInfoArguments;
import com.avito.android.rating_form.info.RatingFormInfoFragment;
import com.avito.android.rating_form.pseudo_done.RatingFormPseudoDoneFragment;
import com.avito.android.rating_ui.reviews.model_review.ModelAction;
import com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem;
import com.avito.android.registration_self_employment_redirect_screen.models.ButtonAction;
import com.avito.android.registration_self_employment_redirect_screen.ui.SelfEmploymentRedirectRenderer;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.PublishStartInfo;
import com.avito.android.rubricator.list.service.model.ServiceListItem;
import com.avito.android.saved_searches.presentation.items.switcher.SwitcherListItem;
import com.avito.android.sbc.create.common.DiscountAlternativesBottomDialog;
import com.avito.android.sbc.create.mvi.entity.DiscountAlternativesDialogItem;
import com.avito.android.screens.bbip_private.ui.items.budget_widget.r;
import com.avito.android.search.filter.converter.common.ActionWithPlaceholdersItem;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import eh0.InterfaceC40105a;
import gh0.C40684c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.G0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f243430b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f243431c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f243432d;

    public /* synthetic */ f(int i12, Y41.l lVar, Object obj) {
        this.f243430b = i12;
        this.f243432d = obj;
        this.f243431c = lVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer num;
        int iIntValue = 0;
        iIntValue = 0;
        Object obj = this.f243432d;
        Object obj2 = this.f243431c;
        switch (this.f243430b) {
            case 0:
                ((Y41.l) obj2).invoke(Integer.valueOf(((g) obj).f243435G.getF180133e()));
                break;
            case 1:
                Set<String> set = com.avito.android.publish.slots.delivery_all_toggles.item.o.f243506u;
                ArrayList arrayList = new ArrayList();
                com.avito.android.publish.slots.delivery_all_toggles.item.o oVar = (com.avito.android.publish.slots.delivery_all_toggles.item.o) obj2;
                arrayList.addAll(oVar.C80());
                Y41.l<? super String, Boolean> lVar = oVar.f243525t;
                if (lVar != null && lVar.invoke("deliveryCourier") != null) {
                    arrayList.add("deliveryDbs");
                }
                Y41.l<? super String, Boolean> lVar2 = oVar.f243525t;
                if (lVar2 != null && lVar2.invoke("deliveryPvz") != null) {
                    arrayList.add("deliveryDbsCourier");
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    Y41.p<? super String, ? super Boolean, G0> pVar = oVar.f243524s;
                    if (pVar != null) {
                        pVar.invoke(str, Boolean.FALSE);
                    }
                }
                ((Y41.a) obj).invoke();
                break;
            case 2:
                ((Y41.l) obj2).invoke(Boolean.valueOf(((q) obj).f243717E.isChecked()));
                break;
            case 3:
                int i12 = com.avito.android.publish.slots.images_groups_recommendations.item.o.f244230e;
                com.avito.android.publish.slots.images_groups_recommendations.item.o oVar2 = (com.avito.android.publish.slots.images_groups_recommendations.item.o) obj2;
                oVar2.f244232c.h7(((Recommendation.Content) ((Recommendation) obj)).f244197e);
                oVar2.f244231b.B("9223372036854775806", "rec");
                break;
            case 4:
                int i13 = DialogC34131f.f245403N;
                ((DialogC34131f) obj2).V(((PublishStartInfo.MultiProfile.Profile) obj).getAction());
                break;
            case 5:
                int i14 = DialogC34131f.f245403N;
                ((DialogC34131f) obj2).V(((Action) obj).getDeepLink());
                break;
            case 6:
                int i15 = DialogC34133h.f245414N;
                ((DialogC34133h) obj2).V(((PublishStartInfo.MultiProfile.Profile) obj).getAction());
                break;
            case 7:
                int i16 = DialogC34133h.f245414N;
                ((DialogC34133h) obj2).V(((Action) obj).getDeepLink());
                break;
            case 8:
                com.avito.android.rating.details.mvi.entity.a aVar = (com.avito.android.rating.details.mvi.entity.a) obj2;
                if (aVar != null) {
                    RatingDetailsFragment.C34165a c34165a = RatingDetailsFragment.f246422S0;
                    ((RatingDetailsFragment) obj).E5().accept(aVar);
                    break;
                }
                break;
            case 9:
                ((com.avito.android.rating.details.adapter.summary.d) obj2).f246558b.invoke((SummaryItem) obj);
                break;
            case 10:
                RatingDetailsInfoActivity.a aVar2 = RatingDetailsInfoActivity.f247616p;
                DeepLink deepLink = ((BaseRatingReviewItem.ReviewAction.ReviewActionValue.ReviewActionInfoButton) obj2).f250286c;
                if (deepLink != null) {
                    com.avito.android.deeplink_handler.handler.composite.a aVar3 = ((RatingDetailsInfoActivity) obj).f247617m;
                    if (aVar3 == null) {
                        aVar3 = null;
                    }
                    b.a.a(aVar3, deepLink, null, null, 6);
                    break;
                }
                break;
            case 11:
                RatingFormInfoFragment.a aVar4 = RatingFormInfoFragment.f248153t0;
                ActivityC22955m activityC22955mRequireActivity = ((RatingFormInfoFragment) obj2).requireActivity();
                RatingFormInfoArguments ratingFormInfoArguments = (RatingFormInfoArguments) obj;
                Intent intent = new Intent();
                intent.putExtra("key_published_rating_user_key", ratingFormInfoArguments.f248152g);
                intent.putExtra("key_redirect_deeplink", ratingFormInfoArguments.f248150e);
                intent.putExtra("key_need_to_reload", false);
                activityC22955mRequireActivity.setResult(-1, intent);
                activityC22955mRequireActivity.finish();
                break;
            case 12:
                RatingFormPseudoDoneFragment.a aVar5 = RatingFormPseudoDoneFragment.f248827s0;
                List<RatingFormAddValueType.Command> listC = ((RatingFormAddValueType.DoneButton) obj).c();
                if (listC != null) {
                    for (RatingFormAddValueType.Command command : listC) {
                        RatingFormPseudoDoneFragment ratingFormPseudoDoneFragment = (RatingFormPseudoDoneFragment) obj2;
                        if (command instanceof RatingFormAddValueType.Command.CloseCommand) {
                            ((com.avito.android.rating_form.pseudo_done.b) ratingFormPseudoDoneFragment.f248830o0.getValue()).accept(InterfaceC40105a.C11101a.f395316a);
                        } else if (command instanceof RatingFormAddValueType.Command.SendDeeplinkCommand) {
                            ActivityC22955m activityC22955mRequireActivity2 = ratingFormPseudoDoneFragment.requireActivity();
                            DeepLink uri = ((RatingFormAddValueType.Command.SendDeeplinkCommand) command).getData().getUri();
                            Intent intent2 = new Intent();
                            intent2.putExtra("key_published_rating_user_key", (String) null);
                            intent2.putExtra("key_redirect_deeplink", uri);
                            intent2.putExtra("key_need_to_reload", false);
                            activityC22955mRequireActivity2.setResult(2, intent2);
                            activityC22955mRequireActivity2.finish();
                        }
                    }
                    break;
                }
                break;
            case 13:
                C40684c.a aVar6 = (C40684c.a) obj;
                if (!aVar6.f396725d) {
                    ((Y41.l) obj2).invoke(aVar6.f396724c);
                    break;
                }
                break;
            case 14:
                DeepLink deeplink = ((com.avito.android.rating_ui.badge_score.a) obj2).getF9894f();
                if (deeplink != null) {
                    ((com.avito.android.rating_ui.badge_score.g) obj).f249966b.accept(new com.avito.android.rating_ui.badge_score.b(deeplink));
                    break;
                }
                break;
            case 15:
                int i17 = com.avito.android.rating_ui.reviews_options.c.f250403G;
                ((Y41.l) obj2).invoke((BaseRatingReviewItem.ReviewAction) obj);
                break;
            case 16:
                int i18 = com.avito.android.rating_ui.reviews_options.c.f250403G;
                ((Y41.l) obj2).invoke((ModelAction) obj);
                break;
            case 17:
                ((Y41.l) obj2).invoke(((com.avito.android.referral_contacts.ui.f) obj).f252598i);
                break;
            case 18:
                ((SelfEmploymentRedirectRenderer) obj2).f252799c.invoke((ButtonAction) obj);
                break;
            case 19:
                com.avito.android.repair_calculator.j jVar = (com.avito.android.repair_calculator.j) obj2;
                com.avito.android.lib.design.chips.h hVar = jVar.f254494h;
                if (hVar != null) {
                    String string = hVar.getF199741b().toString();
                    String str2 = "greybox";
                    switch (string.hashCode()) {
                        case 290245949:
                            if (string.equals("Капитальный")) {
                                str2 = "capital";
                                break;
                            }
                            break;
                        case 1253795238:
                            if (string.equals("Дизайнерский")) {
                                str2 = "designer";
                                break;
                            }
                            break;
                        case 1659424346:
                            string.equals("Черновой");
                            break;
                        case 1990230516:
                            if (string.equals("Косметический")) {
                                str2 = "cosmetic";
                                break;
                            }
                            break;
                    }
                    Map<com.avito.android.lib.design.chips.h, Integer> map = jVar.f254495i;
                    if (map != null && (num = map.get(jVar.f254494h)) != null) {
                        iIntValue = num.intValue();
                    }
                    ((Y41.p) obj).invoke(str2, Integer.valueOf(iIntValue));
                    break;
                }
                break;
            case 20:
                ((com.avito.android.review_gallery.h) obj2).f255500b.invoke((GalleryItem.GalleryButton) obj);
                break;
            case 21:
                int i19 = com.avito.android.rubricator.list.service.item.i.f256002g;
                ((Y41.l) obj2).invoke(((ServiceListItem) obj).f256014f);
                break;
            case 22:
                ((com.avito.android.saved_searches.presentation.items.banner.f) obj2).f258433b.invoke((InterfaceC13515a) obj);
                break;
            case 23:
                SwitcherListItem switcherListItem = (SwitcherListItem) obj;
                Switcher switcher = switcherListItem.f258558i;
                boolean zIsChecked = switcher != null ? switcher.isChecked() : false;
                Switcher switcher2 = switcherListItem.f258558i;
                if (switcher2 != null) {
                    switcher2.toggle();
                }
                ((Y41.l) obj2).invoke(Boolean.valueOf(!zIsChecked));
                break;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                DiscountAlternativesBottomDialog.a aVar7 = DiscountAlternativesBottomDialog.f259170h0;
                Bundle bundle = new Bundle();
                bundle.putString("slug", ((DiscountAlternativesDialogItem) obj).f259790c);
                DiscountAlternativesBottomDialog discountAlternativesBottomDialog = (DiscountAlternativesBottomDialog) obj2;
                C22960s.a(bundle, discountAlternativesBottomDialog, "discount_alternatives_result_key");
                discountAlternativesBottomDialog.dismiss();
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                com.avito.android.screens.bbip_private.ui.items.budget.q qVar = (com.avito.android.screens.bbip_private.ui.items.budget.q) obj;
                Integer num2 = qVar.f260721G;
                if (num2 != null) {
                    ((Y41.l) obj2).invoke(Integer.valueOf(num2.intValue()));
                }
                qVar.dismiss();
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                r rVar = (r) obj;
                Integer num3 = rVar.f260824H;
                if (num3 != null) {
                    ((Y41.l) obj2).invoke(Integer.valueOf(num3.intValue()));
                }
                rVar.dismiss();
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                int i22 = com.avito.android.search.filter.adapter.action_with_placeholders.i.f261956e;
                ((Y41.l) obj2).invoke(((ActionWithPlaceholdersItem) obj).f262903d.getDeeplink());
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                b.a.a(((com.avito.android.search.filter.adapter.checkboxWithBadge.g) obj2).f262131b, (DeepLink) obj, null, null, 6);
                break;
            default:
                int i23 = com.avito.android.search.filter.adapter.keywords.chips.b.f262445c;
                int bindingAdapterPosition = ((com.avito.android.search.filter.adapter.keywords.chips.b) obj2).getBindingAdapterPosition();
                Integer numValueOf = bindingAdapterPosition != -1 ? Integer.valueOf(bindingAdapterPosition) : null;
                if (numValueOf != null) {
                    ((com.jakewharton.rxrelay3.c) obj).accept(Integer.valueOf(numValueOf.intValue()));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ f(int i12, Object obj, Object obj2) {
        this.f243430b = i12;
        this.f243431c = obj;
        this.f243432d = obj2;
    }
}
