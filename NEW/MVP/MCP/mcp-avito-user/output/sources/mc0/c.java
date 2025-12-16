package Mc0;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ProfileVkLinkingApi_Module_ProvideProfileVkLinkingApiFactory.java */
@e
@y
@x
/* loaded from: classes16.dex */
public final class c implements h<InterfaceC14468a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f10852a;

    public c(f fVar) {
        this.f10852a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f10852a.get();
        C14469b.f10851a.getClass();
        InterfaceC14468a interfaceC14468a = (InterfaceC14468a) r02.create(InterfaceC14468a.class);
        t.d(interfaceC14468a);
        return interfaceC14468a;
    }
}
