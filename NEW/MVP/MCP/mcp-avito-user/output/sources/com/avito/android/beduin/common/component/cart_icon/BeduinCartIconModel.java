package com.avito.android.beduin.common.component.cart_icon;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.beduin.common.component.LeafBeduinModel;
import com.avito.android.beduin.common.navigation_bar.cart_native.NavigationBarCartNative;
import com.avito.android.beduin_models.DisplayingPredicate;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinCartIconModel.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/cart_icon/BeduinCartIconModel;", "Lcom/avito/android/beduin/common/component/LeafBeduinModel;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinCartIconModel extends LeafBeduinModel {

    @k
    public static final Parcelable.Creator<BeduinCartIconModel> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f100853b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final DisplayingPredicate f100854c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final NavigationBarCartNative.ShoppingCartButtonStyle f100855d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final NavigationBarCartNative.EventData f100856e;

    /* compiled from: BeduinCartIconModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinCartIconModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinCartIconModel createFromParcel(Parcel parcel) {
            return new BeduinCartIconModel(parcel.readString(), (DisplayingPredicate) parcel.readParcelable(BeduinCartIconModel.class.getClassLoader()), NavigationBarCartNative.ShoppingCartButtonStyle.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : NavigationBarCartNative.EventData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinCartIconModel[] newArray(int i12) {
            return new BeduinCartIconModel[i12];
        }
    }

    public BeduinCartIconModel(@k String str, @l DisplayingPredicate displayingPredicate, @k NavigationBarCartNative.ShoppingCartButtonStyle shoppingCartButtonStyle, @l NavigationBarCartNative.EventData eventData) {
        this.f100853b = str;
        this.f100854c = displayingPredicate;
        this.f100855d = shoppingCartButtonStyle;
        this.f100856e = eventData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BeduinCartIconModel)) {
            return false;
        }
        BeduinCartIconModel beduinCartIconModel = (BeduinCartIconModel) obj;
        return L.f(this.f100853b, beduinCartIconModel.f100853b) && L.f(this.f100854c, beduinCartIconModel.f100854c) && this.f100855d == beduinCartIconModel.f100855d && L.f(this.f100856e, beduinCartIconModel.f100856e);
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @l
    /* renamed from: getDisplayingPredicate, reason: from getter */
    public final DisplayingPredicate getF100854c() {
        return this.f100854c;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @k
    /* renamed from: getId, reason: from getter */
    public final String getF100853b() {
        return this.f100853b;
    }

    public final int hashCode() {
        int iHashCode = this.f100853b.hashCode() * 31;
        DisplayingPredicate displayingPredicate = this.f100854c;
        int iHashCode2 = (this.f100855d.hashCode() + ((iHashCode + (displayingPredicate == null ? 0 : displayingPredicate.hashCode())) * 31)) * 31;
        NavigationBarCartNative.EventData eventData = this.f100856e;
        return iHashCode2 + (eventData != null ? eventData.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "BeduinCartIconModel(id=" + this.f100853b + ", displayingPredicate=" + this.f100854c + ", style=" + this.f100855d + ", eventData=" + this.f100856e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f100853b);
        parcel.writeParcelable(this.f100854c, i12);
        parcel.writeString(this.f100855d.name());
        NavigationBarCartNative.EventData eventData = this.f100856e;
        if (eventData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eventData.writeToParcel(parcel, i12);
        }
    }
}
