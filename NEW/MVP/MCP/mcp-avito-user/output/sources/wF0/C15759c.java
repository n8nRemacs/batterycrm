package Wf0;

import com.avito.android.push.impl_module.token.sending.startup.PushTokenUpdateStartupTask;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PushTokenUpdateStartupTask_Factory.java */
@e
@y
@x
/* renamed from: Wf0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C15759c implements h<PushTokenUpdateStartupTask> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.push.impl_module.token.sending.short_task.c> f18000a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.push.impl_module.token.sending.analytics.b> f18001b;

    public C15759c(Provider<com.avito.android.push.impl_module.token.sending.short_task.c> provider, Provider<com.avito.android.push.impl_module.token.sending.analytics.b> provider2) {
        this.f18000a = provider;
        this.f18001b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new PushTokenUpdateStartupTask(this.f18000a.get(), this.f18001b.get());
    }
}
