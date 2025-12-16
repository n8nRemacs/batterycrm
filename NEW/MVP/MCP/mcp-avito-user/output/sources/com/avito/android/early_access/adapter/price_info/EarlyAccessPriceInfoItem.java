package com.avito.android.early_access.adapter.price_info;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: EarlyAccessPriceInfoItem.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/early_access/adapter/price_info/EarlyAccessPriceInfoItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class EarlyAccessPriceInfoItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<EarlyAccessPriceInfoItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f145154b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f145155c;

    /* compiled from: EarlyAccessPriceInfoItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<EarlyAccessPriceInfoItem> {
        @Override // android.os.Parcelable.Creator
        public final EarlyAccessPriceInfoItem createFromParcel(Parcel parcel) {
            return new EarlyAccessPriceInfoItem(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EarlyAccessPriceInfoItem[] newArray(int i12) {
            return new EarlyAccessPriceInfoItem[i12];
        }
    }

    public EarlyAccessPriceInfoItem(@k String str, @k String str2) {
        this.f145154b = str;
        this.f145155c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EarlyAccessPriceInfoItem)) {
            return false;
        }
        EarlyAccessPriceInfoItem earlyAccessPriceInfoItem = (EarlyAccessPriceInfoItem) obj;
        return L.f(this.f145154b, earlyAccessPriceInfoItem.f145154b) && L.f(this.f145155c, earlyAccessPriceInfoItem.f145155c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF121506b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF271561c() {
        return this.f145154b;
    }

    public final int hashCode() {
        return this.f145155c.hashCode() + (this.f145154b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EarlyAccessPriceInfoItem(stringId=");
        sb2.append(this.f145154b);
        sb2.append(", info=");
        return C22026a.c(sb2, this.f145155c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f145154b);
        parcel.writeString(this.f145155c);
    }

    public /* synthetic */ EarlyAccessPriceInfoItem(String str, String str2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? EarlyAccessPriceInfoItem.class.getName() : str, str2);
    }
}
