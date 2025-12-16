package pD0;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffLfConstructorOldApi_Module_ProvideTariffLfConstructorOldApiFactory.java */
@e
@y
@x
/* renamed from: pD0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C46939c implements h<InterfaceC46937a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f428278a;

    public C46939c(f fVar) {
        this.f428278a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f428278a.get();
        C46938b.f428277a.getClass();
        InterfaceC46937a interfaceC46937a = (InterfaceC46937a) r02.create(InterfaceC46937a.class);
        t.d(interfaceC46937a);
        return interfaceC46937a;
    }
}
