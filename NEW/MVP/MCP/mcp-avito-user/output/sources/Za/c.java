package ZA;

import com.avito.android.advert.viewed.persistance.j;
import com.avito.android.serp.adapter.InterfaceC34904z0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ExtendedProfileSerpAdvertConverterImpl_Factory.java */
@e
@y
@x
/* loaded from: classes13.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.favorite.x> f19952a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<j> f19953b;

    /* renamed from: c, reason: collision with root package name */
    public final u f19954c;

    public c(u uVar, Provider provider, Provider provider2) {
        this.f19952a = provider;
        this.f19953b = provider2;
        this.f19954c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f19952a.get(), this.f19953b.get(), (InterfaceC34904z0) this.f19954c.get());
    }
}
