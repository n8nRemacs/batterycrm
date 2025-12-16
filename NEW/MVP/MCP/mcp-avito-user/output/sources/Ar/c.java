package aR;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: LanguageSelectorApi_Module_ProvideLanguageSelectorApiFactory.java */
@e
@y
@x
/* loaded from: classes14.dex */
public final class c implements h<InterfaceC19809a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f20899a;

    public c(f fVar) {
        this.f20899a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f20899a.get();
        C19810b.f20898a.getClass();
        InterfaceC19809a interfaceC19809a = (InterfaceC19809a) r02.create(InterfaceC19809a.class);
        t.d(interfaceC19809a);
        return interfaceC19809a;
    }
}
