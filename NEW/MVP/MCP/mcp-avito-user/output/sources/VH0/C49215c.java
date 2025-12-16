package vH0;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import lE.g;

/* compiled from: MyAdvertStatsPresenterDelegateImpl_Factory.java */
@e
@y
@x
/* renamed from: vH0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C49215c implements h<C49214b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f440646a;

    /* renamed from: b, reason: collision with root package name */
    public final u f440647b;

    public C49215c(u uVar, u uVar2) {
        this.f440646a = uVar;
        this.f440647b = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C49214b((InterfaceC28373a) this.f440646a.get(), (g) this.f440647b.get());
    }
}
