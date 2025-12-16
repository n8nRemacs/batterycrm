package com.avito.android.advert_stats.detail.tab.items.contact;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.advert_stats.detail.tab.stats_item_tab.mvi.entity.StatsItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ContactsPerPeriodItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/items/contact/ContactsPerPeriodItem;", "Lcom/avito/android/advert_stats/detail/tab/stats_item_tab/mvi/entity/StatsItem;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ContactsPerPeriodItem implements StatsItem {

    @k
    public static final Parcelable.Creator<ContactsPerPeriodItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f86379b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f86380c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f86381d;

    /* compiled from: ContactsPerPeriodItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ContactsPerPeriodItem> {
        @Override // android.os.Parcelable.Creator
        public final ContactsPerPeriodItem createFromParcel(Parcel parcel) {
            return new ContactsPerPeriodItem(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ContactsPerPeriodItem[] newArray(int i12) {
            return new ContactsPerPeriodItem[i12];
        }
    }

    public ContactsPerPeriodItem(@k String str, @k String str2, @k String str3) {
        this.f86379b = str;
        this.f86380c = str2;
        this.f86381d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactsPerPeriodItem)) {
            return false;
        }
        ContactsPerPeriodItem contactsPerPeriodItem = (ContactsPerPeriodItem) obj;
        return L.f(this.f86379b, contactsPerPeriodItem.f86379b) && L.f(this.f86380c, contactsPerPeriodItem.f86380c) && L.f(this.f86381d, contactsPerPeriodItem.f86381d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF301522b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF77200c() {
        return this.f86379b;
    }

    public final int hashCode() {
        return this.f86381d.hashCode() + H.d(this.f86379b.hashCode() * 31, 31, this.f86380c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ContactsPerPeriodItem(stringId=");
        sb2.append(this.f86379b);
        sb2.append(", text=");
        sb2.append(this.f86380c);
        sb2.append(", count=");
        return C22026a.c(sb2, this.f86381d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f86379b);
        parcel.writeString(this.f86380c);
        parcel.writeString(this.f86381d);
    }
}
