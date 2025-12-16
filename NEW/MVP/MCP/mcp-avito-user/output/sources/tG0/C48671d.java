package tg0;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.rating.details.RatingDetailsArguments;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RatingDetailsAnalyticsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: tg0.d, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C48671d implements h<C48670c> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f439394a;

    /* renamed from: b, reason: collision with root package name */
    public final cv.e f439395b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<E> f439396c;

    /* renamed from: d, reason: collision with root package name */
    public final l f439397d;

    /* renamed from: e, reason: collision with root package name */
    public final WD.c f439398e;

    /* renamed from: f, reason: collision with root package name */
    public final l f439399f;

    /* renamed from: g, reason: collision with root package name */
    public final l f439400g;

    public C48671d(dagger.internal.f fVar, cv.e eVar, Provider provider, l lVar, WD.c cVar, l lVar2, l lVar3) {
        this.f439394a = fVar;
        this.f439395b = eVar;
        this.f439396c = provider;
        this.f439397d = lVar;
        this.f439398e = cVar;
        this.f439399f = lVar2;
        this.f439400g = lVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C48670c((InterfaceC28373a) this.f439394a.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f439395b.get(), this.f439396c.get(), (RatingDetailsArguments) this.f439397d.f393949a, (WD.a) this.f439398e.get(), ((Boolean) this.f439399f.f393949a).booleanValue(), ((Boolean) this.f439400g.f393949a).booleanValue());
    }
}
