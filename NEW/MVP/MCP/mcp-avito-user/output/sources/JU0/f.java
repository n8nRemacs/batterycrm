package Ju0;

import AK0.l;
import Y61.k;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ServiceCalendarButtonTooltipStorage.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJu0/f;", "LJu0/e;", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f9174a;

    @Inject
    public f(@k l lVar) {
        this.f9174a = lVar;
    }

    @Override // Ju0.e
    public final boolean a() {
        return this.f9174a.c("service_calendar_button_tooltip_was_shown");
    }

    @Override // Ju0.e
    public final void b() {
        this.f9174a.putBoolean("service_calendar_button_tooltip_was_shown", true);
    }
}
