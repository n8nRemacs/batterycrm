package sM;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RunOnceLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class e implements dagger.internal.h<C48072d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f437617a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<i> f437618b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.iac_util_deeplinks.impl_module.splitter.features.c f437619c;

    public e(dagger.internal.f fVar, Provider provider, com.avito.android.iac_util_deeplinks.impl_module.splitter.features.c cVar) {
        this.f437617a = fVar;
        this.f437618b = provider;
        this.f437619c = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C48072d((com.avito.android.deeplink_handler.handler.composite.a) this.f437617a.get(), this.f437618b.get(), (com.avito.android.iac_util_deeplinks.impl_module.splitter.features.a) this.f437619c.get());
    }
}
