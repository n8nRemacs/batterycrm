package com.avito.android.wallet.pin.impl.analytics;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import cc.e;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.analytics.provider.clickstream.ParcelableClickStreamEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import org.webrtc.h;

/* compiled from: WalletPinSensitiveDataEvent.kt */
@d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/pin/impl/analytics/WalletPinSensitiveDataEvent;", "Lcom/avito/android/analytics/provider/clickstream/a;", "Lcom/avito/android/analytics/provider/clickstream/ParcelableClickStreamEvent;", "Lcc/e;", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class WalletPinSensitiveDataEvent implements com.avito.android.analytics.provider.clickstream.a, ParcelableClickStreamEvent, e {

    @k
    public static final Parcelable.Creator<WalletPinSensitiveDataEvent> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f328428b;

    /* renamed from: c, reason: collision with root package name */
    public final int f328429c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final LinkedHashMap f328430d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f328431e;

    /* compiled from: WalletPinSensitiveDataEvent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<WalletPinSensitiveDataEvent> {
        @Override // android.os.Parcelable.Creator
        public final WalletPinSensitiveDataEvent createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            int i13 = parcel.readInt();
            int i14 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i14);
            int iC2 = 0;
            while (iC2 != i14) {
                iC2 = h.c(WalletPinSensitiveDataEvent.class, parcel, linkedHashMap, parcel.readString(), iC2, 1);
            }
            return new WalletPinSensitiveDataEvent(i12, i13, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final WalletPinSensitiveDataEvent[] newArray(int i12) {
            return new WalletPinSensitiveDataEvent[i12];
        }
    }

    public WalletPinSensitiveDataEvent(int i12, int i13, @k LinkedHashMap linkedHashMap) {
        this.f328428b = i12;
        this.f328429c = i13;
        this.f328430d = linkedHashMap;
        this.f328431e = new ParametrizedClickStreamEvent(i12, i13, linkedHashMap, null, 8, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId, reason: from getter */
    public final int getF328428b() {
        return this.f328428b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f328431e.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion, reason: from getter */
    public final int getF328429c() {
        return this.f328429c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f328428b);
        parcel.writeInt(this.f328429c);
        LinkedHashMap linkedHashMap = this.f328430d;
        parcel.writeInt(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            h.h(parcel, (String) entry.getKey(), entry);
        }
    }
}
