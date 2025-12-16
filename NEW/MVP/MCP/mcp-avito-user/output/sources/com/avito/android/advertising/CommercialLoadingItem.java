package com.avito.android.advertising;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.advertising.CommercialItem;
import com.avito.android.grid.GridElementType;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CommercialItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/CommercialLoadingItem;", "Lcom/avito/android/advertising/CommercialItem;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CommercialLoadingItem implements CommercialItem {

    @Y61.k
    public static final Parcelable.Creator<CommercialLoadingItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final CommercialBanner f86897b;

    /* compiled from: CommercialItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CommercialLoadingItem> {
        @Override // android.os.Parcelable.Creator
        public final CommercialLoadingItem createFromParcel(Parcel parcel) {
            return new CommercialLoadingItem(CommercialBanner.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final CommercialLoadingItem[] newArray(int i12) {
            return new CommercialLoadingItem[i12];
        }
    }

    public CommercialLoadingItem(@Y61.k CommercialBanner commercialBanner) {
        this.f86897b = commercialBanner;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CommercialLoadingItem) && L.f(this.f86897b, ((CommercialLoadingItem) obj).f86897b);
    }

    @Override // QH.a
    @Y61.k
    /* renamed from: getGridType */
    public final GridElementType getF154209c() {
        return GridElementType.FullWidth.f161209b;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF78384b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId */
    public final String getF78385c() {
        return this.f86897b.f86885b;
    }

    public final int hashCode() {
        return this.f86897b.hashCode();
    }

    @Override // com.avito.android.advertising.CommercialItem
    public final boolean isContentEqualWith(@Y61.k Object obj) {
        return CommercialItem.a.a(this, obj);
    }

    @Y61.k
    public final String toString() {
        return "CommercialLoadingItem(commercialBanner=" + this.f86897b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        this.f86897b.writeToParcel(parcel, i12);
    }
}
