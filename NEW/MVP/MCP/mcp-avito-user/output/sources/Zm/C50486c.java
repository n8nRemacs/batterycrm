package zM;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ImagePerceptionApi_Module_ProvideImagePerceptionApiFactory.java */
@e
@y
@x
/* renamed from: zM.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C50486c implements h<InterfaceC50484a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f444027a;

    public C50486c(f fVar) {
        this.f444027a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f444027a.get();
        C50485b.f444026a.getClass();
        InterfaceC50484a interfaceC50484a = (InterfaceC50484a) r02.create(InterfaceC50484a.class);
        t.d(interfaceC50484a);
        return interfaceC50484a;
    }
}
