package com.avito.android.campaigns_sale;

import Cd.C13243a;
import SK0.b;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.RunnableC22211b;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22984Q;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import bj.InterfaceC25659b;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.CampaignsSaleScreen;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.campaigns_sale.CampaignsSaleFragment;
import com.avito.android.campaigns_sale.di.g;
import com.avito.android.campaigns_sale.model.CampaignsSaleArguments;
import com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleState;
import com.avito.android.campaigns_sale_search.CampaignsSaleSearchActivity;
import com.avito.android.campaigns_sale_search.model.CampaignsSaleSearchArguments;
import com.avito.android.component.toast.c;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.modal.a;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35966w1;
import com.avito.android.util.D6;
import com.avito.android.util.K2;
import com.avito.android.util.P5;
import com.google.android.material.appbar.MaterialToolbar;
import gj.o;
import hm.AbstractC40959a;
import im.InterfaceC41424a;
import im.b;
import java.util.Collections;
import java.util.UUID;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC43072x;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;
import qm.C47415a;
import ru.avito.component.appbar.ActionMenu;
import z1.AbstractC50339a;

/* compiled from: CampaignsSaleFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/campaigns_sale/CampaignsSaleFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lgj/i;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CampaignsSaleFragment extends BaseFragment implements gj.i, InterfaceC28477j.b {

    /* renamed from: B0, reason: collision with root package name */
    @Y61.k
    public static final a f113813B0 = new a(null);

    /* renamed from: A0, reason: collision with root package name */
    @Y61.l
    public String f113814A0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public F f113815n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f113816o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public gj.n f113817p0;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.k
    public final Object f113818q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public InterfaceC25659b f113819r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f113820s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f113821t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f113822u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f113823v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public CampaignsSaleArguments f113824w0;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public SK0.b f113825x0;

    /* renamed from: y0, reason: collision with root package name */
    public z f113826y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public final String f113827z0;

    /* compiled from: CampaignsSaleFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/campaigns_sale/CampaignsSaleFragment$a;", "", "<init>", "()V", "", "CAMPAIGNS_SALE_SEARCH_REQUEST_CODE", "I", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: CampaignsSaleFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lgj/k;", "invoke", "()Lgj/k;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<gj.k> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final gj.k invoke() {
            CampaignsSaleFragment campaignsSaleFragment = CampaignsSaleFragment.this;
            gj.n nVar = campaignsSaleFragment.f113817p0;
            if (nVar == null) {
                nVar = null;
            }
            return gj.m.a(nVar, campaignsSaleFragment);
        }
    }

    /* compiled from: CampaignsSaleFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.campaigns_sale.CampaignsSaleFragment$onViewCreated$2", f = "CampaignsSaleFragment.kt", i = {}, l = {169}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f113829q;

        /* compiled from: CampaignsSaleFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.campaigns_sale.CampaignsSaleFragment$onViewCreated$2$1", f = "CampaignsSaleFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f113831q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ CampaignsSaleFragment f113832r;

            /* compiled from: CampaignsSaleFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.campaigns_sale.CampaignsSaleFragment$onViewCreated$2$1$1", f = "CampaignsSaleFragment.kt", i = {}, l = {170}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.campaigns_sale.CampaignsSaleFragment$c$a$a, reason: collision with other inner class name */
            public static final class C3333a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f113833q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ CampaignsSaleFragment f113834r;

                /* compiled from: CampaignsSaleFragment.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleState;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.campaigns_sale.CampaignsSaleFragment$c$a$a$a, reason: collision with other inner class name */
                public static final class C3334a extends N implements Y41.l<CampaignsSaleState, G0> {

                    /* renamed from: l, reason: collision with root package name */
                    public final /* synthetic */ CampaignsSaleFragment f113835l;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C3334a(CampaignsSaleFragment campaignsSaleFragment) {
                        super(1);
                        this.f113835l = campaignsSaleFragment;
                    }

                    @Override // Y41.l
                    public final G0 invoke(CampaignsSaleState campaignsSaleState) {
                        CampaignsSaleState campaignsSaleState2 = campaignsSaleState;
                        a aVar = CampaignsSaleFragment.f113813B0;
                        final CampaignsSaleFragment campaignsSaleFragment = this.f113835l;
                        final C29298e c29298e = new C29298e(1, campaignsSaleFragment.q5(), E.class, "accept", "accept(Ljava/lang/Object;)V", 0);
                        z zVar = campaignsSaleFragment.f113826y0;
                        if (zVar == null) {
                            zVar = null;
                        }
                        campaignsSaleFragment.f113814A0 = campaignsSaleState2.f114203q;
                        zVar.f114453a.m(campaignsSaleState2.f114204r);
                        boolean z12 = campaignsSaleState2.f114202p;
                        MaterialToolbar materialToolbar = zVar.f114456d;
                        if (z12) {
                            C29299f c29299f = new C29299f(campaignsSaleFragment);
                            if (materialToolbar.getMenu().findItem(0) == null) {
                                P5.a(materialToolbar, 0, new ActionMenu(zVar.f114455c.getString(R.string.campaigns_sale_search_icon_title), 2, Integer.valueOf(R.drawable.ic_search_24), Integer.valueOf(R.attr.black), null, 16, null));
                                com.avito.android.ui.d.a(materialToolbar.getMenu().getItem(0), new y(0, c29299f));
                            }
                        }
                        CampaignsSaleState.FloatingButton floatingButton = CampaignsSaleState.FloatingButton.f114210b;
                        CampaignsSaleState.FloatingButton floatingButton2 = campaignsSaleState2.f114195i;
                        boolean z13 = floatingButton2 == floatingButton;
                        Button button = zVar.f114459g;
                        D6.G(button, z13);
                        boolean z14 = floatingButton2 == CampaignsSaleState.FloatingButton.f114211c;
                        Button button2 = zVar.f114461i;
                        D6.G(button2, z14);
                        Button button3 = zVar.f114460h;
                        D6.G(button3, campaignsSaleState2.f114196j);
                        materialToolbar.setNavigationOnClickListener(new com.avito.android.advert.item.compatibility.v2.m(13, c29298e));
                        com.avito.android.advert.item.compatibility.v2.m mVar = new com.avito.android.advert.item.compatibility.v2.m(14, c29298e);
                        Button button4 = zVar.f114458f;
                        button4.setOnClickListener(mVar);
                        CampaignsSaleState.AddBlockButtonState addBlockButtonState = CampaignsSaleState.AddBlockButtonState.f114205b;
                        CampaignsSaleState.AddBlockButtonState addBlockButtonState2 = campaignsSaleState2.f114198l;
                        button4.setEnabled(addBlockButtonState2 == addBlockButtonState);
                        D6.G(button4, addBlockButtonState2 != CampaignsSaleState.AddBlockButtonState.f114207d);
                        button.setOnClickListener(new com.avito.android.advert.item.compatibility.v2.m(15, c29298e));
                        button3.setOnClickListener(new com.avito.android.advert.item.compatibility.v2.m(16, c29298e));
                        button2.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.campaigns_sale.b
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                CampaignsSaleFragment.a aVar2 = CampaignsSaleFragment.f113813B0;
                                K2.e(campaignsSaleFragment);
                                ((C29298e) c29298e).invoke(InterfaceC41424a.q.f398734a);
                            }
                        });
                        zVar.f114454b.l(campaignsSaleState2.f114191e, new RunnableC22211b(7, new com.avito.android.campaigns_sale.i(campaignsSaleFragment, campaignsSaleState2, c29298e)));
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C3333a(CampaignsSaleFragment campaignsSaleFragment, Continuation<? super C3333a> continuation) {
                    super(2, continuation);
                    this.f113834r = campaignsSaleFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C3333a(this.f113834r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C3333a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f113833q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = CampaignsSaleFragment.f113813B0;
                        CampaignsSaleFragment campaignsSaleFragment = this.f113834r;
                        n2<CampaignsSaleState> state = campaignsSaleFragment.q5().getState();
                        ScreenPerformanceTracker screenPerformanceTracker = campaignsSaleFragment.f113823v0;
                        if (screenPerformanceTracker == null) {
                            screenPerformanceTracker = null;
                        }
                        C3334a c3334a = new C3334a(campaignsSaleFragment);
                        this.f113833q = 1;
                        if (com.avito.android.analytics.screens.mvi.a.a(state, screenPerformanceTracker, c3334a, this) == coroutine_suspended) {
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

            /* compiled from: CampaignsSaleFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.campaigns_sale.CampaignsSaleFragment$onViewCreated$2$1$2", f = "CampaignsSaleFragment.kt", i = {}, l = {171}, m = "invokeSuspend", n = {}, s = {})
            public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f113836q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ CampaignsSaleFragment f113837r;

                /* compiled from: CampaignsSaleFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.campaigns_sale.CampaignsSaleFragment$c$a$b$a, reason: collision with other inner class name */
                public /* synthetic */ class C3335a implements InterfaceC43172j, kotlin.jvm.internal.D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ CampaignsSaleFragment f113838b;

                    public C3335a(CampaignsSaleFragment campaignsSaleFragment) {
                        this.f113838b = campaignsSaleFragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        im.b bVar = (im.b) obj;
                        a aVar = CampaignsSaleFragment.f113813B0;
                        CampaignsSaleFragment campaignsSaleFragment = this.f113838b;
                        if (bVar instanceof b.a) {
                            campaignsSaleFragment.t0();
                        } else if (bVar instanceof b.e) {
                            AbstractC40959a abstractC40959a = ((b.e) bVar).f398745a;
                            if (abstractC40959a instanceof AbstractC40959a.d) {
                                com.avito.android.lib.util.g.a(a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, campaignsSaleFragment.requireContext(), new l(campaignsSaleFragment)));
                            } else if (abstractC40959a instanceof AbstractC40959a.c) {
                                com.avito.android.lib.util.g.a(a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, campaignsSaleFragment.requireContext(), new o(campaignsSaleFragment)));
                            } else if (abstractC40959a instanceof AbstractC40959a.C11276a) {
                                com.avito.android.lib.util.g.a(a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, campaignsSaleFragment.requireContext(), new r(campaignsSaleFragment, abstractC40959a)));
                            } else if (abstractC40959a instanceof AbstractC40959a.b) {
                                com.avito.android.lib.util.g.a(a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, campaignsSaleFragment.requireContext(), new u(campaignsSaleFragment, abstractC40959a)));
                            }
                        } else if (bVar instanceof b.h) {
                            com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, campaignsSaleFragment.c1().f396761a.f396763a, ((b.h) bVar).f398749a, null, null, null, null, 6000, campaignsSaleFragment.c1().f396761a.f396764b, null, false, false, null, null, 3998);
                        } else {
                            if (bVar instanceof b.C11393b) {
                                com.avito.android.deeplink_handler.handler.composite.a aVar2 = campaignsSaleFragment.f113821t0;
                                if (aVar2 == null) {
                                    aVar2 = null;
                                }
                                b.a.a(aVar2, ((b.C11393b) bVar).f398742a, null, null, 6);
                            } else if (bVar instanceof b.g) {
                                com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, campaignsSaleFragment.c1().f396761a.f396763a, com.avito.android.printable_text.b.f(campaignsSaleFragment.getString(R.string.campaigns_sale_delete_toast_text)), null, Collections.singletonList(new c.a.C3719a(campaignsSaleFragment.getString(R.string.campaigns_sale_delete_toast_button_text), true, null, new C29297d(campaignsSaleFragment, bVar), 4, null)), null, null, 6000, campaignsSaleFragment.c1().f396761a.f396764b, null, false, false, null, null, 3994);
                            } else if (bVar instanceof b.c) {
                                Context context = campaignsSaleFragment.getContext();
                                if (context != null) {
                                    CampaignsSaleSearchActivity.a aVar3 = CampaignsSaleSearchActivity.f114472m;
                                    CampaignsSaleArguments campaignsSaleArguments = campaignsSaleFragment.f113824w0;
                                    CampaignsSaleSearchArguments campaignsSaleSearchArguments = new CampaignsSaleSearchArguments((campaignsSaleArguments != null ? campaignsSaleArguments : null).f114050b, campaignsSaleFragment.f113827z0);
                                    aVar3.getClass();
                                    C35966w1.d(campaignsSaleFragment, new Intent(context, (Class<?>) CampaignsSaleSearchActivity.class).putExtra("saleSearchData", campaignsSaleSearchArguments), 1);
                                }
                            } else if (bVar instanceof b.f) {
                                SK0.b bVar2 = campaignsSaleFragment.f113825x0;
                                b.a.a(bVar2 != null ? bVar2 : null, new C47415a(), null, null, null, 14);
                            } else if (L.f(bVar, b.d.f398744a)) {
                                z zVar = campaignsSaleFragment.f113826y0;
                                NestedScrollView nestedScrollView = (zVar != null ? zVar : null).f114463k;
                                nestedScrollView.p(nestedScrollView.getChildAt(0).getHeight());
                            }
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
                        return new C42801a(2, this.f113838b, CampaignsSaleFragment.class, "handle", "handle(Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(CampaignsSaleFragment campaignsSaleFragment, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f113837r = campaignsSaleFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new b(this.f113837r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f113836q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = CampaignsSaleFragment.f113813B0;
                        CampaignsSaleFragment campaignsSaleFragment = this.f113837r;
                        E eQ5 = campaignsSaleFragment.q5();
                        C3335a c3335a = new C3335a(campaignsSaleFragment);
                        this.f113836q = 1;
                        if (eQ5.ke(c3335a, this) == coroutine_suspended) {
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
            public a(CampaignsSaleFragment campaignsSaleFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f113832r = campaignsSaleFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f113832r, continuation);
                aVar.f113831q = obj;
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
                T t12 = (T) this.f113831q;
                CampaignsSaleFragment campaignsSaleFragment = this.f113832r;
                C43259k.d(t12, null, null, new C3333a(campaignsSaleFragment, null), 3);
                C43259k.d(t12, null, null, new b(campaignsSaleFragment, null), 3);
                return G0.f406611a;
            }
        }

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return CampaignsSaleFragment.this.new c(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f113829q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46681d;
                CampaignsSaleFragment campaignsSaleFragment = CampaignsSaleFragment.this;
                a aVar = new a(campaignsSaleFragment, null);
                this.f113829q = 1;
                if (C23056p0.b(campaignsSaleFragment, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: CampaignsSaleFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lim/a;", "it", "Lkotlin/G0;", "invoke", "(Lim/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<InterfaceC41424a, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC41424a interfaceC41424a) {
            a aVar = CampaignsSaleFragment.f113813B0;
            CampaignsSaleFragment.this.q5().accept(interfaceC41424a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f113840l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f113840l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f113840l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<Fragment> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return CampaignsSaleFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ f f113842l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.f113842l = fVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f113842l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f113843l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f113843l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f113843l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f113844l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f113844l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f113844l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: CampaignsSaleFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/campaigns_sale/E;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/campaigns_sale/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<E> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final E invoke() {
            F f12 = CampaignsSaleFragment.this.f113815n0;
            if (f12 == null) {
                f12 = null;
            }
            return (E) f12.get();
        }
    }

    public CampaignsSaleFragment() {
        super(0, 1, null);
        e eVar = new e(new j());
        f fVar = new f();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406616d;
        InterfaceC42726C interfaceC42726CB = C42727D.b(lazyThreadSafetyMode, new g(fVar));
        this.f113816o0 = new O0(m0.f406844a.b(E.class), new h(interfaceC42726CB), eVar, new i(interfaceC42726CB));
        this.f113818q0 = C42727D.b(lazyThreadSafetyMode, new b());
        this.f113827z0 = UUID.randomUUID().toString();
    }

    @Override // gj.i
    @Y61.l
    public final RecyclerView B0(@Y61.k String str) {
        if (!str.equals(m0())) {
            return null;
        }
        z zVar = this.f113826y0;
        return (zVar != null ? zVar : null).f114457e;
    }

    @Override // gj.i
    @Y61.l
    public final View b3(@Y61.k String str) {
        return B0(str);
    }

    @Override // gj.i
    @Y61.k
    public final gj.o c1() {
        z zVar = this.f113826y0;
        ViewGroup viewGroup = (zVar == null ? null : zVar).f114464l;
        ToastBarPosition toastBarPosition = ToastBarPosition.f181044b;
        o.a aVar = new o.a(viewGroup, toastBarPosition);
        if (zVar == null) {
            zVar = null;
        }
        return new gj.o(aVar, new o.a(zVar.f114464l, toastBarPosition));
    }

    @Override // gj.i
    @Y61.k
    public final String m0() {
        String str = this.f113814A0;
        return str == null ? "main" : str;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final Context m5(@Y61.k Context context, @Y61.l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onActivityResult(int i12, int i13, @Y61.l Intent intent) {
        super.onActivityResult(i12, i13, intent);
        if (i13 == -1 && i12 == 1) {
            q5().accept(InterfaceC41424a.n.f398730a);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f113823v0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return layoutInflater.inflate(R.layout.campaigns_sale_fragment, viewGroup, false);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((gj.k) this.f113818q0.getValue()).l(q5().f113847N);
        InterfaceC25659b interfaceC25659b = this.f113819r0;
        if (interfaceC25659b == null) {
            interfaceC25659b = null;
        }
        com.avito.android.beduin.common.component.adapter.a aVarI = com.avito.android.bxcontent.mvi.entity.f.i(24, interfaceC25659b);
        aVarI.f100611g = q5().f113847N.B0();
        ViewGroup viewGroup = (ViewGroup) view;
        ScreenPerformanceTracker screenPerformanceTracker = this.f113823v0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        com.avito.konveyor.adapter.d dVar = this.f113820s0;
        if (dVar == null) {
            dVar = null;
        }
        z zVar = new z(viewGroup, screenPerformanceTracker, aVarI, dVar);
        com.avito.android.beduin_shared.model.utils.b.c(q5().f113847N, this, zVar.f114470r);
        this.f113826y0 = zVar;
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new c(null), 3);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f113823v0;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        screenPerformanceTracker2.d();
        androidx.core.content.j jVarRequireActivity = requireActivity();
        x xVar = jVarRequireActivity instanceof x ? (x) jVarRequireActivity : null;
        if (xVar != null) {
            xVar.V0();
        }
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        com.avito.android.analytics.screens.F fA2 = D.a.a();
        g.a aVarA = com.avito.android.campaigns_sale.di.o.a();
        Bundle bundleRequireArguments = requireArguments();
        aVarA.a((CampaignsSaleArguments) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("saleData", CampaignsSaleArguments.class) : bundleRequireArguments.getParcelable("saleData")), new C28478k(CampaignsSaleScreen.f90310d, com.avito.android.analytics.screens.s.c(this), null, 4, null), new d(), this.f113827z0, getResources(), (com.avito.android.campaigns_sale.di.i) C29972i.a(C29972i.b(this), com.avito.android.campaigns_sale.di.i.class), cv.c.b(this), (InterfaceC30106l7) C29972i.a(C29972i.b(this), InterfaceC30106l7.class)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f113823v0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f113823v0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).c(this, g5());
    }

    public final E q5() {
        return (E) this.f113816o0.getValue();
    }

    @Override // gj.i
    public final void t0() {
        InterfaceC28373a interfaceC28373a = this.f113822u0;
        if (interfaceC28373a == null) {
            interfaceC28373a = null;
        }
        interfaceC28373a.c(new em.e(this.f113827z0));
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 != null) {
            activityC22955mL1.onBackPressed();
        }
    }
}
