package com.avito.android.beduin.common.component.product_comparison;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.avito.android.beduin.common.component.model.BeduinContainerIndent;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinProductComparisonModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u000f¨\u0006("}, d2 = {"Lcom/avito/android/beduin/common/component/product_comparison/BeduinProductComparisonTextItemParams;", "Landroid/os/Parcelable;", "", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lcom/avito/android/remote/model/UniversalColor;", "textColor", "Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", BeduinPromoBlockModel.SERIALIZED_NAME_MARGIN, "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/UniversalColor;", "component3", "()Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;)Lcom/avito/android/beduin/common/component/product_comparison/BeduinProductComparisonTextItemParams;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getStyle", "Lcom/avito/android/remote/model/UniversalColor;", "getTextColor", "Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", "getMargin", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinProductComparisonTextItemParams implements Parcelable {

    @k
    public static final Parcelable.Creator<BeduinProductComparisonTextItemParams> CREATOR = new a();

    @l
    private final BeduinContainerIndent margin;

    @l
    private final String style;

    @l
    private final UniversalColor textColor;

    /* compiled from: BeduinProductComparisonModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinProductComparisonTextItemParams> {
        @Override // android.os.Parcelable.Creator
        public final BeduinProductComparisonTextItemParams createFromParcel(Parcel parcel) {
            return new BeduinProductComparisonTextItemParams(parcel.readString(), (UniversalColor) parcel.readParcelable(BeduinProductComparisonTextItemParams.class.getClassLoader()), parcel.readInt() == 0 ? null : BeduinContainerIndent.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinProductComparisonTextItemParams[] newArray(int i12) {
            return new BeduinProductComparisonTextItemParams[i12];
        }
    }

    public BeduinProductComparisonTextItemParams(@l String str, @l UniversalColor universalColor, @l BeduinContainerIndent beduinContainerIndent) {
        this.style = str;
        this.textColor = universalColor;
        this.margin = beduinContainerIndent;
    }

    public static /* synthetic */ BeduinProductComparisonTextItemParams copy$default(BeduinProductComparisonTextItemParams beduinProductComparisonTextItemParams, String str, UniversalColor universalColor, BeduinContainerIndent beduinContainerIndent, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = beduinProductComparisonTextItemParams.style;
        }
        if ((i12 & 2) != 0) {
            universalColor = beduinProductComparisonTextItemParams.textColor;
        }
        if ((i12 & 4) != 0) {
            beduinContainerIndent = beduinProductComparisonTextItemParams.margin;
        }
        return beduinProductComparisonTextItemParams.copy(str, universalColor, beduinContainerIndent);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final UniversalColor getTextColor() {
        return this.textColor;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final BeduinContainerIndent getMargin() {
        return this.margin;
    }

    @k
    public final BeduinProductComparisonTextItemParams copy(@l String style, @l UniversalColor textColor, @l BeduinContainerIndent margin) {
        return new BeduinProductComparisonTextItemParams(style, textColor, margin);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinProductComparisonTextItemParams)) {
            return false;
        }
        BeduinProductComparisonTextItemParams beduinProductComparisonTextItemParams = (BeduinProductComparisonTextItemParams) other;
        return L.f(this.style, beduinProductComparisonTextItemParams.style) && L.f(this.textColor, beduinProductComparisonTextItemParams.textColor) && L.f(this.margin, beduinProductComparisonTextItemParams.margin);
    }

    @l
    public final BeduinContainerIndent getMargin() {
        return this.margin;
    }

    @l
    public final String getStyle() {
        return this.style;
    }

    @l
    public final UniversalColor getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        String str = this.style;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        UniversalColor universalColor = this.textColor;
        int iHashCode2 = (iHashCode + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
        BeduinContainerIndent beduinContainerIndent = this.margin;
        return iHashCode2 + (beduinContainerIndent != null ? beduinContainerIndent.hashCode() : 0);
    }

    @k
    public String toString() {
        return "BeduinProductComparisonTextItemParams(style=" + this.style + ", textColor=" + this.textColor + ", margin=" + this.margin + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.style);
        parcel.writeParcelable(this.textColor, flags);
        BeduinContainerIndent beduinContainerIndent = this.margin;
        if (beduinContainerIndent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinContainerIndent.writeToParcel(parcel, flags);
        }
    }
}
