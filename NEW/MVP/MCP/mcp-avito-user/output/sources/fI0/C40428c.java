package fi0;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: InlineFiltersApi_Module_ProvideInlineFiltersApiFactory.java */
@e
@y
@x
/* renamed from: fi0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C40428c implements h<InterfaceC40426a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f396064a;

    public C40428c(f fVar) {
        this.f396064a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f396064a.get();
        C40427b.f396063a.getClass();
        InterfaceC40426a interfaceC40426a = (InterfaceC40426a) r02.create(InterfaceC40426a.class);
        t.d(interfaceC40426a);
        return interfaceC40426a;
    }
}
