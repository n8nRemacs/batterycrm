package sc;

import Y61.k;
import android.app.Application;
import com.avito.android.util.C;
import com.avito.android.util.V2;
import com.yandex.metrica.YandexMetrica;
import com.yandex.metrica.YandexMetricaConfig;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* compiled from: AppMetricaInitializerImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lsc/b;", "Lsc/a;", "_common_analytics-appmetrica_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: sc.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C48153b implements InterfaceC48152a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Application f437911a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C f437912b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f437913c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f437914d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f437915e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f437916f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f437917g;

    public C48153b(@k Application application, @k C c12, boolean z12, boolean z13, boolean z14, @k String str) {
        this.f437911a = application;
        this.f437912b = c12;
        this.f437913c = z12;
        this.f437914d = z13;
        this.f437915e = z14;
        this.f437916f = str;
    }

    @Override // com.avito.android.util.InterfaceC35881r2
    public final synchronized void a() {
        if (!this.f437917g) {
            o();
            this.f437917g = true;
        }
    }

    @Override // com.avito.android.util.InterfaceC35881r2
    /* renamed from: isInitialized, reason: from getter */
    public final boolean getF437917g() {
        return this.f437917g;
    }

    public final void o() {
        YandexMetricaConfig.Builder builderNewConfigBuilder = YandexMetricaConfig.newConfigBuilder(this.f437916f);
        builderNewConfigBuilder.withCrashReporting(this.f437913c);
        builderNewConfigBuilder.withNativeCrashReporting(this.f437914d);
        builderNewConfigBuilder.withSessionTimeout((int) TimeUnit.MINUTES.toMillis(30L));
        builderNewConfigBuilder.withLocationTracking(false);
        boolean z12 = this.f437915e;
        if (!z12) {
            builderNewConfigBuilder.withAppOpenTrackingEnabled(false);
            builderNewConfigBuilder.withSessionsAutoTrackingEnabled(false);
            builderNewConfigBuilder.withRevenueAutoTrackingEnabled(false);
        }
        this.f437912b.getF125491k().getClass();
        YandexMetricaConfig yandexMetricaConfigBuild = builderNewConfigBuilder.build();
        Application application = this.f437911a;
        YandexMetrica.activate(application, yandexMetricaConfigBuild);
        if (z12) {
            YandexMetrica.enableActivityAutoTracking(application);
        }
        V2.f318762a.i("AppMetricaInitializer", "Yandex metrica initialized", null);
    }
}
