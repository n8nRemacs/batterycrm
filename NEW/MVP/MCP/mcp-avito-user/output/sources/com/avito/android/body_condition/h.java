package com.avito.android.body_condition;

import Y41.p;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import androidx.core.os.C22777e;
import androidx.fragment.app.C22960s;
import com.avito.android.R;
import com.avito.android.bxcontent.C29240o1;
import com.avito.android.bxcontent.mvi.entity.C;
import com.avito.android.bxcontent.mvi.entity.InterfaceC29127b;
import com.avito.android.cart_snippet_actions.CartActionsViewImpl;
import com.avito.android.category.element.CategoryWidgetElementItem;
import com.avito.android.category.element.n;
import com.avito.android.category.widget.CategoryWidgetItem;
import com.avito.android.code_check.CodeCheckAbstractFragment;
import com.avito.android.code_check.phone_list.PhoneListFragment;
import com.avito.android.code_check_public.screen.PhoneList;
import com.avito.android.comfortable_deal.api.model.ActionTransition;
import com.avito.android.comfortable_deal.deal.item.digitalregistration.big.m;
import com.avito.android.comfortable_deal.submitting.select.SubmittingSelectFragment;
import com.avito.android.component.advert_badge_bar.badge.BadgeItem;
import com.avito.android.component.advert_contact_bar.ContactBar;
import com.avito.android.component.toast.c;
import com.avito.android.confirm_documents_bottom_sheet.models.DocumentButtonItem;
import com.avito.android.crm_candidates.view.dialogs.JobCrmChangeStatusDialog;
import com.avito.android.crm_candidates.view.list_items.list_filter.JobCrmListFilterItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29679e;
import com.avito.android.deep_linking.links.PointWithPosition;
import com.avito.android.lib.design.input.Input;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.util.K2;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import gm.C40705b;
import im.InterfaceC41424a;
import java.time.LocalDate;
import java.util.Iterator;
import kn.InterfaceC42716a;
import kotlin.G0;
import kotlin.Q;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import mn.InterfaceC44101a;
import pq.InterfaceC47127a;
import rn0.InterfaceC47691c;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f106812b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f106813c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f106814d;

    public /* synthetic */ h(int i12, Object obj, Object obj2) {
        this.f106812b = i12;
        this.f106813c = obj;
        this.f106814d = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [Y41.a, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r2v9, types: [Y41.a, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r3v25, types: [Y41.l, kotlin.jvm.internal.H] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        String string;
        str = "";
        Object obj = null;
        Object obj2 = this.f106814d;
        Object obj3 = this.f106813c;
        switch (this.f106812b) {
            case 0:
                p<? super View, ? super PointWithPosition, G0> pVar = ((i) obj3).f106822i;
                if (pVar != null) {
                    pVar.invoke(view, (PointWithPosition) obj2);
                    return;
                }
                return;
            case 1:
                Y41.l<? super InterfaceC29679e, G0> lVar = ((i) obj3).f106823j;
                if (lVar != null) {
                    lVar.invoke((InterfaceC29679e) obj2);
                    return;
                }
                return;
            case 2:
                ((Y41.l) obj3).invoke(Boolean.valueOf(((com.avito.android.bottom_sheet_group.items.checkable_item.h) obj2).f107355b.isChecked()));
                return;
            case 3:
                ((com.avito.android.lib.design.tooltip.k) obj3).dismiss();
                ((Y41.a) obj2).invoke();
                return;
            case 4:
                ((C29240o1) obj3).f112693U.K5(new InterfaceC29127b.P(((C) obj2).f112033b));
                return;
            case 5:
                int i12 = com.avito.android.calendar_select.presentation.view.konveyor.items.day.f.f113521f;
                ((Y41.l) obj3).invoke((LocalDate) obj2);
                return;
            case 6:
                ((com.avito.android.campaigns_sale.konveyor.editBlock.k) obj3).f113989b.invoke(new InterfaceC41424a.g(((C40705b) obj2).f396773b));
                return;
            case 7:
                int i13 = com.avito.android.campaigns_sale.konveyor.editBlock.p.f114000u;
                ((com.avito.android.campaigns_sale.konveyor.editBlock.p) obj3).C80(null);
                K2.f((Input) obj2, 3);
                return;
            case 8:
                ((com.avito.android.lib.design.tooltip.k) obj3).dismiss();
                ((N) obj2).invoke();
                return;
            case 9:
                ((com.avito.android.candy.a) obj3).f114860f.toggle();
                ((N) obj2).invoke();
                return;
            case 10:
                InterfaceC42716a.C11626a c11626a = (InterfaceC42716a.C11626a) ((InterfaceC42716a) obj2);
                ((com.avito.android.cart_similar_items.konveyor.snippet.g) obj3).f115892c.invoke(new InterfaceC44101a.C11839a(c11626a.f406585a, c11626a.f406586b));
                return;
            case 11:
                int i14 = CartActionsViewImpl.f116146e;
                ((CartActionsViewImpl) obj3).getClass();
                if (Build.VERSION.SDK_INT >= 30) {
                    view.performHapticFeedback(16);
                }
                ((View.OnClickListener) obj2).onClick(view);
                return;
            case 12:
                int i15 = n.f116618h;
                ((Y41.l) obj3).invoke(((CategoryWidgetElementItem) obj2).f116597d);
                return;
            case 13:
                DeepLink deepLinkM5 = ((CategoryWidgetItem) obj3).M5();
                if (deepLinkM5 != null) {
                    InterfaceC47691c.a.b(((com.avito.android.category.widget.f) obj2).f116748b.get(), deepLinkM5, 6);
                    return;
                }
                return;
            case 14:
                com.avito.android.code_check.p.a((CodeCheckAbstractFragment) obj3, ((com.avito.android.code_check_public.screen.a) obj2).f119329b);
                return;
            case 15:
                PhoneListFragment.a aVar = PhoneListFragment.f118860F0;
                com.avito.android.code_check.p.a((PhoneListFragment) obj3, ((PhoneList.a) obj2).f119313b);
                return;
            case 16:
                ((com.avito.android.comfortable_deal.client_room.dialogs.k) obj3).f119854E.invoke(((Context) obj2).getString(R.string.client_room_how_to_select_agent_conditions_link));
                return;
            case 17:
                Y41.l<? super ActionTransition, G0> lVar2 = ((com.avito.android.comfortable_deal.deal.item.actions.i) obj3).f121154e;
                if (lVar2 != null) {
                    lVar2.invoke(((com.avito.android.comfortable_deal.deal.item.actions.a) obj2).f121142c);
                    return;
                }
                return;
            case 18:
                ((Y41.l) obj3).invoke(String.valueOf(((m) obj2).f121390c.m53getText()));
                return;
            case 19:
                View view2 = (View) obj3;
                K2.d(view2, true);
                View viewFindViewById = view2.findViewById(R.id.phone_input);
                if (viewFindViewById == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
                }
                Editable editableM53getText = ((Input) viewFindViewById).m53getText();
                String string2 = editableM53getText != null ? editableM53getText.toString() : null;
                ((com.avito.android.comfortable_deal.deal.item.digitalregistration.small.dialog.a) obj2).f121411E.invoke(string2 != null ? string2 : "");
                return;
            case 20:
                SubmittingSelectFragment.a aVar2 = SubmittingSelectFragment.f123264w0;
                ((SubmittingSelectFragment) obj3).q5().accept(InterfaceC47127a.c.f428785a);
                ((com.avito.android.lib.design.bottom_sheet.d) obj2).dismiss();
                return;
            case 21:
                int i16 = com.avito.android.comparison.items.header_item.l.f123984l;
                ((Y41.a) obj3).invoke();
                ((com.avito.android.comparison.items.header_item.l) obj2).f123992i.setChecked(false);
                return;
            case 22:
                Y41.l<BadgeItem, G0> lVar3 = ((com.avito.android.component.advert_badge_bar.badge.d) obj3).f124962b;
                if (lVar3 != null) {
                    lVar3.invoke((BadgeItem) obj2);
                    return;
                }
                return;
            case 23:
                Y41.l<BadgeItem, G0> lVar4 = ((com.avito.android.component.advert_badge_bar.badge_item.b) obj3).f124985b;
                if (lVar4 != null) {
                    lVar4.invoke((BadgeItem) obj2);
                    return;
                }
                return;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                ((H) obj3).invoke((ContactBar.Button.Target) obj2);
                return;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Y41.a aVar3 = (Y41.a) obj3;
                if (aVar3 != null) {
                    aVar3.invoke();
                }
                ((com.avito.android.component.snackbar.d) obj2).a();
                return;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                c.a.C3719a c3719a = (c.a.C3719a) obj3;
                if (c3719a.f125246b) {
                    ((com.avito.android.lib.design.toast_bar.k) obj2).f();
                }
                c3719a.f125248d.invoke();
                return;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                int i17 = com.avito.android.confirm_documents_bottom_sheet.list.f.f125575f;
                ((Y41.l) obj3).invoke((DocumentButtonItem) obj2);
                return;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                int i18 = com.avito.android.cpt.activation.ui.items.alert.j.f126335i;
                DeepLink deeplink = ((ButtonAction) obj3).getDeeplink();
                if (deeplink != null) {
                    ((Y41.l) obj2).invoke(deeplink);
                    return;
                }
                return;
            default:
                JobCrmChangeStatusDialog jobCrmChangeStatusDialog = (JobCrmChangeStatusDialog) obj3;
                Iterator<T> it = jobCrmChangeStatusDialog.f129958j0.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (((JobCrmListFilterItem) next).f130139e) {
                            obj = next;
                        }
                    }
                }
                JobCrmListFilterItem jobCrmListFilterItem = (JobCrmListFilterItem) obj;
                if (jobCrmListFilterItem != null) {
                    Bundle arguments = jobCrmChangeStatusDialog.getArguments();
                    if (arguments != null && (string = arguments.getString("HANDLE_ID")) != null) {
                        str = string;
                    }
                    C22960s.a(C22777e.b(new Q("CHANGE_STATUS_RESULT", new Q(jobCrmListFilterItem.f130144j, jobCrmListFilterItem.f130136b))), jobCrmChangeStatusDialog, str);
                }
                ((com.avito.android.lib.design.bottom_sheet.d) obj2).dismiss();
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ h(Y41.a aVar, com.avito.android.lib.design.tooltip.k kVar) {
        this.f106812b = 8;
        this.f106813c = kVar;
        this.f106814d = (N) aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ h(Y41.l lVar, ContactBar.Button.Target target) {
        this.f106812b = 24;
        this.f106813c = (H) lVar;
        this.f106814d = target;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ h(com.avito.android.candy.a aVar, Y41.a aVar2) {
        this.f106812b = 9;
        this.f106813c = aVar;
        this.f106814d = (N) aVar2;
    }
}
