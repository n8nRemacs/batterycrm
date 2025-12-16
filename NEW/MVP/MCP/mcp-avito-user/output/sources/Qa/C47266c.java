package qA;

import com.avito.android.analytics.screens.o;
import com.avito.android.analytics.screens.tracker.InterfaceC28499v;
import com.avito.android.analytics.screens.tracker.InterfaceC28501x;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PublicProfileAdvertsTrackerImpl_Factory.java */
@e
@y
@x
/* renamed from: qA.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C47266c implements h<C47265b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28499v> f429077a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28501x> f429078b;

    /* renamed from: c, reason: collision with root package name */
    public final u f429079c;

    /* renamed from: d, reason: collision with root package name */
    public final l f429080d;

    public C47266c(l lVar, u uVar, Provider provider, Provider provider2) {
        this.f429077a = provider;
        this.f429078b = provider2;
        this.f429079c = uVar;
        this.f429080d = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C47265b(this.f429077a.get(), this.f429078b.get(), (o) this.f429079c.get(), (String) this.f429080d.f393949a);
    }
}
