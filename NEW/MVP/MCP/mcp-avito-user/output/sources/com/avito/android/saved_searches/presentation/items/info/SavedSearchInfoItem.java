package com.avito.android.saved_searches.presentation.items.info;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SavedSearchInfoItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/saved_searches/presentation/items/info/SavedSearchInfoItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SavedSearchInfoItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<SavedSearchInfoItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f258489b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final AttributedText f258490c;

    /* compiled from: SavedSearchInfoItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SavedSearchInfoItem> {
        @Override // android.os.Parcelable.Creator
        public final SavedSearchInfoItem createFromParcel(Parcel parcel) {
            return new SavedSearchInfoItem(parcel.readString(), (AttributedText) parcel.readParcelable(SavedSearchInfoItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SavedSearchInfoItem[] newArray(int i12) {
            return new SavedSearchInfoItem[i12];
        }
    }

    public SavedSearchInfoItem(@k String str, @l AttributedText attributedText) {
        this.f258489b = str;
        this.f258490c = attributedText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SavedSearchInfoItem)) {
            return false;
        }
        SavedSearchInfoItem savedSearchInfoItem = (SavedSearchInfoItem) obj;
        return L.f(this.f258489b, savedSearchInfoItem.f258489b) && L.f(this.f258490c, savedSearchInfoItem.f258490c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85138b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF85139c() {
        return this.f258489b;
    }

    public final int hashCode() {
        int iHashCode = this.f258489b.hashCode() * 31;
        AttributedText attributedText = this.f258490c;
        return iHashCode + (attributedText == null ? 0 : attributedText.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SavedSearchInfoItem(stringId=");
        sb2.append(this.f258489b);
        sb2.append(", info=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f258490c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f258489b);
        parcel.writeParcelable(this.f258490c, i12);
    }

    public /* synthetic */ SavedSearchInfoItem(String str, AttributedText attributedText, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : attributedText);
    }
}
