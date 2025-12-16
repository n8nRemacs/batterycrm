package t9;

import com.avito.konveyor.adapter.j;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDiscountDetailsDialogImpl_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: t9.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C48522c implements dagger.internal.h<C48521b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<j> f439168a;

    /* renamed from: b, reason: collision with root package name */
    public final u f439169b;

    public C48522c(u uVar, Provider provider) {
        this.f439168a = provider;
        this.f439169b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C48521b(this.f439168a.get(), (InterfaceC48523d) this.f439169b.get());
    }
}
