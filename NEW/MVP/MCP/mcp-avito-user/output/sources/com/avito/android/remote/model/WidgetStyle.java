package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PpRecallBannerType.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ4\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\r¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/WidgetStyle;", "Landroid/os/Parcelable;", "", "radialGradientStringNameAttr", "linearGradientAttr", "Lcom/avito/android/remote/model/UniversalColor;", "color", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/UniversalColor;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;)Lcom/avito/android/remote/model/WidgetStyle;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getRadialGradientStringNameAttr", "getLinearGradientAttr", "Lcom/avito/android/remote/model/UniversalColor;", "getColor", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class WidgetStyle implements Parcelable {

    @k
    public static final Parcelable.Creator<WidgetStyle> CREATOR = new Creator();

    @c("color")
    @l
    private final UniversalColor color;

    @c("linearGradientAttr")
    @l
    private final String linearGradientAttr;

    @c("radialGradientAttr")
    @l
    private final String radialGradientStringNameAttr;

    /* compiled from: PpRecallBannerType.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<WidgetStyle> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final WidgetStyle createFromParcel(@k Parcel parcel) {
            return new WidgetStyle(parcel.readString(), parcel.readString(), (UniversalColor) parcel.readParcelable(WidgetStyle.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final WidgetStyle[] newArray(int i12) {
            return new WidgetStyle[i12];
        }
    }

    public WidgetStyle(@l String str, @l String str2, @l UniversalColor universalColor) {
        this.radialGradientStringNameAttr = str;
        this.linearGradientAttr = str2;
        this.color = universalColor;
    }

    public static /* synthetic */ WidgetStyle copy$default(WidgetStyle widgetStyle, String str, String str2, UniversalColor universalColor, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = widgetStyle.radialGradientStringNameAttr;
        }
        if ((i12 & 2) != 0) {
            str2 = widgetStyle.linearGradientAttr;
        }
        if ((i12 & 4) != 0) {
            universalColor = widgetStyle.color;
        }
        return widgetStyle.copy(str, str2, universalColor);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getRadialGradientStringNameAttr() {
        return this.radialGradientStringNameAttr;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getLinearGradientAttr() {
        return this.linearGradientAttr;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final UniversalColor getColor() {
        return this.color;
    }

    @k
    public final WidgetStyle copy(@l String radialGradientStringNameAttr, @l String linearGradientAttr, @l UniversalColor color) {
        return new WidgetStyle(radialGradientStringNameAttr, linearGradientAttr, color);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WidgetStyle)) {
            return false;
        }
        WidgetStyle widgetStyle = (WidgetStyle) other;
        return L.f(this.radialGradientStringNameAttr, widgetStyle.radialGradientStringNameAttr) && L.f(this.linearGradientAttr, widgetStyle.linearGradientAttr) && L.f(this.color, widgetStyle.color);
    }

    @l
    public final UniversalColor getColor() {
        return this.color;
    }

    @l
    public final String getLinearGradientAttr() {
        return this.linearGradientAttr;
    }

    @l
    public final String getRadialGradientStringNameAttr() {
        return this.radialGradientStringNameAttr;
    }

    public int hashCode() {
        String str = this.radialGradientStringNameAttr;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.linearGradientAttr;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        UniversalColor universalColor = this.color;
        return iHashCode2 + (universalColor != null ? universalColor.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("WidgetStyle(radialGradientStringNameAttr=");
        sb2.append(this.radialGradientStringNameAttr);
        sb2.append(", linearGradientAttr=");
        sb2.append(this.linearGradientAttr);
        sb2.append(", color=");
        return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.color, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.radialGradientStringNameAttr);
        parcel.writeString(this.linearGradientAttr);
        parcel.writeParcelable(this.color, flags);
    }
}
