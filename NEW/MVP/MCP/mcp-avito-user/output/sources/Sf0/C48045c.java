package sF0;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TravelSearchApi_Module_ProvideTravelSearchApiFactory.java */
@e
@y
@x
/* renamed from: sF0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C48045c implements h<InterfaceC48043a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f437550a;

    public C48045c(f fVar) {
        this.f437550a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f437550a.get();
        C48044b.f437549a.getClass();
        InterfaceC48043a interfaceC48043a = (InterfaceC48043a) r02.create(InterfaceC48043a.class);
        t.d(interfaceC48043a);
        return interfaceC48043a;
    }
}
