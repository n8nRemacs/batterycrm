package com.avito.android.publish.details.historical_suggest;

import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import nF.C44245a;

/* compiled from: HistoricalSuggestsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final u f234693a;

    /* renamed from: b, reason: collision with root package name */
    public final u f234694b;

    /* renamed from: c, reason: collision with root package name */
    public final u f234695c;

    public n(u uVar, u uVar2, u uVar3) {
        this.f234693a = uVar;
        this.f234694b = uVar2;
        this.f234695c = uVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new m((com.avito.android.geo_common.interactor.g) this.f234693a.get(), (InterfaceC35745a5) this.f234694b.get(), (C44245a) this.f234695c.get());
    }
}
