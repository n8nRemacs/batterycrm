package com.avito.android.service.short_task;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.P0;

/* compiled from: SendAnalyticsRunJobFailedListener.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service/short_task/h;", "Lcom/avito/android/service/short_task/g;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f274060a;

    @Inject
    public h(@Y61.k InterfaceC28373a interfaceC28373a) {
        this.f274060a = interfaceC28373a;
    }

    @Override // com.avito.android.service.short_task.g
    public final void a(@Y61.k ShortTask shortTask, @Y61.k Throwable th2) {
        this.f274060a.c(new NonFatalErrorEvent(androidx.compose.ui.graphics.colorspace.e.k(ShortTask.class, "Cannot run task "), th2, P0.c(), new NonFatalErrorEvent.a.b(shortTask.getClass(), "Failed ".concat(th2.getClass().getSimpleName()), 0, 4, null)));
    }
}
