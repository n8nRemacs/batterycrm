package com.avito.android.developments_agency_search.screen.deal_room;

import Cd.C13243a;
import Cw.C13364c;
import Cw.InterfaceC13362a;
import Cw.InterfaceC13363b;
import Cw.d;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.H;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.adjust.sdk.network.ErrorCodes;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.developments_agency_search.screen.deal_room.model.DealRoomArguments;
import com.avito.android.developments_agency_search.screen.deal_room_development.DealRoomDevelopmentArguments;
import com.avito.android.developments_agency_search.screen.deal_room_development.DealRoomDevelopmentFragment;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35968w3;
import com.avito.android.util.N0;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;
import zN0.c;

/* compiled from: DealRoomFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/DealRoomFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "LzN0/c$c;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DealRoomFragment extends BaseFragment implements c.InterfaceC12952c, InterfaceC28477j.b {

    /* renamed from: A0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f137221A0 = {m0.f406844a.e(new Y(DealRoomFragment.class, "arguments", "getArguments()Lcom/avito/android/developments_agency_search/screen/deal_room/model/DealRoomArguments;", 0))};

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public static final a f137222z0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public w f137223n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f137224o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f137225p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f137226q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f137227r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public com.avito.android.developments_agency_search.screen.deal_room.adapter.note.d f137228s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public final C35968w3 f137229t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.developments_agency_search.screen.deal_room.notes.a f137230u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.developments_agency_search.screen.deal_room.edit_client.a f137231v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f137232w0;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public x f137233x0;

    /* renamed from: y0, reason: collision with root package name */
    public androidx.view.result.h<G0> f137234y0;

    /* compiled from: DealRoomFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/DealRoomFragment$a;", "", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: DealRoomFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/u;", "invoke", "()Lcom/avito/android/developments_agency_search/screen/deal_room/u;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<u> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final u invoke() {
            DealRoomFragment dealRoomFragment = DealRoomFragment.this;
            View viewRequireView = dealRoomFragment.requireView();
            com.avito.konveyor.adapter.d dVar = dealRoomFragment.f137226q0;
            if (dVar == null) {
                dVar = null;
            }
            return new u(viewRequireView, new m(1, dealRoomFragment.q5(), v.class, "accept", "accept(Ljava/lang/Object;)V", 0), dVar, L.f(((DealRoomArguments) dealRoomFragment.f137229t0.getValue(dealRoomFragment, DealRoomFragment.f137221A0[0])).getF137569d(), "virtual_deal_room"));
        }
    }

    /* compiled from: DealRoomFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends C42801a implements Y41.l<InterfaceC13363b, G0> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.internal.w] */
        /* JADX WARN: Type inference failed for: r3v1, types: [androidx.activity.result.h] */
        /* JADX WARN: Type inference failed for: r3v2 */
        public final void a(@Y61.k InterfaceC13363b interfaceC13363b) {
            com.avito.android.component.toast.f fVarB;
            final int i12 = 1;
            final int i13 = 0;
            final DealRoomFragment dealRoomFragment = (DealRoomFragment) this.receiver;
            a aVar = DealRoomFragment.f137222z0;
            dealRoomFragment.getClass();
            if (interfaceC13363b instanceof InterfaceC13363b.a) {
                ActivityC22955m activityC22955mL1 = dealRoomFragment.l1();
                if (activityC22955mL1 != null) {
                    activityC22955mL1.onBackPressed();
                    G0 g02 = G0.f406611a;
                    return;
                }
                return;
            }
            if (interfaceC13363b instanceof InterfaceC13363b.InterfaceC0133b) {
                InterfaceC13363b.InterfaceC0133b interfaceC0133b = (InterfaceC13363b.InterfaceC0133b) interfaceC13363b;
                if (interfaceC0133b instanceof InterfaceC13363b.InterfaceC0133b.c) {
                    com.avito.android.developments_agency_search.screen.deal_room.notes.a aVar2 = new com.avito.android.developments_agency_search.screen.deal_room.notes.a(dealRoomFragment.requireContext(), ((InterfaceC13363b.InterfaceC0133b.c) interfaceC0133b).f2763a, new n(dealRoomFragment), new o(dealRoomFragment));
                    com.avito.android.lib.util.g.a(aVar2);
                    aVar2.s();
                    aVar2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.avito.android.developments_agency_search.screen.deal_room.l
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            switch (i13) {
                                case 0:
                                    dealRoomFragment.f137230u0 = null;
                                    break;
                                default:
                                    dealRoomFragment.f137231v0 = null;
                                    break;
                            }
                        }
                    });
                    dealRoomFragment.f137230u0 = aVar2;
                    G0 g03 = G0.f406611a;
                    return;
                }
                if (interfaceC0133b instanceof InterfaceC13363b.InterfaceC0133b.a) {
                    N0.a(dealRoomFragment.f137230u0);
                    G0 g04 = G0.f406611a;
                    return;
                }
                if (interfaceC0133b instanceof InterfaceC13363b.InterfaceC0133b.d) {
                    com.avito.android.developments_agency_search.screen.deal_room.notes.a aVar3 = dealRoomFragment.f137230u0;
                    if (aVar3 != null) {
                        com.avito.android.component.toast.c.d(com.avito.android.component.toast.c.f125244a, aVar3, ((InterfaceC13363b.InterfaceC0133b.d) interfaceC0133b).f2764a, null, f.a.f125253a, 0, ToastBarPosition.f181046d, 814);
                        return;
                    }
                    return;
                }
                if (!(interfaceC0133b instanceof InterfaceC13363b.InterfaceC0133b.C0134b)) {
                    throw new NoWhenBranchMatchedException();
                }
                com.avito.android.developments_agency_search.screen.deal_room.notes.a aVar4 = dealRoomFragment.f137230u0;
                if (aVar4 != null) {
                    ((Button) aVar4.findViewById(R.id.save_button)).setLoading(((InterfaceC13363b.InterfaceC0133b.C0134b) interfaceC0133b).f2762a);
                    G0 g05 = G0.f406611a;
                    return;
                }
                return;
            }
            if (interfaceC13363b instanceof InterfaceC13363b.c) {
                InterfaceC13363b.c cVar = (InterfaceC13363b.c) interfaceC13363b;
                if (cVar instanceof InterfaceC13363b.c.C0136c) {
                    InterfaceC13363b.c.C0136c c0136c = (InterfaceC13363b.c.C0136c) cVar;
                    com.avito.android.developments_agency_search.screen.deal_room.edit_client.a aVar5 = new com.avito.android.developments_agency_search.screen.deal_room.edit_client.a(dealRoomFragment.requireContext(), c0136c.f2767a, c0136c.f2768b, new p(dealRoomFragment), new q(dealRoomFragment));
                    com.avito.android.lib.util.g.a(aVar5);
                    aVar5.s();
                    aVar5.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.avito.android.developments_agency_search.screen.deal_room.l
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            switch (i12) {
                                case 0:
                                    dealRoomFragment.f137230u0 = null;
                                    break;
                                default:
                                    dealRoomFragment.f137231v0 = null;
                                    break;
                            }
                        }
                    });
                    dealRoomFragment.f137231v0 = aVar5;
                    G0 g06 = G0.f406611a;
                    return;
                }
                if (cVar instanceof InterfaceC13363b.c.a) {
                    N0.a(dealRoomFragment.f137231v0);
                    G0 g07 = G0.f406611a;
                    return;
                }
                if (cVar instanceof InterfaceC13363b.c.C0135b) {
                    com.avito.android.developments_agency_search.screen.deal_room.edit_client.a aVar6 = dealRoomFragment.f137231v0;
                    if (aVar6 != null) {
                        UU.a aVarA = UU.a.a(aVar6.f137539N, null, false, ((InterfaceC13363b.c.C0135b) cVar).f2766a, false, null, 1015);
                        aVar6.f137539N = aVarA;
                        Button button = aVar6.f137540O;
                        (button != null ? button : null).setState(aVarA);
                        G0 g08 = G0.f406611a;
                        return;
                    }
                    return;
                }
                if (!(cVar instanceof InterfaceC13363b.c.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                com.avito.android.developments_agency_search.screen.deal_room.edit_client.a aVar7 = dealRoomFragment.f137231v0;
                if (aVar7 != null) {
                    com.avito.android.component.toast.c cVar2 = com.avito.android.component.toast.c.f125244a;
                    f.c.f125255c.getClass();
                    com.avito.android.component.toast.c.d(cVar2, aVar7, ((InterfaceC13363b.c.d) cVar).f2769a, null, f.c.a.b(), 0, ToastBarPosition.f181046d, 814);
                    return;
                }
                return;
            }
            if (interfaceC13363b instanceof InterfaceC13363b.d) {
                com.avito.android.deeplink_handler.handler.composite.a aVar8 = dealRoomFragment.f137227r0;
                if (aVar8 == null) {
                    aVar8 = null;
                }
                b.a.a(aVar8, ((InterfaceC13363b.d) interfaceC13363b).f2770a, null, null, 6);
                G0 g09 = G0.f406611a;
                return;
            }
            if (interfaceC13363b instanceof InterfaceC13363b.h) {
                InterfaceC13363b.h hVar = (InterfaceC13363b.h) interfaceC13363b;
                if (hVar.f2775a) {
                    f.c.f125255c.getClass();
                    fVarB = f.c.a.b();
                } else {
                    fVarB = f.a.f125253a;
                }
                com.avito.android.component.toast.c.c(com.avito.android.component.toast.c.f125244a, dealRoomFragment, hVar.f2776b, null, null, fVarB, 0, null, ErrorCodes.SSL_HANDSHAKE_EXCEPTION);
                return;
            }
            if (interfaceC13363b instanceof InterfaceC13363b.f) {
                DealRoomDevelopmentFragment.a aVar9 = DealRoomDevelopmentFragment.f137823w0;
                InterfaceC13363b.f fVar = (InterfaceC13363b.f) interfaceC13363b;
                DealRoomDevelopmentArguments dealRoomDevelopmentArguments = new DealRoomDevelopmentArguments(fVar.f2772a, fVar.f2773b);
                aVar9.getClass();
                DealRoomDevelopmentFragment dealRoomDevelopmentFragment = new DealRoomDevelopmentFragment();
                dealRoomDevelopmentFragment.f137832u0.setValue(dealRoomDevelopmentFragment, DealRoomDevelopmentFragment.f137824x0[0], dealRoomDevelopmentArguments);
                H hE2 = dealRoomFragment.requireActivity().getSupportFragmentManager().e();
                hE2.j(((com.avito.android.ui.activity.a) dealRoomFragment.requireActivity()).L1(), dealRoomDevelopmentFragment, null, 1);
                hE2.c(null);
                hE2.e();
                G0 g010 = G0.f406611a;
                return;
            }
            if (interfaceC13363b instanceof InterfaceC13363b.g) {
                androidx.view.result.h<G0> hVar2 = dealRoomFragment.f137234y0;
                (hVar2 != null ? hVar2 : 0).b(G0.f406611a);
            } else {
                if (!(interfaceC13363b instanceof InterfaceC13363b.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(dealRoomFragment.requireContext(), i13, 2, );
                com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 7);
                dVar.setContentView(R.layout.dialog_agency_commission_tooltip);
                ((TextView) dVar.findViewById(R.id.tooltip_text)).setText(((InterfaceC13363b.e) interfaceC13363b).f2771a);
                com.avito.android.lib.util.g.a(dVar);
                G0 g011 = G0.f406611a;
            }
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(InterfaceC13363b interfaceC13363b) {
            a(interfaceC13363b);
            return G0.f406611a;
        }
    }

    /* compiled from: DealRoomFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends kotlin.jvm.internal.H implements Y41.l<C13364c, G0> {
        @Override // Y41.l
        public final G0 invoke(C13364c c13364c) {
            DealRoomFragment dealRoomFragment = (DealRoomFragment) this.receiver;
            a aVar = DealRoomFragment.f137222z0;
            dealRoomFragment.getClass();
            Cw.d dVar = c13364c.f2784g;
            boolean z12 = dVar instanceof d.b;
            InterfaceC42726C interfaceC42726C = dealRoomFragment.f137232w0;
            if (z12) {
                ((t) interfaceC42726C.getValue()).a(((DealRoomArguments) dealRoomFragment.f137229t0.getValue(dealRoomFragment, DealRoomFragment.f137221A0[0])).getF137568c());
            } else if (dVar instanceof d.a) {
                ((t) interfaceC42726C.getValue()).c((d.a) dVar);
            } else if (dVar instanceof d.c) {
                ((t) interfaceC42726C.getValue()).b();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: DealRoomFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "<anonymous parameter 0>", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<String, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            a aVar = DealRoomFragment.f137222z0;
            DealRoomFragment.this.q5().accept(InterfaceC13362a.g.f2747a);
            return G0.f406611a;
        }
    }

    /* compiled from: DealRoomFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LCw/a;", "action", "Lkotlin/G0;", "invoke", "(LCw/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<InterfaceC13362a, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC13362a interfaceC13362a) {
            a aVar = DealRoomFragment.f137222z0;
            DealRoomFragment.this.q5().accept(interfaceC13362a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f137238l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Y41.a aVar) {
            super(0);
            this.f137238l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f137238l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<Fragment> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return DealRoomFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ h f137240l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(h hVar) {
            super(0);
            this.f137240l = hVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f137240l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f137241l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f137241l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f137241l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f137242l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f137242l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f137242l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: DealRoomFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/v;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/developments_agency_search/screen/deal_room/v;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<v> {
        public l() {
            super(0);
        }

        @Override // Y41.a
        public final v invoke() {
            w wVar = DealRoomFragment.this.f137223n0;
            if (wVar == null) {
                wVar = null;
            }
            return (v) wVar.get();
        }
    }

    public DealRoomFragment() {
        super(0, 1, null);
        g gVar = new g(new l());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new i(new h()));
        this.f137224o0 = new O0(m0.f406844a.b(v.class), new j(interfaceC42726CB), gVar, new k(interfaceC42726CB));
        this.f137229t0 = new C35968w3(this);
        this.f137232w0 = C42727D.c(new b());
    }

    @Override // com.avito.android.ui.fragments.c
    public final boolean i0() {
        if (requireActivity().getSupportFragmentManager().L() <= 0) {
            return false;
        }
        requireActivity().getSupportFragmentManager().Y();
        return true;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        x xVar = this.f137233x0;
        if (xVar == null) {
            xVar = null;
        }
        this.f137234y0 = registerForActivityResult(xVar, new L91.o(this, 17));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f137225p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f137225p0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, q5(), new c(1, this, DealRoomFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomOneTimeEvent;)Ljava/lang/Object;", 8), new d(1, this, DealRoomFragment.class, "render", "render(Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomState;)V", 0));
        return layoutInflater.inflate(R.layout.developments_agency_search_deal_room, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        com.avito.android.developments_agency_search.screen.deal_room.adapter.note.d dVar = this.f137228s0;
        if (dVar == null) {
            dVar = null;
        }
        dVar.e4(new e());
        ScreenPerformanceTracker screenPerformanceTracker = this.f137225p0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        C28478k c28478k = new C28478k(DealRoomScreen.f137244d, com.avito.android.analytics.screens.s.c(this), null, 4, null);
        com.avito.android.developments_agency_search.screen.deal_room.di.a.a().a((DealRoomArguments) this.f137229t0.getValue(this, f137221A0[0]), c28478k, new f(), (com.avito.android.developments_agency_search.screen.deal_room.di.c) C29972i.a(C29972i.b(this), com.avito.android.developments_agency_search.screen.deal_room.di.c.class), cv.c.b(this), requireContext()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f137225p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final v q5() {
        return (v) this.f137224o0.getValue();
    }
}
