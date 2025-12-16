package com.avito.android.imv_chart;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: ImvCarsChartItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/imv_chart/ImvCarsChartItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "_avito_imv-chart_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ImvCarsChartItem implements com.avito.conveyor_item.a, Parcelable {

    @Y61.k
    public static final Parcelable.Creator<ImvCarsChartItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f170252b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ArrayList f170253c;

    /* compiled from: ImvCarsChartItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ImvCarsChartItem> {
        @Override // android.os.Parcelable.Creator
        public final ImvCarsChartItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(ImvCarsChartRange.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new ImvCarsChartItem(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ImvCarsChartItem[] newArray(int i12) {
            return new ImvCarsChartItem[i12];
        }
    }

    public ImvCarsChartItem(@Y61.k String str, @Y61.k ArrayList arrayList) {
        this.f170252b = str;
        this.f170253c = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF113526b() {
        return getF170252b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF170252b() {
        return this.f170252b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f170252b);
        Iterator itZ = com.avito.android.actions_sheet.a.z(this.f170253c, parcel);
        while (itZ.hasNext()) {
            ((ImvCarsChartRange) itZ.next()).writeToParcel(parcel, i12);
        }
    }
}
