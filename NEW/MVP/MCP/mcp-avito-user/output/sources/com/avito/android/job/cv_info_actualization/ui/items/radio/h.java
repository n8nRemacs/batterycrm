package com.avito.android.job.cv_info_actualization.ui.items.radio;

import TP.a;
import Y41.l;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import androidx.fragment.app.FragmentManager;
import bY.InterfaceC25585b;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.y;
import com.avito.android.avito_map.AvitoMap;
import com.avito.android.avito_map.AvitoMapCameraPosition;
import com.avito.android.avito_map.AvitoMapMarker;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.w;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.job.interview.JobInterviewInvitationActivity;
import com.avito.android.job.interview.pickers.TimePickerDialog;
import com.avito.android.job.interview.pickers.k;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.picker.Picker;
import com.avito.android.lib.design.tab_bar.TabBarLayout;
import com.avito.android.loyalty.ui.quality_service.items.grade_info.b;
import com.avito.android.loyalty.ui.quality_service.m;
import com.avito.android.loyalty.ui.quality_service.mvi.p;
import com.avito.android.mandatory_verification.items.uploader.MandatoryVerificationUploaderItem;
import com.avito.android.mandatory_verification.items.uploader.o;
import com.avito.android.map.view.C31642f;
import com.avito.android.messenger.conversation.mvi.platform_actions.buttons.s;
import com.avito.android.messenger.conversation.mvi.platform_actions.f;
import com.avito.android.messenger.map.sharing.z;
import com.avito.android.messenger_icebreakers_dialog.MessengerIcebreakerDialogResult;
import com.avito.android.messenger_icebreakers_dialog.view.MessengerIcebreakerBottomSheetFragment;
import com.avito.android.mortgage.api.model.ActionButton;
import com.avito.android.mortgage.api.model.MortgageTerms;
import com.avito.android.mortgage.terms.MortgageTermsDialog;
import com.avito.android.mortgage.widgets.VerticalStepsBar;
import com.avito.android.remote.model.CloseMapButton;
import com.avito.android.remote.model.NoVisibleObjectsAction;
import com.avito.android.remote.model.NoVisibleObjectsCurtain;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.util.D6;
import com.avito.android.util.K2;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.G0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;
import p10.C44974a;
import pX.InterfaceC47025a;
import vQ.InterfaceC49249a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f174308b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f174309c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f174310d;

    public /* synthetic */ h(int i12, l lVar, Object obj) {
        this.f174308b = i12;
        this.f174310d = lVar;
        this.f174309c = obj;
    }

    /* JADX WARN: Type inference failed for: r4v16, types: [Y41.p, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r4v30, types: [Y41.l, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r4v31, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TimePickerDialog.Mode mode;
        k aVar;
        DeepLink uri;
        ActionButton actionButtonC;
        DeepLink deepLinkC;
        Object obj = this.f174309c;
        Object obj2 = this.f174310d;
        switch (this.f174308b) {
            case 0:
                int i12 = i.f174311f;
                DeepLink deepLink = ((c) obj).f174295e;
                if (deepLink != null) {
                    ((l) obj2).invoke(new a.AbstractC1070a.d(deepLink));
                    return;
                }
                return;
            case 1:
                JobInterviewInvitationActivity.a aVar2 = JobInterviewInvitationActivity.f174509y;
                ((JobInterviewInvitationActivity) obj).a2().accept((InterfaceC49249a) obj2);
                return;
            case 2:
                JobInterviewInvitationActivity.a aVar3 = JobInterviewInvitationActivity.f174509y;
                ((JobInterviewInvitationActivity) obj).a2().accept(new InterfaceC49249a.g(((com.avito.android.job.interview.domain.i) obj2).f174561b));
                return;
            case 3:
                int i13 = TimePickerDialog.f174636M;
                ViewGroup viewGroup = (ViewGroup) obj;
                viewGroup.removeView(viewGroup.findViewWithTag("picker_view"));
                TimePickerDialog timePickerDialog = (TimePickerDialog) obj2;
                int iOrdinal = timePickerDialog.f174639G.ordinal();
                if (iOrdinal == 0) {
                    mode = TimePickerDialog.Mode.f174646c;
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    mode = TimePickerDialog.Mode.f174645b;
                }
                timePickerDialog.f174639G = mode;
                timePickerDialog.X(viewGroup);
                return;
            case 4:
                TimePickerDialog timePickerDialog2 = (TimePickerDialog) obj;
                int iOrdinal2 = timePickerDialog2.f174639G.ordinal();
                Picker picker = (Picker) obj2;
                if (iOrdinal2 == 0) {
                    com.avito.android.lib.design.picker.k<?> firstWheelValue = picker.getFirstWheelValue();
                    com.avito.android.lib.design.picker.k<?> secondWheelValue = picker.getSecondWheelValue();
                    StringBuilder sb2 = new StringBuilder();
                    String str = firstWheelValue.f180047b;
                    sb2.append(str);
                    sb2.append('-');
                    String str2 = secondWheelValue.f180047b;
                    sb2.append(str2);
                    aVar = new k.a(str, str2, sb2.toString());
                } else {
                    if (iOrdinal2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar = new k.b(picker.getFirstWheelValue().f180047b + ':' + picker.getSecondWheelValue().f180047b, null);
                }
                timePickerDialog2.f174638F.invoke(new InterfaceC49249a.j(timePickerDialog2.f174637E, aVar));
                timePickerDialog2.dismiss();
                return;
            case 5:
                int i14 = com.avito.android.lib.design.modal.f.f179741G;
                ((Y41.a) obj).invoke();
                ((com.avito.android.lib.design.modal.f) obj2).f179747F.invoke();
                return;
            case 6:
                int i15 = com.avito.android.lib.design.modal.i.f179776H;
                ((Y41.a) obj).invoke();
                ((com.avito.android.lib.design.modal.i) obj2).f179783G.invoke();
                return;
            case 7:
                TabBarLayout.b bVar = ((TabBarLayout) obj).onTabClickListener;
                if (bVar != null) {
                    bVar.b(((com.avito.android.lib.design.tab_bar.a) ((ViewGroup) obj2)).getTabBarItem());
                    return;
                }
                return;
            case 8:
                int i16 = com.avito.android.loyalty.ui.criteria.items.card.f.f183491k;
                com.avito.android.loyalty.ui.criteria.items.card.a aVar4 = (com.avito.android.loyalty.ui.criteria.items.card.a) obj;
                boolean z12 = aVar4.f183477j;
                boolean z13 = !z12;
                aVar4.f183477j = z13;
                com.avito.android.loyalty.ui.criteria.items.card.f fVar = (com.avito.android.loyalty.ui.criteria.items.card.f) obj2;
                D6.G(fVar.f183496f, z13);
                float f12 = !z12 ? 0.0f : 180.0f;
                float f13 = z12 ? 0.0f : 180.0f;
                RotateAnimation rotateAnimation = new RotateAnimation(f12, f13, 1, 0.5f, 1, 0.5f);
                rotateAnimation.setDuration(120L);
                rotateAnimation.setInterpolator(new LinearInterpolator());
                View view2 = fVar.f183497g;
                view2.startAnimation(rotateAnimation);
                view2.setRotation(f13);
                fVar.f183492b.a(aVar4, aVar4.f183477j);
                return;
            case 9:
                int i17 = com.avito.android.loyalty.ui.quality_service.a.f183790J;
                DeepLink deepLinkB = ((dX.f) obj).getUri();
                com.avito.android.loyalty.ui.quality_service.a aVar5 = (com.avito.android.loyalty.ui.quality_service.a) obj2;
                if (deepLinkB != null) {
                    b.a.a(aVar5.f183791E, deepLinkB, null, null, 6);
                }
                aVar5.dismiss();
                return;
            case 10:
                ((m) obj).f183971c.invoke(new InterfaceC47025a.C12276a(((p.a) obj2).f184028b));
                return;
            case 11:
                int i18 = com.avito.android.loyalty.ui.quality_service.items.effect.g.f183822g;
                ((l) obj2).invoke((com.avito.android.loyalty.ui.quality_service.items.effect.a) obj);
                return;
            case 12:
                int i19 = com.avito.android.loyalty.ui.quality_service.items.grade_info.i.f183911p;
                ((l) obj2).invoke((com.avito.android.loyalty.ui.quality_service.items.grade_info.b) obj);
                return;
            case 13:
                int i22 = com.avito.android.loyalty.ui.quality_service.items.grade_info.i.f183911p;
                DeepLink deepLink2 = ((b.a) obj).f183899b;
                if (deepLink2 != null) {
                    ((w) obj2).i7(deepLink2);
                    return;
                }
                return;
            case 14:
                int i23 = com.avito.android.loyalty.ui.quality_service_gray.items.button.f.f184078c;
                ((w) obj).i7(((com.avito.android.loyalty.ui.quality_service_gray.items.button.a) obj2).f184071d);
                return;
            case 15:
                int i24 = o.f184709r;
                MandatoryVerificationUploaderItem.FileItem fileItem = (MandatoryVerificationUploaderItem.FileItem) obj2;
                ((N) obj).invoke(fileItem.f184682b, Boolean.valueOf(fileItem.f184685e));
                return;
            case 16:
                DeepLink deeplink = ((CloseMapButton) obj).getDeeplink();
                if (deeplink != null) {
                    ((C31642f) obj2).f185504e.invoke(new InterfaceC25585b.C25595k(deeplink));
                    return;
                }
                return;
            case 17:
                NoVisibleObjectsAction action = ((NoVisibleObjectsCurtain) obj).getAction();
                if (action == null || (uri = action.getUri()) == null) {
                    return;
                }
                InterfaceC25585b.C25588d c25588d = InterfaceC25585b.C25588d.f57133a;
                l<InterfaceC25585b, G0> lVar = ((C31642f) obj2).f185504e;
                lVar.invoke(c25588d);
                lVar.invoke(new InterfaceC25585b.C25595k(uri));
                return;
            case 18:
                ((com.avito.android.messenger.conversation.mvi.platform_actions.buttons.m) obj).f193848d.accept((ContextActionHandler.MethodCall) obj2);
                return;
            case 19:
                ((com.avito.android.messenger.conversation.mvi.platform_actions.buttons.m) obj).f193847c.accept((f.a) obj2);
                return;
            case 20:
                ((s) obj).f193865c.accept((f.a) obj2);
                return;
            case 21:
                ((com.avito.android.messenger.map.search.adapter.c) obj).f196527b.jc((com.avito.android.messenger.map.search.adapter.a) obj2);
                return;
            case 22:
                z zVar = (z) obj;
                zVar.Ja(false);
                zVar.u((AvitoMapCameraPosition) obj2, false);
                return;
            case 23:
                com.avito.android.messenger.map.viewing.view.f fVar2 = (com.avito.android.messenger.map.viewing.view.f) obj;
                AvitoMapMarker avitoMapMarker = fVar2.f196902w;
                if (avitoMapMarker != null) {
                    ((AvitoMap) obj2).moveTo(avitoMapMarker.getPosition(), true, null);
                }
                fVar2.f196897r.accept(G0.f406611a);
                return;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                MessengerIcebreakerBottomSheetFragment.a aVar6 = MessengerIcebreakerBottomSheetFragment.f197675q0;
                Editable editableM53getText = ((Input) obj).m53getText();
                if (editableM53getText == null || editableM53getText.length() == 0) {
                    return;
                }
                MessengerIcebreakerBottomSheetFragment messengerIcebreakerBottomSheetFragment = (MessengerIcebreakerBottomSheetFragment) obj2;
                InterfaceC28373a interfaceC28373a = messengerIcebreakerBottomSheetFragment.f197679i0;
                (interfaceC28373a != null ? interfaceC28373a : null).c(new y.a("messengerIcebreakerDialog.customMessage", 1L));
                String strD5 = messengerIcebreakerBottomSheetFragment.d5();
                MessengerIcebreakerDialogResult.OnSendMessage onSendMessage = new MessengerIcebreakerDialogResult.OnSendMessage(messengerIcebreakerBottomSheetFragment.c5(), String.valueOf(editableM53getText), messengerIcebreakerBottomSheetFragment.b5().f197521b);
                FragmentManager parentFragmentManager = messengerIcebreakerBottomSheetFragment.getParentFragmentManager();
                Bundle bundle = new Bundle();
                bundle.putParcelable("messenger_icebreakers_dialog.MessengerIcebreakerDialogResult", onSendMessage);
                parentFragmentManager.o0(bundle, strD5);
                Input input = messengerIcebreakerBottomSheetFragment.f197686p0;
                if (input != null) {
                    K2.d(input, true);
                }
                messengerIcebreakerBottomSheetFragment.requireDialog().dismiss();
                return;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((com.avito.android.mortgage.landing.o) obj).f200318s.g(false, true, true);
                ((Y41.a) obj2).invoke();
                return;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((N) obj).invoke(Boolean.valueOf(((com.avito.android.mortgage.person_form.list.items.checkbox.g) obj2).f200605b.isChecked()));
                return;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                int i25 = com.avito.android.mortgage.pre_approval.form.list.items.select.h.f201838e;
                view.requestFocus();
                ((N) obj).invoke(((com.avito.android.mortgage.pre_approval.form.list.items.select.h) obj2).f201841d);
                return;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                MortgageTermsDialog mortgageTermsDialog = (MortgageTermsDialog) obj;
                InterfaceC28373a interfaceC28373a2 = mortgageTermsDialog.f203828h0;
                if (interfaceC28373a2 == null) {
                    interfaceC28373a2 = null;
                }
                interfaceC28373a2.c(new C44974a(mortgageTermsDialog.f5().f203840b, mortgageTermsDialog.f5().f203841c));
                MortgageTerms mortgageTerms = mortgageTermsDialog.f5().f203842d;
                if (mortgageTerms != null && (actionButtonC = mortgageTerms.getAction()) != null && (deepLinkC = actionButtonC.getLink()) != null) {
                    com.avito.android.deeplink_handler.handler.composite.a aVar7 = mortgageTermsDialog.f203830j0;
                    if (aVar7 == null) {
                        aVar7 = null;
                    }
                    b.a.a(aVar7, deepLinkC, null, null, 6);
                }
                ((TZ.b) obj2).dismiss();
                return;
            default:
                int i26 = VerticalStepsBar.f203971y;
                l lVar2 = (l) obj2;
                if (lVar2 != null) {
                    lVar2.invoke(((VerticalStepsBar.c) obj).f204000d.f203996b);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ h(int i12, Object obj, Object obj2) {
        this.f174308b = i12;
        this.f174309c = obj;
        this.f174310d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ h(l lVar, com.avito.android.mortgage.person_form.list.items.checkbox.g gVar) {
        this.f174308b = 26;
        this.f174309c = (N) lVar;
        this.f174310d = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ h(l lVar, com.avito.android.mortgage.pre_approval.form.list.items.select.h hVar) {
        this.f174308b = 27;
        this.f174309c = (N) lVar;
        this.f174310d = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ h(Y41.p pVar, MandatoryVerificationUploaderItem.FileItem fileItem) {
        this.f174308b = 15;
        this.f174309c = (N) pVar;
        this.f174310d = fileItem;
    }
}
