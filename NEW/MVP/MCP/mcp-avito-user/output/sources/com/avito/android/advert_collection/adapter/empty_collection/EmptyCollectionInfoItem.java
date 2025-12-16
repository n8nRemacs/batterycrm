package com.avito.android.advert_collection.adapter.empty_collection;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.advert_collection.adapter.CollectionWidgetItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;

/* compiled from: EmptyCollectionInfoItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_collection/adapter/empty_collection/EmptyCollectionInfoItem;", "Lcom/avito/android/advert_collection/adapter/CollectionWidgetItem;", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class EmptyCollectionInfoItem implements CollectionWidgetItem {

    @k
    public static final Parcelable.Creator<EmptyCollectionInfoItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f81284b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f81285c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f81286d;

    /* compiled from: EmptyCollectionInfoItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<EmptyCollectionInfoItem> {
        @Override // android.os.Parcelable.Creator
        public final EmptyCollectionInfoItem createFromParcel(Parcel parcel) {
            return new EmptyCollectionInfoItem(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final EmptyCollectionInfoItem[] newArray(int i12) {
            return new EmptyCollectionInfoItem[i12];
        }
    }

    public EmptyCollectionInfoItem(@k String str, @k String str2, boolean z12) {
        this.f81284b = str;
        this.f81285c = str2;
        this.f81286d = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF82737f() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF82736e() {
        return "info_block";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f81284b);
        parcel.writeString(this.f81285c);
        parcel.writeInt(this.f81286d ? 1 : 0);
    }
}
