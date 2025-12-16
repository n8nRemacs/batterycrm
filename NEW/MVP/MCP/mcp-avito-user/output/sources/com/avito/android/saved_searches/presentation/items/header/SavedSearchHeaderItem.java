package com.avito.android.saved_searches.presentation.items.header;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SavedSearchHeaderItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/saved_searches/presentation/items/header/SavedSearchHeaderItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SavedSearchHeaderItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<SavedSearchHeaderItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f258479b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f258480c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f258481d;

    /* compiled from: SavedSearchHeaderItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SavedSearchHeaderItem> {
        @Override // android.os.Parcelable.Creator
        public final SavedSearchHeaderItem createFromParcel(Parcel parcel) {
            return new SavedSearchHeaderItem(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SavedSearchHeaderItem[] newArray(int i12) {
            return new SavedSearchHeaderItem[i12];
        }
    }

    public SavedSearchHeaderItem(@k String str, @l String str2, @l String str3) {
        this.f258479b = str;
        this.f258480c = str2;
        this.f258481d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SavedSearchHeaderItem)) {
            return false;
        }
        SavedSearchHeaderItem savedSearchHeaderItem = (SavedSearchHeaderItem) obj;
        return L.f(this.f258479b, savedSearchHeaderItem.f258479b) && L.f(this.f258480c, savedSearchHeaderItem.f258480c) && L.f(this.f258481d, savedSearchHeaderItem.f258481d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207369c() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF250429b() {
        return this.f258479b;
    }

    public final int hashCode() {
        int iHashCode = this.f258479b.hashCode() * 31;
        String str = this.f258480c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f258481d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SavedSearchHeaderItem(stringId=");
        sb2.append(this.f258479b);
        sb2.append(", title=");
        sb2.append(this.f258480c);
        sb2.append(", subtitle=");
        return C22026a.c(sb2, this.f258481d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f258479b);
        parcel.writeString(this.f258480c);
        parcel.writeString(this.f258481d);
    }

    public /* synthetic */ SavedSearchHeaderItem(String str, String str2, String str3, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3);
    }
}
