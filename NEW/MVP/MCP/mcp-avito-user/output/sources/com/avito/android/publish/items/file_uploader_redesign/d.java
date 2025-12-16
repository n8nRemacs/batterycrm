package com.avito.android.publish.items.file_uploader_redesign;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FileUploaderRedesignItemBlueprintImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<e> f236833a;

    /* renamed from: b, reason: collision with root package name */
    public final u f236834b;

    public d(u uVar, Provider provider) {
        this.f236833a = provider;
        this.f236834b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f236833a.get(), (com.avito.android.util.text.a) this.f236834b.get());
    }
}
