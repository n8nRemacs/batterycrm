package com.avito.android.messenger.conversation.mvi.file_download;

import android.content.Context;
import com.avito.android.C30277e1;
import com.avito.android.messenger.conversation.mvi.data.InterfaceC32024m;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: FileDownloadManagerImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.conversation.mvi.file_download.g, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32043g implements dagger.internal.h<C32042f> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f190925a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f190926b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC32024m> f190927c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.conversation.mvi.file_attachment.n> f190928d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f190929e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.u f190930f;

    public C32043g(dagger.internal.u uVar, dagger.internal.u uVar2, dagger.internal.u uVar3, Provider provider, Provider provider2, Provider provider3) {
        this.f190925a = uVar;
        this.f190926b = provider;
        this.f190927c = provider2;
        this.f190928d = provider3;
        this.f190929e = uVar2;
        this.f190930f = uVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C32042f((Context) this.f190925a.get(), this.f190926b.get(), this.f190927c.get(), this.f190928d.get(), (C30277e1) this.f190929e.get(), (com.avito.android.notification.m) this.f190930f.get());
    }
}
