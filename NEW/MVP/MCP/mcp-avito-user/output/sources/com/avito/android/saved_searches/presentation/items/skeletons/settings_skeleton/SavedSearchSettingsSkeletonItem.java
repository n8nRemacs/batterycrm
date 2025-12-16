package com.avito.android.saved_searches.presentation.items.skeletons.settings_skeleton;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SavedSearchSettingsSkeletonItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/saved_searches/presentation/items/skeletons/settings_skeleton/SavedSearchSettingsSkeletonItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SavedSearchSettingsSkeletonItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<SavedSearchSettingsSkeletonItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f258540b;

    /* compiled from: SavedSearchSettingsSkeletonItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SavedSearchSettingsSkeletonItem> {
        @Override // android.os.Parcelable.Creator
        public final SavedSearchSettingsSkeletonItem createFromParcel(Parcel parcel) {
            return new SavedSearchSettingsSkeletonItem(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SavedSearchSettingsSkeletonItem[] newArray(int i12) {
            return new SavedSearchSettingsSkeletonItem[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SavedSearchSettingsSkeletonItem() {
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
        return this.f258540b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f258540b);
    }

    public SavedSearchSettingsSkeletonItem(@k String str) {
        this.f258540b = str;
    }

    public /* synthetic */ SavedSearchSettingsSkeletonItem(String str, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? SavedSearchSettingsSkeletonItem.class.getName() : str);
    }
}
