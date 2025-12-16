package ni0;

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
/* renamed from: ni0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C44432c implements h<InterfaceC44430a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f419130a;

    public C44432c(f fVar) {
        this.f419130a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f419130a.get();
        C44431b.f419129a.getClass();
        InterfaceC44430a interfaceC44430a = (InterfaceC44430a) r02.create(InterfaceC44430a.class);
        t.d(interfaceC44430a);
        return interfaceC44430a;
    }
}
