package com.avito.android.saved_searches.presentation.items.switcher;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.saved_searches.model.SavedSearchData;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SavedSearchSwitcherItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/saved_searches/presentation/items/switcher/SavedSearchSwitcherItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SavedSearchSwitcherItem implements ParcelableItem {

    @Y61.k
    public static final Parcelable.Creator<SavedSearchSwitcherItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f258546b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final SavedSearchData.Settings.Push f258547c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final SavedSearchData.Settings.Email f258548d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f258549e;

    /* compiled from: SavedSearchSwitcherItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SavedSearchSwitcherItem> {
        @Override // android.os.Parcelable.Creator
        public final SavedSearchSwitcherItem createFromParcel(Parcel parcel) {
            return new SavedSearchSwitcherItem(parcel.readString(), (SavedSearchData.Settings.Push) parcel.readParcelable(SavedSearchSwitcherItem.class.getClassLoader()), (SavedSearchData.Settings.Email) parcel.readParcelable(SavedSearchSwitcherItem.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final SavedSearchSwitcherItem[] newArray(int i12) {
            return new SavedSearchSwitcherItem[i12];
        }
    }

    public SavedSearchSwitcherItem(@Y61.k String str, @Y61.l SavedSearchData.Settings.Push push, @Y61.l SavedSearchData.Settings.Email email, boolean z12) {
        this.f258546b = str;
        this.f258547c = push;
        this.f258548d = email;
        this.f258549e = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SavedSearchSwitcherItem)) {
            return false;
        }
        SavedSearchSwitcherItem savedSearchSwitcherItem = (SavedSearchSwitcherItem) obj;
        return L.f(this.f258546b, savedSearchSwitcherItem.f258546b) && L.f(this.f258547c, savedSearchSwitcherItem.f258547c) && L.f(this.f258548d, savedSearchSwitcherItem.f258548d) && this.f258549e == savedSearchSwitcherItem.f258549e;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83558b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF245314f() {
        return this.f258546b;
    }

    public final int hashCode() {
        int iHashCode = this.f258546b.hashCode() * 31;
        SavedSearchData.Settings.Push push = this.f258547c;
        int iHashCode2 = (iHashCode + (push == null ? 0 : push.hashCode())) * 31;
        SavedSearchData.Settings.Email email = this.f258548d;
        return Boolean.hashCode(this.f258549e) + ((iHashCode2 + (email != null ? email.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SavedSearchSwitcherItem(stringId=");
        sb2.append(this.f258546b);
        sb2.append(", pushSettings=");
        sb2.append(this.f258547c);
        sb2.append(", emailSettings=");
        sb2.append(this.f258548d);
        sb2.append(", showAttention=");
        return r.x(sb2, this.f258549e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f258546b);
        parcel.writeParcelable(this.f258547c, i12);
        parcel.writeParcelable(this.f258548d, i12);
        parcel.writeInt(this.f258549e ? 1 : 0);
    }

    public /* synthetic */ SavedSearchSwitcherItem(String str, SavedSearchData.Settings.Push push, SavedSearchData.Settings.Email email, boolean z12, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : push, (i12 & 4) != 0 ? null : email, (i12 & 8) != 0 ? false : z12);
    }
}
