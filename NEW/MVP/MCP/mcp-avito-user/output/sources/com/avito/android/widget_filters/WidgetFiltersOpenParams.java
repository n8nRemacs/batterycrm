package com.avito.android.widget_filters;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.util.OpenParams;
import com.avito.android.widget_filters.deeplink.WidgetFiltersLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WidgetFiltersOpenParams.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/WidgetFiltersOpenParams;", "Lcom/avito/android/util/OpenParams;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class WidgetFiltersOpenParams implements OpenParams {

    @k
    public static final Parcelable.Creator<WidgetFiltersOpenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f329688b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final SearchParams f329689c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f329690d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final WidgetFiltersLink.WidgetFiltersFlow f329691e;

    /* compiled from: WidgetFiltersOpenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<WidgetFiltersOpenParams> {
        @Override // android.os.Parcelable.Creator
        public final WidgetFiltersOpenParams createFromParcel(Parcel parcel) {
            return new WidgetFiltersOpenParams(parcel.readString(), (SearchParams) parcel.readParcelable(WidgetFiltersOpenParams.class.getClassLoader()), parcel.readString(), WidgetFiltersLink.WidgetFiltersFlow.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final WidgetFiltersOpenParams[] newArray(int i12) {
            return new WidgetFiltersOpenParams[i12];
        }
    }

    public WidgetFiltersOpenParams(@l String str, @k SearchParams searchParams, @l String str2, @k WidgetFiltersLink.WidgetFiltersFlow widgetFiltersFlow) {
        this.f329688b = str;
        this.f329689c = searchParams;
        this.f329690d = str2;
        this.f329691e = widgetFiltersFlow;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WidgetFiltersOpenParams)) {
            return false;
        }
        WidgetFiltersOpenParams widgetFiltersOpenParams = (WidgetFiltersOpenParams) obj;
        return L.f(this.f329688b, widgetFiltersOpenParams.f329688b) && L.f(this.f329689c, widgetFiltersOpenParams.f329689c) && L.f(this.f329690d, widgetFiltersOpenParams.f329690d) && this.f329691e == widgetFiltersOpenParams.f329691e;
    }

    public final int hashCode() {
        String str = this.f329688b;
        int iHashCode = (this.f329689c.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        String str2 = this.f329690d;
        return this.f329691e.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        return "WidgetFiltersOpenParams(title=" + this.f329688b + ", searchParams=" + this.f329689c + ", fromPage=" + this.f329690d + ", flow=" + this.f329691e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f329688b);
        parcel.writeParcelable(this.f329689c, i12);
        parcel.writeString(this.f329690d);
        parcel.writeString(this.f329691e.name());
    }
}
