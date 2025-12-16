package com.avito.android.comfortable_deal.deal.item.completion.analytics;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.comfortable_deal.api.model.ActionTransition;
import com.avito.android.util.C35755b0;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.LinkedHashMap;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42756l;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;

/* compiled from: DealCompletionAnalyticsInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/item/completion/analytics/b;", "Lcom/avito/android/comfortable_deal/deal/item/completion/analytics/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements com.avito.android.comfortable_deal.deal.item.completion.analytics.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f121339a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f121340b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC42726C f121341c = C42727D.c(a.f121342l);

    /* compiled from: DealCompletionAnalyticsInteractor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/avito/android/comfortable_deal/api/model/ActionTransition;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<Set<? extends ActionTransition>> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f121342l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Set<? extends ActionTransition> invoke() {
            return C42756l.l0(new ActionTransition[]{ActionTransition.RefusedBySeller, ActionTransition.Sold, ActionTransition.DepositMade, ActionTransition.InAdvertising});
        }
    }

    @Inject
    public b(@k InterfaceC28373a interfaceC28373a, @k String str) {
        this.f121339a = interfaceC28373a;
        this.f121340b = str;
    }

    @Override // com.avito.android.comfortable_deal.deal.item.completion.analytics.a
    public final void a(@l String str, @l String str2, @l String str3, @l String str4) {
        this.f121339a.c(new ParametrizedClickStreamEvent(15515, 1, P0.k(d(str, str2, str3, str4), P0.g(new Q("placement", "congratz_page"), new Q("action", "click_how_calculate"), new Q("page", "closing_deal"))), null, 8, null));
    }

    @Override // com.avito.android.comfortable_deal.deal.item.completion.analytics.a
    public final void b(@l String str, @l String str2, @l String str3, @l String str4) {
        this.f121339a.c(new ParametrizedClickStreamEvent(15515, 1, P0.k(d(str, str2, str3, str4), P0.g(new Q("placement", "congratz_page"), new Q("action", "view"), new Q("page", "closing_deal"))), null, 8, null));
    }

    @Override // com.avito.android.comfortable_deal.deal.item.completion.analytics.a
    public final void c(@l String str, @l String str2, @l String str3, @l String str4, @k ActionTransition actionTransition) {
        if (((Set) this.f121341c.getValue()).contains(actionTransition)) {
            this.f121339a.c(new ParametrizedClickStreamEvent(15515, 1, P0.k(d(str, str2, str3, str4), P0.g(new Q("placement", "status_buttons"), new Q("action", actionTransition.f119756b), new Q("page", "closing_deal"))), null, 8, null));
        }
    }

    public final LinkedHashMap d(String str, String str2, String str3, String str4) {
        return C35755b0.c(P0.g(new Q("pp_lead_ext", str), new Q("item_id", str2), new Q("agency_user_id", str3), new Q("agent_user_id", str4), new Q(CrashHianalyticsData.PROCESS_ID, this.f121340b)));
    }
}
