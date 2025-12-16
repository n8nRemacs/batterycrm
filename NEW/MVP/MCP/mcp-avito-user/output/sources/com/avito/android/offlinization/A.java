package com.avito.android.offlinization;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.offlinization.analytics.events.NoCacheStartReason;
import javax.inject.Inject;
import kotlin.Metadata;
import m40.C43877a;
import r40.C47487a;

/* compiled from: OfflinizationInterceptorProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/offlinization/A;", "", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final p f208467a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final w f208468b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C47487a f208469c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f208470d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final v40.b f208471e;

    @Inject
    public A(@Y61.k p pVar, @Y61.k w wVar, @Y61.k C47487a c47487a, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k v40.b bVar) {
        this.f208467a = pVar;
        this.f208468b = wVar;
        this.f208469c = c47487a;
        this.f208470d = interfaceC28373a;
        this.f208471e = bVar;
    }

    public final void a(NoCacheStartReason noCacheStartReason) {
        if (this.f208467a.a()) {
            this.f208470d.c(new C43877a(noCacheStartReason));
        }
    }
}
