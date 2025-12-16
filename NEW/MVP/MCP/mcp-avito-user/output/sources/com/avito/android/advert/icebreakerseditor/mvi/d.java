package com.avito.android.advert.icebreakerseditor.mvi;

import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import java.util.List;

/* compiled from: IcebreakersEditorBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final l f71250a;

    /* renamed from: b, reason: collision with root package name */
    public final u f71251b;

    public d(l lVar, u uVar) {
        this.f71250a = lVar;
        this.f71251b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((List) this.f71250a.f393949a, (a4.b) this.f71251b.get());
    }
}
