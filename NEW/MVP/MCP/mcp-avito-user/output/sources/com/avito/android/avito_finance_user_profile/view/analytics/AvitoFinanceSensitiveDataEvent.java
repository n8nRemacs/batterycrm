package com.avito.android.avito_finance_user_profile.view.analytics;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import cc.e;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.analytics.provider.clickstream.ParcelableClickStreamEvent;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import org.webrtc.h;

/* compiled from: AvitoFinanceSensitiveDataEvent.kt */
@d
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/avito_finance_user_profile/view/analytics/AvitoFinanceSensitiveDataEvent;", "Lcom/avito/android/analytics/provider/clickstream/a;", "Lcom/avito/android/analytics/provider/clickstream/ParcelableClickStreamEvent;", "Lcc/e;", "_avito_avito-finance-user-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AvitoFinanceSensitiveDataEvent implements com.avito.android.analytics.provider.clickstream.a, ParcelableClickStreamEvent, e {

    @k
    public static final Parcelable.Creator<AvitoFinanceSensitiveDataEvent> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f97978b;

    /* renamed from: c, reason: collision with root package name */
    public final int f97979c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Map<String, Object> f97980d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f97981e;

    /* compiled from: AvitoFinanceSensitiveDataEvent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AvitoFinanceSensitiveDataEvent> {
        @Override // android.os.Parcelable.Creator
        public final AvitoFinanceSensitiveDataEvent createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            int i13 = parcel.readInt();
            int i14 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i14);
            int iC2 = 0;
            while (iC2 != i14) {
                iC2 = h.c(AvitoFinanceSensitiveDataEvent.class, parcel, linkedHashMap, parcel.readString(), iC2, 1);
            }
            return new AvitoFinanceSensitiveDataEvent(i12, i13, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final AvitoFinanceSensitiveDataEvent[] newArray(int i12) {
            return new AvitoFinanceSensitiveDataEvent[i12];
        }
    }

    public AvitoFinanceSensitiveDataEvent(int i12, int i13, @k Map<String, ? extends Object> map) {
        this.f97978b = i12;
        this.f97979c = i13;
        this.f97980d = map;
        this.f97981e = new ParametrizedClickStreamEvent(i12, i13, map, null, 8, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId, reason: from getter */
    public final int getF224266b() {
        return this.f97978b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f97981e.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion, reason: from getter */
    public final int getF224267c() {
        return this.f97979c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f97978b);
        parcel.writeInt(this.f97979c);
        Iterator itI = C0.i(parcel, this.f97980d);
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            h.h(parcel, (String) entry.getKey(), entry);
        }
    }
}
