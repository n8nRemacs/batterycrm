package com.avito.android.comfortable_deal.api.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.UniversalColor;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AgentRoomDealResponse.kt */
@d
@P
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b(\b\u0087\b\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\b\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010\u001d\u001a\u00020\u0004\u0012\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\b¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b(\u0010$R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b)\u0010$R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b+\u0010,R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b-\u0010,R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010.\u001a\u0004\b/\u00100R\u001a\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00101\u001a\u0004\b2\u00103R\u001a\u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00104\u001a\u0004\b5\u00106R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010*\u001a\u0004\b7\u0010,R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u00108\u001a\u0004\b9\u0010:R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010;\u001a\u0004\b<\u0010=R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010>\u001a\u0004\b?\u0010@R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010A\u001a\u0004\bB\u0010CR\u001a\u0010\u001d\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010%\u001a\u0004\bD\u0010'R\"\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010*\u001a\u0004\bE\u0010,¨\u0006F"}, d2 = {"Lcom/avito/android/comfortable_deal/api/model/AgentRoomDealResponse;", "Landroid/os/Parcelable;", "", "id", "", "canAddAgent", "title", "description", "", "Lcom/avito/android/comfortable_deal/api/model/ActionStage;", "availableTransitions", "Lcom/avito/android/comfortable_deal/api/model/ProgressStage;", "stages", "Lcom/avito/android/comfortable_deal/api/model/CurrentStage;", "selectedStageValue", "", "selectedStage", "Lcom/avito/android/remote/model/UniversalColor;", "stageColor", "Lcom/avito/android/comfortable_deal/api/model/DealTeamMember;", "dealTeamMembers", "Lcom/avito/android/comfortable_deal/api/model/SellerItem;", "sellerItem", "Lcom/avito/android/comfortable_deal/api/model/AgentItem;", "agentItem", "Lcom/avito/android/comfortable_deal/api/model/ImageIcon;", "imageIcon", "Lcom/avito/android/comfortable_deal/api/model/DealCompletionBanner;", "dealCompletionBanner", "showStatistics", "Lcom/avito/android/comfortable_deal/api/model/Call;", "calls", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/avito/android/comfortable_deal/api/model/CurrentStage;ILcom/avito/android/remote/model/UniversalColor;Ljava/util/List;Lcom/avito/android/comfortable_deal/api/model/SellerItem;Lcom/avito/android/comfortable_deal/api/model/AgentItem;Lcom/avito/android/comfortable_deal/api/model/ImageIcon;Lcom/avito/android/comfortable_deal/api/model/DealCompletionBanner;ZLjava/util/List;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Z", "f", "()Z", "getTitle", "getDescription", "Ljava/util/List;", "d", "()Ljava/util/List;", "o", "Lcom/avito/android/comfortable_deal/api/model/CurrentStage;", "k", "()Lcom/avito/android/comfortable_deal/api/model/CurrentStage;", "I", "j", "()I", "Lcom/avito/android/remote/model/UniversalColor;", "n", "()Lcom/avito/android/remote/model/UniversalColor;", "h", "Lcom/avito/android/comfortable_deal/api/model/SellerItem;", "l", "()Lcom/avito/android/comfortable_deal/api/model/SellerItem;", "Lcom/avito/android/comfortable_deal/api/model/AgentItem;", "c", "()Lcom/avito/android/comfortable_deal/api/model/AgentItem;", "Lcom/avito/android/comfortable_deal/api/model/ImageIcon;", "i", "()Lcom/avito/android/comfortable_deal/api/model/ImageIcon;", "Lcom/avito/android/comfortable_deal/api/model/DealCompletionBanner;", "g", "()Lcom/avito/android/comfortable_deal/api/model/DealCompletionBanner;", "m", "e", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AgentRoomDealResponse implements Parcelable {

    @k
    public static final Parcelable.Creator<AgentRoomDealResponse> CREATOR = new a();

    @c("agentItem")
    @l
    private final AgentItem agentItem;

    @c("availableTransitions")
    @l
    private final List<ActionStage> availableTransitions;

    @c("calls")
    @l
    private final List<Call> calls;

    @c("canAddAgent")
    private final boolean canAddAgent;

    @c("dealCompletionBanner")
    @l
    private final DealCompletionBanner dealCompletionBanner;

    @c("dealTeamMembers")
    @k
    private final List<DealTeamMember> dealTeamMembers;

    @c("description")
    @k
    private final String description;

    @c("id")
    @k
    private final String id;

    @c("imageIcon")
    @l
    private final ImageIcon imageIcon;

    @c("selectedStage")
    private final int selectedStage;

    @c("selectedStageValue")
    @l
    private final CurrentStage selectedStageValue;

    @c("sellerItem")
    @l
    private final SellerItem sellerItem;

    @c("showStatistics")
    private final boolean showStatistics;

    @c("stageColor")
    @k
    private final UniversalColor stageColor;

    @c("stages")
    @k
    private final List<ProgressStage> stages;

    @c("title")
    @k
    private final String title;

    /* compiled from: AgentRoomDealResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AgentRoomDealResponse> {
        @Override // android.os.Parcelable.Creator
        public final AgentRoomDealResponse createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            AgentItem agentItem;
            ArrayList arrayList2;
            String string = parcel.readString();
            boolean z12 = parcel.readInt() != 0;
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(ActionStage.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            int i13 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i13);
            int iC3 = 0;
            while (iC3 != i13) {
                iC3 = com.avito.android.actions_sheet.a.c(ProgressStage.CREATOR, parcel, arrayList3, iC3, 1);
            }
            CurrentStage currentStageValueOf = parcel.readInt() == 0 ? null : CurrentStage.valueOf(parcel.readString());
            int i14 = parcel.readInt();
            UniversalColor universalColor = (UniversalColor) parcel.readParcelable(AgentRoomDealResponse.class.getClassLoader());
            int i15 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i15);
            int iC4 = 0;
            while (iC4 != i15) {
                iC4 = com.avito.android.actions_sheet.a.c(DealTeamMember.CREATOR, parcel, arrayList4, iC4, 1);
            }
            SellerItem sellerItemCreateFromParcel = parcel.readInt() == 0 ? null : SellerItem.CREATOR.createFromParcel(parcel);
            AgentItem agentItemCreateFromParcel = parcel.readInt() == 0 ? null : AgentItem.CREATOR.createFromParcel(parcel);
            ImageIcon imageIconCreateFromParcel = parcel.readInt() == 0 ? null : ImageIcon.CREATOR.createFromParcel(parcel);
            DealCompletionBanner dealCompletionBannerCreateFromParcel = parcel.readInt() == 0 ? null : DealCompletionBanner.CREATOR.createFromParcel(parcel);
            boolean z13 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                arrayList2 = null;
                agentItem = agentItemCreateFromParcel;
            } else {
                int i16 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i16);
                int iC5 = 0;
                while (iC5 != i16) {
                    iC5 = com.avito.android.actions_sheet.a.c(Call.CREATOR, parcel, arrayList5, iC5, 1);
                    i16 = i16;
                    agentItemCreateFromParcel = agentItemCreateFromParcel;
                }
                agentItem = agentItemCreateFromParcel;
                arrayList2 = arrayList5;
            }
            return new AgentRoomDealResponse(string, z12, string2, string3, arrayList, arrayList3, currentStageValueOf, i14, universalColor, arrayList4, sellerItemCreateFromParcel, agentItem, imageIconCreateFromParcel, dealCompletionBannerCreateFromParcel, z13, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final AgentRoomDealResponse[] newArray(int i12) {
            return new AgentRoomDealResponse[i12];
        }
    }

    public AgentRoomDealResponse(@k String str, boolean z12, @k String str2, @k String str3, @l List<ActionStage> list, @k List<ProgressStage> list2, @l CurrentStage currentStage, int i12, @k UniversalColor universalColor, @k List<DealTeamMember> list3, @l SellerItem sellerItem, @l AgentItem agentItem, @l ImageIcon imageIcon, @l DealCompletionBanner dealCompletionBanner, boolean z13, @l List<Call> list4) {
        this.id = str;
        this.canAddAgent = z12;
        this.title = str2;
        this.description = str3;
        this.availableTransitions = list;
        this.stages = list2;
        this.selectedStageValue = currentStage;
        this.selectedStage = i12;
        this.stageColor = universalColor;
        this.dealTeamMembers = list3;
        this.sellerItem = sellerItem;
        this.agentItem = agentItem;
        this.imageIcon = imageIcon;
        this.dealCompletionBanner = dealCompletionBanner;
        this.showStatistics = z13;
        this.calls = list4;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final AgentItem getAgentItem() {
        return this.agentItem;
    }

    @l
    public final List<ActionStage> d() {
        return this.availableTransitions;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    public final List<Call> e() {
        return this.calls;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AgentRoomDealResponse)) {
            return false;
        }
        AgentRoomDealResponse agentRoomDealResponse = (AgentRoomDealResponse) obj;
        return L.f(this.id, agentRoomDealResponse.id) && this.canAddAgent == agentRoomDealResponse.canAddAgent && L.f(this.title, agentRoomDealResponse.title) && L.f(this.description, agentRoomDealResponse.description) && L.f(this.availableTransitions, agentRoomDealResponse.availableTransitions) && L.f(this.stages, agentRoomDealResponse.stages) && this.selectedStageValue == agentRoomDealResponse.selectedStageValue && this.selectedStage == agentRoomDealResponse.selectedStage && L.f(this.stageColor, agentRoomDealResponse.stageColor) && L.f(this.dealTeamMembers, agentRoomDealResponse.dealTeamMembers) && L.f(this.sellerItem, agentRoomDealResponse.sellerItem) && L.f(this.agentItem, agentRoomDealResponse.agentItem) && this.imageIcon == agentRoomDealResponse.imageIcon && L.f(this.dealCompletionBanner, agentRoomDealResponse.dealCompletionBanner) && this.showStatistics == agentRoomDealResponse.showStatistics && L.f(this.calls, agentRoomDealResponse.calls);
    }

    /* renamed from: f, reason: from getter */
    public final boolean getCanAddAgent() {
        return this.canAddAgent;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final DealCompletionBanner getDealCompletionBanner() {
        return this.dealCompletionBanner;
    }

    @k
    public final String getDescription() {
        return this.description;
    }

    @k
    public final String getId() {
        return this.id;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @k
    public final List<DealTeamMember> h() {
        return this.dealTeamMembers;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(r.i(this.id.hashCode() * 31, 31, this.canAddAgent), 31, this.title), 31, this.description);
        List<ActionStage> list = this.availableTransitions;
        int iE2 = H.e((iD2 + (list == null ? 0 : list.hashCode())) * 31, 31, this.stages);
        CurrentStage currentStage = this.selectedStageValue;
        int iE3 = H.e(com.avito.android.actions_sheet.a.i(this.stageColor, r.e(this.selectedStage, (iE2 + (currentStage == null ? 0 : currentStage.hashCode())) * 31, 31), 31), 31, this.dealTeamMembers);
        SellerItem sellerItem = this.sellerItem;
        int iHashCode = (iE3 + (sellerItem == null ? 0 : sellerItem.hashCode())) * 31;
        AgentItem agentItem = this.agentItem;
        int iHashCode2 = (iHashCode + (agentItem == null ? 0 : agentItem.hashCode())) * 31;
        ImageIcon imageIcon = this.imageIcon;
        int iHashCode3 = (iHashCode2 + (imageIcon == null ? 0 : imageIcon.hashCode())) * 31;
        DealCompletionBanner dealCompletionBanner = this.dealCompletionBanner;
        int i12 = r.i((iHashCode3 + (dealCompletionBanner == null ? 0 : dealCompletionBanner.hashCode())) * 31, 31, this.showStatistics);
        List<Call> list2 = this.calls;
        return i12 + (list2 != null ? list2.hashCode() : 0);
    }

    @l
    /* renamed from: i, reason: from getter */
    public final ImageIcon getImageIcon() {
        return this.imageIcon;
    }

    /* renamed from: j, reason: from getter */
    public final int getSelectedStage() {
        return this.selectedStage;
    }

    @l
    /* renamed from: k, reason: from getter */
    public final CurrentStage getSelectedStageValue() {
        return this.selectedStageValue;
    }

    @l
    /* renamed from: l, reason: from getter */
    public final SellerItem getSellerItem() {
        return this.sellerItem;
    }

    /* renamed from: m, reason: from getter */
    public final boolean getShowStatistics() {
        return this.showStatistics;
    }

    @k
    /* renamed from: n, reason: from getter */
    public final UniversalColor getStageColor() {
        return this.stageColor;
    }

    @k
    public final List<ProgressStage> o() {
        return this.stages;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AgentRoomDealResponse(id=");
        sb2.append(this.id);
        sb2.append(", canAddAgent=");
        sb2.append(this.canAddAgent);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", availableTransitions=");
        sb2.append(this.availableTransitions);
        sb2.append(", stages=");
        sb2.append(this.stages);
        sb2.append(", selectedStageValue=");
        sb2.append(this.selectedStageValue);
        sb2.append(", selectedStage=");
        sb2.append(this.selectedStage);
        sb2.append(", stageColor=");
        sb2.append(this.stageColor);
        sb2.append(", dealTeamMembers=");
        sb2.append(this.dealTeamMembers);
        sb2.append(", sellerItem=");
        sb2.append(this.sellerItem);
        sb2.append(", agentItem=");
        sb2.append(this.agentItem);
        sb2.append(", imageIcon=");
        sb2.append(this.imageIcon);
        sb2.append(", dealCompletionBanner=");
        sb2.append(this.dealCompletionBanner);
        sb2.append(", showStatistics=");
        sb2.append(this.showStatistics);
        sb2.append(", calls=");
        return H.p(sb2, this.calls, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.id);
        parcel.writeInt(this.canAddAgent ? 1 : 0);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        List<ActionStage> list = this.availableTransitions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((ActionStage) itA.next()).writeToParcel(parcel, i12);
            }
        }
        Iterator itJ = C0.j(this.stages, parcel);
        while (itJ.hasNext()) {
            ((ProgressStage) itJ.next()).writeToParcel(parcel, i12);
        }
        CurrentStage currentStage = this.selectedStageValue;
        if (currentStage == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(currentStage.name());
        }
        parcel.writeInt(this.selectedStage);
        parcel.writeParcelable(this.stageColor, i12);
        Iterator itJ2 = C0.j(this.dealTeamMembers, parcel);
        while (itJ2.hasNext()) {
            ((DealTeamMember) itJ2.next()).writeToParcel(parcel, i12);
        }
        SellerItem sellerItem = this.sellerItem;
        if (sellerItem == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sellerItem.writeToParcel(parcel, i12);
        }
        AgentItem agentItem = this.agentItem;
        if (agentItem == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            agentItem.writeToParcel(parcel, i12);
        }
        ImageIcon imageIcon = this.imageIcon;
        if (imageIcon == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            imageIcon.writeToParcel(parcel, i12);
        }
        DealCompletionBanner dealCompletionBanner = this.dealCompletionBanner;
        if (dealCompletionBanner == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dealCompletionBanner.writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.showStatistics ? 1 : 0);
        List<Call> list2 = this.calls;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
        while (itA2.hasNext()) {
            ((Call) itA2.next()).writeToParcel(parcel, i12);
        }
    }
}
