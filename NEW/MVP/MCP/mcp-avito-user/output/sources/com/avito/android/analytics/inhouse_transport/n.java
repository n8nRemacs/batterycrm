package com.avito.android.analytics.inhouse_transport;

import kotlin.Metadata;

/* compiled from: InHouseAnalyticsSettingsStorage.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/inhouse_transport/n;", "Lcom/avito/android/analytics/inhouse_transport/l;", "_common_analytics-transport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class n implements l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AK0.l f90202a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f90203b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f90204c;

    public n(@Y61.k AK0.l lVar, @Y61.k String str) {
        this.f90202a = lVar;
        this.f90203b = str.concat("_event_storage_file_name");
        this.f90204c = str.concat("_event_storage_is_dirty");
    }

    @Override // com.avito.android.analytics.inhouse_transport.l
    public final void a(@Y61.k String str) {
        this.f90202a.putString(this.f90203b, str);
    }

    @Override // com.avito.android.analytics.inhouse_transport.l
    public final boolean b() {
        return this.f90202a.getBoolean(this.f90204c, false);
    }

    @Override // com.avito.android.analytics.inhouse_transport.l
    @Y61.l
    public final String c() {
        return this.f90202a.getString(this.f90203b);
    }

    @Override // com.avito.android.analytics.inhouse_transport.l
    public final void d(boolean z12) {
        this.f90202a.putBoolean(this.f90204c, z12);
    }
}
