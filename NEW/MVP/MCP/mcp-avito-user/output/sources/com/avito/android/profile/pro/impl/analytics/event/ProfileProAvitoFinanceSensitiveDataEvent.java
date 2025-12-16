package com.avito.android.profile.pro.impl.analytics.event;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import cc.e;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.analytics.provider.clickstream.ParcelableClickStreamEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import org.webrtc.h;

/* compiled from: ProfileProAvitoFinanceSensitiveDataEvent.kt */
@d
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/pro/impl/analytics/event/ProfileProAvitoFinanceSensitiveDataEvent;", "Lcom/avito/android/analytics/provider/clickstream/a;", "Lcom/avito/android/analytics/provider/clickstream/ParcelableClickStreamEvent;", "Lcc/e;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ProfileProAvitoFinanceSensitiveDataEvent implements com.avito.android.analytics.provider.clickstream.a, ParcelableClickStreamEvent, e {

    @k
    public static final Parcelable.Creator<ProfileProAvitoFinanceSensitiveDataEvent> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f222438b;

    /* renamed from: c, reason: collision with root package name */
    public final int f222439c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final LinkedHashMap f222440d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f222441e;

    /* compiled from: ProfileProAvitoFinanceSensitiveDataEvent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ProfileProAvitoFinanceSensitiveDataEvent> {
        @Override // android.os.Parcelable.Creator
        public final ProfileProAvitoFinanceSensitiveDataEvent createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            int i13 = parcel.readInt();
            int i14 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i14);
            int iC2 = 0;
            while (iC2 != i14) {
                iC2 = h.c(ProfileProAvitoFinanceSensitiveDataEvent.class, parcel, linkedHashMap, parcel.readString(), iC2, 1);
            }
            return new ProfileProAvitoFinanceSensitiveDataEvent(i12, i13, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final ProfileProAvitoFinanceSensitiveDataEvent[] newArray(int i12) {
            return new ProfileProAvitoFinanceSensitiveDataEvent[i12];
        }
    }

    public ProfileProAvitoFinanceSensitiveDataEvent(int i12, int i13, @k LinkedHashMap linkedHashMap) {
        this.f222438b = i12;
        this.f222439c = i13;
        this.f222440d = linkedHashMap;
        this.f222441e = new ParametrizedClickStreamEvent(i12, i13, linkedHashMap, null, 8, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId, reason: from getter */
    public final int getF222438b() {
        return this.f222438b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f222441e.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion, reason: from getter */
    public final int getF222439c() {
        return this.f222439c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f222438b);
        parcel.writeInt(this.f222439c);
        LinkedHashMap linkedHashMap = this.f222440d;
        parcel.writeInt(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            h.h(parcel, (String) entry.getKey(), entry);
        }
    }
}
