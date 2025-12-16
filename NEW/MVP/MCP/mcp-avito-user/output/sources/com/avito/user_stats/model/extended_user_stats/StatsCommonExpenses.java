package com.avito.user_stats.model.extended_user_stats;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StatsCommonExpenses.kt */
@d
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/avito/user_stats/model/extended_user_stats/StatsCommonExpenses;", "Landroid/os/Parcelable;", "", "realSymbol", "Lcom/avito/user_stats/model/extended_user_stats/StatsBonus;", "bonus", "", "Lcom/avito/user_stats/model/extended_user_stats/StatsServices;", "services", "Lcom/avito/user_stats/model/extended_user_stats/StatsDates;", "dates", "Lcom/avito/user_stats/model/extended_user_stats/UserMessage;", "userMessage", "<init>", "(Ljava/lang/String;Lcom/avito/user_stats/model/extended_user_stats/StatsBonus;Ljava/util/List;Ljava/util/List;Lcom/avito/user_stats/model/extended_user_stats/UserMessage;)V", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "Lcom/avito/user_stats/model/extended_user_stats/StatsBonus;", "c", "()Lcom/avito/user_stats/model/extended_user_stats/StatsBonus;", "Ljava/util/List;", "f", "()Ljava/util/List;", "d", "Lcom/avito/user_stats/model/extended_user_stats/UserMessage;", "g", "()Lcom/avito/user_stats/model/extended_user_stats/UserMessage;", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class StatsCommonExpenses implements Parcelable {

    @k
    public static final Parcelable.Creator<StatsCommonExpenses> CREATOR = new a();

    @c("bonus")
    @l
    private final StatsBonus bonus;

    @c("dates")
    @l
    private final List<StatsDates> dates;

    @c("realSymbol")
    @l
    private final String realSymbol;

    @c("services")
    @l
    private final List<StatsServices> services;

    @c("userMessage")
    @l
    private final UserMessage userMessage;

    /* compiled from: StatsCommonExpenses.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<StatsCommonExpenses> {
        @Override // android.os.Parcelable.Creator
        public final StatsCommonExpenses createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            String string = parcel.readString();
            StatsBonus statsBonusCreateFromParcel = parcel.readInt() == 0 ? null : StatsBonus.CREATOR.createFromParcel(parcel);
            int iC2 = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC3 = 0;
                while (iC3 != i12) {
                    iC3 = com.avito.android.actions_sheet.a.c(StatsServices.CREATOR, parcel, arrayList, iC3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i13);
                while (iC2 != i13) {
                    iC2 = com.avito.android.actions_sheet.a.c(StatsDates.CREATOR, parcel, arrayList3, iC2, 1);
                }
                arrayList2 = arrayList3;
            }
            return new StatsCommonExpenses(string, statsBonusCreateFromParcel, arrayList, arrayList2, parcel.readInt() != 0 ? UserMessage.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final StatsCommonExpenses[] newArray(int i12) {
            return new StatsCommonExpenses[i12];
        }
    }

    public StatsCommonExpenses(@l String str, @l StatsBonus statsBonus, @l List<StatsServices> list, @l List<StatsDates> list2, @l UserMessage userMessage) {
        this.realSymbol = str;
        this.bonus = statsBonus;
        this.services = list;
        this.dates = list2;
        this.userMessage = userMessage;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final StatsBonus getBonus() {
        return this.bonus;
    }

    @l
    public final List<StatsDates> d() {
        return this.dates;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final String getRealSymbol() {
        return this.realSymbol;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatsCommonExpenses)) {
            return false;
        }
        StatsCommonExpenses statsCommonExpenses = (StatsCommonExpenses) obj;
        return L.f(this.realSymbol, statsCommonExpenses.realSymbol) && L.f(this.bonus, statsCommonExpenses.bonus) && L.f(this.services, statsCommonExpenses.services) && L.f(this.dates, statsCommonExpenses.dates) && L.f(this.userMessage, statsCommonExpenses.userMessage);
    }

    @l
    public final List<StatsServices> f() {
        return this.services;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final UserMessage getUserMessage() {
        return this.userMessage;
    }

    public final int hashCode() {
        String str = this.realSymbol;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        StatsBonus statsBonus = this.bonus;
        int iHashCode2 = (iHashCode + (statsBonus == null ? 0 : statsBonus.hashCode())) * 31;
        List<StatsServices> list = this.services;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<StatsDates> list2 = this.dates;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        UserMessage userMessage = this.userMessage;
        return iHashCode4 + (userMessage != null ? userMessage.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "StatsCommonExpenses(realSymbol=" + this.realSymbol + ", bonus=" + this.bonus + ", services=" + this.services + ", dates=" + this.dates + ", userMessage=" + this.userMessage + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.realSymbol);
        StatsBonus statsBonus = this.bonus;
        if (statsBonus == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            statsBonus.writeToParcel(parcel, i12);
        }
        List<StatsServices> list = this.services;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((StatsServices) itA.next()).writeToParcel(parcel, i12);
            }
        }
        List<StatsDates> list2 = this.dates;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                ((StatsDates) itA2.next()).writeToParcel(parcel, i12);
            }
        }
        UserMessage userMessage = this.userMessage;
        if (userMessage == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            userMessage.writeToParcel(parcel, i12);
        }
    }
}
