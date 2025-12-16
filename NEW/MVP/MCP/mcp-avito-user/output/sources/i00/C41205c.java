package i00;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MortgageApi_Module_ProvideMortgageApiFactory.java */
@e
@y
@x
/* renamed from: i00.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C41205c implements h<InterfaceC41203a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f398336a;

    public C41205c(f fVar) {
        this.f398336a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f398336a.get();
        C41204b.f398335a.getClass();
        InterfaceC41203a interfaceC41203a = (InterfaceC41203a) r02.create(InterfaceC41203a.class);
        t.d(interfaceC41203a);
        return interfaceC41203a;
    }
}
