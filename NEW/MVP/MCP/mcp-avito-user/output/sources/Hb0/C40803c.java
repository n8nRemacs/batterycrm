package hB0;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffCprApi_Module_ProvideTariffCprApiFactory.java */
@e
@y
@x
/* renamed from: hB0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C40803c implements h<InterfaceC40801a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f397102a;

    public C40803c(f fVar) {
        this.f397102a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f397102a.get();
        C40802b.f397101a.getClass();
        InterfaceC40801a interfaceC40801a = (InterfaceC40801a) r02.create(InterfaceC40801a.class);
        t.d(interfaceC40801a);
        return interfaceC40801a;
    }
}
