package hx0;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SocialNetworkEditorApi_Module_ProvideSocialNetworkEditorApiFactory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class c implements h<InterfaceC41187a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f398311a;

    public c(f fVar) {
        this.f398311a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f398311a.get();
        C41188b.f398310a.getClass();
        InterfaceC41187a interfaceC41187a = (InterfaceC41187a) r02.create(InterfaceC41187a.class);
        t.d(interfaceC41187a);
        return interfaceC41187a;
    }
}
