package com.avito.android.contact_access.contact_access_service.view;

import com.avito.android.analytics.screens.o;
import com.avito.android.analytics.screens.tracker.InterfaceC28499v;
import com.avito.android.analytics.screens.tracker.InterfaceC28501x;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ContactAccessServicePerformanceTracker.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/contact_access/contact_access_service/view/g;", "Lcom/avito/android/contact_access/contact_access_service/view/f;", "_avito_job_contact-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28499v f126043a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28501x f126044b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final o f126045c;

    @Inject
    public g(@Y61.k InterfaceC28499v interfaceC28499v, @Y61.k InterfaceC28501x interfaceC28501x, @Y61.k o oVar) {
        this.f126043a = interfaceC28499v;
        this.f126044b = interfaceC28501x;
        this.f126045c = oVar;
    }

    @Override // com.avito.android.contact_access.contact_access_service.view.f
    public final void a(long j12) {
        this.f126043a.a(j12);
    }

    @Override // com.avito.android.contact_access.contact_access_service.view.f
    public final void d() {
        this.f126044b.b(-1L);
    }

    @Override // com.avito.android.contact_access.contact_access_service.view.f
    public final void e() {
        this.f126044b.start();
    }
}
