package com.avito.android.messenger.conversation.mvi.file_upload.worker;

import com.avito.android.messenger.analytics.C31667x;
import com.avito.android.messenger.conversation.mvi.data.InterfaceC32024m;
import com.avito.android.messenger.conversation.mvi.file_upload.worker.a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FileUploadWorkerDelegateImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class p implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f191301a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC32024m> f191302b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.conversation.mvi.file_attachment.n> f191303c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<C31667x> f191304d;

    public p(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f191301a = uVar;
        this.f191302b = provider;
        this.f191303c = provider2;
        this.f191304d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l((q) this.f191301a.get(), (InterfaceC32024m) ((a.c.b) this.f191302b).get(), (com.avito.android.messenger.conversation.mvi.file_attachment.n) ((a.c.C5652a) this.f191303c).get(), (C31667x) ((a.c.C5653c) this.f191304d).get());
    }
}
