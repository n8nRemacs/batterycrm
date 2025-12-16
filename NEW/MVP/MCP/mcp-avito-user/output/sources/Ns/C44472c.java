package ns;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CpxPromoGeoApi_Module_ProvideCpxPromoGeoApiFactory.java */
@e
@y
@x
/* renamed from: ns.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C44472c implements h<InterfaceC44470a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f419201a;

    public C44472c(f fVar) {
        this.f419201a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f419201a.get();
        C44471b.f419200a.getClass();
        InterfaceC44470a interfaceC44470a = (InterfaceC44470a) r02.create(InterfaceC44470a.class);
        t.d(interfaceC44470a);
        return interfaceC44470a;
    }
}
