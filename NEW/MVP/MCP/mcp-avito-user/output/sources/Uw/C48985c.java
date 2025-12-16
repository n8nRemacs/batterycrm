package uW;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RadiusApi_Module_ProvideRadiusApiFactory.java */
@e
@y
@x
/* renamed from: uW.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C48985c implements h<InterfaceC48983a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f440078a;

    public C48985c(f fVar) {
        this.f440078a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f440078a.get();
        C48984b.f440077a.getClass();
        InterfaceC48983a interfaceC48983a = (InterfaceC48983a) r02.create(InterfaceC48983a.class);
        t.d(interfaceC48983a);
        return interfaceC48983a;
    }
}
