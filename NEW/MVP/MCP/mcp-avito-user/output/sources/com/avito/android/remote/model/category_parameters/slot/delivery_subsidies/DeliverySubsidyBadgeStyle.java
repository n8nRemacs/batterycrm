package com.avito.android.remote.model.category_parameters.slot.delivery_subsidies;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.lib.design.docking_badge.DockingBadgeEdgeType;
import com.avito.android.lib.design.docking_badge.DockingBadgeSize;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DeliverySubsidySlotConfig.kt */
@d
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JL\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b&\u0010'R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b-\u0010\u0010R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u0010\u0013¨\u00060"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/delivery_subsidies/DeliverySubsidyBadgeStyle;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalColor;", "backgroundColor", "fontColor", "Lcom/avito/android/lib/design/docking_badge/DockingBadgeEdgeType;", "leftEdgeStyle", "rightEdgeStyle", "Lcom/avito/android/lib/design/docking_badge/DockingBadgeSize;", "size", "<init>", "(Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/lib/design/docking_badge/DockingBadgeEdgeType;Lcom/avito/android/lib/design/docking_badge/DockingBadgeEdgeType;Lcom/avito/android/lib/design/docking_badge/DockingBadgeSize;)V", "component1", "()Lcom/avito/android/remote/model/UniversalColor;", "component2", "component3", "()Lcom/avito/android/lib/design/docking_badge/DockingBadgeEdgeType;", "component4", "component5", "()Lcom/avito/android/lib/design/docking_badge/DockingBadgeSize;", "copy", "(Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/lib/design/docking_badge/DockingBadgeEdgeType;Lcom/avito/android/lib/design/docking_badge/DockingBadgeEdgeType;Lcom/avito/android/lib/design/docking_badge/DockingBadgeSize;)Lcom/avito/android/remote/model/category_parameters/slot/delivery_subsidies/DeliverySubsidyBadgeStyle;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/UniversalColor;", "getBackgroundColor", "getFontColor", "Lcom/avito/android/lib/design/docking_badge/DockingBadgeEdgeType;", "getLeftEdgeStyle", "getRightEdgeStyle", "Lcom/avito/android/lib/design/docking_badge/DockingBadgeSize;", "getSize", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class DeliverySubsidyBadgeStyle implements Parcelable {

    @k
    public static final Parcelable.Creator<DeliverySubsidyBadgeStyle> CREATOR = new Creator();

    @c("backgroundColor")
    @l
    private final UniversalColor backgroundColor;

    @c("fontColor")
    @l
    private final UniversalColor fontColor;

    @c("leftEdgeStyle")
    @l
    private final DockingBadgeEdgeType leftEdgeStyle;

    @c("rightEdgeStyle")
    @l
    private final DockingBadgeEdgeType rightEdgeStyle;

    @c("size")
    @l
    private final DockingBadgeSize size;

    /* compiled from: DeliverySubsidySlotConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DeliverySubsidyBadgeStyle> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DeliverySubsidyBadgeStyle createFromParcel(@k Parcel parcel) {
            return new DeliverySubsidyBadgeStyle((UniversalColor) parcel.readParcelable(DeliverySubsidyBadgeStyle.class.getClassLoader()), (UniversalColor) parcel.readParcelable(DeliverySubsidyBadgeStyle.class.getClassLoader()), parcel.readInt() == 0 ? null : DockingBadgeEdgeType.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : DockingBadgeEdgeType.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : DockingBadgeSize.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DeliverySubsidyBadgeStyle[] newArray(int i12) {
            return new DeliverySubsidyBadgeStyle[i12];
        }
    }

    public DeliverySubsidyBadgeStyle(@l UniversalColor universalColor, @l UniversalColor universalColor2, @l DockingBadgeEdgeType dockingBadgeEdgeType, @l DockingBadgeEdgeType dockingBadgeEdgeType2, @l DockingBadgeSize dockingBadgeSize) {
        this.backgroundColor = universalColor;
        this.fontColor = universalColor2;
        this.leftEdgeStyle = dockingBadgeEdgeType;
        this.rightEdgeStyle = dockingBadgeEdgeType2;
        this.size = dockingBadgeSize;
    }

    public static /* synthetic */ DeliverySubsidyBadgeStyle copy$default(DeliverySubsidyBadgeStyle deliverySubsidyBadgeStyle, UniversalColor universalColor, UniversalColor universalColor2, DockingBadgeEdgeType dockingBadgeEdgeType, DockingBadgeEdgeType dockingBadgeEdgeType2, DockingBadgeSize dockingBadgeSize, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            universalColor = deliverySubsidyBadgeStyle.backgroundColor;
        }
        if ((i12 & 2) != 0) {
            universalColor2 = deliverySubsidyBadgeStyle.fontColor;
        }
        UniversalColor universalColor3 = universalColor2;
        if ((i12 & 4) != 0) {
            dockingBadgeEdgeType = deliverySubsidyBadgeStyle.leftEdgeStyle;
        }
        DockingBadgeEdgeType dockingBadgeEdgeType3 = dockingBadgeEdgeType;
        if ((i12 & 8) != 0) {
            dockingBadgeEdgeType2 = deliverySubsidyBadgeStyle.rightEdgeStyle;
        }
        DockingBadgeEdgeType dockingBadgeEdgeType4 = dockingBadgeEdgeType2;
        if ((i12 & 16) != 0) {
            dockingBadgeSize = deliverySubsidyBadgeStyle.size;
        }
        return deliverySubsidyBadgeStyle.copy(universalColor, universalColor3, dockingBadgeEdgeType3, dockingBadgeEdgeType4, dockingBadgeSize);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final UniversalColor getBackgroundColor() {
        return this.backgroundColor;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final UniversalColor getFontColor() {
        return this.fontColor;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final DockingBadgeEdgeType getLeftEdgeStyle() {
        return this.leftEdgeStyle;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final DockingBadgeEdgeType getRightEdgeStyle() {
        return this.rightEdgeStyle;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final DockingBadgeSize getSize() {
        return this.size;
    }

    @k
    public final DeliverySubsidyBadgeStyle copy(@l UniversalColor backgroundColor, @l UniversalColor fontColor, @l DockingBadgeEdgeType leftEdgeStyle, @l DockingBadgeEdgeType rightEdgeStyle, @l DockingBadgeSize size) {
        return new DeliverySubsidyBadgeStyle(backgroundColor, fontColor, leftEdgeStyle, rightEdgeStyle, size);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliverySubsidyBadgeStyle)) {
            return false;
        }
        DeliverySubsidyBadgeStyle deliverySubsidyBadgeStyle = (DeliverySubsidyBadgeStyle) other;
        return L.f(this.backgroundColor, deliverySubsidyBadgeStyle.backgroundColor) && L.f(this.fontColor, deliverySubsidyBadgeStyle.fontColor) && this.leftEdgeStyle == deliverySubsidyBadgeStyle.leftEdgeStyle && this.rightEdgeStyle == deliverySubsidyBadgeStyle.rightEdgeStyle && this.size == deliverySubsidyBadgeStyle.size;
    }

    @l
    public final UniversalColor getBackgroundColor() {
        return this.backgroundColor;
    }

    @l
    public final UniversalColor getFontColor() {
        return this.fontColor;
    }

    @l
    public final DockingBadgeEdgeType getLeftEdgeStyle() {
        return this.leftEdgeStyle;
    }

    @l
    public final DockingBadgeEdgeType getRightEdgeStyle() {
        return this.rightEdgeStyle;
    }

    @l
    public final DockingBadgeSize getSize() {
        return this.size;
    }

    public int hashCode() {
        UniversalColor universalColor = this.backgroundColor;
        int iHashCode = (universalColor == null ? 0 : universalColor.hashCode()) * 31;
        UniversalColor universalColor2 = this.fontColor;
        int iHashCode2 = (iHashCode + (universalColor2 == null ? 0 : universalColor2.hashCode())) * 31;
        DockingBadgeEdgeType dockingBadgeEdgeType = this.leftEdgeStyle;
        int iHashCode3 = (iHashCode2 + (dockingBadgeEdgeType == null ? 0 : dockingBadgeEdgeType.hashCode())) * 31;
        DockingBadgeEdgeType dockingBadgeEdgeType2 = this.rightEdgeStyle;
        int iHashCode4 = (iHashCode3 + (dockingBadgeEdgeType2 == null ? 0 : dockingBadgeEdgeType2.hashCode())) * 31;
        DockingBadgeSize dockingBadgeSize = this.size;
        return iHashCode4 + (dockingBadgeSize != null ? dockingBadgeSize.hashCode() : 0);
    }

    @k
    public String toString() {
        return "DeliverySubsidyBadgeStyle(backgroundColor=" + this.backgroundColor + ", fontColor=" + this.fontColor + ", leftEdgeStyle=" + this.leftEdgeStyle + ", rightEdgeStyle=" + this.rightEdgeStyle + ", size=" + this.size + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.backgroundColor, flags);
        parcel.writeParcelable(this.fontColor, flags);
        DockingBadgeEdgeType dockingBadgeEdgeType = this.leftEdgeStyle;
        if (dockingBadgeEdgeType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(dockingBadgeEdgeType.name());
        }
        DockingBadgeEdgeType dockingBadgeEdgeType2 = this.rightEdgeStyle;
        if (dockingBadgeEdgeType2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(dockingBadgeEdgeType2.name());
        }
        DockingBadgeSize dockingBadgeSize = this.size;
        if (dockingBadgeSize == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(dockingBadgeSize.name());
        }
    }
}
