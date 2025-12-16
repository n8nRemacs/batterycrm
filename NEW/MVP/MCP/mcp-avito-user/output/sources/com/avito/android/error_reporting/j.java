package com.avito.android.error_reporting;

import android.app.Application;
import com.avito.android.error_reporting.error_reporter.n;
import com.avito.android.util.J5;
import com.avito.android.util.V2;
import io.sentry.event.Breadcrumb;
import io.sentry.event.Event;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import t41.C48502a;
import y41.C50056b;

/* compiled from: SentryErrorReporter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/error_reporting/j;", "Lcom/avito/android/error_reporting/error_reporter/n;", "Lcom/avito/android/util/J5;", "_common_error-reporting-sentry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class j extends J5 implements n {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Application f147916c;

    @Inject
    public j(@Y61.k Application application) {
        this.f147916c = application;
    }

    @Override // com.avito.android.error_reporting.error_reporter.n
    public final void b(@Y61.k String str, @Y61.k String str2) {
        io.sentry.b.c().a(str, str2);
    }

    @Override // com.avito.android.error_reporting.error_reporter.n
    public final int d() {
        return Integer.MAX_VALUE;
    }

    @Override // com.avito.android.error_reporting.error_reporter.n
    public final void e(@Y61.k String str) {
        io.sentry.b.c().f405151c = new io.sentry.event.e(str);
    }

    @Override // com.avito.android.error_reporting.error_reporter.n
    public final void g(@Y61.k Throwable th2) {
        io.sentry.event.b bVar = new io.sentry.event.b();
        bVar.d(new C50056b(th2), true);
        List<Breadcrumb> listB = io.sentry.b.c().b();
        Event event = bVar.f405189a;
        event.f405174j = listB;
        for (Map.Entry<String, Object> entry : io.sentry.b.c().c().entrySet()) {
            event.a().put(entry.getKey(), entry.getValue());
        }
        event.f405169e = Event.Level.f405184d;
        io.sentry.b.d().a(bVar.b());
    }

    @Override // com.avito.android.error_reporting.error_reporter.n
    public final void log(@Y61.k String str) {
        io.sentry.context.a aVarC = io.sentry.b.c();
        new io.sentry.event.a();
        Breadcrumb breadcrumb = new Breadcrumb(str);
        synchronized (aVarC) {
            try {
                if (aVarC.f405150b == null) {
                    aVarC.f405150b = new io.sentry.util.a<>(100);
                }
                aVarC.f405150b.add(breadcrumb);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.avito.android.error_reporting.error_reporter.n
    public final void n(int i12, @Y61.k String str) {
        io.sentry.b.c().a(str, String.valueOf(i12));
    }

    @Override // com.avito.android.util.J5
    public final void o() throws Exception {
        C48502a c48502a = new C48502a();
        c48502a.f439146i = this.f147916c.getApplicationContext();
        io.sentry.b.e("http://87fb0c73db424799a2fcfd48820be6f8:71238f5c4988454c83ab5fe9bc807041@sentry.msk.avito.ru/795", c48502a);
        V2.f318762a.c("SentryCrashReporter", "initialized", null);
    }
}
