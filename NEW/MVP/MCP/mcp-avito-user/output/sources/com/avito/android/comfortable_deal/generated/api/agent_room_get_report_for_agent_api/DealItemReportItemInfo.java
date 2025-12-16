package com.avito.android.comfortable_deal.generated.api.agent_room_get_report_for_agent_api;

import Np.b;
import Np.d;
import Np.g;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.google.gson.annotations.c;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: AgentRoomGetReportForAgentApiResponse.kt */
@P
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b-\b\u0007\u0018\u00002\u00020\u0001:\u0001FB¹\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u001c\u0010\u0012\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0011\u0018\u00010\n\u0012\u0006\u0010\u0013\u001a\u00020\b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010+R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010,\u001a\u0004\b-\u0010.R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010/\u001a\u0004\b0\u00101R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00102\u001a\u0004\b3\u00104R0\u0010\u0012\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0011\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010,\u001a\u0004\b5\u0010.R\u001a\u0010\u0013\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00106\u001a\u0004\b7\u00108R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u00109\u001a\u0004\b:\u0010;R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010)\u001a\u0004\b<\u0010+R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010)\u001a\u0004\b=\u0010+R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010>\u001a\u0004\b?\u0010@R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010A\u001a\u0004\bB\u0010CR\u001a\u0010\u001c\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010 \u001a\u0004\bD\u0010\"R\u001a\u0010\u001d\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010 \u001a\u0004\bE\u0010\"¨\u0006G"}, d2 = {"Lcom/avito/android/comfortable_deal/generated/api/agent_room_get_report_for_agent_api/DealItemReportItemInfo;", "", "", AddressParameter.TYPE, "", "area", "LNp/b;", ServiceTransportationWidget.LocationField.COORDINATES, "", "daysPublished", "", "LNp/g;", "geoReferences", "", "hasUnderageOwners", "Lcom/avito/android/comfortable_deal/generated/api/agent_room_get_report_for_agent_api/ItemHouseInfo;", "houseInfo", "", "images", "itemId", "LNp/c;", "mortgage", "ownersCount", "price", "Lcom/avito/android/comfortable_deal/generated/api/agent_room_get_report_for_agent_api/DealItemReportItemInfo$SellingMethod;", "sellingMethod", "LNp/d;", "statistics", "title", ContextActionHandler.Link.URL, "<init>", "(Ljava/lang/String;Ljava/lang/Double;LNp/b;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Boolean;Lcom/avito/android/comfortable_deal/generated/api/agent_room_get_report_for_agent_api/ItemHouseInfo;Ljava/util/List;JLNp/c;Ljava/lang/Long;Ljava/lang/Long;Lcom/avito/android/comfortable_deal/generated/api/agent_room_get_report_for_agent_api/DealItemReportItemInfo$SellingMethod;LNp/d;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getAddress", "()Ljava/lang/String;", "Ljava/lang/Double;", "getArea", "()Ljava/lang/Double;", "LNp/b;", "getCoordinates", "()LNp/b;", "Ljava/lang/Long;", "getDaysPublished", "()Ljava/lang/Long;", "Ljava/util/List;", "getGeoReferences", "()Ljava/util/List;", "Ljava/lang/Boolean;", "getHasUnderageOwners", "()Ljava/lang/Boolean;", "Lcom/avito/android/comfortable_deal/generated/api/agent_room_get_report_for_agent_api/ItemHouseInfo;", "getHouseInfo", "()Lcom/avito/android/comfortable_deal/generated/api/agent_room_get_report_for_agent_api/ItemHouseInfo;", "getImages", "J", "getItemId", "()J", "LNp/c;", "getMortgage", "()LNp/c;", "getOwnersCount", "getPrice", "Lcom/avito/android/comfortable_deal/generated/api/agent_room_get_report_for_agent_api/DealItemReportItemInfo$SellingMethod;", "getSellingMethod", "()Lcom/avito/android/comfortable_deal/generated/api/agent_room_get_report_for_agent_api/DealItemReportItemInfo$SellingMethod;", "LNp/d;", "getStatistics", "()LNp/d;", "getTitle", "getUrl", "SellingMethod", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DealItemReportItemInfo {

    @c(AddressParameter.TYPE)
    @k
    private final String address;

    @c("area")
    @l
    private final Double area;

    @c(ServiceTransportationWidget.LocationField.COORDINATES)
    @l
    private final b coordinates;

    @c("daysPublished")
    @l
    private final Long daysPublished;

    @c("geoReferences")
    @l
    private final List<g> geoReferences;

    @c("hasUnderageOwners")
    @l
    private final Boolean hasUnderageOwners;

    @c("houseInfo")
    @l
    private final ItemHouseInfo houseInfo;

    @c("images")
    @l
    private final List<Map<String, String>> images;

    @c("itemId")
    private final long itemId;

    @c("mortgage")
    @l
    private final Np.c mortgage;

    @c("ownersCount")
    @l
    private final Long ownersCount;

    @c("price")
    @l
    private final Long price;

    @c("sellingMethod")
    @l
    private final SellingMethod sellingMethod;

    @c("statistics")
    @l
    private final d statistics;

    @c("title")
    @k
    private final String title;

    @c(ContextActionHandler.Link.URL)
    @k
    private final String url;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AgentRoomGetReportForAgentApiResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/comfortable_deal/generated/api/agent_room_get_report_for_agent_api/DealItemReportItemInfo$SellingMethod;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Direct", "AlternativeNew", "AlternativeSecondary", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SellingMethod {

        @c("alternative_new")
        public static final SellingMethod AlternativeNew;

        @c("alternative_secondary")
        public static final SellingMethod AlternativeSecondary;

        @c("direct")
        public static final SellingMethod Direct;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ SellingMethod[] f122391b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f122392c;

        static {
            SellingMethod sellingMethod = new SellingMethod("Direct", 0, "direct");
            Direct = sellingMethod;
            SellingMethod sellingMethod2 = new SellingMethod("AlternativeNew", 1, "alternative_new");
            AlternativeNew = sellingMethod2;
            SellingMethod sellingMethod3 = new SellingMethod("AlternativeSecondary", 2, "alternative_secondary");
            AlternativeSecondary = sellingMethod3;
            SellingMethod[] sellingMethodArr = {sellingMethod, sellingMethod2, sellingMethod3};
            f122391b = sellingMethodArr;
            f122392c = kotlin.enums.c.a(sellingMethodArr);
        }

        private SellingMethod(String str, int i12, String str2) {
        }

        public static SellingMethod valueOf(String str) {
            return (SellingMethod) Enum.valueOf(SellingMethod.class, str);
        }

        public static SellingMethod[] values() {
            return (SellingMethod[]) f122391b.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DealItemReportItemInfo(@k String str, @l Double d12, @l b bVar, @l Long l12, @l List<g> list, @l Boolean bool, @l ItemHouseInfo itemHouseInfo, @l List<? extends Map<String, String>> list2, long j12, @l Np.c cVar, @l Long l13, @l Long l14, @l SellingMethod sellingMethod, @l d dVar, @k String str2, @k String str3) {
        this.address = str;
        this.area = d12;
        this.coordinates = bVar;
        this.daysPublished = l12;
        this.geoReferences = list;
        this.hasUnderageOwners = bool;
        this.houseInfo = itemHouseInfo;
        this.images = list2;
        this.itemId = j12;
        this.mortgage = cVar;
        this.ownersCount = l13;
        this.price = l14;
        this.sellingMethod = sellingMethod;
        this.statistics = dVar;
        this.title = str2;
        this.url = str3;
    }
}
