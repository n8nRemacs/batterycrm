package com.avito.android.antifraud.device_info.task;

import Y61.k;
import Zc.C19533a;
import Zc.InterfaceC19534b;
import bd.C25630a;
import com.avito.android.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.app.task.ApplicationForegroundStartupTask;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import dd.InterfaceC39704a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.reflect.n;

/* compiled from: SendDeviceInfoTask.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/antifraud/device_info/task/SendDeviceInfoTask;", "Lcom/avito/android/app/task/ApplicationForegroundStartupTask;", "Lcom/avito/android/analytics/a;", "analytics", "LZc/b;", "deviceInfoExtractor", "Lcom/avito/android/P;", "coreFeatures", "Ldd/a;", "storage", "<init>", "(Lcom/avito/android/analytics/a;LZc/b;Lcom/avito/android/P;Ldd/a;)V", "Lkotlin/G0;", "execute", "()V", "Lcom/avito/android/analytics/a;", "LZc/b;", "Lcom/avito/android/P;", "Ldd/a;", "_common_antifraud_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SendDeviceInfoTask implements ApplicationForegroundStartupTask {

    @k
    private final InterfaceC28373a analytics;

    @k
    private final P coreFeatures;

    @k
    private final InterfaceC19534b deviceInfoExtractor;

    @k
    private final InterfaceC39704a storage;

    @Inject
    public SendDeviceInfoTask(@k InterfaceC28373a interfaceC28373a, @k InterfaceC19534b interfaceC19534b, @k P p12, @k InterfaceC39704a interfaceC39704a) {
        this.analytics = interfaceC28373a;
        this.deviceInfoExtractor = interfaceC19534b;
        this.coreFeatures = p12;
        this.storage = interfaceC39704a;
    }

    @Override // com.avito.android.app.task.ApplicationForegroundStartupTask
    public void execute() {
        P p12 = this.coreFeatures;
        p12.getClass();
        n<Object> nVar = P.f67370w0[69];
        if (((Boolean) p12.f67401c0.a().invoke()).booleanValue()) {
            try {
                C19533a c19533aA = this.deviceInfoExtractor.a();
                if (c19533aA.equals(this.storage.b())) {
                    return;
                }
                this.analytics.c(new C25630a(c19533aA));
                this.storage.a(c19533aA);
            } catch (Throwable th2) {
                this.analytics.c(new NonFatalErrorEvent("Error while extracting device info", th2, null, null, 12, null));
            }
        }
    }
}
