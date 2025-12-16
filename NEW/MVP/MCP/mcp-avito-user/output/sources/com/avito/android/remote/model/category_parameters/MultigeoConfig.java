package com.avito.android.remote.model.category_parameters;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MultigeoConfig.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B£\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0015J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0015J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0015J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0015J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0015J\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0015J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0015J\u0012\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\"\u0010\u001bJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u0015J¬\u0001\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u0015J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020\u00042\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020'HÖ\u0001¢\u0006\u0004\b.\u0010)J \u00103\u001a\u0002022\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020'HÖ\u0001¢\u0006\u0004\b3\u00104R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b8\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b9\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b:\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010;\u001a\u0004\b<\u0010\u001bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b=\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b>\u0010\u0015R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00105\u001a\u0004\b?\u0010\u0015R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00105\u001a\u0004\b@\u0010\u0015R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00105\u001a\u0004\bA\u0010\u0015R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00105\u001a\u0004\bB\u0010\u0015R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010;\u001a\u0004\bC\u0010\u001bR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00105\u001a\u0004\bD\u0010\u0015¨\u0006E"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/MultigeoConfig;", "Landroid/os/Parcelable;", "", "notificationBadgeTitle", "", "hideTitle", "subtitle", "listTitle", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "buttonTitle", "showAllTitle", "widgetLimit", "maxLimit", "showAsMultiAddressRegexp", "flowType", ConstraintKt.WARNING, "errorText", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Boolean;", "component3", "component4", "component5", "()Lcom/avito/android/remote/model/text/AttributedText;", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;)Lcom/avito/android/remote/model/category_parameters/MultigeoConfig;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getNotificationBadgeTitle", "Ljava/lang/Boolean;", "getHideTitle", "getSubtitle", "getListTitle", "Lcom/avito/android/remote/model/text/AttributedText;", "getDescription", "getButtonTitle", "getShowAllTitle", "getWidgetLimit", "getMaxLimit", "getShowAsMultiAddressRegexp", "getFlowType", "getWarning", "getErrorText", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class MultigeoConfig implements Parcelable {

    @k
    public static final Parcelable.Creator<MultigeoConfig> CREATOR = new Creator();

    @c("buttonTitle")
    @l
    private final String buttonTitle;

    @c("description")
    @l
    private final AttributedText description;

    @c("errorText")
    @l
    private final String errorText;

    @c("flowType")
    @l
    private final String flowType;

    @c("hideTitle")
    @l
    private final Boolean hideTitle;

    @c("listTitle")
    @l
    private final String listTitle;

    @c("maxLimit")
    @l
    private final String maxLimit;

    @c("notificationBadgeTitle")
    @l
    private final String notificationBadgeTitle;

    @c("showAllTitle")
    @l
    private final String showAllTitle;

    @c("showAsMultiAddressRegexp")
    @l
    private final String showAsMultiAddressRegexp;

    @c("subtitle")
    @l
    private final String subtitle;

    @c(ConstraintKt.WARNING)
    @l
    private final AttributedText warning;

    @c("widgetLimit")
    @l
    private final String widgetLimit;

    /* compiled from: MultigeoConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MultigeoConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final MultigeoConfig createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MultigeoConfig(string, boolValueOf, parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(MultigeoConfig.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(MultigeoConfig.class.getClassLoader()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final MultigeoConfig[] newArray(int i12) {
            return new MultigeoConfig[i12];
        }
    }

    public MultigeoConfig() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getNotificationBadgeTitle() {
        return this.notificationBadgeTitle;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final String getShowAsMultiAddressRegexp() {
        return this.showAsMultiAddressRegexp;
    }

    @l
    /* renamed from: component11, reason: from getter */
    public final String getFlowType() {
        return this.flowType;
    }

    @l
    /* renamed from: component12, reason: from getter */
    public final AttributedText getWarning() {
        return this.warning;
    }

    @l
    /* renamed from: component13, reason: from getter */
    public final String getErrorText() {
        return this.errorText;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Boolean getHideTitle() {
        return this.hideTitle;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getListTitle() {
        return this.listTitle;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final String getShowAllTitle() {
        return this.showAllTitle;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final String getWidgetLimit() {
        return this.widgetLimit;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final String getMaxLimit() {
        return this.maxLimit;
    }

    @k
    public final MultigeoConfig copy(@l String notificationBadgeTitle, @l Boolean hideTitle, @l String subtitle, @l String listTitle, @l AttributedText description, @l String buttonTitle, @l String showAllTitle, @l String widgetLimit, @l String maxLimit, @l String showAsMultiAddressRegexp, @l String flowType, @l AttributedText warning, @l String errorText) {
        return new MultigeoConfig(notificationBadgeTitle, hideTitle, subtitle, listTitle, description, buttonTitle, showAllTitle, widgetLimit, maxLimit, showAsMultiAddressRegexp, flowType, warning, errorText);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultigeoConfig)) {
            return false;
        }
        MultigeoConfig multigeoConfig = (MultigeoConfig) other;
        return L.f(this.notificationBadgeTitle, multigeoConfig.notificationBadgeTitle) && L.f(this.hideTitle, multigeoConfig.hideTitle) && L.f(this.subtitle, multigeoConfig.subtitle) && L.f(this.listTitle, multigeoConfig.listTitle) && L.f(this.description, multigeoConfig.description) && L.f(this.buttonTitle, multigeoConfig.buttonTitle) && L.f(this.showAllTitle, multigeoConfig.showAllTitle) && L.f(this.widgetLimit, multigeoConfig.widgetLimit) && L.f(this.maxLimit, multigeoConfig.maxLimit) && L.f(this.showAsMultiAddressRegexp, multigeoConfig.showAsMultiAddressRegexp) && L.f(this.flowType, multigeoConfig.flowType) && L.f(this.warning, multigeoConfig.warning) && L.f(this.errorText, multigeoConfig.errorText);
    }

    @l
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    @l
    public final AttributedText getDescription() {
        return this.description;
    }

    @l
    public final String getErrorText() {
        return this.errorText;
    }

    @l
    public final String getFlowType() {
        return this.flowType;
    }

    @l
    public final Boolean getHideTitle() {
        return this.hideTitle;
    }

    @l
    public final String getListTitle() {
        return this.listTitle;
    }

    @l
    public final String getMaxLimit() {
        return this.maxLimit;
    }

    @l
    public final String getNotificationBadgeTitle() {
        return this.notificationBadgeTitle;
    }

    @l
    public final String getShowAllTitle() {
        return this.showAllTitle;
    }

    @l
    public final String getShowAsMultiAddressRegexp() {
        return this.showAsMultiAddressRegexp;
    }

    @l
    public final String getSubtitle() {
        return this.subtitle;
    }

    @l
    public final AttributedText getWarning() {
        return this.warning;
    }

    @l
    public final String getWidgetLimit() {
        return this.widgetLimit;
    }

    public int hashCode() {
        String str = this.notificationBadgeTitle;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.hideTitle;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.subtitle;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.listTitle;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        AttributedText attributedText = this.description;
        int iHashCode5 = (iHashCode4 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        String str4 = this.buttonTitle;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.showAllTitle;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.widgetLimit;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.maxLimit;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.showAsMultiAddressRegexp;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.flowType;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        AttributedText attributedText2 = this.warning;
        int iHashCode12 = (iHashCode11 + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        String str10 = this.errorText;
        return iHashCode12 + (str10 != null ? str10.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("MultigeoConfig(notificationBadgeTitle=");
        sb2.append(this.notificationBadgeTitle);
        sb2.append(", hideTitle=");
        sb2.append(this.hideTitle);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", listTitle=");
        sb2.append(this.listTitle);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", buttonTitle=");
        sb2.append(this.buttonTitle);
        sb2.append(", showAllTitle=");
        sb2.append(this.showAllTitle);
        sb2.append(", widgetLimit=");
        sb2.append(this.widgetLimit);
        sb2.append(", maxLimit=");
        sb2.append(this.maxLimit);
        sb2.append(", showAsMultiAddressRegexp=");
        sb2.append(this.showAsMultiAddressRegexp);
        sb2.append(", flowType=");
        sb2.append(this.flowType);
        sb2.append(", warning=");
        sb2.append(this.warning);
        sb2.append(", errorText=");
        return C22026a.c(sb2, this.errorText, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.notificationBadgeTitle);
        Boolean bool = this.hideTitle;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeString(this.subtitle);
        parcel.writeString(this.listTitle);
        parcel.writeParcelable(this.description, flags);
        parcel.writeString(this.buttonTitle);
        parcel.writeString(this.showAllTitle);
        parcel.writeString(this.widgetLimit);
        parcel.writeString(this.maxLimit);
        parcel.writeString(this.showAsMultiAddressRegexp);
        parcel.writeString(this.flowType);
        parcel.writeParcelable(this.warning, flags);
        parcel.writeString(this.errorText);
    }

    public MultigeoConfig(@l String str, @l Boolean bool, @l String str2, @l String str3, @l AttributedText attributedText, @l String str4, @l String str5, @l String str6, @l String str7, @l String str8, @l String str9, @l AttributedText attributedText2, @l String str10) {
        this.notificationBadgeTitle = str;
        this.hideTitle = bool;
        this.subtitle = str2;
        this.listTitle = str3;
        this.description = attributedText;
        this.buttonTitle = str4;
        this.showAllTitle = str5;
        this.widgetLimit = str6;
        this.maxLimit = str7;
        this.showAsMultiAddressRegexp = str8;
        this.flowType = str9;
        this.warning = attributedText2;
        this.errorText = str10;
    }

    public /* synthetic */ MultigeoConfig(String str, Boolean bool, String str2, String str3, AttributedText attributedText, String str4, String str5, String str6, String str7, String str8, String str9, AttributedText attributedText2, String str10, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : bool, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? null : str3, (i12 & 16) != 0 ? null : attributedText, (i12 & 32) != 0 ? null : str4, (i12 & 64) != 0 ? null : str5, (i12 & 128) != 0 ? null : str6, (i12 & 256) != 0 ? null : str7, (i12 & 512) != 0 ? null : str8, (i12 & 1024) != 0 ? null : str9, (i12 & 2048) != 0 ? null : attributedText2, (i12 & 4096) == 0 ? str10 : null);
    }
}
