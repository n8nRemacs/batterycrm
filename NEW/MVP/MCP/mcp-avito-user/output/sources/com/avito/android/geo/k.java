package com.avito.android.geo;

import android.content.SharedPreferences;
import android.location.Location;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PrefGeoStorage.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/geo/k;", "Lcom/avito/android/geo/j;", "_avito-discouraged_persistence_geo"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AK0.l f159307a;

    public k(@Y61.k AK0.l lVar) {
        this.f159307a = lVar;
    }

    @Override // com.avito.android.geo.j
    @Y61.l
    public final Location j() {
        Location location;
        synchronized (l.f159308a) {
            SharedPreferences f316a = this.f159307a.getF316a();
            float f12 = f316a.getFloat("latitude", -90.0f);
            float f13 = f316a.getFloat("longitude", -180.0f);
            float f14 = f316a.getFloat("accuracy", -1.0f);
            long j12 = f316a.getLong(CrashHianalyticsData.TIME, -1L);
            if (f12 <= -90.0f || f13 <= -180.0f || f14 <= 0.0f || j12 <= 0) {
                location = null;
            } else {
                location = new Location(f316a.getString("provider", "unknown"));
                location.setLatitude(f12);
                location.setLongitude(f13);
                location.setAccuracy(f14);
                location.setTime(j12);
            }
        }
        return location;
    }

    @Override // com.avito.android.geo.j
    public final void k(long j12) {
        this.f159307a.putLong("last_update_timestamp", j12);
    }

    @Override // com.avito.android.geo.j
    public final long l() {
        return this.f159307a.getLong("last_update_timestamp", 0L);
    }

    @Override // com.avito.android.geo.j
    public final void m(@Y61.k Location location) {
        synchronized (l.f159308a) {
            this.f159307a.getF316a().edit().putString("provider", location.getProvider()).putFloat("latitude", (float) location.getLatitude()).putFloat("longitude", (float) location.getLongitude()).putFloat("accuracy", location.getAccuracy()).putLong(CrashHianalyticsData.TIME, location.getTime()).apply();
            G0 g02 = G0.f406611a;
        }
    }
}
