package com.avito.android.messenger.conversation.mvi.file_attachment;

import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: FileAttachmentInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<n> f190717a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f190718b;

    public k(Provider<n> provider, Provider<InterfaceC35745a5> provider2) {
        this.f190717a = provider;
        this.f190718b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j(this.f190717a.get(), this.f190718b.get());
    }
}
