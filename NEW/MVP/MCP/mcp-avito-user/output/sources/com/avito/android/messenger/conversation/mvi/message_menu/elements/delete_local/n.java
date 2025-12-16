package com.avito.android.messenger.conversation.mvi.message_menu.elements.delete_local;

import com.avito.android.messenger.conversation.mvi.data.InterfaceC32024m;
import com.avito.android.messenger.conversation.mvi.file_download.InterfaceC32038b;
import com.avito.android.messenger.conversation.mvi.file_upload.InterfaceC32069f0;
import com.avito.android.messenger.conversation.mvi.file_upload.InterfaceC32079k0;
import com.avito.android.messenger.conversation.mvi.file_upload.T;
import com.avito.android.messenger.conversation.mvi.send.InterfaceC32200a;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MessageEraserImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC32024m> f191668a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.photo_cache.b> f191669b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC32200a> f191670c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f191671d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<T> f191672e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC32079k0> f191673f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC32069f0> f191674g;

    /* renamed from: h, reason: collision with root package name */
    public final u f191675h;

    public n(u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        this.f191668a = provider;
        this.f191669b = provider2;
        this.f191670c = provider3;
        this.f191671d = provider4;
        this.f191672e = provider5;
        this.f191673f = provider6;
        this.f191674g = provider7;
        this.f191675h = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new m(this.f191668a.get(), this.f191669b.get(), this.f191670c.get(), this.f191671d.get(), this.f191672e.get(), this.f191673f.get(), this.f191674g.get(), (InterfaceC32038b) this.f191675h.get());
    }
}
