package com.avito.android.comfortable_deal.submitting.recycler.items.NumeratedBulletItem;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: NumeratedBulletItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/submitting/recycler/items/NumeratedBulletItem/NumeratedBulletItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class NumeratedBulletItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<NumeratedBulletItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f123209b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Integer f123210c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f123211d;

    /* compiled from: NumeratedBulletItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<NumeratedBulletItem> {
        @Override // android.os.Parcelable.Creator
        public final NumeratedBulletItem createFromParcel(Parcel parcel) {
            return new NumeratedBulletItem(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NumeratedBulletItem[] newArray(int i12) {
            return new NumeratedBulletItem[i12];
        }
    }

    public NumeratedBulletItem(@k String str, @l Integer num, @k String str2) {
        this.f123209b = str;
        this.f123210c = num;
        this.f123211d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NumeratedBulletItem)) {
            return false;
        }
        NumeratedBulletItem numeratedBulletItem = (NumeratedBulletItem) obj;
        return L.f(this.f123209b, numeratedBulletItem.f123209b) && L.f(this.f123210c, numeratedBulletItem.f123210c) && L.f(this.f123211d, numeratedBulletItem.f123211d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF189215e() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF288414b() {
        return this.f123209b;
    }

    public final int hashCode() {
        int iHashCode = this.f123209b.hashCode() * 31;
        Integer num = this.f123210c;
        return this.f123211d.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NumeratedBulletItem(stringId=");
        sb2.append(this.f123209b);
        sb2.append(", number=");
        sb2.append(this.f123210c);
        sb2.append(", title=");
        return C22026a.c(sb2, this.f123211d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f123209b);
        Integer num = this.f123210c;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeString(this.f123211d);
    }
}
