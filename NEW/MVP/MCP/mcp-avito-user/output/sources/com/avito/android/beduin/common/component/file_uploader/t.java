package com.avito.android.beduin.common.component.file_uploader;

import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BeduinFileUploaderViewModel_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class t implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.beduin.common.form.store.b> f101325a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f101326b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f101327c;

    public t(dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f101325a = provider;
        this.f101326b = provider2;
        this.f101327c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new n(this.f101325a.get(), this.f101326b.get(), (com.avito.android.beduin.common.component.file_uploader.data.g) this.f101327c.get());
    }
}
