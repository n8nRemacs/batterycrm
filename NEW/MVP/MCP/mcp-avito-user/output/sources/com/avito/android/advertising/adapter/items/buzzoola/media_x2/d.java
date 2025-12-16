package com.avito.android.advertising.adapter.items.buzzoola.media_x2;

import Nf.InterfaceC14568a;
import Se.InterfaceC15174a;
import Tb.f;
import Ui.InterfaceC15523b;
import Vb.InterfaceC15661a;
import android.content.Intent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.advertising.kebab.q;
import com.avito.android.advertising.kebab.r;
import com.avito.android.advertising.loaders.buzzoola.BuzzoolaBanner;
import com.avito.android.ai_assistant.screens.chat.mvi.entity.SendButtonMode;
import com.avito.android.anonymous_number_dialog.AnonymousNumberDialogArguments;
import com.avito.android.anonymous_number_dialog.AnonymousNumberDialogFragment;
import com.avito.android.authorization.duplicate_pd.DuplicatePdInfoFragment;
import com.avito.android.auto_loans_composite_broker.v2.z;
import com.avito.android.auto_reseller_contacts.buy_contact_bottom_sheet.BuyContactBottomSheet;
import com.avito.android.auto_select.confirmation_dialog.AutoSelectConfirmationBottomSheetFragment;
import com.avito.android.auto_select.confirmation_dialog.mvi.entity.AutoSelectConfirmationBottomSheetState;
import com.avito.android.autoteka.presentation.payment.AutotekaPaymentActivity;
import com.avito.android.autoteka.presentation.previewsearch.AutotekaPreviewSearchActivity;
import com.avito.android.autoteka.presentation.previewsearch.mvi.entity.AutotekaPreviewSearchAction;
import com.avito.android.beduin.common.action.BeduinContentPlaceholderAction;
import com.avito.android.beduin.common.component.button.BeduinButtonModel;
import com.avito.android.beduin.common.component.checkbox_list_item.BeduinCheckboxListItemModel;
import com.avito.android.beduin.common.component.input.InputIcon;
import com.avito.android.beduin.common.component.label.BeduinLabelLayout;
import com.avito.android.beduin.common.component.radio_group.Option;
import com.avito.android.beduin.common.container.card_item.BeduinCardItemContainerModel;
import com.avito.android.beduin.common.container.card_item.a;
import com.avito.android.beduin.common.utils.C28806b;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.blueprints.job_multigeo_address.o;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.toggle.Checkbox;
import com.avito.android.remote.autoteka.model.AutotekaLink;
import com.avito.android.remote.autoteka.model.StandaloneAutotekaBlock;
import com.avito.android.util.D6;
import com.avito.android.util.K2;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import ef.InterfaceC40098a;
import java.util.List;
import kotlin.G0;
import kotlin.jvm.internal.N;
import pi.e;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f87326b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f87327c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f87328d;

    public /* synthetic */ d(int i12, Object obj, Object obj2) {
        this.f87326b = i12;
        this.f87327c = obj;
        this.f87328d = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v30, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i12 = 2;
        Object obj = this.f87328d;
        Object obj2 = this.f87327c;
        switch (this.f87326b) {
            case 0:
                f fVar = (f) obj2;
                com.avito.android.advertising.ui.buzzoola.i iVar = fVar.f87340g;
                if (iVar != null) {
                    iVar.dismiss();
                }
                com.avito.android.advertising.ui.buzzoola.i iVar2 = new com.avito.android.advertising.ui.buzzoola.i(view.getContext());
                fVar.f87340g = iVar2;
                BuzzoolaBanner.BuzzoolaMediaX2 buzzoolaMediaX2 = (BuzzoolaBanner.BuzzoolaMediaX2) obj;
                iVar2.V(buzzoolaMediaX2.f88230c, buzzoolaMediaX2.f88231d, new com.avito.android.advert.item.properties.g(i12, fVar, iVar2));
                break;
            case 1:
                Y41.l<? super q, G0> lVar = ((r) obj2).f87861c;
                if (lVar != null) {
                    lVar.invoke((q) obj);
                    break;
                }
                break;
            case 2:
                int i13 = com.avito.android.advertising.ui.buzzoola.h.f88590I;
                com.avito.android.advertising.ui.buzzoola.h hVar = (com.avito.android.advertising.ui.buzzoola.h) obj2;
                com.avito.android.lib.design.bottom_sheet.d.M(hVar, (String) obj, true, true, 2);
                LinearLayout linearLayout = hVar.f88591E;
                if (linearLayout != null) {
                    D6.w(linearLayout);
                }
                TextView textView = hVar.f88592F;
                if (textView != null) {
                    D6.H(textView);
                    break;
                }
                break;
            case 3:
                int i14 = com.avito.android.ai_assistant.adapter.message_actions.f.f88821s;
                ((com.avito.android.ai_assistant.adapter.message_actions.f) obj2).f88822b.b(((f.a) obj).f15743a);
                break;
            case 4:
                SendButtonMode sendButtonMode = SendButtonMode.f89287b;
                Y41.l<InterfaceC15661a, G0> lVar2 = ((com.avito.android.ai_assistant.screens.chat.q) obj).f89483d;
                if (((SendButtonMode) obj2) != sendButtonMode) {
                    lVar2.invoke(InterfaceC15661a.e.f17217a);
                    break;
                } else {
                    lVar2.invoke(InterfaceC15661a.n.f17229a);
                    break;
                }
            case 5:
                AnonymousNumberDialogFragment.a aVar = AnonymousNumberDialogFragment.f91267f0;
                AnonymousNumberDialogFragment anonymousNumberDialogFragment = (AnonymousNumberDialogFragment) obj2;
                anonymousNumberDialogFragment.dismiss();
                anonymousNumberDialogFragment.b5(((AnonymousNumberDialogArguments) obj).f91266f);
                break;
            case 6:
                DuplicatePdInfoFragment.a aVar2 = DuplicatePdInfoFragment.f93822n0;
                DuplicatePdInfoFragment duplicatePdInfoFragment = (DuplicatePdInfoFragment) obj2;
                duplicatePdInfoFragment.requireActivity().setResult(-1, new Intent().putExtra("key_phone_hint", (String) obj));
                duplicatePdInfoFragment.requireActivity().finish();
                break;
            case 7:
                ((z) obj2).f95660f.f();
                ((Y41.a) obj).invoke();
                break;
            case 8:
                BuyContactBottomSheet.a aVar3 = BuyContactBottomSheet.f95685r0;
                ((com.avito.android.auto_reseller_contacts.buy_contact_bottom_sheet.e) ((BuyContactBottomSheet) obj2).f95689j0.getValue()).accept(new InterfaceC15174a.C1027a((DeepLink) obj));
                break;
            case 9:
                AutoSelectConfirmationBottomSheetFragment.a aVar4 = AutoSelectConfirmationBottomSheetFragment.f95853n0;
                ((Y41.l) obj2).invoke(new InterfaceC40098a.C11099a(((AutoSelectConfirmationBottomSheetState.Button) obj).f95909c));
                break;
            case 10:
                int i15 = com.avito.android.autoteka.items.choosingProduct.h.f96716i;
                ((Y41.l) obj2).invoke(((StandaloneAutotekaBlock) obj).getStandaloneLink().getUrl());
                break;
            case 11:
                AutotekaPaymentActivity.a aVar5 = AutotekaPaymentActivity.f97386y;
                ((Y41.a) obj2).invoke();
                AutotekaPaymentActivity autotekaPaymentActivity = (AutotekaPaymentActivity) obj;
                K2.c(autotekaPaymentActivity);
                RecyclerView recyclerView = autotekaPaymentActivity.f97394t;
                if (recyclerView != null) {
                    recyclerView.clearFocus();
                    break;
                }
                break;
            case 12:
                AutotekaPaymentActivity.a aVar6 = AutotekaPaymentActivity.f97386y;
                ((AutotekaPaymentActivity) obj2).b2().accept(InterfaceC14568a.f.f11689a);
                ((com.avito.android.lib.design.tooltip.k) obj).dismiss();
                break;
            case 13:
                com.avito.android.autoteka.items.payment.h hVar2 = AutotekaPreviewSearchActivity.f97529x;
                ((AutotekaPreviewSearchActivity) obj2).a2().accept(new AutotekaPreviewSearchAction.NavigateToExample(((AutotekaLink) obj).getUrl()));
                break;
            case 14:
                com.avito.android.autoteka.items.payment.h hVar3 = AutotekaPreviewSearchActivity.f97529x;
                K2.d((TextView) obj2, true);
                ((AutotekaPreviewSearchActivity) obj).onBackPressed();
                break;
            case 15:
                ((Y41.l) obj2).invoke(((com.avito.android.avl_entry.impl.ui.internal_item.show_all.i) obj).f98579b.getContext());
                break;
            case 16:
                ((Y41.l) obj2).invoke(((com.avito.android.avl_entry.impl.ui.internal_item.video.j) obj).f98607b.getContext());
                break;
            case 17:
                ((Y41.l) obj2).invoke(Boolean.valueOf(((com.avito.android.beduin.common.actionhandler.option_selector.konveyor.f) obj).f100334b.isChecked()));
                break;
            case 18:
                com.avito.android.beduin_shared.model.utils.a.a(((com.avito.android.beduin.common.component.button.a) obj2).f100782e, ((BeduinButtonModel) obj).getActions());
                break;
            case 19:
                Checkbox checkbox = ((com.avito.android.beduin.common.component.cart_item.g) obj2).f100905b;
                checkbox.performClick();
                ((Y41.l) obj).invoke(checkbox.getState());
                break;
            case 20:
                com.avito.android.beduin_shared.model.utils.a.a(((com.avito.android.beduin.common.component.checkbox_list_item.a) obj2).f100976f, ((BeduinCheckboxListItemModel) obj).getOnCheckboxTapActions());
                break;
            case 21:
                ((Y41.l) obj2).invoke(((com.avito.android.beduin.common.component.inline_filter.item.k) obj).f101522b);
                break;
            case 22:
                com.avito.android.beduin_shared.model.utils.a.a((InterfaceC15523b) obj2, ((InputIcon) obj).getOnClickedActions());
                break;
            case 23:
                int i16 = BeduinLabelLayout.f101649e;
                view.setVisibility(8);
                ((BeduinLabelLayout) obj2).f101650b.setMaxLines(Integer.MAX_VALUE);
                ((Y41.a) obj).invoke();
                break;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                int i17 = com.avito.android.beduin.common.component.radio_group.j.f102217n;
                List<BeduinAction> actions = ((Option) obj2).getTitleIconButton().getActions();
                if (actions != null) {
                    C28806b.a(((com.avito.android.beduin.common.component.radio_group.j) obj).f102220h, actions);
                    break;
                }
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                a.C3088a c3088a = com.avito.android.beduin.common.container.card_item.a.f102946h;
                BeduinCardItemContainerModel beduinCardItemContainerModel = (BeduinCardItemContainerModel) obj2;
                List<BeduinAction> listG = beduinCardItemContainerModel.g();
                InterfaceC15523b<BeduinAction> interfaceC15523b = ((com.avito.android.beduin.common.container.card_item.a) obj).f102950f;
                if (listG != null) {
                    C28806b.a(interfaceC15523b, listG);
                }
                if (!beduinCardItemContainerModel.f102942b) {
                    List<BeduinAction> listF = beduinCardItemContainerModel.f();
                    if (listF != null) {
                        C28806b.a(interfaceC15523b, listF);
                        break;
                    }
                } else {
                    List<BeduinAction> listE = beduinCardItemContainerModel.e();
                    if (listE != null) {
                        C28806b.a(interfaceC15523b, listE);
                        break;
                    }
                }
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                com.avito.android.beduin_shared.model.utils.a.a((InterfaceC15523b) obj2, (List) obj);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                com.avito.android.beduin_shared.model.utils.a.a((com.avito.android.beduin.context.c) obj2, ((BeduinContentPlaceholderAction.Show.Button) obj).c());
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                List<BeduinAction> listA = ((e.a) obj2).a();
                if (listA != null) {
                    ((N) obj).invoke(listA);
                    break;
                }
                break;
            default:
                int i18 = o.f106023n;
                ((Y41.l) obj2).invoke((ParameterElement.q.a) obj);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ d(e.a aVar, Y41.l lVar) {
        this.f87326b = 28;
        this.f87327c = aVar;
        this.f87328d = (N) lVar;
    }
}
