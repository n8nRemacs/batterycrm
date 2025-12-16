package com.avito.android.beduin.common.component.point;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinPointModel.kt */
@d
@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u000b¨\u0006#"}, d2 = {"Lcom/avito/android/beduin/common/component/point/BeduinPointStroke;", "Landroid/os/Parcelable;", "", "width", "Lcom/avito/android/remote/model/UniversalColor;", "color", "<init>", "(Ljava/lang/Integer;Lcom/avito/android/remote/model/UniversalColor;)V", "component1", "()Ljava/lang/Integer;", "component2", "()Lcom/avito/android/remote/model/UniversalColor;", "copy", "(Ljava/lang/Integer;Lcom/avito/android/remote/model/UniversalColor;)Lcom/avito/android/beduin/common/component/point/BeduinPointStroke;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Integer;", "getWidth", "Lcom/avito/android/remote/model/UniversalColor;", "getColor", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinPointStroke implements Parcelable {

    @k
    public static final Parcelable.Creator<BeduinPointStroke> CREATOR = new a();

    @l
    private final UniversalColor color;

    @l
    private final Integer width;

    /* compiled from: BeduinPointModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinPointStroke> {
        @Override // android.os.Parcelable.Creator
        public final BeduinPointStroke createFromParcel(Parcel parcel) {
            return new BeduinPointStroke(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (UniversalColor) parcel.readParcelable(BeduinPointStroke.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinPointStroke[] newArray(int i12) {
            return new BeduinPointStroke[i12];
        }
    }

    public BeduinPointStroke(@l Integer num, @l UniversalColor universalColor) {
        this.width = num;
        this.color = universalColor;
    }

    public static /* synthetic */ BeduinPointStroke copy$default(BeduinPointStroke beduinPointStroke, Integer num, UniversalColor universalColor, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            num = beduinPointStroke.width;
        }
        if ((i12 & 2) != 0) {
            universalColor = beduinPointStroke.color;
        }
        return beduinPointStroke.copy(num, universalColor);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final Integer getWidth() {
        return this.width;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final UniversalColor getColor() {
        return this.color;
    }

    @k
    public final BeduinPointStroke copy(@l Integer width, @l UniversalColor color) {
        return new BeduinPointStroke(width, color);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinPointStroke)) {
            return false;
        }
        BeduinPointStroke beduinPointStroke = (BeduinPointStroke) other;
        return L.f(this.width, beduinPointStroke.width) && L.f(this.color, beduinPointStroke.color);
    }

    @l
    public final UniversalColor getColor() {
        return this.color;
    }

    @l
    public final Integer getWidth() {
        return this.width;
    }

    public int hashCode() {
        Integer num = this.width;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        UniversalColor universalColor = this.color;
        return iHashCode + (universalColor != null ? universalColor.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinPointStroke(width=");
        sb2.append(this.width);
        sb2.append(", color=");
        return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.color, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Integer num = this.width;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeParcelable(this.color, flags);
    }
}
