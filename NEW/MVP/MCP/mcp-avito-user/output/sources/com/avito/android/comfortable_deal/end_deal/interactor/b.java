package com.avito.android.comfortable_deal.end_deal.interactor;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.beduin.common.component.select_calendar.BeduinSelectCalendarModel;
import com.avito.android.comfortable_deal.end_deal.model.EndDealArguments;
import com.avito.android.comfortable_deal.end_deal.model.EndDealField;
import com.avito.android.util.C35755b0;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: EndDealAnalyticsInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/end_deal/interactor/b;", "Lcom/avito/android/comfortable_deal/end_deal/interactor/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements com.avito.android.comfortable_deal.end_deal.interactor.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f122193a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final EndDealArguments f122194b;

    /* compiled from: EndDealAnalyticsInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"com/avito/android/comfortable_deal/end_deal/interactor/b$a", "Lcom/avito/android/analytics/provider/clickstream/a;", "Lcc/e;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements com.avito.android.analytics.provider.clickstream.a, cc.e {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final LinkedHashMap f122195b;

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Multi-variable type inference failed */
        public a(b bVar, Map<String, ? extends EndDealField> map, Integer num) {
            Q q12;
            LocalDate localDate;
            LinkedHashMap linkedHashMapG = bVar.g();
            LinkedHashMap linkedHashMapW = AK.c.w("placement", "deals_data");
            for (Map.Entry<String, ? extends EndDealField> entry : map.entrySet()) {
                String key = entry.getKey();
                Q q13 = null;
                q13 = null;
                q13 = null;
                q13 = null;
                q13 = null;
                q13 = null;
                str = null;
                String str = null;
                q13 = null;
                q13 = null;
                switch (key.hashCode()) {
                    case -824633143:
                        if (key.equals("dealFeatures")) {
                            EndDealField value = entry.getValue();
                            EndDealField.ChipGroup chipGroup = value instanceof EndDealField.ChipGroup ? (EndDealField.ChipGroup) value : null;
                            q12 = new Q("deal_features", chipGroup != null ? chipGroup.c() : null);
                            q13 = q12;
                            break;
                        }
                        break;
                    case 509823546:
                        if (key.equals("dealDate")) {
                            EndDealField value2 = entry.getValue();
                            EndDealField.ChipDateInput chipDateInput = value2 instanceof EndDealField.ChipDateInput ? (EndDealField.ChipDateInput) value2 : null;
                            if (chipDateInput != null && (localDate = chipDateInput.f122249b) != null) {
                                str = localDate.format(DateTimeFormatter.ofPattern(BeduinSelectCalendarModel.DEFAULT_DATE_FORMAT));
                            }
                            q12 = new Q("deal_date", str);
                            q13 = q12;
                            break;
                        }
                        break;
                    case 950398559:
                        if (key.equals("comment")) {
                            EndDealField value3 = entry.getValue();
                            EndDealField.Comment comment = value3 instanceof EndDealField.Comment ? (EndDealField.Comment) value3 : null;
                            q12 = new Q("adm_comment", comment != null ? comment.f122268b : null);
                            q13 = q12;
                            break;
                        }
                        break;
                    case 1245631111:
                        if (key.equals("paymentMethod")) {
                            EndDealField value4 = entry.getValue();
                            EndDealField.ChipGroup chipGroup2 = value4 instanceof EndDealField.ChipGroup ? (EndDealField.ChipGroup) value4 : null;
                            q12 = new Q("payment_type", chipGroup2 != null ? chipGroup2.c() : null);
                            q13 = q12;
                            break;
                        }
                        break;
                    case 1352680393:
                        if (key.equals("usedPartnerServices")) {
                            EndDealField value5 = entry.getValue();
                            EndDealField.ChipGroup chipGroup3 = value5 instanceof EndDealField.ChipGroup ? (EndDealField.ChipGroup) value5 : null;
                            q13 = new Q("is_partner_services_used", String.valueOf(L.f(chipGroup3 != null ? chipGroup3.c() : null, "sold_with_avito_deal_services")));
                            break;
                        }
                        break;
                    case 1719783283:
                        if (key.equals("objectPriceByContract")) {
                            EndDealField value6 = entry.getValue();
                            EndDealField.RoubleInput roubleInput = value6 instanceof EndDealField.RoubleInput ? (EndDealField.RoubleInput) value6 : null;
                            q12 = new Q("total_price", roubleInput != null ? roubleInput.f122271b : null);
                            q13 = q12;
                            break;
                        }
                        break;
                    case 2139773392:
                        if (key.equals("agentCommission")) {
                            EndDealField value7 = entry.getValue();
                            EndDealField.RoubleInput roubleInput2 = value7 instanceof EndDealField.RoubleInput ? (EndDealField.RoubleInput) value7 : null;
                            q12 = new Q("comission_price", roubleInput2 != null ? roubleInput2.f122271b : null);
                            q13 = q12;
                            break;
                        }
                        break;
                }
                if (q13 != null) {
                    String str2 = (String) q13.f406620c;
                    linkedHashMapW.put(q13.f406619b, str2 == null ? "" : str2);
                }
            }
            if (num != null) {
            }
            linkedHashMapW.put("page", "closing_deal");
            G0 g02 = G0.f406611a;
            this.f122195b = P0.k(linkedHashMapG, linkedHashMapW);
        }

        @Override // com.avito.android.analytics.provider.clickstream.a
        /* renamed from: getEventId */
        public final int getF83080b() {
            return 15516;
        }

        @Override // com.avito.android.analytics.provider.clickstream.a
        @k
        public final Map<String, String> getParams() {
            return this.f122195b;
        }

        @Override // com.avito.android.analytics.provider.clickstream.a
        /* renamed from: getVersion */
        public final int getF83081c() {
            return 1;
        }
    }

    @Inject
    public b(@k InterfaceC28373a interfaceC28373a, @k EndDealArguments endDealArguments) {
        this.f122193a = interfaceC28373a;
        this.f122194b = endDealArguments;
    }

    @Override // com.avito.android.comfortable_deal.end_deal.interactor.a
    public final void a(boolean z12, boolean z13, boolean z14) {
        LinkedHashMap linkedHashMapG = g();
        LinkedHashMap linkedHashMapW = AK.c.w("placement", "deals_data_errors");
        ArrayList arrayList = new ArrayList();
        if (z12) {
            arrayList.add("date_error");
        }
        if (z13) {
            arrayList.add("deal_price_error");
        }
        if (z14) {
            arrayList.add("comission_price_error");
        }
        linkedHashMapW.put("error_type", C42745f0.O(arrayList, ", ", null, null, null, 62));
        linkedHashMapW.put("page", "closing_deal");
        G0 g02 = G0.f406611a;
        this.f122193a.c(new ParametrizedClickStreamEvent(15515, 1, P0.k(linkedHashMapG, linkedHashMapW), null, 8, null));
    }

    @Override // com.avito.android.comfortable_deal.end_deal.interactor.a
    public final void b() {
        this.f122193a.c(new ParametrizedClickStreamEvent(15515, 1, P0.k(g(), P0.g(new Q("placement", "deals_data"), new Q("action", "click_partner_services"), new Q("page", "closing_deal"))), null, 8, null));
    }

    @Override // com.avito.android.comfortable_deal.end_deal.interactor.a
    public final void c(@k Map<String, ? extends EndDealField> map, @l Integer num) {
        this.f122193a.c(new a(this, map, num));
    }

    @Override // com.avito.android.comfortable_deal.end_deal.interactor.a
    public final void d() {
        this.f122193a.c(new ParametrizedClickStreamEvent(15515, 1, P0.k(g(), P0.g(new Q("placement", "final_comissions_data"), new Q("action", "click_how_calculate"), new Q("page", "closing_deal"))), null, 8, null));
    }

    @Override // com.avito.android.comfortable_deal.end_deal.interactor.a
    public final void e() {
        this.f122193a.c(new ParametrizedClickStreamEvent(15515, 1, P0.k(g(), P0.g(new Q("placement", "error_page"), new Q("action", "click_reload"), new Q("page", "closing_deal"))), null, 8, null));
    }

    @Override // com.avito.android.comfortable_deal.end_deal.interactor.a
    public final void f() {
        this.f122193a.c(new ParametrizedClickStreamEvent(15515, 1, P0.k(g(), P0.g(new Q("placement", "error_page"), new Q("action", "view"), new Q("page", "closing_deal"))), null, 8, null));
    }

    public final LinkedHashMap g() {
        EndDealArguments endDealArguments = this.f122194b;
        return C35755b0.c(P0.g(new Q("pp_lead_ext", String.valueOf(endDealArguments.f122240b)), new Q("item_id", endDealArguments.f122242d), new Q("agency_user_id", endDealArguments.f122243e), new Q("agent_user_id", endDealArguments.f122244f), new Q(CrashHianalyticsData.PROCESS_ID, endDealArguments.f122246h)));
    }
}
