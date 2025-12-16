package rG;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ShiftActionApi_Module_ProvideShiftActionApiFactory.java */
@e
@y
@x
/* loaded from: classes13.dex */
public final class c implements h<InterfaceC47539a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f429671a;

    public c(f fVar) {
        this.f429671a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f429671a.get();
        C47540b.f429670a.getClass();
        InterfaceC47539a interfaceC47539a = (InterfaceC47539a) r02.create(InterfaceC47539a.class);
        t.d(interfaceC47539a);
        return interfaceC47539a;
    }
}
