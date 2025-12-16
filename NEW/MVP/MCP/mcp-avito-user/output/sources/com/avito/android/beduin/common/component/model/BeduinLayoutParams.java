package com.avito.android.beduin.common.component.model;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinLayoutParams.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\n\u0010\u0006\u001a\u00060\u0002j\u0002`\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u000f\u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0014\u0010\u0011\u001a\u00060\u0002j\u0002`\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\\\u0010\u0018\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\f\b\u0002\u0010\u0006\u001a\u00060\u0002j\u0002`\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b$\u0010\u001eJ \u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b)\u0010*R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b,\u0010\u0010R\u001b\u0010\u0006\u001a\u00060\u0002j\u0002`\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b-\u0010\u0010R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u0013R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b0\u0010\u0013R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b2\u0010\u0016R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u00101\u001a\u0004\b3\u0010\u0016¨\u00064"}, d2 = {"Lcom/avito/android/beduin/common/component/model/BeduinLayoutParams;", "Landroid/os/Parcelable;", "Lcom/avito/android/beduin/common/component/model/BeduinLayoutSize;", "Lcom/avito/android/beduin/common/component/model/LayoutWidth;", "width", "Lcom/avito/android/beduin/common/component/model/LayoutHeight;", "height", "", "minWidth", "minHeight", "Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", BeduinPromoBlockModel.SERIALIZED_NAME_MARGIN, BeduinPromoBlockModel.SERIALIZED_NAME_PADDING, "<init>", "(Lcom/avito/android/beduin/common/component/model/BeduinLayoutSize;Lcom/avito/android/beduin/common/component/model/BeduinLayoutSize;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;)V", "component1", "()Lcom/avito/android/beduin/common/component/model/BeduinLayoutSize;", "component2", "component3", "()Ljava/lang/Integer;", "component4", "component5", "()Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", "component6", "copy", "(Lcom/avito/android/beduin/common/component/model/BeduinLayoutSize;Lcom/avito/android/beduin/common/component/model/BeduinLayoutSize;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;)Lcom/avito/android/beduin/common/component/model/BeduinLayoutParams;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/beduin/common/component/model/BeduinLayoutSize;", "getWidth", "getHeight", "Ljava/lang/Integer;", "getMinWidth", "getMinHeight", "Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", "getMargin", "getPadding", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinLayoutParams implements Parcelable {

    @k
    public static final Parcelable.Creator<BeduinLayoutParams> CREATOR = new a();

    @k
    private final BeduinLayoutSize height;

    @l
    private final BeduinContainerIndent margin;

    @l
    private final Integer minHeight;

    @l
    private final Integer minWidth;

    @l
    private final BeduinContainerIndent padding;

    @k
    private final BeduinLayoutSize width;

    /* compiled from: BeduinLayoutParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinLayoutParams> {
        @Override // android.os.Parcelable.Creator
        public final BeduinLayoutParams createFromParcel(Parcel parcel) {
            return new BeduinLayoutParams((BeduinLayoutSize) parcel.readParcelable(BeduinLayoutParams.class.getClassLoader()), (BeduinLayoutSize) parcel.readParcelable(BeduinLayoutParams.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : BeduinContainerIndent.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? BeduinContainerIndent.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinLayoutParams[] newArray(int i12) {
            return new BeduinLayoutParams[i12];
        }
    }

    public BeduinLayoutParams(@k BeduinLayoutSize beduinLayoutSize, @k BeduinLayoutSize beduinLayoutSize2, @l Integer num, @l Integer num2, @l BeduinContainerIndent beduinContainerIndent, @l BeduinContainerIndent beduinContainerIndent2) {
        this.width = beduinLayoutSize;
        this.height = beduinLayoutSize2;
        this.minWidth = num;
        this.minHeight = num2;
        this.margin = beduinContainerIndent;
        this.padding = beduinContainerIndent2;
    }

    public static /* synthetic */ BeduinLayoutParams copy$default(BeduinLayoutParams beduinLayoutParams, BeduinLayoutSize beduinLayoutSize, BeduinLayoutSize beduinLayoutSize2, Integer num, Integer num2, BeduinContainerIndent beduinContainerIndent, BeduinContainerIndent beduinContainerIndent2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            beduinLayoutSize = beduinLayoutParams.width;
        }
        if ((i12 & 2) != 0) {
            beduinLayoutSize2 = beduinLayoutParams.height;
        }
        BeduinLayoutSize beduinLayoutSize3 = beduinLayoutSize2;
        if ((i12 & 4) != 0) {
            num = beduinLayoutParams.minWidth;
        }
        Integer num3 = num;
        if ((i12 & 8) != 0) {
            num2 = beduinLayoutParams.minHeight;
        }
        Integer num4 = num2;
        if ((i12 & 16) != 0) {
            beduinContainerIndent = beduinLayoutParams.margin;
        }
        BeduinContainerIndent beduinContainerIndent3 = beduinContainerIndent;
        if ((i12 & 32) != 0) {
            beduinContainerIndent2 = beduinLayoutParams.padding;
        }
        return beduinLayoutParams.copy(beduinLayoutSize, beduinLayoutSize3, num3, num4, beduinContainerIndent3, beduinContainerIndent2);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final BeduinLayoutSize getWidth() {
        return this.width;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final BeduinLayoutSize getHeight() {
        return this.height;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Integer getMinWidth() {
        return this.minWidth;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Integer getMinHeight() {
        return this.minHeight;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final BeduinContainerIndent getMargin() {
        return this.margin;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final BeduinContainerIndent getPadding() {
        return this.padding;
    }

    @k
    public final BeduinLayoutParams copy(@k BeduinLayoutSize width, @k BeduinLayoutSize height, @l Integer minWidth, @l Integer minHeight, @l BeduinContainerIndent margin, @l BeduinContainerIndent padding) {
        return new BeduinLayoutParams(width, height, minWidth, minHeight, margin, padding);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinLayoutParams)) {
            return false;
        }
        BeduinLayoutParams beduinLayoutParams = (BeduinLayoutParams) other;
        return L.f(this.width, beduinLayoutParams.width) && L.f(this.height, beduinLayoutParams.height) && L.f(this.minWidth, beduinLayoutParams.minWidth) && L.f(this.minHeight, beduinLayoutParams.minHeight) && L.f(this.margin, beduinLayoutParams.margin) && L.f(this.padding, beduinLayoutParams.padding);
    }

    @k
    public final BeduinLayoutSize getHeight() {
        return this.height;
    }

    @l
    public final BeduinContainerIndent getMargin() {
        return this.margin;
    }

    @l
    public final Integer getMinHeight() {
        return this.minHeight;
    }

    @l
    public final Integer getMinWidth() {
        return this.minWidth;
    }

    @l
    public final BeduinContainerIndent getPadding() {
        return this.padding;
    }

    @k
    public final BeduinLayoutSize getWidth() {
        return this.width;
    }

    public int hashCode() {
        int iHashCode = (this.height.hashCode() + (this.width.hashCode() * 31)) * 31;
        Integer num = this.minWidth;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.minHeight;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        BeduinContainerIndent beduinContainerIndent = this.margin;
        int iHashCode4 = (iHashCode3 + (beduinContainerIndent == null ? 0 : beduinContainerIndent.hashCode())) * 31;
        BeduinContainerIndent beduinContainerIndent2 = this.padding;
        return iHashCode4 + (beduinContainerIndent2 != null ? beduinContainerIndent2.hashCode() : 0);
    }

    @k
    public String toString() {
        return "BeduinLayoutParams(width=" + this.width + ", height=" + this.height + ", minWidth=" + this.minWidth + ", minHeight=" + this.minHeight + ", margin=" + this.margin + ", padding=" + this.padding + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.width, flags);
        parcel.writeParcelable(this.height, flags);
        Integer num = this.minWidth;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        Integer num2 = this.minHeight;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num2);
        }
        BeduinContainerIndent beduinContainerIndent = this.margin;
        if (beduinContainerIndent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinContainerIndent.writeToParcel(parcel, flags);
        }
        BeduinContainerIndent beduinContainerIndent2 = this.padding;
        if (beduinContainerIndent2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinContainerIndent2.writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ BeduinLayoutParams(BeduinLayoutSize beduinLayoutSize, BeduinLayoutSize beduinLayoutSize2, Integer num, Integer num2, BeduinContainerIndent beduinContainerIndent, BeduinContainerIndent beduinContainerIndent2, int i12, C42822w c42822w) {
        this(beduinLayoutSize, beduinLayoutSize2, (i12 & 4) != 0 ? null : num, (i12 & 8) != 0 ? null : num2, (i12 & 16) != 0 ? null : beduinContainerIndent, (i12 & 32) != 0 ? null : beduinContainerIndent2);
    }
}
