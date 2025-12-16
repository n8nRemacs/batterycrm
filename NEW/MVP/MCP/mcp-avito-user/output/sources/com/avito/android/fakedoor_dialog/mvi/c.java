package com.avito.android.fakedoor_dialog.mvi;

import com.avito.android.fakedoor_dialog.FakeDoorDialogParams;
import dagger.internal.x;
import dagger.internal.y;
import jC.InterfaceC42231a;
import javax.inject.Provider;

/* compiled from: FakeDoorDialogActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f155129a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC42231a> f155130b;

    public c(dagger.internal.l lVar, Provider provider) {
        this.f155129a = lVar;
        this.f155130b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b((FakeDoorDialogParams) this.f155129a.f393949a, this.f155130b.get());
    }
}
