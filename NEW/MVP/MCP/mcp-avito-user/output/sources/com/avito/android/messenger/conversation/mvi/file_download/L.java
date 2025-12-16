package com.avito.android.messenger.conversation.mvi.file_download;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.conversation.mvi.data.InterfaceC32024m;
import com.avito.android.messenger.conversation.mvi.file_download.C32037a;
import com.avito.android.messenger.w0;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: FileDownloadWorkerDelegateImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class L implements dagger.internal.h<x> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<w0> f190842a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC32024m> f190843b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC47842z> f190844c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f190845d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.conversation.mvi.file_attachment.n> f190846e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f190847f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f190848g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<com.avito.android.notification.m> f190849h;

    public L(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        this.f190842a = provider;
        this.f190843b = provider2;
        this.f190844c = provider3;
        this.f190845d = uVar;
        this.f190846e = provider4;
        this.f190847f = provider5;
        this.f190848g = provider6;
        this.f190849h = provider7;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new x((w0) ((C32037a.c.j) this.f190842a).get(), (InterfaceC32024m) ((C32037a.c.C5646c) this.f190843b).get(), (InterfaceC47842z) ((C32037a.c.d) this.f190844c).get(), (InterfaceC32046j) this.f190845d.get(), (com.avito.android.messenger.conversation.mvi.file_attachment.n) ((C32037a.c.b) this.f190846e).get(), (InterfaceC28373a) ((C32037a.c.C5645a) this.f190847f).get(), (InterfaceC35745a5) ((C32037a.c.h) this.f190848g).get(), (com.avito.android.notification.m) ((C32037a.c.f) this.f190849h).get());
    }
}
