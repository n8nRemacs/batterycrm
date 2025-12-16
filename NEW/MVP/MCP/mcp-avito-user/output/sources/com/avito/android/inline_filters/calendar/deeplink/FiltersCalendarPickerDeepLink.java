package com.avito.android.inline_filters.calendar.deeplink;

import Ju.InterfaceC14249c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.inline_filters.calendar.FiltersCalendarPickerConfig;
import com.avito.android.inline_filters.calendar.FiltersCalendarPickerUiConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: FiltersCalendarPickerDeepLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/inline_filters/calendar/deeplink/FiltersCalendarPickerDeepLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes14.dex */
public final /* data */ class FiltersCalendarPickerDeepLink extends DeepLink {

    @k
    public static final Parcelable.Creator<FiltersCalendarPickerDeepLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final FiltersCalendarPickerConfig f171065b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final FiltersCalendarPickerUiConfig f171066c;

    /* compiled from: FiltersCalendarPickerDeepLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FiltersCalendarPickerDeepLink> {
        @Override // android.os.Parcelable.Creator
        public final FiltersCalendarPickerDeepLink createFromParcel(Parcel parcel) {
            return new FiltersCalendarPickerDeepLink(FiltersCalendarPickerConfig.CREATOR.createFromParcel(parcel), FiltersCalendarPickerUiConfig.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final FiltersCalendarPickerDeepLink[] newArray(int i12) {
            return new FiltersCalendarPickerDeepLink[i12];
        }
    }

    /* compiled from: FiltersCalendarPickerDeepLink.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/inline_filters/calendar/deeplink/FiltersCalendarPickerDeepLink$b;", "LEN/b;", "T", "LJu/c$b;", "_avito_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b<T extends EN.b> implements InterfaceC14249c.b {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final T f171067b;

        public b(@k T t12) {
            this.f171067b = t12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f171067b, ((b) obj).f171067b);
        }

        public final int hashCode() {
            return this.f171067b.hashCode();
        }

        @k
        public final String toString() {
            return "Result(value=" + this.f171067b + ')';
        }
    }

    public FiltersCalendarPickerDeepLink(@k FiltersCalendarPickerConfig filtersCalendarPickerConfig, @k FiltersCalendarPickerUiConfig filtersCalendarPickerUiConfig) {
        this.f171065b = filtersCalendarPickerConfig;
        this.f171066c = filtersCalendarPickerUiConfig;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FiltersCalendarPickerDeepLink)) {
            return false;
        }
        FiltersCalendarPickerDeepLink filtersCalendarPickerDeepLink = (FiltersCalendarPickerDeepLink) obj;
        return L.f(this.f171065b, filtersCalendarPickerDeepLink.f171065b) && L.f(this.f171066c, filtersCalendarPickerDeepLink.f171066c);
    }

    public final int hashCode() {
        return this.f171066c.hashCode() + (this.f171065b.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "FiltersCalendarPickerDeepLink(pickerConfig=" + this.f171065b + ", uiConfig=" + this.f171066c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f171065b.writeToParcel(parcel, i12);
        this.f171066c.writeToParcel(parcel, i12);
    }
}
