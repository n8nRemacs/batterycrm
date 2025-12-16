package Oy0;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StrCancellationSettingsApi_Module_ProvideStrCancellationSettingsApiFactory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class c implements h<InterfaceC14756a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f12742a;

    public c(f fVar) {
        this.f12742a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f12742a.get();
        b.f12741a.getClass();
        InterfaceC14756a interfaceC14756a = (InterfaceC14756a) r02.create(InterfaceC14756a.class);
        t.d(interfaceC14756a);
        return interfaceC14756a;
    }
}
