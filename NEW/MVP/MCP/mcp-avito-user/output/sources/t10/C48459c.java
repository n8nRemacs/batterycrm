package t10;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: UtilApi_Module_ProvideUtilApiFactory.java */
@e
@y
@x
/* renamed from: t10.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C48459c implements h<InterfaceC48457a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f439024a;

    public C48459c(f fVar) {
        this.f439024a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f439024a.get();
        C48458b.f439023a.getClass();
        InterfaceC48457a interfaceC48457a = (InterfaceC48457a) r02.create(InterfaceC48457a.class);
        t.d(interfaceC48457a);
        return interfaceC48457a;
    }
}
