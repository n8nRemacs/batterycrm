package com.avito.android.comfortable_deal.generated.api.agent_room_get_report_for_agent_api;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: AgentRoomGetReportForAgentApiResponse.kt */
@P
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001eBo\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006\u0012\u0010\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R$\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR$\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R$\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u001d\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/avito/android/comfortable_deal/generated/api/agent_room_get_report_for_agent_api/ItemHouseInfo;", "", "", "cargoElevatorCount", "constructionYear", "floorCount", "", "", "houseFacilities", "Lcom/avito/android/comfortable_deal/generated/api/agent_room_get_report_for_agent_api/ItemHouseInfo$HouseType;", "houseType", "outside", "parking", "passengerElevatorCount", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Lcom/avito/android/comfortable_deal/generated/api/agent_room_get_report_for_agent_api/ItemHouseInfo$HouseType;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;)V", "Ljava/lang/Long;", "getCargoElevatorCount", "()Ljava/lang/Long;", "getConstructionYear", "getFloorCount", "Ljava/util/List;", "getHouseFacilities", "()Ljava/util/List;", "Lcom/avito/android/comfortable_deal/generated/api/agent_room_get_report_for_agent_api/ItemHouseInfo$HouseType;", "getHouseType", "()Lcom/avito/android/comfortable_deal/generated/api/agent_room_get_report_for_agent_api/ItemHouseInfo$HouseType;", "getOutside", "getParking", "getPassengerElevatorCount", "HouseType", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ItemHouseInfo {

    @c("cargoElevatorCount")
    @l
    private final Long cargoElevatorCount;

    @c("constructionYear")
    @l
    private final Long constructionYear;

    @c("floorCount")
    @l
    private final Long floorCount;

    @c("houseFacilities")
    @l
    private final List<String> houseFacilities;

    @c("houseType")
    @l
    private final HouseType houseType;

    @c("outside")
    @l
    private final List<String> outside;

    @c("parking")
    @l
    private final List<String> parking;

    @c("passengerElevatorCount")
    @l
    private final Long passengerElevatorCount;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AgentRoomGetReportForAgentApiResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/comfortable_deal/generated/api/agent_room_get_report_for_agent_api/ItemHouseInfo$HouseType;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Brick", "Panel", "Block", "Monolithic", "MonolithicBrick", "Wooden", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
        public static final /* synthetic */ HouseType[] f122399b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f122400c;

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
            f122399b = houseTypeArr;
            f122400c = kotlin.enums.c.a(houseTypeArr);
        }

        private HouseType(String str, int i12, String str2) {
        }

        public static HouseType valueOf(String str) {
            return (HouseType) Enum.valueOf(HouseType.class, str);
        }

        public static HouseType[] values() {
            return (HouseType[]) f122399b.clone();
        }
    }

    public ItemHouseInfo(@l Long l12, @l Long l13, @l Long l14, @l List<String> list, @l HouseType houseType, @l List<String> list2, @l List<String> list3, @l Long l15) {
        this.cargoElevatorCount = l12;
        this.constructionYear = l13;
        this.floorCount = l14;
        this.houseFacilities = list;
        this.houseType = houseType;
        this.outside = list2;
        this.parking = list3;
        this.passengerElevatorCount = l15;
    }
}
