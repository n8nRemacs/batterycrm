package com.avito.android.saved_searches.presentation.items.banner;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.saved_searches.model.SavedSearchData;
import com.avito.android.saved_searches.presentation.items.CommunicationType;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SavedSearchBannerItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/saved_searches/presentation/items/banner/SavedSearchBannerItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SavedSearchBannerItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<SavedSearchBannerItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f258422b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final SavedSearchData.Settings.WarningBanner f258423c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final CommunicationType f258424d;

    /* compiled from: SavedSearchBannerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SavedSearchBannerItem> {
        @Override // android.os.Parcelable.Creator
        public final SavedSearchBannerItem createFromParcel(Parcel parcel) {
            return new SavedSearchBannerItem(parcel.readString(), (SavedSearchData.Settings.WarningBanner) parcel.readParcelable(SavedSearchBannerItem.class.getClassLoader()), CommunicationType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final SavedSearchBannerItem[] newArray(int i12) {
            return new SavedSearchBannerItem[i12];
        }
    }

    public SavedSearchBannerItem(@k String str, @k SavedSearchData.Settings.WarningBanner warningBanner, @k CommunicationType communicationType) {
        this.f258422b = str;
        this.f258423c = warningBanner;
        this.f258424d = communicationType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SavedSearchBannerItem)) {
            return false;
        }
        SavedSearchBannerItem savedSearchBannerItem = (SavedSearchBannerItem) obj;
        return L.f(this.f258422b, savedSearchBannerItem.f258422b) && L.f(this.f258423c, savedSearchBannerItem.f258423c) && this.f258424d == savedSearchBannerItem.f258424d;
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF223480b() {
        return this.f258422b;
    }

    public final int hashCode() {
        return this.f258424d.hashCode() + ((this.f258423c.hashCode() + (this.f258422b.hashCode() * 31)) * 31);
    }

    @k
    public final String toString() {
        return "SavedSearchBannerItem(stringId=" + this.f258422b + ", warningBanner=" + this.f258423c + ", type=" + this.f258424d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f258422b);
        parcel.writeParcelable(this.f258423c, i12);
        parcel.writeString(this.f258424d.name());
    }
}
