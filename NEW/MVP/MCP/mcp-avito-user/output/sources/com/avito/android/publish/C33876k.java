package com.avito.android.publish;

import com.avito.android.publish.drafts.PublishDraftRepository;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import yc.C50213a;

/* compiled from: DraftSyncDelegateImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.publish.k, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33876k implements dagger.internal.h<C33874j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<PublishDraftRepository> f237367a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C50213a> f237368b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f237369c;

    public C33876k(Provider<PublishDraftRepository> provider, Provider<C50213a> provider2, Provider<InterfaceC35745a5> provider3) {
        this.f237367a = provider;
        this.f237368b = provider2;
        this.f237369c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C33874j(this.f237367a.get(), this.f237368b.get(), this.f237369c.get());
    }
}
