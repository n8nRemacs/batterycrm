package com.my.tracker;

import android.content.pm.PackageInfo;
import com.my.tracker.config.AntiFraudConfig;
import com.my.tracker.obfuscated.f2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import okhttp3.OkHttpClient;

/* loaded from: classes7.dex */
public final class MyTrackerConfig {
    private final f2 trackerConfig;

    public interface InstalledPackagesProvider {
        List<PackageInfo> getInstalledPackages();
    }

    public interface OkHttpClientProvider {
        OkHttpClient getOkHttpClient();
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Region {

        /* renamed from: EU, reason: collision with root package name */
        public static final int f365238EU = 1;

        /* renamed from: RU, reason: collision with root package name */
        public static final int f365239RU = 0;
    }

    private MyTrackerConfig(f2 f2Var) {
        this.trackerConfig = f2Var;
    }

    public static MyTrackerConfig newConfig(f2 f2Var) {
        return new MyTrackerConfig(f2Var);
    }

    public AntiFraudConfig getAntiFraudConfig() {
        return this.trackerConfig.a();
    }

    public String getApkPreinstallParams() {
        return this.trackerConfig.b();
    }

    public int getBufferingPeriod() {
        return this.trackerConfig.e();
    }

    public int getForcingPeriod() {
        return this.trackerConfig.f();
    }

    public String getId() {
        return this.trackerConfig.g();
    }

    public int getLaunchTimeout() {
        return this.trackerConfig.i();
    }

    @Deprecated
    public String getVendorAppPackage() {
        return this.trackerConfig.n();
    }

    public boolean isAutotrackingPurchaseEnabled() {
        return this.trackerConfig.o();
    }

    public boolean isTrackingEnvironmentEnabled() {
        return this.trackerConfig.p();
    }

    public boolean isTrackingLaunchEnabled() {
        return this.trackerConfig.q();
    }

    public boolean isTrackingLocationEnabled() {
        return this.trackerConfig.r();
    }

    public boolean isTrackingPreinstallEnabled() {
        return this.trackerConfig.s();
    }

    public boolean isTrackingPreinstallThirdPartyEnabled() {
        return this.trackerConfig.t();
    }

    public void setAntiFraudConfig(AntiFraudConfig antiFraudConfig) {
        this.trackerConfig.a(antiFraudConfig);
    }

    public MyTrackerConfig setApkPreinstallParams(String str) {
        this.trackerConfig.a(str);
        return this;
    }

    public MyTrackerConfig setAutotrackingPurchaseEnabled(boolean z12) {
        this.trackerConfig.a(z12);
        return this;
    }

    public MyTrackerConfig setBufferingPeriod(int i12) {
        this.trackerConfig.a(i12);
        return this;
    }

    @Deprecated
    public MyTrackerConfig setDefaultVendorAppPackage() {
        this.trackerConfig.v();
        return this;
    }

    public MyTrackerConfig setForcingPeriod(int i12) {
        this.trackerConfig.b(i12);
        return this;
    }

    public MyTrackerConfig setInstalledPackagesProvider(InstalledPackagesProvider installedPackagesProvider) {
        this.trackerConfig.a(installedPackagesProvider);
        return this;
    }

    public MyTrackerConfig setLaunchTimeout(int i12) {
        this.trackerConfig.c(i12);
        return this;
    }

    public MyTrackerConfig setOkHttpClientProvider(OkHttpClientProvider okHttpClientProvider) {
        this.trackerConfig.a(okHttpClientProvider);
        return this;
    }

    public MyTrackerConfig setProxyHost(String str) {
        this.trackerConfig.c(str);
        return this;
    }

    public MyTrackerConfig setRegion(int i12) {
        this.trackerConfig.d(i12);
        return this;
    }

    public MyTrackerConfig setTrackingEnvironmentEnabled(boolean z12) {
        this.trackerConfig.b(z12);
        return this;
    }

    public MyTrackerConfig setTrackingLaunchEnabled(boolean z12) {
        this.trackerConfig.c(z12);
        return this;
    }

    public MyTrackerConfig setTrackingLocationEnabled(boolean z12) {
        this.trackerConfig.d(z12);
        return this;
    }

    public MyTrackerConfig setTrackingPreinstallEnabled(boolean z12) {
        this.trackerConfig.e(z12);
        return this;
    }

    public MyTrackerConfig setTrackingPreinstallThirdPartyEnabled(boolean z12) {
        this.trackerConfig.f(z12);
        return this;
    }

    @Deprecated
    public MyTrackerConfig setVendorAppPackage(String str) {
        this.trackerConfig.d(str);
        return this;
    }
}
