package com.avito.android.error_reporting;

import com.avito.android.error_reporting.error_reporter.n;
import com.avito.android.util.J5;
import com.yandex.metrica.YandexMetrica;
import javax.inject.Inject;
import kotlin.Metadata;
import sc.InterfaceC48152a;

/* compiled from: AppMetricaErrorReporter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/error_reporting/a;", "Lcom/avito/android/error_reporting/error_reporter/n;", "Lcom/avito/android/util/J5;", "_common_analytics-appmetrica_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a extends J5 implements n {

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final InterfaceC48152a f147773c;

    @Inject
    public a(@Y61.l InterfaceC48152a interfaceC48152a) {
        this.f147773c = interfaceC48152a;
    }

    @Override // com.avito.android.error_reporting.error_reporter.n
    public final void b(@Y61.k String str, @Y61.k String str2) {
        YandexMetrica.putErrorEnvironmentValue(str, str2);
    }

    @Override // com.avito.android.error_reporting.error_reporter.n
    public final int d() {
        return Integer.MAX_VALUE;
    }

    @Override // com.avito.android.error_reporting.error_reporter.n
    public final void e(@Y61.k String str) {
        YandexMetrica.setUserProfileID(str);
    }

    @Override // com.avito.android.error_reporting.error_reporter.n
    public final void g(@Y61.k Throwable th2) {
        YandexMetrica.reportError("Error sent with AppMetricaErrorReporter#trackException", th2);
    }

    @Override // com.avito.android.error_reporting.error_reporter.n
    public final void log(@Y61.k String str) {
        YandexMetrica.reportEvent(str);
    }

    @Override // com.avito.android.error_reporting.error_reporter.n
    public final void n(int i12, @Y61.k String str) {
        YandexMetrica.putErrorEnvironmentValue(str, String.valueOf(i12));
    }

    @Override // com.avito.android.util.J5
    public final void o() {
        InterfaceC48152a interfaceC48152a = this.f147773c;
        if (interfaceC48152a != null) {
            interfaceC48152a.a();
        }
    }
}
