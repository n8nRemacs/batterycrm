package iH0;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.Kundle;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AuctionBannerPresenterDelegateImpl_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final l f398462a;

    /* renamed from: b, reason: collision with root package name */
    public final u f398463b;

    public c(l lVar, u uVar) {
        this.f398462a = lVar;
        this.f398463b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b((Kundle) this.f398462a.f393949a, (InterfaceC28373a) this.f398463b.get());
    }
}
