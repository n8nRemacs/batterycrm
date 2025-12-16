package com.avito.android.user_adverts.root_screen.adverts_host.header.mvi;

import AI0.a;
import AI0.b;
import BI0.a;
import II0.a;
import LI0.a;
import MI0.a;
import PI0.a;
import RI0.a;
import androidx.view.M0;
import androidx.view.N0;
import com.avito.android.Z0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.mvi.F;
import com.avito.android.user_adverts.root_screen.adverts_host.i0;
import com.avito.android.user_adverts.root_screen.adverts_host.j0;
import com.avito.android.user_adverts.root_screen.adverts_host.overlay.host.C35586c;
import com.avito.android.user_adverts.root_screen.adverts_host.overlay.host.C35589f;
import com.avito.android.user_adverts.root_screen.adverts_host.overlay.host.H;
import com.avito.android.user_adverts.root_screen.adverts_host.overlay.host.t;
import com.avito.android.user_adverts.root_screen.adverts_host.overlay.host.w;
import com.avito.android.user_adverts.root_screen.adverts_host.overlay.host.z;
import com.avito.android.user_adverts.root_screen.adverts_host.panel_config.item.PanelConfigItem;
import com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card.PanelCardItem;
import com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.e0;
import com.avito.android.util.R0;
import com.yandex.metrica.YandexMetricaDefaultValues;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.flow.p2;
import uI0.InterfaceC48905a;
import vI0.InterfaceC49219a;
import xI0.InterfaceC49844a;
import yI0.InterfaceC50118a;
import zI0.InterfaceC50474d;

/* compiled from: ProfileHeaderMviViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/header/mvi/b;", "Landroidx/lifecycle/M0;", "LzI0/d;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/i0;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b extends M0 implements InterfaceC50474d, i0 {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final JI0.a f312683E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final FI0.a f312684J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final F f312685K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.user_adverts.root_screen.adverts_host.safety_info.a f312686L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.user_adverts.root_screen.adverts_host.charity_info.a f312687M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.user_adverts.root_screen.adverts_host.service_freemium.a f312688N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final InterfaceC48905a f312689O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.user_adverts.root_screen.adverts_host.overlay.core.b f312690P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final j0 f312691Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final R0 f312692R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public final Z0 f312693S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.user_adverts.root_screen.adverts_host.delivery_restriction.a f312694T;

    /* renamed from: U, reason: collision with root package name */
    @Y61.k
    public final e0 f312695U;

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public final Z1<AI0.c> f312696V = p2.a(new AI0.c(null, null, null, null, null, null, null, null, 255, null));

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final e2 f312697W = f2.b(0, 0, null, 7);

    /* compiled from: ProfileHeaderMviViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.header.mvi.ProfileHeaderMviViewModelComposite$1$10", f = "ProfileHeaderMviViewModel.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f312698q;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return b.this.new a(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f312698q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f312698q = 1;
                b bVar = b.this;
                Object objG = C43259k.g(bVar.f312692R.c(), new l(bVar, null), this);
                if (objG != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objG = G0.f406611a;
                }
                if (objG == coroutine_suspended) {
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

    /* compiled from: ProfileHeaderMviViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.header.mvi.ProfileHeaderMviViewModelComposite$1$11", f = "ProfileHeaderMviViewModel.kt", i = {}, l = {98}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.header.mvi.b$b, reason: collision with other inner class name */
    public static final class C9565b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f312700q;

        public C9565b(Continuation<? super C9565b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return b.this.new C9565b(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((C9565b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f312700q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f312700q = 1;
                b bVar = b.this;
                Object objG = C43259k.g(bVar.f312692R.c(), new com.avito.android.user_adverts.root_screen.adverts_host.header.mvi.e(bVar, null), this);
                if (objG != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objG = G0.f406611a;
                }
                if (objG == coroutine_suspended) {
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

    /* compiled from: ProfileHeaderMviViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.header.mvi.ProfileHeaderMviViewModelComposite$1$1", f = "ProfileHeaderMviViewModel.kt", i = {}, l = {88}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f312702q;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return b.this.new c(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f312702q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f312702q = 1;
                b bVar = b.this;
                n2<MI0.d> state = bVar.f312683E.getState();
                com.avito.android.user_adverts.root_screen.adverts_host.overlay.core.b bVar2 = bVar.f312690P;
                Object objCollect = C43175k.I(bVar.f312692R.c(), C43175k.r(new com.avito.android.user_adverts.root_screen.adverts_host.header.mvi.k(new InterfaceC43160i[]{w.a(state, bVar2), t.e(bVar.f312684J.getState(), bVar2), z.a(bVar.f312686L.getState(), bVar2), C35589f.a(bVar.f312687M.getState(), bVar2), H.a(bVar.f312688N.getState(), bVar2), C35586c.a(bVar.f312689O.getState(), bVar2), com.avito.android.user_adverts.root_screen.adverts_host.overlay.host.i.a(bVar.f312694T.getState(), bVar2)}, bVar))).collect(bVar.f312696V, this);
                if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objCollect = G0.f406611a;
                }
                if (objCollect == coroutine_suspended) {
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

    /* compiled from: ProfileHeaderMviViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.header.mvi.ProfileHeaderMviViewModelComposite$1$2", f = "ProfileHeaderMviViewModel.kt", i = {}, l = {89}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f312704q;

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return b.this.new d(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f312704q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f312704q = 1;
                b bVar = b.this;
                Object objCollect = C43175k.I(bVar.f312692R.c(), C43175k.N(new com.avito.android.user_adverts.root_screen.adverts_host.header.mvi.i(bVar.f312684J.getEvents()), new com.avito.android.user_adverts.root_screen.adverts_host.header.mvi.j(bVar.f312683E.getEvents()))).collect(bVar.f312697W, this);
                if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objCollect = G0.f406611a;
                }
                if (objCollect == coroutine_suspended) {
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

    /* compiled from: ProfileHeaderMviViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.header.mvi.ProfileHeaderMviViewModelComposite$1$3", f = "ProfileHeaderMviViewModel.kt", i = {}, l = {YandexMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f312706q;

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return b.this.new e(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((e) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f312706q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f312706q = 1;
                b bVar = b.this;
                Object objCollect = C43175k.I(bVar.f312692R.c(), C43175k.r(new com.avito.android.user_adverts.root_screen.adverts_host.header.mvi.g(bVar.f312684J.getState()))).collect(new com.avito.android.user_adverts.root_screen.adverts_host.header.mvi.h(bVar), this);
                if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objCollect = G0.f406611a;
                }
                if (objCollect == coroutine_suspended) {
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

    /* compiled from: ProfileHeaderMviViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.header.mvi.ProfileHeaderMviViewModelComposite$1$4", f = "ProfileHeaderMviViewModel.kt", i = {}, l = {91}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f312708q;

        public f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return b.this.new f(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((f) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f312708q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f312708q = 1;
                b bVar = b.this;
                Object objG = C43259k.g(bVar.f312692R.c(), new com.avito.android.user_adverts.root_screen.adverts_host.header.mvi.f(bVar, null), this);
                if (objG != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objG = G0.f406611a;
                }
                if (objG == coroutine_suspended) {
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

    /* compiled from: ProfileHeaderMviViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.header.mvi.ProfileHeaderMviViewModelComposite$1$5", f = "ProfileHeaderMviViewModel.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f312710q;

        public g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return b.this.new g(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((g) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f312710q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f312710q = 1;
                b bVar = b.this;
                Object objG = C43259k.g(bVar.f312692R.c(), new o(bVar, null), this);
                if (objG != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objG = G0.f406611a;
                }
                if (objG == coroutine_suspended) {
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

    /* compiled from: ProfileHeaderMviViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.header.mvi.ProfileHeaderMviViewModelComposite$1$6", f = "ProfileHeaderMviViewModel.kt", i = {}, l = {93}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f312712q;

        public h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return b.this.new h(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((h) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f312712q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f312712q = 1;
                b bVar = b.this;
                Object objG = C43259k.g(bVar.f312692R.c(), new m(bVar, null), this);
                if (objG != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objG = G0.f406611a;
                }
                if (objG == coroutine_suspended) {
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

    /* compiled from: ProfileHeaderMviViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.header.mvi.ProfileHeaderMviViewModelComposite$1$7", f = "ProfileHeaderMviViewModel.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f312714q;

        public i(Continuation<? super i> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return b.this.new i(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((i) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f312714q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f312714q = 1;
                b bVar = b.this;
                Object objG = C43259k.g(bVar.f312692R.c(), new com.avito.android.user_adverts.root_screen.adverts_host.header.mvi.d(bVar, null), this);
                if (objG != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objG = G0.f406611a;
                }
                if (objG == coroutine_suspended) {
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

    /* compiled from: ProfileHeaderMviViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.header.mvi.ProfileHeaderMviViewModelComposite$1$8", f = "ProfileHeaderMviViewModel.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f312716q;

        public j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return b.this.new j(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((j) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f312716q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f312716q = 1;
                b bVar = b.this;
                Object objG = C43259k.g(bVar.f312692R.c(), new n(bVar, null), this);
                if (objG != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objG = G0.f406611a;
                }
                if (objG == coroutine_suspended) {
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

    /* compiled from: ProfileHeaderMviViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.header.mvi.ProfileHeaderMviViewModelComposite$1$9", f = "ProfileHeaderMviViewModel.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
    public static final class k extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f312718q;

        public k(Continuation<? super k> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return b.this.new k(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((k) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f312718q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f312718q = 1;
                b bVar = b.this;
                Object objG = C43259k.g(bVar.f312692R.c(), new com.avito.android.user_adverts.root_screen.adverts_host.header.mvi.c(bVar, null), this);
                if (objG != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objG = G0.f406611a;
                }
                if (objG == coroutine_suspended) {
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
    public b(@Y61.k JI0.a aVar, @Y61.k FI0.a aVar2, @Y61.k F f12, @Y61.k com.avito.android.user_adverts.root_screen.adverts_host.safety_info.a aVar3, @Y61.k com.avito.android.user_adverts.root_screen.adverts_host.charity_info.a aVar4, @Y61.k com.avito.android.user_adverts.root_screen.adverts_host.service_freemium.a aVar5, @Y61.k InterfaceC48905a interfaceC48905a, @Y61.k com.avito.android.user_adverts.root_screen.adverts_host.overlay.core.b bVar, @Y61.k j0 j0Var, @Y61.k R0 r02, @Y61.k Z0 z02, @Y61.k com.avito.android.user_adverts.root_screen.adverts_host.delivery_restriction.a aVar6, @Y61.k e0 e0Var) {
        this.f312683E = aVar;
        this.f312684J = aVar2;
        this.f312685K = f12;
        this.f312686L = aVar3;
        this.f312687M = aVar4;
        this.f312688N = aVar5;
        this.f312689O = interfaceC48905a;
        this.f312690P = bVar;
        this.f312691Q = j0Var;
        this.f312692R = r02;
        this.f312693S = z02;
        this.f312694T = aVar6;
        this.f312695U = e0Var;
        A1.a aVarA = N0.a(this);
        C43259k.d(aVarA, null, null, new c(null), 3);
        C43259k.d(aVarA, null, null, new d(null), 3);
        C43259k.d(aVarA, null, null, new e(null), 3);
        C43259k.d(aVarA, null, null, new f(null), 3);
        C43259k.d(aVarA, null, null, new g(null), 3);
        C43259k.d(aVarA, null, null, new h(null), 3);
        C43259k.d(aVarA, null, null, new i(null), 3);
        C43259k.d(aVarA, null, null, new j(null), 3);
        C43259k.d(aVarA, null, null, new k(null), 3);
        C43259k.d(aVarA, null, null, new a(null), 3);
        C43259k.d(aVarA, null, null, new C9565b(null), 3);
    }

    @Override // zI0.InterfaceC50474d
    public final void U2() {
        accept(a.j.f250a);
    }

    @Override // zI0.InterfaceC50474d
    public final void c5(@Y61.l String str, boolean z12, @Y61.l DeepLink deepLink, @Y61.l String str2, boolean z13) {
        if (z13) {
            this.f312686L.accept(new a.b(str));
        }
        Z0 z02 = this.f312693S;
        z02.getClass();
        kotlin.reflect.n<Object> nVar = Z0.f67595D[19];
        if (!((Boolean) z02.f67619v.a().invoke()).booleanValue() || deepLink == null) {
            this.f312687M.accept(new InterfaceC49844a.b(str2));
        } else {
            this.f312694T.accept(new InterfaceC50118a.b(deepLink));
        }
        this.f312685K.accept(new a.l(true));
        this.f312688N.accept(a.c.f14302a);
        if (z12) {
            this.f312689O.accept(InterfaceC49219a.b.f440667a);
        }
    }

    @Override // com.avito.android.user_adverts.root_screen.adverts_host.i0
    @Y61.k
    public final InterfaceC43160i<Boolean> ce() {
        return this.f312691Q.f313102b;
    }

    @Override // com.avito.android.arch.mvi.android.m
    public final InterfaceC43160i getEvents() {
        return this.f312697W;
    }

    @Override // com.avito.android.arch.mvi.android.m
    public final n2 getState() {
        return this.f312696V;
    }

    @Override // zI0.InterfaceC50474d
    public final void h6(@Y61.l String str) {
        accept(new a.o(str));
    }

    @Override // com.avito.android.arch.mvi.android.l
    /* renamed from: ke, reason: merged with bridge method [inline-methods] */
    public final void accept(@Y61.k AI0.a aVar) {
        boolean z12 = aVar instanceof a.j;
        JI0.a aVar2 = this.f312683E;
        FI0.a aVar3 = this.f312684J;
        if (z12) {
            aVar2.accept(a.e.f10553a);
            aVar3.accept(a.d.f8081a);
            return;
        }
        if (aVar instanceof a.k) {
            aVar3.accept(a.d.f8081a);
            return;
        }
        if (aVar instanceof a.i) {
            aVar2.accept(a.d.f10552a);
            aVar3.accept(a.c.f8080a);
            return;
        }
        if (aVar instanceof a.f) {
            PanelCardItem panelCardItem = ((a.f) aVar).f246a;
            if (panelCardItem instanceof LI0.a) {
                aVar2.accept(a.c.f10551a);
                return;
            } else {
                if (panelCardItem instanceof PanelConfigItem.a) {
                    aVar3.accept(new a.b((PanelConfigItem) panelCardItem));
                    return;
                }
                return;
            }
        }
        if (aVar instanceof a.g) {
            com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_progress_card.a aVar4 = ((a.g) aVar).f247a;
            if (aVar4 instanceof PanelConfigItem.e) {
                aVar3.accept(new a.b((PanelConfigItem) aVar4));
                return;
            }
            return;
        }
        if (aVar instanceof a.o) {
            this.f312697W.K5(b.c.f268a);
            aVar2.accept(new a.g(((a.o) aVar).f264a));
            aVar3.accept(a.c.f8080a);
            return;
        }
        if (aVar instanceof a.l) {
            this.f312686L.accept(((a.l) aVar).f251a);
            return;
        }
        if (aVar instanceof a.b) {
            this.f312687M.accept(((a.b) aVar).f242a);
            return;
        }
        if (aVar instanceof a.C0014a) {
            this.f312689O.accept(((a.C0014a) aVar).f241a);
            return;
        }
        if (aVar instanceof a.c) {
            this.f312694T.accept(((a.c) aVar).f243a);
            return;
        }
        if (aVar instanceof a.h) {
            PanelCardItem.b bVar = ((a.h) aVar).f248a;
            if (bVar instanceof PanelConfigItem.b.a) {
                aVar3.accept(a.g.f8084a);
                return;
            } else {
                if (bVar instanceof a.C0610a) {
                    aVar2.accept(a.f.f10554a);
                    return;
                }
                return;
            }
        }
        boolean z13 = aVar instanceof a.d;
        com.avito.android.user_adverts.root_screen.adverts_host.service_freemium.a aVar5 = this.f312688N;
        if (z13) {
            com.avito.android.user_adverts.root_screen.adverts_host.ux_feedback.a.f314156a.getClass();
            String str = ((a.d) aVar).f244a;
            if ("srv_sx_feedback".equals(str)) {
                aVar3.accept(a.e.f8082a);
                return;
            }
            com.avito.android.user_adverts.root_screen.adverts_host.ux_feedback.service_freemium_nps.a.f314159a.getClass();
            if (str.equals("srv_freemium_feedback")) {
                aVar5.accept(a.C0950a.f14300a);
                return;
            }
            return;
        }
        if (aVar instanceof a.e) {
            com.avito.android.user_adverts.root_screen.adverts_host.ux_feedback.a.f314156a.getClass();
            String str2 = ((a.e) aVar).f245a;
            if ("srv_sx_feedback".equals(str2)) {
                aVar3.accept(a.f.f8083a);
                return;
            }
            com.avito.android.user_adverts.root_screen.adverts_host.ux_feedback.service_freemium_nps.a.f314159a.getClass();
            if (str2.equals("srv_freemium_feedback")) {
                aVar5.accept(a.b.f14301a);
                return;
            }
            return;
        }
        if (aVar instanceof a.p) {
            aVar3.accept(a.h.f8085a);
            return;
        }
        if (!(aVar instanceof a.m)) {
            if (aVar instanceof a.n) {
                this.f312685K.accept(new a.h(((a.n) aVar).f263a));
                return;
            }
            return;
        }
        a.m mVar = (a.m) aVar;
        boolean z14 = mVar.f252a;
        String str3 = mVar.f257f;
        c5(mVar.f256e, z14, mVar.f262k, str3, mVar.f253b);
    }

    @Override // zI0.InterfaceC50474d
    public final void onResume() {
        U2();
        InterfaceC50474d.a.a(this, false, false, null, null, false, null, 1919);
    }

    @Override // zI0.InterfaceC50474d
    public final void p0() {
        accept(a.i.f249a);
    }

    @Override // zI0.InterfaceC50474d
    public final void y5(@Y61.k String str) {
        U2();
        this.f312685K.accept(new a.h(str));
    }
}
