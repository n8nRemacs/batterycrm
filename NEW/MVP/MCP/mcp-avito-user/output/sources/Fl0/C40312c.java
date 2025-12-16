package fL0;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VasAutoprolongApi_Module_ProvideVasAutoprolongApiFactory.java */
@e
@y
@x
/* renamed from: fL0.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C40312c implements h<InterfaceC40310a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f395842a;

    public C40312c(f fVar) {
        this.f395842a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f395842a.get();
        C40311b.f395841a.getClass();
        InterfaceC40310a interfaceC40310a = (InterfaceC40310a) r02.create(InterfaceC40310a.class);
        t.d(interfaceC40310a);
        return interfaceC40310a;
    }
}
