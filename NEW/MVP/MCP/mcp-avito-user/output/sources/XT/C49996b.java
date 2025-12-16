package xt;

import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BottomSheetActualizationPhoneInteractor_Factory.java */
@e
@y
@x
/* renamed from: xt.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C49996b implements h<C49995a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<DP.a> f442686a;

    public C49996b(Provider<DP.a> provider) {
        this.f442686a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C49995a(g.a(w.a(this.f442686a)));
    }
}
