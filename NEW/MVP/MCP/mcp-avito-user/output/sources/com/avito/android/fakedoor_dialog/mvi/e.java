package com.avito.android.fakedoor_dialog.mvi;

import com.avito.android.fakedoor_dialog.FakeDoorDialogParams;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import jC.InterfaceC42231a;
import javax.inject.Provider;
import nC.InterfaceC44228a;

/* compiled from: FakeDoorDialogBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f155134a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC42231a> f155135b;

    /* renamed from: c, reason: collision with root package name */
    public final u f155136c;

    public e(dagger.internal.l lVar, u uVar, Provider provider) {
        this.f155134a = lVar;
        this.f155135b = provider;
        this.f155136c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d((FakeDoorDialogParams) this.f155134a.f393949a, this.f155135b.get(), (InterfaceC44228a) this.f155136c.get());
    }
}
