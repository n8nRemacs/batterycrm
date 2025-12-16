package zG0;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: UniversalTransactionApi_Module_ProvideUniversalTransactionApiFactory.java */
@e
@y
@x
/* renamed from: zG0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C50461c implements h<InterfaceC50459a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f443989a;

    public C50461c(f fVar) {
        this.f443989a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f443989a.get();
        C50460b.f443988a.getClass();
        InterfaceC50459a interfaceC50459a = (InterfaceC50459a) r02.create(InterfaceC50459a.class);
        t.d(interfaceC50459a);
        return interfaceC50459a;
    }
}
