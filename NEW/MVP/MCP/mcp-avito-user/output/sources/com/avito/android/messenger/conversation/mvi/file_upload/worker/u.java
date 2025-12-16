package com.avito.android.messenger.conversation.mvi.file_upload.worker;

import com.avito.android.messenger.conversation.mvi.file_upload.InterfaceC32058a;
import com.avito.android.messenger.conversation.mvi.file_upload.InterfaceC32061b0;
import com.avito.android.messenger.conversation.mvi.file_upload.S;
import com.avito.android.messenger.conversation.mvi.file_upload.worker.a;
import com.avito.android.messenger.w0;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FileUploadWorkerInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class u implements dagger.internal.h<r> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<w0> f191316a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f191317b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC32061b0> f191318c;

    /* renamed from: d, reason: collision with root package name */
    public final S f191319d;

    public u(Provider provider, Provider provider2, Provider provider3, S s5) {
        this.f191316a = provider;
        this.f191317b = provider2;
        this.f191318c = provider3;
        this.f191319d = s5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new r((w0) ((a.c.g) this.f191316a).get(), (InterfaceC35745a5) ((a.c.f) this.f191317b).get(), (InterfaceC32061b0) ((a.c.d) this.f191318c).get(), (InterfaceC32058a) this.f191319d.get());
    }
}
