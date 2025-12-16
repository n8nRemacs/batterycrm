package com.avito.android.user_stats.extended_user_stats;

import android.content.res.Resources;
import androidx.view.InterfaceC23487e;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35863o4;
import javax.inject.Provider;

/* compiled from: ExtendedUserStatsViewModelFactory_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class G implements dagger.internal.h<F> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC23487e> f317125a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f317126b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f317127c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<m> f317128d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f317129e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.u f317130f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<lE.g> f317131g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<InterfaceC35863o4> f317132h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<com.avito.android.deep_linking.x> f317133i;

    public G(dagger.internal.l lVar, dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        this.f317125a = provider;
        this.f317126b = provider2;
        this.f317127c = lVar;
        this.f317128d = provider3;
        this.f317129e = provider4;
        this.f317130f = uVar;
        this.f317131g = provider5;
        this.f317132h = provider6;
        this.f317133i = provider7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new F(this.f317125a.get(), this.f317126b.get(), (Resources) this.f317127c.f393949a, this.f317128d.get(), this.f317129e.get(), (com.avito.android.user_stats.b) this.f317130f.get(), this.f317131g.get(), this.f317132h.get(), this.f317133i.get());
    }
}
