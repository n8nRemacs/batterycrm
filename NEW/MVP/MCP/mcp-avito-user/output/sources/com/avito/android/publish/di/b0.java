package com.avito.android.publish.di;

import com.avito.android.app.task.PublishDraftsSyncTask;
import com.avito.android.publish.C33876k;
import com.avito.android.publish.InterfaceC33861g;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: PublishTasksModule_ProvidePublishDraftsSaveTaskFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class b0 implements dagger.internal.h<PublishDraftsSyncTask> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.publish.drafts.D> f235266a;

    /* renamed from: b, reason: collision with root package name */
    public final C33876k f235267b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<f90.J> f235268c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.publish.drafts.E> f235269d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f235270e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.photo_cache.b> f235271f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.connection_quality.connectivity.a> f235272g;

    public b0(Provider provider, C33876k c33876k, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.f235266a = provider;
        this.f235267b = c33876k;
        this.f235268c = provider2;
        this.f235269d = provider3;
        this.f235270e = provider4;
        this.f235271f = provider5;
        this.f235272g = provider6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.publish.drafts.D d12 = this.f235266a.get();
        InterfaceC33861g interfaceC33861g = (InterfaceC33861g) this.f235267b.get();
        f90.J j12 = this.f235268c.get();
        com.avito.android.publish.drafts.E e12 = this.f235269d.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f235270e.get();
        com.avito.android.photo_cache.b bVar = this.f235271f.get();
        com.avito.android.connection_quality.connectivity.a aVar = this.f235272g.get();
        Y.f235164a.getClass();
        return new PublishDraftsSyncTask(d12, interfaceC33861g, interfaceC35745a5, j12, e12, aVar, new X(bVar, interfaceC35745a5));
    }
}
