package Bc;

import Bc.InterfaceC13133a;
import android.app.Application;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RefreshRateProvider_Impl_Factory.java */
@e
@y
@x
/* renamed from: Bc.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13134b implements h<InterfaceC13133a.C0060a> {

    /* renamed from: a, reason: collision with root package name */
    public final l f1560a;

    public C13134b(l lVar) {
        this.f1560a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new InterfaceC13133a.C0060a((Application) this.f1560a.f393949a);
    }
}
