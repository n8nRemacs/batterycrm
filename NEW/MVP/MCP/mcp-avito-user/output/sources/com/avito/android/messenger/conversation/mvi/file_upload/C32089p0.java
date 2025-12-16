package com.avito.android.messenger.conversation.mvi.file_upload;

import javax.inject.Provider;

/* compiled from: MessengerVoiceFileUploadCancellerImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.conversation.mvi.file_upload.p0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32089p0 implements dagger.internal.h<C32087o0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.conversation.mvi.file_upload.worker.c> f191202a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.conversation.mvi.file_attachment.n> f191203b;

    public C32089p0(Provider<com.avito.android.messenger.conversation.mvi.file_upload.worker.c> provider, Provider<com.avito.android.messenger.conversation.mvi.file_attachment.n> provider2) {
        this.f191202a = provider;
        this.f191203b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C32087o0(this.f191202a.get(), this.f191203b.get());
    }
}
