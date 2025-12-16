package com.avito.android.contact_access.contact_access_package.view;

import Y61.k;
import com.avito.android.analytics.screens.o;
import com.avito.android.analytics.screens.tracker.InterfaceC28499v;
import com.avito.android.analytics.screens.tracker.InterfaceC28501x;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ContactAccessPackagePerformanceTracker.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/contact_access/contact_access_package/view/g;", "Lcom/avito/android/contact_access/contact_access_package/view/f;", "_avito_job_contact-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28499v f125947a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC28501x f125948b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final o f125949c;

    @Inject
    public g(@k InterfaceC28499v interfaceC28499v, @k InterfaceC28501x interfaceC28501x, @k o oVar) {
        this.f125947a = interfaceC28499v;
        this.f125948b = interfaceC28501x;
        this.f125949c = oVar;
    }

    @Override // com.avito.android.contact_access.contact_access_package.view.f
    public final void a(long j12) {
        this.f125947a.a(j12);
    }

    @Override // com.avito.android.contact_access.contact_access_package.view.f
    public final void d() {
        this.f125948b.b(-1L);
    }

    @Override // com.avito.android.contact_access.contact_access_package.view.f
    public final void e() {
        this.f125948b.start();
    }
}
