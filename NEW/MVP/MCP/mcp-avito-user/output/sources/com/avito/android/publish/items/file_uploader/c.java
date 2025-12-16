package com.avito.android.publish.items.file_uploader;

import com.avito.android.publish.file_uploader.o;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FileUploaderItemBlueprintImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f236805a;

    /* renamed from: b, reason: collision with root package name */
    public final u f236806b;

    /* renamed from: c, reason: collision with root package name */
    public final u f236807c;

    public c(u uVar, u uVar2, Provider provider) {
        this.f236805a = provider;
        this.f236806b = uVar;
        this.f236807c = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f236805a.get(), (o) this.f236806b.get(), (InterfaceC35745a5) this.f236807c.get());
    }
}
