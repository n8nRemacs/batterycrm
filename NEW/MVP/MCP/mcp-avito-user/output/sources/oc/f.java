package oC;

import com.avito.android.di.module.U4;
import com.avito.android.favorite.w;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import qu.InterfaceC47447c;

/* compiled from: FavoriteStorageModule_ProvideFavoritesPersistentStorageFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class f implements h<w> {

    /* renamed from: a, reason: collision with root package name */
    public final U4 f419587a;

    public f(U4 u42) {
        this.f419587a = u42;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC47447c interfaceC47447c = (InterfaceC47447c) this.f419587a.get();
        d.f419583a.getClass();
        return new w(interfaceC47447c);
    }
}
