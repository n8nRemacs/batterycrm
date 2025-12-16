package com.avito.android.analytics.provider.clickstream;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import org.webrtc.h;

/* compiled from: ParametrizedClickStreamEvent.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/provider/clickstream/ParametrizedClickStreamEvent;", "Lcom/avito/android/analytics/provider/clickstream/ParcelableClickStreamEvent;", "_common_analytics-clickstream_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ParametrizedClickStreamEvent implements ParcelableClickStreamEvent {

    @k
    public static final Parcelable.Creator<ParametrizedClickStreamEvent> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f90247b;

    /* renamed from: c, reason: collision with root package name */
    public final int f90248c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Map<String, Object> f90249d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f90250e;

    /* compiled from: ParametrizedClickStreamEvent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ParametrizedClickStreamEvent> {
        @Override // android.os.Parcelable.Creator
        public final ParametrizedClickStreamEvent createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            int i13 = parcel.readInt();
            int i14 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i14);
            int iC2 = 0;
            while (iC2 != i14) {
                iC2 = h.c(ParametrizedClickStreamEvent.class, parcel, linkedHashMap, parcel.readString(), iC2, 1);
            }
            return new ParametrizedClickStreamEvent(i12, i13, parcel.readString(), linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final ParametrizedClickStreamEvent[] newArray(int i12) {
            return new ParametrizedClickStreamEvent[i12];
        }
    }

    public ParametrizedClickStreamEvent(int i12, int i13, @k String str, @k Map map) {
        this.f90247b = i12;
        this.f90248c = i13;
        this.f90249d = map;
        this.f90250e = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ParametrizedClickStreamEvent.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        ParametrizedClickStreamEvent parametrizedClickStreamEvent = (ParametrizedClickStreamEvent) obj;
        return this.f90247b == parametrizedClickStreamEvent.f90247b && this.f90248c == parametrizedClickStreamEvent.f90248c && L.f(this.f90249d, parametrizedClickStreamEvent.f90249d);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId, reason: from getter */
    public final int getF428223b() {
        return this.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion, reason: from getter */
    public final int getF428224c() {
        return this.f90248c;
    }

    public final int hashCode() {
        return this.f90249d.hashCode() + (((this.f90247b * 31) + this.f90248c) * 31);
    }

    @k
    public final String i() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f90250e);
        sb2.append(" (id:");
        sb2.append(this.f90247b);
        sb2.append(", params:");
        sb2.append(this.f90249d);
        sb2.append(", version:");
        return r.t(sb2, this.f90248c, ')');
    }

    @k
    public final String toString() {
        return i();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f90247b);
        parcel.writeInt(this.f90248c);
        Iterator itI = C0.i(parcel, this.f90249d);
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            h.h(parcel, (String) entry.getKey(), entry);
        }
        parcel.writeString(this.f90250e);
    }

    public /* synthetic */ ParametrizedClickStreamEvent(int i12, int i13, Map map, String str, int i14, C42822w c42822w) {
        this(i12, i13, (i14 & 8) != 0 ? "ParametrizedClickStreamEvent" : str, map);
    }
}
