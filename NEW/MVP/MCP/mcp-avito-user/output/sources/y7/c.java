package y7;

import android.app.Activity;
import com.avito.android.C29640d;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsLoadingDialogRouterImpl_Factory.java */
@e
@y
@x
/* loaded from: classes10.dex */
public final class c implements h<C50075b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f442940a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C29640d> f442941b;

    /* renamed from: c, reason: collision with root package name */
    public final l f442942c;

    public c(l lVar, u uVar, Provider provider) {
        this.f442940a = uVar;
        this.f442941b = provider;
        this.f442942c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C50075b((com.avito.android.lib.deprecated_design.dialog.a) this.f442940a.get(), this.f442941b.get(), (Activity) this.f442942c.f393949a);
    }
}
