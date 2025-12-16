package com.avito.android.app.task;

import android.app.Application;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.tasks.InvalidateTimeMetricsOnBackgroundTask;
import com.avito.android.app.task.ApplicationBlockingStartupTask;
import com.avito.android.app.task.InterfaceC28559h;
import com.avito.android.memory.consumption.MemoryConsumptionTask;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import pd.InterfaceC47056b;

/* compiled from: AnalyticsCompositeBlockingTask.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u008b\u0001\b\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0017\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010+R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010,R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010-R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010.R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010/R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00100R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00101R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00102R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u00103R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u00104R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u00105R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u00106R\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u00107R\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u00108R\u001a\u0010:\u001a\u0002098\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=¨\u0006>"}, d2 = {"Lcom/avito/android/app/task/AnalyticsCompositeBlockingTask;", "Lcom/avito/android/app/task/ApplicationBlockingStartupTask;", "Lcom/avito/android/analytics/task/a;", "startupAnalyticsTracker", "Lcom/avito/android/app/task/AnalyticsWarmUpTask;", "analyticsWarmUpTask", "Lcom/avito/android/app/task/InHouseWatchDogStartupTask;", "analyticsWatchDogStartupTask", "Lcom/avito/android/app/task/RegisterAnalyticsActivityListenerTask;", "registerAnalyticsActivityListenerTask", "Lcom/avito/android/app/task/InitLogErrorsToAnalyticsTask;", "initLogErrorsToAnalyticsTask", "Lcom/avito/android/app/task/ScheduleMetricSendingTask;", "scheduleMetricSendingTask", "Lcom/avito/android/app/task/FpsMeasurerTask;", "fpsMeasurer", "Lcom/avito/android/app/task/QuicModuleInitializerTask;", "quicModuleInitializerTask", "Lcom/avito/android/memory/consumption/MemoryConsumptionTask;", "memoryMeasurerTask", "Lcom/avito/android/app/task/NetworkErrorTrackersInitTask;", "errorTrackersInitTask", "Lcom/avito/android/app/task/PerformanceScreenCoverageLaunchTask;", "perfScreenCoverageTask", "Lcom/avito/android/app/task/ScreensDistributionTrackerLaunchTask;", "screensDistributionTrackerLaunchTask", "Lcom/avito/android/app/task/AppComesForegroundLastClickUpdateTask;", "appComesForegroundLastClickUpdateTask", "Lcom/avito/android/app/task/AppStartTypeDetermineTask;", "appStartDetermineTask", "Lcom/avito/android/analytics/screens/tasks/InvalidateTimeMetricsOnBackgroundTask;", "invalidateTimeMetricsOnBackgroundTask", "Lcom/avito/android/app/task/DeeplinkEventsAnalyticsInitTask;", "deeplinkEventsAnalyticsInitTask", "<init>", "(Lcom/avito/android/analytics/task/a;Lcom/avito/android/app/task/AnalyticsWarmUpTask;Lcom/avito/android/app/task/InHouseWatchDogStartupTask;Lcom/avito/android/app/task/RegisterAnalyticsActivityListenerTask;Lcom/avito/android/app/task/InitLogErrorsToAnalyticsTask;Lcom/avito/android/app/task/ScheduleMetricSendingTask;Lcom/avito/android/app/task/FpsMeasurerTask;Lcom/avito/android/app/task/QuicModuleInitializerTask;Lcom/avito/android/memory/consumption/MemoryConsumptionTask;Lcom/avito/android/app/task/NetworkErrorTrackersInitTask;Lcom/avito/android/app/task/PerformanceScreenCoverageLaunchTask;Lcom/avito/android/app/task/ScreensDistributionTrackerLaunchTask;Lcom/avito/android/app/task/AppComesForegroundLastClickUpdateTask;Lcom/avito/android/app/task/AppStartTypeDetermineTask;Lcom/avito/android/analytics/screens/tasks/InvalidateTimeMetricsOnBackgroundTask;Lcom/avito/android/app/task/DeeplinkEventsAnalyticsInitTask;)V", "Landroid/app/Application;", "application", "Lcom/avito/android/app/task/h$a;", "execute", "(Landroid/app/Application;)Lcom/avito/android/app/task/h$a;", "Lcom/avito/android/analytics/task/a;", "Lcom/avito/android/app/task/AnalyticsWarmUpTask;", "Lcom/avito/android/app/task/InHouseWatchDogStartupTask;", "Lcom/avito/android/app/task/RegisterAnalyticsActivityListenerTask;", "Lcom/avito/android/app/task/InitLogErrorsToAnalyticsTask;", "Lcom/avito/android/app/task/ScheduleMetricSendingTask;", "Lcom/avito/android/app/task/FpsMeasurerTask;", "Lcom/avito/android/app/task/QuicModuleInitializerTask;", "Lcom/avito/android/memory/consumption/MemoryConsumptionTask;", "Lcom/avito/android/app/task/NetworkErrorTrackersInitTask;", "Lcom/avito/android/app/task/PerformanceScreenCoverageLaunchTask;", "Lcom/avito/android/app/task/ScreensDistributionTrackerLaunchTask;", "Lcom/avito/android/app/task/AppComesForegroundLastClickUpdateTask;", "Lcom/avito/android/app/task/AppStartTypeDetermineTask;", "Lcom/avito/android/analytics/screens/tasks/InvalidateTimeMetricsOnBackgroundTask;", "Lcom/avito/android/app/task/DeeplinkEventsAnalyticsInitTask;", "Lcom/avito/android/app/task/ApplicationBlockingStartupTask$Priority;", "priority", "Lcom/avito/android/app/task/ApplicationBlockingStartupTask$Priority;", "getPriority", "()Lcom/avito/android/app/task/ApplicationBlockingStartupTask$Priority;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AnalyticsCompositeBlockingTask implements ApplicationBlockingStartupTask {

    @Y61.k
    private final AnalyticsWarmUpTask analyticsWarmUpTask;

    @Y61.k
    private final InHouseWatchDogStartupTask analyticsWatchDogStartupTask;

    @Y61.k
    private final AppComesForegroundLastClickUpdateTask appComesForegroundLastClickUpdateTask;

    @Y61.k
    private final AppStartTypeDetermineTask appStartDetermineTask;

    @Y61.k
    private final DeeplinkEventsAnalyticsInitTask deeplinkEventsAnalyticsInitTask;

    @Y61.k
    private final NetworkErrorTrackersInitTask errorTrackersInitTask;

    @Y61.k
    private final FpsMeasurerTask fpsMeasurer;

    @Y61.k
    private final InitLogErrorsToAnalyticsTask initLogErrorsToAnalyticsTask;

    @Y61.k
    private final InvalidateTimeMetricsOnBackgroundTask invalidateTimeMetricsOnBackgroundTask;

    @Y61.k
    private final MemoryConsumptionTask memoryMeasurerTask;

    @Y61.k
    private final PerformanceScreenCoverageLaunchTask perfScreenCoverageTask;

    @Y61.k
    private final ApplicationBlockingStartupTask.Priority priority = ApplicationBlockingStartupTask.Priority.f91379c;

    @Y61.k
    private final QuicModuleInitializerTask quicModuleInitializerTask;

    @Y61.k
    private final RegisterAnalyticsActivityListenerTask registerAnalyticsActivityListenerTask;

    @Y61.k
    private final ScheduleMetricSendingTask scheduleMetricSendingTask;

    @Y61.k
    private final ScreensDistributionTrackerLaunchTask screensDistributionTrackerLaunchTask;

    @Y61.k
    private final com.avito.android.analytics.task.a startupAnalyticsTracker;

    @Inject
    public AnalyticsCompositeBlockingTask(@InterfaceC47056b @Y61.k com.avito.android.analytics.task.a aVar, @Y61.k AnalyticsWarmUpTask analyticsWarmUpTask, @Y61.k InHouseWatchDogStartupTask inHouseWatchDogStartupTask, @Y61.k RegisterAnalyticsActivityListenerTask registerAnalyticsActivityListenerTask, @Y61.k InitLogErrorsToAnalyticsTask initLogErrorsToAnalyticsTask, @Y61.k ScheduleMetricSendingTask scheduleMetricSendingTask, @Y61.k FpsMeasurerTask fpsMeasurerTask, @Y61.k QuicModuleInitializerTask quicModuleInitializerTask, @Y61.k MemoryConsumptionTask memoryConsumptionTask, @Y61.k NetworkErrorTrackersInitTask networkErrorTrackersInitTask, @Y61.k PerformanceScreenCoverageLaunchTask performanceScreenCoverageLaunchTask, @Y61.k ScreensDistributionTrackerLaunchTask screensDistributionTrackerLaunchTask, @Y61.k AppComesForegroundLastClickUpdateTask appComesForegroundLastClickUpdateTask, @Y61.k AppStartTypeDetermineTask appStartTypeDetermineTask, @Y61.k InvalidateTimeMetricsOnBackgroundTask invalidateTimeMetricsOnBackgroundTask, @Y61.k DeeplinkEventsAnalyticsInitTask deeplinkEventsAnalyticsInitTask) {
        this.startupAnalyticsTracker = aVar;
        this.analyticsWarmUpTask = analyticsWarmUpTask;
        this.analyticsWatchDogStartupTask = inHouseWatchDogStartupTask;
        this.registerAnalyticsActivityListenerTask = registerAnalyticsActivityListenerTask;
        this.initLogErrorsToAnalyticsTask = initLogErrorsToAnalyticsTask;
        this.scheduleMetricSendingTask = scheduleMetricSendingTask;
        this.fpsMeasurer = fpsMeasurerTask;
        this.quicModuleInitializerTask = quicModuleInitializerTask;
        this.memoryMeasurerTask = memoryConsumptionTask;
        this.errorTrackersInitTask = networkErrorTrackersInitTask;
        this.perfScreenCoverageTask = performanceScreenCoverageLaunchTask;
        this.screensDistributionTrackerLaunchTask = screensDistributionTrackerLaunchTask;
        this.appComesForegroundLastClickUpdateTask = appComesForegroundLastClickUpdateTask;
        this.appStartDetermineTask = appStartTypeDetermineTask;
        this.invalidateTimeMetricsOnBackgroundTask = invalidateTimeMetricsOnBackgroundTask;
        this.deeplinkEventsAnalyticsInitTask = deeplinkEventsAnalyticsInitTask;
    }

    @Override // com.avito.android.app.task.ApplicationBlockingStartupTask
    @Y61.k
    public InterfaceC28559h.a execute(@Y61.k Application application) {
        for (ApplicationBlockingStartupTask applicationBlockingStartupTask : C42745f0.U(this.analyticsWarmUpTask, this.analyticsWatchDogStartupTask, this.registerAnalyticsActivityListenerTask, this.initLogErrorsToAnalyticsTask, this.scheduleMetricSendingTask, this.fpsMeasurer, this.quicModuleInitializerTask, this.memoryMeasurerTask, this.errorTrackersInitTask, this.perfScreenCoverageTask, this.screensDistributionTrackerLaunchTask, this.appComesForegroundLastClickUpdateTask, this.appStartDetermineTask, this.invalidateTimeMetricsOnBackgroundTask, this.deeplinkEventsAnalyticsInitTask)) {
            com.avito.android.analytics.screens.D.f90335a.getClass();
            com.avito.android.analytics.screens.F fA2 = D.a.a();
            applicationBlockingStartupTask.execute(application);
            this.startupAnalyticsTracker.a(fA2.b(), applicationBlockingStartupTask.getClass().getSimpleName());
        }
        return InterfaceC28559h.a.c.f91606a;
    }

    @Override // com.avito.android.app.task.ApplicationBlockingStartupTask
    @Y61.k
    public ApplicationBlockingStartupTask.Priority getPriority() {
        return this.priority;
    }
}
