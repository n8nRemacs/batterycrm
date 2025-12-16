package com.avito.android.mandatory_verification.domain.file_uploader;

import android.content.ContentResolver;
import com.avito.android.util.InterfaceC35741a1;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FileUploaderInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class k implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.mandatory_verification.data.d> f184564a;

    /* renamed from: b, reason: collision with root package name */
    public final u f184565b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35741a1> f184566c;

    public k(u uVar, Provider provider, Provider provider2) {
        this.f184564a = provider;
        this.f184565b = uVar;
        this.f184566c = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f184564a.get(), (ContentResolver) this.f184565b.get(), this.f184566c.get());
    }
}
