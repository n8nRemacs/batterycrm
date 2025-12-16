package com.avito.android.iac_dialer.impl_module.socket_subscription.app_startup_task;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.iac_dialer.impl_module.analytics.tech_info.IacTechInfoStorage;
import com.avito.android.permissions.z;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: IacSocketSubscriptionTask_Factory.java */
@e
@y
@x
/* loaded from: classes14.dex */
public final class c implements h<IacSocketSubscriptionTask> {

    /* renamed from: a, reason: collision with root package name */
    public final f f166370a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f166371b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<CK.a> f166372c;

    /* renamed from: d, reason: collision with root package name */
    public final f f166373d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<z> f166374e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<IacTechInfoStorage> f166375f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.app_foreground_provider.util_module.a> f166376g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<com.avito.android.iac_dialer.impl_module.telecom.e> f166377h;

    public c(f fVar, Provider provider, Provider provider2, f fVar2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.f166370a = fVar;
        this.f166371b = provider;
        this.f166372c = provider2;
        this.f166373d = fVar2;
        this.f166374e = provider3;
        this.f166375f = provider4;
        this.f166376g = provider5;
        this.f166377h = provider6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new IacSocketSubscriptionTask((InterfaceC47842z) this.f166370a.get(), this.f166371b.get(), this.f166372c.get(), (InterfaceC28373a) this.f166373d.get(), this.f166374e.get(), this.f166375f.get(), this.f166376g.get(), this.f166377h.get());
    }
}
