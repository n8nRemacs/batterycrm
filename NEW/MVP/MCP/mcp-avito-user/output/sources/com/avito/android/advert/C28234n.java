package com.avito.android.advert;

import Cq0.C13343b;
import Db.InterfaceC13381a;
import com.avito.android.advert.di.C27710t;
import com.avito.android.advert.item.AdvertDetailsFastOpenParams;
import com.avito.android.advert.item.commercials.PositionedBannerContainer;
import com.avito.android.advert_core.advert.AdvertDetailsMeta;
import com.avito.android.advert_core.advert.AdvertDetailsWithMeta;
import com.avito.android.advertising.CommercialBanner;
import com.avito.android.advertising.adapter.CommercialBannerItem;
import com.avito.android.advertising.adapter.items.AdViewType;
import com.avito.android.di.module.InterfaceC30174s;
import com.avito.android.html_formatter.HtmlCharSequence;
import com.avito.android.location.r;
import com.avito.android.remote.cv_state.CvStateType;
import com.avito.android.remote.model.AdSize;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.PositionedCommercialCascade;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.SerpElement;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.advert_details.commercials.AdvertCommercialsResponse;
import com.avito.android.remote.model.advertising.AdNetworkBannerItem;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Y5;
import com.avito.android.util.rx3.C35896f0;
import da.C39687a;
import fa.InterfaceC40383a;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import io.reactivex.rxjava3.internal.operators.observable.C41982q1;
import io.reactivex.rxjava3.internal.operators.observable.C41984r1;
import io.reactivex.rxjava3.internal.operators.observable.L0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.s0;
import nC.InterfaceC44228a;
import ob.C44744h;

/* compiled from: AdvertDetailsInteractor.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/n;", "Lcom/avito/android/advert/i;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.n, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28234n implements InterfaceC27797i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f80788a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC40383a> f80789b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final h31.e<Z9.a> f80790c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advertising.loaders.n f80791d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f80792e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.location.r f80793f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC44228a f80794g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f80795h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final hJ.i f80796i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final hJ.e f80797j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final hJ.h f80798k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final h31.e<DP.a> f80799l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final Set<String> f80800m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.cv_state.interactor.b f80801n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advertising.loaders.beduin.H f80802o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13381a f80803p;

    /* compiled from: AdvertDetailsInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/remote/model/advert_details/commercials/AdvertCommercialsResponse;", "response", "Lio/reactivex/rxjava3/core/E;", "", "Lcom/avito/android/advert/item/commercials/PositionedBannerContainer;", "apply", "(Lcom/avito/android/remote/model/advert_details/commercials/AdvertCommercialsResponse;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.n$a */
    public static final class a<T, R> implements l41.o {
        public a() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            Object objM0;
            AdvertCommercialsResponse advertCommercialsResponse = (AdvertCommercialsResponse) obj;
            List<PositionedCommercialCascade> positions = advertCommercialsResponse.getPositions();
            ArrayList arrayList = new ArrayList(C42745f0.q(positions, 10));
            for (PositionedCommercialCascade positionedCommercialCascade : positions) {
                C28234n c28234n = C28234n.this;
                long jD2 = c28234n.f80791d.d();
                boolean enableEventSampling = advertCommercialsResponse.getEnableEventSampling();
                Map<String, Object> analyticParams = advertCommercialsResponse.getAnalyticParams();
                List<SerpElement> banners = positionedCommercialCascade.getBanners();
                ArrayList arrayList2 = new ArrayList();
                for (T t12 : banners) {
                    if (t12 instanceof AdNetworkBannerItem) {
                        arrayList2.add(t12);
                    }
                }
                if (arrayList2.isEmpty()) {
                    objM0 = io.reactivex.rxjava3.core.z.c0(C42784z0.f406748b);
                } else {
                    String string = UUID.randomUUID().toString();
                    CommercialBanner commercialBanner = new CommercialBanner(string, arrayList2, enableEventSampling, analyticParams, 0L, null, c28234n.f80788a, null, 176, null);
                    AdSize adSize = AdSize.BIG;
                    AdViewType adViewType = AdViewType.f86911e;
                    SerpDisplayType serpDisplayType = SerpDisplayType.Grid;
                    CommercialBannerItem commercialBannerItem = new CommercialBannerItem(0L, "", adViewType, serpDisplayType, 0, adSize, commercialBanner, null, 128, null);
                    io.reactivex.rxjava3.core.z zVarX0 = c28234n.f80791d.c(commercialBanner, jD2, null, null).x0(c28234n.f80792e.a());
                    if (!c28234n.f80803p.d()) {
                        String strA = C44744h.a(commercialBanner);
                        if (strA == null) {
                            strA = "";
                        }
                        zVarX0 = zVarX0.o(new com.avito.android.advertising.loaders.beduin.F(string, strA, c28234n.f80802o, serpDisplayType));
                    }
                    B0 b0D0 = io.reactivex.rxjava3.core.z.q(io.reactivex.rxjava3.core.z.c0(commercialBannerItem), zVarX0.d0(new C28235o(commercialBannerItem))).d0(new C28236p(positionedCommercialCascade));
                    C42784z0 c42784z0 = C42784z0.f406748b;
                    Objects.requireNonNull(c42784z0, "item is null");
                    objM0 = b0D0.m0(io.reactivex.rxjava3.internal.functions.a.g(c42784z0));
                }
                arrayList.add(objM0);
            }
            return C35896f0.a(C28233m.f80787l, arrayList);
        }
    }

    @Inject
    public C28234n(@Y61.k @InterfaceC30174s String str, @Y61.k h31.e<InterfaceC40383a> eVar, @Y61.k h31.e<Z9.a> eVar2, @Y61.k com.avito.android.advertising.loaders.n nVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.location.r rVar, @Y61.k InterfaceC44228a interfaceC44228a, @C27710t.q boolean z12, @Y61.k hJ.i iVar, @Y61.k hJ.e eVar3, @Y61.k hJ.h hVar, @Y61.k h31.e<DP.a> eVar4, @Y61.k Set<String> set, @Y61.k com.avito.android.advert.item.cv_state.interactor.b bVar, @com.avito.android.advertising.loaders.beduin.L @Y61.k com.avito.android.advertising.loaders.beduin.H h12, @Y61.k InterfaceC13381a interfaceC13381a) {
        this.f80788a = str;
        this.f80789b = eVar;
        this.f80790c = eVar2;
        this.f80791d = nVar;
        this.f80792e = interfaceC35745a5;
        this.f80793f = rVar;
        this.f80794g = interfaceC44228a;
        this.f80795h = z12;
        this.f80796i = iVar;
        this.f80797j = eVar3;
        this.f80798k = hVar;
        this.f80799l = eVar4;
        this.f80800m = set;
        this.f80801n = bVar;
        this.f80802o = h12;
        this.f80803p = interfaceC13381a;
    }

    @Override // com.avito.android.advert.InterfaceC27797i
    @Y61.k
    public final io.reactivex.rxjava3.core.z<List<PositionedBannerContainer>> a() {
        if (this.f80795h) {
            return io.reactivex.rxjava3.core.z.c0(C42784z0.f406748b);
        }
        io.reactivex.rxjava3.core.z zVarT = Y5.a(new io.reactivex.rxjava3.internal.operators.observable.F(new C13343b(this, 2))).T(new a(), Integer.MAX_VALUE);
        C42784z0 c42784z0 = C42784z0.f406748b;
        zVarT.getClass();
        Objects.requireNonNull(c42784z0, "item is null");
        L0 l0M0 = zVarT.m0(io.reactivex.rxjava3.internal.functions.a.g(c42784z0));
        Objects.requireNonNull(c42784z0, "defaultItem is null");
        return new C41984r1(l0M0, io.reactivex.rxjava3.core.z.c0(c42784z0)).x0(this.f80792e.a());
    }

    @Override // com.avito.android.advert.InterfaceC27797i
    @Y61.l
    public final Object b(long j12, @Y61.k Continuation<? super TypedResult<C39687a>> continuation) {
        return this.f80790c.get().a(Boxing.boxLong(j12), continuation);
    }

    @Override // com.avito.android.advert.InterfaceC27797i
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.observable.C c(@Y61.k String str, @Y61.k CvStateType cvStateType) {
        return this.f80801n.a(str, cvStateType);
    }

    @Override // com.avito.android.advert.InterfaceC27797i
    @Y61.l
    public final Object d(@Y61.k Continuation<? super TypedResult<FP.a>> continuation) {
        return this.f80799l.get().a(continuation);
    }

    @Override // com.avito.android.advert.InterfaceC27797i
    @Y61.k
    public final C41982q1 e(@Y61.k String str, @Y61.l Integer num, @Y61.l String str2, @Y61.l String str3, @Y61.l Map map, @Y61.l AdvertDetailsFastOpenParams.FromSpace fromSpace, @Y61.l String str4, @Y61.l Integer num2) {
        io.reactivex.rxjava3.core.z zVarB = r.a.b(this.f80793f, false, 3);
        InterfaceC35745a5 interfaceC35745a5 = this.f80792e;
        return zVarB.x0(interfaceC35745a5.a()).d0(C28237q.f80960b).E0(500L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.core.z.c0(P0.c()), io.reactivex.rxjava3.schedulers.b.f404942b).m0(r.f80961b).d0(new C28230j(this)).T(new C28231k(this, map, fromSpace, str, str2, str3, num, str4, num2), Integer.MAX_VALUE).j0(interfaceC35745a5.c()).T(new l41.o() { // from class: com.avito.android.advert.l
            @Override // l41.o
            public final Object apply(Object obj) {
                HtmlCharSequence htmlCharSequenceA;
                AdvertDetails advertDetails = (AdvertDetails) obj;
                C28234n c28234n = this.f80786b;
                c28234n.getClass();
                String descriptionHtml = advertDetails.getDescriptionHtml();
                if (descriptionHtml != null) {
                    htmlCharSequenceA = c28234n.f80796i.a(c28234n.f80797j.a(descriptionHtml), c28234n.f80798k);
                } else {
                    htmlCharSequenceA = null;
                }
                return io.reactivex.rxjava3.core.z.c0(new AdvertDetailsWithMeta(advertDetails, new AdvertDetailsMeta(htmlCharSequenceA)));
            }
        }, Integer.MAX_VALUE).x0(interfaceC35745a5.a());
    }
}
