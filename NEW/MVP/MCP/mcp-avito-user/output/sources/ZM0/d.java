package zM0;

import com.avito.konveyor.adapter.j;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerificationInnItemsModule_ProvideSimpleRecyclerAdapterFactory.java */
@e
@y
@x
/* loaded from: classes5.dex */
public final class d implements h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f444032a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f444033b;

    public d(u uVar, Provider provider) {
        this.f444032a = uVar;
        this.f444033b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f444032a.get();
        com.avito.konveyor.a aVar2 = this.f444033b.get();
        C50487a.f444028a.getClass();
        return new j(aVar, aVar2);
    }
}
