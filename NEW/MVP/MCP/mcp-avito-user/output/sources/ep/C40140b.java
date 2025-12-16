package ep;

import Y61.k;
import androidx.compose.runtime.internal.P;
import cc.e;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.comfortable_deal.client_room.model.ClientRoomArguments;
import com.avito.android.comfortable_deal.client_room.model.PartnerStatus;
import com.avito.android.remote.model.messenger.message.MessageBody;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: ClientRoomAnalyticsInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lep/b;", "Lep/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ep.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C40140b implements InterfaceC40139a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f395370a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ClientRoomArguments f395371b;

    /* compiled from: ClientRoomAnalyticsInteractor.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"ep/b$a", "Lcom/avito/android/analytics/provider/clickstream/a;", "Lcc/e;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ep.b$a */
    public static final class a implements com.avito.android.analytics.provider.clickstream.a, e {

        /* renamed from: b, reason: collision with root package name */
        public final int f395372b;

        /* renamed from: c, reason: collision with root package name */
        public final int f395373c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final LinkedHashMap f395374d;

        public a(int i12, int i13, LinkedHashMap linkedHashMap) {
            this.f395372b = i12;
            this.f395373c = i13;
            this.f395374d = linkedHashMap;
        }

        @Override // com.avito.android.analytics.provider.clickstream.a
        /* renamed from: getEventId, reason: from getter */
        public final int getF395375b() {
            return this.f395372b;
        }

        @Override // com.avito.android.analytics.provider.clickstream.a
        @k
        public final Map<String, Object> getParams() {
            return this.f395374d;
        }

        @Override // com.avito.android.analytics.provider.clickstream.a
        /* renamed from: getVersion, reason: from getter */
        public final int getF395376c() {
            return this.f395373c;
        }
    }

    /* compiled from: ClientRoomAnalyticsInteractor.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ep/b$b", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ep.b$b, reason: collision with other inner class name */
    public static final class C11103b implements com.avito.android.analytics.provider.clickstream.a {

        /* renamed from: b, reason: collision with root package name */
        public final int f395375b;

        /* renamed from: c, reason: collision with root package name */
        public final int f395376c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final LinkedHashMap f395377d;

        public C11103b(int i12, int i13, LinkedHashMap linkedHashMap) {
            this.f395375b = i12;
            this.f395376c = i13;
            this.f395377d = linkedHashMap;
        }

        @Override // com.avito.android.analytics.provider.clickstream.a
        /* renamed from: getEventId, reason: from getter */
        public final int getF395375b() {
            return this.f395375b;
        }

        @Override // com.avito.android.analytics.provider.clickstream.a
        @k
        public final Map<String, Object> getParams() {
            return this.f395377d;
        }

        @Override // com.avito.android.analytics.provider.clickstream.a
        /* renamed from: getVersion, reason: from getter */
        public final int getF395376c() {
            return this.f395376c;
        }
    }

    @Inject
    public C40140b(@k InterfaceC28373a interfaceC28373a, @k ClientRoomArguments clientRoomArguments) {
        this.f395370a = interfaceC28373a;
        this.f395371b = clientRoomArguments;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.avito.android.analytics.provider.clickstream.a g(C40140b c40140b, int i12, int i13, Map map, int i14) {
        if ((i14 & 4) != 0) {
            map = P0.c();
        }
        return c40140b.f(i12, i13, map, false);
    }

    @Override // ep.InterfaceC40139a
    public final void a(@k String str) {
        this.f395370a.c(f(10264, 3, Collections.singletonMap("rre_trx_agreement_materials_card_name", str), true));
    }

    @Override // ep.InterfaceC40139a
    public final void b() {
        this.f395370a.c(g(this, 11518, 0, null, 12));
    }

    @Override // ep.InterfaceC40139a
    public final void c(@k String str) {
        this.f395370a.c(f(10263, 3, Collections.singletonMap("rre_trx_agreement_materials_card_name", str), true));
    }

    @Override // ep.InterfaceC40139a
    public final void d(boolean z12) {
        this.f395370a.c(g(this, 10262, 4, Collections.singletonMap("rre_trx_params_str", z12 ? MessageBody.SystemMessageBody.Platform.Bubble.Item.EXTENDED : "basic"), 8));
    }

    @Override // ep.InterfaceC40139a
    public final void e() {
        this.f395370a.c(g(this, 12471, 0, null, 12));
    }

    public final com.avito.android.analytics.provider.clickstream.a f(int i12, int i13, Map<String, String> map, boolean z12) {
        ClientRoomArguments clientRoomArguments = this.f395371b;
        Q q12 = new Q("rre_trx_agency_lead_id", clientRoomArguments.f119868b);
        String str = clientRoomArguments.f119870d;
        Q q13 = new Q("utm_source", str == null ? "" : str);
        if (str == null) {
            str = "";
        }
        LinkedHashMap linkedHashMapJ = P0.j(q12, q13, new Q("pp_source", str));
        PartnerStatus partnerStatus = clientRoomArguments.f119869c;
        Q<String, String> qA2 = C40142d.a(partnerStatus);
        if (qA2 != null) {
            linkedHashMapJ.put(qA2.f406619b, qA2.f406620c);
        }
        Q<String, String> qB2 = C40142d.b(partnerStatus);
        if (qB2 != null) {
            linkedHashMapJ.put(qB2.f406619b, qB2.f406620c);
        }
        linkedHashMapJ.putAll(map);
        return z12 ? new a(i12, i13, linkedHashMapJ) : new C11103b(i12, i13, linkedHashMapJ);
    }
}
