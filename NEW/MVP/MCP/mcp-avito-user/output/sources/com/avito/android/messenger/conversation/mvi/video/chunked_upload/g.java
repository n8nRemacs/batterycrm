package com.avito.android.messenger.conversation.mvi.video.chunked_upload;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import com.avito.android.messenger.di.U1;
import com.avito.android.persistence.messenger.InterfaceC33140y2;
import javax.inject.Provider;

/* compiled from: ChunkedVideoUploadManagerImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f194936a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.conversation.mvi.file_attachment.n> f194937b;

    /* renamed from: c, reason: collision with root package name */
    public final U1 f194938c;

    public g(C30102l3 c30102l3, Provider provider, U1 u12) {
        this.f194936a = c30102l3;
        this.f194937b = provider;
        this.f194938c = u12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f((Context) this.f194936a.get(), this.f194937b.get(), (InterfaceC33140y2) this.f194938c.get());
    }
}
