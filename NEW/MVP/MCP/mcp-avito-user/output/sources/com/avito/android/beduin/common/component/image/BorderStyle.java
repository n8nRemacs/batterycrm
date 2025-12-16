package com.avito.android.beduin.common.component.image;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinImageModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\tJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\tJ \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/beduin/common/component/image/BorderStyle;", "Landroid/os/Parcelable;", "", "width", "Lcom/avito/android/remote/model/UniversalColor;", "color", "<init>", "(ILcom/avito/android/remote/model/UniversalColor;)V", "component1", "()I", "component2", "()Lcom/avito/android/remote/model/UniversalColor;", "copy", "(ILcom/avito/android/remote/model/UniversalColor;)Lcom/avito/android/beduin/common/component/image/BorderStyle;", "", "toString", "()Ljava/lang/String;", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getWidth", "Lcom/avito/android/remote/model/UniversalColor;", "getColor", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BorderStyle implements Parcelable {

    @k
    public static final Parcelable.Creator<BorderStyle> CREATOR = new a();

    @k
    private final UniversalColor color;
    private final int width;

    /* compiled from: BeduinImageModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BorderStyle> {
        @Override // android.os.Parcelable.Creator
        public final BorderStyle createFromParcel(Parcel parcel) {
            return new BorderStyle(parcel.readInt(), (UniversalColor) parcel.readParcelable(BorderStyle.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final BorderStyle[] newArray(int i12) {
            return new BorderStyle[i12];
        }
    }

    public BorderStyle(int i12, @k UniversalColor universalColor) {
        this.width = i12;
        this.color = universalColor;
    }

    public static /* synthetic */ BorderStyle copy$default(BorderStyle borderStyle, int i12, UniversalColor universalColor, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i12 = borderStyle.width;
        }
        if ((i13 & 2) != 0) {
            universalColor = borderStyle.color;
        }
        return borderStyle.copy(i12, universalColor);
    }

    /* renamed from: component1, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final UniversalColor getColor() {
        return this.color;
    }

    @k
    public final BorderStyle copy(int width, @k UniversalColor color) {
        return new BorderStyle(width, color);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BorderStyle)) {
            return false;
        }
        BorderStyle borderStyle = (BorderStyle) other;
        return this.width == borderStyle.width && L.f(this.color, borderStyle.color);
    }

    @k
    public final UniversalColor getColor() {
        return this.color;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return this.color.hashCode() + (Integer.hashCode(this.width) * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BorderStyle(width=");
        sb2.append(this.width);
        sb2.append(", color=");
        return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.color, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeInt(this.width);
        parcel.writeParcelable(this.color, flags);
    }
}
