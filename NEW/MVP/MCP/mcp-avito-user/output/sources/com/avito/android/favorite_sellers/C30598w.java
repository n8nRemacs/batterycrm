package com.avito.android.favorite_sellers;

import FC.a;
import FC.b;
import Pz.C14860a;
import android.view.View;
import androidx.view.C22981N;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import arrow.core.AbstractC23662a;
import com.avito.android.component.toast.f;
import com.avito.android.component.toast.util.c;
import com.avito.android.favorite_sellers.mvi.entity.FavoriteSellersState;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.subscriptions_settings.SubscriptionSettingsState;
import com.avito.android.util.D6;
import com.avito.android.util.O2;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.d2;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.internal.C43238h;
import vC.C49192a;

/* compiled from: FavoriteSellersView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.favorite_sellers.FavoriteSellersMviViewImpl$2$1", f = "FavoriteSellersView.kt", i = {}, l = {149}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.favorite_sellers.w, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C30598w extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f156143q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22983P f156144r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ H f156145s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d2<vC.b> f156146t;

    /* compiled from: FavoriteSellersView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.favorite_sellers.FavoriteSellersMviViewImpl$2$1$1", f = "FavoriteSellersView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.favorite_sellers.w$a */
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f156147q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ H f156148r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ d2<vC.b> f156149s;

        /* compiled from: FavoriteSellersView.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.favorite_sellers.FavoriteSellersMviViewImpl$2$1$1$1", f = "FavoriteSellersView.kt", i = {}, l = {150}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.favorite_sellers.w$a$a, reason: collision with other inner class name */
        public static final class C4571a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f156150q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ H f156151r;

            /* compiled from: FavoriteSellersView.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.favorite_sellers.w$a$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C4572a extends kotlin.jvm.internal.H implements Y41.l<FavoriteSellersState, G0> {
                public final void f(@Y61.k FavoriteSellersState favoriteSellersState) {
                    H h12 = (H) this.receiver;
                    h12.getClass();
                    List<FavoriteSellersItem> list = favoriteSellersState.f156038c;
                    com.avito.konveyor.util.a.a(h12.f155432f, list == null ? C42784z0.f406748b : list);
                    com.avito.android.app.coldstart.d dVar = new com.avito.android.app.coldstart.d(h12, 25);
                    View view = h12.f155428b;
                    view.post(dVar);
                    View view2 = h12.f155441o;
                    com.avito.android.extended_profile_ui_components.l lVar = h12.f155446t;
                    Throwable th2 = favoriteSellersState.f156041f;
                    if (th2 != null) {
                        lVar.c(th2, h12.f155439m);
                        D6.G(view2, false);
                    } else if (O2.a(list)) {
                        lVar.a();
                        D6.G(view2, false);
                    } else {
                        List<FavoriteSellersItem> list2 = list;
                        if (list2 == null || list2.isEmpty()) {
                            lVar.a();
                            D6.G(view2, true);
                        }
                    }
                    FavoriteSellersState.SubscriptionMenuState subscriptionMenuState = favoriteSellersState.f156044i;
                    if (subscriptionMenuState != null) {
                        if (h12.f155447u == null) {
                            com.avito.android.subscriptions_settings.d dVar2 = new com.avito.android.subscriptions_settings.d(view.getContext(), null, 2, null);
                            h12.f155433g.d(dVar2);
                            h12.f155447u = dVar2;
                        }
                        com.avito.android.subscriptions_settings.d dVar3 = h12.f155447u;
                        SubscriptionSettingsState.f291480d.getClass();
                        dVar3.f291512n = SubscriptionSettingsState.a.a(subscriptionMenuState.f156054c, subscriptionMenuState.f156055d, subscriptionMenuState.f156056e);
                        dVar3.c();
                        dVar3.f(subscriptionMenuState.f156057f);
                        dVar3.e(subscriptionMenuState.f156058g);
                        C43238h c43238h = h12.f155448v;
                        Q0.d(c43238h.f411905b);
                        C43175k.K(new C43197r1(new C(h12, subscriptionMenuState, null), dVar3.f291516r), c43238h);
                        C43175k.K(new C43197r1(new D(h12, subscriptionMenuState, null), dVar3.f291517s), c43238h);
                        C43175k.K(new C43197r1(new E(h12, dVar3, null), dVar3.f291518t), c43238h);
                    } else {
                        com.avito.android.subscriptions_settings.d dVar4 = h12.f155447u;
                        if (dVar4 != null) {
                            dVar4.b();
                        }
                    }
                    if (favoriteSellersState.f156045j != null) {
                        h12.c(new B(h12, favoriteSellersState));
                    } else {
                        com.avito.android.lib.design.toast_bar.k kVar = h12.f155443q;
                        if (kVar != null) {
                            kVar.f();
                        }
                        h12.f155443q = null;
                    }
                    D6.G(h12.f155444r, favoriteSellersState.f156046k);
                    if (favoriteSellersState.f156039d) {
                        lVar.d();
                        D6.w(view2);
                    } else {
                        h12.f155440n.setRefreshing(false);
                    }
                    if (favoriteSellersState.f156051p) {
                        h12.f155430d.accept(new a.d(false));
                    }
                }

                @Override // Y41.l
                public final /* bridge */ /* synthetic */ G0 invoke(FavoriteSellersState favoriteSellersState) {
                    f(favoriteSellersState);
                    return G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4571a(H h12, Continuation<? super C4571a> continuation) {
                super(2, continuation);
                this.f156151r = h12;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new C4571a(this.f156151r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
                return ((C4571a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f156150q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    H h12 = this.f156151r;
                    n2<FavoriteSellersState> state = h12.f155430d.getState();
                    C4572a c4572a = new C4572a(1, h12, H.class, "render", "render(Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersState;)V", 0);
                    this.f156150q = 1;
                    if (com.avito.android.analytics.screens.mvi.a.a(state, h12.f155439m, c4572a, this) == coroutine_suspended) {
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

        /* compiled from: FavoriteSellersView.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.favorite_sellers.FavoriteSellersMviViewImpl$2$1$1$2", f = "FavoriteSellersView.kt", i = {}, l = {151}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.favorite_sellers.w$a$b */
        public static final class b extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f156152q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ H f156153r;

            /* compiled from: FavoriteSellersView.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.favorite_sellers.w$a$b$a, reason: collision with other inner class name */
            public /* synthetic */ class C4573a implements InterfaceC43172j, kotlin.jvm.internal.D {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ H f156154b;

                public C4573a(H h12) {
                    this.f156154b = h12;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    FC.b bVar = (FC.b) obj;
                    H h12 = this.f156154b;
                    h12.getClass();
                    if (bVar instanceof b.a) {
                        com.avito.android.extended_profile_ui_components.p pVar = com.avito.android.extended_profile_ui_components.p.f153373a;
                        b.a aVar = (b.a) bVar;
                        Throwable th2 = aVar.f4613a;
                        pVar.getClass();
                        com.avito.android.extended_profile_ui_components.j jVarA = com.avito.android.extended_profile_ui_components.p.a(h12.f155439m.o(new AbstractC23662a.b(th2)).f90898b, th2);
                        ToastBarPosition toastBarPosition = ToastBarPosition.f181046d;
                        f.c.f125255c.getClass();
                        c.a.a(h12.f155433g, jVarA.f153349a, 0, null, null, toastBarPosition, f.c.a.a(null, aVar.f4613a), 62);
                    } else if (bVar instanceof b.d) {
                        c.a.a(h12.f155433g, com.avito.android.printable_text.b.f(((b.d) bVar).f4616a), 0, null, null, null, null, 254);
                        C43259k.d(C22981N.a(h12.f155431e.getLifecycle()), null, null, new z(h12, bVar, null), 3);
                    } else if (bVar instanceof b.c) {
                        h12.f155429c.A0();
                    } else if (bVar instanceof b.C0281b) {
                        h12.f155438l.g(((b.C0281b) bVar).f4614a).m(new A(h12));
                    }
                    G0 g02 = G0.f406611a;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    return g02;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if ((obj instanceof InterfaceC43172j) && (obj instanceof kotlin.jvm.internal.D)) {
                        return getFunctionDelegate().equals(((kotlin.jvm.internal.D) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.D
                @Y61.k
                public final InterfaceC43072x<?> getFunctionDelegate() {
                    return new C42801a(2, this.f156154b, H.class, "handleOneTimeEvent", "handleOneTimeEvent(Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersOneTimeEvent;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(H h12, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f156153r = h12;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new b(this.f156153r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
                return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f156152q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    H h12 = this.f156153r;
                    J j12 = h12.f155430d;
                    C4573a c4573a = new C4573a(h12);
                    this.f156152q = 1;
                    if (j12.ke(c4573a, this) == coroutine_suspended) {
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

        /* compiled from: FavoriteSellersView.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.favorite_sellers.FavoriteSellersMviViewImpl$2$1$1$3", f = "FavoriteSellersView.kt", i = {}, l = {152}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.favorite_sellers.w$a$c */
        public static final class c extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f156155q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ d2<vC.b> f156156r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ H f156157s;

            /* compiled from: FavoriteSellersView.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.favorite_sellers.w$a$c$a, reason: collision with other inner class name */
            public /* synthetic */ class C4574a implements InterfaceC43172j, kotlin.jvm.internal.D {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ H f156158b;

                public C4574a(H h12) {
                    this.f156158b = h12;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    vC.b bVar = (vC.b) obj;
                    H h12 = this.f156158b;
                    h12.getClass();
                    FC.a iVar = bVar instanceof vC.d ? new a.i(((vC.d) bVar).f440539a) : bVar instanceof C49192a ? new a.c(((C49192a) bVar).f440537a, null, 2, null) : bVar instanceof vC.c ? new a.e(((vC.c) bVar).f440538a) : bVar instanceof vC.f ? new a.f(((vC.f) bVar).f440542a) : null;
                    if (iVar != null) {
                        h12.f155430d.accept(iVar);
                    }
                    G0 g02 = G0.f406611a;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    return g02;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if ((obj instanceof InterfaceC43172j) && (obj instanceof kotlin.jvm.internal.D)) {
                        return getFunctionDelegate().equals(((kotlin.jvm.internal.D) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.D
                @Y61.k
                public final InterfaceC43072x<?> getFunctionDelegate() {
                    return new C42801a(2, this.f156158b, H.class, "handleItemAction", "handleItemAction(Lcom/avito/android/favorite_sellers/action/FavoriteSellersItemAction;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(H h12, Continuation continuation, d2 d2Var) {
                super(2, continuation);
                this.f156156r = d2Var;
                this.f156157s = h12;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new c(this.f156157s, continuation, this.f156156r);
            }

            @Override // Y41.p
            public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
                return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f156155q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    C4574a c4574a = new C4574a(this.f156157s);
                    this.f156155q = 1;
                    if (this.f156156r.collect(c4574a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                throw new KotlinNothingValueException();
            }
        }

        /* compiled from: FavoriteSellersView.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.favorite_sellers.FavoriteSellersMviViewImpl$2$1$1$4", f = "FavoriteSellersView.kt", i = {}, l = {154}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.favorite_sellers.w$a$d */
        public static final class d extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f156159q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ H f156160r;

            /* compiled from: FavoriteSellersView.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LPz/a;", "it", "Lkotlin/G0;", "emit", "(LPz/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.favorite_sellers.w$a$d$a, reason: collision with other inner class name */
            public static final class C4575a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ H f156161b;

                public C4575a(H h12) {
                    this.f156161b = h12;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    this.f156161b.f155430d.accept(new a.d(false));
                    return G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(H h12, Continuation<? super d> continuation) {
                super(2, continuation);
                this.f156160r = h12;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new d(this.f156160r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
                return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f156159q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    H h12 = this.f156160r;
                    InterfaceC43160i<C14860a> interfaceC43160i = h12.f155434h;
                    C4575a c4575a = new C4575a(h12);
                    this.f156159q = 1;
                    if (interfaceC43160i.collect(c4575a, this) == coroutine_suspended) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(H h12, Continuation continuation, d2 d2Var) {
            super(2, continuation);
            this.f156148r = h12;
            this.f156149s = d2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f156148r, continuation, this.f156149s);
            aVar.f156147q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            kotlinx.coroutines.T t12 = (kotlinx.coroutines.T) this.f156147q;
            H h12 = this.f156148r;
            C43259k.d(t12, null, null, new C4571a(h12, null), 3);
            C43259k.d(t12, null, null, new b(h12, null), 3);
            C43259k.d(t12, null, null, new c(h12, null, this.f156149s), 3);
            C43259k.d(t12, null, null, new d(h12, null), 3);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C30598w(InterfaceC22983P interfaceC22983P, H h12, d2<? extends vC.b> d2Var, Continuation<? super C30598w> continuation) {
        super(2, continuation);
        this.f156144r = interfaceC22983P;
        this.f156145s = h12;
        this.f156146t = d2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C30598w(this.f156144r, this.f156145s, this.f156146t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((C30598w) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f156143q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Lifecycle.State state = Lifecycle.State.f46682e;
            a aVar = new a(this.f156145s, null, this.f156146t);
            this.f156143q = 1;
            if (C23056p0.b(this.f156144r, state, aVar, this) == coroutine_suspended) {
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
