package com.avito.android.advert.item.commercials;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.InterfaceC27797i;
import com.avito.android.advertising.CommercialBanner;
import com.avito.android.advertising.LoadedNetworkBanner;
import com.avito.android.advertising.adapter.CommercialBannerItem;
import com.avito.android.advertising.loaders.BannerInfo;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.advertising.AdNetworkBannerItem;
import com.avito.android.util.Kundle;
import com.avito.android.util.R0;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.rx3.y;
import kotlinx.coroutines.t1;

/* compiled from: CommercialsPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/commercials/g;", "Lcom/avito/android/advert/item/commercials/f;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC27797i f74332a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final b f74333b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C43238h f74334c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final e2 f74335d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public List<PositionedBannerContainer> f74336e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final e2 f74337f;

    /* compiled from: CommercialsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/advert/item/commercials/PositionedBannerContainer;", "it", "Lkotlin/G0;", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert.item.commercials.CommercialsPresenterImpl$loadCommercials$1", f = "CommercialsPresenter.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<List<? extends PositionedBannerContainer>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f74338q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f74339r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = g.this.new a(continuation);
            aVar.f74339r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(List<? extends PositionedBannerContainer> list, Continuation<? super G0> continuation) {
            return ((a) create(list, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f74338q;
            if (i12 == 0) {
                C42729a0.b(obj);
                List<PositionedBannerContainer> list = (List) this.f74339r;
                g gVar = g.this;
                gVar.f74336e = list;
                com.avito.android.advert.item.commercials.a aVarA = gVar.f74333b.a(list, SerpDisplayType.Grid);
                e2 e2Var = gVar.f74335d;
                this.f74338q = 1;
                if (e2Var.emit(aVarA, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public g(@k InterfaceC27797i interfaceC27797i, @k b bVar, @k R0 r02) {
        this.f74332a = interfaceC27797i;
        this.f74333b = bVar;
        this.f74334c = U.a(CoroutineContext.Element.DefaultImpls.plus((V0) t1.b(), r02.b()));
        e2 e2VarB = f2.b(1, 0, null, 6);
        this.f74335d = e2VarB;
        this.f74336e = C42784z0.f406748b;
        this.f74337f = e2VarB;
    }

    @Override // com.avito.android.advert.item.commercials.f
    @k
    /* renamed from: a, reason: from getter */
    public final e2 getF74337f() {
        return this.f74337f;
    }

    @Override // com.avito.android.advert.item.commercials.f
    public final boolean b(@k BannerInfo bannerInfo) {
        LoadedNetworkBanner loadedNetworkBannerG = g(bannerInfo);
        if (loadedNetworkBannerG == null) {
            return false;
        }
        String str = (String) bannerInfo.f87868C.getValue();
        Boolean bool = loadedNetworkBannerG.f86902e.get(str + "_isOnScreen");
        return !(bool != null ? bool.booleanValue() : false);
    }

    @Override // com.avito.android.advert.item.commercials.f
    public final boolean c(@k BannerInfo bannerInfo) {
        LoadedNetworkBanner loadedNetworkBannerG = g(bannerInfo);
        if (loadedNetworkBannerG == null) {
            return false;
        }
        String str = (String) bannerInfo.f87868C.getValue();
        Boolean bool = loadedNetworkBannerG.f86902e.get(str + "_isOpened");
        return !(bool != null ? bool.booleanValue() : false);
    }

    @Override // com.avito.android.advert.item.commercials.f
    public final void d() {
        if (this.f74336e.isEmpty()) {
            C43175k.K(new C43197r1(new a(null), y.a(this.f74332a.a())), this.f74334c);
        }
    }

    @Override // com.avito.android.advert.item.commercials.f
    @k
    public final Kundle d0() {
        Kundle kundle = new Kundle();
        kundle.k("KEY_COMMERCIAL_ITEMS", this.f74336e);
        return kundle;
    }

    @Override // com.avito.android.advert.item.commercials.f
    public final void e(@k BannerInfo bannerInfo) {
        LoadedNetworkBanner loadedNetworkBannerG = g(bannerInfo);
        if (loadedNetworkBannerG != null) {
            String str = (String) bannerInfo.f87868C.getValue();
            Boolean bool = Boolean.TRUE;
            loadedNetworkBannerG.f86902e.put(str + "_isOpened", bool);
        }
    }

    @Override // com.avito.android.advert.item.commercials.f
    public final void f(@k BannerInfo bannerInfo) {
        LoadedNetworkBanner loadedNetworkBannerG = g(bannerInfo);
        if (loadedNetworkBannerG != null) {
            String str = (String) bannerInfo.f87868C.getValue();
            Boolean bool = Boolean.TRUE;
            loadedNetworkBannerG.f86902e.put(str + "_isOnScreen", bool);
        }
    }

    @Override // com.avito.android.advert.item.commercials.f
    public final void f0(@l Kundle kundle) {
        List<PositionedBannerContainer> listE = kundle.e("KEY_COMMERCIAL_ITEMS");
        if (listE == null) {
            listE = C42784z0.f406748b;
        }
        this.f74336e = listE;
        if (listE.isEmpty()) {
            return;
        }
        this.f74335d.K5(this.f74333b.a(this.f74336e, SerpDisplayType.Grid));
    }

    public final LoadedNetworkBanner g(BannerInfo bannerInfo) {
        Object next;
        CommercialBannerItem commercialBannerItem;
        CommercialBanner commercialBanner;
        AdNetworkBannerItem<?> adNetworkBannerItemC;
        Iterator<T> it = this.f74336e.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            PositionedBannerContainer positionedBannerContainer = (PositionedBannerContainer) next;
            CommercialBanner commercialBanner2 = positionedBannerContainer.f74322c.getCommercialBanner();
            if (L.f((commercialBanner2 == null || (adNetworkBannerItemC = commercialBanner2.c()) == null) ? null : adNetworkBannerItemC.getAlid(), bannerInfo.getAlid()) && positionedBannerContainer.f74322c.isLoaded()) {
                break;
            }
        }
        PositionedBannerContainer positionedBannerContainer2 = (PositionedBannerContainer) next;
        if (positionedBannerContainer2 == null || (commercialBannerItem = positionedBannerContainer2.f74322c) == null || (commercialBanner = commercialBannerItem.getCommercialBanner()) == null) {
            return null;
        }
        return commercialBanner.f86892i;
    }

    @Override // com.avito.android.advert.item.commercials.f
    public final void onCleared() {
        this.f74336e = C42784z0.f406748b;
        Q0.d(this.f74334c.f411905b);
        this.f74335d.h4();
    }
}
