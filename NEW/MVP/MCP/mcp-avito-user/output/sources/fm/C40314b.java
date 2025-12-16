package fM;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import kM.AbstractC42597a;
import kM.AbstractC42598b;
import kM.AbstractC42600d;
import kM.AbstractC42601e;
import kM.InterfaceC42599c;
import kM.f;
import kM.g;

/* compiled from: IacProblemInteractorImpl_Factory.java */
@e
@y
@x
/* renamed from: fM.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C40314b implements h<C40313a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<AbstractC42597a> f395850a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<AbstractC42598b> f395851b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC42599c> f395852c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<AbstractC42600d> f395853d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<AbstractC42601e> f395854e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<f> f395855f;

    /* renamed from: g, reason: collision with root package name */
    public final u f395856g;

    public C40314b(u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.f395850a = provider;
        this.f395851b = provider2;
        this.f395852c = provider3;
        this.f395853d = provider4;
        this.f395854e = provider5;
        this.f395855f = provider6;
        this.f395856g = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C40313a(this.f395850a.get(), this.f395851b.get(), this.f395852c.get(), this.f395853d.get(), this.f395854e.get(), this.f395855f.get(), (g) this.f395856g.get());
    }
}
