package com.avito.android.messenger.conversation.mvi.video.chunked_upload;

import com.avito.android.messenger.conversation.mvi.file_upload.InterfaceC32058a;
import com.avito.android.messenger.conversation.mvi.file_upload.InterfaceC32061b0;
import com.avito.android.messenger.conversation.mvi.file_upload.S;
import com.avito.android.messenger.conversation.mvi.video.chunked_upload.D;
import com.avito.android.messenger.w0;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: ChunkedVideoUploadWorkerInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class A implements dagger.internal.h<x> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<w0> f194893a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f194894b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC32061b0> f194895c;

    /* renamed from: d, reason: collision with root package name */
    public final S f194896d;

    public A(Provider provider, Provider provider2, Provider provider3, S s5) {
        this.f194893a = provider;
        this.f194894b = provider2;
        this.f194895c = provider3;
        this.f194896d = s5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new x((w0) ((D.b.i) this.f194893a).get(), (InterfaceC35745a5) ((D.b.h) this.f194894b).get(), (InterfaceC32061b0) ((D.b.e) this.f194895c).get(), (InterfaceC32058a) this.f194896d.get());
    }
}
