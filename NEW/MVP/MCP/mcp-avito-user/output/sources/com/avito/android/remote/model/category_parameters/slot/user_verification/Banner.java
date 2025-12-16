package com.avito.android.remote.model.category_parameters.slot.user_verification;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: UserVerificationSlotConfig.kt */
@d
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0012J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0012Jd\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0012J\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b#\u0010\u001dJ \u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b(\u0010)R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b/\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b1\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b2\u0010\u0012R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b3\u0010\u0012¨\u00064"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/user_verification/Banner;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "text", "", "iconName", "iconColor", "Lcom/avito/android/remote/model/UniversalColor;", "backgroundColor", "redesignTitle", "redesignDescription", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/avito/android/remote/model/text/AttributedText;", "component2", "component3", "()Ljava/lang/String;", "component4", "component5", "()Lcom/avito/android/remote/model/UniversalColor;", "component6", "component7", "copy", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/category_parameters/slot/user_verification/Banner;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "getText", "Ljava/lang/String;", "getIconName", "getIconColor", "Lcom/avito/android/remote/model/UniversalColor;", "getBackgroundColor", "getRedesignTitle", "getRedesignDescription", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class Banner implements Parcelable {

    @k
    public static final Parcelable.Creator<Banner> CREATOR = new Creator();

    @c("backgroundColor")
    @l
    private final UniversalColor backgroundColor;

    @c("iconColor")
    @l
    private final String iconColor;

    @c("iconName")
    @l
    private final String iconName;

    @c("redesignDescription")
    @l
    private final String redesignDescription;

    @c("redesignTitle")
    @l
    private final String redesignTitle;

    @c("text")
    @l
    private final AttributedText text;

    @c("title")
    @l
    private final AttributedText title;

    /* compiled from: UserVerificationSlotConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Banner> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Banner createFromParcel(@k Parcel parcel) {
            return new Banner((AttributedText) parcel.readParcelable(Banner.class.getClassLoader()), (AttributedText) parcel.readParcelable(Banner.class.getClassLoader()), parcel.readString(), parcel.readString(), (UniversalColor) parcel.readParcelable(Banner.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Banner[] newArray(int i12) {
            return new Banner[i12];
        }
    }

    public Banner(@l AttributedText attributedText, @l AttributedText attributedText2, @l String str, @l String str2, @l UniversalColor universalColor, @l String str3, @l String str4) {
        this.title = attributedText;
        this.text = attributedText2;
        this.iconName = str;
        this.iconColor = str2;
        this.backgroundColor = universalColor;
        this.redesignTitle = str3;
        this.redesignDescription = str4;
    }

    public static /* synthetic */ Banner copy$default(Banner banner, AttributedText attributedText, AttributedText attributedText2, String str, String str2, UniversalColor universalColor, String str3, String str4, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            attributedText = banner.title;
        }
        if ((i12 & 2) != 0) {
            attributedText2 = banner.text;
        }
        AttributedText attributedText3 = attributedText2;
        if ((i12 & 4) != 0) {
            str = banner.iconName;
        }
        String str5 = str;
        if ((i12 & 8) != 0) {
            str2 = banner.iconColor;
        }
        String str6 = str2;
        if ((i12 & 16) != 0) {
            universalColor = banner.backgroundColor;
        }
        UniversalColor universalColor2 = universalColor;
        if ((i12 & 32) != 0) {
            str3 = banner.redesignTitle;
        }
        String str7 = str3;
        if ((i12 & 64) != 0) {
            str4 = banner.redesignDescription;
        }
        return banner.copy(attributedText, attributedText3, str5, str6, universalColor2, str7, str4);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final AttributedText getText() {
        return this.text;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getIconName() {
        return this.iconName;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getIconColor() {
        return this.iconColor;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final UniversalColor getBackgroundColor() {
        return this.backgroundColor;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final String getRedesignTitle() {
        return this.redesignTitle;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final String getRedesignDescription() {
        return this.redesignDescription;
    }

    @k
    public final Banner copy(@l AttributedText title, @l AttributedText text, @l String iconName, @l String iconColor, @l UniversalColor backgroundColor, @l String redesignTitle, @l String redesignDescription) {
        return new Banner(title, text, iconName, iconColor, backgroundColor, redesignTitle, redesignDescription);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Banner)) {
            return false;
        }
        Banner banner = (Banner) other;
        return L.f(this.title, banner.title) && L.f(this.text, banner.text) && L.f(this.iconName, banner.iconName) && L.f(this.iconColor, banner.iconColor) && L.f(this.backgroundColor, banner.backgroundColor) && L.f(this.redesignTitle, banner.redesignTitle) && L.f(this.redesignDescription, banner.redesignDescription);
    }

    @l
    public final UniversalColor getBackgroundColor() {
        return this.backgroundColor;
    }

    @l
    public final String getIconColor() {
        return this.iconColor;
    }

    @l
    public final String getIconName() {
        return this.iconName;
    }

    @l
    public final String getRedesignDescription() {
        return this.redesignDescription;
    }

    @l
    public final String getRedesignTitle() {
        return this.redesignTitle;
    }

    @l
    public final AttributedText getText() {
        return this.text;
    }

    @l
    public final AttributedText getTitle() {
        return this.title;
    }

    public int hashCode() {
        AttributedText attributedText = this.title;
        int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
        AttributedText attributedText2 = this.text;
        int iHashCode2 = (iHashCode + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        String str = this.iconName;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.iconColor;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        UniversalColor universalColor = this.backgroundColor;
        int iHashCode5 = (iHashCode4 + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
        String str3 = this.redesignTitle;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.redesignDescription;
        return iHashCode6 + (str4 != null ? str4.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Banner(title=");
        sb2.append(this.title);
        sb2.append(", text=");
        sb2.append(this.text);
        sb2.append(", iconName=");
        sb2.append(this.iconName);
        sb2.append(", iconColor=");
        sb2.append(this.iconColor);
        sb2.append(", backgroundColor=");
        sb2.append(this.backgroundColor);
        sb2.append(", redesignTitle=");
        sb2.append(this.redesignTitle);
        sb2.append(", redesignDescription=");
        return C22026a.c(sb2, this.redesignDescription, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.title, flags);
        parcel.writeParcelable(this.text, flags);
        parcel.writeString(this.iconName);
        parcel.writeString(this.iconColor);
        parcel.writeParcelable(this.backgroundColor, flags);
        parcel.writeString(this.redesignTitle);
        parcel.writeString(this.redesignDescription);
    }

    public /* synthetic */ Banner(AttributedText attributedText, AttributedText attributedText2, String str, String str2, UniversalColor universalColor, String str3, String str4, int i12, C42822w c42822w) {
        this(attributedText, attributedText2, str, str2, universalColor, (i12 & 32) != 0 ? null : str3, (i12 & 64) != 0 ? null : str4);
    }
}
