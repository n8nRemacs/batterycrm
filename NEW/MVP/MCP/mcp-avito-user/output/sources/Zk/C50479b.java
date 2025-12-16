package zK;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import com.avito.android.iac_dialer.impl_module.notifications.channels.IacNotificationChannelManager;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IacMediaServiceLauncherImpl_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: zK.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C50479b implements h<com.avito.android.iac_dialer.impl_module.services.media_service.a> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f444020a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<IacNotificationChannelManager> f444021b;

    /* renamed from: c, reason: collision with root package name */
    public final u f444022c;

    public C50479b(C30102l3 c30102l3, u uVar, Provider provider) {
        this.f444020a = c30102l3;
        this.f444021b = provider;
        this.f444022c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new com.avito.android.iac_dialer.impl_module.services.media_service.a((Context) this.f444020a.get(), this.f444021b.get(), (AK.a) this.f444022c.get());
    }
}
