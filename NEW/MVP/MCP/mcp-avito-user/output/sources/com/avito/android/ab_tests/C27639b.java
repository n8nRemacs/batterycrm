package com.avito.android.ab_tests;

import Ec.InterfaceC13473b;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.y;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ABTestConfigTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ab_tests/b;", "Lcom/avito/android/ab_tests/a;", "_avito_ab-tests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.ab_tests.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27639b implements InterfaceC27638a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f67754a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13473b f67755b;

    @Inject
    public C27639b(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k InterfaceC13473b interfaceC13473b) {
        this.f67754a = interfaceC28373a;
        this.f67755b = interfaceC13473b;
    }

    @Override // com.avito.android.ab_tests.InterfaceC27638a
    public final void a(boolean z12) {
        this.f67754a.c(new com.avito.android.analytics.events.e(z12));
    }

    @Override // com.avito.android.ab_tests.InterfaceC27638a
    public final void b() {
        this.f67754a.c(new y.a(this.f67755b.getF4113b() + ".ab-test-config.absolute.gson-fallback", 1L));
    }

    @Override // com.avito.android.ab_tests.InterfaceC27638a
    public final void c() {
        this.f67754a.c(new com.avito.android.analytics.events.f());
    }

    @Override // com.avito.android.ab_tests.InterfaceC27638a
    public final void d() {
        this.f67754a.c(new y.a(this.f67755b.getF4113b() + ".ab-test-config.absolute.store", 1L));
    }
}
