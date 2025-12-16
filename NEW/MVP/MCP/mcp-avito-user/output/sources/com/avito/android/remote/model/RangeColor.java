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

/* compiled from: CarMarketPrice.kt */
@d
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ0\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b$\u0010\f¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/RangeColor;", "Landroid/os/Parcelable;", "", "colorKey", "Lcom/avito/android/remote/model/Color;", "color", "colorDark", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/Color;Lcom/avito/android/remote/model/Color;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/Color;", "component3", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/Color;Lcom/avito/android/remote/model/Color;)Lcom/avito/android/remote/model/RangeColor;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getColorKey", "Lcom/avito/android/remote/model/Color;", "getColor", "getColorDark", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class RangeColor implements Parcelable {

    @k
    public static final Parcelable.Creator<RangeColor> CREATOR = new Creator();

    @c("value")
    @k
    private final Color color;

    @c("valueDark")
    @k
    private final Color colorDark;

    @c("name")
    @l
    private final String colorKey;

    /* compiled from: CarMarketPrice.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RangeColor> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RangeColor createFromParcel(@k Parcel parcel) {
            return new RangeColor(parcel.readString(), (Color) parcel.readParcelable(RangeColor.class.getClassLoader()), (Color) parcel.readParcelable(RangeColor.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RangeColor[] newArray(int i12) {
            return new RangeColor[i12];
        }
    }

    public RangeColor(@l String str, @k Color color, @k Color color2) {
        this.colorKey = str;
        this.color = color;
        this.colorDark = color2;
    }

    public static /* synthetic */ RangeColor copy$default(RangeColor rangeColor, String str, Color color, Color color2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = rangeColor.colorKey;
        }
        if ((i12 & 2) != 0) {
            color = rangeColor.color;
        }
        if ((i12 & 4) != 0) {
            color2 = rangeColor.colorDark;
        }
        return rangeColor.copy(str, color, color2);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getColorKey() {
        return this.colorKey;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final Color getColor() {
        return this.color;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final Color getColorDark() {
        return this.colorDark;
    }

    @k
    public final RangeColor copy(@l String colorKey, @k Color color, @k Color colorDark) {
        return new RangeColor(colorKey, color, colorDark);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RangeColor)) {
            return false;
        }
        RangeColor rangeColor = (RangeColor) other;
        return L.f(this.colorKey, rangeColor.colorKey) && L.f(this.color, rangeColor.color) && L.f(this.colorDark, rangeColor.colorDark);
    }

    @k
    public final Color getColor() {
        return this.color;
    }

    @k
    public final Color getColorDark() {
        return this.colorDark;
    }

    @l
    public final String getColorKey() {
        return this.colorKey;
    }

    public int hashCode() {
        String str = this.colorKey;
        return this.colorDark.hashCode() + ((this.color.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31);
    }

    @k
    public String toString() {
        return "RangeColor(colorKey=" + this.colorKey + ", color=" + this.color + ", colorDark=" + this.colorDark + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.colorKey);
        parcel.writeParcelable(this.color, flags);
        parcel.writeParcelable(this.colorDark, flags);
    }
}
