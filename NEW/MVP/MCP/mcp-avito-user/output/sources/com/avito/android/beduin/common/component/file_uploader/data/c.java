package com.avito.android.beduin.common.component.file_uploader.data;

import com.avito.android.account.E;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FileUploaderApiWrapper_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<a> f101239a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<E> f101240b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f101241c;

    public c(Provider<a> provider, Provider<E> provider2, Provider<InterfaceC35745a5> provider3) {
        this.f101239a = provider;
        this.f101240b = provider2;
        this.f101241c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(dagger.internal.g.a(w.a(this.f101239a)), this.f101240b.get(), this.f101241c.get());
    }
}
