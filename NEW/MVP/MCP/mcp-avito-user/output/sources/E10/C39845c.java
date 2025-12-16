package e10;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MortgageRootViewStateBuilderImpl_Factory.java */
@e
@y
@x
/* renamed from: e10.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C39845c implements h<C39844b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f394262a;

    public C39845c(u uVar) {
        this.f394262a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C39844b((com.avito.android.mortgage.root.mvi.mapper.a) this.f394262a.get());
    }
}
