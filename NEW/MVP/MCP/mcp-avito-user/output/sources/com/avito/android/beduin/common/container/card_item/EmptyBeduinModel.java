package com.avito.android.beduin.common.container.card_item;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.beduin.common.component.LeafBeduinModel;
import com.avito.android.beduin_models.DisplayingPredicate;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinCardItemContainerChange.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/container/card_item/EmptyBeduinModel;", "Lcom/avito/android/beduin/common/component/LeafBeduinModel;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* data */ class EmptyBeduinModel extends LeafBeduinModel {

    @k
    public static final Parcelable.Creator<EmptyBeduinModel> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f102944b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final DisplayingPredicate f102945c;

    /* compiled from: BeduinCardItemContainerChange.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<EmptyBeduinModel> {
        @Override // android.os.Parcelable.Creator
        public final EmptyBeduinModel createFromParcel(Parcel parcel) {
            return new EmptyBeduinModel(parcel.readString(), (DisplayingPredicate) parcel.readParcelable(EmptyBeduinModel.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final EmptyBeduinModel[] newArray(int i12) {
            return new EmptyBeduinModel[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EmptyBeduinModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmptyBeduinModel)) {
            return false;
        }
        EmptyBeduinModel emptyBeduinModel = (EmptyBeduinModel) obj;
        return L.f(this.f102944b, emptyBeduinModel.f102944b) && L.f(this.f102945c, emptyBeduinModel.f102945c);
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @l
    /* renamed from: getDisplayingPredicate, reason: from getter */
    public final DisplayingPredicate getF102945c() {
        return this.f102945c;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @k
    /* renamed from: getId, reason: from getter */
    public final String getF102944b() {
        return this.f102944b;
    }

    public final int hashCode() {
        int iHashCode = this.f102944b.hashCode() * 31;
        DisplayingPredicate displayingPredicate = this.f102945c;
        return iHashCode + (displayingPredicate == null ? 0 : displayingPredicate.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EmptyBeduinModel(id=");
        sb2.append(this.f102944b);
        sb2.append(", displayingPredicate=");
        return AK.c.l(sb2, this.f102945c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f102944b);
        parcel.writeParcelable(this.f102945c, i12);
    }

    public /* synthetic */ EmptyBeduinModel(String str, DisplayingPredicate displayingPredicate, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "" : str, (i12 & 2) != 0 ? null : displayingPredicate);
    }

    public EmptyBeduinModel(@k String str, @l DisplayingPredicate displayingPredicate) {
        this.f102944b = str;
        this.f102945c = displayingPredicate;
    }
}
