package com.avito.android.saved_searches.presentation.items.skeletons.header_skeleton;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SavedSearchHeaderSkeletonItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/saved_searches/presentation/items/skeletons/header_skeleton/SavedSearchHeaderSkeletonItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SavedSearchHeaderSkeletonItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<SavedSearchHeaderSkeletonItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f258528b;

    /* compiled from: SavedSearchHeaderSkeletonItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SavedSearchHeaderSkeletonItem> {
        @Override // android.os.Parcelable.Creator
        public final SavedSearchHeaderSkeletonItem createFromParcel(Parcel parcel) {
            return new SavedSearchHeaderSkeletonItem(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SavedSearchHeaderSkeletonItem[] newArray(int i12) {
            return new SavedSearchHeaderSkeletonItem[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SavedSearchHeaderSkeletonItem() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF222258b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF250782b() {
        return this.f258528b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f258528b);
    }

    public SavedSearchHeaderSkeletonItem(@k String str) {
        this.f258528b = str;
    }

    public /* synthetic */ SavedSearchHeaderSkeletonItem(String str, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? SavedSearchHeaderSkeletonItem.class.getName() : str);
    }
}
