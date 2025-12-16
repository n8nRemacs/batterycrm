package np0;

import com.avito.android.util.InterfaceC35863o4;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BbipConverterImpl_Factory.java */
@e
@y
@x
/* renamed from: np0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C44463c implements h<C44462b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35863o4> f419160a;

    public C44463c(Provider<InterfaceC35863o4> provider) {
        this.f419160a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C44462b(this.f419160a.get());
    }
}
