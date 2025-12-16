package nM0;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VasPromotionDeeplinkApi_Module_ProvideVasPromotionDeeplinkApiFactory.java */
@e
@y
@x
/* renamed from: nM0.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44294c implements h<InterfaceC44292a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f415095a;

    public C44294c(f fVar) {
        this.f415095a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f415095a.get();
        C44293b.f415094a.getClass();
        InterfaceC44292a interfaceC44292a = (InterfaceC44292a) r02.create(InterfaceC44292a.class);
        t.d(interfaceC44292a);
        return interfaceC44292a;
    }
}
