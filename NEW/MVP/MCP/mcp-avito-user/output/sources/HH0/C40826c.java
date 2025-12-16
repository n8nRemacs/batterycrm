package hH0;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.Kundle;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AlertBannerPresenterDelegateImpl_Factory.java */
@e
@y
@x
/* renamed from: hH0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C40826c implements h<C40825b> {

    /* renamed from: a, reason: collision with root package name */
    public final l f397129a;

    /* renamed from: b, reason: collision with root package name */
    public final u f397130b;

    public C40826c(l lVar, u uVar) {
        this.f397129a = lVar;
        this.f397130b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C40825b((Kundle) this.f397129a.f393949a, (InterfaceC28373a) this.f397130b.get());
    }
}
