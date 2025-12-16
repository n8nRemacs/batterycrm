package com.avito.android.publish.di;

import com.avito.android.app.task.PublishDraftsCleanupTask;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: PublishTasksModule_ProvidePublishDraftsCleanupTaskFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class a0 implements dagger.internal.h<PublishDraftsCleanupTask> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.account.E> f235262a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.publish.drafts.E> f235263b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f235264c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.util.C> f235265d;

    public a0(Provider<com.avito.android.account.E> provider, Provider<com.avito.android.publish.drafts.E> provider2, Provider<InterfaceC35745a5> provider3, Provider<com.avito.android.util.C> provider4) {
        this.f235262a = provider;
        this.f235263b = provider2;
        this.f235264c = provider3;
        this.f235265d = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.account.E e12 = this.f235262a.get();
        com.avito.android.publish.drafts.E e13 = this.f235263b.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f235264c.get();
        com.avito.android.util.C c12 = this.f235265d.get();
        Y.f235164a.getClass();
        return new PublishDraftsCleanupTask(e12, e13, interfaceC35745a5, c12);
    }
}
