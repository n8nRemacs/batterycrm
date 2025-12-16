package qb;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AvitoTargetingApi_Module_ProvideAvitoTargetingApiFactory.java */
@e
@y
@x
/* renamed from: qb.d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C47371d implements h<InterfaceC47368a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f429303a;

    public C47371d(f fVar) {
        this.f429303a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f429303a.get();
        C47370c.f429302a.getClass();
        InterfaceC47368a interfaceC47368a = (InterfaceC47368a) r02.create(InterfaceC47368a.class);
        t.d(interfaceC47368a);
        return interfaceC47368a;
    }
}
