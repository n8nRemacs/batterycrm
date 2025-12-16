package ou0;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ServiceFeeConditionsApi_Module_ProvideServiceFeeConditionsApiFactory.java */
@e
@y
@x
/* renamed from: ou0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C44943c implements h<InterfaceC44941a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f422326a;

    public C44943c(f fVar) {
        this.f422326a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f422326a.get();
        C44942b.f422325a.getClass();
        InterfaceC44941a interfaceC44941a = (InterfaceC44941a) r02.create(InterfaceC44941a.class);
        t.d(interfaceC44941a);
        return interfaceC44941a;
    }
}
