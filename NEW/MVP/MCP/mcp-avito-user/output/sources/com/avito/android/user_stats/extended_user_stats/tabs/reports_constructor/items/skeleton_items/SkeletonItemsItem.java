package com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.skeleton_items;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.user_stats.extended_user_stats.tabs.expenses.mvi.entity.ExpensesItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SkeletonItemsItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/items/skeleton_items/SkeletonItemsItem;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/mvi/entity/ExpensesItem;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SkeletonItemsItem implements ExpensesItem {

    @k
    public static final Parcelable.Creator<SkeletonItemsItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f318069b;

    /* compiled from: SkeletonItemsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SkeletonItemsItem> {
        @Override // android.os.Parcelable.Creator
        public final SkeletonItemsItem createFromParcel(Parcel parcel) {
            return new SkeletonItemsItem(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SkeletonItemsItem[] newArray(int i12) {
            return new SkeletonItemsItem[i12];
        }
    }

    public SkeletonItemsItem(@k String str) {
        this.f318069b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SkeletonItemsItem) && L.f(this.f318069b, ((SkeletonItemsItem) obj).f318069b);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207369c() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF12156b() {
        return this.f318069b;
    }

    public final int hashCode() {
        return this.f318069b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("SkeletonItemsItem(stringId="), this.f318069b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f318069b);
    }
}
