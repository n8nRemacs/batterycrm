package com.avito.android.beduin.common.component.pixel;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;

/* compiled from: BeduinPixelModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\rJ\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\rJ \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u000f¨\u0006("}, d2 = {"Lcom/avito/android/beduin/common/component/pixel/PixelScreenPosition;", "Landroid/os/Parcelable;", "Lcom/avito/android/beduin/common/component/pixel/PixelScreenPositionEdge;", "edge", "", "offset", "Lcom/avito/android/beduin/common/component/pixel/PixelScreenPositionCondition;", "condition", "<init>", "(Lcom/avito/android/beduin/common/component/pixel/PixelScreenPositionEdge;ILcom/avito/android/beduin/common/component/pixel/PixelScreenPositionCondition;)V", "component1", "()Lcom/avito/android/beduin/common/component/pixel/PixelScreenPositionEdge;", "component2", "()I", "component3", "()Lcom/avito/android/beduin/common/component/pixel/PixelScreenPositionCondition;", "copy", "(Lcom/avito/android/beduin/common/component/pixel/PixelScreenPositionEdge;ILcom/avito/android/beduin/common/component/pixel/PixelScreenPositionCondition;)Lcom/avito/android/beduin/common/component/pixel/PixelScreenPosition;", "", "toString", "()Ljava/lang/String;", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/beduin/common/component/pixel/PixelScreenPositionEdge;", "getEdge", "I", "getOffset", "Lcom/avito/android/beduin/common/component/pixel/PixelScreenPositionCondition;", "getCondition", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PixelScreenPosition implements Parcelable {

    @k
    public static final Parcelable.Creator<PixelScreenPosition> CREATOR = new a();

    @l
    private final PixelScreenPositionCondition condition;

    @k
    private final PixelScreenPositionEdge edge;
    private final int offset;

    /* compiled from: BeduinPixelModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PixelScreenPosition> {
        @Override // android.os.Parcelable.Creator
        public final PixelScreenPosition createFromParcel(Parcel parcel) {
            return new PixelScreenPosition(PixelScreenPositionEdge.valueOf(parcel.readString()), parcel.readInt(), parcel.readInt() == 0 ? null : PixelScreenPositionCondition.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final PixelScreenPosition[] newArray(int i12) {
            return new PixelScreenPosition[i12];
        }
    }

    public PixelScreenPosition(@k PixelScreenPositionEdge pixelScreenPositionEdge, int i12, @l PixelScreenPositionCondition pixelScreenPositionCondition) {
        this.edge = pixelScreenPositionEdge;
        this.offset = i12;
        this.condition = pixelScreenPositionCondition;
    }

    public static /* synthetic */ PixelScreenPosition copy$default(PixelScreenPosition pixelScreenPosition, PixelScreenPositionEdge pixelScreenPositionEdge, int i12, PixelScreenPositionCondition pixelScreenPositionCondition, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            pixelScreenPositionEdge = pixelScreenPosition.edge;
        }
        if ((i13 & 2) != 0) {
            i12 = pixelScreenPosition.offset;
        }
        if ((i13 & 4) != 0) {
            pixelScreenPositionCondition = pixelScreenPosition.condition;
        }
        return pixelScreenPosition.copy(pixelScreenPositionEdge, i12, pixelScreenPositionCondition);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final PixelScreenPositionEdge getEdge() {
        return this.edge;
    }

    /* renamed from: component2, reason: from getter */
    public final int getOffset() {
        return this.offset;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final PixelScreenPositionCondition getCondition() {
        return this.condition;
    }

    @k
    public final PixelScreenPosition copy(@k PixelScreenPositionEdge edge, int offset, @l PixelScreenPositionCondition condition) {
        return new PixelScreenPosition(edge, offset, condition);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PixelScreenPosition)) {
            return false;
        }
        PixelScreenPosition pixelScreenPosition = (PixelScreenPosition) other;
        return this.edge == pixelScreenPosition.edge && this.offset == pixelScreenPosition.offset && this.condition == pixelScreenPosition.condition;
    }

    @l
    public final PixelScreenPositionCondition getCondition() {
        return this.condition;
    }

    @k
    public final PixelScreenPositionEdge getEdge() {
        return this.edge;
    }

    public final int getOffset() {
        return this.offset;
    }

    public int hashCode() {
        int iE2 = r.e(this.offset, this.edge.hashCode() * 31, 31);
        PixelScreenPositionCondition pixelScreenPositionCondition = this.condition;
        return iE2 + (pixelScreenPositionCondition == null ? 0 : pixelScreenPositionCondition.hashCode());
    }

    @k
    public String toString() {
        return "PixelScreenPosition(edge=" + this.edge + ", offset=" + this.offset + ", condition=" + this.condition + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.edge.name());
        parcel.writeInt(this.offset);
        PixelScreenPositionCondition pixelScreenPositionCondition = this.condition;
        if (pixelScreenPositionCondition == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(pixelScreenPositionCondition.name());
        }
    }
}
