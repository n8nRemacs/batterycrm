package com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.date_select;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.user_stats.extended_user_stats.tabs.expenses.mvi.entity.ExpensesItem;
import com.avito.conveyor_item.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DateSelectItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/items/date_select/DateSelectItem;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/mvi/entity/ExpensesItem;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DateSelectItem implements ExpensesItem {

    @k
    public static final Parcelable.Creator<DateSelectItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f317713b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final SegmentType f317714c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<String> f317715d;

    /* compiled from: DateSelectItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DateSelectItem> {
        @Override // android.os.Parcelable.Creator
        public final DateSelectItem createFromParcel(Parcel parcel) {
            return new DateSelectItem(parcel.readString(), parcel.readInt() == 0 ? null : SegmentType.valueOf(parcel.readString()), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final DateSelectItem[] newArray(int i12) {
            return new DateSelectItem[i12];
        }
    }

    public DateSelectItem(@k String str, @l SegmentType segmentType, @k List<String> list) {
        this.f317713b = str;
        this.f317714c = segmentType;
        this.f317715d = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DateSelectItem)) {
            return false;
        }
        DateSelectItem dateSelectItem = (DateSelectItem) obj;
        return L.f(this.f317713b, dateSelectItem.f317713b) && this.f317714c == dateSelectItem.f317714c && L.f(this.f317715d, dateSelectItem.f317715d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF272437b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF317713b() {
        return this.f317713b;
    }

    public final int hashCode() {
        int iHashCode = this.f317713b.hashCode() * 31;
        SegmentType segmentType = this.f317714c;
        return this.f317715d.hashCode() + ((iHashCode + (segmentType == null ? 0 : segmentType.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DateSelectItem(stringId=");
        sb2.append(this.f317713b);
        sb2.append(", selectedSegment=");
        sb2.append(this.f317714c);
        sb2.append(", periods=");
        return H.p(sb2, this.f317715d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f317713b);
        SegmentType segmentType = this.f317714c;
        if (segmentType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(segmentType.name());
        }
        parcel.writeStringList(this.f317715d);
    }
}
