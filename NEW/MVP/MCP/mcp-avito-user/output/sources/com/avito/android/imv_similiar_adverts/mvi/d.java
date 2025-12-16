package com.avito.android.imv_similiar_adverts.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.imv_similiar_adverts.ImvSimilarAdvertsParams;
import com.avito.android.imv_similiar_adverts.n;
import com.avito.android.util.R0;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ImvSimilarAdvertsActor_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/imv_similiar_adverts/mvi/d;", "Ldagger/internal/h;", "Lcom/avito/android/imv_similiar_adverts/mvi/c;", "a", "_avito_imv-similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final a f170896f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<n> f170897a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.l f170898b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.error.i f170899c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f170900d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Provider<R0> f170901e;

    /* compiled from: ImvSimilarAdvertsActor_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/imv_similiar_adverts/mvi/d$a;", "", "<init>", "()V", "_avito_imv-similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(@Y61.k Provider provider, @Y61.k dagger.internal.l lVar, @Y61.k com.avito.android.remote.error.i iVar, @Y61.k dagger.internal.f fVar, @Y61.k Provider provider2) {
        this.f170897a = provider;
        this.f170898b = lVar;
        this.f170899c = iVar;
        this.f170900d = fVar;
        this.f170901e = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        n nVar = this.f170897a.get();
        ImvSimilarAdvertsParams imvSimilarAdvertsParams = (ImvSimilarAdvertsParams) this.f170898b.f393949a;
        com.avito.android.remote.error.f fVar = (com.avito.android.remote.error.f) this.f170899c.get();
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f170900d.get();
        R0 r02 = this.f170901e.get();
        f170896f.getClass();
        return new c(nVar, imvSimilarAdvertsParams, fVar, interfaceC28373a, r02);
    }
}
