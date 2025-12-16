package com.avito.android.messenger.conversation.mvi.video.chunked_upload;

import com.avito.android.C30277e1;
import com.avito.android.messenger.analytics.C31667x;
import com.avito.android.messenger.conversation.mvi.data.InterfaceC32024m;
import com.avito.android.messenger.conversation.mvi.video.chunked_upload.D;
import javax.inject.Provider;

/* compiled from: ChunkedVideoUploadWorkerDelegateImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class v implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f194972a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.notification.m> f194973b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC32024m> f194974c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.conversation.mvi.file_attachment.n> f194975d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<C31667x> f194976e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<C30277e1> f194977f;

    public v(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f194972a = uVar;
        this.f194973b = provider;
        this.f194974c = provider2;
        this.f194975d = provider3;
        this.f194976e = provider4;
        this.f194977f = provider5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        w wVar = (w) this.f194972a.get();
        return new o(wVar, (InterfaceC32024m) ((D.b.C5760b) this.f194974c).get(), (com.avito.android.messenger.conversation.mvi.file_attachment.n) ((D.b.a) this.f194975d).get(), (C31667x) ((D.b.c) this.f194976e).get(), (C30277e1) ((D.b.d) this.f194977f).get());
    }
}
