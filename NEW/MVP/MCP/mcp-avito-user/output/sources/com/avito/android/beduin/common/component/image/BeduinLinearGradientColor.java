package com.avito.android.beduin.common.component.image;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinImageModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000b¨\u0006$"}, d2 = {"Lcom/avito/android/beduin/common/component/image/BeduinLinearGradientColor;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalColor;", "color", "", "position", "<init>", "(Lcom/avito/android/remote/model/UniversalColor;F)V", "component1", "()Lcom/avito/android/remote/model/UniversalColor;", "component2", "()F", "copy", "(Lcom/avito/android/remote/model/UniversalColor;F)Lcom/avito/android/beduin/common/component/image/BeduinLinearGradientColor;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/UniversalColor;", "getColor", "F", "getPosition", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinLinearGradientColor implements Parcelable {

    @k
    public static final Parcelable.Creator<BeduinLinearGradientColor> CREATOR = new a();

    @k
    private final UniversalColor color;
    private final float position;

    /* compiled from: BeduinImageModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinLinearGradientColor> {
        @Override // android.os.Parcelable.Creator
        public final BeduinLinearGradientColor createFromParcel(Parcel parcel) {
            return new BeduinLinearGradientColor((UniversalColor) parcel.readParcelable(BeduinLinearGradientColor.class.getClassLoader()), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinLinearGradientColor[] newArray(int i12) {
            return new BeduinLinearGradientColor[i12];
        }
    }

    public BeduinLinearGradientColor(@k UniversalColor universalColor, float f12) {
        this.color = universalColor;
        this.position = f12;
    }

    public static /* synthetic */ BeduinLinearGradientColor copy$default(BeduinLinearGradientColor beduinLinearGradientColor, UniversalColor universalColor, float f12, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            universalColor = beduinLinearGradientColor.color;
        }
        if ((i12 & 2) != 0) {
            f12 = beduinLinearGradientColor.position;
        }
        return beduinLinearGradientColor.copy(universalColor, f12);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final UniversalColor getColor() {
        return this.color;
    }

    /* renamed from: component2, reason: from getter */
    public final float getPosition() {
        return this.position;
    }

    @k
    public final BeduinLinearGradientColor copy(@k UniversalColor color, float position) {
        return new BeduinLinearGradientColor(color, position);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinLinearGradientColor)) {
            return false;
        }
        BeduinLinearGradientColor beduinLinearGradientColor = (BeduinLinearGradientColor) other;
        return L.f(this.color, beduinLinearGradientColor.color) && Float.compare(this.position, beduinLinearGradientColor.position) == 0;
    }

    @k
    public final UniversalColor getColor() {
        return this.color;
    }

    public final float getPosition() {
        return this.position;
    }

    public int hashCode() {
        return Float.hashCode(this.position) + (this.color.hashCode() * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinLinearGradientColor(color=");
        sb2.append(this.color);
        sb2.append(", position=");
        return r.k(')', this.position, sb2);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.color, flags);
        parcel.writeFloat(this.position);
    }
}
