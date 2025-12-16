package com.avito.user_stats.model.extended_user_stats;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StatsSplitLocal.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/user_stats/model/extended_user_stats/SplitMetricsItem;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SplitMetricsItem implements Parcelable {

    @k
    public static final Parcelable.Creator<SplitMetricsItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final ArrayList f338656b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f338657c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f338658d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final DynamicItemsMetrics f338659e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final MetricsItemType f338660f;

    /* compiled from: StatsSplitLocal.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SplitMetricsItem> {
        @Override // android.os.Parcelable.Creator
        public final SplitMetricsItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(SplitMetricsItemHint.CREATOR, parcel, arrayList2, iC2, 1);
                }
                arrayList = arrayList2;
            }
            return new SplitMetricsItem(arrayList, parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? DynamicItemsMetrics.CREATOR.createFromParcel(parcel) : null, MetricsItemType.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final SplitMetricsItem[] newArray(int i12) {
            return new SplitMetricsItem[i12];
        }
    }

    public SplitMetricsItem(@l ArrayList arrayList, @k String str, @l String str2, @l DynamicItemsMetrics dynamicItemsMetrics, @k MetricsItemType metricsItemType) {
        this.f338656b = arrayList;
        this.f338657c = str;
        this.f338658d = str2;
        this.f338659e = dynamicItemsMetrics;
        this.f338660f = metricsItemType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplitMetricsItem)) {
            return false;
        }
        SplitMetricsItem splitMetricsItem = (SplitMetricsItem) obj;
        return L.f(this.f338656b, splitMetricsItem.f338656b) && L.f(this.f338657c, splitMetricsItem.f338657c) && L.f(this.f338658d, splitMetricsItem.f338658d) && L.f(this.f338659e, splitMetricsItem.f338659e) && this.f338660f == splitMetricsItem.f338660f;
    }

    public final int hashCode() {
        ArrayList arrayList = this.f338656b;
        int iD2 = H.d((arrayList == null ? 0 : arrayList.hashCode()) * 31, 31, this.f338657c);
        String str = this.f338658d;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        DynamicItemsMetrics dynamicItemsMetrics = this.f338659e;
        return this.f338660f.hashCode() + ((iHashCode + (dynamicItemsMetrics != null ? dynamicItemsMetrics.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        return "SplitMetricsItem(hint=" + this.f338656b + ", slug=" + this.f338657c + ", symbol=" + this.f338658d + ", total=" + this.f338659e + ", type=" + this.f338660f + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        ArrayList arrayList = this.f338656b;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            Iterator itY = com.avito.android.actions_sheet.a.y(parcel, 1, arrayList);
            while (itY.hasNext()) {
                ((SplitMetricsItemHint) itY.next()).writeToParcel(parcel, i12);
            }
        }
        parcel.writeString(this.f338657c);
        parcel.writeString(this.f338658d);
        DynamicItemsMetrics dynamicItemsMetrics = this.f338659e;
        if (dynamicItemsMetrics == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dynamicItemsMetrics.writeToParcel(parcel, i12);
        }
        this.f338660f.writeToParcel(parcel, i12);
    }
}
