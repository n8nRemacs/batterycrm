package com.avito.android.advert.item.safedeal.trust_factors.combined_buttons;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CombinedButtonsItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/safedeal/trust_factors/combined_buttons/FreeDeliveryBlock;", "Landroid/os/Parcelable;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class FreeDeliveryBlock implements Parcelable {

    @k
    public static final Parcelable.Creator<FreeDeliveryBlock> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f79073b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f79074c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f79075d;

    /* compiled from: CombinedButtonsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FreeDeliveryBlock> {
        @Override // android.os.Parcelable.Creator
        public final FreeDeliveryBlock createFromParcel(Parcel parcel) {
            return new FreeDeliveryBlock(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final FreeDeliveryBlock[] newArray(int i12) {
            return new FreeDeliveryBlock[i12];
        }
    }

    public FreeDeliveryBlock(@k String str, boolean z12, boolean z13) {
        this.f79073b = str;
        this.f79074c = z12;
        this.f79075d = z13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FreeDeliveryBlock)) {
            return false;
        }
        FreeDeliveryBlock freeDeliveryBlock = (FreeDeliveryBlock) obj;
        return L.f(this.f79073b, freeDeliveryBlock.f79073b) && this.f79074c == freeDeliveryBlock.f79074c && this.f79075d == freeDeliveryBlock.f79075d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f79075d) + r.i(this.f79073b.hashCode() * 31, 31, this.f79074c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FreeDeliveryBlock(text=");
        sb2.append(this.f79073b);
        sb2.append(", isRequested=");
        sb2.append(this.f79074c);
        sb2.append(", isLoading=");
        return r.x(sb2, this.f79075d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f79073b);
        parcel.writeInt(this.f79074c ? 1 : 0);
        parcel.writeInt(this.f79075d ? 1 : 0);
    }
}
