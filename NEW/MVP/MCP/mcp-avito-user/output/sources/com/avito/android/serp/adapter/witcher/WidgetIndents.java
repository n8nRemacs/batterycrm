package com.avito.android.serp.adapter.witcher;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.serp.adapter.witcher.Appearance;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Appearance.kt */
@K51.d
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/witcher/WidgetIndents;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class WidgetIndents implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<WidgetIndents> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final WidgetType f273800b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Appearance.Margins f273801c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Appearance.Paddings f273802d;

    /* compiled from: Appearance.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<WidgetIndents> {
        @Override // android.os.Parcelable.Creator
        public final WidgetIndents createFromParcel(Parcel parcel) {
            return new WidgetIndents(WidgetType.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Appearance.Margins.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Appearance.Paddings.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final WidgetIndents[] newArray(int i12) {
            return new WidgetIndents[i12];
        }
    }

    public WidgetIndents(@Y61.k WidgetType widgetType, @Y61.l Appearance.Margins margins, @Y61.l Appearance.Paddings paddings) {
        this.f273800b = widgetType;
        this.f273801c = margins;
        this.f273802d = paddings;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WidgetIndents)) {
            return false;
        }
        WidgetIndents widgetIndents = (WidgetIndents) obj;
        return this.f273800b == widgetIndents.f273800b && kotlin.jvm.internal.L.f(this.f273801c, widgetIndents.f273801c) && kotlin.jvm.internal.L.f(this.f273802d, widgetIndents.f273802d);
    }

    public final int hashCode() {
        int iHashCode = this.f273800b.hashCode() * 31;
        Appearance.Margins margins = this.f273801c;
        int iHashCode2 = (iHashCode + (margins == null ? 0 : margins.hashCode())) * 31;
        Appearance.Paddings paddings = this.f273802d;
        return iHashCode2 + (paddings != null ? paddings.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "WidgetIndents(widgetType=" + this.f273800b + ", margins=" + this.f273801c + ", paddings=" + this.f273802d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f273800b.name());
        Appearance.Margins margins = this.f273801c;
        if (margins == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            margins.writeToParcel(parcel, i12);
        }
        Appearance.Paddings paddings = this.f273802d;
        if (paddings == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            paddings.writeToParcel(parcel, i12);
        }
    }

    public /* synthetic */ WidgetIndents(WidgetType widgetType, Appearance.Margins margins, Appearance.Paddings paddings, int i12, C42822w c42822w) {
        this(widgetType, (i12 & 2) != 0 ? null : margins, (i12 & 4) != 0 ? null : paddings);
    }
}
