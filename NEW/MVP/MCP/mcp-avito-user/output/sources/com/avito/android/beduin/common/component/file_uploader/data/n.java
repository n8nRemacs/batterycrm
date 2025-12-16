package com.avito.android.beduin.common.component.file_uploader.data;

import android.content.ContentResolver;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FileUploaderInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class n implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<b> f101263a;

    /* renamed from: b, reason: collision with root package name */
    public final u f101264b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f101265c;

    public n(u uVar, Provider provider, Provider provider2) {
        this.f101263a = provider;
        this.f101264b = uVar;
        this.f101265c = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f101263a.get(), (ContentResolver) this.f101264b.get(), this.f101265c.get());
    }
}
