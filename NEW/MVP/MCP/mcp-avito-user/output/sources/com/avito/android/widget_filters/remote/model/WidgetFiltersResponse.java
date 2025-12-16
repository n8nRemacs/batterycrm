package com.avito.android.widget_filters.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.widget_filters.remote.model.toast.WidgetFiltersToast;
import com.avito.android.widget_filters.remote.model.widgets.WidgetFiltersWidget;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;

/* compiled from: WidgetFiltersResponse.kt */
@d
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/avito/android/widget_filters/remote/model/WidgetFiltersResponse;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/widget_filters/remote/model/widgets/WidgetFiltersWidget;", "_widgets", "", "nextFilterTitle", "searchFiltersTitle", "resetTitle", "Lcom/avito/android/widget_filters/remote/model/toast/WidgetFiltersToast;", "toast", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/widget_filters/remote/model/toast/WidgetFiltersToast;)V", "Ljava/util/List;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "e", "d", "Lcom/avito/android/widget_filters/remote/model/toast/WidgetFiltersToast;", "f", "()Lcom/avito/android/widget_filters/remote/model/toast/WidgetFiltersToast;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class WidgetFiltersResponse implements Parcelable {

    @k
    public static final Parcelable.Creator<WidgetFiltersResponse> CREATOR = new a();

    @c("widgets")
    @l
    private final List<WidgetFiltersWidget> _widgets;

    @c("nextFilterTitle")
    @l
    private final String nextFilterTitle;

    @c("resetTitle")
    @l
    private final String resetTitle;

    @c("searchFiltersTitle")
    @l
    private final String searchFiltersTitle;

    @c("toast")
    @l
    private final WidgetFiltersToast toast;

    /* compiled from: WidgetFiltersResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<WidgetFiltersResponse> {
        @Override // android.os.Parcelable.Creator
        public final WidgetFiltersResponse createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(WidgetFiltersResponse.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            return new WidgetFiltersResponse(arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? WidgetFiltersToast.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final WidgetFiltersResponse[] newArray(int i12) {
            return new WidgetFiltersResponse[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WidgetFiltersResponse(@l List<? extends WidgetFiltersWidget> list, @l String str, @l String str2, @l String str3, @l WidgetFiltersToast widgetFiltersToast) {
        this._widgets = list;
        this.nextFilterTitle = str;
        this.searchFiltersTitle = str2;
        this.resetTitle = str3;
        this.toast = widgetFiltersToast;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getNextFilterTitle() {
        return this.nextFilterTitle;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getResetTitle() {
        return this.resetTitle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final String getSearchFiltersTitle() {
        return this.searchFiltersTitle;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WidgetFiltersResponse)) {
            return false;
        }
        WidgetFiltersResponse widgetFiltersResponse = (WidgetFiltersResponse) obj;
        return L.f(this._widgets, widgetFiltersResponse._widgets) && L.f(this.nextFilterTitle, widgetFiltersResponse.nextFilterTitle) && L.f(this.searchFiltersTitle, widgetFiltersResponse.searchFiltersTitle) && L.f(this.resetTitle, widgetFiltersResponse.resetTitle) && L.f(this.toast, widgetFiltersResponse.toast);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final WidgetFiltersToast getToast() {
        return this.toast;
    }

    @k
    public final List<WidgetFiltersWidget> g() {
        List<WidgetFiltersWidget> list = this._widgets;
        return list == null ? C42784z0.f406748b : list;
    }

    public final int hashCode() {
        List<WidgetFiltersWidget> list = this._widgets;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.nextFilterTitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.searchFiltersTitle;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.resetTitle;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        WidgetFiltersToast widgetFiltersToast = this.toast;
        return iHashCode4 + (widgetFiltersToast != null ? widgetFiltersToast.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "WidgetFiltersResponse(_widgets=" + this._widgets + ", nextFilterTitle=" + this.nextFilterTitle + ", searchFiltersTitle=" + this.searchFiltersTitle + ", resetTitle=" + this.resetTitle + ", toast=" + this.toast + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        List<WidgetFiltersWidget> list = this._widgets;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        parcel.writeString(this.nextFilterTitle);
        parcel.writeString(this.searchFiltersTitle);
        parcel.writeString(this.resetTitle);
        WidgetFiltersToast widgetFiltersToast = this.toast;
        if (widgetFiltersToast == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            widgetFiltersToast.writeToParcel(parcel, i12);
        }
    }
}
