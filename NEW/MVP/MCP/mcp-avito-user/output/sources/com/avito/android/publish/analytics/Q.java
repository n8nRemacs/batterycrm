package com.avito.android.publish.analytics;

import com.avito.android.analytics.InterfaceC28373a;
import fW.C40343a;
import fW.C40344b;
import javax.inject.Inject;
import kotlin.Metadata;
import yc.C50213a;

/* compiled from: PublishLlmDescriptionEventTracker.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/analytics/Q;", "Lcom/avito/android/publish/analytics/P;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class Q implements P {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f232181a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C50213a f232182b;

    @Inject
    public Q(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k C50213a c50213a) {
        this.f232181a = interfaceC28373a;
        this.f232182b = c50213a;
    }

    @Override // com.avito.android.publish.analytics.P
    public final void F(@Y61.k String str, @Y61.k String str2) {
        this.f232181a.c(new fW.c(this.f232182b.b(), str, str2));
    }

    @Override // com.avito.android.publish.analytics.P
    public final void Z() {
        this.f232181a.c(new fW.d(this.f232182b.b()));
    }

    @Override // com.avito.android.publish.analytics.P
    public final void c() {
        this.f232181a.c(new C40343a(this.f232182b.b()));
    }

    @Override // com.avito.android.publish.analytics.P
    public final void t() {
        this.f232181a.c(new C40344b(this.f232182b.b()));
    }
}
