package com.avito.android.widget_filters.remote.model.widgets;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WidgetFiltersDatesWidget.kt */
@d
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/widget_filters/remote/model/widgets/DatesContent;", "Landroid/os/Parcelable;", "Lcom/avito/android/widget_filters/remote/model/widgets/WidgetFiltersContent;", "Lcom/avito/android/widget_filters/remote/model/widgets/DatesRangeParameter;", "datesRange", "Lcom/avito/android/widget_filters/remote/model/widgets/FlexSearchParameter;", "flexSearch", "<init>", "(Lcom/avito/android/widget_filters/remote/model/widgets/DatesRangeParameter;Lcom/avito/android/widget_filters/remote/model/widgets/FlexSearchParameter;)V", "Lcom/avito/android/widget_filters/remote/model/widgets/DatesRangeParameter;", "c", "()Lcom/avito/android/widget_filters/remote/model/widgets/DatesRangeParameter;", "Lcom/avito/android/widget_filters/remote/model/widgets/FlexSearchParameter;", "d", "()Lcom/avito/android/widget_filters/remote/model/widgets/FlexSearchParameter;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DatesContent implements Parcelable, WidgetFiltersContent {

    @k
    public static final Parcelable.Creator<DatesContent> CREATOR = new a();

    @c("datesRange")
    @l
    private final DatesRangeParameter datesRange;

    @c("flexSearchDate")
    @l
    private final FlexSearchParameter flexSearch;

    /* compiled from: WidgetFiltersDatesWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DatesContent> {
        @Override // android.os.Parcelable.Creator
        public final DatesContent createFromParcel(Parcel parcel) {
            return new DatesContent(parcel.readInt() == 0 ? null : DatesRangeParameter.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? FlexSearchParameter.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final DatesContent[] newArray(int i12) {
            return new DatesContent[i12];
        }
    }

    public DatesContent(@l DatesRangeParameter datesRangeParameter, @l FlexSearchParameter flexSearchParameter) {
        this.datesRange = datesRangeParameter;
        this.flexSearch = flexSearchParameter;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final DatesRangeParameter getDatesRange() {
        return this.datesRange;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final FlexSearchParameter getFlexSearch() {
        return this.flexSearch;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DatesContent)) {
            return false;
        }
        DatesContent datesContent = (DatesContent) obj;
        return L.f(this.datesRange, datesContent.datesRange) && L.f(this.flexSearch, datesContent.flexSearch);
    }

    public final int hashCode() {
        DatesRangeParameter datesRangeParameter = this.datesRange;
        int iHashCode = (datesRangeParameter == null ? 0 : datesRangeParameter.hashCode()) * 31;
        FlexSearchParameter flexSearchParameter = this.flexSearch;
        return iHashCode + (flexSearchParameter != null ? flexSearchParameter.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "DatesContent(datesRange=" + this.datesRange + ", flexSearch=" + this.flexSearch + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        DatesRangeParameter datesRangeParameter = this.datesRange;
        if (datesRangeParameter == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            datesRangeParameter.writeToParcel(parcel, i12);
        }
        FlexSearchParameter flexSearchParameter = this.flexSearch;
        if (flexSearchParameter == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            flexSearchParameter.writeToParcel(parcel, i12);
        }
    }
}
