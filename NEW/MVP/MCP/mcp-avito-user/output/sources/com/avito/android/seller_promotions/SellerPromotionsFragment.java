package com.avito.android.seller_promotions;

import Cd.C13243a;
import Nq0.C14603a;
import Oq0.b;
import Oq0.d;
import Oq0.f;
import Oq0.g;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.view.C22984Q;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22969B;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import bj.InterfaceC25659b;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.SellerPromotionsScreen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.component.toast.c;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.InterfaceC31171n;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.L;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.N;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.DimmedImage;
import com.avito.android.remote.model.Image;
import com.avito.android.seller_promotions.di.component.b;
import com.avito.android.seller_promotions.h;
import com.avito.android.seller_promotions.model.BeduinFormType;
import com.avito.android.seller_promotions.model.SellerPromotionsArguments;
import com.avito.android.ui.fragments.BaseFragment;
import com.facebook.imageutils.JfifUtil;
import gj.o;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kd0.C42670a;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC43072x;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.rx3.y;
import lj.InterfaceC43779a;
import z1.AbstractC50339a;

/* compiled from: SellerPromotionsFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/seller_promotions/SellerPromotionsFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lgj/i;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SellerPromotionsFragment extends BaseFragment implements gj.i, InterfaceC28477j.b {

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public static final a f267623A0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f267624n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f267625o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f267626p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f267627q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.android.seller_promotions.konveyor.e f267628r0;

    /* renamed from: s0, reason: collision with root package name */
    @X41.f
    @Inject
    public int f267629s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public u f267630t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final O0 f267631u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public N f267632v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public gj.n f267633w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public final Object f267634x0;

    /* renamed from: y0, reason: collision with root package name */
    @Inject
    public InterfaceC25659b f267635y0;

    /* renamed from: z0, reason: collision with root package name */
    public com.avito.android.seller_promotions.n f267636z0;

    /* compiled from: SellerPromotionsFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/seller_promotions/SellerPromotionsFragment$a;", "", "<init>", "()V", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SellerPromotionsFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[BeduinFormType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                BeduinFormType beduinFormType = BeduinFormType.f267873b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: SellerPromotionsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lgj/k;", "invoke", "()Lgj/k;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.a<gj.k> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final gj.k invoke() {
            SellerPromotionsFragment sellerPromotionsFragment = SellerPromotionsFragment.this;
            gj.n nVar = sellerPromotionsFragment.f267633w0;
            if (nVar == null) {
                nVar = null;
            }
            return gj.m.a(nVar, sellerPromotionsFragment);
        }
    }

    /* compiled from: SellerPromotionsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends kotlin.jvm.internal.N implements Y41.a<G0> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = SellerPromotionsFragment.f267623A0;
            SellerPromotionsFragment sellerPromotionsFragment = SellerPromotionsFragment.this;
            sellerPromotionsFragment.q5().accept(d.j.f12588a);
            sellerPromotionsFragment.q5().accept(d.i.f12587a);
            return G0.f406611a;
        }
    }

    /* compiled from: SellerPromotionsFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends H implements Y41.l<Oq0.d, G0> {
        @Override // Y41.l
        public final G0 invoke(Oq0.d dVar) {
            ((t) this.receiver).accept(dVar);
            return G0.f406611a;
        }
    }

    /* compiled from: SellerPromotionsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LOq0/c;", "invoke", "()LOq0/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends kotlin.jvm.internal.N implements Y41.a<Oq0.c> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final Oq0.c invoke() {
            a aVar = SellerPromotionsFragment.f267623A0;
            return SellerPromotionsFragment.this.q5().getState().getValue().f12620f;
        }
    }

    /* compiled from: SellerPromotionsFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.seller_promotions.SellerPromotionsFragment$onViewCreated$4", f = "SellerPromotionsFragment.kt", i = {}, l = {195}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f267640q;

        /* compiled from: SellerPromotionsFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.seller_promotions.SellerPromotionsFragment$onViewCreated$4$1", f = "SellerPromotionsFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f267642q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ SellerPromotionsFragment f267643r;

            /* compiled from: SellerPromotionsFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.seller_promotions.SellerPromotionsFragment$onViewCreated$4$1$1", f = "SellerPromotionsFragment.kt", i = {}, l = {197}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.seller_promotions.SellerPromotionsFragment$g$a$a, reason: collision with other inner class name */
            public static final class C7995a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f267644q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ SellerPromotionsFragment f267645r;

                /* compiled from: SellerPromotionsFragment.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LOq0/g;", "it", "Lkotlin/G0;", "invoke", "(LOq0/g;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.seller_promotions.SellerPromotionsFragment$g$a$a$a, reason: collision with other inner class name */
                public static final class C7996a extends kotlin.jvm.internal.N implements Y41.l<Oq0.g, G0> {

                    /* renamed from: l, reason: collision with root package name */
                    public final /* synthetic */ SellerPromotionsFragment f267646l;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C7996a(SellerPromotionsFragment sellerPromotionsFragment) {
                        super(1);
                        this.f267646l = sellerPromotionsFragment;
                    }

                    @Override // Y41.l
                    public final G0 invoke(Oq0.g gVar) {
                        Oq0.g gVar2 = gVar;
                        a aVar = SellerPromotionsFragment.f267623A0;
                        SellerPromotionsFragment sellerPromotionsFragment = this.f267646l;
                        com.avito.android.seller_promotions.f fVar = new com.avito.android.seller_promotions.f(1, sellerPromotionsFragment.q5(), t.class, "accept", "accept(Ljava/lang/Object;)V", 0);
                        com.avito.android.seller_promotions.n nVar = sellerPromotionsFragment.f267636z0;
                        if (nVar == null) {
                            nVar = null;
                        }
                        nVar.f268080h.setNavigationOnClickListener(new com.avito.android.seller_promotions.b(0, fVar));
                        nVar.f268080h.setTitle(gVar2.f12617c.k0(sellerPromotionsFragment.requireContext()));
                        com.avito.android.lib.beduin_v2.repository.cart_total_quantity.utils.d.a(nVar.f268075c, nVar.f268081i, gVar2.f12623i, com.avito.android.lib.beduin_v2.repository.cart_total_quantity.utils.b.f176531l);
                        com.avito.konveyor.adapter.d dVar = nVar.f268077e;
                        List<com.avito.android.seller_promotions.konveyor.c> list = gVar2.f12624j;
                        dVar.l(list, null);
                        nVar.f268078f.f267803f = list;
                        Oq0.b bVar = gVar2.f12618d;
                        boolean z12 = bVar instanceof b.a;
                        SwipeRefreshLayout swipeRefreshLayout = nVar.f268082j;
                        swipeRefreshLayout.setEnabled(!z12);
                        swipeRefreshLayout.setRefreshing(bVar instanceof b.c);
                        com.avito.android.seller_promotions.g gVar3 = new com.avito.android.seller_promotions.g(fVar);
                        if (z12) {
                            com.avito.android.seller_promotions.n nVar2 = sellerPromotionsFragment.f267636z0;
                            C42670a.d((nVar2 != null ? nVar2 : null).f268087o);
                        } else {
                            g.b bVar2 = gVar2.f12622h;
                            if (bVar2 != null) {
                                com.avito.android.seller_promotions.n nVar3 = sellerPromotionsFragment.f267636z0;
                                if (nVar3 == null) {
                                    nVar3 = null;
                                }
                                nVar3.getClass();
                                nVar3.f268087o.c(null, new p(bVar2, gVar3));
                            } else {
                                com.avito.android.seller_promotions.n nVar4 = sellerPromotionsFragment.f267636z0;
                                (nVar4 != null ? nVar4 : null).f268087o.b();
                            }
                        }
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C7995a(SellerPromotionsFragment sellerPromotionsFragment, Continuation<? super C7995a> continuation) {
                    super(2, continuation);
                    this.f267645r = sellerPromotionsFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C7995a(this.f267645r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C7995a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f267644q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = SellerPromotionsFragment.f267623A0;
                        SellerPromotionsFragment sellerPromotionsFragment = this.f267645r;
                        n2<Oq0.g> state = sellerPromotionsFragment.q5().getState();
                        ScreenPerformanceTracker screenPerformanceTracker = sellerPromotionsFragment.f267625o0;
                        if (screenPerformanceTracker == null) {
                            screenPerformanceTracker = null;
                        }
                        C7996a c7996a = new C7996a(sellerPromotionsFragment);
                        this.f267644q = 1;
                        if (com.avito.android.analytics.screens.mvi.a.a(state, screenPerformanceTracker, c7996a, this) == coroutine_suspended) {
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

            /* compiled from: SellerPromotionsFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.seller_promotions.SellerPromotionsFragment$onViewCreated$4$1$2", f = "SellerPromotionsFragment.kt", i = {}, l = {204}, m = "invokeSuspend", n = {}, s = {})
            public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f267647q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ SellerPromotionsFragment f267648r;

                /* compiled from: SellerPromotionsFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.seller_promotions.SellerPromotionsFragment$g$a$b$a, reason: collision with other inner class name */
                public /* synthetic */ class C7997a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ SellerPromotionsFragment f267649b;

                    public C7997a(SellerPromotionsFragment sellerPromotionsFragment) {
                        this.f267649b = sellerPromotionsFragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        InterfaceC43779a interfaceC43779a;
                        RecyclerView.Adapter adapter;
                        Bundle bundle;
                        Oq0.f fVar = (Oq0.f) obj;
                        a aVar = SellerPromotionsFragment.f267623A0;
                        SellerPromotionsFragment sellerPromotionsFragment = this.f267649b;
                        if (fVar instanceof f.b) {
                            sellerPromotionsFragment.t0();
                        } else {
                            if (fVar instanceof f.e) {
                                com.avito.android.deeplink_handler.handler.composite.a aVar2 = sellerPromotionsFragment.f267626p0;
                                f.e eVar = (f.e) fVar;
                                (aVar2 != null ? aVar2 : null).r6(eVar.f12601c, eVar.f12599a, eVar.f12600b);
                            } else if (fVar instanceof f.d) {
                                f.d dVar = (f.d) fVar;
                                C14603a c14603a = dVar.f12598d;
                                if (c14603a != null) {
                                    bundle = new Bundle();
                                    bundle.putString("title", c14603a.f11757a);
                                    bundle.putLong("click_time", c14603a.f11759c);
                                    bundle.putParcelable("screen_source", c14603a.f11758b);
                                    String str = c14603a.f11761e;
                                    if (str != null) {
                                        bundle.putString("price", str);
                                    }
                                    Image image = c14603a.f11760d;
                                    if (image != null) {
                                        bundle.putParcelable("image", new DimmedImage(image, null, 2, null));
                                    }
                                } else {
                                    bundle = null;
                                }
                                com.avito.android.deeplink_handler.handler.composite.a aVar3 = sellerPromotionsFragment.f267626p0;
                                if (aVar3 == null) {
                                    aVar3 = null;
                                }
                                b.a.a(aVar3, dVar.f12597c, null, bundle, 2);
                            } else if (fVar instanceof f.g) {
                                gj.o oVarC1 = sellerPromotionsFragment.c1();
                                com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                                o.a aVar4 = oVarC1.f396762b;
                                f.g gVar = (f.g) fVar;
                                PrintableText printableText = gVar.f12606b;
                                f.c cVar2 = new f.c(gVar.f12605a);
                                f.g.a aVar5 = gVar.f12607c;
                                com.avito.android.component.toast.c.b(cVar, aVar4.f396763a, printableText, null, C42745f0.V(aVar5 != null ? new c.a.C3719a(aVar5.f12609a.k0(sellerPromotionsFragment.requireContext()), true, null, new com.avito.android.seller_promotions.e(aVar5, sellerPromotionsFragment), 4, null) : null), null, cVar2, 0, aVar4.f396764b, null, false, false, null, null, 4010);
                                if (gVar.f12608d) {
                                    com.avito.android.cart_snippet_actions.utils.j.a(aVar4.f396763a);
                                }
                            } else if (fVar instanceof f.h) {
                                com.avito.android.seller_promotions.n nVar = sellerPromotionsFragment.f267636z0;
                                if (nVar == null) {
                                    nVar = null;
                                }
                                gj.o oVarC12 = sellerPromotionsFragment.c1();
                                f.h hVar = (f.h) fVar;
                                ApiError apiError = hVar.f12611a;
                                RecyclerView recyclerView = nVar.f268084l;
                                RecyclerView.m layoutManager = recyclerView.getLayoutManager();
                                GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
                                if (gridLayoutManager != null && (adapter = recyclerView.getAdapter()) != null) {
                                    r rVar = new r(gridLayoutManager, adapter.getItemCount(), oVarC12.f396762b, hVar.f12612b, apiError);
                                    if (recyclerView.getScrollState() == 0) {
                                        rVar.invoke();
                                    } else {
                                        recyclerView.o(new q(rVar));
                                    }
                                }
                            } else if (fVar instanceof f.c) {
                                com.avito.android.beduin_shared.model.utils.a.a(sellerPromotionsFragment.q5().f268101N, ((f.c) fVar).f12594a);
                            } else if (fVar instanceof f.a) {
                                Iterator<T> it = sellerPromotionsFragment.q5().f268101N.getF103565k().getAll().iterator();
                                while (it.hasNext()) {
                                    ((InterfaceC43779a) it.next()).h(((f.a) fVar).f12592a);
                                }
                            } else if (fVar instanceof f.C0812f) {
                                f.C0812f c0812f = (f.C0812f) fVar;
                                int iOrdinal = c0812f.f12602a.ordinal();
                                if (iOrdinal == 0) {
                                    interfaceC43779a = sellerPromotionsFragment.q5().f268102O;
                                } else {
                                    if (iOrdinal != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    interfaceC43779a = sellerPromotionsFragment.q5().f268103P;
                                }
                                com.avito.android.beduin_shared.model.utils.j.b(interfaceC43779a, c0812f.f12603b, c0812f.f12604c);
                            } else if (fVar instanceof f.i) {
                                N n12 = sellerPromotionsFragment.f267632v0;
                                (n12 != null ? n12 : null).qe(((f.i) fVar).f12613a);
                            }
                        }
                        G0 g02 = G0.f406611a;
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        return g02;
                    }

                    public final boolean equals(@Y61.l Object obj) {
                        if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
                            return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
                        }
                        return false;
                    }

                    @Override // kotlin.jvm.internal.D
                    @Y61.k
                    public final InterfaceC43072x<?> getFunctionDelegate() {
                        return new C42801a(2, this.f267649b, SellerPromotionsFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(SellerPromotionsFragment sellerPromotionsFragment, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f267648r = sellerPromotionsFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new b(this.f267648r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f267647q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = SellerPromotionsFragment.f267623A0;
                        SellerPromotionsFragment sellerPromotionsFragment = this.f267648r;
                        t tVarQ5 = sellerPromotionsFragment.q5();
                        C7997a c7997a = new C7997a(sellerPromotionsFragment);
                        this.f267647q = 1;
                        if (tVarQ5.ke(c7997a, this) == coroutine_suspended) {
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

            /* compiled from: SellerPromotionsFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.seller_promotions.SellerPromotionsFragment$onViewCreated$4$1$3", f = "SellerPromotionsFragment.kt", i = {}, l = {JfifUtil.MARKER_RST0}, m = "invokeSuspend", n = {}, s = {})
            public static final class c extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f267650q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ SellerPromotionsFragment f267651r;

                /* compiled from: SellerPromotionsFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.seller_promotions.SellerPromotionsFragment$g$a$c$a, reason: collision with other inner class name */
                public /* synthetic */ class C7998a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.avito.android.seller_promotions.n f267652b;

                    public C7998a(com.avito.android.seller_promotions.n nVar) {
                        this.f267652b = nVar;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        this.f267652b.f268076d.m((List) obj);
                        G0 g02 = G0.f406611a;
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        return g02;
                    }

                    public final boolean equals(@Y61.l Object obj) {
                        if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
                            return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
                        }
                        return false;
                    }

                    @Override // kotlin.jvm.internal.D
                    @Y61.k
                    public final InterfaceC43072x<?> getFunctionDelegate() {
                        return new C42801a(2, this.f267652b, com.avito.android.seller_promotions.n.class, "submitTopList", "submitTopList(Ljava/util/List;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(SellerPromotionsFragment sellerPromotionsFragment, Continuation<? super c> continuation) {
                    super(2, continuation);
                    this.f267651r = sellerPromotionsFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new c(this.f267651r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f267650q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = SellerPromotionsFragment.f267623A0;
                        SellerPromotionsFragment sellerPromotionsFragment = this.f267651r;
                        InterfaceC43160i interfaceC43160iA = y.a(sellerPromotionsFragment.q5().f268102O.getF103348p());
                        com.avito.android.seller_promotions.n nVar = sellerPromotionsFragment.f267636z0;
                        if (nVar == null) {
                            nVar = null;
                        }
                        C7998a c7998a = new C7998a(nVar);
                        this.f267650q = 1;
                        if (((AbstractC43168f) interfaceC43160iA).collect(c7998a, this) == coroutine_suspended) {
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

            /* compiled from: SellerPromotionsFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.seller_promotions.SellerPromotionsFragment$onViewCreated$4$1$4", f = "SellerPromotionsFragment.kt", i = {}, l = {213}, m = "invokeSuspend", n = {}, s = {})
            public static final class d extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f267653q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ SellerPromotionsFragment f267654r;

                /* compiled from: SellerPromotionsFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.seller_promotions.SellerPromotionsFragment$g$a$d$a, reason: collision with other inner class name */
                public /* synthetic */ class C7999a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.avito.android.seller_promotions.n f267655b;

                    public C7999a(com.avito.android.seller_promotions.n nVar) {
                        this.f267655b = nVar;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        com.avito.android.seller_promotions.n nVar = this.f267655b;
                        nVar.getClass();
                        com.avito.android.publish.screen.objects.view.actions.h hVar = new com.avito.android.publish.screen.objects.view.actions.h(nVar, 13);
                        nVar.f268079g.l((List) obj, hVar);
                        G0 g02 = G0.f406611a;
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        return g02;
                    }

                    public final boolean equals(@Y61.l Object obj) {
                        if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
                            return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
                        }
                        return false;
                    }

                    @Override // kotlin.jvm.internal.D
                    @Y61.k
                    public final InterfaceC43072x<?> getFunctionDelegate() {
                        return new C42801a(2, this.f267655b, com.avito.android.seller_promotions.n.class, "submitBottomList", "submitBottomList(Ljava/util/List;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public d(SellerPromotionsFragment sellerPromotionsFragment, Continuation<? super d> continuation) {
                    super(2, continuation);
                    this.f267654r = sellerPromotionsFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new d(this.f267654r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f267653q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = SellerPromotionsFragment.f267623A0;
                        SellerPromotionsFragment sellerPromotionsFragment = this.f267654r;
                        InterfaceC43160i interfaceC43160iA = y.a(sellerPromotionsFragment.q5().f268103P.getF103348p());
                        com.avito.android.seller_promotions.n nVar = sellerPromotionsFragment.f267636z0;
                        if (nVar == null) {
                            nVar = null;
                        }
                        C7999a c7999a = new C7999a(nVar);
                        this.f267653q = 1;
                        if (((AbstractC43168f) interfaceC43160iA).collect(c7999a, this) == coroutine_suspended) {
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

            /* compiled from: SellerPromotionsFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.seller_promotions.SellerPromotionsFragment$onViewCreated$4$1$5", f = "SellerPromotionsFragment.kt", i = {}, l = {JfifUtil.MARKER_EOI}, m = "invokeSuspend", n = {}, s = {})
            public static final class e extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f267656q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ SellerPromotionsFragment f267657r;

                /* compiled from: SellerPromotionsFragment.kt */
                @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "emit", "(Lkotlin/G0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.seller_promotions.SellerPromotionsFragment$g$a$e$a, reason: collision with other inner class name */
                public static final class C8000a<T> implements InterfaceC43172j {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ SellerPromotionsFragment f267658b;

                    public C8000a(SellerPromotionsFragment sellerPromotionsFragment) {
                        this.f267658b = sellerPromotionsFragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        a aVar = SellerPromotionsFragment.f267623A0;
                        this.f267658b.q5().accept(d.c.f12578a);
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public e(SellerPromotionsFragment sellerPromotionsFragment, Continuation<? super e> continuation) {
                    super(2, continuation);
                    this.f267657r = sellerPromotionsFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new e(this.f267657r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((e) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f267656q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        SellerPromotionsFragment sellerPromotionsFragment = this.f267657r;
                        com.avito.android.seller_promotions.n nVar = sellerPromotionsFragment.f267636z0;
                        if (nVar == null) {
                            nVar = null;
                        }
                        InterfaceC43160i interfaceC43160iA = y.a(nVar.f268075c.c(nVar.f268081i));
                        C8000a c8000a = new C8000a(sellerPromotionsFragment);
                        this.f267656q = 1;
                        if (((AbstractC43168f) interfaceC43160iA).collect(c8000a, this) == coroutine_suspended) {
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
            public a(SellerPromotionsFragment sellerPromotionsFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f267643r = sellerPromotionsFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f267643r, continuation);
                aVar.f267642q = obj;
                return aVar;
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                T t12 = (T) this.f267642q;
                SellerPromotionsFragment sellerPromotionsFragment = this.f267643r;
                C43259k.d(t12, null, null, new C7995a(sellerPromotionsFragment, null), 3);
                C43259k.d(t12, null, null, new b(sellerPromotionsFragment, null), 3);
                C43259k.d(t12, null, null, new c(sellerPromotionsFragment, null), 3);
                C43259k.d(t12, null, null, new d(sellerPromotionsFragment, null), 3);
                C43259k.d(t12, null, null, new e(sellerPromotionsFragment, null), 3);
                return G0.f406611a;
            }
        }

        public g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return SellerPromotionsFragment.this.new g(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((g) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f267640q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46681d;
                SellerPromotionsFragment sellerPromotionsFragment = SellerPromotionsFragment.this;
                a aVar = new a(sellerPromotionsFragment, null);
                this.f267640q = 1;
                if (C23056p0.b(sellerPromotionsFragment, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: SellerPromotionsFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/beduin_v2/repository/cart_total_quantity/n;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/beduin_v2/repository/cart_total_quantity/n;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends kotlin.jvm.internal.N implements Y41.l<InterfaceC31171n, G0> {
        public h() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC31171n interfaceC31171n) {
            a aVar = SellerPromotionsFragment.f267623A0;
            SellerPromotionsFragment.this.q5().accept(new d.l(interfaceC31171n));
            return G0.f406611a;
        }
    }

    /* compiled from: SellerPromotionsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LOq0/d;", "it", "Lkotlin/G0;", "invoke", "(LOq0/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends kotlin.jvm.internal.N implements Y41.l<Oq0.d, G0> {
        public i() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Oq0.d dVar) {
            a aVar = SellerPromotionsFragment.f267623A0;
            SellerPromotionsFragment.this.q5().accept(dVar);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends kotlin.jvm.internal.N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f267661l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Y41.a aVar) {
            super(0);
            this.f267661l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f267661l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends kotlin.jvm.internal.N implements Y41.a<Fragment> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return SellerPromotionsFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends kotlin.jvm.internal.N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ k f267663l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(k kVar) {
            super(0);
            this.f267663l = kVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f267663l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends kotlin.jvm.internal.N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f267664l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f267664l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f267664l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends kotlin.jvm.internal.N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f267665l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f267665l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f267665l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: SellerPromotionsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/seller_promotions/t;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/seller_promotions/t;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class o extends kotlin.jvm.internal.N implements Y41.a<t> {
        public o() {
            super(0);
        }

        @Override // Y41.a
        public final t invoke() {
            u uVar = SellerPromotionsFragment.this.f267630t0;
            if (uVar == null) {
                uVar = null;
            }
            return (t) uVar.get();
        }
    }

    public SellerPromotionsFragment() {
        super(0, 1, null);
        j jVar = new j(new o());
        k kVar = new k();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406616d;
        InterfaceC42726C interfaceC42726CB = C42727D.b(lazyThreadSafetyMode, new l(kVar));
        this.f267631u0 = new O0(m0.f406844a.b(t.class), new m(interfaceC42726CB), jVar, new n(interfaceC42726CB));
        this.f267634x0 = C42727D.b(lazyThreadSafetyMode, new c());
    }

    @Override // gj.i
    @Y61.l
    public final RecyclerView B0(@Y61.k String str) {
        if (str.equals(q5().f268102O.getF103350r())) {
            com.avito.android.seller_promotions.n nVar = this.f267636z0;
            return (nVar != null ? nVar : null).f268083k;
        }
        if (!str.equals(q5().f268103P.getF103350r())) {
            return null;
        }
        com.avito.android.seller_promotions.n nVar2 = this.f267636z0;
        return (nVar2 != null ? nVar2 : null).f268085m;
    }

    @Override // gj.i
    @Y61.l
    public final View b3(@Y61.k String str) {
        return B0(str);
    }

    @Override // gj.i
    @Y61.k
    public final gj.o c1() {
        com.avito.android.seller_promotions.n nVar = this.f267636z0;
        o.a aVar = new o.a((nVar == null ? null : nVar).f268085m, ToastBarPosition.f181044b);
        if (nVar == null) {
            nVar = null;
        }
        return new gj.o(aVar, new o.a(nVar.f268080h, ToastBarPosition.f181045c));
    }

    @Override // gj.i
    @Y61.k
    public final String m0() {
        return "main";
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final Context m5(@Y61.k Context context, @Y61.l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f267625o0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        getViewLifecycleOwner().getLifecycle().a(new com.avito.android.lib.beduin_v2.repository.domain.cart_items.r(new d()));
        return layoutInflater.inflate(R.layout.cart_seller_promotion_fragment, viewGroup, false);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((gj.k) this.f267634x0.getValue()).l(q5().f268101N);
        InterfaceC22983P viewLifecycleOwner = getViewLifecycleOwner();
        N n12 = this.f267632v0;
        L l12 = new L(viewLifecycleOwner, n12 != null ? n12 : null, false, 4, null);
        InterfaceC25659b interfaceC25659b = this.f267635y0;
        if (interfaceC25659b == null) {
            interfaceC25659b = null;
        }
        com.avito.android.beduin.common.component.adapter.a aVarI = com.avito.android.bxcontent.mvi.entity.f.i(24, interfaceC25659b);
        aVarI.f100611g = q5().f268101N.B0();
        InterfaceC25659b interfaceC25659b2 = this.f267635y0;
        if (interfaceC25659b2 == null) {
            interfaceC25659b2 = null;
        }
        com.avito.android.beduin.common.component.adapter.a aVarI2 = com.avito.android.bxcontent.mvi.entity.f.i(24, interfaceC25659b2);
        aVarI2.f100611g = q5().f268101N.B0();
        ViewGroup viewGroup = (ViewGroup) view;
        e eVar = new e(1, q5(), t.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        f fVar = new f();
        com.avito.konveyor.adapter.d dVar = this.f267627q0;
        com.avito.konveyor.adapter.d dVar2 = dVar != null ? dVar : null;
        com.avito.android.seller_promotions.konveyor.e eVar2 = this.f267628r0;
        com.avito.android.seller_promotions.konveyor.e eVar3 = eVar2 != null ? eVar2 : null;
        int i12 = this.f267629s0;
        ScreenPerformanceTracker screenPerformanceTracker = this.f267625o0;
        com.avito.android.seller_promotions.n nVar = new com.avito.android.seller_promotions.n(viewGroup, eVar, fVar, l12, aVarI, dVar2, eVar3, i12, aVarI2, screenPerformanceTracker != null ? screenPerformanceTracker : null);
        com.avito.android.beduin_shared.model.utils.b.c(q5().f268101N, this, nVar.f268087o);
        this.f267636z0 = nVar;
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new g(null), 3);
        N n13 = this.f267632v0;
        if (n13 == null) {
            n13 = null;
        }
        n13.f176464O.observe(getViewLifecycleOwner(), new h.a(new h()));
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f267625o0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        b.a aVarA = com.avito.android.seller_promotions.di.component.a.a();
        Bundle bundleRequireArguments = requireArguments();
        aVarA.a((SellerPromotionsArguments) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("promotionData", SellerPromotionsArguments.class) : bundleRequireArguments.getParcelable("promotionData")), getResources(), this, new i(), new C28478k(SellerPromotionsScreen.f90482d, com.avito.android.analytics.screens.s.c(this), null, 4, null), (com.avito.android.seller_promotions.di.component.c) C29972i.a(C29972i.b(this), com.avito.android.seller_promotions.di.component.c.class), cv.c.b(this), (InterfaceC30106l7) C29972i.a(C29972i.b(this), InterfaceC30106l7.class)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f267625o0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f267625o0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).c(this, g5());
    }

    public final t q5() {
        return (t) this.f267631u0.getValue();
    }

    @Override // gj.i
    public final void t0() {
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 != null) {
            activityC22955mL1.onBackPressed();
        }
    }
}
