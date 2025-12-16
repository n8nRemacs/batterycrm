package com.avito.android.beduin.common.component.real_estate_filter;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinRealEstateFilterModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b$\u0010\f¨\u0006%"}, d2 = {"Lcom/avito/android/beduin/common/component/real_estate_filter/TitleStyle;", "Landroid/os/Parcelable;", "", "prefix", "Lcom/avito/android/remote/model/UniversalColor;", "locationTextColor", "iconTintColor", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/UniversalColor;", "component3", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;)Lcom/avito/android/beduin/common/component/real_estate_filter/TitleStyle;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getPrefix", "Lcom/avito/android/remote/model/UniversalColor;", "getLocationTextColor", "getIconTintColor", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TitleStyle implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<TitleStyle> CREATOR = new a();

    @Y61.k
    private final UniversalColor iconTintColor;

    @Y61.k
    private final UniversalColor locationTextColor;

    @Y61.k
    private final String prefix;

    /* compiled from: BeduinRealEstateFilterModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TitleStyle> {
        @Override // android.os.Parcelable.Creator
        public final TitleStyle createFromParcel(Parcel parcel) {
            return new TitleStyle(parcel.readString(), (UniversalColor) parcel.readParcelable(TitleStyle.class.getClassLoader()), (UniversalColor) parcel.readParcelable(TitleStyle.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final TitleStyle[] newArray(int i12) {
            return new TitleStyle[i12];
        }
    }

    public TitleStyle(@Y61.k String str, @Y61.k UniversalColor universalColor, @Y61.k UniversalColor universalColor2) {
        this.prefix = str;
        this.locationTextColor = universalColor;
        this.iconTintColor = universalColor2;
    }

    public static /* synthetic */ TitleStyle copy$default(TitleStyle titleStyle, String str, UniversalColor universalColor, UniversalColor universalColor2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = titleStyle.prefix;
        }
        if ((i12 & 2) != 0) {
            universalColor = titleStyle.locationTextColor;
        }
        if ((i12 & 4) != 0) {
            universalColor2 = titleStyle.iconTintColor;
        }
        return titleStyle.copy(str, universalColor, universalColor2);
    }

    @Y61.k
    /* renamed from: component1, reason: from getter */
    public final String getPrefix() {
        return this.prefix;
    }

    @Y61.k
    /* renamed from: component2, reason: from getter */
    public final UniversalColor getLocationTextColor() {
        return this.locationTextColor;
    }

    @Y61.k
    /* renamed from: component3, reason: from getter */
    public final UniversalColor getIconTintColor() {
        return this.iconTintColor;
    }

    @Y61.k
    public final TitleStyle copy(@Y61.k String prefix, @Y61.k UniversalColor locationTextColor, @Y61.k UniversalColor iconTintColor) {
        return new TitleStyle(prefix, locationTextColor, iconTintColor);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TitleStyle)) {
            return false;
        }
        TitleStyle titleStyle = (TitleStyle) other;
        return L.f(this.prefix, titleStyle.prefix) && L.f(this.locationTextColor, titleStyle.locationTextColor) && L.f(this.iconTintColor, titleStyle.iconTintColor);
    }

    @Y61.k
    public final UniversalColor getIconTintColor() {
        return this.iconTintColor;
    }

    @Y61.k
    public final UniversalColor getLocationTextColor() {
        return this.locationTextColor;
    }

    @Y61.k
    public final String getPrefix() {
        return this.prefix;
    }

    public int hashCode() {
        return this.iconTintColor.hashCode() + com.avito.android.actions_sheet.a.i(this.locationTextColor, this.prefix.hashCode() * 31, 31);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("TitleStyle(prefix=");
        sb2.append(this.prefix);
        sb2.append(", locationTextColor=");
        sb2.append(this.locationTextColor);
        sb2.append(", iconTintColor=");
        return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.iconTintColor, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeString(this.prefix);
        parcel.writeParcelable(this.locationTextColor, flags);
        parcel.writeParcelable(this.iconTintColor, flags);
    }
}
