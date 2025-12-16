package mH0;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ItemPromotionPresenterDelegateImpl_Factory.java */
@e
@y
@x
/* renamed from: mH0.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C43969d implements h<C43968c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f414448a;

    public C43969d(u uVar) {
        this.f414448a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C43968c((InterfaceC28373a) this.f414448a.get());
    }
}
