package com.avito.android.messenger.conversation.mvi.file_upload;

import javax.inject.Provider;

/* compiled from: MessengerFileUploadCancellerImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class Y implements dagger.internal.h<X> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.conversation.mvi.file_upload.worker.c> f191106a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f191107b;

    public Y(dagger.internal.u uVar, Provider provider) {
        this.f191106a = provider;
        this.f191107b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new X(this.f191106a.get(), (com.avito.android.messenger.conversation.mvi.file_attachment.n) this.f191107b.get());
    }
}
