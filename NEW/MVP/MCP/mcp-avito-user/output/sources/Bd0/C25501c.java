package bD0;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffLfOldApi_Module_ProvideTariffLfOldApiFactory.java */
@e
@y
@x
/* renamed from: bD0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C25501c implements h<InterfaceC25499a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f57009a;

    public C25501c(f fVar) {
        this.f57009a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f57009a.get();
        C25500b.f57008a.getClass();
        InterfaceC25499a interfaceC25499a = (InterfaceC25499a) r02.create(InterfaceC25499a.class);
        t.d(interfaceC25499a);
        return interfaceC25499a;
    }
}
