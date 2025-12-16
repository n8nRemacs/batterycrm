package Fc0;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SummaryApi_Module_ProvideSummaryApiFactory.java */
@e
@y
@x
/* renamed from: Fc0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C13559c implements h<InterfaceC13557a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f4801a;

    public C13559c(f fVar) {
        this.f4801a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f4801a.get();
        C13558b.f4800a.getClass();
        InterfaceC13557a interfaceC13557a = (InterfaceC13557a) r02.create(InterfaceC13557a.class);
        t.d(interfaceC13557a);
        return interfaceC13557a;
    }
}
