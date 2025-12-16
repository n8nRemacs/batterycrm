package com.avito.android.advert.item.fmp.banner.analytics;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import cc.e;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.analytics.provider.clickstream.ParcelableClickStreamEvent;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import org.webrtc.h;

/* compiled from: FMPSensitiveDataEvent.kt */
@d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/fmp/banner/analytics/FMPSensitiveDataEvent;", "Lcom/avito/android/analytics/provider/clickstream/a;", "Lcom/avito/android/analytics/provider/clickstream/ParcelableClickStreamEvent;", "Lcc/e;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FMPSensitiveDataEvent implements com.avito.android.analytics.provider.clickstream.a, ParcelableClickStreamEvent, e {

    @k
    public static final Parcelable.Creator<FMPSensitiveDataEvent> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f75431b;

    /* renamed from: c, reason: collision with root package name */
    public final int f75432c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Map<String, Object> f75433d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f75434e;

    /* compiled from: FMPSensitiveDataEvent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FMPSensitiveDataEvent> {
        @Override // android.os.Parcelable.Creator
        public final FMPSensitiveDataEvent createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            int i13 = parcel.readInt();
            int i14 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i14);
            int iC2 = 0;
            while (iC2 != i14) {
                iC2 = h.c(FMPSensitiveDataEvent.class, parcel, linkedHashMap, parcel.readString(), iC2, 1);
            }
            return new FMPSensitiveDataEvent(i12, i13, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final FMPSensitiveDataEvent[] newArray(int i12) {
            return new FMPSensitiveDataEvent[i12];
        }
    }

    public FMPSensitiveDataEvent(int i12, int i13, @k Map<String, ? extends Object> map) {
        this.f75431b = i12;
        this.f75432c = i13;
        this.f75433d = map;
        this.f75434e = new ParametrizedClickStreamEvent(i12, i13, map, null, 8, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId, reason: from getter */
    public final int getF75431b() {
        return this.f75431b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f75434e.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion, reason: from getter */
    public final int getF75432c() {
        return this.f75432c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f75431b);
        parcel.writeInt(this.f75432c);
        Iterator itI = C0.i(parcel, this.f75433d);
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            h.h(parcel, (String) entry.getKey(), entry);
        }
    }
}
