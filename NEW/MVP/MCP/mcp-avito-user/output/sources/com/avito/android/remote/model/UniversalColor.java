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

/* compiled from: UniversalColor.kt */
@d
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ4\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b$\u0010\f¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/UniversalColor;", "Landroid/os/Parcelable;", "", "colorKey", "Lcom/avito/android/remote/model/Color;", "colorDark", "color", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/Color;Lcom/avito/android/remote/model/Color;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/Color;", "component3", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/Color;Lcom/avito/android/remote/model/Color;)Lcom/avito/android/remote/model/UniversalColor;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getColorKey", "Lcom/avito/android/remote/model/Color;", "getColorDark", "getColor", "_common_network-design_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class UniversalColor implements Parcelable {

    @k
    public static final Parcelable.Creator<UniversalColor> CREATOR = new Creator();

    @c("value")
    @l
    private final Color color;

    @c("valueDark")
    @l
    private final Color colorDark;

    @c("valueName")
    @l
    private final String colorKey;

    /* compiled from: UniversalColor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UniversalColor> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final UniversalColor createFromParcel(@k Parcel parcel) {
            return new UniversalColor(parcel.readString(), parcel.readInt() == 0 ? null : Color.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Color.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final UniversalColor[] newArray(int i12) {
            return new UniversalColor[i12];
        }
    }

    public UniversalColor(@l String str, @l Color color, @l Color color2) {
        this.colorKey = str;
        this.colorDark = color;
        this.color = color2;
    }

    public static /* synthetic */ UniversalColor copy$default(UniversalColor universalColor, String str, Color color, Color color2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = universalColor.colorKey;
        }
        if ((i12 & 2) != 0) {
            color = universalColor.colorDark;
        }
        if ((i12 & 4) != 0) {
            color2 = universalColor.color;
        }
        return universalColor.copy(str, color, color2);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getColorKey() {
        return this.colorKey;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Color getColorDark() {
        return this.colorDark;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Color getColor() {
        return this.color;
    }

    @k
    public final UniversalColor copy(@l String colorKey, @l Color colorDark, @l Color color) {
        return new UniversalColor(colorKey, colorDark, color);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UniversalColor)) {
            return false;
        }
        UniversalColor universalColor = (UniversalColor) other;
        return L.f(this.colorKey, universalColor.colorKey) && L.f(this.colorDark, universalColor.colorDark) && L.f(this.color, universalColor.color);
    }

    @l
    public final Color getColor() {
        return this.color;
    }

    @l
    public final Color getColorDark() {
        return this.colorDark;
    }

    @l
    public final String getColorKey() {
        return this.colorKey;
    }

    public int hashCode() {
        String str = this.colorKey;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Color color = this.colorDark;
        int iHashCode2 = (iHashCode + (color == null ? 0 : color.hashCode())) * 31;
        Color color2 = this.color;
        return iHashCode2 + (color2 != null ? color2.hashCode() : 0);
    }

    @k
    public String toString() {
        return "UniversalColor(colorKey=" + this.colorKey + ", colorDark=" + this.colorDark + ", color=" + this.color + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.colorKey);
        Color color = this.colorDark;
        if (color == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            color.writeToParcel(parcel, flags);
        }
        Color color2 = this.color;
        if (color2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            color2.writeToParcel(parcel, flags);
        }
    }
}
