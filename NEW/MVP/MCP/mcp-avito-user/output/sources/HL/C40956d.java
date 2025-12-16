package hl;

import com.avito.android.bxcontent.BxContentArguments;
import com.avito.android.di.module.C30194t8;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import wI.C49514a;

/* compiled from: ObserveActiveOrdersUpdatesUseCase_Factory.java */
@e
@y
@x
/* renamed from: hl.d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C40956d implements h<C40953a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.activeOrders.e> f397398a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C49514a> f397399b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<I3.a> f397400c;

    /* renamed from: d, reason: collision with root package name */
    public final C30194t8 f397401d;

    /* renamed from: e, reason: collision with root package name */
    public final l f397402e;

    public C40956d(Provider provider, Provider provider2, Provider provider3, C30194t8 c30194t8, l lVar) {
        this.f397398a = provider;
        this.f397399b = provider2;
        this.f397400c = provider3;
        this.f397401d = c30194t8;
        this.f397402e = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C40953a(this.f397398a.get(), this.f397399b.get(), this.f397400c.get(), ((Boolean) this.f397401d.get()).booleanValue(), (BxContentArguments) this.f397402e.f393949a);
    }
}
