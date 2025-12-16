package ru.ok.android.externcalls.analytics;

import defpackage.j21;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.config.CallAnalyticsConfig;
import ru.ok.android.externcalls.analytics.events.CallAnalyticsEvent;
import ru.ok.android.externcalls.analytics.internal.config.CallAnalyticsConfigStorage;
import ru.ok.android.externcalls.analytics.internal.event.EventChannel;
import ru.ok.android.externcalls.analytics.internal.event.EventQueueCollector;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u001aB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u0003J\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ok/android/externcalls/analytics/CallAnalyticsSender;", "", "<init>", "()V", "Lru/ok/android/externcalls/analytics/config/CallAnalyticsConfig;", "config", "Lqqg;", "initialize", "(Lru/ok/android/externcalls/analytics/config/CallAnalyticsConfig;)V", "Lru/ok/android/externcalls/analytics/events/CallAnalyticsEvent;", "event", "send", "(Lru/ok/android/externcalls/analytics/events/CallAnalyticsEvent;)V", "forceSendScheduledEvents", "", "isIdle", "setIdle", "(Z)V", "Lru/ok/android/externcalls/analytics/CallAnalyticsSender$Listener;", "listener", "setEventListener", "(Lru/ok/android/externcalls/analytics/CallAnalyticsSender$Listener;)V", "", "LOG_TAG", "Ljava/lang/String;", "Lru/ok/android/externcalls/analytics/CallAnalyticsSender$Listener;", "Listener", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CallAnalyticsSender {
    public static final CallAnalyticsSender INSTANCE = new CallAnalyticsSender();
    private static final String LOG_TAG = "CallAnalyticsSender";
    private static volatile Listener listener;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/analytics/CallAnalyticsSender$Listener;", "", "Lru/ok/android/externcalls/analytics/events/CallAnalyticsEvent;", "event", "Lqqg;", "onNewEvent", "(Lru/ok/android/externcalls/analytics/events/CallAnalyticsEvent;)V", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Listener {
        void onNewEvent(CallAnalyticsEvent event);
    }

    private CallAnalyticsSender() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setIdle$lambda$0(boolean z) {
        return z;
    }

    public final void forceSendScheduledEvents() {
        EventQueueCollector.flushAll();
    }

    public final synchronized void initialize(CallAnalyticsConfig config) {
        CallAnalyticsConfigStorage callAnalyticsConfigStorage = CallAnalyticsConfigStorage.INSTANCE;
        if (callAnalyticsConfigStorage.getConfig() == null) {
            callAnalyticsConfigStorage.setConfig(config);
        }
    }

    public final void send(CallAnalyticsEvent event) {
        try {
            Listener listener2 = listener;
            if (listener2 != null) {
                listener2.onNewEvent(event);
            }
        } catch (Throwable th) {
            CallAnalyticsConfigStorage.INSTANCE.getLogger().e(LOG_TAG, "Error while notifying external listener", th);
        }
        CallAnalyticsConfigStorage callAnalyticsConfigStorage = CallAnalyticsConfigStorage.INSTANCE;
        if (callAnalyticsConfigStorage.getConfig() != null) {
            EventQueueCollector.getInstance(new EventChannel(event.getApiMethodName(), null, null, null, false, 30, null)).addEvent(event);
            return;
        }
        callAnalyticsConfigStorage.getLogger().e(LOG_TAG, "CallAnalyticsSender is not initialized, event=" + event + " is skipped");
    }

    public final void setEventListener(Listener listener2) {
        listener = listener2;
    }

    public final void setIdle(boolean isIdle) {
        CallAnalyticsConfigStorage.INSTANCE.getLogger().d(LOG_TAG, "CallAnalyticsSender setIdle(isIdle=" + isIdle + ")");
        EventQueueCollector.setIdleStateProvider(new j21(isIdle, 0));
    }
}
