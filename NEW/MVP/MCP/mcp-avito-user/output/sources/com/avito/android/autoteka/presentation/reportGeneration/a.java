package com.avito.android.autoteka.presentation.reportGeneration;

import Og.InterfaceC14684a;
import Rl.InterfaceC15055a;
import Y41.l;
import android.view.View;
import androidx.view.result.h;
import com.avito.android.autoteka.presentation.waitingForPayment.AutotekaWaitingForPaymentActivity;
import com.avito.android.barcode.presentation.BarcodeDetailsActivity;
import com.avito.android.beduin.common.component.checkbox_list_item.i;
import com.avito.android.beduin.common.component.select_calendar.BeduinSelectCalendarModel;
import com.avito.android.beduin.common.component.select_calendar.CalendarSettings;
import com.avito.android.beduin.common.component.select_calendar.e;
import com.avito.android.beduin.common.component.selector_card_group.k;
import com.avito.android.beduin.common.component.selector_card_group.n;
import com.avito.android.beduin.common.component.snippet_list_item.BeduinSnippetListItemModel;
import com.avito.android.beduin.common.component.switcher.Link;
import com.avito.android.beduin.common.container.checkbox_group.g;
import com.avito.android.beduin.ui.screen.fragment.tabs.TabsScreenFragment;
import com.avito.android.beduin.ui.universal.UniversalBeduinFragment;
import com.avito.android.beduin.ui.universal.m;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.brandspace.brandspace.BrandspaceFragmentMvi;
import com.avito.android.brandspace.view.BrandspaceFragment;
import com.avito.android.calendar_select.CalendarSelectionType;
import com.avito.android.calendar_select.presentation.mvicalendarselect.CalendarSelectFragment;
import com.avito.android.calltracking.C29277e;
import com.avito.android.car_navigator.presentation.CarNavigatorFragment;
import com.avito.android.change_specific.ExtendedProfileChangeSpecificFragment;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42784z0;
import lo.InterfaceC43808a;
import mn.InterfaceC44101a;
import mp.InterfaceC44113a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f97779b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f97780c;

    public /* synthetic */ a(Object obj, int i12) {
        this.f97779b = i12;
        this.f97780c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        List<String> listC;
        CalendarSelectionType calendarSelectionType;
        Boolean boolG;
        int i12;
        CalendarSettings.CalendarButton calendarButtonD;
        l<? super String, G0> lVar;
        List<BeduinAction> actions;
        g.a aVar;
        String title = null;
        Object obj = this.f97780c;
        switch (this.f97779b) {
            case 0:
                int i13 = AutotekaReportGenerationActivity.f97756t;
                ((AutotekaReportGenerationActivity) obj).finish();
                return;
            case 1:
                int i14 = AutotekaWaitingForPaymentActivity.f97837u;
                ((AutotekaWaitingForPaymentActivity) obj).finish();
                return;
            case 2:
                BarcodeDetailsActivity.a aVar2 = BarcodeDetailsActivity.f98681z;
                ((com.avito.android.barcode.presentation.d) ((BarcodeDetailsActivity) obj).f98683n.getValue()).accept(InterfaceC14684a.b.f12479a);
                return;
            case 3:
                ((com.avito.android.beduin.common.actionhandler.option_selector.d) obj).dismiss();
                return;
            case 4:
                Y41.a<G0> listener = ((com.avito.android.beduin.common.component.button_buy_delivery.a) obj).f100810e.getListener();
                if (listener != null) {
                    listener.invoke();
                    return;
                }
                return;
            case 5:
                Y41.a<G0> listener2 = ((com.avito.android.beduin.common.component.button_with_loader.d) obj).f100838e.getListener();
                if (listener2 != null) {
                    listener2.invoke();
                    return;
                }
                return;
            case 6:
                ((i) obj).f100991b.performClick();
                return;
            case 7:
                com.avito.android.beduin.common.component.select_address.a aVar3 = (com.avito.android.beduin.common.component.select_address.a) obj;
                com.avito.android.beduin_shared.model.utils.a.a(aVar3.f102426f, aVar3.f102425e.getActions());
                return;
            case 8:
                com.avito.android.beduin.common.component.select_calendar.a aVar4 = (com.avito.android.beduin.common.component.select_calendar.a) obj;
                BeduinSelectCalendarModel beduinSelectCalendarModel = aVar4.f102437e;
                CalendarSettings settings = beduinSelectCalendarModel.getSettings();
                String strE = settings != null ? settings.getFromDate() : null;
                CalendarSettings settings2 = beduinSelectCalendarModel.getSettings();
                String strF = settings2 != null ? settings2.getToDate() : null;
                List<String> selectedDates = beduinSelectCalendarModel.getSelectedDates();
                if (selectedDates == null) {
                    selectedDates = C42784z0.f406748b;
                }
                CalendarSettings settings3 = beduinSelectCalendarModel.getSettings();
                String title2 = settings3 != null ? settings3.getTitle() : null;
                CalendarSettings settings4 = beduinSelectCalendarModel.getSettings();
                if (settings4 == null || (listC = settings4.c()) == null) {
                    listC = C42784z0.f406748b;
                }
                CalendarSettings settings5 = beduinSelectCalendarModel.getSettings();
                if (settings5 != null && (calendarButtonD = settings5.getButton()) != null) {
                    title = calendarButtonD.getTitle();
                }
                String str = title;
                String settingsPath = beduinSelectCalendarModel.getSettingsPath();
                BeduinSelectCalendarModel.BeduinCalendarSelectionType selectionType = beduinSelectCalendarModel.getSelectionType();
                if (selectionType == null || (i12 = BeduinSelectCalendarModel.BeduinCalendarSelectionType.a.f102435a[selectionType.ordinal()]) == 1) {
                    calendarSelectionType = CalendarSelectionType.f113306b;
                } else if (i12 == 2) {
                    calendarSelectionType = CalendarSelectionType.f113307c;
                } else if (i12 == 3) {
                    calendarSelectionType = CalendarSelectionType.f113308d;
                } else {
                    if (i12 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    calendarSelectionType = CalendarSelectionType.f113309e;
                }
                CalendarSettings settings6 = beduinSelectCalendarModel.getSettings();
                e.a aVar5 = new e.a(strE, strF, selectedDates, title2, listC, str, settingsPath, calendarSelectionType, (settings6 == null || (boolG = settings6.getIsPastDayAllowed()) == null) ? false : boolG.booleanValue());
                h<e.a> hVar = aVar4.f102440h;
                if (hVar != null) {
                    hVar.b(aVar5);
                    return;
                }
                return;
            case 9:
                int i15 = n.f102556e;
                if (!(view instanceof k) || (lVar = ((n) obj).onSelectChangeListener) == null) {
                    return;
                }
                lVar.invoke(((k) view).getTag().toString());
                return;
            case 10:
                Y41.a<G0> listener3 = ((com.avito.android.beduin.common.component.service_order_button.a) obj).f102632e.getListener();
                if (listener3 != null) {
                    listener3.invoke();
                    return;
                }
                return;
            case 11:
                com.avito.android.beduin.common.component.snippet_list_item.c cVar = (com.avito.android.beduin.common.component.snippet_list_item.c) obj;
                BeduinSnippetListItemModel beduinSnippetListItemModel = cVar.f102657f;
                if (beduinSnippetListItemModel.getF100853b() != null) {
                    cVar.f102658g.a(beduinSnippetListItemModel.getF100853b(), beduinSnippetListItemModel.getContext(), beduinSnippetListItemModel.isFavorite());
                    return;
                }
                return;
            case 12:
                com.avito.android.beduin.common.component.switcher.a aVar6 = (com.avito.android.beduin.common.component.switcher.a) obj;
                Link link = aVar6.f102738g.getLink();
                if (link == null || (actions = link.getActions()) == null) {
                    return;
                }
                Iterator<T> it = actions.iterator();
                while (it.hasNext()) {
                    aVar6.f102736e.o((BeduinAction) it.next());
                }
                return;
            case 13:
                int i16 = g.f102979e;
                g gVar = (g) obj;
                String optionId = gVar.getOptionId();
                if (optionId == null || (aVar = gVar.f102982d) == null) {
                    return;
                }
                aVar.a(optionId, true ^ gVar.f102980b.isChecked());
                return;
            case 14:
                TabsScreenFragment.a aVar7 = TabsScreenFragment.f104306N0;
                ((TabsScreenFragment) obj).z5();
                return;
            case 15:
                UniversalBeduinFragment.a aVar8 = UniversalBeduinFragment.f104416B0;
                ((UniversalBeduinFragment) obj).requireActivity().onBackPressed();
                return;
            case 16:
                m mVar = (m) obj;
                String str2 = mVar.f104499P;
                if (str2 != null) {
                    mVar.ke(null, str2);
                    return;
                }
                return;
            case 17:
                ((com.avito.android.blueprint.checkbox.k) obj).f105402o.toggle();
                return;
            case 18:
                ((com.avito.android.blueprints.publish.select.inline.k) obj).f106489d.toggle();
                return;
            case 19:
                com.avito.android.blueprints.selector_card_group_bottom_sheet.d dVar = (com.avito.android.blueprints.selector_card_group_bottom_sheet.d) obj;
                dVar.f106682F.invoke(dVar.f106685I);
                dVar.dismiss();
                return;
            case 20:
                BrandspaceFragmentMvi.a aVar9 = BrandspaceFragmentMvi.f107581G0;
                ((BrandspaceFragmentMvi) obj).r5();
                return;
            case 21:
                BrandspaceFragment.a aVar10 = BrandspaceFragment.f107771D0;
                ((BrandspaceFragment) obj).r5();
                return;
            case 22:
                CalendarSelectFragment.a aVar11 = CalendarSelectFragment.f113383x0;
                ((CalendarSelectFragment) obj).t5().accept(InterfaceC15055a.e.f14589a);
                return;
            case 23:
                ((C29277e) obj).f113714g.accept(G0.f406611a);
                return;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                CarNavigatorFragment.a aVar12 = CarNavigatorFragment.f115212D0;
                ((CarNavigatorFragment) obj).r5();
                return;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((com.avito.android.cart_similar_items.konveyor.pagination.d) obj).f115857b.invoke(InterfaceC44101a.g.f414683a);
                return;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ExtendedProfileChangeSpecificFragment.a aVar13 = ExtendedProfileChangeSpecificFragment.f117869y0;
                ((ExtendedProfileChangeSpecificFragment) obj).r5().accept(InterfaceC43808a.b.f414199a);
                return;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((com.avito.android.comfortable_deal.comment.d) obj).f120511a.invoke(InterfaceC44113a.c.f414750a);
                return;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((com.avito.android.comfortable_deal.date_time_pickers.date.d) obj).f120915a.invoke();
                return;
            default:
                ((com.avito.android.comfortable_deal.date_time_pickers.time.d) obj).f120931a.invoke();
                return;
        }
    }
}
