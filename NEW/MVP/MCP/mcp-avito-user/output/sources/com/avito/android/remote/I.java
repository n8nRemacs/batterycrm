package com.avito.android.remote;

import android.content.ContentResolver;
import android.provider.Settings;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: DeviceIdProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/I;", "Lcom/avito/android/remote/H;", "_common_analytics-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class I implements H {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f253025a;

    public I(@Y61.k AK0.l lVar, @Y61.k ContentResolver contentResolver, @Y61.k String str) {
        if (C43066x.K(str)) {
            String string = lVar.getString("device_id", null);
            if (string == null || string.length() == 0) {
                String string2 = Settings.Secure.getString(contentResolver, "android_id");
                string2 = (string2 == null || string2.length() == 0) ? UUID.randomUUID().toString() : string2;
                lVar.putString("device_id", string2);
                str = string2;
            } else {
                str = string;
            }
        }
        this.f253025a = str;
    }

    @Override // com.avito.android.remote.H
    @Y61.k
    /* renamed from: getValue, reason: from getter */
    public final String getF253025a() {
        return this.f253025a;
    }
}
