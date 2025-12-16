package Xo0;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SbcApi_Module_ProvideSbcApiFactory.java */
@e
@y
@x
/* renamed from: Xo0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17034c implements h<InterfaceC17032a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f19074a;

    public C17034c(f fVar) {
        this.f19074a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f19074a.get();
        C17033b.f19073a.getClass();
        InterfaceC17032a interfaceC17032a = (InterfaceC17032a) r02.create(InterfaceC17032a.class);
        t.d(interfaceC17032a);
        return interfaceC17032a;
    }
}
