package com.avito.android.short_term_rent.bookingform.items.spacing;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SpacingItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/items/spacing/SpacingItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SpacingItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<SpacingItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f281662b;

    /* renamed from: c, reason: collision with root package name */
    public final int f281663c;

    /* compiled from: SpacingItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SpacingItem> {
        @Override // android.os.Parcelable.Creator
        public final SpacingItem createFromParcel(Parcel parcel) {
            return new SpacingItem(parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final SpacingItem[] newArray(int i12) {
            return new SpacingItem[i12];
        }
    }

    public SpacingItem(@k String str, int i12) {
        this.f281662b = str;
        this.f281663c = i12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpacingItem)) {
            return false;
        }
        SpacingItem spacingItem = (SpacingItem) obj;
        return L.f(this.f281662b, spacingItem.f281662b) && this.f281663c == spacingItem.f281663c;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF395939g() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF275042h() {
        return this.f281662b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f281663c) + (this.f281662b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SpacingItem(stringId=");
        sb2.append(this.f281662b);
        sb2.append(", height=");
        return r.t(sb2, this.f281663c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f281662b);
        parcel.writeInt(this.f281663c);
    }
}
