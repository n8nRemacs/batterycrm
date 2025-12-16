package com.avito.android.remote.model.imv_services;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.akita.compose.component.accordion.s;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ImvServices.kt */
@d
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0014J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0014J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0014J\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0019J\u0012\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010\u0019J\u008c\u0001\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0014J\u0010\u0010$\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b+\u0010%J \u00100\u001a\u00020/2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b0\u00101R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b5\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b6\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b8\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b9\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b:\u0010\u0014R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b;\u0010\u0014R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010<\u001a\u0004\b=\u0010\u001eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00107\u001a\u0004\b>\u0010\u0019R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00107\u001a\u0004\b?\u0010\u0019¨\u0006@"}, d2 = {"Lcom/avito/android/remote/model/imv_services/ImvServicesFeedback;", "Landroid/os/Parcelable;", "", "text", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "itemId", "", "pollId", "pollLabel", "toolTipText", "answeredText", "", "Lcom/avito/android/remote/model/imv_services/ImvServicesAnswerButton;", "answers", "clickStreamEventId", "clickStreamVersion", "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component3", "component4", "()Ljava/lang/Integer;", "component5", "component6", "component7", "component8", "()Ljava/util/List;", "component9", "component10", "copy", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/avito/android/remote/model/imv_services/ImvServicesFeedback;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "getItemId", "Ljava/lang/Integer;", "getPollId", "getPollLabel", "getToolTipText", "getAnsweredText", "Ljava/util/List;", "getAnswers", "getClickStreamEventId", "getClickStreamVersion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ImvServicesFeedback implements Parcelable {

    @k
    public static final Parcelable.Creator<ImvServicesFeedback> CREATOR = new Creator();

    @c("answeredText")
    @l
    private final String answeredText;

    @c("answers")
    @l
    private final List<ImvServicesAnswerButton> answers;

    @c("clickstreamEventID")
    @l
    private final Integer clickStreamEventId;

    @c("clickstreamEventVersion")
    @l
    private final Integer clickStreamVersion;

    @c(Constants.DEEPLINK)
    @l
    private final DeepLink deeplink;

    @c("itemID")
    @l
    private final String itemId;

    @c("pollID")
    @l
    private final Integer pollId;

    @c("pollLabel")
    @l
    private final String pollLabel;

    @c("text")
    @k
    private final String text;

    @c("toolTipText")
    @l
    private final String toolTipText;

    /* compiled from: ImvServices.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ImvServicesFeedback> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ImvServicesFeedback createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            DeepLink deepLink = (DeepLink) parcel.readParcelable(ImvServicesFeedback.class.getClassLoader());
            String string2 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(ImvServicesAnswerButton.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            return new ImvServicesFeedback(string, deepLink, string2, numValueOf, string3, string4, string5, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ImvServicesFeedback[] newArray(int i12) {
            return new ImvServicesFeedback[i12];
        }
    }

    public ImvServicesFeedback(@k String str, @l DeepLink deepLink, @l String str2, @l Integer num, @l String str3, @l String str4, @l String str5, @l List<ImvServicesAnswerButton> list, @l Integer num2, @l Integer num3) {
        this.text = str;
        this.deeplink = deepLink;
        this.itemId = str2;
        this.pollId = num;
        this.pollLabel = str3;
        this.toolTipText = str4;
        this.answeredText = str5;
        this.answers = list;
        this.clickStreamEventId = num2;
        this.clickStreamVersion = num3;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final Integer getClickStreamVersion() {
        return this.clickStreamVersion;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getItemId() {
        return this.itemId;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Integer getPollId() {
        return this.pollId;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final String getPollLabel() {
        return this.pollLabel;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final String getToolTipText() {
        return this.toolTipText;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final String getAnsweredText() {
        return this.answeredText;
    }

    @l
    public final List<ImvServicesAnswerButton> component8() {
        return this.answers;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final Integer getClickStreamEventId() {
        return this.clickStreamEventId;
    }

    @k
    public final ImvServicesFeedback copy(@k String text, @l DeepLink deeplink, @l String itemId, @l Integer pollId, @l String pollLabel, @l String toolTipText, @l String answeredText, @l List<ImvServicesAnswerButton> answers, @l Integer clickStreamEventId, @l Integer clickStreamVersion) {
        return new ImvServicesFeedback(text, deeplink, itemId, pollId, pollLabel, toolTipText, answeredText, answers, clickStreamEventId, clickStreamVersion);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImvServicesFeedback)) {
            return false;
        }
        ImvServicesFeedback imvServicesFeedback = (ImvServicesFeedback) other;
        return L.f(this.text, imvServicesFeedback.text) && L.f(this.deeplink, imvServicesFeedback.deeplink) && L.f(this.itemId, imvServicesFeedback.itemId) && L.f(this.pollId, imvServicesFeedback.pollId) && L.f(this.pollLabel, imvServicesFeedback.pollLabel) && L.f(this.toolTipText, imvServicesFeedback.toolTipText) && L.f(this.answeredText, imvServicesFeedback.answeredText) && L.f(this.answers, imvServicesFeedback.answers) && L.f(this.clickStreamEventId, imvServicesFeedback.clickStreamEventId) && L.f(this.clickStreamVersion, imvServicesFeedback.clickStreamVersion);
    }

    @l
    public final String getAnsweredText() {
        return this.answeredText;
    }

    @l
    public final List<ImvServicesAnswerButton> getAnswers() {
        return this.answers;
    }

    @l
    public final Integer getClickStreamEventId() {
        return this.clickStreamEventId;
    }

    @l
    public final Integer getClickStreamVersion() {
        return this.clickStreamVersion;
    }

    @l
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @l
    public final String getItemId() {
        return this.itemId;
    }

    @l
    public final Integer getPollId() {
        return this.pollId;
    }

    @l
    public final String getPollLabel() {
        return this.pollLabel;
    }

    @k
    public final String getText() {
        return this.text;
    }

    @l
    public final String getToolTipText() {
        return this.toolTipText;
    }

    public int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        DeepLink deepLink = this.deeplink;
        int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        String str = this.itemId;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.pollId;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.pollLabel;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.toolTipText;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.answeredText;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<ImvServicesAnswerButton> list = this.answers;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.clickStreamEventId;
        int iHashCode9 = (iHashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.clickStreamVersion;
        return iHashCode9 + (num3 != null ? num3.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ImvServicesFeedback(text=");
        sb2.append(this.text);
        sb2.append(", deeplink=");
        sb2.append(this.deeplink);
        sb2.append(", itemId=");
        sb2.append(this.itemId);
        sb2.append(", pollId=");
        sb2.append(this.pollId);
        sb2.append(", pollLabel=");
        sb2.append(this.pollLabel);
        sb2.append(", toolTipText=");
        sb2.append(this.toolTipText);
        sb2.append(", answeredText=");
        sb2.append(this.answeredText);
        sb2.append(", answers=");
        sb2.append(this.answers);
        sb2.append(", clickStreamEventId=");
        sb2.append(this.clickStreamEventId);
        sb2.append(", clickStreamVersion=");
        return s.j(sb2, this.clickStreamVersion, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.text);
        parcel.writeParcelable(this.deeplink, flags);
        parcel.writeString(this.itemId);
        Integer num = this.pollId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
        parcel.writeString(this.pollLabel);
        parcel.writeString(this.toolTipText);
        parcel.writeString(this.answeredText);
        List<ImvServicesAnswerButton> list = this.answers;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((ImvServicesAnswerButton) itA.next()).writeToParcel(parcel, flags);
            }
        }
        Integer num2 = this.clickStreamEventId;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num2);
        }
        Integer num3 = this.clickStreamVersion;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num3);
        }
    }

    public /* synthetic */ ImvServicesFeedback(String str, DeepLink deepLink, String str2, Integer num, String str3, String str4, String str5, List list, Integer num2, Integer num3, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : deepLink, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? null : num, (i12 & 16) != 0 ? null : str3, (i12 & 32) != 0 ? null : str4, (i12 & 64) != 0 ? null : str5, (i12 & 128) != 0 ? null : list, (i12 & 256) != 0 ? null : num2, (i12 & 512) == 0 ? num3 : null);
    }
}
