package com.avito.android.publish.analytics;

import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.tracker.InterfaceC28489k;
import com.avito.android.analytics.screens.tracker.InterfaceC28499v;
import com.avito.android.analytics.screens.tracker.InterfaceC28501x;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PublishContactsTracker.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/analytics/n;", "Lcom/avito/android/publish/analytics/m;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.publish.analytics.n, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33528n implements InterfaceC33527m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28499v f232262a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28501x f232263b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.screens.o f232264c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public InterfaceC28489k f232265d;

    @Inject
    public C33528n(@Y61.k InterfaceC28499v interfaceC28499v, @Y61.k InterfaceC28501x interfaceC28501x, @Y61.k com.avito.android.analytics.screens.o oVar) {
        this.f232262a = interfaceC28499v;
        this.f232263b = interfaceC28501x;
        this.f232264c = oVar;
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33527m
    public final void a(@Y61.k Throwable th2) {
        InterfaceC28489k interfaceC28489k = this.f232265d;
        if (interfaceC28489k != null) {
            InterfaceC28489k.a.a(interfaceC28489k, null, new J.a(th2), 0L, 5);
        }
        this.f232265d = null;
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33527m
    public final void b() {
        InterfaceC28489k interfaceC28489k = this.f232265d;
        if (interfaceC28489k != null) {
            InterfaceC28489k.a.a(interfaceC28489k, null, J.b.f90385a, 0L, 5);
        }
        this.f232265d = null;
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33527m
    public final void c() {
        com.avito.android.analytics.screens.tracker.P pE2 = this.f232264c.e("profile-full");
        pE2.start();
        this.f232265d = pE2;
    }
}
