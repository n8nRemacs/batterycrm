package hi;

import com.avito.android.search.filter.InterfaceC34598u;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SearchFilterActivityContract_Factory.java */
@e
@y
@x
/* renamed from: hi.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C40943c implements h<C40942b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34598u> f397372a;

    public C40943c(Provider<InterfaceC34598u> provider) {
        this.f397372a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C40942b(this.f397372a.get());
    }
}
