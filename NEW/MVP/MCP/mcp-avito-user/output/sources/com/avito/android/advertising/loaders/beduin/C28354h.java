package com.avito.android.advertising.loaders.beduin;

import com.avito.android.advertising.analytics.events.BannerPageSource;
import com.avito.android.advertising.loaders.beduin.C28347a;
import com.avito.android.advertising.loaders.beduin.C28355i;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.beduin.v2.engine.C36272i;
import com.google.gson.Gson;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CommercialBDUIBannerGetInteractionHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advertising/loaders/beduin/h;", "Lcom/avito/beduin/v2/interaction/repository/flow/f;", "Lcom/avito/android/advertising/loaders/beduin/a;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advertising.loaders.beduin.h, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28354h extends com.avito.beduin.v2.interaction.repository.flow.f<C28347a> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.a<com.avito.android.advertising.loaders.n> f88134c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y41.a<H> f88135d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Y41.a<BannerPageSource> f88136e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Y41.a<Boolean> f88137f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f88138g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final ConcurrentLinkedQueue<Gson> f88139h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final ConcurrentLinkedQueue<Gson> f88140i;

    /* JADX WARN: Multi-variable type inference failed */
    public C28354h(@Y61.k Y41.a<? extends com.avito.android.advertising.loaders.n> aVar, @Y61.k Y41.a<? extends H> aVar2, @Y61.k Y41.a<? extends BannerPageSource> aVar3, @Y61.k Y41.a<Boolean> aVar4, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        super(C28347a.C2609a.f88107b);
        this.f88134c = aVar;
        this.f88135d = aVar2;
        this.f88136e = aVar3;
        this.f88137f = aVar4;
        this.f88138g = interfaceC35745a5;
        this.f88139h = new ConcurrentLinkedQueue<>();
        this.f88140i = new ConcurrentLinkedQueue<>();
    }

    @Override // com.avito.beduin.v2.interaction.repository.flow.f
    public final HV0.c q(com.avito.beduin.v2.interaction.repository.flow.d dVar, Y41.l lVar, Y41.l lVar2, C36272i c36272i) {
        C28347a c28347a = (C28347a) dVar;
        boolean z12 = ((t) this.f88136e).invoke() == BannerPageSource.f87778d && ((Boolean) ((u) this.f88137f).invoke()).booleanValue();
        com.avito.android.advertising.loaders.n nVar = (com.avito.android.advertising.loaders.n) ((q) this.f88134c).invoke();
        return new C28349c((io.reactivex.rxjava3.internal.observers.y) io.reactivex.rxjava3.core.z.W(new CallableC28348b(this, z12, c28347a)).T(new C28351e(this, nVar, nVar.d(), c28347a), Integer.MAX_VALUE).d0(new C28352f(c36272i, c28347a)).m0(new C28353g(c36272i)).x0(this.f88138g.a()).v0(new C28355i.b(lVar2), new C28355i.b(lVar), io.reactivex.rxjava3.internal.functions.a.f401993c), 0);
    }
}
