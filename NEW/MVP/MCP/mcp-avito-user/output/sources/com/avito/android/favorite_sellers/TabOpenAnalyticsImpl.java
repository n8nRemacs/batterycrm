package com.avito.android.favorite_sellers;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.model.FavoriteSellersResult;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TabOpenAnalytics.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/favorite_sellers/TabOpenAnalyticsImpl;", "Lcom/avito/android/favorite_sellers/V;", "EventData", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TabOpenAnalyticsImpl implements V {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f155479a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f155480b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public EventData f155481c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f155482d;

    /* compiled from: TabOpenAnalytics.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite_sellers/TabOpenAnalyticsImpl$EventData;", "Landroid/os/Parcelable;", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class EventData implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<EventData> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final int f155483b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f155484c;

        /* compiled from: TabOpenAnalytics.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<EventData> {
            @Override // android.os.Parcelable.Creator
            public final EventData createFromParcel(Parcel parcel) {
                return new EventData(parcel.readInt(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final EventData[] newArray(int i12) {
                return new EventData[i12];
            }
        }

        public EventData(int i12, @Y61.l String str) {
            this.f155483b = i12;
            this.f155484c = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EventData)) {
                return false;
            }
            EventData eventData = (EventData) obj;
            return this.f155483b == eventData.f155483b && kotlin.jvm.internal.L.f(this.f155484c, eventData.f155484c);
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.f155483b) * 31;
            String str = this.f155484c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("EventData(favoriteCount=");
            sb2.append(this.f155483b);
            sb2.append(", xHash=");
            return C22026a.c(sb2, this.f155484c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeInt(this.f155483b);
            parcel.writeString(this.f155484c);
        }
    }

    @Inject
    public TabOpenAnalyticsImpl(@Y61.k InterfaceC28373a interfaceC28373a) {
        this.f155479a = interfaceC28373a;
    }

    public final void a() {
        EventData eventData = this.f155481c;
        if (eventData == null || this.f155480b || !this.f155482d) {
            return;
        }
        this.f155479a.c(new EC.a(eventData.f155483b, eventData.f155484c));
        this.f155480b = true;
    }

    @Override // com.avito.android.favorite_sellers.V
    public final void reset() {
        this.f155480b = false;
    }

    @Override // com.avito.android.favorite_sellers.V
    public final void w(boolean z12) {
        this.f155482d = z12;
        if (z12) {
            a();
        } else {
            this.f155480b = false;
        }
    }

    @Override // com.avito.android.favorite_sellers.V
    public final void x(@Y61.l FavoriteSellersResult favoriteSellersResult) {
        this.f155481c = favoriteSellersResult == null ? new EventData(0, null) : new EventData(favoriteSellersResult.getTotalCount(), favoriteSellersResult.getXHash());
        a();
    }
}
