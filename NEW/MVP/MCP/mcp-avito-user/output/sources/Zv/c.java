package zv;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PriceReductionApi_Module_ProvidePriceReductionApiFactory.java */
@e
@y
@x
/* loaded from: classes12.dex */
public final class c implements h<InterfaceC50632a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f444338a;

    public c(f fVar) {
        this.f444338a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f444338a.get();
        b.f444337a.getClass();
        InterfaceC50632a interfaceC50632a = (InterfaceC50632a) r02.create(InterfaceC50632a.class);
        t.d(interfaceC50632a);
        return interfaceC50632a;
    }
}
