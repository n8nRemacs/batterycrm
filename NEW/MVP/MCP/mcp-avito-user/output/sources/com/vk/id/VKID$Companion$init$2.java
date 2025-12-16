package com.vk.id;

import com.vk.id.analytics.VKIDAnalytics;
import com.vk.id.internal.auth.device.InternalVKIDDeviceIdProvider;
import com.vk.id.internal.context.InternalVKIDActivityStarter;
import com.vk.id.internal.context.InternalVKIDPackageManager;
import com.vk.id.internal.di.VKIDDepsProd;
import com.vk.id.internal.store.InternalVKIDPrefsStore;
import com.vk.id.network.groupsubscription.InternalVKIDGroupSubscriptionApiContract;
import com.vk.id.storage.InternalVKIDPreferencesStorage;
import com.vk.id.test.InternalVKIDImmediateApi;
import com.vk.id.test.TestSilentAuthInfoProvider;
import com.vk.id.tracking.core.CrashReporter;
import com.vk.id.tracking.core.PerformanceTracker;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;

/* compiled from: VKID.kt */
@Metadata(d1 = {"\u0000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\n\u0018\u00002\u00020\u0001R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u0005\u001a\u0004\b\r\u0010\u0007R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0005\u001a\u0004\b\u0010\u0010\u0007R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0005\u001a\u0004\b\u0013\u0010\u0007R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0005\u001a\u0004\b\u0016\u0010\u0007R\u001a\u0010\u0018\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\"\u001a\u00020!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010'\u001a\u00020&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010,\u001a\u00020+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00060"}, d2 = {"com/vk/id/VKID$Companion$init$2", "Lcom/vk/id/internal/di/VKIDDepsProd;", "Lkotlin/C;", "Lcom/vk/id/test/InternalVKIDImmediateApi;", "api", "Lkotlin/C;", "getApi", "()Lkotlin/C;", "Lcom/vk/id/network/groupsubscription/InternalVKIDGroupSubscriptionApiContract;", "groupSubscriptionApiService", "getGroupSubscriptionApiService", "Lcom/vk/id/test/TestSilentAuthInfoProvider;", "vkSilentAuthInfoProvider", "getVkSilentAuthInfoProvider", "Lcom/vk/id/internal/auth/device/InternalVKIDDeviceIdProvider$DeviceIdStorage;", "deviceIdStorage", "getDeviceIdStorage", "Lcom/vk/id/internal/store/InternalVKIDPrefsStore;", "prefsStore", "getPrefsStore", "Lcom/vk/id/storage/InternalVKIDPreferencesStorage;", "encryptedSharedPreferencesStorage", "getEncryptedSharedPreferencesStorage", "Lcom/vk/id/internal/context/InternalVKIDPackageManager;", "vkidPackageManager", "Lcom/vk/id/internal/context/InternalVKIDPackageManager;", "getVkidPackageManager", "()Lcom/vk/id/internal/context/InternalVKIDPackageManager;", "Lcom/vk/id/internal/context/InternalVKIDActivityStarter;", "activityStarter", "Lcom/vk/id/internal/context/InternalVKIDActivityStarter;", "getActivityStarter", "()Lcom/vk/id/internal/context/InternalVKIDActivityStarter;", "Lcom/vk/id/tracking/core/PerformanceTracker;", "performanceTracker", "Lcom/vk/id/tracking/core/PerformanceTracker;", "getPerformanceTracker", "()Lcom/vk/id/tracking/core/PerformanceTracker;", "Lcom/vk/id/tracking/core/CrashReporter;", "crashReporter", "Lcom/vk/id/tracking/core/CrashReporter;", "getCrashReporter", "()Lcom/vk/id/tracking/core/CrashReporter;", "Lcom/vk/id/analytics/VKIDAnalytics$Tracker;", "trackingTracker", "Lcom/vk/id/analytics/VKIDAnalytics$Tracker;", "getTrackingTracker", "()Lcom/vk/id/analytics/VKIDAnalytics$Tracker;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VKID$Companion$init$2 extends VKIDDepsProd {
    private final InternalVKIDActivityStarter activityStarter;
    private final InterfaceC42726C<InternalVKIDImmediateApi> api;
    private final CrashReporter crashReporter;
    private final InterfaceC42726C<InternalVKIDDeviceIdProvider.DeviceIdStorage> deviceIdStorage;
    private final InterfaceC42726C<InternalVKIDPreferencesStorage> encryptedSharedPreferencesStorage;
    private final InterfaceC42726C<InternalVKIDGroupSubscriptionApiContract> groupSubscriptionApiService;
    private final PerformanceTracker performanceTracker;
    private final InterfaceC42726C<InternalVKIDPrefsStore> prefsStore;
    private final VKIDAnalytics.Tracker trackingTracker;
    private final InterfaceC42726C<TestSilentAuthInfoProvider> vkSilentAuthInfoProvider;
    private final InternalVKIDPackageManager vkidPackageManager;

    @Override // com.vk.id.internal.di.VKIDDepsProd
    public InternalVKIDActivityStarter getActivityStarter() {
        return this.activityStarter;
    }

    @Override // com.vk.id.internal.di.VKIDDepsProd
    public InterfaceC42726C<InternalVKIDImmediateApi> getApi() {
        return this.api;
    }

    @Override // com.vk.id.internal.di.VKIDDepsProd, com.vk.id.internal.di.VKIDDeps
    public CrashReporter getCrashReporter() {
        return this.crashReporter;
    }

    @Override // com.vk.id.internal.di.VKIDDepsProd
    public InterfaceC42726C<InternalVKIDDeviceIdProvider.DeviceIdStorage> getDeviceIdStorage() {
        return this.deviceIdStorage;
    }

    @Override // com.vk.id.internal.di.VKIDDepsProd, com.vk.id.internal.di.VKIDDeps
    public InterfaceC42726C<InternalVKIDPreferencesStorage> getEncryptedSharedPreferencesStorage() {
        return this.encryptedSharedPreferencesStorage;
    }

    @Override // com.vk.id.internal.di.VKIDDepsProd, com.vk.id.internal.di.VKIDDeps
    public InterfaceC42726C<InternalVKIDGroupSubscriptionApiContract> getGroupSubscriptionApiService() {
        return this.groupSubscriptionApiService;
    }

    @Override // com.vk.id.internal.di.VKIDDepsProd, com.vk.id.internal.di.VKIDDeps
    public PerformanceTracker getPerformanceTracker() {
        return this.performanceTracker;
    }

    @Override // com.vk.id.internal.di.VKIDDepsProd
    public InterfaceC42726C<InternalVKIDPrefsStore> getPrefsStore() {
        return this.prefsStore;
    }

    @Override // com.vk.id.internal.di.VKIDDepsProd, com.vk.id.internal.di.VKIDDeps
    public VKIDAnalytics.Tracker getTrackingTracker() {
        return this.trackingTracker;
    }

    @Override // com.vk.id.internal.di.VKIDDepsProd, com.vk.id.internal.di.VKIDDeps
    public InterfaceC42726C<TestSilentAuthInfoProvider> getVkSilentAuthInfoProvider() {
        return this.vkSilentAuthInfoProvider;
    }

    @Override // com.vk.id.internal.di.VKIDDepsProd
    public InternalVKIDPackageManager getVkidPackageManager() {
        return this.vkidPackageManager;
    }
}
