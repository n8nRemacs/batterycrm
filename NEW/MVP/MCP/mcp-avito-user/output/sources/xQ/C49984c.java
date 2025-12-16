package xq;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ComfortableDealInviteApi_Module_ProvideComfortableDealInviteApiFactory.java */
@e
@y
@x
/* renamed from: xq.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C49984c implements h<InterfaceC49982a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f442665a;

    public C49984c(f fVar) {
        this.f442665a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f442665a.get();
        C49983b.f442664a.getClass();
        InterfaceC49982a interfaceC49982a = (InterfaceC49982a) r02.create(InterfaceC49982a.class);
        t.d(interfaceC49982a);
        return interfaceC49982a;
    }
}
