package com.avito.android.profile_settings_extended.adapter.item_selections.adapter.empty;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.profile_settings_extended.adapter.item_selections.adapter.SelectionsRecyclerItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectionPlaceholderItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/item_selections/adapter/empty/SelectionPlaceholderItem;", "Lcom/avito/android/profile_settings_extended/adapter/item_selections/adapter/SelectionsRecyclerItem;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class SelectionPlaceholderItem implements SelectionsRecyclerItem {

    @k
    public static final Parcelable.Creator<SelectionPlaceholderItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f229550b;

    /* compiled from: SelectionPlaceholderItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SelectionPlaceholderItem> {
        @Override // android.os.Parcelable.Creator
        public final SelectionPlaceholderItem createFromParcel(Parcel parcel) {
            return new SelectionPlaceholderItem(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SelectionPlaceholderItem[] newArray(int i12) {
            return new SelectionPlaceholderItem[i12];
        }
    }

    public SelectionPlaceholderItem(@k String str) {
        this.f229550b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SelectionPlaceholderItem) && L.f(this.f229550b, ((SelectionPlaceholderItem) obj).f229550b);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF222262b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF215037b() {
        return this.f229550b;
    }

    public final int hashCode() {
        return this.f229550b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("SelectionPlaceholderItem(stringId="), this.f229550b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f229550b);
    }
}
