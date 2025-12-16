package com.avito.android.mortgage.api.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.adjust.sdk.Constants;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ApplicationsListModel.kt */
@d
@P
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b \u0010\u0015R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0013\u001a\u0004\b!\u0010\u0015R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0013\u001a\u0004\b\"\u0010\u0015R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lcom/avito/android/mortgage/api/model/ApplicationsItemModel;", "Landroid/os/Parcelable;", "", "id", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "agentLabel", "", "bankIcons", "", "currentStepIndex", "description", "stepDescription", "stepName", "stepsCount", "Lcom/avito/android/mortgage/api/model/ApplicationStyle;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/avito/android/mortgage/api/model/ApplicationStyle;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "c", "Ljava/util/List;", "d", "()Ljava/util/List;", "Ljava/lang/Integer;", "e", "()Ljava/lang/Integer;", "getDescription", "f", "g", "h", "Lcom/avito/android/mortgage/api/model/ApplicationStyle;", "i", "()Lcom/avito/android/mortgage/api/model/ApplicationStyle;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ApplicationsItemModel implements Parcelable {

    @k
    public static final Parcelable.Creator<ApplicationsItemModel> CREATOR = new a();

    @c("agentLabel")
    @l
    private final String agentLabel;

    @c("bankIcons")
    @l
    private final List<String> bankIcons;

    @c("currentStepIndex")
    @l
    private final Integer currentStepIndex;

    @c(Constants.DEEPLINK)
    @k
    private final DeepLink deeplink;

    @c("description")
    @l
    private final String description;

    @c("id")
    @k
    private final String id;

    @c("stepDescription")
    @l
    private final String stepDescription;

    @c("stepName")
    @l
    private final String stepName;

    @c("stepsCount")
    @l
    private final Integer stepsCount;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @l
    private final ApplicationStyle style;

    /* compiled from: ApplicationsListModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ApplicationsItemModel> {
        @Override // android.os.Parcelable.Creator
        public final ApplicationsItemModel createFromParcel(Parcel parcel) {
            return new ApplicationsItemModel(parcel.readString(), (DeepLink) parcel.readParcelable(ApplicationsItemModel.class.getClassLoader()), parcel.readString(), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : ApplicationStyle.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final ApplicationsItemModel[] newArray(int i12) {
            return new ApplicationsItemModel[i12];
        }
    }

    public ApplicationsItemModel(@k String str, @k DeepLink deepLink, @l String str2, @l List<String> list, @l Integer num, @l String str3, @l String str4, @l String str5, @l Integer num2, @l ApplicationStyle applicationStyle) {
        this.id = str;
        this.deeplink = deepLink;
        this.agentLabel = str2;
        this.bankIcons = list;
        this.currentStepIndex = num;
        this.description = str3;
        this.stepDescription = str4;
        this.stepName = str5;
        this.stepsCount = num2;
        this.style = applicationStyle;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getAgentLabel() {
        return this.agentLabel;
    }

    @l
    public final List<String> d() {
        return this.bankIcons;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final Integer getCurrentStepIndex() {
        return this.currentStepIndex;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplicationsItemModel)) {
            return false;
        }
        ApplicationsItemModel applicationsItemModel = (ApplicationsItemModel) obj;
        return L.f(this.id, applicationsItemModel.id) && L.f(this.deeplink, applicationsItemModel.deeplink) && L.f(this.agentLabel, applicationsItemModel.agentLabel) && L.f(this.bankIcons, applicationsItemModel.bankIcons) && L.f(this.currentStepIndex, applicationsItemModel.currentStepIndex) && L.f(this.description, applicationsItemModel.description) && L.f(this.stepDescription, applicationsItemModel.stepDescription) && L.f(this.stepName, applicationsItemModel.stepName) && L.f(this.stepsCount, applicationsItemModel.stepsCount) && this.style == applicationsItemModel.style;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final String getStepDescription() {
        return this.stepDescription;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final String getStepName() {
        return this.stepName;
    }

    @k
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @l
    public final String getDescription() {
        return this.description;
    }

    @k
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: h, reason: from getter */
    public final Integer getStepsCount() {
        return this.stepsCount;
    }

    public final int hashCode() {
        int iE2 = com.avito.android.actions_sheet.a.e(this.deeplink, this.id.hashCode() * 31, 31);
        String str = this.agentLabel;
        int iHashCode = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.bankIcons;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.currentStepIndex;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.description;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.stepDescription;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.stepName;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.stepsCount;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        ApplicationStyle applicationStyle = this.style;
        return iHashCode7 + (applicationStyle != null ? applicationStyle.hashCode() : 0);
    }

    @l
    /* renamed from: i, reason: from getter */
    public final ApplicationStyle getStyle() {
        return this.style;
    }

    @k
    public final String toString() {
        return "ApplicationsItemModel(id=" + this.id + ", deeplink=" + this.deeplink + ", agentLabel=" + this.agentLabel + ", bankIcons=" + this.bankIcons + ", currentStepIndex=" + this.currentStepIndex + ", description=" + this.description + ", stepDescription=" + this.stepDescription + ", stepName=" + this.stepName + ", stepsCount=" + this.stepsCount + ", style=" + this.style + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.id);
        parcel.writeParcelable(this.deeplink, i12);
        parcel.writeString(this.agentLabel);
        parcel.writeStringList(this.bankIcons);
        Integer num = this.currentStepIndex;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeString(this.description);
        parcel.writeString(this.stepDescription);
        parcel.writeString(this.stepName);
        Integer num2 = this.stepsCount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num2);
        }
        ApplicationStyle applicationStyle = this.style;
        if (applicationStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(applicationStyle.name());
        }
    }
}
