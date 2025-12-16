package Np;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.comfortable_deal.generated.api.agent_room_get_report_for_agent_api.DealItemReportItemInfo;
import com.avito.android.comfortable_deal.generated.api.agent_room_get_report_for_agent_api.DealItemReportSuggestion;
import java.util.List;
import kotlin.Metadata;

/* compiled from: AgentRoomGetReportForAgentApiResponse.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"LNp/a;", "", "a", "b", "c", "d", "e", "f", "g", "LNp/a$a;", "LNp/a$b;", "LNp/a$c;", "LNp/a$d;", "LNp/a$e;", "LNp/a$f;", "LNp/a$g;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Np.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC14600a {

    /* compiled from: AgentRoomGetReportForAgentApiResponse.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNp/a$a;", "LNp/a;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Np.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0763a implements InterfaceC14600a {
        static {
            new C0763a();
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0763a);
        }

        public final int hashCode() {
            return -736731103;
        }

        @k
        public final String toString() {
            return "DealNotFound";
        }
    }

    /* compiled from: AgentRoomGetReportForAgentApiResponse.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNp/a$b;", "LNp/a;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Np.a$b */
    public static final /* data */ class b implements InterfaceC14600a {
        static {
            new b();
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -2103915592;
        }

        @k
        public final String toString() {
            return "EmptyItemCategory";
        }
    }

    /* compiled from: AgentRoomGetReportForAgentApiResponse.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNp/a$c;", "LNp/a;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Np.a$c */
    public static final /* data */ class c implements InterfaceC14600a {
        static {
            new c();
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1841898863;
        }

        @k
        public final String toString() {
            return "ItemCoordinatesNotFound";
        }
    }

    /* compiled from: AgentRoomGetReportForAgentApiResponse.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNp/a$d;", "LNp/a;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Np.a$d */
    public static final /* data */ class d implements InterfaceC14600a {
        static {
            new d();
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -893887075;
        }

        @k
        public final String toString() {
            return "ItemLocationNotFound";
        }
    }

    /* compiled from: AgentRoomGetReportForAgentApiResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"LNp/a$e;", "LNp/a;", "a", "LNp/a$e$a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Np.a$e */
    public interface e extends InterfaceC14600a {

        /* compiled from: AgentRoomGetReportForAgentApiResponse.kt */
        @P
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LNp/a$e$a;", "LNp/a$e;", "Lcom/avito/android/comfortable_deal/generated/api/agent_room_get_report_for_agent_api/DealItemReportItemInfo;", "itemInfo", "LNp/f;", "priceInfo", "", "Lcom/avito/android/comfortable_deal/generated/api/agent_room_get_report_for_agent_api/DealItemReportSuggestion;", "suggestions", "<init>", "(Lcom/avito/android/comfortable_deal/generated/api/agent_room_get_report_for_agent_api/DealItemReportItemInfo;LNp/f;Ljava/util/List;)V", "Lcom/avito/android/comfortable_deal/generated/api/agent_room_get_report_for_agent_api/DealItemReportItemInfo;", "getItemInfo", "()Lcom/avito/android/comfortable_deal/generated/api/agent_room_get_report_for_agent_api/DealItemReportItemInfo;", "LNp/f;", "getPriceInfo", "()LNp/f;", "Ljava/util/List;", "getSuggestions", "()Ljava/util/List;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Np.a$e$a, reason: collision with other inner class name */
        public static final class C0764a implements e {

            @com.google.gson.annotations.c("itemInfo")
            @l
            private final DealItemReportItemInfo itemInfo;

            @com.google.gson.annotations.c("priceInfo")
            @l
            private final Np.f priceInfo;

            @com.google.gson.annotations.c("suggestions")
            @l
            private final List<DealItemReportSuggestion> suggestions;

            public C0764a(@l DealItemReportItemInfo dealItemReportItemInfo, @l Np.f fVar, @l List<DealItemReportSuggestion> list) {
                this.itemInfo = dealItemReportItemInfo;
                this.priceInfo = fVar;
                this.suggestions = list;
            }
        }
    }

    /* compiled from: AgentRoomGetReportForAgentApiResponse.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNp/a$f;", "LNp/a;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Np.a$f */
    public static final /* data */ class f implements InterfaceC14600a {
        static {
            new f();
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -303500394;
        }

        @k
        public final String toString() {
            return "SellerWithoutItem";
        }
    }

    /* compiled from: AgentRoomGetReportForAgentApiResponse.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNp/a$g;", "LNp/a;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Np.a$g */
    public static final /* data */ class g implements InterfaceC14600a {
        static {
            new g();
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -140185312;
        }

        @k
        public final String toString() {
            return "UnsupportedItemCategory";
        }
    }
}
