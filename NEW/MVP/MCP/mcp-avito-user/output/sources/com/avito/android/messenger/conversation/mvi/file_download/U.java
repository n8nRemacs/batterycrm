package com.avito.android.messenger.conversation.mvi.file_download;

import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: FileMessageClickInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class U implements dagger.internal.h<O> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<String> f190876a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.f> f190877b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.conversation.mvi.file_attachment.n> f190878c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f190879d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.conversation.mvi.message_menu.elements.delete_local.f> f190880e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.permissions.u> f190881f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f190882g;

    public U(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.f190876a = provider;
        this.f190877b = provider2;
        this.f190878c = provider3;
        this.f190879d = uVar;
        this.f190880e = provider4;
        this.f190881f = provider5;
        this.f190882g = provider6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new O(this.f190876a.get(), this.f190877b.get(), this.f190878c.get(), (InterfaceC32038b) this.f190879d.get(), this.f190880e.get(), this.f190881f.get(), this.f190882g.get());
    }
}
