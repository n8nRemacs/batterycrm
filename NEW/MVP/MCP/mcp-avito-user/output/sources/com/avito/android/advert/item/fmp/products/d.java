package com.avito.android.advert.item.fmp.products;

import Y41.p;
import androidx.compose.runtime.internal.P;
import androidx.view.C22984Q;
import androidx.view.InterfaceC22983P;
import com.avito.android.advert.item.I1;
import com.avito.android.advert.item.W0;
import com.avito.android.advert.item.Z0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.x;
import com.avito.android.di.module.InterfaceC30174s;
import com.avito.android.remote.fmp.AnalyticsEvent;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;

/* compiled from: AdvertDetailsFmpProductsPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/fmp/products/d;", "Lcom/avito/android/advert/item/fmp/products/c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f75596b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage_calculator.data.b f75597c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage_calculator.data.h f75598d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f75599e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final x f75600f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f75601g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f75602h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public k f75603i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public Z0 f75604j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public String f75605k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public String f75606l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public String f75607m;

    /* compiled from: AdvertDetailsFmpProductsPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LH10/a;", "it", "Lkotlin/G0;", "<anonymous>", "(LH10/a;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert.item.fmp.products.AdvertDetailsFmpProductsPresenterImpl$attachLifecycleOwner$1", f = "AdvertDetailsFmpProductsPresenter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<H10.a, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f75608q;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = d.this.new a(continuation);
            aVar.f75608q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(H10.a aVar, Continuation<? super G0> continuation) {
            return ((a) create(aVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            H10.a aVar = (H10.a) this.f75608q;
            String strA0 = null;
            String str = aVar != null ? aVar.f6923a : null;
            d dVar = d.this;
            dVar.f75605k = str;
            String str2 = dVar.f75606l;
            if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
                strA0 = C43066x.a0(str2, "<>", str, false);
            }
            k kVar = dVar.f75603i;
            if (kVar != null) {
                if (strA0 == null) {
                    strA0 = dVar.f75607m;
                }
                kVar.N20(strA0);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public d(@Y61.l @InterfaceC30174s String str, @Y61.k com.avito.android.mortgage_calculator.data.b bVar, @Y61.k com.avito.android.mortgage_calculator.data.h hVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k x xVar, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f75596b = str;
        this.f75597c = bVar;
        this.f75598d = hVar;
        this.f75599e = aVar;
        this.f75600f = xVar;
        this.f75601g = interfaceC28373a;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k kVar = (k) eVar;
        AdvertDetailsFmpProductsItem advertDetailsFmpProductsItem = (AdvertDetailsFmpProductsItem) aVar;
        this.f75603i = kVar;
        MortgageTile mortgageTile = advertDetailsFmpProductsItem.f75558c;
        if (mortgageTile != null) {
            String str = mortgageTile.f75574g;
            this.f75606l = str;
            this.f75607m = mortgageTile.f75573f;
            String str2 = this.f75605k;
            if (str2 != null && str2.length() != 0 && str != null && str.length() != 0) {
                C43066x.a0(str, "<>", str2, false);
            }
        }
        if (advertDetailsFmpProductsItem.f75557b == null && mortgageTile == null) {
            return;
        }
        g gVar = new g(this);
        h hVar = new h(this);
        e eVar2 = new e(advertDetailsFmpProductsItem, this);
        f fVar = new f(advertDetailsFmpProductsItem, this);
        kVar.gF(advertDetailsFmpProductsItem.f75557b, advertDetailsFmpProductsItem.f75558c, advertDetailsFmpProductsItem.f75560e, advertDetailsFmpProductsItem.f75559d, advertDetailsFmpProductsItem.f75561f, gVar, hVar, eVar2, fVar);
        if (this.f75602h) {
            return;
        }
        List<AnalyticsEvent> list = advertDetailsFmpProductsItem.f75563h;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                this.f75601g.c(j.a((AnalyticsEvent) it.next()));
            }
        }
        this.f75602h = true;
    }

    @Override // com.avito.android.advert.item.fmp.products.c
    public final void S0(@Y61.k InterfaceC22983P interfaceC22983P) {
        C43175k.K(new C43197r1(new a(null), this.f75598d.a(this.f75596b)), C22984Q.a(interfaceC22983P));
    }

    @Override // com.avito.android.advert.item.fmp.products.c
    public final void f0() {
        this.f75603i = null;
        this.f75604j = null;
    }

    @Override // com.avito.android.advert.item.fmp.products.c
    public final void m(@Y61.l W0 w02) {
        this.f75604j = (Z0) w02;
    }

    @Override // com.avito.android.advert.item.fmp.products.c
    public final void X(@Y61.l I1 i12) {
    }
}
