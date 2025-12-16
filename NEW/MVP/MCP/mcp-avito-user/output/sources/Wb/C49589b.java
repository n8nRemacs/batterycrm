package wb;

import com.avito.android.C30828i;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import ub.InterfaceC49012a;

/* compiled from: BrandspaceEntryPointInteractorModule_ProvideBrandspaceEntryPointAnalyticsInteractorFactory.java */
@e
@y
@x
/* renamed from: wb.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C49589b implements h<InterfaceC49012a> {

    /* renamed from: a, reason: collision with root package name */
    public final C49588a f441629a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f441630b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C30828i> f441631c;

    public C49589b(C49588a c49588a, Provider<InterfaceC28373a> provider, Provider<C30828i> provider2) {
        this.f441629a = c49588a;
        this.f441630b = provider;
        this.f441631c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = this.f441630b.get();
        C30828i c30828i = this.f441631c.get();
        this.f441629a.getClass();
        return new ub.b(interfaceC28373a, c30828i);
    }
}
