package dn0;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ReviewGalleryAnalyticsInteractorImpl_Factory.java */
@e
@y
@x
/* renamed from: dn0.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C39766c implements h<C39765b> {

    /* renamed from: a, reason: collision with root package name */
    public final f f394057a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<E> f394058b;

    /* renamed from: c, reason: collision with root package name */
    public final l f394059c;

    /* renamed from: d, reason: collision with root package name */
    public final l f394060d;

    public C39766c(f fVar, l lVar, l lVar2, Provider provider) {
        this.f394057a = fVar;
        this.f394058b = provider;
        this.f394059c = lVar;
        this.f394060d = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C39765b((InterfaceC28373a) this.f394057a.get(), this.f394058b.get(), (String) this.f394059c.f393949a, (String) this.f394060d.f393949a);
    }
}
