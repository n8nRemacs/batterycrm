package ti0;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SharedApi_Module_ProvideSharedApiFactory.java */
@e
@y
@x
/* renamed from: ti0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C48677c implements h<InterfaceC48675a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f439404a;

    public C48677c(f fVar) {
        this.f439404a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f439404a.get();
        C48676b.f439403a.getClass();
        InterfaceC48675a interfaceC48675a = (InterfaceC48675a) r02.create(InterfaceC48675a.class);
        t.d(interfaceC48675a);
        return interfaceC48675a;
    }
}
