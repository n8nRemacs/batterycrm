package nn;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CartSimilarItemsApi_Module_ProvideCartSimilarItemsApiFactory.java */
@e
@y
@x
/* renamed from: nn.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C44452c implements h<InterfaceC44450a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f419151a;

    public C44452c(f fVar) {
        this.f419151a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f419151a.get();
        C44451b.f419150a.getClass();
        InterfaceC44450a interfaceC44450a = (InterfaceC44450a) r02.create(InterfaceC44450a.class);
        t.d(interfaceC44450a);
        return interfaceC44450a;
    }
}
