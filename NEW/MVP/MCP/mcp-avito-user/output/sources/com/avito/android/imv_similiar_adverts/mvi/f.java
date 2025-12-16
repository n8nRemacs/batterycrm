package com.avito.android.imv_similiar_adverts.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.imv_similiar_adverts.ImvSimilarAdvertsParams;
import com.avito.android.imv_similiar_adverts.n;
import com.avito.android.util.R0;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ImvSimilarAdvertsBootstrap_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/imv_similiar_adverts/mvi/f;", "Ldagger/internal/h;", "Lcom/avito/android/imv_similiar_adverts/mvi/e;", "a", "_avito_imv-similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final a f170912f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<n> f170913a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.l f170914b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.error.i f170915c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f170916d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Provider<R0> f170917e;

    /* compiled from: ImvSimilarAdvertsBootstrap_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/imv_similiar_adverts/mvi/f$a;", "", "<init>", "()V", "_avito_imv-similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public f(@Y61.k Provider provider, @Y61.k dagger.internal.l lVar, @Y61.k com.avito.android.remote.error.i iVar, @Y61.k dagger.internal.f fVar, @Y61.k Provider provider2) {
        this.f170913a = provider;
        this.f170914b = lVar;
        this.f170915c = iVar;
        this.f170916d = fVar;
        this.f170917e = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        n nVar = this.f170913a.get();
        ImvSimilarAdvertsParams imvSimilarAdvertsParams = (ImvSimilarAdvertsParams) this.f170914b.f393949a;
        com.avito.android.remote.error.f fVar = (com.avito.android.remote.error.f) this.f170915c.get();
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f170916d.get();
        R0 r02 = this.f170917e.get();
        f170912f.getClass();
        return new e(nVar, imvSimilarAdvertsParams, fVar, interfaceC28373a, r02);
    }
}
