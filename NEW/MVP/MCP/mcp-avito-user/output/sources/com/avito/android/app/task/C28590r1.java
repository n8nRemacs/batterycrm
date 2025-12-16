package com.avito.android.app.task;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.publish.drafts.C33848n;
import com.avito.android.publish.drafts.InterfaceC33843i;
import com.avito.android.publish.drafts.PublishDraftRepository;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: PhotosCleanTask_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.app.task.r1, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28590r1 implements dagger.internal.h<PhotosCleanTask> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<PublishDraftRepository> f91726a;

    /* renamed from: b, reason: collision with root package name */
    public final C33848n f91727b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f91728c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f91729d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.util.C> f91730e;

    public C28590r1(Provider provider, C33848n c33848n, Provider provider2, dagger.internal.f fVar, Provider provider3) {
        this.f91726a = provider;
        this.f91727b = c33848n;
        this.f91728c = provider2;
        this.f91729d = fVar;
        this.f91730e = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new PhotosCleanTask(this.f91726a.get(), (InterfaceC33843i) this.f91727b.get(), this.f91728c.get(), (InterfaceC28373a) this.f91729d.get(), this.f91730e.get());
    }
}
