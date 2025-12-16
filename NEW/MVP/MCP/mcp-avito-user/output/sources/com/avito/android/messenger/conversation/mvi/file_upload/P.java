package com.avito.android.messenger.conversation.mvi.file_upload;

import com.avito.android.C30277e1;
import com.avito.android.C30713g1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.conversation.mvi.data.InterfaceC32024m;
import javax.inject.Provider;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: FileUploadInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class P implements dagger.internal.h<C32097u> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC32024m> f191076a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.conversation.mvi.file_attachment.n> f191077b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f191078c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC32060b> f191079d;

    /* renamed from: e, reason: collision with root package name */
    public final C30713g1 f191080e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.f f191081f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.conversation.mvi.file_upload.worker.c> f191082g;

    public P(Provider provider, Provider provider2, dagger.internal.f fVar, Provider provider3, C30713g1 c30713g1, dagger.internal.f fVar2, Provider provider4) {
        this.f191076a = provider;
        this.f191077b = provider2;
        this.f191078c = fVar;
        this.f191079d = provider3;
        this.f191080e = c30713g1;
        this.f191081f = fVar2;
        this.f191082g = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C32097u(this.f191076a.get(), this.f191077b.get(), (InterfaceC47842z) this.f191078c.get(), this.f191079d.get(), (C30277e1) this.f191080e.get(), (InterfaceC28373a) this.f191081f.get(), this.f191082g.get());
    }
}
