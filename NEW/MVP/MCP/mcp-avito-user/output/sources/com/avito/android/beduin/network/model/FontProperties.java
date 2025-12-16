package com.avito.android.beduin.network.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FontProperties.kt */
@d
@Keep
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J@\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u0011R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010\u0013¨\u0006."}, d2 = {"Lcom/avito/android/beduin/network/model/FontProperties;", "Landroid/os/Parcelable;", "", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "", "size", "Lcom/avito/android/beduin/network/model/LineHeightProperties;", "lineHeight", "Lcom/avito/android/remote/model/UniversalColor;", "color", "<init>", "(Ljava/lang/String;Ljava/lang/Float;Lcom/avito/android/beduin/network/model/LineHeightProperties;Lcom/avito/android/remote/model/UniversalColor;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Float;", "component3", "()Lcom/avito/android/beduin/network/model/LineHeightProperties;", "component4", "()Lcom/avito/android/remote/model/UniversalColor;", "copy", "(Ljava/lang/String;Ljava/lang/Float;Lcom/avito/android/beduin/network/model/LineHeightProperties;Lcom/avito/android/remote/model/UniversalColor;)Lcom/avito/android/beduin/network/model/FontProperties;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getStyle", "Ljava/lang/Float;", "getSize", "Lcom/avito/android/beduin/network/model/LineHeightProperties;", "getLineHeight", "Lcom/avito/android/remote/model/UniversalColor;", "getColor", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class FontProperties implements Parcelable {

    @k
    public static final Parcelable.Creator<FontProperties> CREATOR = new a();

    @l
    private final UniversalColor color;

    @l
    private final LineHeightProperties lineHeight;

    @l
    private final Float size;

    @l
    private final String style;

    /* compiled from: FontProperties.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FontProperties> {
        @Override // android.os.Parcelable.Creator
        public final FontProperties createFromParcel(Parcel parcel) {
            return new FontProperties(parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? LineHeightProperties.CREATOR.createFromParcel(parcel) : null, (UniversalColor) parcel.readParcelable(FontProperties.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final FontProperties[] newArray(int i12) {
            return new FontProperties[i12];
        }
    }

    public FontProperties(@l String str, @l Float f12, @l LineHeightProperties lineHeightProperties, @l UniversalColor universalColor) {
        this.style = str;
        this.size = f12;
        this.lineHeight = lineHeightProperties;
        this.color = universalColor;
    }

    public static /* synthetic */ FontProperties copy$default(FontProperties fontProperties, String str, Float f12, LineHeightProperties lineHeightProperties, UniversalColor universalColor, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = fontProperties.style;
        }
        if ((i12 & 2) != 0) {
            f12 = fontProperties.size;
        }
        if ((i12 & 4) != 0) {
            lineHeightProperties = fontProperties.lineHeight;
        }
        if ((i12 & 8) != 0) {
            universalColor = fontProperties.color;
        }
        return fontProperties.copy(str, f12, lineHeightProperties, universalColor);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Float getSize() {
        return this.size;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final LineHeightProperties getLineHeight() {
        return this.lineHeight;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final UniversalColor getColor() {
        return this.color;
    }

    @k
    public final FontProperties copy(@l String style, @l Float size, @l LineHeightProperties lineHeight, @l UniversalColor color) {
        return new FontProperties(style, size, lineHeight, color);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FontProperties)) {
            return false;
        }
        FontProperties fontProperties = (FontProperties) other;
        return L.f(this.style, fontProperties.style) && L.f(this.size, fontProperties.size) && L.f(this.lineHeight, fontProperties.lineHeight) && L.f(this.color, fontProperties.color);
    }

    @l
    public final UniversalColor getColor() {
        return this.color;
    }

    @l
    public final LineHeightProperties getLineHeight() {
        return this.lineHeight;
    }

    @l
    public final Float getSize() {
        return this.size;
    }

    @l
    public final String getStyle() {
        return this.style;
    }

    public int hashCode() {
        String str = this.style;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Float f12 = this.size;
        int iHashCode2 = (iHashCode + (f12 == null ? 0 : f12.hashCode())) * 31;
        LineHeightProperties lineHeightProperties = this.lineHeight;
        int iHashCode3 = (iHashCode2 + (lineHeightProperties == null ? 0 : lineHeightProperties.hashCode())) * 31;
        UniversalColor universalColor = this.color;
        return iHashCode3 + (universalColor != null ? universalColor.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("FontProperties(style=");
        sb2.append(this.style);
        sb2.append(", size=");
        sb2.append(this.size);
        sb2.append(", lineHeight=");
        sb2.append(this.lineHeight);
        sb2.append(", color=");
        return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.color, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.style);
        Float f12 = this.size;
        if (f12 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.B(parcel, 1, f12);
        }
        LineHeightProperties lineHeightProperties = this.lineHeight;
        if (lineHeightProperties == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            lineHeightProperties.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.color, flags);
    }
}
