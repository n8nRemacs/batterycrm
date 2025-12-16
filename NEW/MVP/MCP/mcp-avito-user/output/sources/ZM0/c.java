package zM0;

import com.avito.konveyor.adapter.j;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerificationInnItemsModuleOld_ProvideSimpleRecyclerAdapterFactory.java */
@e
@y
@x
/* loaded from: classes5.dex */
public final class c implements h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f444030a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f444031b;

    public c(u uVar, Provider provider) {
        this.f444030a = uVar;
        this.f444031b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f444030a.get();
        com.avito.konveyor.a aVar2 = this.f444031b.get();
        C50488b.f444029a.getClass();
        return new j(aVar, aVar2);
    }
}
