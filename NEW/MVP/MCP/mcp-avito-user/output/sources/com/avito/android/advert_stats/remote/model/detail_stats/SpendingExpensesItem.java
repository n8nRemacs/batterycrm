package com.avito.android.advert_stats.remote.model.detail_stats;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DetailAdvertExpensesStatistics.kt */
@d
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/avito/android/advert_stats/remote/model/detail_stats/SpendingExpensesItem;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "period", "value", "", "date", "", "Lcom/avito/android/advert_stats/remote/model/detail_stats/SpendingParent;", "spendingItem", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Long;Ljava/util/List;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "f", "Ljava/lang/Long;", "c", "()Ljava/lang/Long;", "Ljava/util/List;", "e", "()Ljava/util/List;", "_avito-discouraged_avito-api_advert-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class SpendingExpensesItem implements Parcelable {

    @k
    public static final Parcelable.Creator<SpendingExpensesItem> CREATOR = new a();

    @c("date")
    @l
    private final Long date;

    @c("period")
    @l
    private final AttributedText period;

    @c("items")
    @l
    private final List<SpendingParent> spendingItem;

    @c("value")
    @l
    private final AttributedText value;

    /* compiled from: DetailAdvertExpensesStatistics.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SpendingExpensesItem> {
        @Override // android.os.Parcelable.Creator
        public final SpendingExpensesItem createFromParcel(Parcel parcel) {
            AttributedText attributedText = (AttributedText) parcel.readParcelable(SpendingExpensesItem.class.getClassLoader());
            AttributedText attributedText2 = (AttributedText) parcel.readParcelable(SpendingExpensesItem.class.getClassLoader());
            ArrayList arrayList = null;
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() != 0) {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(SpendingParent.CREATOR, parcel, arrayList2, iC2, 1);
                }
                arrayList = arrayList2;
            }
            return new SpendingExpensesItem(attributedText, attributedText2, lValueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final SpendingExpensesItem[] newArray(int i12) {
            return new SpendingExpensesItem[i12];
        }
    }

    public SpendingExpensesItem(@l AttributedText attributedText, @l AttributedText attributedText2, @l Long l12, @l List<SpendingParent> list) {
        this.period = attributedText;
        this.value = attributedText2;
        this.date = l12;
        this.spendingItem = list;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Long getDate() {
        return this.date;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final AttributedText getPeriod() {
        return this.period;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    public final List<SpendingParent> e() {
        return this.spendingItem;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpendingExpensesItem)) {
            return false;
        }
        SpendingExpensesItem spendingExpensesItem = (SpendingExpensesItem) obj;
        return L.f(this.period, spendingExpensesItem.period) && L.f(this.value, spendingExpensesItem.value) && L.f(this.date, spendingExpensesItem.date) && L.f(this.spendingItem, spendingExpensesItem.spendingItem);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final AttributedText getValue() {
        return this.value;
    }

    public final int hashCode() {
        AttributedText attributedText = this.period;
        int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
        AttributedText attributedText2 = this.value;
        int iHashCode2 = (iHashCode + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        Long l12 = this.date;
        int iHashCode3 = (iHashCode2 + (l12 == null ? 0 : l12.hashCode())) * 31;
        List<SpendingParent> list = this.spendingItem;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SpendingExpensesItem(period=");
        sb2.append(this.period);
        sb2.append(", value=");
        sb2.append(this.value);
        sb2.append(", date=");
        sb2.append(this.date);
        sb2.append(", spendingItem=");
        return H.p(sb2, this.spendingItem, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.period, i12);
        parcel.writeParcelable(this.value, i12);
        Long l12 = this.date;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        List<SpendingParent> list = this.spendingItem;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            ((SpendingParent) itA.next()).writeToParcel(parcel, i12);
        }
    }
}
