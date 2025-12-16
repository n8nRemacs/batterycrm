package com.avito.android.widget_filters.remote.model.toast;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.ParametrizedEvent;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: WidgetFiltersToast.kt */
@d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/widget_filters/remote/model/toast/WidgetFiltersToast;", "Landroid/os/Parcelable;", "", "message", "Lcom/avito/android/remote/model/ParametrizedEvent;", "clickStream", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/ParametrizedEvent;)V", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/ParametrizedEvent;", "c", "()Lcom/avito/android/remote/model/ParametrizedEvent;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class WidgetFiltersToast implements Parcelable {

    @k
    public static final Parcelable.Creator<WidgetFiltersToast> CREATOR = new a();

    @c("clickstream")
    @l
    private final ParametrizedEvent clickStream;

    @c("message")
    @l
    private final String message;

    /* compiled from: WidgetFiltersToast.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<WidgetFiltersToast> {
        @Override // android.os.Parcelable.Creator
        public final WidgetFiltersToast createFromParcel(Parcel parcel) {
            return new WidgetFiltersToast(parcel.readString(), (ParametrizedEvent) parcel.readParcelable(WidgetFiltersToast.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final WidgetFiltersToast[] newArray(int i12) {
            return new WidgetFiltersToast[i12];
        }
    }

    public WidgetFiltersToast(@l String str, @l ParametrizedEvent parametrizedEvent) {
        this.message = str;
        this.clickStream = parametrizedEvent;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final ParametrizedEvent getClickStream() {
        return this.clickStream;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    public final String getMessage() {
        return this.message;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.message);
        parcel.writeParcelable(this.clickStream, i12);
    }
}
