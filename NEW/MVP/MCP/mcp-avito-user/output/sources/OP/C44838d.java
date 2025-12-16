package op;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ContractSignAnalyticsInteractorImpl_Factory.java */
@e
@y
@x
/* renamed from: op.d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C44838d implements h<C44837c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f420187a;

    public C44838d(Provider<InterfaceC28373a> provider) {
        this.f420187a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C44837c(this.f420187a.get());
    }
}
