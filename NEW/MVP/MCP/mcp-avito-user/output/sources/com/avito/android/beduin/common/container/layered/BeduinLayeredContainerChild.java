package com.avito.android.beduin.common.container.layered;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.avito.android.beduin.common.alignment.HorizontalAlignment;
import com.avito.android.beduin.common.alignment.VerticalAlignment;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinLayeredContainerModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u000f¨\u0006*"}, d2 = {"Lcom/avito/android/beduin/common/container/layered/BeduinLayeredContainerChild;", "Landroid/os/Parcelable;", "Lcom/avito/android/beduin/common/alignment/HorizontalAlignment;", "horizontalAlignment", "Lcom/avito/android/beduin/common/alignment/VerticalAlignment;", "verticalAlignment", "Lcom/avito/android/beduin_models/BeduinModel;", "child", "<init>", "(Lcom/avito/android/beduin/common/alignment/HorizontalAlignment;Lcom/avito/android/beduin/common/alignment/VerticalAlignment;Lcom/avito/android/beduin_models/BeduinModel;)V", "component1", "()Lcom/avito/android/beduin/common/alignment/HorizontalAlignment;", "component2", "()Lcom/avito/android/beduin/common/alignment/VerticalAlignment;", "component3", "()Lcom/avito/android/beduin_models/BeduinModel;", "copy", "(Lcom/avito/android/beduin/common/alignment/HorizontalAlignment;Lcom/avito/android/beduin/common/alignment/VerticalAlignment;Lcom/avito/android/beduin_models/BeduinModel;)Lcom/avito/android/beduin/common/container/layered/BeduinLayeredContainerChild;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/beduin/common/alignment/HorizontalAlignment;", "getHorizontalAlignment", "Lcom/avito/android/beduin/common/alignment/VerticalAlignment;", "getVerticalAlignment", "Lcom/avito/android/beduin_models/BeduinModel;", "getChild", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinLayeredContainerChild implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<BeduinLayeredContainerChild> CREATOR = new a();

    @Y61.k
    private final BeduinModel child;

    @Y61.l
    private final HorizontalAlignment horizontalAlignment;

    @Y61.l
    private final VerticalAlignment verticalAlignment;

    /* compiled from: BeduinLayeredContainerModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinLayeredContainerChild> {
        @Override // android.os.Parcelable.Creator
        public final BeduinLayeredContainerChild createFromParcel(Parcel parcel) {
            return new BeduinLayeredContainerChild(parcel.readInt() == 0 ? null : HorizontalAlignment.valueOf(parcel.readString()), parcel.readInt() != 0 ? VerticalAlignment.valueOf(parcel.readString()) : null, (BeduinModel) parcel.readParcelable(BeduinLayeredContainerChild.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinLayeredContainerChild[] newArray(int i12) {
            return new BeduinLayeredContainerChild[i12];
        }
    }

    public BeduinLayeredContainerChild(@Y61.l HorizontalAlignment horizontalAlignment, @Y61.l VerticalAlignment verticalAlignment, @Y61.k BeduinModel beduinModel) {
        this.horizontalAlignment = horizontalAlignment;
        this.verticalAlignment = verticalAlignment;
        this.child = beduinModel;
    }

    public static /* synthetic */ BeduinLayeredContainerChild copy$default(BeduinLayeredContainerChild beduinLayeredContainerChild, HorizontalAlignment horizontalAlignment, VerticalAlignment verticalAlignment, BeduinModel beduinModel, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            horizontalAlignment = beduinLayeredContainerChild.horizontalAlignment;
        }
        if ((i12 & 2) != 0) {
            verticalAlignment = beduinLayeredContainerChild.verticalAlignment;
        }
        if ((i12 & 4) != 0) {
            beduinModel = beduinLayeredContainerChild.child;
        }
        return beduinLayeredContainerChild.copy(horizontalAlignment, verticalAlignment, beduinModel);
    }

    @Y61.l
    /* renamed from: component1, reason: from getter */
    public final HorizontalAlignment getHorizontalAlignment() {
        return this.horizontalAlignment;
    }

    @Y61.l
    /* renamed from: component2, reason: from getter */
    public final VerticalAlignment getVerticalAlignment() {
        return this.verticalAlignment;
    }

    @Y61.k
    /* renamed from: component3, reason: from getter */
    public final BeduinModel getChild() {
        return this.child;
    }

    @Y61.k
    public final BeduinLayeredContainerChild copy(@Y61.l HorizontalAlignment horizontalAlignment, @Y61.l VerticalAlignment verticalAlignment, @Y61.k BeduinModel child) {
        return new BeduinLayeredContainerChild(horizontalAlignment, verticalAlignment, child);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinLayeredContainerChild)) {
            return false;
        }
        BeduinLayeredContainerChild beduinLayeredContainerChild = (BeduinLayeredContainerChild) other;
        return this.horizontalAlignment == beduinLayeredContainerChild.horizontalAlignment && this.verticalAlignment == beduinLayeredContainerChild.verticalAlignment && L.f(this.child, beduinLayeredContainerChild.child);
    }

    @Y61.k
    public final BeduinModel getChild() {
        return this.child;
    }

    @Y61.l
    public final HorizontalAlignment getHorizontalAlignment() {
        return this.horizontalAlignment;
    }

    @Y61.l
    public final VerticalAlignment getVerticalAlignment() {
        return this.verticalAlignment;
    }

    public int hashCode() {
        HorizontalAlignment horizontalAlignment = this.horizontalAlignment;
        int iHashCode = (horizontalAlignment == null ? 0 : horizontalAlignment.hashCode()) * 31;
        VerticalAlignment verticalAlignment = this.verticalAlignment;
        return this.child.hashCode() + ((iHashCode + (verticalAlignment != null ? verticalAlignment.hashCode() : 0)) * 31);
    }

    @Y61.k
    public String toString() {
        return "BeduinLayeredContainerChild(horizontalAlignment=" + this.horizontalAlignment + ", verticalAlignment=" + this.verticalAlignment + ", child=" + this.child + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        HorizontalAlignment horizontalAlignment = this.horizontalAlignment;
        if (horizontalAlignment == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(horizontalAlignment.name());
        }
        VerticalAlignment verticalAlignment = this.verticalAlignment;
        if (verticalAlignment == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(verticalAlignment.name());
        }
        parcel.writeParcelable(this.child, flags);
    }
}
