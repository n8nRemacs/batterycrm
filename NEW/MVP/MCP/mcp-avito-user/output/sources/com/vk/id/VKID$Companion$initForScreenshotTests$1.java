package com.vk.id;

import com.vk.id.analytics.VKIDAnalytics;
import com.vk.id.internal.auth.ServiceCredentials;
import com.vk.id.internal.di.VKIDDepsProd;
import com.vk.id.storage.InternalVKIDPreferencesStorage;
import com.vk.id.tracking.core.CrashReporter;
import com.vk.id.tracking.core.PerformanceTracker;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;

/* compiled from: VKID.kt */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0018\u0010\fR \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0005\u001a\u0004\b\u001b\u0010\u0007¨\u0006\u001c"}, d2 = {"com/vk/id/VKID$Companion$initForScreenshotTests$1", "Lcom/vk/id/internal/di/VKIDDepsProd;", "Lkotlin/C;", "Lcom/vk/id/internal/auth/ServiceCredentials;", "serviceCredentials", "Lkotlin/C;", "getServiceCredentials", "()Lkotlin/C;", "Lcom/vk/id/analytics/VKIDAnalytics$Tracker;", "statTracker", "Lcom/vk/id/analytics/VKIDAnalytics$Tracker;", "getStatTracker", "()Lcom/vk/id/analytics/VKIDAnalytics$Tracker;", "Lcom/vk/id/tracking/core/CrashReporter;", "crashReporter", "Lcom/vk/id/tracking/core/CrashReporter;", "getCrashReporter", "()Lcom/vk/id/tracking/core/CrashReporter;", "Lcom/vk/id/tracking/core/PerformanceTracker;", "performanceTracker", "Lcom/vk/id/tracking/core/PerformanceTracker;", "getPerformanceTracker", "()Lcom/vk/id/tracking/core/PerformanceTracker;", "trackingTracker", "getTrackingTracker", "Lcom/vk/id/storage/InternalVKIDPreferencesStorage;", "encryptedSharedPreferencesStorage", "getEncryptedSharedPreferencesStorage", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VKID$Companion$initForScreenshotTests$1 extends VKIDDepsProd {
    private final CrashReporter crashReporter;
    private final InterfaceC42726C<InternalVKIDPreferencesStorage> encryptedSharedPreferencesStorage;
    private final PerformanceTracker performanceTracker;
    private final InterfaceC42726C<ServiceCredentials> serviceCredentials;
    private final VKIDAnalytics.Tracker statTracker;
    private final VKIDAnalytics.Tracker trackingTracker;

    @Override // com.vk.id.internal.di.VKIDDepsProd, com.vk.id.internal.di.VKIDDeps
    public CrashReporter getCrashReporter() {
        return this.crashReporter;
    }

    @Override // com.vk.id.internal.di.VKIDDepsProd, com.vk.id.internal.di.VKIDDeps
    public InterfaceC42726C<InternalVKIDPreferencesStorage> getEncryptedSharedPreferencesStorage() {
        return this.encryptedSharedPreferencesStorage;
    }

    @Override // com.vk.id.internal.di.VKIDDepsProd, com.vk.id.internal.di.VKIDDeps
    public PerformanceTracker getPerformanceTracker() {
        return this.performanceTracker;
    }

    @Override // com.vk.id.internal.di.VKIDDepsProd, com.vk.id.internal.di.VKIDDeps
    public InterfaceC42726C<ServiceCredentials> getServiceCredentials() {
        return this.serviceCredentials;
    }

    @Override // com.vk.id.internal.di.VKIDDepsProd, com.vk.id.internal.di.VKIDDeps
    public VKIDAnalytics.Tracker getStatTracker() {
        return this.statTracker;
    }

    @Override // com.vk.id.internal.di.VKIDDepsProd, com.vk.id.internal.di.VKIDDeps
    public VKIDAnalytics.Tracker getTrackingTracker() {
        return this.trackingTracker;
    }
}
