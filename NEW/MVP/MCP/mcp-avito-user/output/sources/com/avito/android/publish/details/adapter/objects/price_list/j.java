package com.avito.android.publish.details.adapter.objects.price_list;

import com.avito.android.Q1;
import com.avito.android.util.InterfaceC35807h4;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PriceListPreviewItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final u f233376a;

    /* renamed from: b, reason: collision with root package name */
    public final u f233377b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35807h4> f233378c;

    /* renamed from: d, reason: collision with root package name */
    public final u f233379d;

    public j(u uVar, u uVar2, u uVar3, Provider provider) {
        this.f233376a = uVar;
        this.f233377b = uVar2;
        this.f233378c = provider;
        this.f233379d = uVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new i((com.avito.android.util.text.a) this.f233376a.get(), (Q1) this.f233377b.get(), this.f233378c.get(), (Q1) this.f233379d.get());
    }
}
