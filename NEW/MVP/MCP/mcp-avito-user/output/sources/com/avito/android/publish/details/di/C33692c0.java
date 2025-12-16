package com.avito.android.publish.details.di;

import com.avito.android.publish.items.tagged_input.C33869a;
import com.avito.android.publish.items.tagged_input.InterfaceC33870b;
import javax.inject.Provider;

/* compiled from: PublishDetailsListModule_ProvideMultiStateInputWithTagsItemBlueprintFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.publish.details.di.c0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33692c0 implements dagger.internal.h<C33869a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC33870b> f233908a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f233909b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f233910c;

    public C33692c0(dagger.internal.u uVar, dagger.internal.u uVar2, Provider provider) {
        this.f233908a = provider;
        this.f233909b = uVar;
        this.f233910c = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC33870b interfaceC33870b = this.f233908a.get();
        jG0.c cVar = (jG0.c) this.f233909b.get();
        u3.l lVar = (u3.l) this.f233910c.get();
        B.f233608a.getClass();
        return new C33869a(interfaceC33870b, cVar, lVar);
    }
}
