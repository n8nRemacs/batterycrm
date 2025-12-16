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
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000b¨\u0006$"}, d2 = {"Lcom/avito/android/beduin/common/component/image/OverlayStyle;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalColor;", "color", "Lcom/avito/android/beduin/common/component/image/BeduinLinearGradient;", "linearGradient", "<init>", "(Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/beduin/common/component/image/BeduinLinearGradient;)V", "component1", "()Lcom/avito/android/remote/model/UniversalColor;", "component2", "()Lcom/avito/android/beduin/common/component/image/BeduinLinearGradient;", "copy", "(Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/beduin/common/component/image/BeduinLinearGradient;)Lcom/avito/android/beduin/common/component/image/OverlayStyle;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/UniversalColor;", "getColor", "Lcom/avito/android/beduin/common/component/image/BeduinLinearGradient;", "getLinearGradient", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OverlayStyle implements Parcelable {

    @k
    public static final Parcelable.Creator<OverlayStyle> CREATOR = new a();

    @l
    private final UniversalColor color;

    @l
    private final BeduinLinearGradient linearGradient;

    /* compiled from: BeduinImageModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<OverlayStyle> {
        @Override // android.os.Parcelable.Creator
        public final OverlayStyle createFromParcel(Parcel parcel) {
            return new OverlayStyle((UniversalColor) parcel.readParcelable(OverlayStyle.class.getClassLoader()), parcel.readInt() == 0 ? null : BeduinLinearGradient.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final OverlayStyle[] newArray(int i12) {
            return new OverlayStyle[i12];
        }
    }

    public OverlayStyle(@l UniversalColor universalColor, @l BeduinLinearGradient beduinLinearGradient) {
        this.color = universalColor;
        this.linearGradient = beduinLinearGradient;
    }

    public static /* synthetic */ OverlayStyle copy$default(OverlayStyle overlayStyle, UniversalColor universalColor, BeduinLinearGradient beduinLinearGradient, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            universalColor = overlayStyle.color;
        }
        if ((i12 & 2) != 0) {
            beduinLinearGradient = overlayStyle.linearGradient;
        }
        return overlayStyle.copy(universalColor, beduinLinearGradient);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final UniversalColor getColor() {
        return this.color;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final BeduinLinearGradient getLinearGradient() {
        return this.linearGradient;
    }

    @k
    public final OverlayStyle copy(@l UniversalColor color, @l BeduinLinearGradient linearGradient) {
        return new OverlayStyle(color, linearGradient);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OverlayStyle)) {
            return false;
        }
        OverlayStyle overlayStyle = (OverlayStyle) other;
        return L.f(this.color, overlayStyle.color) && L.f(this.linearGradient, overlayStyle.linearGradient);
    }

    @l
    public final UniversalColor getColor() {
        return this.color;
    }

    @l
    public final BeduinLinearGradient getLinearGradient() {
        return this.linearGradient;
    }

    public int hashCode() {
        UniversalColor universalColor = this.color;
        int iHashCode = (universalColor == null ? 0 : universalColor.hashCode()) * 31;
        BeduinLinearGradient beduinLinearGradient = this.linearGradient;
        return iHashCode + (beduinLinearGradient != null ? beduinLinearGradient.hashCode() : 0);
    }

    @k
    public String toString() {
        return "OverlayStyle(color=" + this.color + ", linearGradient=" + this.linearGradient + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.color, flags);
        BeduinLinearGradient beduinLinearGradient = this.linearGradient;
        if (beduinLinearGradient == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinLinearGradient.writeToParcel(parcel, flags);
        }
    }
}
