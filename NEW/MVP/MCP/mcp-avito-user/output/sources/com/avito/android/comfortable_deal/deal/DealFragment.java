package com.avito.android.comfortable_deal.deal;

import Cd.C13243a;
import Ep.InterfaceC13517a;
import Ep.b;
import Zp0.InterfaceC19587b;
import Zp0.InterfaceC19588c;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.C;
import androidx.fragment.app.Fragment;
import androidx.view.C19918B;
import androidx.view.C22981N;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import androidx.view.x;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.comfortable_deal.ComfortableDealScreen;
import com.avito.android.comfortable_deal.comment.CommentDialog;
import com.avito.android.comfortable_deal.comment.model.CommentArguments;
import com.avito.android.comfortable_deal.comment.model.CommentResult;
import com.avito.android.comfortable_deal.deal.DealFragment;
import com.avito.android.comfortable_deal.deal.item.callrecord.PlaySpeed;
import com.avito.android.comfortable_deal.deal.model.DealArguments;
import com.avito.android.comfortable_deal.deal.model.SpeedEntity;
import com.avito.android.comfortable_deal.end_deal.EndDealDialogFragment;
import com.avito.android.comfortable_deal.end_deal.model.EndDealArguments;
import com.avito.android.comfortable_deal.end_deal.model.EndDealResult;
import com.avito.android.comfortable_deal.phone_call.PhoneCallDialog;
import com.avito.android.comfortable_deal.phone_call.model.PhoneCallArguments;
import com.avito.android.comfortable_deal.save_dialog.SaveDialog;
import com.avito.android.comfortable_deal.save_dialog.model.SaveArguments;
import com.avito.android.comfortable_deal.select_agent.SelectAgentDialog;
import com.avito.android.comfortable_deal.select_agent.model.SelectAgentArguments;
import com.avito.android.comfortable_deal.stages_transition.StagesTransitionDialog;
import com.avito.android.comfortable_deal.stages_transition.model.StagesTransitionArguments;
import com.avito.android.comfortable_deal.stages_transition.model.StagesTransitionResult;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.toast_bar.state.ToastBarState;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.select.Arguments;
import com.avito.android.select.p;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35966w1;
import com.avito.android.util.D6;
import com.avito.android.util.G;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.AbstractC42738c;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kr.C43490a;
import wp.InterfaceC49662a;
import z1.AbstractC50339a;
import zN0.c;

/* compiled from: DealFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/DealFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "Lcom/avito/android/select/p;", "LzN0/c$c;", "<init>", "()V", "a", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DealFragment extends BaseFragment implements InterfaceC28477j.b, p, c.InterfaceC12952c {

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public static final a f120940y0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.comfortable_deal.deal.i f120941n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f120942o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f120943p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f120944q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f120945r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f120946s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public com.avito.android.comfortable_deal.deal.item.digitalregistration.big.c f120947t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.item_visibility_tracker.b f120948u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public InterfaceC49662a f120949v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.comfortable_deal.deal.g f120950w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f120951x0;

    /* compiled from: DealFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/DealFragment$a;", "", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: DealFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.comfortable_deal.deal.DealFragment$a$a, reason: collision with other inner class name */
        public static final class C3566a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ DealArguments f120952l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3566a(DealArguments dealArguments) {
                super(1);
                this.f120952l = dealArguments;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("deal_arguments", this.f120952l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static DealFragment a(@Y61.k DealArguments dealArguments) {
            DealFragment dealFragment = new DealFragment();
            C35966w1.a(dealFragment, -1, new C3566a(dealArguments));
            return dealFragment;
        }

        public a() {
        }
    }

    /* compiled from: DealFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/comfortable_deal/deal/model/DealArguments;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<DealArguments> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final DealArguments invoke() {
            Parcelable parcelable = DealFragment.this.requireArguments().getParcelable("deal_arguments");
            if (parcelable != null) {
                return (DealArguments) parcelable;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    /* compiled from: DealFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/activity/x;", "Lkotlin/G0;", "invoke", "(Landroidx/activity/x;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<x, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(x xVar) {
            a aVar = DealFragment.f120940y0;
            DealFragment.this.q5().accept(InterfaceC13517a.g.f4276a);
            return G0.f406611a;
        }
    }

    /* compiled from: DealFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<InterfaceC13517a, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC13517a interfaceC13517a) {
            ((com.avito.android.comfortable_deal.deal.h) this.receiver).accept(interfaceC13517a);
            return G0.f406611a;
        }
    }

    /* compiled from: DealFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<G0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = DealFragment.f120940y0;
            DealFragment.this.q5().accept(InterfaceC13517a.g.f4276a);
            return G0.f406611a;
        }
    }

    /* compiled from: DealFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<G0> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = DealFragment.f120940y0;
            DealFragment.this.q5().accept(InterfaceC13517a.s.f4291a);
            return G0.f406611a;
        }
    }

    /* compiled from: DealFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class g extends H implements Y41.l<Ep.b, G0> {
        public final void f(@Y61.k Ep.b bVar) {
            com.avito.android.comfortable_deal.deal.item.digitalregistration.small.dialog.a aVar;
            int i12 = 2;
            DealFragment dealFragment = (DealFragment) this.receiver;
            a aVar2 = DealFragment.f120940y0;
            dealFragment.getClass();
            if (bVar instanceof b.k) {
                StagesTransitionDialog.a aVar3 = StagesTransitionDialog.f122782m0;
                StagesTransitionArguments stagesTransitionArguments = ((b.k) bVar).f4310a;
                aVar3.getClass();
                StagesTransitionDialog.a.a(stagesTransitionArguments).show(dealFragment.getParentFragmentManager(), "stagesTransitionDialog");
                return;
            }
            if (bVar instanceof b.i) {
                com.avito.android.deeplink_handler.handler.composite.a aVar4 = dealFragment.f120944q0;
                if (aVar4 == null) {
                    aVar4 = null;
                }
                b.a.a(aVar4, ((b.i) bVar).f4308a, null, null, 6);
                return;
            }
            if (bVar instanceof b.C0259b) {
                com.avito.android.deeplink_handler.handler.composite.a aVar5 = dealFragment.f120944q0;
                if (aVar5 == null) {
                    aVar5 = null;
                }
                b.a.a(aVar5, ((b.C0259b) bVar).f4300a, null, null, 6);
                return;
            }
            if (bVar instanceof b.c) {
                PhoneCallDialog.a aVar6 = PhoneCallDialog.f122414m0;
                PhoneCallArguments phoneCallArguments = ((b.c) bVar).f4301a;
                aVar6.getClass();
                PhoneCallDialog.a.a(phoneCallArguments).show(dealFragment.getChildFragmentManager(), "phoneCallDialog");
                return;
            }
            if (bVar instanceof b.g) {
                SelectAgentDialog.a aVar7 = SelectAgentDialog.f122641l0;
                SelectAgentArguments selectAgentArguments = ((b.g) bVar).f4306a;
                aVar7.getClass();
                SelectAgentDialog.a.a(selectAgentArguments).show(dealFragment.getParentFragmentManager(), "selectAgentDialog");
                return;
            }
            if (bVar instanceof b.d) {
                CommentDialog.a aVar8 = CommentDialog.f120477l0;
                CommentArguments commentArguments = ((b.d) bVar).f4302a;
                aVar8.getClass();
                CommentDialog.a.a(commentArguments).show(dealFragment.getParentFragmentManager(), "commentDialog");
                return;
            }
            if (bVar instanceof b.f) {
                SaveDialog.a aVar9 = SaveDialog.f122629h0;
                SaveArguments saveArguments = ((b.f) bVar).f4305a;
                aVar9.getClass();
                SaveDialog.a.a(saveArguments).show(dealFragment.getParentFragmentManager(), "saveDialog");
                return;
            }
            if (bVar instanceof b.h) {
                String string = dealFragment.getString(R.string.stages_transition_play_speed);
                b.h hVar = (b.h) bVar;
                List list = PlaySpeed.f121204f;
                ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
                Iterator it = ((AbstractC42738c) list).iterator();
                while (it.hasNext()) {
                    arrayList.add(new SpeedEntity((PlaySpeed) it.next()));
                }
                com.avito.android.select.bottom_sheet.c.a(dealFragment, new Arguments(false, "speed_request", null, arrayList, Collections.singletonList(new SpeedEntity(hVar.f4307a)), string, null, false, false, false, false, false, false, false, false, null, false, null, null, null, null, false, false, false, false, false, false, false, null, null, null, false, false, null, false, false, false, 0, null, null, -134257851, 255, null)).show(dealFragment.getParentFragmentManager(), "speed_tag");
                return;
            }
            if (L.f(bVar, b.a.f4299a)) {
                if (dealFragment.getParentFragmentManager().L() > 0) {
                    dealFragment.getParentFragmentManager().Y();
                    return;
                } else {
                    dealFragment.requireActivity().finish();
                    return;
                }
            }
            if (bVar instanceof b.n) {
                C43490a.a(dealFragment.requireContext(), new ToastBarState(((b.n) bVar).f4314a, null, null, null, null, null, null, 0, false, false, null, null, 4094, null), null, 28);
                return;
            }
            if (bVar instanceof b.o) {
                com.avito.android.component.toast.c.c(com.avito.android.component.toast.c.f125244a, dealFragment, null, null, null, null, 0, null, 1022);
                return;
            }
            if (bVar instanceof b.e) {
                com.avito.android.comfortable_deal.deal.g gVar = dealFragment.f120950w0;
                if (gVar != null) {
                    b.e eVar = (b.e) bVar;
                    com.avito.android.comfortable_deal.deal.e eVar2 = new com.avito.android.comfortable_deal.deal.e(gVar, eVar.f4304b);
                    com.avito.android.comfortable_deal.deal.f fVar = new com.avito.android.comfortable_deal.deal.f(gVar);
                    Context context = gVar.f121079f;
                    String str = eVar.f4303a;
                    com.avito.android.comfortable_deal.deal.item.digitalregistration.small.dialog.a aVar10 = new com.avito.android.comfortable_deal.deal.item.digitalregistration.small.dialog.a(context, str, eVar2, fVar);
                    aVar10.setOnShowListener(new Da1.b(i12, gVar, str));
                    com.avito.android.lib.util.g.a(aVar10);
                    gVar.f121085l = aVar10;
                    return;
                }
                return;
            }
            if (bVar instanceof b.q) {
                com.avito.android.comfortable_deal.deal.g gVar2 = dealFragment.f120950w0;
                if (gVar2 != null) {
                    com.avito.android.comfortable_deal.deal.item.digitalregistration.small.dialog.a aVar11 = gVar2.f121085l;
                    if (aVar11 != null && aVar11.isShowing() && (aVar = gVar2.f121085l) != null) {
                        aVar.dismiss();
                    }
                    gVar2.f121085l = null;
                }
                b.q qVar = (b.q) bVar;
                com.avito.android.component.toast.c.c(com.avito.android.component.toast.c.f125244a, dealFragment, qVar.f4320a, null, null, null, 0, null, 1022);
                InterfaceC49662a interfaceC49662a = dealFragment.f120949v0;
                (interfaceC49662a != null ? interfaceC49662a : null).g(qVar.f4322c, qVar.f4321b, qVar.f4323d);
                return;
            }
            if (bVar instanceof b.p) {
                b.p pVar = (b.p) bVar;
                C43490a.a(dealFragment.requireContext(), new ToastBarState(pVar.f4316a, null, null, null, null, null, null, 0, false, false, null, null, 4094, null), null, 28);
                InterfaceC49662a interfaceC49662a2 = dealFragment.f120949v0;
                (interfaceC49662a2 != null ? interfaceC49662a2 : null).f(pVar.f4318c, pVar.f4317b, pVar.f4319d);
                return;
            }
            if (bVar instanceof b.l) {
                com.avito.android.deeplink_handler.handler.composite.a aVar12 = dealFragment.f120944q0;
                if (aVar12 == null) {
                    aVar12 = null;
                }
                b.l lVar = (b.l) bVar;
                b.a.a(aVar12, lVar.f4311a, null, lVar.f4312b, 2);
                return;
            }
            if (bVar instanceof b.m) {
                c.a.a(dealFragment);
            } else if (bVar instanceof b.j) {
                EndDealDialogFragment.a aVar13 = EndDealDialogFragment.f122033p0;
                EndDealArguments endDealArguments = ((b.j) bVar).f4309a;
                aVar13.getClass();
                EndDealDialogFragment.a.a(endDealArguments).show(dealFragment.getParentFragmentManager(), "endDealDialog");
            }
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(Ep.b bVar) {
            f(bVar);
            return G0.f406611a;
        }
    }

    /* compiled from: DealFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LEp/c;", "it", "Lkotlin/G0;", "invoke", "(LEp/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.l<Ep.c, G0> {
        public h() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Ep.c cVar) {
            a aVar = DealFragment.f120940y0;
            DealFragment dealFragment = DealFragment.this;
            Ep.d dVar = cVar.f4331h;
            if (dVar.f4341j) {
                com.avito.android.comfortable_deal.deal.g gVar = dealFragment.f120950w0;
                if (gVar != null) {
                    D6.w(gVar.f121081h);
                    D6.w(gVar.f121082i);
                    D6.H(gVar.f121083j);
                    G0 g02 = G0.f406611a;
                }
            } else if (dVar.f4340i) {
                com.avito.android.comfortable_deal.deal.g gVar2 = dealFragment.f120950w0;
                if (gVar2 != null) {
                    D6.H(gVar2.f121082i);
                    D6.w(gVar2.f121083j);
                    G0 g03 = G0.f406611a;
                }
            } else {
                UV0.c cVar2 = new UV0.c(dVar.f4343l);
                com.avito.konveyor.adapter.a aVar2 = dealFragment.f120946s0;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                aVar2.c(cVar2);
                com.avito.konveyor.item_visibility_tracker.b bVar = dealFragment.f120948u0;
                (bVar != null ? bVar : null).c(cVar2);
                com.avito.android.comfortable_deal.deal.g gVar3 = dealFragment.f120950w0;
                if (gVar3 != null) {
                    D6.H(gVar3.f121081h);
                    D6.w(gVar3.f121082i);
                    D6.w(gVar3.f121083j);
                }
                if (dVar.f4342k) {
                    com.avito.android.comfortable_deal.deal.g gVar4 = dealFragment.f120950w0;
                    if (gVar4 != null) {
                        Boolean bool = gVar4.f121086m;
                        Boolean bool2 = Boolean.TRUE;
                        if (!L.f(bool, bool2)) {
                            gVar4.f121074a.a(true);
                            gVar4.f121086m = bool2;
                        }
                        G0 g04 = G0.f406611a;
                    }
                } else {
                    com.avito.android.comfortable_deal.deal.g gVar5 = dealFragment.f120950w0;
                    if (gVar5 != null) {
                        Boolean bool3 = gVar5.f121086m;
                        Boolean bool4 = Boolean.FALSE;
                        if (!L.f(bool3, bool4)) {
                            gVar5.f121074a.a(false);
                            gVar5.f121086m = bool4;
                        }
                        G0 g05 = G0.f406611a;
                    }
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: DealFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LEp/a;", "it", "Lkotlin/G0;", "invoke", "(LEp/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.l<InterfaceC13517a, G0> {
        public i() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC13517a interfaceC13517a) {
            a aVar = DealFragment.f120940y0;
            DealFragment.this.q5().accept(interfaceC13517a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f120959l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Y41.a aVar) {
            super(0);
            this.f120959l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f120959l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<Fragment> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return DealFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ k f120961l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(k kVar) {
            super(0);
            this.f120961l = kVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f120961l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f120962l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f120962l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f120962l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f120963l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f120963l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f120963l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: DealFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/h;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/comfortable_deal/deal/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class o extends N implements Y41.a<com.avito.android.comfortable_deal.deal.h> {
        public o() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.comfortable_deal.deal.h invoke() {
            com.avito.android.comfortable_deal.deal.i iVar = DealFragment.this.f120941n0;
            if (iVar == null) {
                iVar = null;
            }
            return (com.avito.android.comfortable_deal.deal.h) iVar.get();
        }
    }

    public DealFragment() {
        super(0, 1, null);
        j jVar = new j(new o());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new l(new k()));
        this.f120942o0 = new O0(m0.f406844a.b(com.avito.android.comfortable_deal.deal.h.class), new m(interfaceC42726CB), jVar, new n(interfaceC42726CB));
        this.f120951x0 = C42727D.c(new b());
    }

    @Override // com.avito.android.select.p
    @Y61.l
    public final InterfaceC19588c<? super InterfaceC19587b> E4(@Y61.k Arguments arguments) {
        return null;
    }

    @Override // com.avito.android.ui.fragments.c
    public final boolean i0() {
        if (getParentFragmentManager().L() <= 0) {
            return false;
        }
        getParentFragmentManager().Y();
        return true;
    }

    @Override // com.avito.android.select.p
    public final void j(@Y61.k String str, @Y61.l String str2, @Y61.k List list) {
        SpeedEntity speedEntity;
        PlaySpeed playSpeed;
        if (str.equals("speed_request")) {
            Iterator it = list.iterator();
            do {
                speedEntity = null;
                if (!it.hasNext()) {
                    break;
                }
                ParcelableEntity parcelableEntity = (ParcelableEntity) it.next();
                if (parcelableEntity instanceof SpeedEntity) {
                    speedEntity = (SpeedEntity) parcelableEntity;
                }
            } while (speedEntity == null);
            if (speedEntity == null || (playSpeed = speedEntity.f121562b) == null) {
                return;
            }
            q5().accept(new InterfaceC13517a.A(playSpeed));
        }
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        C19918B.a(requireActivity().getF21241d(), this, new c(), 2);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f120943p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        View viewInflate = layoutInflater.inflate(R.layout.deal_layout, viewGroup, false);
        com.avito.konveyor.adapter.j jVar = this.f120945r0;
        com.avito.konveyor.adapter.j jVar2 = jVar != null ? jVar : null;
        com.avito.android.deeplink_handler.view.impl.i iVar = (com.avito.android.deeplink_handler.view.impl.i) e5();
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f120944q0;
        com.avito.android.deeplink_handler.handler.composite.a aVar2 = aVar != null ? aVar : null;
        d dVar = new d(1, q5(), com.avito.android.comfortable_deal.deal.h.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        InterfaceC49662a interfaceC49662a = this.f120949v0;
        InterfaceC49662a interfaceC49662a2 = interfaceC49662a != null ? interfaceC49662a : null;
        com.avito.konveyor.item_visibility_tracker.b bVar = this.f120948u0;
        com.avito.android.comfortable_deal.deal.g gVar = new com.avito.android.comfortable_deal.deal.g(viewInflate, jVar2, iVar, dVar, aVar2, interfaceC49662a2, bVar != null ? bVar : null, ((DealArguments) this.f120951x0.getValue()) instanceof DealArguments.DealIdArguments);
        gVar.f121080g.setNavigationOnClickListener(new com.avito.android.calltracking.item.m(16, new e()));
        gVar.f121084k.setOnClickListener(new com.avito.android.calltracking.item.m(17, new f()));
        this.f120950w0 = gVar;
        final int i12 = 0;
        getParentFragmentManager().p0("REQUEST_TRANSITION", this, new C(this) { // from class: com.avito.android.comfortable_deal.deal.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ DealFragment f120966c;

            {
                this.f120966c = this;
            }

            @Override // androidx.fragment.app.C
            public final void k(Bundle bundle2, String str) {
                DealFragment dealFragment = this.f120966c;
                switch (i12) {
                    case 0:
                        DealFragment.a aVar3 = DealFragment.f120940y0;
                        StagesTransitionDialog.f122782m0.getClass();
                        StagesTransitionResult stagesTransitionResult = (StagesTransitionResult) bundle2.getParcelable("result.key");
                        if (stagesTransitionResult != null) {
                            dealFragment.q5().accept(new InterfaceC13517a.B(stagesTransitionResult));
                            break;
                        }
                        break;
                    case 1:
                        DealFragment.a aVar4 = DealFragment.f120940y0;
                        EndDealDialogFragment.f122033p0.getClass();
                        EndDealResult endDealResult = (EndDealResult) bundle2.getParcelable("result.key");
                        if (endDealResult != null) {
                            dealFragment.q5().accept(new InterfaceC13517a.k(endDealResult));
                            break;
                        }
                        break;
                    case 2:
                        DealFragment.a aVar5 = DealFragment.f120940y0;
                        SaveDialog.f122629h0.getClass();
                        dealFragment.q5().accept(new InterfaceC13517a.v(bundle2.getBoolean("result.key", true)));
                        break;
                    case 3:
                        DealFragment.a aVar6 = DealFragment.f120940y0;
                        CommentDialog.f120477l0.getClass();
                        CommentResult commentResult = (CommentResult) bundle2.getParcelable("result.key");
                        if (commentResult != null) {
                            dealFragment.q5().accept(new InterfaceC13517a.j(commentResult));
                            break;
                        }
                        break;
                    case 4:
                        DealFragment.a aVar7 = DealFragment.f120940y0;
                        SaveDialog.f122629h0.getClass();
                        dealFragment.q5().accept(new InterfaceC13517a.u(bundle2.getBoolean("result.key", true)));
                        break;
                    default:
                        DealFragment.a aVar8 = DealFragment.f120940y0;
                        dealFragment.q5().accept(InterfaceC13517a.s.f4291a);
                        break;
                }
            }
        });
        final int i13 = 1;
        getParentFragmentManager().p0("REQUEST_SOLD_TRANSITION", this, new C(this) { // from class: com.avito.android.comfortable_deal.deal.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ DealFragment f120966c;

            {
                this.f120966c = this;
            }

            @Override // androidx.fragment.app.C
            public final void k(Bundle bundle2, String str) {
                DealFragment dealFragment = this.f120966c;
                switch (i13) {
                    case 0:
                        DealFragment.a aVar3 = DealFragment.f120940y0;
                        StagesTransitionDialog.f122782m0.getClass();
                        StagesTransitionResult stagesTransitionResult = (StagesTransitionResult) bundle2.getParcelable("result.key");
                        if (stagesTransitionResult != null) {
                            dealFragment.q5().accept(new InterfaceC13517a.B(stagesTransitionResult));
                            break;
                        }
                        break;
                    case 1:
                        DealFragment.a aVar4 = DealFragment.f120940y0;
                        EndDealDialogFragment.f122033p0.getClass();
                        EndDealResult endDealResult = (EndDealResult) bundle2.getParcelable("result.key");
                        if (endDealResult != null) {
                            dealFragment.q5().accept(new InterfaceC13517a.k(endDealResult));
                            break;
                        }
                        break;
                    case 2:
                        DealFragment.a aVar5 = DealFragment.f120940y0;
                        SaveDialog.f122629h0.getClass();
                        dealFragment.q5().accept(new InterfaceC13517a.v(bundle2.getBoolean("result.key", true)));
                        break;
                    case 3:
                        DealFragment.a aVar6 = DealFragment.f120940y0;
                        CommentDialog.f120477l0.getClass();
                        CommentResult commentResult = (CommentResult) bundle2.getParcelable("result.key");
                        if (commentResult != null) {
                            dealFragment.q5().accept(new InterfaceC13517a.j(commentResult));
                            break;
                        }
                        break;
                    case 4:
                        DealFragment.a aVar7 = DealFragment.f120940y0;
                        SaveDialog.f122629h0.getClass();
                        dealFragment.q5().accept(new InterfaceC13517a.u(bundle2.getBoolean("result.key", true)));
                        break;
                    default:
                        DealFragment.a aVar8 = DealFragment.f120940y0;
                        dealFragment.q5().accept(InterfaceC13517a.s.f4291a);
                        break;
                }
            }
        });
        final int i14 = 2;
        getParentFragmentManager().p0("REQUEST_SAVE_TRANSITION_DATA", this, new C(this) { // from class: com.avito.android.comfortable_deal.deal.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ DealFragment f120966c;

            {
                this.f120966c = this;
            }

            @Override // androidx.fragment.app.C
            public final void k(Bundle bundle2, String str) {
                DealFragment dealFragment = this.f120966c;
                switch (i14) {
                    case 0:
                        DealFragment.a aVar3 = DealFragment.f120940y0;
                        StagesTransitionDialog.f122782m0.getClass();
                        StagesTransitionResult stagesTransitionResult = (StagesTransitionResult) bundle2.getParcelable("result.key");
                        if (stagesTransitionResult != null) {
                            dealFragment.q5().accept(new InterfaceC13517a.B(stagesTransitionResult));
                            break;
                        }
                        break;
                    case 1:
                        DealFragment.a aVar4 = DealFragment.f120940y0;
                        EndDealDialogFragment.f122033p0.getClass();
                        EndDealResult endDealResult = (EndDealResult) bundle2.getParcelable("result.key");
                        if (endDealResult != null) {
                            dealFragment.q5().accept(new InterfaceC13517a.k(endDealResult));
                            break;
                        }
                        break;
                    case 2:
                        DealFragment.a aVar5 = DealFragment.f120940y0;
                        SaveDialog.f122629h0.getClass();
                        dealFragment.q5().accept(new InterfaceC13517a.v(bundle2.getBoolean("result.key", true)));
                        break;
                    case 3:
                        DealFragment.a aVar6 = DealFragment.f120940y0;
                        CommentDialog.f120477l0.getClass();
                        CommentResult commentResult = (CommentResult) bundle2.getParcelable("result.key");
                        if (commentResult != null) {
                            dealFragment.q5().accept(new InterfaceC13517a.j(commentResult));
                            break;
                        }
                        break;
                    case 4:
                        DealFragment.a aVar7 = DealFragment.f120940y0;
                        SaveDialog.f122629h0.getClass();
                        dealFragment.q5().accept(new InterfaceC13517a.u(bundle2.getBoolean("result.key", true)));
                        break;
                    default:
                        DealFragment.a aVar8 = DealFragment.f120940y0;
                        dealFragment.q5().accept(InterfaceC13517a.s.f4291a);
                        break;
                }
            }
        });
        final int i15 = 3;
        getParentFragmentManager().p0("REQUEST_ADD_COMMENT", this, new C(this) { // from class: com.avito.android.comfortable_deal.deal.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ DealFragment f120966c;

            {
                this.f120966c = this;
            }

            @Override // androidx.fragment.app.C
            public final void k(Bundle bundle2, String str) {
                DealFragment dealFragment = this.f120966c;
                switch (i15) {
                    case 0:
                        DealFragment.a aVar3 = DealFragment.f120940y0;
                        StagesTransitionDialog.f122782m0.getClass();
                        StagesTransitionResult stagesTransitionResult = (StagesTransitionResult) bundle2.getParcelable("result.key");
                        if (stagesTransitionResult != null) {
                            dealFragment.q5().accept(new InterfaceC13517a.B(stagesTransitionResult));
                            break;
                        }
                        break;
                    case 1:
                        DealFragment.a aVar4 = DealFragment.f120940y0;
                        EndDealDialogFragment.f122033p0.getClass();
                        EndDealResult endDealResult = (EndDealResult) bundle2.getParcelable("result.key");
                        if (endDealResult != null) {
                            dealFragment.q5().accept(new InterfaceC13517a.k(endDealResult));
                            break;
                        }
                        break;
                    case 2:
                        DealFragment.a aVar5 = DealFragment.f120940y0;
                        SaveDialog.f122629h0.getClass();
                        dealFragment.q5().accept(new InterfaceC13517a.v(bundle2.getBoolean("result.key", true)));
                        break;
                    case 3:
                        DealFragment.a aVar6 = DealFragment.f120940y0;
                        CommentDialog.f120477l0.getClass();
                        CommentResult commentResult = (CommentResult) bundle2.getParcelable("result.key");
                        if (commentResult != null) {
                            dealFragment.q5().accept(new InterfaceC13517a.j(commentResult));
                            break;
                        }
                        break;
                    case 4:
                        DealFragment.a aVar7 = DealFragment.f120940y0;
                        SaveDialog.f122629h0.getClass();
                        dealFragment.q5().accept(new InterfaceC13517a.u(bundle2.getBoolean("result.key", true)));
                        break;
                    default:
                        DealFragment.a aVar8 = DealFragment.f120940y0;
                        dealFragment.q5().accept(InterfaceC13517a.s.f4291a);
                        break;
                }
            }
        });
        final int i16 = 4;
        getParentFragmentManager().p0("REQUEST_SAVE_COMMENT", this, new C(this) { // from class: com.avito.android.comfortable_deal.deal.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ DealFragment f120966c;

            {
                this.f120966c = this;
            }

            @Override // androidx.fragment.app.C
            public final void k(Bundle bundle2, String str) {
                DealFragment dealFragment = this.f120966c;
                switch (i16) {
                    case 0:
                        DealFragment.a aVar3 = DealFragment.f120940y0;
                        StagesTransitionDialog.f122782m0.getClass();
                        StagesTransitionResult stagesTransitionResult = (StagesTransitionResult) bundle2.getParcelable("result.key");
                        if (stagesTransitionResult != null) {
                            dealFragment.q5().accept(new InterfaceC13517a.B(stagesTransitionResult));
                            break;
                        }
                        break;
                    case 1:
                        DealFragment.a aVar4 = DealFragment.f120940y0;
                        EndDealDialogFragment.f122033p0.getClass();
                        EndDealResult endDealResult = (EndDealResult) bundle2.getParcelable("result.key");
                        if (endDealResult != null) {
                            dealFragment.q5().accept(new InterfaceC13517a.k(endDealResult));
                            break;
                        }
                        break;
                    case 2:
                        DealFragment.a aVar5 = DealFragment.f120940y0;
                        SaveDialog.f122629h0.getClass();
                        dealFragment.q5().accept(new InterfaceC13517a.v(bundle2.getBoolean("result.key", true)));
                        break;
                    case 3:
                        DealFragment.a aVar6 = DealFragment.f120940y0;
                        CommentDialog.f120477l0.getClass();
                        CommentResult commentResult = (CommentResult) bundle2.getParcelable("result.key");
                        if (commentResult != null) {
                            dealFragment.q5().accept(new InterfaceC13517a.j(commentResult));
                            break;
                        }
                        break;
                    case 4:
                        DealFragment.a aVar7 = DealFragment.f120940y0;
                        SaveDialog.f122629h0.getClass();
                        dealFragment.q5().accept(new InterfaceC13517a.u(bundle2.getBoolean("result.key", true)));
                        break;
                    default:
                        DealFragment.a aVar8 = DealFragment.f120940y0;
                        dealFragment.q5().accept(InterfaceC13517a.s.f4291a);
                        break;
                }
            }
        });
        final int i17 = 5;
        getParentFragmentManager().p0("REQUEST_SELECT_AGENT", this, new C(this) { // from class: com.avito.android.comfortable_deal.deal.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ DealFragment f120966c;

            {
                this.f120966c = this;
            }

            @Override // androidx.fragment.app.C
            public final void k(Bundle bundle2, String str) {
                DealFragment dealFragment = this.f120966c;
                switch (i17) {
                    case 0:
                        DealFragment.a aVar3 = DealFragment.f120940y0;
                        StagesTransitionDialog.f122782m0.getClass();
                        StagesTransitionResult stagesTransitionResult = (StagesTransitionResult) bundle2.getParcelable("result.key");
                        if (stagesTransitionResult != null) {
                            dealFragment.q5().accept(new InterfaceC13517a.B(stagesTransitionResult));
                            break;
                        }
                        break;
                    case 1:
                        DealFragment.a aVar4 = DealFragment.f120940y0;
                        EndDealDialogFragment.f122033p0.getClass();
                        EndDealResult endDealResult = (EndDealResult) bundle2.getParcelable("result.key");
                        if (endDealResult != null) {
                            dealFragment.q5().accept(new InterfaceC13517a.k(endDealResult));
                            break;
                        }
                        break;
                    case 2:
                        DealFragment.a aVar5 = DealFragment.f120940y0;
                        SaveDialog.f122629h0.getClass();
                        dealFragment.q5().accept(new InterfaceC13517a.v(bundle2.getBoolean("result.key", true)));
                        break;
                    case 3:
                        DealFragment.a aVar6 = DealFragment.f120940y0;
                        CommentDialog.f120477l0.getClass();
                        CommentResult commentResult = (CommentResult) bundle2.getParcelable("result.key");
                        if (commentResult != null) {
                            dealFragment.q5().accept(new InterfaceC13517a.j(commentResult));
                            break;
                        }
                        break;
                    case 4:
                        DealFragment.a aVar7 = DealFragment.f120940y0;
                        SaveDialog.f122629h0.getClass();
                        dealFragment.q5().accept(new InterfaceC13517a.u(bundle2.getBoolean("result.key", true)));
                        break;
                    default:
                        DealFragment.a aVar8 = DealFragment.f120940y0;
                        dealFragment.q5().accept(InterfaceC13517a.s.f4291a);
                        break;
                }
            }
        });
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f120943p0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, q5(), new g(1, this, DealFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealOneTimeEvent;)V", 0), new h());
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f120950w0 = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        com.avito.android.comfortable_deal.deal.item.digitalregistration.big.c cVar = this.f120947t0;
        if (cVar == null) {
            cVar = null;
        }
        G.c(bundle, "recall_banner_state", cVar.d0());
        com.avito.konveyor.item_visibility_tracker.b bVar = this.f120948u0;
        bundle.putBundle("visibility_tracker_state", (bVar != null ? bVar : null).d0());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        q5().accept(InterfaceC13517a.l.f4281a);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        q5().accept(InterfaceC13517a.m.f4282a);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f120943p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.comfortable_deal.deal.di.a.a().a((com.avito.android.comfortable_deal.deal.di.j) C29972i.a(C29972i.b(this), com.avito.android.comfortable_deal.deal.di.j.class), cv.c.b(this), new C28478k(ComfortableDealScreen.f119744d, s.c(this), null, 4, null), C22981N.a(getLifecycle()), (DealArguments) this.f120951x0.getValue(), new i(), bundle != null ? G.a(bundle, "recall_banner_state") : null, bundle != null ? bundle.getBundle("visibility_tracker_state") : null).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f120943p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f120943p0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).c(this, g5());
    }

    public final com.avito.android.comfortable_deal.deal.h q5() {
        return (com.avito.android.comfortable_deal.deal.h) this.f120942o0.getValue();
    }

    @Override // com.avito.android.select.p
    public final void q(@Y61.k String str) {
    }

    @Override // com.avito.android.select.p
    public final void s3(@Y61.k String str) {
    }
}
