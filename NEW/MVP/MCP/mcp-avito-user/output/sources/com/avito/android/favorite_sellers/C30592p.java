package com.avito.android.favorite_sellers;

import com.avito.android.InterfaceC32897n0;
import com.avito.android.favorite_sellers.adapter.seller.SellerItem;
import com.avito.android.favorite_sellers.mvi.entity.FavoriteSellersInternalAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42770s0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import kotlin.sequences.C43033p;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: FavoriteSellersInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.favorite_sellers.FavoriteSellersInteractorImpl$refreshSellersStates$1", f = "FavoriteSellersInteractor.kt", i = {}, l = {337, 340}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.favorite_sellers.p, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C30592p extends SuspendLambda implements Y41.p<InterfaceC43172j<? super FavoriteSellersInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f156086q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f156087r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ List<FavoriteSellersItem> f156088s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C30589m f156089t;

    /* compiled from: FavoriteSellersInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/favorite_sellers/FavoriteSellersItem;", "invoke", "(Lcom/avito/android/favorite_sellers/FavoriteSellersItem;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.favorite_sellers.p$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<FavoriteSellersItem, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC32897n0 f156090l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC32897n0 interfaceC32897n0) {
            super(1);
            this.f156090l = interfaceC32897n0;
        }

        @Override // Y41.l
        public final Boolean invoke(FavoriteSellersItem favoriteSellersItem) {
            FavoriteSellersItem favoriteSellersItem2 = favoriteSellersItem;
            SubscribableItem subscribableItem = favoriteSellersItem2 instanceof SubscribableItem ? (SubscribableItem) favoriteSellersItem2 : null;
            return Boolean.valueOf(kotlin.jvm.internal.L.f(subscribableItem != null ? subscribableItem.getF155494c() : null, this.f156090l.getF155494c()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C30592p(List<? extends FavoriteSellersItem> list, C30589m c30589m, Continuation<? super C30592p> continuation) {
        super(2, continuation);
        this.f156088s = list;
        this.f156089t = c30589m;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C30592p c30592p = new C30592p(this.f156088s, this.f156089t, continuation);
        c30592p.f156087r = obj;
        return c30592p;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super FavoriteSellersInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C30592p) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object next;
        Object next2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f156086q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f156087r;
            List<FavoriteSellersItem> list = this.f156088s;
            ArrayList arrayList = new ArrayList(list);
            l0.a aVar = new l0.a();
            C30589m c30589m = this.f156089t;
            for (InterfaceC32897n0 interfaceC32897n0 : c30589m.f155897b.m().values()) {
                String f155494c = interfaceC32897n0.getF155494c();
                Boolean boolBoxBoolean = Boxing.boxBoolean(interfaceC32897n0.getF155497f());
                Boolean f155498g = interfaceC32897n0.getF155498g();
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next3 = it.next();
                    if (next3 instanceof RecommendationItem) {
                        arrayList2.add(next3);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    C42745f0.h(((RecommendationItem) it2.next()).f155460c, arrayList3);
                }
                Iterator it3 = arrayList3.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it3.next();
                    RecommendationCarouselItem recommendationCarouselItem = (RecommendationCarouselItem) next2;
                    if ((recommendationCarouselItem instanceof SellerCarouselItem) && kotlin.jvm.internal.L.f(((SellerCarouselItem) recommendationCarouselItem).f155466d, f155494c)) {
                        break;
                    }
                }
                SellerCarouselItem sellerCarouselItem = next2 instanceof SellerCarouselItem ? (SellerCarouselItem) next2 : null;
                if (boolBoxBoolean != null) {
                    boolean zBooleanValue = boolBoxBoolean.booleanValue();
                    if (sellerCarouselItem != null) {
                        sellerCarouselItem.f155473k = zBooleanValue;
                    }
                }
                if (f155498g != null && sellerCarouselItem != null) {
                    sellerCarouselItem.f155475m = f155498g;
                }
                boolean z12 = sellerCarouselItem != null;
                if (interfaceC32897n0.getF155497f()) {
                    aVar.f406838b = true;
                    List listD = C43033p.D(C43033p.i(C43033p.k(new C42770s0(list), SubscribableItem.class), new C30590n(interfaceC32897n0.getF155494c())));
                    if (listD.isEmpty() && !z12) {
                        throw new IllegalStateException("Subscribed item not found");
                    }
                    C30589m.k(listD, Boxing.boxBoolean(interfaceC32897n0.getF155497f()), interfaceC32897n0.getF155498g());
                } else {
                    C42745f0.l0(new a(interfaceC32897n0), arrayList);
                }
            }
            Iterator it4 = arrayList.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    next = null;
                    break;
                }
                next = it4.next();
                if (next instanceof SellerItem) {
                    break;
                }
            }
            if (((SellerItem) (!(next instanceof SellerItem) ? null : next)) != null || aVar.f406838b) {
                c30589m.f155901f.a(arrayList);
                FavoriteSellersInternalAction.ItemsUpdate itemsUpdate = new FavoriteSellersInternalAction.ItemsUpdate(arrayList);
                this.f156086q = 2;
                if (interfaceC43172j.emit(itemsUpdate, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                InterfaceC43160i<FavoriteSellersInternalAction> interfaceC43160iC = c30589m.c(true);
                this.f156086q = 1;
                if (C43175k.u(this, interfaceC43160iC, interfaceC43172j) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
