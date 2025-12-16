package ih;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BbipApi_Module_ProvideBbipApiFactory.java */
@e
@y
@x
/* renamed from: ih.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C41401c implements h<InterfaceC41399a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f398621a;

    public C41401c(f fVar) {
        this.f398621a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f398621a.get();
        C41400b.f398620a.getClass();
        InterfaceC41399a interfaceC41399a = (InterfaceC41399a) r02.create(InterfaceC41399a.class);
        t.d(interfaceC41399a);
        return interfaceC41399a;
    }
}
