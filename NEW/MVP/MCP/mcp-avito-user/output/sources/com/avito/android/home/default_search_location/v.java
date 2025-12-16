package com.avito.android.home.default_search_location;

import android.content.SharedPreferences;
import kotlin.Metadata;

/* compiled from: DefaultSearchLocationStorage.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/home/default_search_location/v;", "Lcom/avito/android/home/default_search_location/u;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class v implements u {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final SharedPreferences f162414a;

    public v(@Y61.k SharedPreferences sharedPreferences) {
        this.f162414a = sharedPreferences;
    }

    @Override // com.avito.android.home.default_search_location.u
    public final void a() {
        this.f162414a.edit().putBoolean("get_coordinates", true).apply();
    }

    @Override // com.avito.android.home.default_search_location.u
    public final boolean b() {
        return this.f162414a.getBoolean("get_coordinates", false);
    }
}
