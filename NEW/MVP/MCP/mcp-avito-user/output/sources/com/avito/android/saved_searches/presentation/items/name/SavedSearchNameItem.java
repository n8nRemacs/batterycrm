package com.avito.android.saved_searches.presentation.items.name;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SavedSearchNameItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/saved_searches/presentation/items/name/SavedSearchNameItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SavedSearchNameItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<SavedSearchNameItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f258500b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f258501c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f258502d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f258503e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f258504f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final AttributedText f258505g;

    /* compiled from: SavedSearchNameItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SavedSearchNameItem> {
        @Override // android.os.Parcelable.Creator
        public final SavedSearchNameItem createFromParcel(Parcel parcel) {
            return new SavedSearchNameItem(parcel.readString(), parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(SavedSearchNameItem.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SavedSearchNameItem[] newArray(int i12) {
            return new SavedSearchNameItem[i12];
        }
    }

    public SavedSearchNameItem(@k String str, @k String str2, @l String str3, @l AttributedText attributedText, @l String str4, @l String str5) {
        this.f258500b = str;
        this.f258501c = str2;
        this.f258502d = str3;
        this.f258503e = str4;
        this.f258504f = str5;
        this.f258505g = attributedText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SavedSearchNameItem)) {
            return false;
        }
        SavedSearchNameItem savedSearchNameItem = (SavedSearchNameItem) obj;
        return L.f(this.f258500b, savedSearchNameItem.f258500b) && L.f(this.f258501c, savedSearchNameItem.f258501c) && L.f(this.f258502d, savedSearchNameItem.f258502d) && L.f(this.f258503e, savedSearchNameItem.f258503e) && L.f(this.f258504f, savedSearchNameItem.f258504f) && L.f(this.f258505g, savedSearchNameItem.f258505g);
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    public final String getStringId() {
        return this.f258500b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f258500b.hashCode() * 31, 31, this.f258501c);
        String str = this.f258502d;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f258503e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f258504f;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        AttributedText attributedText = this.f258505g;
        return iHashCode3 + (attributedText != null ? attributedText.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SavedSearchNameItem(stringId=");
        sb2.append(this.f258500b);
        sb2.append(", paramId=");
        sb2.append(this.f258501c);
        sb2.append(", title=");
        sb2.append(this.f258502d);
        sb2.append(", value=");
        sb2.append(this.f258503e);
        sb2.append(", placeholder=");
        sb2.append(this.f258504f);
        sb2.append(", motivation=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f258505g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f258500b);
        parcel.writeString(this.f258501c);
        parcel.writeString(this.f258502d);
        parcel.writeString(this.f258503e);
        parcel.writeString(this.f258504f);
        parcel.writeParcelable(this.f258505g, i12);
    }

    public /* synthetic */ SavedSearchNameItem(String str, String str2, String str3, String str4, String str5, AttributedText attributedText, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? null : str3, (i12 & 32) != 0 ? null : attributedText, (i12 & 8) != 0 ? null : str4, (i12 & 16) != 0 ? null : str5);
    }
}
