package zz;

import android.content.res.Resources;
import com.avito.android.util.InterfaceC35741a1;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ErrorHelperImpl_Factory.java */
@e
@y
@x
/* renamed from: zz.d, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C50650d implements h<C50648b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35741a1> f444401a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Resources> f444402b;

    public C50650d(Provider<InterfaceC35741a1> provider, Provider<Resources> provider2) {
        this.f444401a = provider;
        this.f444402b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C50648b(this.f444401a.get(), this.f444402b.get());
    }
}
