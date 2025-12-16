package tH0;

import com.avito.android.user_advert.advert.InterfaceC35384d1;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RejectReasonPresenterDelegateImpl_Factory.java */
@e
@y
@x
/* renamed from: tH0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C48558c implements h<C48557b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f439220a;

    public C48558c(u uVar) {
        this.f439220a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C48557b((InterfaceC35384d1) this.f439220a.get());
    }
}
