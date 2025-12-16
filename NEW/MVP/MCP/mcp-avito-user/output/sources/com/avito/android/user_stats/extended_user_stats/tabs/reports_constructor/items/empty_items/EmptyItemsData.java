package com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.empty_items;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.user_stats.extended_user_stats.tabs.expenses.mvi.entity.ExpensesItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EmptyItemsData.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/items/empty_items/EmptyItemsData;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/mvi/entity/ExpensesItem;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class EmptyItemsData implements ExpensesItem {

    @k
    public static final Parcelable.Creator<EmptyItemsData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f317998b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f317999c;

    /* compiled from: EmptyItemsData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<EmptyItemsData> {
        @Override // android.os.Parcelable.Creator
        public final EmptyItemsData createFromParcel(Parcel parcel) {
            return new EmptyItemsData(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EmptyItemsData[] newArray(int i12) {
            return new EmptyItemsData[i12];
        }
    }

    public EmptyItemsData(@k String str, @k String str2) {
        this.f317998b = str;
        this.f317999c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmptyItemsData)) {
            return false;
        }
        EmptyItemsData emptyItemsData = (EmptyItemsData) obj;
        return L.f(this.f317998b, emptyItemsData.f317998b) && L.f(this.f317999c, emptyItemsData.f317999c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF301522b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF317998b() {
        return this.f317998b;
    }

    public final int hashCode() {
        return this.f317999c.hashCode() + (this.f317998b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EmptyItemsData(stringId=");
        sb2.append(this.f317998b);
        sb2.append(", value=");
        return C22026a.c(sb2, this.f317999c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f317998b);
        parcel.writeString(this.f317999c);
    }
}
