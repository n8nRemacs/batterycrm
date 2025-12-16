package com.avito.android.wallet.history.analytics;

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

/* compiled from: WalletHistorySensitiveDataEvent.kt */
@d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/history/analytics/WalletHistorySensitiveDataEvent;", "Lcom/avito/android/analytics/provider/clickstream/a;", "Lcom/avito/android/analytics/provider/clickstream/ParcelableClickStreamEvent;", "Lcc/e;", "_avito_wallet-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class WalletHistorySensitiveDataEvent implements com.avito.android.analytics.provider.clickstream.a, ParcelableClickStreamEvent, e {

    @k
    public static final Parcelable.Creator<WalletHistorySensitiveDataEvent> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f327516b;

    /* renamed from: c, reason: collision with root package name */
    public final int f327517c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Map<String, Object> f327518d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f327519e;

    /* compiled from: WalletHistorySensitiveDataEvent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<WalletHistorySensitiveDataEvent> {
        @Override // android.os.Parcelable.Creator
        public final WalletHistorySensitiveDataEvent createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            int i13 = parcel.readInt();
            int i14 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i14);
            int iC2 = 0;
            while (iC2 != i14) {
                iC2 = h.c(WalletHistorySensitiveDataEvent.class, parcel, linkedHashMap, parcel.readString(), iC2, 1);
            }
            return new WalletHistorySensitiveDataEvent(i12, i13, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final WalletHistorySensitiveDataEvent[] newArray(int i12) {
            return new WalletHistorySensitiveDataEvent[i12];
        }
    }

    public WalletHistorySensitiveDataEvent(int i12, int i13, @k Map<String, ? extends Object> map) {
        this.f327516b = i12;
        this.f327517c = i13;
        this.f327518d = map;
        this.f327519e = new ParametrizedClickStreamEvent(i12, i13, map, null, 8, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId, reason: from getter */
    public final int getF327516b() {
        return this.f327516b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f327519e.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion, reason: from getter */
    public final int getF327517c() {
        return this.f327517c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f327516b);
        parcel.writeInt(this.f327517c);
        Iterator itI = C0.i(parcel, this.f327518d);
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            h.h(parcel, (String) entry.getKey(), entry);
        }
    }
}
