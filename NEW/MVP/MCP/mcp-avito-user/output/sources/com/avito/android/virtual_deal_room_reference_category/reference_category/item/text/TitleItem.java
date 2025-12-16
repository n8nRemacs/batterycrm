package com.avito.android.virtual_deal_room_reference_category.reference_category.item.text;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TitleItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/virtual_deal_room_reference_category/reference_category/item/text/TitleItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_virtual-deal-room-reference-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TitleItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<TitleItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f327254b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f327255c;

    /* compiled from: TitleItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TitleItem> {
        @Override // android.os.Parcelable.Creator
        public final TitleItem createFromParcel(Parcel parcel) {
            return new TitleItem(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TitleItem[] newArray(int i12) {
            return new TitleItem[i12];
        }
    }

    public TitleItem(@k String str, @k String str2) {
        this.f327254b = str;
        this.f327255c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TitleItem)) {
            return false;
        }
        TitleItem titleItem = (TitleItem) obj;
        return L.f(this.f327254b, titleItem.f327254b) && L.f(this.f327255c, titleItem.f327255c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF250003b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF324863b() {
        return this.f327254b;
    }

    public final int hashCode() {
        return this.f327255c.hashCode() + (this.f327254b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TitleItem(stringId=");
        sb2.append(this.f327254b);
        sb2.append(", text=");
        return C22026a.c(sb2, this.f327255c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f327254b);
        parcel.writeString(this.f327255c);
    }
}
