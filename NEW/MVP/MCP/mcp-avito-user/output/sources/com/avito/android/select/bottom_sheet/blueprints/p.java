package com.avito.android.select.bottom_sheet.blueprints;

import cE.C27025b;
import com.avito.android.select.Arguments;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CheckableItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f265177a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C27025b> f265178b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f265179c;

    public p(dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider) {
        this.f265177a = lVar;
        this.f265178b = provider;
        this.f265179c = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new o((Arguments) this.f265177a.f393949a, this.f265178b.get(), (Y41.l) this.f265179c.f393949a);
    }
}
