package bE0;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffSelectApi_Module_ProvideTariffSelectApiFactory.java */
@e
@y
@x
/* renamed from: bE0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C25505c implements h<InterfaceC25503a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f57011a;

    public C25505c(f fVar) {
        this.f57011a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f57011a.get();
        C25504b.f57010a.getClass();
        InterfaceC25503a interfaceC25503a = (InterfaceC25503a) r02.create(InterfaceC25503a.class);
        t.d(interfaceC25503a);
        return interfaceC25503a;
    }
}
