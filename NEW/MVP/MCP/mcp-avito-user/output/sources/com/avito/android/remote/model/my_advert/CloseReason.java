package com.avito.android.remote.model.my_advert;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CloseReason.kt */
@d
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0012J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0015J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0012J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJx\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0012J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020\u00052\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020!HÖ\u0001¢\u0006\u0004\b(\u0010#J \u0010-\u001a\u00020,2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020!HÖ\u0001¢\u0006\u0004\b-\u0010.R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b1\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b3\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b4\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b6\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b7\u0010\u0012R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b8\u0010\u0015R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b9\u0010\u0012R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010:\u001a\u0004\b;\u0010\u001d¨\u0006<"}, d2 = {"Lcom/avito/android/remote/model/my_advert/CloseReason;", "Landroid/os/Parcelable;", "", "id", "title", "", "showAppRater", "showInput", "Lcom/avito/android/remote/model/text/AttributedText;", "motivationText", "currentPrice", "shouldUpdateIncome", "uxFeedbackEventName", "Lcom/avito/android/deep_linking/links/DeepLink;", "deliveryRestriction", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Boolean;", "component4", "component5", "()Lcom/avito/android/remote/model/text/AttributedText;", "component6", "component7", "component8", "component9", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/my_advert/CloseReason;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTitle", "Ljava/lang/Boolean;", "getShowAppRater", "getShowInput", "Lcom/avito/android/remote/model/text/AttributedText;", "getMotivationText", "getCurrentPrice", "getShouldUpdateIncome", "getUxFeedbackEventName", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeliveryRestriction", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class CloseReason implements Parcelable {

    @k
    public static final Parcelable.Creator<CloseReason> CREATOR = new Creator();

    @c("currentPrice")
    @l
    private final String currentPrice;

    @c("deliveryRestriction")
    @l
    private final DeepLink deliveryRestriction;

    @c("id")
    @k
    private final String id;

    @c("motivationText")
    @l
    private final AttributedText motivationText;

    @c("shouldUpdateIncome")
    @l
    private final Boolean shouldUpdateIncome;

    @c("showAppRater")
    @l
    private final Boolean showAppRater;

    @c("showInput")
    @l
    private final Boolean showInput;

    @c("title")
    @k
    private final String title;

    @c("uxFeedbackEventName")
    @l
    private final String uxFeedbackEventName;

    /* compiled from: CloseReason.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CloseReason> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CloseReason createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            AttributedText attributedText = (AttributedText) parcel.readParcelable(CloseReason.class.getClassLoader());
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new CloseReason(string, string2, boolValueOf, boolValueOf2, attributedText, string3, boolValueOf3, parcel.readString(), (DeepLink) parcel.readParcelable(CloseReason.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CloseReason[] newArray(int i12) {
            return new CloseReason[i12];
        }
    }

    public CloseReason(@k String str, @k String str2, @l Boolean bool, @l Boolean bool2, @l AttributedText attributedText, @l String str3, @l Boolean bool3, @l String str4, @l DeepLink deepLink) {
        this.id = str;
        this.title = str2;
        this.showAppRater = bool;
        this.showInput = bool2;
        this.motivationText = attributedText;
        this.currentPrice = str3;
        this.shouldUpdateIncome = bool3;
        this.uxFeedbackEventName = str4;
        this.deliveryRestriction = deepLink;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Boolean getShowAppRater() {
        return this.showAppRater;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Boolean getShowInput() {
        return this.showInput;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final AttributedText getMotivationText() {
        return this.motivationText;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final String getCurrentPrice() {
        return this.currentPrice;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final Boolean getShouldUpdateIncome() {
        return this.shouldUpdateIncome;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final String getUxFeedbackEventName() {
        return this.uxFeedbackEventName;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final DeepLink getDeliveryRestriction() {
        return this.deliveryRestriction;
    }

    @k
    public final CloseReason copy(@k String id2, @k String title, @l Boolean showAppRater, @l Boolean showInput, @l AttributedText motivationText, @l String currentPrice, @l Boolean shouldUpdateIncome, @l String uxFeedbackEventName, @l DeepLink deliveryRestriction) {
        return new CloseReason(id2, title, showAppRater, showInput, motivationText, currentPrice, shouldUpdateIncome, uxFeedbackEventName, deliveryRestriction);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CloseReason)) {
            return false;
        }
        CloseReason closeReason = (CloseReason) other;
        return L.f(this.id, closeReason.id) && L.f(this.title, closeReason.title) && L.f(this.showAppRater, closeReason.showAppRater) && L.f(this.showInput, closeReason.showInput) && L.f(this.motivationText, closeReason.motivationText) && L.f(this.currentPrice, closeReason.currentPrice) && L.f(this.shouldUpdateIncome, closeReason.shouldUpdateIncome) && L.f(this.uxFeedbackEventName, closeReason.uxFeedbackEventName) && L.f(this.deliveryRestriction, closeReason.deliveryRestriction);
    }

    @l
    public final String getCurrentPrice() {
        return this.currentPrice;
    }

    @l
    public final DeepLink getDeliveryRestriction() {
        return this.deliveryRestriction;
    }

    @k
    public final String getId() {
        return this.id;
    }

    @l
    public final AttributedText getMotivationText() {
        return this.motivationText;
    }

    @l
    public final Boolean getShouldUpdateIncome() {
        return this.shouldUpdateIncome;
    }

    @l
    public final Boolean getShowAppRater() {
        return this.showAppRater;
    }

    @l
    public final Boolean getShowInput() {
        return this.showInput;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @l
    public final String getUxFeedbackEventName() {
        return this.uxFeedbackEventName;
    }

    public int hashCode() {
        int iD2 = H.d(this.id.hashCode() * 31, 31, this.title);
        Boolean bool = this.showAppRater;
        int iHashCode = (iD2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.showInput;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        AttributedText attributedText = this.motivationText;
        int iHashCode3 = (iHashCode2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        String str = this.currentPrice;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool3 = this.shouldUpdateIncome;
        int iHashCode5 = (iHashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str2 = this.uxFeedbackEventName;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        DeepLink deepLink = this.deliveryRestriction;
        return iHashCode6 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CloseReason(id=");
        sb2.append(this.id);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", showAppRater=");
        sb2.append(this.showAppRater);
        sb2.append(", showInput=");
        sb2.append(this.showInput);
        sb2.append(", motivationText=");
        sb2.append(this.motivationText);
        sb2.append(", currentPrice=");
        sb2.append(this.currentPrice);
        sb2.append(", shouldUpdateIncome=");
        sb2.append(this.shouldUpdateIncome);
        sb2.append(", uxFeedbackEventName=");
        sb2.append(this.uxFeedbackEventName);
        sb2.append(", deliveryRestriction=");
        return a.v(sb2, this.deliveryRestriction, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        Boolean bool = this.showAppRater;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Boolean bool2 = this.showInput;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        parcel.writeParcelable(this.motivationText, flags);
        parcel.writeString(this.currentPrice);
        Boolean bool3 = this.shouldUpdateIncome;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool3);
        }
        parcel.writeString(this.uxFeedbackEventName);
        parcel.writeParcelable(this.deliveryRestriction, flags);
    }

    public /* synthetic */ CloseReason(String str, String str2, Boolean bool, Boolean bool2, AttributedText attributedText, String str3, Boolean bool3, String str4, DeepLink deepLink, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? null : bool, (i12 & 8) != 0 ? null : bool2, (i12 & 16) != 0 ? null : attributedText, (i12 & 32) != 0 ? null : str3, (i12 & 64) != 0 ? null : bool3, (i12 & 128) != 0 ? null : str4, (i12 & 256) != 0 ? null : deepLink);
    }
}
