package com.avito.android.advertising.loaders;

import com.avito.android.C30828i;
import com.avito.android.advertising.CommercialBanner;
import com.avito.android.advertising.LoadedNetworkBanner;
import com.avito.android.advertising.analytics.events.BannerEvent;
import com.avito.android.advertising.loaders.j;
import com.avito.android.advertising.loaders.my_target.MyTargetBannerLoader;
import com.avito.android.advertising.loaders.yandex.YandexBannerLoader;
import com.avito.android.remote.model.advertising.AdNetworkBannerItem;
import com.avito.android.remote.model.advertising.AvitoNetworkBannerItem;
import com.avito.android.remote.model.advertising.BuzzoolaNetworkBannerItem;
import com.avito.android.remote.model.advertising.CreativeNetworkBannerItem;
import com.avito.android.remote.model.advertising.MyTargetNetworkBannerItem;
import com.avito.android.remote.model.advertising.YandexNetworkBannerItem;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.observable.N;
import io.reactivex.rxjava3.internal.operators.observable.U;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import rb.C47627a;
import rb.InterfaceC47628b;

/* compiled from: CommercialBannersInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advertising/loaders/p;", "Lcom/avito/android/advertising/loaders/n;", "a", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class p implements n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final YandexBannerLoader f88430a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final MyTargetBannerLoader f88431b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advertising.loaders.buzzoola.f f88432c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final h31.e<com.avito.android.advertising.loaders.avito_targeting.g> f88433d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final h31.e<com.avito.android.advertising.p> f88434e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final j f88435f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47628b f88436g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final h31.e<com.avito.android.advertising.advertising_creative.mappers.a> f88437h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.server_time.a f88438i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f88439j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.C f88440k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28359c f88441l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advertising.a f88442m;

    /* renamed from: n, reason: collision with root package name */
    public int f88443n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final HashSet f88444o;

    /* compiled from: CommercialBannersInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/advertising/CommercialBanner;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/advertising/CommercialBanner;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f88452c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ a f88453d;

        public b(int i12, a aVar) {
            this.f88452c = i12;
            this.f88453d = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v0, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
        @Override // l41.g
        public final void accept(Object obj) {
            List<com.avito.android.advertising.b> listSingletonList;
            ?? SingletonList;
            CommercialBanner commercialBanner = (CommercialBanner) obj;
            p pVar = p.this;
            pVar.getClass();
            LoadedNetworkBanner loadedNetworkBanner = commercialBanner.f86892i;
            com.avito.android.advertising.b bVar = loadedNetworkBanner != null ? loadedNetworkBanner.f86903f : null;
            boolean z12 = bVar instanceof com.avito.android.advertising.c;
            InterfaceC28359c interfaceC28359c = pVar.f88441l;
            if (z12) {
                com.avito.android.advertising.c cVar = (com.avito.android.advertising.c) bVar;
                listSingletonList = cVar.c();
                List<com.avito.android.advertising.b> listC = cVar.c();
                SingletonList = new ArrayList(C42745f0.q(listC, 10));
                int i12 = 0;
                for (T t12 : listC) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    SingletonList.add(interfaceC28359c.a(commercialBanner, (com.avito.android.advertising.b) t12, Integer.valueOf(i12)));
                    i12 = i13;
                }
            } else {
                if (bVar == null) {
                    return;
                }
                listSingletonList = Collections.singletonList(bVar);
                SingletonList = Collections.singletonList(interfaceC28359c.a(commercialBanner, null, null));
            }
            pVar.f88436g.d(pVar.f((BannerInfo) C42745f0.E(SingletonList), this.f88452c));
            int size = listSingletonList.size();
            for (int i14 = 0; i14 < size; i14++) {
                pVar.f88435f.m4((BannerInfo) SingletonList.get(i14), listSingletonList.get(i14), this.f88453d.f88448d, BannerEvent.Type.f87773b);
            }
        }
    }

    /* compiled from: CommercialBannersInteractor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "error", "Lio/reactivex/rxjava3/core/E;", "Lcom/avito/android/advertising/CommercialBanner;", "apply", "(Ljava/lang/Throwable;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T, R> implements l41.o {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ BannerInfo f88455c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f88456d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ a f88457e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ List<AdNetworkBannerItem<?>> f88458f;

        /* JADX WARN: Multi-variable type inference failed */
        public c(BannerInfo bannerInfo, int i12, a aVar, List<? extends AdNetworkBannerItem<?>> list) {
            this.f88455c = bannerInfo;
            this.f88456d = i12;
            this.f88457e = aVar;
            this.f88458f = list;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            Throwable th2 = (Throwable) obj;
            List<AdNetworkBannerItem<?>> list = this.f88458f;
            int iJ2 = C42745f0.J(list);
            int i12 = this.f88456d;
            boolean z12 = i12 == iJ2;
            p pVar = p.this;
            BannerInfo bannerInfo = this.f88455c;
            C47627a c47627aF = pVar.f(bannerInfo, i12);
            boolean z13 = th2 instanceof NoAdException;
            InterfaceC47628b interfaceC47628b = pVar.f88436g;
            if (z13) {
                interfaceC47628b.c(c47627aF);
            } else {
                interfaceC47628b.a(c47627aF, th2);
            }
            a aVar = this.f88457e;
            if (z12) {
                interfaceC47628b.b(c47627aF);
                j.a.a(pVar.f88435f, bannerInfo, aVar.f88448d, z13, th2, null, 112);
            } else {
                pVar.f88435f.z0(bannerInfo, aVar.f88448d, BannerEvent.Type.f87773b);
            }
            return pVar.g(list, i12 + 1, aVar);
        }
    }

    @Inject
    public p(@Y61.k YandexBannerLoader yandexBannerLoader, @Y61.k MyTargetBannerLoader myTargetBannerLoader, @Y61.k com.avito.android.advertising.loaders.buzzoola.f fVar, @Y61.k h31.e<com.avito.android.advertising.loaders.avito_targeting.g> eVar, @Y61.k h31.e<com.avito.android.advertising.p> eVar2, @Y61.k j jVar, @Y61.k InterfaceC47628b interfaceC47628b, @Y61.k h31.e<com.avito.android.advertising.advertising_creative.mappers.a> eVar3, @Y61.k com.avito.android.server_time.a aVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k C30828i c30828i, @Y61.k com.avito.android.util.C c12, @Y61.k InterfaceC28359c interfaceC28359c, @Y61.k com.avito.android.advertising.a aVar2) {
        this.f88430a = yandexBannerLoader;
        this.f88431b = myTargetBannerLoader;
        this.f88432c = fVar;
        this.f88433d = eVar;
        this.f88434e = eVar2;
        this.f88435f = jVar;
        this.f88436g = interfaceC47628b;
        this.f88437h = eVar3;
        this.f88438i = aVar;
        this.f88439j = interfaceC35745a5;
        this.f88440k = c12;
        this.f88441l = interfaceC28359c;
        this.f88442m = aVar2;
        this.f88444o = new HashSet();
    }

    public static final CommercialBanner e(p pVar, String str, com.avito.android.advertising.b bVar, int i12, a aVar) {
        pVar.getClass();
        pVar.f88438i.getClass();
        LoadedNetworkBanner loadedNetworkBanner = new LoadedNetworkBanner(str, bVar, i12, System.currentTimeMillis());
        CommercialBanner commercialBanner = aVar.f88445a;
        return new CommercialBanner(commercialBanner.f86885b, commercialBanner.f86886c, commercialBanner.f86887d, commercialBanner.f86888e, aVar.f88446b, aVar.f88447c, aVar.f88450f, loadedNetworkBanner);
    }

    @Override // com.avito.android.advertising.loaders.n
    public final void a() {
        this.f88443n = 0;
    }

    @Override // com.avito.android.advertising.loaders.n
    public final int b(int i12) {
        int i13 = this.f88443n;
        this.f88443n = i12 + i13;
        return i13;
    }

    @Override // com.avito.android.advertising.loaders.n
    @Y61.k
    public final io.reactivex.rxjava3.core.z<CommercialBanner> c(@Y61.k CommercialBanner commercialBanner, long j12, @Y61.l Integer num, @Y61.l Integer num2) {
        this.f88440k.getF125491k().getClass();
        String f88519a = this.f88434e.get().getF88519a();
        if (f88519a != null) {
            commercialBanner = this.f88437h.get().a(commercialBanner, f88519a);
        }
        if (commercialBanner.d()) {
            return io.reactivex.rxjava3.core.z.c0(commercialBanner);
        }
        HashSet hashSet = this.f88444o;
        String str = commercialBanner.f86885b;
        if (hashSet.contains(str)) {
            return U.f403867b;
        }
        hashSet.add(str);
        return new N(g(commercialBanner.f86886c, 0, new a(commercialBanner, j12, num, num2, commercialBanner.f86887d, commercialBanner.f86891h)), new GL.a(4, this, commercialBanner));
    }

    @Override // com.avito.android.advertising.loaders.n
    public final long d() {
        this.f88438i.getClass();
        return System.currentTimeMillis();
    }

    public final C47627a f(BannerInfo bannerInfo, int i12) {
        this.f88438i.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() - bannerInfo.f87892w;
        String bannerCode = bannerInfo.getBannerCode();
        if (bannerCode == null) {
            bannerCode = "unknown";
        }
        return new C47627a(bannerCode, bannerInfo.d(), i12, jCurrentTimeMillis);
    }

    public final io.reactivex.rxjava3.core.z<CommercialBanner> g(List<? extends AdNetworkBannerItem<?>> list, int i12, a aVar) {
        io.reactivex.rxjava3.core.z zVarM;
        AdNetworkBannerItem<?> adNetworkBannerItem = (AdNetworkBannerItem) C42745f0.K(i12, list);
        if (adNetworkBannerItem == null) {
            return io.reactivex.rxjava3.core.z.M(new CommercialBannerNotLoadedException());
        }
        CommercialBanner commercialBanner = aVar.f88445a;
        String str = commercialBanner.f86885b;
        this.f88438i.getClass();
        BannerInfo bannerInfoB = this.f88441l.b(str, adNetworkBannerItem, aVar.f88446b, aVar.f88447c, i12, aVar.f88449e, System.currentTimeMillis(), commercialBanner.f86888e);
        this.f88435f.K0(bannerInfoB, aVar.f88448d, BannerEvent.Type.f87773b);
        boolean z12 = adNetworkBannerItem instanceof YandexNetworkBannerItem;
        InterfaceC35745a5 interfaceC35745a5 = this.f88439j;
        if (z12) {
            YandexNetworkBannerItem yandexNetworkBannerItem = (YandexNetworkBannerItem) adNetworkBannerItem;
            zVarM = this.f88430a.a(yandexNetworkBannerItem).x0(interfaceC35745a5.e()).d0(new q(this, yandexNetworkBannerItem, i12, aVar));
        } else if (adNetworkBannerItem instanceof MyTargetNetworkBannerItem) {
            MyTargetNetworkBannerItem myTargetNetworkBannerItem = (MyTargetNetworkBannerItem) adNetworkBannerItem;
            zVarM = this.f88431b.a(myTargetNetworkBannerItem).x0(interfaceC35745a5.a()).d0(new r(this, myTargetNetworkBannerItem, i12, aVar));
        } else if (adNetworkBannerItem instanceof BuzzoolaNetworkBannerItem) {
            BuzzoolaNetworkBannerItem buzzoolaNetworkBannerItem = (BuzzoolaNetworkBannerItem) adNetworkBannerItem;
            zVarM = this.f88432c.a(buzzoolaNetworkBannerItem).x0(interfaceC35745a5.a()).d0(new s(this, buzzoolaNetworkBannerItem, i12, aVar));
        } else {
            boolean z13 = adNetworkBannerItem instanceof CreativeNetworkBannerItem;
            h31.e<com.avito.android.advertising.loaders.avito_targeting.g> eVar = this.f88433d;
            if (z13) {
                CreativeNetworkBannerItem creativeNetworkBannerItem = (CreativeNetworkBannerItem) adNetworkBannerItem;
                zVarM = eVar.get().c(creativeNetworkBannerItem).x0(interfaceC35745a5.a()).d0(new t(this, creativeNetworkBannerItem, i12, aVar));
            } else if (adNetworkBannerItem instanceof AvitoNetworkBannerItem) {
                AvitoNetworkBannerItem avitoNetworkBannerItem = (AvitoNetworkBannerItem) adNetworkBannerItem;
                zVarM = eVar.get().b(avitoNetworkBannerItem, this.f88442m.b()).F().x0(interfaceC35745a5.a()).d0(new u(this, avitoNetworkBannerItem, i12, aVar));
            } else {
                zVarM = io.reactivex.rxjava3.core.z.M(new IllegalArgumentException("Not supported SerpBanner type: " + this));
            }
        }
        return zVarM.K(new b(i12, aVar)).l0(new c(bannerInfoB, i12, aVar, list));
    }

    /* compiled from: CommercialBannersInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/loaders/p$a;", "", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final CommercialBanner f88445a;

        /* renamed from: b, reason: collision with root package name */
        public final long f88446b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final Integer f88447c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final Integer f88448d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f88449e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final String f88450f;

        public a(@Y61.k CommercialBanner commercialBanner, long j12, @Y61.l Integer num, @Y61.l Integer num2, boolean z12, @Y61.l String str) {
            this.f88445a = commercialBanner;
            this.f88446b = j12;
            this.f88447c = num;
            this.f88448d = num2;
            this.f88449e = z12;
            this.f88450f = str;
        }

        public /* synthetic */ a(CommercialBanner commercialBanner, long j12, Integer num, Integer num2, boolean z12, String str, int i12, C42822w c42822w) {
            this(commercialBanner, j12, num, num2, z12, (i12 & 32) != 0 ? null : str);
        }
    }

    public /* synthetic */ p(YandexBannerLoader yandexBannerLoader, MyTargetBannerLoader myTargetBannerLoader, com.avito.android.advertising.loaders.buzzoola.f fVar, h31.e eVar, h31.e eVar2, j jVar, InterfaceC47628b interfaceC47628b, h31.e eVar3, com.avito.android.server_time.a aVar, InterfaceC35745a5 interfaceC35745a5, C30828i c30828i, com.avito.android.util.C c12, InterfaceC28359c interfaceC28359c, com.avito.android.advertising.a aVar2, int i12, C42822w c42822w) {
        this(yandexBannerLoader, myTargetBannerLoader, fVar, eVar, eVar2, jVar, interfaceC47628b, eVar3, aVar, interfaceC35745a5, c30828i, c12, (i12 & 4096) != 0 ? new C28360d() : interfaceC28359c, aVar2);
    }
}
