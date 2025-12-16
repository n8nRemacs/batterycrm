package com.avito.android.comfortable_deal.generated.api.agent_room_get_report_for_agent_api;

import Np.g;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.AdvertStatus;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.google.gson.annotations.c;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: AgentRoomGetReportForAgentApiResponse.kt */
@P
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b)\b\u0007\u0018\u00002\u00020\u0001:\u0003;<=B\u009d\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b(\u0010)R(\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\u000f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010-\u001a\u0004\b.\u0010/R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010!\u001a\u0004\b0\u0010#R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010!\u001a\u0004\b1\u0010#R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00102\u001a\u0004\b3\u00104R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010!\u001a\u0004\b5\u0010#R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u00106\u001a\u0004\b7\u00108R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b9\u0010\u001dR\u001a\u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b:\u0010\u001d¨\u0006>"}, d2 = {"Lcom/avito/android/comfortable_deal/generated/api/agent_room_get_report_for_agent_api/DealItemReportSuggestion;", "", "", AddressParameter.TYPE, "", "area", "", "exposure", "", "LNp/g;", "geoReferences", "Lcom/avito/android/comfortable_deal/generated/api/agent_room_get_report_for_agent_api/DealItemReportSuggestion$HouseType;", "houseType", "", "image", "itemId", "price", "recommendedPrice", "Lcom/avito/android/comfortable_deal/generated/api/agent_room_get_report_for_agent_api/DealItemReportSuggestion$RenovationType;", "renovationType", "startingPrice", "Lcom/avito/android/comfortable_deal/generated/api/agent_room_get_report_for_agent_api/DealItemReportSuggestion$Status;", "status", "title", ContextActionHandler.Link.URL, "<init>", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Long;Ljava/util/List;Lcom/avito/android/comfortable_deal/generated/api/agent_room_get_report_for_agent_api/DealItemReportSuggestion$HouseType;Ljava/util/Map;JLjava/lang/Long;Ljava/lang/Long;Lcom/avito/android/comfortable_deal/generated/api/agent_room_get_report_for_agent_api/DealItemReportSuggestion$RenovationType;Ljava/lang/Long;Lcom/avito/android/comfortable_deal/generated/api/agent_room_get_report_for_agent_api/DealItemReportSuggestion$Status;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getAddress", "()Ljava/lang/String;", "Ljava/lang/Double;", "getArea", "()Ljava/lang/Double;", "Ljava/lang/Long;", "getExposure", "()Ljava/lang/Long;", "Ljava/util/List;", "getGeoReferences", "()Ljava/util/List;", "Lcom/avito/android/comfortable_deal/generated/api/agent_room_get_report_for_agent_api/DealItemReportSuggestion$HouseType;", "getHouseType", "()Lcom/avito/android/comfortable_deal/generated/api/agent_room_get_report_for_agent_api/DealItemReportSuggestion$HouseType;", "Ljava/util/Map;", "getImage", "()Ljava/util/Map;", "J", "getItemId", "()J", "getPrice", "getRecommendedPrice", "Lcom/avito/android/comfortable_deal/generated/api/agent_room_get_report_for_agent_api/DealItemReportSuggestion$RenovationType;", "getRenovationType", "()Lcom/avito/android/comfortable_deal/generated/api/agent_room_get_report_for_agent_api/DealItemReportSuggestion$RenovationType;", "getStartingPrice", "Lcom/avito/android/comfortable_deal/generated/api/agent_room_get_report_for_agent_api/DealItemReportSuggestion$Status;", "getStatus", "()Lcom/avito/android/comfortable_deal/generated/api/agent_room_get_report_for_agent_api/DealItemReportSuggestion$Status;", "getTitle", "getUrl", "HouseType", "RenovationType", "Status", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DealItemReportSuggestion {

    @c(AddressParameter.TYPE)
    @k
    private final String address;

    @c("area")
    @l
    private final Double area;

    @c("exposure")
    @l
    private final Long exposure;

    @c("geoReferences")
    @l
    private final List<g> geoReferences;

    @c("houseType")
    @l
    private final HouseType houseType;

    @c("image")
    @l
    private final Map<String, String> image;

    @c("itemId")
    private final long itemId;

    @c("price")
    @l
    private final Long price;

    @c("recommendedPrice")
    @l
    private final Long recommendedPrice;

    @c("renovationType")
    @l
    private final RenovationType renovationType;

    @c("startingPrice")
    @l
    private final Long startingPrice;

    @c("status")
    @l
    private final Status status;

    @c("title")
    @k
    private final String title;

    @c(ContextActionHandler.Link.URL)
    @k
    private final String url;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AgentRoomGetReportForAgentApiResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/comfortable_deal/generated/api/agent_room_get_report_for_agent_api/DealItemReportSuggestion$HouseType;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Brick", "Panel", "Block", "Monolithic", "MonolithicBrick", "Wooden", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class HouseType {

        @c("block")
        public static final HouseType Block;

        @c("brick")
        public static final HouseType Brick;

        @c("monolithic")
        public static final HouseType Monolithic;

        @c("monolithic-brick")
        public static final HouseType MonolithicBrick;

        @c("panel")
        public static final HouseType Panel;

        @c("wooden")
        public static final HouseType Wooden;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ HouseType[] f122393b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f122394c;

        static {
            HouseType houseType = new HouseType("Brick", 0, "brick");
            Brick = houseType;
            HouseType houseType2 = new HouseType("Panel", 1, "panel");
            Panel = houseType2;
            HouseType houseType3 = new HouseType("Block", 2, "block");
            Block = houseType3;
            HouseType houseType4 = new HouseType("Monolithic", 3, "monolithic");
            Monolithic = houseType4;
            HouseType houseType5 = new HouseType("MonolithicBrick", 4, "monolithic-brick");
            MonolithicBrick = houseType5;
            HouseType houseType6 = new HouseType("Wooden", 5, "wooden");
            Wooden = houseType6;
            HouseType[] houseTypeArr = {houseType, houseType2, houseType3, houseType4, houseType5, houseType6};
            f122393b = houseTypeArr;
            f122394c = kotlin.enums.c.a(houseTypeArr);
        }

        private HouseType(String str, int i12, String str2) {
        }

        public static HouseType valueOf(String str) {
            return (HouseType) Enum.valueOf(HouseType.class, str);
        }

        public static HouseType[] values() {
            return (HouseType[]) f122393b.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AgentRoomGetReportForAgentApiResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/comfortable_deal/generated/api/agent_room_get_report_for_agent_api/DealItemReportSuggestion$RenovationType;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Required", "Cosmetic", "Euro", "Design", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class RenovationType {

        @c("cosmetic")
        public static final RenovationType Cosmetic;

        @c("design")
        public static final RenovationType Design;

        @c("euro")
        public static final RenovationType Euro;

        @c("required")
        public static final RenovationType Required;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ RenovationType[] f122395b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f122396c;

        static {
            RenovationType renovationType = new RenovationType("Required", 0, "required");
            Required = renovationType;
            RenovationType renovationType2 = new RenovationType("Cosmetic", 1, "cosmetic");
            Cosmetic = renovationType2;
            RenovationType renovationType3 = new RenovationType("Euro", 2, "euro");
            Euro = renovationType3;
            RenovationType renovationType4 = new RenovationType("Design", 3, "design");
            Design = renovationType4;
            RenovationType[] renovationTypeArr = {renovationType, renovationType2, renovationType3, renovationType4};
            f122395b = renovationTypeArr;
            f122396c = kotlin.enums.c.a(renovationTypeArr);
        }

        private RenovationType(String str, int i12, String str2) {
        }

        public static RenovationType valueOf(String str) {
            return (RenovationType) Enum.valueOf(RenovationType.class, str);
        }

        public static RenovationType[] values() {
            return (RenovationType[]) f122395b.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AgentRoomGetReportForAgentApiResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/comfortable_deal/generated/api/agent_room_get_report_for_agent_api/DealItemReportSuggestion$Status;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Active", "Closed", "Archived", "Expired", "Blocked", "Rejected", "Deleted", "Sold", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Status {

        @c("active")
        public static final Status Active;

        @c("archived")
        public static final Status Archived;

        @c("blocked")
        public static final Status Blocked;

        @c(AdvertStatus.CLOSED)
        public static final Status Closed;

        @c("deleted")
        public static final Status Deleted;

        @c("expired")
        public static final Status Expired;

        @c("rejected")
        public static final Status Rejected;

        @c("sold")
        public static final Status Sold;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Status[] f122397b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f122398c;

        static {
            Status status = new Status("Active", 0, "active");
            Active = status;
            Status status2 = new Status("Closed", 1, AdvertStatus.CLOSED);
            Closed = status2;
            Status status3 = new Status("Archived", 2, "archived");
            Archived = status3;
            Status status4 = new Status("Expired", 3, "expired");
            Expired = status4;
            Status status5 = new Status("Blocked", 4, "blocked");
            Blocked = status5;
            Status status6 = new Status("Rejected", 5, "rejected");
            Rejected = status6;
            Status status7 = new Status("Deleted", 6, "deleted");
            Deleted = status7;
            Status status8 = new Status("Sold", 7, "sold");
            Sold = status8;
            Status[] statusArr = {status, status2, status3, status4, status5, status6, status7, status8};
            f122397b = statusArr;
            f122398c = kotlin.enums.c.a(statusArr);
        }

        private Status(String str, int i12, String str2) {
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) f122397b.clone();
        }
    }

    public DealItemReportSuggestion(@k String str, @l Double d12, @l Long l12, @l List<g> list, @l HouseType houseType, @l Map<String, String> map, long j12, @l Long l13, @l Long l14, @l RenovationType renovationType, @l Long l15, @l Status status, @k String str2, @k String str3) {
        this.address = str;
        this.area = d12;
        this.exposure = l12;
        this.geoReferences = list;
        this.houseType = houseType;
        this.image = map;
        this.itemId = j12;
        this.price = l13;
        this.recommendedPrice = l14;
        this.renovationType = renovationType;
        this.startingPrice = l15;
        this.status = status;
        this.title = str2;
        this.url = str3;
    }
}
