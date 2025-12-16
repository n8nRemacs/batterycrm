package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CarMarketPrice.kt */
@d
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0012Jn\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0012J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020\b2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020!HÖ\u0001¢\u0006\u0004\b(\u0010#J \u0010-\u001a\u00020,2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020!HÖ\u0001¢\u0006\u0004\b-\u0010.R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b1\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b3\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b4\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b\t\u0010\u0018R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b7\u0010\u001aR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00108\u001a\u0004\b9\u0010\u001cR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010/\u001a\u0004\b:\u0010\u0012R\u0017\u0010>\u001a\u00020\n8F¢\u0006\f\u0012\u0004\b<\u0010=\u001a\u0004\b;\u0010\u001aR\u0017\u0010A\u001a\u00020\n8F¢\u0006\f\u0012\u0004\b@\u0010=\u001a\u0004\b?\u0010\u001a¨\u0006B"}, d2 = {"Lcom/avito/android/remote/model/Range;", "Landroid/os/Parcelable;", "", "title", "subtitle", "Lcom/avito/android/remote/model/RangeColor;", "titleColor", "rangeColor", "", "isAccented", "Lcom/avito/android/remote/model/UniversalColor;", "bgColor", "Lcom/avito/android/remote/model/UniversalImage;", "multiThemeImages", "accuracy", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/RangeColor;Lcom/avito/android/remote/model/RangeColor;Ljava/lang/Boolean;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalImage;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/RangeColor;", "component4", "component5", "()Ljava/lang/Boolean;", "component6", "()Lcom/avito/android/remote/model/UniversalColor;", "component7", "()Lcom/avito/android/remote/model/UniversalImage;", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/RangeColor;Lcom/avito/android/remote/model/RangeColor;Ljava/lang/Boolean;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalImage;Ljava/lang/String;)Lcom/avito/android/remote/model/Range;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getSubtitle", "Lcom/avito/android/remote/model/RangeColor;", "getTitleColor", "getRangeColor", "Ljava/lang/Boolean;", "Lcom/avito/android/remote/model/UniversalColor;", "getBgColor", "Lcom/avito/android/remote/model/UniversalImage;", "getMultiThemeImages", "getAccuracy", "getUniversalTitleColor", "getUniversalTitleColor$annotations", "()V", "universalTitleColor", "getUniversalRangeColor", "getUniversalRangeColor$annotations", "universalRangeColor", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class Range implements Parcelable {

    @k
    public static final Parcelable.Creator<Range> CREATOR = new Creator();

    @c("accuracy")
    @l
    private final String accuracy;

    @c("bgColor")
    @l
    private final UniversalColor bgColor;

    @c("isAccented")
    @l
    private final Boolean isAccented;

    @c("multiThemeImages")
    @l
    private final UniversalImage multiThemeImages;

    @c("rangeColor")
    @l
    private final RangeColor rangeColor;

    @c("subtitle")
    @l
    private final String subtitle;

    @c("title")
    @k
    private final String title;

    @c("titleColor")
    @l
    private final RangeColor titleColor;

    /* compiled from: CarMarketPrice.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Range> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Range createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            RangeColor rangeColorCreateFromParcel = parcel.readInt() == 0 ? null : RangeColor.CREATOR.createFromParcel(parcel);
            RangeColor rangeColorCreateFromParcel2 = parcel.readInt() == 0 ? null : RangeColor.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new Range(string, string2, rangeColorCreateFromParcel, rangeColorCreateFromParcel2, boolValueOf, (UniversalColor) parcel.readParcelable(Range.class.getClassLoader()), (UniversalImage) parcel.readParcelable(Range.class.getClassLoader()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Range[] newArray(int i12) {
            return new Range[i12];
        }
    }

    public Range(@k String str, @l String str2, @l RangeColor rangeColor, @l RangeColor rangeColor2, @l Boolean bool, @l UniversalColor universalColor, @l UniversalImage universalImage, @l String str3) {
        this.title = str;
        this.subtitle = str2;
        this.titleColor = rangeColor;
        this.rangeColor = rangeColor2;
        this.isAccented = bool;
        this.bgColor = universalColor;
        this.multiThemeImages = universalImage;
        this.accuracy = str3;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final RangeColor getTitleColor() {
        return this.titleColor;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final RangeColor getRangeColor() {
        return this.rangeColor;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Boolean getIsAccented() {
        return this.isAccented;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final UniversalColor getBgColor() {
        return this.bgColor;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final UniversalImage getMultiThemeImages() {
        return this.multiThemeImages;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final String getAccuracy() {
        return this.accuracy;
    }

    @k
    public final Range copy(@k String title, @l String subtitle, @l RangeColor titleColor, @l RangeColor rangeColor, @l Boolean isAccented, @l UniversalColor bgColor, @l UniversalImage multiThemeImages, @l String accuracy) {
        return new Range(title, subtitle, titleColor, rangeColor, isAccented, bgColor, multiThemeImages, accuracy);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Range)) {
            return false;
        }
        Range range = (Range) other;
        return L.f(this.title, range.title) && L.f(this.subtitle, range.subtitle) && L.f(this.titleColor, range.titleColor) && L.f(this.rangeColor, range.rangeColor) && L.f(this.isAccented, range.isAccented) && L.f(this.bgColor, range.bgColor) && L.f(this.multiThemeImages, range.multiThemeImages) && L.f(this.accuracy, range.accuracy);
    }

    @l
    public final String getAccuracy() {
        return this.accuracy;
    }

    @l
    public final UniversalColor getBgColor() {
        return this.bgColor;
    }

    @l
    public final UniversalImage getMultiThemeImages() {
        return this.multiThemeImages;
    }

    @l
    public final RangeColor getRangeColor() {
        return this.rangeColor;
    }

    @l
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @l
    public final RangeColor getTitleColor() {
        return this.titleColor;
    }

    @k
    public final UniversalColor getUniversalRangeColor() {
        RangeColor rangeColor = this.rangeColor;
        String colorKey = rangeColor != null ? rangeColor.getColorKey() : null;
        RangeColor rangeColor2 = this.rangeColor;
        Color colorDark = rangeColor2 != null ? rangeColor2.getColorDark() : null;
        RangeColor rangeColor3 = this.rangeColor;
        return UniversalColorKt.universalColorOf(colorKey, rangeColor3 != null ? rangeColor3.getColor() : null, colorDark);
    }

    @k
    public final UniversalColor getUniversalTitleColor() {
        RangeColor rangeColor = this.titleColor;
        String colorKey = rangeColor != null ? rangeColor.getColorKey() : null;
        RangeColor rangeColor2 = this.titleColor;
        Color colorDark = rangeColor2 != null ? rangeColor2.getColorDark() : null;
        RangeColor rangeColor3 = this.titleColor;
        return UniversalColorKt.universalColorOf(colorKey, rangeColor3 != null ? rangeColor3.getColor() : null, colorDark);
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        RangeColor rangeColor = this.titleColor;
        int iHashCode3 = (iHashCode2 + (rangeColor == null ? 0 : rangeColor.hashCode())) * 31;
        RangeColor rangeColor2 = this.rangeColor;
        int iHashCode4 = (iHashCode3 + (rangeColor2 == null ? 0 : rangeColor2.hashCode())) * 31;
        Boolean bool = this.isAccented;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        UniversalColor universalColor = this.bgColor;
        int iHashCode6 = (iHashCode5 + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
        UniversalImage universalImage = this.multiThemeImages;
        int iHashCode7 = (iHashCode6 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        String str2 = this.accuracy;
        return iHashCode7 + (str2 != null ? str2.hashCode() : 0);
    }

    @l
    public final Boolean isAccented() {
        return this.isAccented;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Range(title=");
        sb2.append(this.title);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", titleColor=");
        sb2.append(this.titleColor);
        sb2.append(", rangeColor=");
        sb2.append(this.rangeColor);
        sb2.append(", isAccented=");
        sb2.append(this.isAccented);
        sb2.append(", bgColor=");
        sb2.append(this.bgColor);
        sb2.append(", multiThemeImages=");
        sb2.append(this.multiThemeImages);
        sb2.append(", accuracy=");
        return C22026a.c(sb2, this.accuracy, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        RangeColor rangeColor = this.titleColor;
        if (rangeColor == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            rangeColor.writeToParcel(parcel, flags);
        }
        RangeColor rangeColor2 = this.rangeColor;
        if (rangeColor2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            rangeColor2.writeToParcel(parcel, flags);
        }
        Boolean bool = this.isAccented;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeParcelable(this.bgColor, flags);
        parcel.writeParcelable(this.multiThemeImages, flags);
        parcel.writeString(this.accuracy);
    }

    public /* synthetic */ Range(String str, String str2, RangeColor rangeColor, RangeColor rangeColor2, Boolean bool, UniversalColor universalColor, UniversalImage universalImage, String str3, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : str2, rangeColor, rangeColor2, bool, universalColor, (i12 & 64) != 0 ? null : universalImage, (i12 & 128) != 0 ? null : str3);
    }

    public static /* synthetic */ void getUniversalRangeColor$annotations() {
    }

    public static /* synthetic */ void getUniversalTitleColor$annotations() {
    }
}
