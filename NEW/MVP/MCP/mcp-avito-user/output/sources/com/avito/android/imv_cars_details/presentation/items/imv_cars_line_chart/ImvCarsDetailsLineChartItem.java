package com.avito.android.imv_cars_details.presentation.items.imv_cars_line_chart;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.imv_cars_details.presentation.items.imv_cars_line_chart.line_chart_view.LineChartPoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ImvCarsDetailsLineChartItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/imv_cars_details/presentation/items/imv_cars_line_chart/ImvCarsDetailsLineChartItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ImvCarsDetailsLineChartItem implements com.avito.conveyor_item.a, Parcelable {

    @k
    public static final Parcelable.Creator<ImvCarsDetailsLineChartItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f170159b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f170160c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<LineChartPoint> f170161d;

    /* compiled from: ImvCarsDetailsLineChartItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ImvCarsDetailsLineChartItem> {
        @Override // android.os.Parcelable.Creator
        public final ImvCarsDetailsLineChartItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(LineChartPoint.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new ImvCarsDetailsLineChartItem(string, string2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ImvCarsDetailsLineChartItem[] newArray(int i12) {
            return new ImvCarsDetailsLineChartItem[i12];
        }
    }

    public ImvCarsDetailsLineChartItem(@k String str, @l String str2, @k List<LineChartPoint> list) {
        this.f170159b = str;
        this.f170160c = str2;
        this.f170161d = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF259043b() {
        return getF20568b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF20568b() {
        return this.f170159b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f170159b);
        parcel.writeString(this.f170160c);
        Iterator itJ = C0.j(this.f170161d, parcel);
        while (itJ.hasNext()) {
            ((LineChartPoint) itJ.next()).writeToParcel(parcel, i12);
        }
    }

    public /* synthetic */ ImvCarsDetailsLineChartItem(String str, String str2, List list, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? ImvCarsDetailsLineChartItem.class.getName() : str, str2, list);
    }
}
