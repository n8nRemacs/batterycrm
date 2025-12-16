package com.avito.android.publish.screen.step.request.mergedpretendpremoderation.di;

import com.avito.android.publish.C0;
import com.avito.android.publish.premoderation.k;
import com.avito.android.publish.screen.step.request.mergedpretendpremoderation.MergedPretendPremoderationFragment;
import com.avito.android.publish.screen.step.request.mergedpretendpremoderation.di.a;
import com.avito.android.publish.screen.step.request.mergedpretendpremoderation.loader.f;
import com.avito.android.publish.screen.step.request.mergedpretendpremoderation.loader.g;
import com.avito.android.publish.screen.step.request.mergedpretendpremoderation.loader.i;
import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: MergedPretendPremoderationModule_ProvideLoaderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class e implements h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final d f241761a;

    /* renamed from: b, reason: collision with root package name */
    public final l f241762b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f241763c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.publish.pretend.e> f241764d;

    /* renamed from: e, reason: collision with root package name */
    public final u f241765e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<C0> f241766f;

    public e(d dVar, l lVar, Provider provider, Provider provider2, u uVar, Provider provider3) {
        this.f241761a = dVar;
        this.f241762b = lVar;
        this.f241763c = provider;
        this.f241764d = provider2;
        this.f241765e = uVar;
        this.f241766f = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        MergedPretendPremoderationFragment.Companion.Strategy strategy = (MergedPretendPremoderationFragment.Companion.Strategy) this.f241762b.f393949a;
        R0 r02 = (R0) ((a.c.b) this.f241763c).get();
        com.avito.android.publish.pretend.e eVar = this.f241764d.get();
        k kVar = (k) this.f241765e.get();
        C0 c02 = (C0) ((a.c.f) this.f241766f).get();
        this.f241761a.getClass();
        int iOrdinal = strategy.ordinal();
        if (iOrdinal == 0) {
            return new i(r02, eVar, kVar, c02);
        }
        if (iOrdinal == 1) {
            return new com.avito.android.publish.screen.step.request.mergedpretendpremoderation.loader.h(r02, eVar, kVar, c02);
        }
        if (iOrdinal == 2) {
            return new f(r02, eVar, kVar, c02);
        }
        throw new NoWhenBranchMatchedException();
    }
}
