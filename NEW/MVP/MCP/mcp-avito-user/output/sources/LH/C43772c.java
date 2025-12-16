package lh;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BblNextStepClickAnalyticHelperImpl_Factory.java */
@e
@y
@x
/* renamed from: lh.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C43772c implements h<C43771b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f414150a;

    public C43772c(u uVar) {
        this.f414150a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C43771b((InterfaceC28373a) this.f414150a.get());
    }
}
