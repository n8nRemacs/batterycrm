package com.avito.android.favorites;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.ParcelableEntity;
import kotlin.Metadata;

/* compiled from: OrderEntity.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/favorites/OrderEntity;", "Lcom/avito/android/remote/model/ParcelableEntity;", "", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OrderEntity implements ParcelableEntity<String> {

    @Y61.k
    public static final Parcelable.Creator<OrderEntity> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f156311b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f156312c;

    /* compiled from: OrderEntity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<OrderEntity> {
        @Override // android.os.Parcelable.Creator
        public final OrderEntity createFromParcel(Parcel parcel) {
            return new OrderEntity(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OrderEntity[] newArray(int i12) {
            return new OrderEntity[i12];
        }
    }

    public OrderEntity(@Y61.k String str, @Y61.k String str2) {
        this.f156311b = str;
        this.f156312c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.remote.model.Entity
    public final Object getId() {
        return this.f156311b;
    }

    @Override // com.avito.android.remote.model.Entity
    @Y61.k
    /* renamed from: getName, reason: from getter */
    public final String getF156312c() {
        return this.f156312c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f156311b);
        parcel.writeString(this.f156312c);
    }
}
