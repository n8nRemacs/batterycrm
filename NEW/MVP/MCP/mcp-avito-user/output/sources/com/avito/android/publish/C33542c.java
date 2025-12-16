package com.avito.android.publish;

import com.avito.android.remote.model.category_parameters.AttributesTreeConverter;
import com.avito.android.util.InterfaceC35745a5;

/* compiled from: AutoDescriptionInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.publish.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33542c implements dagger.internal.h<C33540b> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f232315a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f232316b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f232317c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f232318d;

    public C33542c(dagger.internal.u uVar, dagger.internal.u uVar2, dagger.internal.u uVar3, dagger.internal.u uVar4) {
        this.f232315a = uVar;
        this.f232316b = uVar2;
        this.f232317c = uVar3;
        this.f232318d = uVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C33540b((com.avito.android.llm.data.a) this.f232315a.get(), (com.avito.android.remote.H0) this.f232316b.get(), (InterfaceC35745a5) this.f232317c.get(), (AttributesTreeConverter) this.f232318d.get());
    }
}
