package U9;

import com.avito.android.serp.adapter.InterfaceC34736h0;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SpecificationsConverterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class c implements h<com.avito.android.advert_core.specifications.b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f16226a;

    public c(u uVar) {
        this.f16226a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new com.avito.android.advert_core.specifications.b((InterfaceC34736h0) this.f16226a.get());
    }
}
