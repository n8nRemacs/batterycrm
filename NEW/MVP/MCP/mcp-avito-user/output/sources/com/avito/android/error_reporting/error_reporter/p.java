package com.avito.android.error_reporting.error_reporter;

import com.avito.android.util.V2;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: LoggingErrorReporter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/error_reporting/error_reporter/p;", "Lcom/avito/android/error_reporting/error_reporter/n;", "<init>", "()V", "_common_error-reporting_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class p implements n {
    @Inject
    public p() {
    }

    @Override // com.avito.android.error_reporting.error_reporter.n
    public final void b(@Y61.k String str, @Y61.k String str2) {
        V2.f318762a.c("StubFirebaseCrashlytics", androidx.compose.ui.graphics.colorspace.e.n("setInt: ", str, ", ", str2), null);
    }

    @Override // com.avito.android.error_reporting.error_reporter.n
    public final int d() {
        return Integer.MAX_VALUE;
    }

    @Override // com.avito.android.error_reporting.error_reporter.n
    public final void e(@Y61.k String str) {
        V2.f318762a.c("StubFirebaseCrashlytics", "setUserIdentifier: ".concat(str), null);
    }

    @Override // com.avito.android.error_reporting.error_reporter.n
    public final void g(@Y61.k Throwable th2) {
        V2.f318762a.c("StubFirebaseCrashlytics", "log: " + th2, null);
    }

    @Override // com.avito.android.util.InterfaceC35881r2
    public final boolean isInitialized() {
        return true;
    }

    @Override // com.avito.android.error_reporting.error_reporter.n
    public final void log(@Y61.k String str) {
        V2.f318762a.c("StubFirebaseCrashlytics", "log: ".concat(str), null);
    }

    @Override // com.avito.android.error_reporting.error_reporter.n
    public final void n(int i12, @Y61.k String str) {
        V2.f318762a.c("StubFirebaseCrashlytics", "setInt: " + str + ", " + i12, null);
    }

    @Override // com.avito.android.util.InterfaceC35881r2
    public final void a() {
    }
}
