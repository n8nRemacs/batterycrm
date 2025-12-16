package gs;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CpxPromoApi_Module_ProvideCpxPromoApiFactory.java */
@e
@y
@x
/* renamed from: gs.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C40727c implements h<InterfaceC40725a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f396892a;

    public C40727c(f fVar) {
        this.f396892a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f396892a.get();
        C40726b.f396891a.getClass();
        InterfaceC40725a interfaceC40725a = (InterfaceC40725a) r02.create(InterfaceC40725a.class);
        t.d(interfaceC40725a);
        return interfaceC40725a;
    }
}
