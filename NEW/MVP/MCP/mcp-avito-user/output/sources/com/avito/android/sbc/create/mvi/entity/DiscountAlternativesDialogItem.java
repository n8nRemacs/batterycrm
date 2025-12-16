package com.avito.android.sbc.create.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CreateDiscountDispatchState.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/create/mvi/entity/DiscountAlternativesDialogItem;", "Landroid/os/Parcelable;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DiscountAlternativesDialogItem implements Parcelable {

    @k
    public static final Parcelable.Creator<DiscountAlternativesDialogItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f259789b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f259790c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f259791d;

    /* compiled from: CreateDiscountDispatchState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DiscountAlternativesDialogItem> {
        @Override // android.os.Parcelable.Creator
        public final DiscountAlternativesDialogItem createFromParcel(Parcel parcel) {
            return new DiscountAlternativesDialogItem(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final DiscountAlternativesDialogItem[] newArray(int i12) {
            return new DiscountAlternativesDialogItem[i12];
        }
    }

    public DiscountAlternativesDialogItem(@k String str, @k String str2, boolean z12) {
        this.f259789b = str;
        this.f259790c = str2;
        this.f259791d = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiscountAlternativesDialogItem)) {
            return false;
        }
        DiscountAlternativesDialogItem discountAlternativesDialogItem = (DiscountAlternativesDialogItem) obj;
        return L.f(this.f259789b, discountAlternativesDialogItem.f259789b) && L.f(this.f259790c, discountAlternativesDialogItem.f259790c) && this.f259791d == discountAlternativesDialogItem.f259791d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f259791d) + H.d(this.f259789b.hashCode() * 31, 31, this.f259790c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DiscountAlternativesDialogItem(name=");
        sb2.append(this.f259789b);
        sb2.append(", slug=");
        sb2.append(this.f259790c);
        sb2.append(", needOnboarding=");
        return r.x(sb2, this.f259791d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f259789b);
        parcel.writeString(this.f259790c);
        parcel.writeInt(this.f259791d ? 1 : 0);
    }
}
