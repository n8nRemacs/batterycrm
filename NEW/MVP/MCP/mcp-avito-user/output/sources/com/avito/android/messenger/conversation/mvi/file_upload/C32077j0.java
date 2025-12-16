package com.avito.android.messenger.conversation.mvi.file_upload;

import com.avito.android.messenger.conversation.mvi.data.InterfaceC32024m;
import com.avito.android.messenger.conversation.mvi.video.chunked_upload.InterfaceC32303b;
import javax.inject.Provider;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: MessengerVideoUploadCancellerImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.conversation.mvi.file_upload.j0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32077j0 implements dagger.internal.h<C32071g0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC32024m> f191185a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.conversation.mvi.file_attachment.n> f191186b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f191187c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f191188d;

    public C32077j0(dagger.internal.f fVar, dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f191185a = provider;
        this.f191186b = provider2;
        this.f191187c = fVar;
        this.f191188d = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C32071g0(this.f191185a.get(), this.f191186b.get(), (InterfaceC47842z) this.f191187c.get(), (InterfaceC32303b) this.f191188d.get());
    }
}
