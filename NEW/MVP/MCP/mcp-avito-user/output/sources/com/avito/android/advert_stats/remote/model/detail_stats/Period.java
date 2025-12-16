package com.avito.android.advert_stats.remote.model.detail_stats;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DetailAdvertStatistics.kt */
@d
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010 \u001a\u0004\b!\u0010\"R\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010 \u001a\u0004\b#\u0010\"R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lcom/avito/android/advert_stats/remote/model/detail_stats/Period;", "Landroid/os/Parcelable;", "", "dateFrom", "dateTo", "", "favoriteCount", "favoriteDesc", "title", "Lcom/avito/android/advert_stats/remote/model/detail_stats/ContactInfo;", "contactsPerPeriod", "", "Lcom/avito/android/advert_stats/remote/model/detail_stats/FunnelItem;", "funnelItems", "Lcom/avito/android/advert_stats/remote/model/detail_stats/ItemPeriod;", "itemPeriods", "Lcom/avito/android/advert_stats/remote/model/detail_stats/TransitionStats;", "transition", "<init>", "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/advert_stats/remote/model/detail_stats/ContactInfo;Ljava/util/List;Ljava/util/List;Lcom/avito/android/advert_stats/remote/model/detail_stats/TransitionStats;)V", "J", "d", "()J", "e", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "g", "getTitle", "Lcom/avito/android/advert_stats/remote/model/detail_stats/ContactInfo;", "c", "()Lcom/avito/android/advert_stats/remote/model/detail_stats/ContactInfo;", "Ljava/util/List;", "h", "()Ljava/util/List;", "i", "Lcom/avito/android/advert_stats/remote/model/detail_stats/TransitionStats;", "j", "()Lcom/avito/android/advert_stats/remote/model/detail_stats/TransitionStats;", "_avito-discouraged_avito-api_advert-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class Period implements Parcelable {

    @k
    public static final Parcelable.Creator<Period> CREATOR = new a();

    @c("contactsPerPeriod")
    @l
    private final ContactInfo contactsPerPeriod;

    @c("dateFrom")
    private final long dateFrom;

    @c("dateTo")
    private final long dateTo;

    @c("favoriteCount")
    @l
    private final String favoriteCount;

    @c("favoriteDesc")
    @l
    private final String favoriteDesc;

    @c("factors")
    @l
    private final List<FunnelItem> funnelItems;

    @c("items")
    @l
    private final List<ItemPeriod> itemPeriods;

    @c("title")
    @l
    private final String title;

    @c("transition")
    @l
    private final TransitionStats transition;

    /* compiled from: DetailAdvertStatistics.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Period> {
        @Override // android.os.Parcelable.Creator
        public final Period createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            long j12 = parcel.readLong();
            long j13 = parcel.readLong();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            ContactInfo contactInfoCreateFromParcel = parcel.readInt() == 0 ? null : ContactInfo.CREATOR.createFromParcel(parcel);
            int iC2 = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC3 = 0;
                while (iC3 != i12) {
                    iC3 = com.avito.android.actions_sheet.a.c(FunnelItem.CREATOR, parcel, arrayList, iC3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i13);
                while (iC2 != i13) {
                    iC2 = com.avito.android.actions_sheet.a.c(ItemPeriod.CREATOR, parcel, arrayList3, iC2, 1);
                }
                arrayList2 = arrayList3;
            }
            return new Period(j12, j13, string, string2, string3, contactInfoCreateFromParcel, arrayList, arrayList2, parcel.readInt() != 0 ? TransitionStats.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Period[] newArray(int i12) {
            return new Period[i12];
        }
    }

    public Period(long j12, long j13, @l String str, @l String str2, @l String str3, @l ContactInfo contactInfo, @l List<FunnelItem> list, @l List<ItemPeriod> list2, @l TransitionStats transitionStats) {
        this.dateFrom = j12;
        this.dateTo = j13;
        this.favoriteCount = str;
        this.favoriteDesc = str2;
        this.title = str3;
        this.contactsPerPeriod = contactInfo;
        this.funnelItems = list;
        this.itemPeriods = list2;
        this.transition = transitionStats;
    }

    public static Period a(Period period, TransitionStats transitionStats) {
        return new Period(period.dateFrom, period.dateTo, period.favoriteCount, period.favoriteDesc, period.title, period.contactsPerPeriod, period.funnelItems, period.itemPeriods, transitionStats);
    }

    @l
    /* renamed from: c, reason: from getter */
    public final ContactInfo getContactsPerPeriod() {
        return this.contactsPerPeriod;
    }

    /* renamed from: d, reason: from getter */
    public final long getDateFrom() {
        return this.dateFrom;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* renamed from: e, reason: from getter */
    public final long getDateTo() {
        return this.dateTo;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Period)) {
            return false;
        }
        Period period = (Period) obj;
        return this.dateFrom == period.dateFrom && this.dateTo == period.dateTo && L.f(this.favoriteCount, period.favoriteCount) && L.f(this.favoriteDesc, period.favoriteDesc) && L.f(this.title, period.title) && L.f(this.contactsPerPeriod, period.contactsPerPeriod) && L.f(this.funnelItems, period.funnelItems) && L.f(this.itemPeriods, period.itemPeriods) && L.f(this.transition, period.transition);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final String getFavoriteCount() {
        return this.favoriteCount;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final String getFavoriteDesc() {
        return this.favoriteDesc;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @l
    public final List<FunnelItem> h() {
        return this.funnelItems;
    }

    public final int hashCode() {
        int iG2 = r.g(Long.hashCode(this.dateFrom) * 31, 31, this.dateTo);
        String str = this.favoriteCount;
        int iHashCode = (iG2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.favoriteDesc;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ContactInfo contactInfo = this.contactsPerPeriod;
        int iHashCode4 = (iHashCode3 + (contactInfo == null ? 0 : contactInfo.hashCode())) * 31;
        List<FunnelItem> list = this.funnelItems;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<ItemPeriod> list2 = this.itemPeriods;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        TransitionStats transitionStats = this.transition;
        return iHashCode6 + (transitionStats != null ? transitionStats.hashCode() : 0);
    }

    @l
    public final List<ItemPeriod> i() {
        return this.itemPeriods;
    }

    @l
    /* renamed from: j, reason: from getter */
    public final TransitionStats getTransition() {
        return this.transition;
    }

    @k
    public final String toString() {
        return "Period(dateFrom=" + this.dateFrom + ", dateTo=" + this.dateTo + ", favoriteCount=" + this.favoriteCount + ", favoriteDesc=" + this.favoriteDesc + ", title=" + this.title + ", contactsPerPeriod=" + this.contactsPerPeriod + ", funnelItems=" + this.funnelItems + ", itemPeriods=" + this.itemPeriods + ", transition=" + this.transition + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.dateFrom);
        parcel.writeLong(this.dateTo);
        parcel.writeString(this.favoriteCount);
        parcel.writeString(this.favoriteDesc);
        parcel.writeString(this.title);
        ContactInfo contactInfo = this.contactsPerPeriod;
        if (contactInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            contactInfo.writeToParcel(parcel, i12);
        }
        List<FunnelItem> list = this.funnelItems;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((FunnelItem) itA.next()).writeToParcel(parcel, i12);
            }
        }
        List<ItemPeriod> list2 = this.itemPeriods;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                ((ItemPeriod) itA2.next()).writeToParcel(parcel, i12);
            }
        }
        TransitionStats transitionStats = this.transition;
        if (transitionStats == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            transitionStats.writeToParcel(parcel, i12);
        }
    }

    public /* synthetic */ Period(long j12, long j13, String str, String str2, String str3, ContactInfo contactInfo, List list, List list2, TransitionStats transitionStats, int i12, C42822w c42822w) {
        this(j12, j13, str, str2, str3, contactInfo, (i12 & 64) != 0 ? null : list, (i12 & 128) != 0 ? null : list2, (i12 & 256) != 0 ? null : transitionStats);
    }
}
