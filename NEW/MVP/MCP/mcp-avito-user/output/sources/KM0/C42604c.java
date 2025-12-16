package kM0;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VasPlanCheckoutApi_Module_ProvideVasPlanCheckoutApiFactory.java */
@e
@y
@x
/* renamed from: kM0.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C42604c implements h<InterfaceC42602a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f406249a;

    public C42604c(f fVar) {
        this.f406249a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f406249a.get();
        C42603b.f406248a.getClass();
        InterfaceC42602a interfaceC42602a = (InterfaceC42602a) r02.create(InterfaceC42602a.class);
        t.d(interfaceC42602a);
        return interfaceC42602a;
    }
}
