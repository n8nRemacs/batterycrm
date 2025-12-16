package com.avito.android.user_stats.extended_user_stats.metrics.item;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MetricDialogData.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/metrics/item/MetricDialogData;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class MetricDialogData implements ParcelableItem {

    @k
    public static final Parcelable.Creator<MetricDialogData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f317289b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f317290c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f317291d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final List<StatMetric> f317292e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final AttributedText f317293f;

    /* compiled from: MetricDialogData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MetricDialogData> {
        @Override // android.os.Parcelable.Creator
        public final MetricDialogData createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int iC2 = 0;
            boolean z12 = parcel.readInt() != 0;
            boolean z13 = parcel.readInt() != 0;
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(StatMetric.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new MetricDialogData(string, z12, z13, arrayList, (AttributedText) parcel.readParcelable(MetricDialogData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final MetricDialogData[] newArray(int i12) {
            return new MetricDialogData[i12];
        }
    }

    public MetricDialogData(@k String str, boolean z12, boolean z13, @k List<StatMetric> list, @k AttributedText attributedText) {
        this.f317289b = str;
        this.f317290c = z12;
        this.f317291d = z13;
        this.f317292e = list;
        this.f317293f = attributedText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetricDialogData)) {
            return false;
        }
        MetricDialogData metricDialogData = (MetricDialogData) obj;
        return L.f(this.f317289b, metricDialogData.f317289b) && this.f317290c == metricDialogData.f317290c && this.f317291d == metricDialogData.f317291d && L.f(this.f317292e, metricDialogData.f317292e) && L.f(this.f317293f, metricDialogData.f317293f);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF282036b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF281526b() {
        return this.f317289b;
    }

    public final int hashCode() {
        return this.f317293f.hashCode() + H.e(r.i(r.i(this.f317289b.hashCode() * 31, 31, this.f317290c), 31, this.f317291d), 31, this.f317292e);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MetricDialogData(stringId=");
        sb2.append(this.f317289b);
        sb2.append(", isExpanded=");
        sb2.append(this.f317290c);
        sb2.append(", isExtracted=");
        sb2.append(this.f317291d);
        sb2.append(", metrics=");
        sb2.append(this.f317292e);
        sb2.append(", title=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f317293f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f317289b);
        parcel.writeInt(this.f317290c ? 1 : 0);
        parcel.writeInt(this.f317291d ? 1 : 0);
        Iterator itJ = C0.j(this.f317292e, parcel);
        while (itJ.hasNext()) {
            ((StatMetric) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.f317293f, i12);
    }
}
