package com.avito.android.messenger.conversation.mvi.file_upload;

/* compiled from: FileUploadModule_GetFileUploadApiFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class S implements dagger.internal.h<InterfaceC32058a> {

    /* renamed from: a, reason: collision with root package name */
    public final Q f191090a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f191091b;

    public S(Q q12, dagger.internal.u uVar) {
        this.f191090a = q12;
        this.f191091b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.remote.R0 r02 = (com.avito.android.remote.R0) this.f191091b.get();
        this.f191090a.getClass();
        InterfaceC32058a interfaceC32058a = (InterfaceC32058a) r02.create(InterfaceC32058a.class);
        dagger.internal.t.d(interfaceC32058a);
        return interfaceC32058a;
    }
}
