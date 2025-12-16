package com.avito.android.favorite_sellers.mvi;

import FC.a;
import com.avito.android.InterfaceC34162r0;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.event.favorite.SubscriptionSource;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.InterfaceC29975l;
import com.avito.android.favorite_sellers.InterfaceC30588l;
import com.avito.android.favorite_sellers.SubscribableItem;
import com.avito.android.favorite_sellers.V;
import com.avito.android.favorite_sellers.X;
import com.avito.android.favorite_sellers.mvi.entity.FavoriteSellersInternalAction;
import com.avito.android.favorite_sellers.mvi.entity.FavoriteSellersState;
import com.avito.android.util.O2;
import java.util.List;
import javax.inject.Inject;
import jc.C42353b;
import jc.C42354c;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.rx3.y;

/* compiled from: FavoriteSellersActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/favorite_sellers/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LFC/a;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersState;", "a", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a implements com.avito.android.arch.mvi.a<FC.a, FavoriteSellersInternalAction, FavoriteSellersState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30588l f155960a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.common.a f155961b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final E f155962c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34162r0 f155963d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f155964e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final V f155965f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f155966g;

    /* compiled from: FavoriteSellersActor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/favorite_sellers/mvi/a$a;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/favorite_sellers/mvi/a$a$a;", "Lcom/avito/android/favorite_sellers/mvi/a$a$b;", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.favorite_sellers.mvi.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC4567a {

        /* compiled from: FavoriteSellersActor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/favorite_sellers/mvi/a$a$a;", "Lcom/avito/android/favorite_sellers/mvi/a$a;", "<init>", "()V", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.favorite_sellers.mvi.a$a$a, reason: collision with other inner class name */
        public static final class C4568a extends AbstractC4567a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C4568a f155967a = new C4568a();

            public C4568a() {
                super(null);
            }
        }

        /* compiled from: FavoriteSellersActor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/favorite_sellers/mvi/a$a$b;", "Lcom/avito/android/favorite_sellers/mvi/a$a;", "<init>", "()V", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.favorite_sellers.mvi.a$a$b */
        public static final class b extends AbstractC4567a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final b f155968a = new b();

            public b() {
                super(null);
            }
        }

        public /* synthetic */ AbstractC4567a(C42822w c42822w) {
            this();
        }

        public AbstractC4567a() {
        }
    }

    /* compiled from: FavoriteSellersActor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction;", "it", "Lkotlinx/coroutines/flow/i;", "<anonymous>", "(Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.favorite_sellers.mvi.FavoriteSellersActor$process$3", f = "FavoriteSellersActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<FavoriteSellersInternalAction, Continuation<? super InterfaceC43160i<? extends FavoriteSellersInternalAction>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f155969q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ FavoriteSellersState f155970r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ a f155971s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(FavoriteSellersState favoriteSellersState, a aVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f155970r = favoriteSellersState;
            this.f155971s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(this.f155970r, this.f155971s, continuation);
            bVar.f155969q = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(FavoriteSellersInternalAction favoriteSellersInternalAction, Continuation<? super InterfaceC43160i<? extends FavoriteSellersInternalAction>> continuation) {
            return ((b) create(favoriteSellersInternalAction, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            FavoriteSellersInternalAction favoriteSellersInternalAction = (FavoriteSellersInternalAction) this.f155969q;
            return ((favoriteSellersInternalAction instanceof FavoriteSellersInternalAction.DataLoaded) && this.f155970r.f156052q) ? C43175k.N(new C43210w(favoriteSellersInternalAction), this.f155971s.f155960a.b()) : new C43210w(favoriteSellersInternalAction);
        }
    }

    /* compiled from: FavoriteSellersActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.favorite_sellers.mvi.FavoriteSellersActor$process$4", f = "FavoriteSellersActor.kt", i = {}, l = {127}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super FavoriteSellersInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f155972q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f155973r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ FC.a f155974s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ FavoriteSellersState f155975t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ a f155976u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(FC.a aVar, FavoriteSellersState favoriteSellersState, a aVar2, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f155974s = aVar;
            this.f155975t = favoriteSellersState;
            this.f155976u = aVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = new c(this.f155974s, this.f155975t, this.f155976u, continuation);
            cVar.f155973r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super FavoriteSellersInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f155972q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f155973r;
                X x12 = ((a.n) this.f155974s).f4612a;
                int i13 = x12.f155489c;
                if (i13 == -1) {
                    int i14 = x12.f155488b;
                    int i15 = x12.f155487a;
                    if (i15 == i14 && i15 != -1) {
                        i13 = i15;
                    }
                }
                FavoriteSellersState favoriteSellersState = this.f155975t;
                int iMax = Math.max(favoriteSellersState.f156048m, i13);
                InterfaceC30588l interfaceC30588l = this.f155976u.f155960a;
                List list = favoriteSellersState.f156038c;
                if (list == null) {
                    list = C42784z0.f406748b;
                }
                InterfaceC43160i interfaceC43160iD = interfaceC30588l.d(iMax, favoriteSellersState.f156049n, list);
                this.f155972q = 1;
                if (C43175k.u(this, interfaceC43160iD, interfaceC43172j) == coroutine_suspended) {
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

    /* compiled from: FavoriteSellersActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.favorite_sellers.mvi.FavoriteSellersActor$process$5", f = "FavoriteSellersActor.kt", i = {}, l = {203}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super FavoriteSellersInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f155977q;

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return a.this.new d(continuation);
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super FavoriteSellersInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f155977q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f155977q = 1;
                if (C43131e0.b(2000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            a.this.f155961b.reset();
            return G0.f406611a;
        }
    }

    @Inject
    public a(@Y61.k InterfaceC30588l interfaceC30588l, @InterfaceC29975l @Y61.k com.avito.android.common.a aVar, @Y61.k E e12, @Y61.k InterfaceC34162r0 interfaceC34162r0, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2, @Y61.k V v12, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f155960a = interfaceC30588l;
        this.f155961b = aVar;
        this.f155962c = e12;
        this.f155963d = interfaceC34162r0;
        this.f155964e = aVar2;
        this.f155965f = v12;
        this.f155966g = interfaceC28373a;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.N(C43175k.C(new com.avito.android.favorite_sellers.mvi.b(aVar, this, null), this.f155960a.c(false)), C43175k.C(new g(aVar, this, null), this.f155963d.f()), C43175k.C(new f(aVar, this, null), new e(y.a(this.f155964e.d9()))), C43175k.C(new com.avito.android.favorite_sellers.mvi.d(aVar, this, null), com.avito.android.arch.mvi.utils.h.a(c43197r1, com.avito.android.favorite_sellers.mvi.c.f155982l)));
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<FavoriteSellersInternalAction> b(@Y61.k FC.a aVar, @Y61.k FavoriteSellersState favoriteSellersState) {
        C43210w c43210w;
        InterfaceC43160i interfaceC43160iD;
        String str;
        boolean z12 = aVar instanceof a.b;
        InterfaceC30588l interfaceC30588l = this.f155960a;
        if (z12) {
            return (favoriteSellersState.f156039d || (str = favoriteSellersState.f156037b) == null || str.equals(this.f155962c.a())) ? C43175k.w() : interfaceC30588l.c(false);
        }
        if (aVar instanceof a.d) {
            return C43175k.C(new b(favoriteSellersState, this, null), interfaceC30588l.c(((a.d) aVar).f4602a));
        }
        if (aVar instanceof a.e) {
            return interfaceC30588l.g(((a.e) aVar).f4603a);
        }
        if (aVar instanceof a.f) {
            return new C43210w(new FavoriteSellersInternalAction.NextPageLoadRetry(((a.f) aVar).f4604a));
        }
        if (aVar instanceof a.n) {
            return C43175k.G(new c(aVar, favoriteSellersState, this, null));
        }
        if (aVar instanceof a.g) {
            boolean z13 = ((a.g) aVar).f4605a;
            this.f155965f.w(z13);
            C43210w c43210w2 = new C43210w(new FavoriteSellersInternalAction.ChangeScreenVisibility(z13));
            List list = favoriteSellersState.f156038c;
            if (z13) {
                interfaceC43160iD = C43175k.N(O2.a(list) ? interfaceC30588l.a(list) : C43175k.w(), !favoriteSellersState.f156050o ? interfaceC30588l.b() : C43175k.w());
            } else {
                this.f155961b.reset();
                if (list == null) {
                    list = C42784z0.f406748b;
                }
                interfaceC43160iD = interfaceC30588l.d(favoriteSellersState.f156048m, favoriteSellersState.f156049n, list);
            }
            return C43175k.N(c43210w2, interfaceC43160iD);
        }
        if (aVar instanceof a.i) {
            return new C43210w(new FavoriteSellersInternalAction.OpenSubscriptionSettings(((a.i) aVar).f4607a));
        }
        if (aVar instanceof a.l) {
            c43210w = new C43210w(FavoriteSellersInternalAction.SubscriptionSettingsDismissed.f156027b);
        } else {
            boolean z14 = aVar instanceof a.m;
            InterfaceC28373a interfaceC28373a = this.f155966g;
            if (z14) {
                SubscribableItem subscribableItem = ((a.m) aVar).f4611a;
                interfaceC28373a.c(new C42354c(subscribableItem.getF294217b(), SubscriptionSource.f90035c));
                return interfaceC30588l.h(subscribableItem);
            }
            if (aVar instanceof a.k) {
                SubscribableItem subscribableItem2 = ((a.k) aVar).f4609a;
                interfaceC28373a.c(new C42353b(subscribableItem2.getF294217b(), SubscriptionSource.f90035c));
                return interfaceC30588l.f(subscribableItem2);
            }
            if (!(aVar instanceof a.h)) {
                if (aVar instanceof a.C0280a) {
                    return interfaceC30588l.e(((a.C0280a) aVar).f4599a);
                }
                if (aVar instanceof a.c) {
                    a.c cVar = (a.c) aVar;
                    b.a.a(this.f155964e, cVar.f4600a, null, cVar.f4601b, 2);
                    return C43175k.w();
                }
                if (aVar instanceof a.j) {
                    return C43175k.G(new d(null));
                }
                throw new NoWhenBranchMatchedException();
            }
            c43210w = new C43210w(FavoriteSellersInternalAction.OnUndoSnackbarDismissed.f156017b);
        }
        return c43210w;
    }
}
