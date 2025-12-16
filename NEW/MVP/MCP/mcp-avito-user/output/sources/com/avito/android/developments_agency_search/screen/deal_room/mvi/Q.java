package com.avito.android.developments_agency_search.screen.deal_room.mvi;

import Cw.C13364c;
import Cw.d;
import android.content.Context;
import com.avito.android.R;
import com.avito.android.developments_agency_search.domain.GetDealRoomInfoResponse;
import com.avito.android.developments_agency_search.domain.Metro;
import com.avito.android.developments_agency_search.domain.PriceTooltip;
import com.avito.android.developments_agency_search.screen.deal_room.adapter.document.a;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.realty_agency.blueprint.text_block.TextBlockItem;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalColorKt;
import com.avito.android.util.O2;
import com.avito.android.util.P2;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: DealRoomViewStateAssembler.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/Q;", "", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.developments_agency_search.screen.deal_room.e f137605a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.developments_agency_search.screen.deal_room.i f137606b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Context f137607c;

    /* compiled from: DealRoomViewStateAssembler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f137608a;

        static {
            int[] iArr = new int[GetDealRoomInfoResponse.Deal.Progress.State.values().length];
            try {
                iArr[GetDealRoomInfoResponse.Deal.Progress.State.REVENUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GetDealRoomInfoResponse.Deal.Progress.State.COMPLETED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GetDealRoomInfoResponse.Deal.Progress.State.DECLINED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f137608a = iArr;
        }
    }

    @Inject
    public Q(@Y61.k com.avito.android.developments_agency_search.screen.deal_room.e eVar, @Y61.k com.avito.android.developments_agency_search.screen.deal_room.i iVar, @Y61.k Context context) {
        this.f137605a = eVar;
        this.f137606b = iVar;
        this.f137607c = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Y61.k
    public final C13364c a(@Y61.k Y41.a<C13364c> aVar) {
        C13364c c13364c;
        ArrayList arrayList;
        GetDealRoomInfoResponse.Deal.Progress progress;
        GetDealRoomInfoResponse.Deal.Progress.State currentState;
        int i12;
        PrintableText printableTextC;
        int i13;
        boolean z12;
        GetDealRoomInfoResponse.Deal.Progress progress2;
        GetDealRoomInfoResponse.Deal.Progress.State currentState2;
        C13364c c13364cInvoke = aVar.invoke();
        P2<GetDealRoomInfoResponse> p22 = c13364cInvoke.f2779b;
        if (p22 instanceof P2.c) {
            return C13364c.a(c13364cInvoke, null, null, null, null, d.b.f2789a, 31);
        }
        if (p22 instanceof P2.a) {
            return C13364c.a(c13364cInvoke, null, null, null, null, d.c.f2790a, 31);
        }
        if (!(p22 instanceof P2.b)) {
            throw new NoWhenBranchMatchedException();
        }
        GetDealRoomInfoResponse getDealRoomInfoResponse = (GetDealRoomInfoResponse) ((P2.b) p22).f318720a;
        GetDealRoomInfoResponse.Deal deal = (GetDealRoomInfoResponse.Deal) C42745f0.G(getDealRoomInfoResponse.getDeals());
        GetDealRoomInfoResponse.Deal.Progress progress3 = deal != null ? deal.getProgress() : null;
        ArrayList arrayList2 = new ArrayList();
        if (deal == null || progress3 == null) {
            c13364c = c13364cInvoke;
            arrayList = arrayList2;
        } else {
            List<GetDealRoomInfoResponse.Deal.Progress.Step> steps = progress3.getSteps();
            com.avito.android.developments_agency_search.screen.deal_room.e eVar = this.f137605a;
            arrayList2.add(new com.avito.android.developments_agency_search.screen.deal_room.adapter.deal_progress.c(eVar.c(steps), progress3.getCurrentStep(), Float.valueOf((float) progress3.getCurrentStepValue()), UniversalColorKt.universalColorOf$default(progress3.getColor(), 0, 2, null)));
            GetDealRoomInfoResponse.Deal.Progress progress4 = deal.getProgress();
            com.avito.android.developments_agency_search.screen.deal_room.i iVar = this.f137606b;
            if (progress4 != null) {
                int i14 = a.f137608a[deal.getProgress().getCurrentState().ordinal()];
                if (i14 == 1) {
                    PrintableText printableTextC2 = com.avito.android.printable_text.b.c(R.string.das_deal_room_revenue_stage_payment_approved_banner_title, new Serializable[0]);
                    GetDealRoomInfoResponse.Deal.Revenue revenue = deal.getRevenue();
                    arrayList2.add(new com.avito.android.developments_agency_search.screen.deal_room.adapter.award_banner.a(printableTextC2, com.avito.android.printable_text.b.c(R.string.das_deal_room_revenue_stage_payment_approved_banner_award_amount_description, new Serializable[0]), iVar.c(revenue != null ? revenue.getRevenueAmount() : null)));
                } else if (i14 == 2) {
                    PrintableText printableTextC3 = com.avito.android.printable_text.b.c(R.string.das_deal_room_revenue_stage_payment_sent_banner_title, new Serializable[0]);
                    GetDealRoomInfoResponse.Deal.Revenue revenue2 = deal.getRevenue();
                    arrayList2.add(new com.avito.android.developments_agency_search.screen.deal_room.adapter.award_banner.a(printableTextC3, com.avito.android.printable_text.b.c(R.string.das_deal_room_revenue_stage_payment_sent_banner_award_amount_description, new Serializable[0]), iVar.c(revenue2 != null ? revenue2.getRevenueAmount() : null)));
                } else if (i14 == 3) {
                    arrayList2.addAll(C42756l.B(new com.avito.conveyor_item.a[]{new TextBlockItem("revenue-section-declined-title-item", com.avito.android.printable_text.b.c(R.string.das_deal_room_revenue_stage_declined_deal_title, new Serializable[0]), 0, 0, null, 0, 0, 124, null), new TextBlockItem("revenue-section-declined-subtitle-item", com.avito.android.printable_text.b.c(R.string.das_deal_room_revenue_stage_declined_deal_subtitle, new Serializable[0]), R.attr.textM20, 0, null, 0, 0, 120, null), new com.avito.android.developments_agency_search.adapter.spacer.a(20)}));
                }
            }
            GetDealRoomInfoResponse.Deal.RecalculatedConfirmedLot recalculatedConfirmedLot = deal.getRecalculatedConfirmedLot();
            GetDealRoomInfoResponse.Deal.Progress progress5 = deal.getProgress();
            Context context = this.f137607c;
            if (recalculatedConfirmedLot != null && !C42756l.l0(new GetDealRoomInfoResponse.Deal.Progress.State[]{GetDealRoomInfoResponse.Deal.Progress.State.REVENUE, GetDealRoomInfoResponse.Deal.Progress.State.COMPLETED, GetDealRoomInfoResponse.Deal.Progress.State.DECLINED}).contains(progress5.getCurrentState())) {
                arrayList2.addAll(C42745f0.U(new TextBlockItem("revenue_recalculation-title_item", com.avito.android.printable_text.b.f(recalculatedConfirmedLot.getTitle()), R.attr.textH25, 0, null, 0, 0, 24, null), new TextBlockItem("revenue_recalculation-subtitle_item", com.avito.android.printable_text.b.f(recalculatedConfirmedLot.getSubtitle()), R.attr.textM20, 0, null, 12, 20, 24, null), new com.avito.android.developments_agency_search.screen.deal_room.adapter.revenue_recalculation_banner.a(R.drawable.revenue_recalculation_flat, 12, 4, "revenue_recalculation-lot_price_item", context.getString(R.string.das_deal_room_revenue_recalculation_lot_price_title), recalculatedConfirmedLot.getLotPrice()), new com.avito.android.developments_agency_search.adapter.spacer.a(6), new com.avito.android.developments_agency_search.screen.deal_room.adapter.revenue_recalculation_banner.a(R.drawable.revenue_recalculation_money, 4, 12, "revenue_recalculation-agent_commission_item", context.getString(R.string.das_deal_room_revenue_recalculation_agent_commission_title), recalculatedConfirmedLot.getAgentCommission()), new com.avito.android.developments_agency_search.adapter.spacer.a(20)));
            }
            GetDealRoomInfoResponse.Deal.Revenue revenue3 = deal.getRevenue();
            Set<String> set = c13364cInvoke.f2780c;
            if (revenue3 != null && (progress2 = deal.getProgress()) != null && (currentState2 = progress2.getCurrentState()) != null) {
                ArrayList arrayList3 = new ArrayList();
                if (deal.getRevenue() != null) {
                    if (deal.getRevenue().getSubtitle() != null) {
                        GetDealRoomInfoResponse.Deal.Progress progress6 = deal.getProgress();
                        if ((progress6 != null ? progress6.getCurrentState() : null) == GetDealRoomInfoResponse.Deal.Progress.State.DEAL) {
                            arrayList3.add(new TextBlockItem("deal-stage-subtitle-item", com.avito.android.printable_text.b.f(deal.getRevenue().getSubtitle()), R.attr.textM20, 0, null, 0, 0, 120, null));
                        }
                    }
                    GetDealRoomInfoResponse.Deal.Progress progress7 = deal.getProgress();
                    GetDealRoomInfoResponse.Deal.Progress.State currentState3 = progress7 != null ? progress7.getCurrentState() : null;
                    GetDealRoomInfoResponse.Deal.Progress.State state = GetDealRoomInfoResponse.Deal.Progress.State.DEAL;
                    if (currentState3 == state) {
                        arrayList3.add(new com.avito.android.developments_agency_search.screen.deal_room.adapter.deal_stage_banner.a(deal.getRevenue().getRevenueAmount()));
                    }
                    String id2 = deal.getId();
                    List<GetDealRoomInfoResponse.Deal.Revenue.Document> documents = deal.getRevenue().getDocuments();
                    if (documents == null) {
                        documents = C42784z0.f406748b;
                    }
                    ArrayList arrayListA = eVar.a(id2, documents, deal.getRevenue().getStatus(), c13364cInvoke.f2781d);
                    if (!arrayListA.isEmpty()) {
                        arrayList3.addAll(arrayListA);
                        arrayList3.add(new com.avito.android.developments_agency_search.adapter.spacer.a(16));
                    }
                    GetDealRoomInfoResponse.Deal.Progress progress8 = deal.getProgress();
                    if ((progress8 != null ? progress8.getCurrentState() : null) == state && deal.getRevenue().getStatus() == GetDealRoomInfoResponse.Deal.Revenue.Status.CREATED) {
                        arrayList3.add(new com.avito.android.developments_agency_search.screen.deal_room.adapter.send_for_verification_button.a(deal.getId(), deal.getRevenue().getAllDocumentsUploaded()));
                    }
                }
                boolean zContains = set.contains("deal-section-title-item");
                boolean z13 = currentState2 == GetDealRoomInfoResponse.Deal.Progress.State.DEAL;
                arrayList2.add(new com.avito.android.developments_agency_search.screen.deal_room.adapter.accordion.c("deal-section-title-item", deal.getRevenue().getTitle(), z13, zContains));
                if (zContains || z13) {
                    arrayList2.addAll(arrayList3);
                }
            }
            if (deal.getBookings() != null && (progress = deal.getProgress()) != null && (currentState = progress.getCurrentState()) != null) {
                GetDealRoomInfoResponse.Deal.Bookings bookings = deal.getBookings();
                List listV = C42745f0.V(bookings.getConfirmed());
                List<GetDealRoomInfoResponse.Deal.Bookings.BookingItem> pending = bookings.getPending();
                if (pending == null) {
                    pending = C42784z0.f406748b;
                }
                ArrayList arrayListH0 = C42745f0.h0(pending, listV);
                List<GetDealRoomInfoResponse.Deal.Bookings.BookingItem> declined = bookings.getDeclined();
                if (declined == null) {
                    declined = C42784z0.f406748b;
                }
                Iterator it = C42745f0.h0(declined, arrayListH0).iterator();
                while (it.hasNext()) {
                    GetDealRoomInfoResponse.Deal.Bookings.BookingItem bookingItem = (GetDealRoomInfoResponse.Deal.Bookings.BookingItem) it.next();
                    GetDealRoomInfoResponse.Deal.Bookings.BookingItem confirmed = deal.getBookings().getConfirmed();
                    boolean z14 = confirmed != null && confirmed.getId() == bookingItem.getId();
                    String id3 = deal.getId();
                    ArrayList arrayList4 = new ArrayList();
                    Boolean boolIsFakeLot = bookingItem.isFakeLot();
                    Boolean bool = Boolean.TRUE;
                    float f12 = kotlin.jvm.internal.L.f(boolIsFakeLot, bool) ? 0.5f : 1.0f;
                    Iterator it2 = it;
                    C13364c c13364c2 = c13364cInvoke;
                    com.avito.android.developments_agency_search.screen.deal_room.adapter.get_to_deal.a aVar2 = new com.avito.android.developments_agency_search.screen.deal_room.adapter.get_to_deal.a(id3, bookingItem.getBookingConditionUrl());
                    if (currentState != GetDealRoomInfoResponse.Deal.Progress.State.BOOKING || !z14) {
                        aVar2 = null;
                    }
                    GetDealRoomInfoResponse.Deal deal2 = deal;
                    com.avito.android.developments_agency_search.screen.deal_room.e eVar2 = eVar;
                    TextBlockItem textBlockItem = new TextBlockItem("booking-fake-lot-description-item", com.avito.android.printable_text.b.c(R.string.das_deal_room_booking_stage_fake_lot_description, new Serializable[0]), R.attr.textH30, 0, null, 12, 24, 24, null);
                    if (!kotlin.jvm.internal.L.f(bookingItem.isFakeLot(), bool)) {
                        textBlockItem = null;
                    }
                    StringBuilder sb2 = new StringBuilder("booking-gallery-item");
                    ArrayList arrayList5 = arrayList2;
                    sb2.append(bookingItem.getId());
                    String string = sb2.toString();
                    List<Image> images = bookingItem.getImages();
                    if (images == null) {
                        images = C42784z0.f406748b;
                    }
                    com.avito.android.developments_agency_search.adapter.gallery.a aVar3 = new com.avito.android.developments_agency_search.adapter.gallery.a(images, 10, f12, string);
                    com.avito.android.developments_agency_search.adapter.spacer.a aVar4 = new com.avito.android.developments_agency_search.adapter.spacer.a(16);
                    StringBuilder sb3 = new StringBuilder("booking-lot-item-");
                    Set<String> set2 = set;
                    Context context2 = context;
                    sb3.append(bookingItem.getId());
                    String string2 = sb3.toString();
                    String price = bookingItem.getPrice();
                    PriceTooltip priceTooltip = bookingItem.getPriceTooltip();
                    String text = priceTooltip != null ? priceTooltip.getText() : null;
                    String strA = iVar.a(bookingItem.getFlatNumber(), bookingItem.getRoomType(), bookingItem.getTotalArea(), bookingItem.getFloor());
                    List<Metro> metro = bookingItem.getDevelopmentInfo().getMetro();
                    Metro metro2 = metro != null ? (Metro) C42745f0.G(metro) : null;
                    String developmentAddress = bookingItem.getDevelopmentInfo().getDevelopmentAddress();
                    String developerName = bookingItem.getDevelopmentInfo().getDeveloperName();
                    String developmentName = bookingItem.getDevelopmentInfo().getDevelopmentName();
                    String agentCommission = bookingItem.getAgentCommission();
                    String agentCommissionPercent = bookingItem.getAgentCommissionPercent();
                    String agentCommissionColor = bookingItem.getAgentCommissionColor();
                    Boolean boolIsFakeLot2 = bookingItem.isFakeLot();
                    arrayList4.addAll(C42756l.B(new com.avito.conveyor_item.a[]{aVar2, textBlockItem, aVar3, aVar4, new com.avito.android.developments_agency_search.screen.deal_room.adapter.booking_lot.a(string2, price, text, strA, metro2, developmentAddress, developerName, developmentName, iVar.b(agentCommission, agentCommissionPercent, agentCommissionColor, boolIsFakeLot2 != null ? boolIsFakeLot2.booleanValue() : false), f12)}));
                    if (O2.a(bookingItem.getDocuments())) {
                        arrayList4.add(new com.avito.android.developments_agency_search.adapter.spacer.a(8));
                    }
                    List<GetDealRoomInfoResponse.Deal.Bookings.BookingItem.Document> documents2 = bookingItem.getDocuments();
                    if (documents2 == null) {
                        documents2 = C42784z0.f406748b;
                    }
                    List<GetDealRoomInfoResponse.Deal.Bookings.BookingItem.Document> list = documents2;
                    ArrayList arrayList6 = new ArrayList(C42745f0.q(list, 10));
                    for (GetDealRoomInfoResponse.Deal.Bookings.BookingItem.Document document : list) {
                        arrayList6.add(new com.avito.android.developments_agency_search.screen.deal_room.adapter.document.a("booking-doc-item-" + document.getName(), null, document.getName(), null, null, new a.InterfaceC4144a.b(document.getUrl()), new a.b.C4146a(document.getUrl()), f12));
                    }
                    arrayList4.addAll(arrayList6);
                    arrayList4.add(new com.avito.android.developments_agency_search.adapter.spacer.a(20));
                    boolean zContains2 = set2.contains("booking-top-item-" + bookingItem.getId());
                    GetDealRoomInfoResponse.Deal.Progress.State state2 = GetDealRoomInfoResponse.Deal.Progress.State.BOOKING;
                    boolean z15 = currentState == state2;
                    String string3 = (currentState == state2 && z14) ? context2.getString(R.string.das_deal_room_booking_stage_confimed_lot_title) : bookingItem.getTitle();
                    StringBuilder sb4 = new StringBuilder("booking-top-item-");
                    GetDealRoomInfoResponse.Deal.Progress.State state3 = currentState;
                    sb4.append(bookingItem.getId());
                    arrayList5.add(new com.avito.android.developments_agency_search.screen.deal_room.adapter.accordion.c(sb4.toString(), string3, z15, zContains2));
                    if (zContains2 || z15) {
                        arrayList5.add(new com.avito.android.developments_agency_search.adapter.spacer.a(12));
                        arrayList5.addAll(arrayList4);
                    }
                    currentState = state3;
                    set = set2;
                    context = context2;
                    it = it2;
                    c13364cInvoke = c13364c2;
                    eVar = eVar2;
                    deal = deal2;
                    arrayList2 = arrayList5;
                }
            }
            Set<String> set3 = set;
            c13364c = c13364cInvoke;
            GetDealRoomInfoResponse.Deal deal3 = deal;
            arrayList = arrayList2;
            com.avito.android.developments_agency_search.screen.deal_room.e eVar3 = eVar;
            GetDealRoomInfoResponse.Selection selection = getDealRoomInfoResponse.getSelection();
            GetDealRoomInfoResponse.Deal.Progress progress9 = deal3.getProgress();
            if (progress9 != null) {
                ArrayList arrayList7 = new ArrayList();
                String notes = deal3.getNotes();
                if (notes == null || notes.length() == 0) {
                    i12 = 0;
                    printableTextC = com.avito.android.printable_text.b.c(R.string.das_deal_room_note_text_when_empty, new Serializable[0]);
                } else {
                    printableTextC = com.avito.android.printable_text.b.f(deal3.getNotes());
                    i12 = 0;
                }
                arrayList7.add(new com.avito.android.developments_agency_search.screen.deal_room.adapter.note.c(printableTextC));
                if (selection != null) {
                    i13 = 0;
                    z12 = true;
                    arrayList7.addAll(C42745f0.U(new TextBlockItem("selection-block-title-item", com.avito.android.printable_text.b.c(R.string.developments_agency_search_deal_room_selection_stage_selection_block_item, new Serializable[i12]), R.attr.textH25, 0, null, 20, 20, 24, null), new com.avito.android.developments_agency_search.screen.deal_room.adapter.selection_block.a(selection.getId(), selection.getTitle(), selection.getObjects(), selection.getUpdateTime(), selection.getImage()), new com.avito.android.developments_agency_search.adapter.spacer.a(6)));
                } else {
                    i13 = i12;
                    z12 = true;
                }
                if (deal3.getSelectionHistory() == null || !O2.a(deal3.getSelectionHistory().getHistory())) {
                    arrayList7.add(new com.avito.android.developments_agency_search.screen.deal_room.adapter.empty_development_list_item.a());
                } else {
                    GetDealRoomInfoResponse.Deal.SelectionHistory selectionHistory = deal3.getSelectionHistory();
                    if (selectionHistory == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    arrayList7.add(new com.avito.android.developments_agency_search.adapter.spacer.a(20));
                    arrayList7.add(new TextBlockItem("selection-development-list-title-item", com.avito.android.printable_text.b.f(selectionHistory.getTitle()), 0, 0, null, 0, 0, 124, null));
                    List<GetDealRoomInfoResponse.Deal.SelectionHistory.Item> history = selectionHistory.getHistory();
                    if (history == null) {
                        history = C42784z0.f406748b;
                    }
                    arrayList7.addAll(eVar3.b(history));
                }
                boolean zContains3 = set3.contains("selection-accordion-item");
                boolean z16 = z12;
                if (progress9.getCurrentState() != GetDealRoomInfoResponse.Deal.Progress.State.SELECTION) {
                    z16 = z12;
                    if (progress9.getCurrentState() != GetDealRoomInfoResponse.Deal.Progress.State.BINDING) {
                        z16 = i13;
                    }
                }
                arrayList.add(new com.avito.android.developments_agency_search.screen.deal_room.adapter.accordion.c("selection-accordion-item", deal3.getTitle(), z16, zContains3));
                if (zContains3 || z16 != 0) {
                    arrayList.add(new com.avito.android.developments_agency_search.adapter.spacer.a(12));
                    arrayList.addAll(arrayList7);
                }
            }
        }
        Image avatar = getDealRoomInfoResponse.getClient().getAvatar();
        GetDealRoomInfoResponse.ClientInfo client = getDealRoomInfoResponse.getClient();
        return C13364c.a(c13364c, null, null, null, null, new d.a(new d.C0137d(avatar, client.getLastName() + ' ' + client.getFirstName(), getDealRoomInfoResponse.getClient().getPhone(), getDealRoomInfoResponse.getClient().getEmail()), arrayList), 31);
    }
}
