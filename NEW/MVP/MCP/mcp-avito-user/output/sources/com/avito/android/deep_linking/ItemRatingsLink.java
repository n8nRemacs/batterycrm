package com.avito.android.deep_linking;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: ItemRatingsLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/ItemRatingsLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_rating_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class ItemRatingsLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<ItemRatingsLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f132846b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f132847c;

    /* compiled from: ItemRatingsLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ItemRatingsLink> {
        @Override // android.os.Parcelable.Creator
        public final ItemRatingsLink createFromParcel(Parcel parcel) {
            return new ItemRatingsLink(parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ItemRatingsLink[] newArray(int i12) {
            return new ItemRatingsLink[i12];
        }
    }

    public ItemRatingsLink(long j12, @Y61.l String str) {
        this.f132846b = j12;
        this.f132847c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemRatingsLink)) {
            return false;
        }
        ItemRatingsLink itemRatingsLink = (ItemRatingsLink) obj;
        return this.f132846b == itemRatingsLink.f132846b && kotlin.jvm.internal.L.f(this.f132847c, itemRatingsLink.f132847c);
    }

    @Y61.l
    /* renamed from: getContext, reason: from getter */
    public final String getF132847c() {
        return this.f132847c;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f132846b) * 31;
        String str = this.f132847c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ItemRatingsLink(itemId=");
        sb2.append(this.f132846b);
        sb2.append(", context=");
        return C22026a.c(sb2, this.f132847c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f132846b);
        parcel.writeString(this.f132847c);
    }
}
