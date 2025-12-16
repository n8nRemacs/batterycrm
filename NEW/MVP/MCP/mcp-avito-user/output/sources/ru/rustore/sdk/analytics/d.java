package ru.rustore.sdk.analytics;

import Y61.l;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import kotlin.Metadata;
import ru.rustore.sdk.core.exception.RuStoreException;
import ru.vk.store.provider.analytics.a;
import ru.vk.store.provider.analytics.b;

/* compiled from: AnalyticsProviderServiceConnection.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/rustore/sdk/analytics/d;", "Landroid/content/ServiceConnection;", "sdk-public-analytics_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class d implements ServiceConnection {

    /* compiled from: AnalyticsProviderServiceConnection.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ru/rustore/sdk/analytics/d$a", "Lru/vk/store/provider/analytics/b$b;", "sdk-public-analytics_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class a extends b.AbstractBinderC12597b {
        public a() {
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@l ComponentName componentName, @l IBinder iBinder) {
        try {
            a.b.e4(iBinder);
            new a();
            throw null;
        } catch (Exception e12) {
            String message = e12.getMessage();
            if (message == null) {
                message = "";
            }
            new RuStoreException(message);
            throw null;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(@l ComponentName componentName) {
        new RuStoreException("onServiceDisconnected");
        throw null;
    }
}
