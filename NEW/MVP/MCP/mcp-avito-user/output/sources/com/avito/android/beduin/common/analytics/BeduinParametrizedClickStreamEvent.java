package com.avito.android.beduin.common.analytics;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.analytics.provider.clickstream.ParcelableClickStreamEvent;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinParametrizedClickStreamEvent.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/analytics/BeduinParametrizedClickStreamEvent;", "Lcom/avito/android/analytics/provider/clickstream/a;", "Lcom/avito/android/analytics/provider/clickstream/ParcelableClickStreamEvent;", "Lcc/e;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinParametrizedClickStreamEvent implements com.avito.android.analytics.provider.clickstream.a, ParcelableClickStreamEvent, cc.e {

    @k
    public static final Parcelable.Creator<BeduinParametrizedClickStreamEvent> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f100588b;

    /* renamed from: c, reason: collision with root package name */
    public final int f100589c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Map<String, String> f100590d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f100591e;

    /* compiled from: BeduinParametrizedClickStreamEvent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinParametrizedClickStreamEvent> {
        @Override // android.os.Parcelable.Creator
        public final BeduinParametrizedClickStreamEvent createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            int i13 = parcel.readInt();
            int i14 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i14);
            int iA2 = 0;
            while (iA2 != i14) {
                iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
            }
            return new BeduinParametrizedClickStreamEvent(i12, i13, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinParametrizedClickStreamEvent[] newArray(int i12) {
            return new BeduinParametrizedClickStreamEvent[i12];
        }
    }

    public BeduinParametrizedClickStreamEvent(int i12, int i13, @k Map<String, String> map) {
        this.f100588b = i12;
        this.f100589c = i13;
        this.f100590d = map;
        this.f100591e = new ParametrizedClickStreamEvent(i12, i13, map, null, 8, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BeduinParametrizedClickStreamEvent)) {
            return false;
        }
        BeduinParametrizedClickStreamEvent beduinParametrizedClickStreamEvent = (BeduinParametrizedClickStreamEvent) obj;
        return this.f100588b == beduinParametrizedClickStreamEvent.f100588b && this.f100589c == beduinParametrizedClickStreamEvent.f100589c && L.f(this.f100590d, beduinParametrizedClickStreamEvent.f100590d);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId, reason: from getter */
    public final int getF224266b() {
        return this.f100588b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f100591e.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion, reason: from getter */
    public final int getF224267c() {
        return this.f100589c;
    }

    public final int hashCode() {
        return this.f100590d.hashCode() + r.e(this.f100589c, Integer.hashCode(this.f100588b) * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinParametrizedClickStreamEvent(eventId=");
        sb2.append(this.f100588b);
        sb2.append(", version=");
        sb2.append(this.f100589c);
        sb2.append(", _params=");
        return r.w(sb2, this.f100590d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f100588b);
        parcel.writeInt(this.f100589c);
        Iterator itI = C0.i(parcel, this.f100590d);
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
