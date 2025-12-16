package com.avito.android.advertising.adapter.items.buzzoola.premium;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BuzzoolaPremiumStates.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/adapter/items/buzzoola/premium/BuzzoolaPremiumItemState;", "Landroid/os/Parcelable;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BuzzoolaPremiumItemState implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<BuzzoolaPremiumItemState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public Parcelable f87379b;

    /* compiled from: BuzzoolaPremiumStates.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BuzzoolaPremiumItemState> {
        @Override // android.os.Parcelable.Creator
        public final BuzzoolaPremiumItemState createFromParcel(Parcel parcel) {
            return new BuzzoolaPremiumItemState(parcel.readParcelable(BuzzoolaPremiumItemState.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final BuzzoolaPremiumItemState[] newArray(int i12) {
            return new BuzzoolaPremiumItemState[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BuzzoolaPremiumItemState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BuzzoolaPremiumItemState) && L.f(this.f87379b, ((BuzzoolaPremiumItemState) obj).f87379b);
    }

    public final int hashCode() {
        Parcelable parcelable = this.f87379b;
        if (parcelable == null) {
            return 0;
        }
        return parcelable.hashCode();
    }

    @Y61.k
    public final String toString() {
        return com.avito.android.advert.item.delivery_suggests.l.o(new StringBuilder("BuzzoolaPremiumItemState(galleryState="), this.f87379b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f87379b, i12);
    }

    public BuzzoolaPremiumItemState(@Y61.l Parcelable parcelable) {
        this.f87379b = parcelable;
    }

    public /* synthetic */ BuzzoolaPremiumItemState(Parcelable parcelable, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : parcelable);
    }
}
