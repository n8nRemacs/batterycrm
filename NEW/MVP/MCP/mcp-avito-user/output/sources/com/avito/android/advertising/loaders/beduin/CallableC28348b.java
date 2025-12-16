package com.avito.android.advertising.loaders.beduin;

import com.avito.android.remote.model.SerpBannerContainer;
import com.avito.android.remote.model.SerpElement;
import com.avito.android.remote.model.advertising.AvitoNetworkBannerItem;
import com.avito.android.remote.model.advertising.BuzzoolaNetworkBannerItem;
import com.avito.android.remote.model.advertising.YandexNetworkBannerItem;
import com.avito.android.remote.parse.adapter.RuntimeTypeAdapter;
import com.avito.android.remote.parse.adapter.stream_gson.OptimalRuntimeTypeAdapterFactory;
import com.google.gson.Gson;
import com.google.gson.ToNumberPolicy;
import com.my.tracker.ads.AdFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.advertising.loaders.beduin.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class CallableC28348b implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f88108b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f88109c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f88110d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f88111e;

    public /* synthetic */ CallableC28348b(C28354h c28354h, boolean z12, C28347a c28347a) {
        this.f88110d = c28354h;
        this.f88109c = z12;
        this.f88111e = c28347a;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ArrayList arrayList;
        boolean z12 = this.f88109c;
        Object obj = this.f88110d;
        Object obj2 = this.f88111e;
        switch (this.f88108b) {
            case 0:
                C28354h c28354h = (C28354h) obj;
                ConcurrentLinkedQueue<Gson> concurrentLinkedQueue = z12 ? c28354h.f88139h : c28354h.f88140i;
                Gson gsonPoll = concurrentLinkedQueue.poll();
                if (gsonPoll == null) {
                    if (z12) {
                        com.google.gson.d dVar = new com.google.gson.d();
                        dVar.b(SerpElement.class, new RuntimeTypeAdapter<SerpElement>() { // from class: com.avito.android.advertising.loaders.beduin.CommercialBDUIBannerGetInteractionHandler$createV2Gson$1

                            /* renamed from: a, reason: collision with root package name */
                            @Y61.k
                            public final InterfaceC42726C f88067a = C42727D.c(a.f88068l);

                            /* compiled from: CommercialBDUIBannerGetInteractionHandler.kt */
                            @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00030\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "", "Ljava/lang/Class;", "Lcom/avito/android/remote/model/SerpElement;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
                            public static final class a extends N implements Y41.a<Map<String, Class<? extends SerpElement>>> {

                                /* renamed from: l, reason: collision with root package name */
                                public static final a f88068l = new a();

                                public a() {
                                    super(0);
                                }

                                @Override // Y41.a
                                public final Map<String, Class<? extends SerpElement>> invoke() {
                                    return P0.j(new Q(AdFormat.BANNER, SerpBannerContainer.class), new Q("advBannerWidget", SerpBannerContainer.class), new Q("buzzoola", BuzzoolaNetworkBannerItem.class), new Q("yandex", YandexNetworkBannerItem.class), new Q("avito", AvitoNetworkBannerItem.class));
                                }
                            }

                            @Override // com.avito.android.remote.parse.adapter.RuntimeTypeAdapter
                            @Y61.k
                            public final Map<String, Class<? extends SerpElement>> getMapping() {
                                return (Map) this.f88067a.getValue();
                            }
                        });
                        dVar.f361997l = ToNumberPolicy.f361982d;
                        gsonPoll = dVar.a();
                    } else {
                        com.google.gson.d dVar2 = new com.google.gson.d();
                        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryA = OptimalRuntimeTypeAdapterFactory.a.a(OptimalRuntimeTypeAdapterFactory.f254296d, SerpElement.class);
                        optimalRuntimeTypeAdapterFactoryA.b(SerpBannerContainer.class, AdFormat.BANNER);
                        optimalRuntimeTypeAdapterFactoryA.b(SerpBannerContainer.class, "advBannerWidget");
                        optimalRuntimeTypeAdapterFactoryA.b(BuzzoolaNetworkBannerItem.class, "buzzoola");
                        optimalRuntimeTypeAdapterFactoryA.b(YandexNetworkBannerItem.class, "yandex");
                        optimalRuntimeTypeAdapterFactoryA.b(AvitoNetworkBannerItem.class, "avito");
                        dVar2.c(optimalRuntimeTypeAdapterFactoryA);
                        dVar2.f361997l = ToNumberPolicy.f361982d;
                        gsonPoll = dVar2.a();
                    }
                }
                C28347a c28347a = (C28347a) obj2;
                Object objD = gsonPoll.d(SerpElement.class, c28347a.f88100e);
                SerpBannerContainer serpBannerContainer = objD instanceof SerpBannerContainer ? (SerpBannerContainer) objD : null;
                if (serpBannerContainer == null) {
                    throw new RuntimeException("CommercialBDUIBannerInteractionHandler: unknown element");
                }
                concurrentLinkedQueue.add(gsonPoll);
                return com.avito.android.advertising.g.c(serpBannerContainer, c28347a.f88099d);
            case 1:
                return Boolean.valueOf(((com.avito.android.favorite.l) obj).f155215a.b((String) obj2, z12));
            default:
                int i12 = com.avito.android.vas_planning.domain.i.f322331b;
                org.threeten.bp.o oVarR = org.threeten.bp.o.r();
                org.threeten.bp.o oVarP = org.threeten.bp.o.p("Europe/Moscow");
                org.threeten.bp.format.c cVar = ((com.avito.android.vas_planning.domain.i) obj2).f322332a;
                ArrayList<org.threeten.bp.f> arrayList2 = (ArrayList) obj;
                if (z12) {
                    ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayList2, 10));
                    for (org.threeten.bp.f fVar : arrayList2) {
                        fVar.getClass();
                        org.threeten.bp.s sVarE = org.threeten.bp.s.E(fVar, oVarR, null);
                        sVarE.getClass();
                        w81.d.f(oVarP, "zone");
                        if (!sVarE.f422117d.equals(oVarP)) {
                            org.threeten.bp.f fVar2 = sVarE.f422115b;
                            sVarE = org.threeten.bp.s.B(fVar2.s(sVarE.f422116c), fVar2.f421949c.f422075e, oVarP);
                        }
                        arrayList3.add(sVarE.f422115b);
                    }
                    arrayList = new ArrayList(C42745f0.q(arrayList3, 10));
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((org.threeten.bp.f) it.next()).A(cVar));
                    }
                } else {
                    arrayList = new ArrayList(C42745f0.q(arrayList2, 10));
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((org.threeten.bp.f) it2.next()).A(cVar));
                    }
                }
                return arrayList;
        }
    }

    public /* synthetic */ CallableC28348b(com.avito.android.favorite.l lVar, String str, boolean z12) {
        this.f88110d = lVar;
        this.f88111e = str;
        this.f88109c = z12;
    }

    public /* synthetic */ CallableC28348b(boolean z12, ArrayList arrayList, com.avito.android.vas_planning.domain.i iVar) {
        this.f88109c = z12;
        this.f88110d = arrayList;
        this.f88111e = iVar;
    }
}
