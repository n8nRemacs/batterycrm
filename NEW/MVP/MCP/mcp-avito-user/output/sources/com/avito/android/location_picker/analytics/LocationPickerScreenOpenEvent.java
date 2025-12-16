package com.avito.android.location_picker.analytics;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.remote.model.category_parameters.MetroParameter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: LocationPickerScreenOpenEvent.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/location_picker/analytics/LocationPickerScreenOpenEvent;", "Lcom/avito/android/analytics/provider/clickstream/a;", "EventSource", "_avito_location-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class LocationPickerScreenOpenEvent implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final List<String> f182194b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final List<String> f182195c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final List<String> f182196d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final List<String> f182197e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f182198f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LocationPickerScreenOpenEvent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/location_picker/analytics/LocationPickerScreenOpenEvent$EventSource;", "", "Landroid/os/Parcelable;", "_avito_location-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final class EventSource implements Parcelable {

        @k
        public static final Parcelable.Creator<EventSource> CREATOR;

        /* renamed from: c, reason: collision with root package name */
        public static final EventSource f182199c;

        /* renamed from: d, reason: collision with root package name */
        public static final EventSource f182200d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ EventSource[] f182201e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f182202f;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f182203b;

        /* compiled from: LocationPickerScreenOpenEvent.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<EventSource> {
            @Override // android.os.Parcelable.Creator
            public final EventSource createFromParcel(Parcel parcel) {
                return EventSource.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final EventSource[] newArray(int i12) {
                return new EventSource[i12];
            }
        }

        static {
            EventSource eventSource = new EventSource("SEARCH", 0, "1");
            f182199c = eventSource;
            EventSource eventSource2 = new EventSource("PUBLISH", 1, "2");
            EventSource eventSource3 = new EventSource("PROFILE", 2, "3");
            EventSource eventSource4 = new EventSource("USER_ADVERTS", 3, "4");
            EventSource eventSource5 = new EventSource("VERTICAL_MAIN", 4, "5");
            f182200d = eventSource5;
            EventSource[] eventSourceArr = {eventSource, eventSource2, eventSource3, eventSource4, eventSource5};
            f182201e = eventSourceArr;
            f182202f = kotlin.enums.c.a(eventSourceArr);
            CREATOR = new a();
        }

        public EventSource(String str, int i12, String str2) {
            this.f182203b = str2;
        }

        public static EventSource valueOf(String str) {
            return (EventSource) Enum.valueOf(EventSource.class, str);
        }

        public static EventSource[] values() {
            return (EventSource[]) f182201e.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(name());
        }
    }

    public LocationPickerScreenOpenEvent(@k String str, @l String str2, @l String str3, @l List<String> list, @l List<String> list2, @l List<String> list3, @l List<String> list4, @l Long l12, @k EventSource eventSource) {
        this.f182194b = list;
        this.f182195c = list2;
        this.f182196d = list3;
        this.f182197e = list4;
        HashMap mapE = P0.e(new Q("from_block", eventSource.f182203b), new Q("from_page", "radius_small"), new Q("geo_session", str));
        if (str2 != null) {
            mapE.put("cid", str2);
        }
        if (str3 != null) {
            mapE.put("lid", str3);
        }
        if (l12 != null) {
            mapE.put("srd", Long.valueOf(l12.longValue()));
        }
        if (list4 != null) {
            mapE.put("geo", list4);
        }
        if (list != null && !list.isEmpty()) {
            mapE.put("did", list);
        }
        if (list3 != null && !list3.isEmpty()) {
            mapE.put("roads", list3);
        }
        if (list2 != null && !list2.isEmpty()) {
            mapE.put(MetroParameter.TYPE, list2);
        }
        G0 g02 = G0.f406611a;
        this.f182198f = new ParametrizedClickStreamEvent(3290, 4, mapE, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83080b() {
        return this.f182198f.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f182198f.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83081c() {
        return this.f182198f.f90248c;
    }

    public /* synthetic */ LocationPickerScreenOpenEvent(String str, String str2, String str3, List list, List list2, List list3, List list4, Long l12, EventSource eventSource, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : list, (i12 & 16) != 0 ? null : list2, (i12 & 32) != 0 ? null : list3, (i12 & 64) != 0 ? null : list4, (i12 & 128) != 0 ? null : l12, eventSource);
    }
}
