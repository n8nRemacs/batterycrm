package yF;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ApplyScreenApi_Module_ProvideApplyScreenApiFactory.java */
@e
@y
@x
/* loaded from: classes13.dex */
public final class c implements h<InterfaceC50106a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f443001a;

    public c(f fVar) {
        this.f443001a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f443001a.get();
        b.f443000a.getClass();
        InterfaceC50106a interfaceC50106a = (InterfaceC50106a) r02.create(InterfaceC50106a.class);
        t.d(interfaceC50106a);
        return interfaceC50106a;
    }
}
