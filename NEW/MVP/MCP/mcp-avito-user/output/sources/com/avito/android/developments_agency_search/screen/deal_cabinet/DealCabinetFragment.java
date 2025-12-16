package com.avito.android.developments_agency_search.screen.deal_cabinet;

import Cd.C13243a;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.view.C22981N;
import androidx.view.C22984Q;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.developments_agency_search.screen.deal_cabinet.return_to_work.ReturnToWorkDialog;
import com.avito.android.developments_agency_search.screen.deal_cabinet.return_to_work.model.ReturnToWorkArguments;
import com.avito.android.di.C29972i;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35968w3;
import com.avito.android.util.D6;
import com.avito.android.visual_rubricator.I;
import com.avito.android.visual_rubricator.element.VisualRubricatorWidgetElementItem;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.rx3.y;
import kv.C43501a;
import z1.AbstractC50339a;
import zw.b;
import zw.c;
import zw.e;

/* compiled from: DealCabinetFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_cabinet/DealCabinetFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DealCabinetFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.developments_agency_search.screen.deal_cabinet.o f136760n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f136761o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f136762p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f136763q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f136764r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.item_visibility_tracker.b f136765s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public com.avito.android.developments_agency_search.adapter.commission_promo_banner.d f136766t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public com.avito.android.developments_agency_search.adapter.horizontal_list.e f136767u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f136768v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public final C35968w3 f136769w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.developments_agency_search.screen.deal_cabinet.l f136770x0;

    /* renamed from: z0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f136759z0 = {m0.f406844a.e(new Y(DealCabinetFragment.class, "arguments", "getArguments()Lcom/avito/android/developments_agency_search/screen/deal_cabinet/DealCabinetArguments;", 0))};

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public static final a f136758y0 = new a(null);

    /* compiled from: DealCabinetFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_cabinet/DealCabinetFragment$a;", "", "<init>", "()V", "", "ITEM_VISIBILITY_TRACKER_STATE_KEY", "Ljava/lang/String;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: DealCabinetFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends C42801a implements Y41.l<zw.c, G0> {
        public final void a(@Y61.k zw.c cVar) {
            DealCabinetFragment dealCabinetFragment = (DealCabinetFragment) this.receiver;
            a aVar = DealCabinetFragment.f136758y0;
            dealCabinetFragment.getClass();
            if (cVar instanceof c.b) {
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = dealCabinetFragment.f136768v0;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                b.a.a(aVar2, ((c.b) cVar).f444375a, null, null, 6);
                G0 g02 = G0.f406611a;
                return;
            }
            if (cVar instanceof c.a) {
                ActivityC22955m activityC22955mL1 = dealCabinetFragment.l1();
                if (activityC22955mL1 != null) {
                    activityC22955mL1.onBackPressed();
                    G0 g03 = G0.f406611a;
                    return;
                }
                return;
            }
            if (cVar instanceof c.C12981c) {
                com.avito.android.lib.util.g.a(new com.avito.android.developments_agency_search.screen.single_selector_dialog.b(dealCabinetFragment.requireContext(), ((c.C12981c) cVar).f444376a, dealCabinetFragment.getString(R.string.das_deal_cabinet_client_list_filter_dialog_title), new com.avito.android.developments_agency_search.screen.deal_cabinet.e(dealCabinetFragment), false, false, null, 112, null));
                G0 g04 = G0.f406611a;
                return;
            }
            if (cVar instanceof c.d) {
                com.avito.android.lib.util.g.a(new com.avito.android.developments_agency_search.screen.single_selector_dialog.b(dealCabinetFragment.requireContext(), ((c.d) cVar).f444377a, dealCabinetFragment.getString(R.string.das_deal_cabinet_mortgage_list_filter_dialog_title), new com.avito.android.developments_agency_search.screen.deal_cabinet.f(dealCabinetFragment), false, false, null, 112, null));
                G0 g05 = G0.f406611a;
                return;
            }
            if (!(cVar instanceof c.e)) {
                throw new NoWhenBranchMatchedException();
            }
            ReturnToWorkDialog.a aVar3 = ReturnToWorkDialog.f137161l0;
            ReturnToWorkArguments returnToWorkArguments = ((c.e) cVar).f444378a;
            aVar3.getClass();
            ReturnToWorkDialog.a.a(returnToWorkArguments).show(dealCabinetFragment.getParentFragmentManager(), "returnToWorkDialog");
            G0 g06 = G0.f406611a;
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(zw.c cVar) {
            a(cVar);
            return G0.f406611a;
        }
    }

    /* compiled from: DealCabinetFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<zw.d, G0> {
        @Override // Y41.l
        public final G0 invoke(zw.d dVar) {
            DealCabinetFragment dealCabinetFragment = (DealCabinetFragment) this.receiver;
            a aVar = DealCabinetFragment.f136758y0;
            dealCabinetFragment.getClass();
            zw.e eVar = dVar.f444387h;
            if (eVar instanceof e.b) {
                com.avito.android.developments_agency_search.screen.deal_cabinet.l lVar = dealCabinetFragment.f136770x0;
                if (lVar != null) {
                    lVar.f136999i.k(null);
                    D6.w(lVar.f136997g);
                }
            } else if (eVar instanceof e.a) {
                com.avito.android.developments_agency_search.screen.deal_cabinet.l lVar2 = dealCabinetFragment.f136770x0;
                if (lVar2 != null) {
                    e.a aVar2 = (e.a) eVar;
                    lVar2.f136999i.j();
                    UV0.c cVar = new UV0.c(aVar2.f444388a);
                    lVar2.f136992b.c(cVar);
                    lVar2.f136994d.c(cVar);
                    lVar2.f136998h.post(new com.avito.android.app.coldstart.d(lVar2, 19));
                    lVar2.f136995e = aVar2.f444389b;
                    lVar2.a(true);
                }
                dealCabinetFragment.q5().accept(b.n.f444366a);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: DealCabinetFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<zw.b, G0> {
        @Override // Y41.l
        public final G0 invoke(zw.b bVar) {
            ((com.avito.android.developments_agency_search.screen.deal_cabinet.n) this.receiver).accept(bVar);
            return G0.f406611a;
        }
    }

    /* compiled from: DealCabinetFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "conditionUrl", "Lkotlin/G0;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.developments_agency_search.screen.deal_cabinet.DealCabinetFragment$onViewCreated$2", f = "DealCabinetFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Y41.p<String, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f136771q;

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            e eVar = DealCabinetFragment.this.new e(continuation);
            eVar.f136771q = obj;
            return eVar;
        }

        @Override // Y41.p
        public final Object invoke(String str, Continuation<? super G0> continuation) {
            return ((e) create(str, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            String str = (String) this.f136771q;
            a aVar = DealCabinetFragment.f136758y0;
            DealCabinetFragment.this.q5().accept(new b.r(str));
            return G0.f406611a;
        }
    }

    /* compiled from: DealCabinetFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "<anonymous>", "(V)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.developments_agency_search.screen.deal_cabinet.DealCabinetFragment$onViewCreated$3", f = "DealCabinetFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Y41.p<G0, Continuation<? super G0>, Object> {
        public f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return DealCabinetFragment.this.new f(continuation);
        }

        @Override // Y41.p
        public final Object invoke(G0 g02, Continuation<? super G0> continuation) {
            return ((f) create(g02, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            a aVar = DealCabinetFragment.f136758y0;
            DealCabinetFragment.this.q5().accept(b.e.f444354a);
            return G0.f406611a;
        }
    }

    /* compiled from: DealCabinetFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "id", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.l<String, G0> {
        public g() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            a aVar = DealCabinetFragment.f136758y0;
            DealCabinetFragment.this.q5().accept(new b.C12980b(str));
            return G0.f406611a;
        }
    }

    /* compiled from: DealCabinetFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "<anonymous parameter 0>", "Lkotlin/G0;", "<anonymous>", "(Lkv/a;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.developments_agency_search.screen.deal_cabinet.DealCabinetFragment$onViewCreated$5", f = "DealCabinetFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Y41.p<C43501a, Continuation<? super G0>, Object> {
        public h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return DealCabinetFragment.this.new h(continuation);
        }

        @Override // Y41.p
        public final Object invoke(C43501a c43501a, Continuation<? super G0> continuation) {
            return ((h) create(c43501a, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            a aVar = DealCabinetFragment.f136758y0;
            DealCabinetFragment.this.q5().accept(b.g.f444357a);
            return G0.f406611a;
        }
    }

    /* compiled from: DealCabinetFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lzw/b;", "action", "Lkotlin/G0;", "invoke", "(Lzw/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.l<zw.b, G0> {
        public i() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(zw.b bVar) {
            a aVar = DealCabinetFragment.f136758y0;
            DealCabinetFragment.this.q5().accept(bVar);
            return G0.f406611a;
        }
    }

    /* compiled from: DealCabinetFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/developments_agency_search/screen/deal_cabinet/DealCabinetFragment$j", "Lcom/avito/android/visual_rubricator/I;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class j implements I {
        public j() {
        }

        @Override // com.avito.android.visual_rubricator.I
        public final void k(@Y61.k VisualRubricatorWidgetElementItem visualRubricatorWidgetElementItem, @Y61.l Integer num) {
            a aVar = DealCabinetFragment.f136758y0;
            DealCabinetFragment dealCabinetFragment = DealCabinetFragment.this;
            dealCabinetFragment.q5().accept(new b.a(visualRubricatorWidgetElementItem.getF75424m()));
            com.avito.android.deeplink_handler.handler.composite.a aVar2 = dealCabinetFragment.f136768v0;
            if (aVar2 == null) {
                aVar2 = null;
            }
            b.a.a(aVar2, visualRubricatorWidgetElementItem.getF327362e(), null, null, 6);
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f136778l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Y41.a aVar) {
            super(0);
            this.f136778l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f136778l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<Fragment> {
        public l() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return DealCabinetFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l f136780l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(l lVar) {
            super(0);
            this.f136780l = lVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f136780l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f136781l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f136781l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f136781l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class o extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f136782l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f136782l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f136782l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: DealCabinetFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_cabinet/n;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/developments_agency_search/screen/deal_cabinet/n;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class p extends N implements Y41.a<com.avito.android.developments_agency_search.screen.deal_cabinet.n> {
        public p() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.developments_agency_search.screen.deal_cabinet.n invoke() {
            com.avito.android.developments_agency_search.screen.deal_cabinet.o oVar = DealCabinetFragment.this.f136760n0;
            if (oVar == null) {
                oVar = null;
            }
            return (com.avito.android.developments_agency_search.screen.deal_cabinet.n) oVar.get();
        }
    }

    public DealCabinetFragment() {
        super(0, 1, null);
        k kVar = new k(new p());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new m(new l()));
        this.f136761o0 = new O0(m0.f406844a.b(com.avito.android.developments_agency_search.screen.deal_cabinet.n.class), new n(interfaceC42726CB), kVar, new o(interfaceC42726CB));
        this.f136769w0 = new C35968w3(this);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f136762p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        getParentFragmentManager().p0("REQUEST_SHOW_RETURN_TO_WORK_DIALOG", this, new com.avito.android.beduin.ui.screen.fragment.bottom_sheet.c(this, 13));
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f136762p0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, q5(), new b(1, this, DealCabinetFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetOneTimeEvent;)Lkotlin/Unit;", 8), new c(1, this, DealCabinetFragment.class, "render", "render(Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetState;)V", 0));
        return layoutInflater.inflate(R.layout.fragment_deal_cabinet, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        com.avito.konveyor.item_visibility_tracker.b bVar = this.f136765s0;
        if (bVar == null) {
            bVar = null;
        }
        bundle.putBundle("item_visibility_tracker_state", bVar.d0());
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        com.avito.konveyor.adapter.j jVar = this.f136763q0;
        com.avito.konveyor.adapter.j jVar2 = jVar != null ? jVar : null;
        com.avito.konveyor.adapter.a aVar = this.f136764r0;
        com.avito.konveyor.adapter.a aVar2 = aVar != null ? aVar : null;
        d dVar = new d(1, q5(), com.avito.android.developments_agency_search.screen.deal_cabinet.n.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        com.avito.konveyor.item_visibility_tracker.b bVar = this.f136765s0;
        this.f136770x0 = new com.avito.android.developments_agency_search.screen.deal_cabinet.l(view, jVar2, aVar2, dVar, bVar != null ? bVar : null);
        com.avito.android.developments_agency_search.adapter.commission_promo_banner.d dVar2 = this.f136766t0;
        if (dVar2 == null) {
            dVar2 = null;
        }
        C43175k.K(new C43197r1(new e(null), dVar2.getF136254f()), C22981N.a(getLifecycle()));
        com.avito.android.developments_agency_search.adapter.commission_promo_banner.d dVar3 = this.f136766t0;
        if (dVar3 == null) {
            dVar3 = null;
        }
        C43175k.K(new C43197r1(new f(null), dVar3.getF136252d()), C22981N.a(getLifecycle()));
        com.avito.android.developments_agency_search.adapter.horizontal_list.e eVar = this.f136767u0;
        if (eVar == null) {
            eVar = null;
        }
        eVar.qc(new g());
        com.avito.android.deeplink_handler.handler.composite.a aVar3 = this.f136768v0;
        if (aVar3 == null) {
            aVar3 = null;
        }
        C43175k.K(new C43197r1(new h(null), y.a(aVar3.V9())), C22984Q.a(getViewLifecycleOwner()));
        ScreenPerformanceTracker screenPerformanceTracker = this.f136762p0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.developments_agency_search.screen.deal_cabinet.di.a.a().a((DealCabinetArguments) this.f136769w0.getValue(this, f136759z0[0]), (com.avito.android.developments_agency_search.screen.deal_cabinet.di.c) C29972i.a(C29972i.b(this), com.avito.android.developments_agency_search.screen.deal_cabinet.di.c.class), cv.c.b(this), (yO0.i) C29972i.a(C29972i.b(this), yO0.i.class), new i(), new j(), new C28478k(DealCabinetScreen.f136785d, s.c(this), null, 4, null), bundle != null ? bundle.getBundle("item_visibility_tracker_state") : null).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f136762p0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).a(fA2.b());
    }

    public final com.avito.android.developments_agency_search.screen.deal_cabinet.n q5() {
        return (com.avito.android.developments_agency_search.screen.deal_cabinet.n) this.f136761o0.getValue();
    }
}
