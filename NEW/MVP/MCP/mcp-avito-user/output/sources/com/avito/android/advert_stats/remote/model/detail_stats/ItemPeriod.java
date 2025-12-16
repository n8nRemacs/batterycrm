package com.avito.android.advert_stats.remote.model.detail_stats;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DetailAdvertStatistics.kt */
@d
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/avito/android/advert_stats/remote/model/detail_stats/ItemPeriod;", "Landroid/os/Parcelable;", "", "date", "", "dateFormatted", "Lcom/avito/android/advert_stats/remote/model/detail_stats/Stats;", "stats", "description", "", "isCurrentDate", "Lcom/avito/android/advert_stats/remote/model/detail_stats/ContactInfo;", "contactsPerItem", "<init>", "(JLjava/lang/String;Lcom/avito/android/advert_stats/remote/model/detail_stats/Stats;Ljava/lang/String;ZLcom/avito/android/advert_stats/remote/model/detail_stats/ContactInfo;)V", "J", "d", "()J", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "Lcom/avito/android/advert_stats/remote/model/detail_stats/Stats;", "f", "()Lcom/avito/android/advert_stats/remote/model/detail_stats/Stats;", "getDescription", "Z", "g", "()Z", "Lcom/avito/android/advert_stats/remote/model/detail_stats/ContactInfo;", "c", "()Lcom/avito/android/advert_stats/remote/model/detail_stats/ContactInfo;", "_avito-discouraged_avito-api_advert-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ItemPeriod implements Parcelable {

    @k
    public static final Parcelable.Creator<ItemPeriod> CREATOR = new a();

    @c("contactsPerItem")
    @l
    private final ContactInfo contactsPerItem;

    @c("date")
    private final long date;

    @c("dateFormatted")
    @k
    private final String dateFormatted;

    @c("description")
    @l
    private final String description;

    @c("isCurrentDate")
    private final boolean isCurrentDate;

    @c("stats")
    @l
    private final Stats stats;

    /* compiled from: DetailAdvertStatistics.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ItemPeriod> {
        @Override // android.os.Parcelable.Creator
        public final ItemPeriod createFromParcel(Parcel parcel) {
            return new ItemPeriod(parcel.readLong(), parcel.readString(), parcel.readInt() == 0 ? null : Stats.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0 ? ContactInfo.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final ItemPeriod[] newArray(int i12) {
            return new ItemPeriod[i12];
        }
    }

    public ItemPeriod(long j12, @k String str, @l Stats stats, @l String str2, boolean z12, @l ContactInfo contactInfo) {
        this.date = j12;
        this.dateFormatted = str;
        this.stats = stats;
        this.description = str2;
        this.isCurrentDate = z12;
        this.contactsPerItem = contactInfo;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final ContactInfo getContactsPerItem() {
        return this.contactsPerItem;
    }

    /* renamed from: d, reason: from getter */
    public final long getDate() {
        return this.date;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final String getDateFormatted() {
        return this.dateFormatted;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemPeriod)) {
            return false;
        }
        ItemPeriod itemPeriod = (ItemPeriod) obj;
        return this.date == itemPeriod.date && L.f(this.dateFormatted, itemPeriod.dateFormatted) && L.f(this.stats, itemPeriod.stats) && L.f(this.description, itemPeriod.description) && this.isCurrentDate == itemPeriod.isCurrentDate && L.f(this.contactsPerItem, itemPeriod.contactsPerItem);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final Stats getStats() {
        return this.stats;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getIsCurrentDate() {
        return this.isCurrentDate;
    }

    public final int hashCode() {
        int iD2 = H.d(Long.hashCode(this.date) * 31, 31, this.dateFormatted);
        Stats stats = this.stats;
        int iHashCode = (iD2 + (stats == null ? 0 : stats.hashCode())) * 31;
        String str = this.description;
        int i12 = r.i((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.isCurrentDate);
        ContactInfo contactInfo = this.contactsPerItem;
        return i12 + (contactInfo != null ? contactInfo.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "ItemPeriod(date=" + this.date + ", dateFormatted=" + this.dateFormatted + ", stats=" + this.stats + ", description=" + this.description + ", isCurrentDate=" + this.isCurrentDate + ", contactsPerItem=" + this.contactsPerItem + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.date);
        parcel.writeString(this.dateFormatted);
        Stats stats = this.stats;
        if (stats == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            stats.writeToParcel(parcel, i12);
        }
        parcel.writeString(this.description);
        parcel.writeInt(this.isCurrentDate ? 1 : 0);
        ContactInfo contactInfo = this.contactsPerItem;
        if (contactInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            contactInfo.writeToParcel(parcel, i12);
        }
    }

    public /* synthetic */ ItemPeriod(long j12, String str, Stats stats, String str2, boolean z12, ContactInfo contactInfo, int i12, C42822w c42822w) {
        this(j12, str, (i12 & 4) != 0 ? null : stats, (i12 & 8) != 0 ? null : str2, (i12 & 16) != 0 ? false : z12, contactInfo);
    }
}
