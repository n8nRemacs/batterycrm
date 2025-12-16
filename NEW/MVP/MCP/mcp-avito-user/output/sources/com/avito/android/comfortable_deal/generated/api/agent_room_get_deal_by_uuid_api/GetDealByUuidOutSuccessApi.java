package com.avito.android.comfortable_deal.generated.api.agent_room_get_deal_by_uuid_api;

import Mp.C14516a;
import Mp.d;
import Mp.e;
import Mp.n;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: AgentRoomGetDealByUuidApiResponse.kt */
@P
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b.\b\u0007\u0018\u00002\u00020\u0001:\u0001IBÉ\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0004\u0012\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0004\u0012\u0006\u0010\u001f\u001a\u00020\u000f\u0012\u0006\u0010 \u001a\u00020\u000f¢\u0006\u0004\b!\u0010\"R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010%R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010(R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b)\u0010(R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010-\u001a\u0004\b.\u0010/R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010&\u001a\u0004\b0\u0010(R\u001a\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00101\u001a\u0004\b2\u00103R\u001a\u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00104\u001a\u0004\b5\u00106R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00101\u001a\u0004\b7\u00103R\u001a\u0010\u0014\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u00104\u001a\u0004\b8\u00106R\u001a\u0010\u0016\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u00109\u001a\u0004\b:\u0010;R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010<\u001a\u0004\b=\u0010>R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010?\u001a\u0004\b@\u0010AR\u001a\u0010\u001b\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010B\u001a\u0004\bC\u0010DR\"\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010&\u001a\u0004\bE\u0010(R\"\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010&\u001a\u0004\bF\u0010(R\u001a\u0010\u001f\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u00101\u001a\u0004\bG\u00103R\u001a\u0010 \u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u00101\u001a\u0004\bH\u00103¨\u0006J"}, d2 = {"Lcom/avito/android/comfortable_deal/generated/api/agent_room_get_deal_by_uuid_api/GetDealByUuidOutSuccessApi;", "", "LMp/a;", "agentItem", "", "Lcom/avito/android/comfortable_deal/generated/api/agent_room_get_deal_by_uuid_api/AvailableTransitionsItem2;", "availableTransitions", "LMp/d;", "calls", "", "canAddAgent", "LMp/e;", "dealCompletionBanner", "Lcom/avito/android/comfortable_deal/generated/api/agent_room_get_deal_by_uuid_api/DealTeamMembersItemApi;", "dealTeamMembers", "", "description", "", "id", "imageIcon", "selectedStage", "Lcom/avito/android/comfortable_deal/generated/api/agent_room_get_deal_by_uuid_api/GetDealByUuidOutSuccessApi$SelectedStageValue;", "selectedStageValue", "LMp/k;", "sellerItem", "showStatistics", "LMp/n;", "stageColor", "LMp/l;", "stages", "tags", "title", "uuid", "<init>", "(LMp/a;Ljava/util/List;Ljava/util/List;ZLMp/e;Ljava/util/List;Ljava/lang/String;JLjava/lang/String;JLcom/avito/android/comfortable_deal/generated/api/agent_room_get_deal_by_uuid_api/GetDealByUuidOutSuccessApi$SelectedStageValue;LMp/k;Ljava/lang/Boolean;LMp/n;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "LMp/a;", "a", "()LMp/a;", "Ljava/util/List;", "b", "()Ljava/util/List;", "c", "Z", "d", "()Z", "LMp/e;", "e", "()LMp/e;", "f", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "J", "h", "()J", "i", "j", "Lcom/avito/android/comfortable_deal/generated/api/agent_room_get_deal_by_uuid_api/GetDealByUuidOutSuccessApi$SelectedStageValue;", "k", "()Lcom/avito/android/comfortable_deal/generated/api/agent_room_get_deal_by_uuid_api/GetDealByUuidOutSuccessApi$SelectedStageValue;", "LMp/k;", "l", "()LMp/k;", "Ljava/lang/Boolean;", "m", "()Ljava/lang/Boolean;", "LMp/n;", "n", "()LMp/n;", "o", "getTags", "p", "getUuid", "SelectedStageValue", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GetDealByUuidOutSuccessApi {

    @c("agentItem")
    @l
    private final C14516a agentItem;

    @c("availableTransitions")
    @l
    private final List<AvailableTransitionsItem2> availableTransitions;

    @c("calls")
    @l
    private final List<d> calls;

    @c("canAddAgent")
    private final boolean canAddAgent;

    @c("dealCompletionBanner")
    @l
    private final e dealCompletionBanner;

    @c("dealTeamMembers")
    @l
    private final List<DealTeamMembersItemApi> dealTeamMembers;

    @c("description")
    @k
    private final String description;

    @c("id")
    private final long id;

    @c("imageIcon")
    @l
    private final String imageIcon;

    @c("selectedStage")
    private final long selectedStage;

    @c("selectedStageValue")
    @k
    private final SelectedStageValue selectedStageValue;

    @c("sellerItem")
    @l
    private final Mp.k sellerItem;

    @c("showStatistics")
    @l
    private final Boolean showStatistics;

    @c("stageColor")
    @k
    private final n stageColor;

    @c("stages")
    @l
    private final List<Mp.l> stages;

    @c("tags")
    @l
    private final List<String> tags;

    @c("title")
    @k
    private final String title;

    @c("uuid")
    @k
    private final String uuid;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AgentRoomGetDealByUuidApiResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/comfortable_deal/generated/api/agent_room_get_deal_by_uuid_api/GetDealByUuidOutSuccessApi$SelectedStageValue;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Introduction", "Meeting", "Published", "Deposit", "Deal", "Refused", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SelectedStageValue {

        @c("deal")
        public static final SelectedStageValue Deal;

        @c("deposit")
        public static final SelectedStageValue Deposit;

        @c("introduction")
        public static final SelectedStageValue Introduction;

        @c("meeting")
        public static final SelectedStageValue Meeting;

        @c("published")
        public static final SelectedStageValue Published;

        @c("refused")
        public static final SelectedStageValue Refused;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ SelectedStageValue[] f122389b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f122390c;

        static {
            SelectedStageValue selectedStageValue = new SelectedStageValue("Introduction", 0, "introduction");
            Introduction = selectedStageValue;
            SelectedStageValue selectedStageValue2 = new SelectedStageValue("Meeting", 1, "meeting");
            Meeting = selectedStageValue2;
            SelectedStageValue selectedStageValue3 = new SelectedStageValue("Published", 2, "published");
            Published = selectedStageValue3;
            SelectedStageValue selectedStageValue4 = new SelectedStageValue("Deposit", 3, "deposit");
            Deposit = selectedStageValue4;
            SelectedStageValue selectedStageValue5 = new SelectedStageValue("Deal", 4, "deal");
            Deal = selectedStageValue5;
            SelectedStageValue selectedStageValue6 = new SelectedStageValue("Refused", 5, "refused");
            Refused = selectedStageValue6;
            SelectedStageValue[] selectedStageValueArr = {selectedStageValue, selectedStageValue2, selectedStageValue3, selectedStageValue4, selectedStageValue5, selectedStageValue6};
            f122389b = selectedStageValueArr;
            f122390c = kotlin.enums.c.a(selectedStageValueArr);
        }

        private SelectedStageValue(String str, int i12, String str2) {
        }

        public static SelectedStageValue valueOf(String str) {
            return (SelectedStageValue) Enum.valueOf(SelectedStageValue.class, str);
        }

        public static SelectedStageValue[] values() {
            return (SelectedStageValue[]) f122389b.clone();
        }
    }

    public GetDealByUuidOutSuccessApi(@l C14516a c14516a, @l List<AvailableTransitionsItem2> list, @l List<d> list2, boolean z12, @l e eVar, @l List<DealTeamMembersItemApi> list3, @k String str, long j12, @l String str2, long j13, @k SelectedStageValue selectedStageValue, @l Mp.k kVar, @l Boolean bool, @k n nVar, @l List<Mp.l> list4, @l List<String> list5, @k String str3, @k String str4) {
        this.agentItem = c14516a;
        this.availableTransitions = list;
        this.calls = list2;
        this.canAddAgent = z12;
        this.dealCompletionBanner = eVar;
        this.dealTeamMembers = list3;
        this.description = str;
        this.id = j12;
        this.imageIcon = str2;
        this.selectedStage = j13;
        this.selectedStageValue = selectedStageValue;
        this.sellerItem = kVar;
        this.showStatistics = bool;
        this.stageColor = nVar;
        this.stages = list4;
        this.tags = list5;
        this.title = str3;
        this.uuid = str4;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final C14516a getAgentItem() {
        return this.agentItem;
    }

    @l
    public final List<AvailableTransitionsItem2> b() {
        return this.availableTransitions;
    }

    @l
    public final List<d> c() {
        return this.calls;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getCanAddAgent() {
        return this.canAddAgent;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final e getDealCompletionBanner() {
        return this.dealCompletionBanner;
    }

    @l
    public final List<DealTeamMembersItemApi> f() {
        return this.dealTeamMembers;
    }

    @k
    /* renamed from: g, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: h, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @l
    /* renamed from: i, reason: from getter */
    public final String getImageIcon() {
        return this.imageIcon;
    }

    /* renamed from: j, reason: from getter */
    public final long getSelectedStage() {
        return this.selectedStage;
    }

    @k
    /* renamed from: k, reason: from getter */
    public final SelectedStageValue getSelectedStageValue() {
        return this.selectedStageValue;
    }

    @l
    /* renamed from: l, reason: from getter */
    public final Mp.k getSellerItem() {
        return this.sellerItem;
    }

    @l
    /* renamed from: m, reason: from getter */
    public final Boolean getShowStatistics() {
        return this.showStatistics;
    }

    @k
    /* renamed from: n, reason: from getter */
    public final n getStageColor() {
        return this.stageColor;
    }

    @l
    public final List<Mp.l> o() {
        return this.stages;
    }

    @k
    /* renamed from: p, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
