package com.avito.android.seller_coach.hints_dialog.view;

import Cd.C13243a;
import Gq0.C13908a;
import Iq0.C14145b;
import Iq0.C14147d;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22969B;
import androidx.view.InterfaceC23040h0;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.MyAdvertLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.modal.a;
import com.avito.android.progress_overlay.l;
import com.avito.android.remote.model.AdviceDetail;
import com.avito.android.remote.model.MenuAction;
import com.avito.android.search.filter.adapter.select.m;
import com.avito.android.seller_coach.hints_dialog.item.hint.d;
import com.avito.android.seller_coach.hints_dialog.view.h;
import com.avito.android.seller_coach.hints_dialog.vm.h;
import java.util.Iterator;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC43072x;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: HintItemsDialog.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/seller_coach/hints_dialog/view/c;", "Lcom/avito/android/seller_coach/hints_dialog/view/h;", "_avito_seller-coach_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c extends com.avito.android.seller_coach.hints_dialog.view.h {

    /* renamed from: V, reason: collision with root package name */
    public static final /* synthetic */ int f267553V = 0;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final Fragment f267554E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.k
    public final C13908a f267555F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.k
    public final h.c f267556G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.seller_coach.hints_dialog.provider.b f267557H;

    /* renamed from: I, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f267558I;

    /* renamed from: J, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f267559J;

    /* renamed from: K, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f267560K;

    /* renamed from: L, reason: collision with root package name */
    @Inject
    public Set<TV0.d<?, ?>> f267561L;

    /* renamed from: M, reason: collision with root package name */
    @Inject
    public com.avito.android.seller_coach.hints_dialog.vm.e f267562M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final O0 f267563N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final l f267564O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final View f267565P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f267566Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final ScrollView f267567R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public final ImageView f267568S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f267569T;

    /* renamed from: U, reason: collision with root package name */
    @Y61.k
    public final b f267570U;

    /* compiled from: HintItemsDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            int i12 = c.f267553V;
            c cVar = c.this;
            cVar.V().ke();
            cVar.dismiss();
            return G0.f406611a;
        }
    }

    /* compiled from: HintItemsDialog.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/seller_coach/hints_dialog/view/c$b", "Lcom/avito/android/seller_coach/hints_dialog/item/hint/d$a;", "_avito_seller-coach_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements d.a {
        public b() {
        }

        @Override // com.avito.android.seller_coach.hints_dialog.item.hint.d.a
        public final void a(@Y61.k com.avito.android.seller_coach.hints_dialog.item.hint.a aVar) {
            Bundle bundle;
            if (aVar.f267489f != null) {
                int i12 = c.f267553V;
                c cVar = c.this;
                com.avito.android.seller_coach.hints_dialog.vm.a aVarV = cVar.V();
                AdviceDetail adviceDetail = aVarV.f267596N;
                if (adviceDetail != null) {
                    String str = aVar.f267485b;
                    com.avito.android.seller_coach.hints_dialog.vm.a.oe(aVarV, str, null, 2);
                    aVarV.f267593K.c(new C14147d(adviceDetail.getTitle(), adviceDetail.getAdviceId(), str, aVarV.f267597O));
                }
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = cVar.f267558I;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                DeepLink deepLink = aVar.f267489f;
                if (deepLink instanceof MyAdvertLink.Edit) {
                    bundle = new Bundle();
                    bundle.putParcelable("up_intent", null);
                } else {
                    bundle = null;
                }
                b.a.a(aVar2, deepLink, null, bundle, 2);
                cVar.r();
            }
        }

        @Override // com.avito.android.seller_coach.hints_dialog.item.hint.d.a
        public final void s1() {
            c.this.r();
        }
    }

    /* compiled from: HintItemsDialog.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/seller_coach/hints_dialog/vm/h;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/seller_coach/hints_dialog/vm/h;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.seller_coach.hints_dialog.view.c$c, reason: collision with other inner class name */
    public static final class C7993c extends N implements Y41.l<com.avito.android.seller_coach.hints_dialog.vm.h, G0> {
        public C7993c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(com.avito.android.seller_coach.hints_dialog.vm.h hVar) {
            com.avito.android.seller_coach.hints_dialog.vm.h hVar2 = hVar;
            boolean z12 = hVar2 instanceof h.b;
            c cVar = c.this;
            l lVar = cVar.f267564O;
            if (z12) {
                h.b bVar = (h.b) hVar2;
                if (!lVar.d()) {
                    lVar.j();
                    boolean z13 = bVar.f267619b != null;
                    cVar.f267566Q.setVisibility(!z13 ? 0 : 8);
                    cVar.f267567R.setVisibility(z13 ? 0 : 8);
                    com.avito.android.seller_coach.hints_dialog.vm.g gVar = bVar.f267619b;
                    if (gVar != null) {
                        View view = cVar.f267565P;
                        View viewFindViewById = view.findViewById(R.id.tv_simple_hint_title);
                        if (viewFindViewById == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                        }
                        ((TextView) viewFindViewById).setText(gVar.f267612a);
                        View viewFindViewById2 = view.findViewById(R.id.tv_simple_hint_description);
                        if (viewFindViewById2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                        }
                        ((TextView) viewFindViewById2).setText(Html.fromHtml(gVar.f267613b, 63));
                        View viewFindViewById3 = view.findViewById(R.id.btn_simple_hint);
                        if (viewFindViewById3 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
                        }
                        Button button = (Button) viewFindViewById3;
                        button.setText(gVar.f267614c);
                        button.setOnClickListener(new m(8, cVar, gVar));
                    } else {
                        com.avito.konveyor.adapter.a aVar = cVar.f267560K;
                        (aVar != null ? aVar : null).c(new UV0.c(bVar.f267618a));
                    }
                    cVar.f267568S.setVisibility((bVar.f267620c && cVar.f267555F.f6749c) ? 0 : 8);
                }
            } else if (hVar2 instanceof h.c) {
                lVar.k(null);
            } else if (hVar2 instanceof h.a) {
                lVar.a(((h.a) hVar2).f267616a);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: HintItemsDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.g {
        public d() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            int i12 = c.f267553V;
            c.this.V().ne();
        }
    }

    /* compiled from: HintItemsDialog.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e implements InterfaceC23040h0, D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l f267575b;

        public e(Y41.l lVar) {
            this.f267575b = lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC23040h0) && (obj instanceof D)) {
                return L.f(this.f267575b, ((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f267575b;
        }

        public final int hashCode() {
            return this.f267575b.hashCode();
        }

        @Override // androidx.view.InterfaceC23040h0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f267575b.invoke(obj);
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f267576l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f267576l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f267576l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<Fragment> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Fragment f267577l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f267577l = fragment;
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return this.f267577l;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f267578l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f267578l = gVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return this.f267578l.f267577l;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f267579l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f267579l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f267579l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f267580l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f267580l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f267580l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: HintItemsDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/seller_coach/hints_dialog/vm/a;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/seller_coach/hints_dialog/vm/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<com.avito.android.seller_coach.hints_dialog.vm.a> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.seller_coach.hints_dialog.vm.a invoke() {
            com.avito.android.seller_coach.hints_dialog.vm.e eVar = c.this.f267562M;
            if (eVar == null) {
                eVar = null;
            }
            return (com.avito.android.seller_coach.hints_dialog.vm.a) eVar.get();
        }
    }

    public c(@Y61.k Fragment fragment, @Y61.k C13908a c13908a, @Y61.k h.c cVar, @Y61.k com.avito.android.seller_coach.hints_dialog.provider.b bVar) {
        super(fragment.requireContext(), 0, 2, null);
        this.f267554E = fragment;
        this.f267555F = c13908a;
        this.f267556G = cVar;
        this.f267557H = bVar;
        f fVar = new f(new k());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new h(new g(fragment)));
        this.f267563N = new O0(m0.f406844a.b(com.avito.android.seller_coach.hints_dialog.vm.a.class), new i(interfaceC42726CB), fVar, new j(interfaceC42726CB));
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.seller_coach_hint_dialog, (ViewGroup) null);
        this.f267565P = viewInflate;
        View viewFindViewById = viewInflate.findViewById(R.id.rv_advice_details);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        this.f267566Q = (RecyclerView) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.sv_simple_advice_details);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ScrollView");
        }
        this.f267567R = (ScrollView) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(R.id.iv_content_advice_close);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        ImageView imageView = (ImageView) viewFindViewById3;
        View viewFindViewById4 = viewInflate.findViewById(R.id.iv_content_advice_menu);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        ImageView imageView2 = (ImageView) viewFindViewById4;
        this.f267568S = imageView2;
        this.f267569T = new io.reactivex.rxjava3.disposables.c();
        View viewFindViewById5 = viewInflate.findViewById(R.id.fl_root_advice_details);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f267564O = new l((ViewGroup) viewFindViewById5, R.id.fl_content_advice_details, null, 0, 0, 28, null);
        final int i12 = 1;
        G(viewInflate, true);
        com.avito.android.lib.design.bottom_sheet.j.c(this, null, false, 0, 0, 0, 121);
        com.avito.android.lib.design.bottom_sheet.d.I(this, true);
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.seller_coach.hints_dialog.view.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ c f267551c;

            {
                this.f267551c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.avito.android.seller_coach.hints_dialog.vm.f fVar2;
                c cVar2 = this.f267551c;
                switch (i12) {
                    case 0:
                        int i13 = c.f267553V;
                        com.avito.android.seller_coach.hints_dialog.vm.a aVarV = cVar2.V();
                        MenuAction menuActionMe = com.avito.android.seller_coach.hints_dialog.vm.a.me(aVarV.f267596N);
                        if (menuActionMe == null) {
                            fVar2 = null;
                        } else {
                            com.avito.android.seller_coach.hints_dialog.vm.f fVar3 = new com.avito.android.seller_coach.hints_dialog.vm.f(menuActionMe.getButtonText(), menuActionMe.getDescription());
                            AdviceDetail adviceDetail = aVarV.f267596N;
                            if (adviceDetail != null) {
                                aVarV.f267593K.c(new C14145b(adviceDetail.getTitle(), adviceDetail.getAdviceId(), aVarV.f267597O, com.avito.android.seller_coach.hints_dialog.vm.a.le(adviceDetail)));
                            }
                            fVar2 = fVar3;
                        }
                        if (fVar2 != null) {
                            com.avito.android.lib.util.g.a(a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, cVar2.getContext(), new f(fVar2.f267611b, fVar2.f267610a, cVar2)));
                            break;
                        }
                        break;
                    default:
                        int i14 = c.f267553V;
                        cVar2.r();
                        break;
                }
            }
        });
        final int i13 = 0;
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.seller_coach.hints_dialog.view.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ c f267551c;

            {
                this.f267551c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.avito.android.seller_coach.hints_dialog.vm.f fVar2;
                c cVar2 = this.f267551c;
                switch (i13) {
                    case 0:
                        int i132 = c.f267553V;
                        com.avito.android.seller_coach.hints_dialog.vm.a aVarV = cVar2.V();
                        MenuAction menuActionMe = com.avito.android.seller_coach.hints_dialog.vm.a.me(aVarV.f267596N);
                        if (menuActionMe == null) {
                            fVar2 = null;
                        } else {
                            com.avito.android.seller_coach.hints_dialog.vm.f fVar3 = new com.avito.android.seller_coach.hints_dialog.vm.f(menuActionMe.getButtonText(), menuActionMe.getDescription());
                            AdviceDetail adviceDetail = aVarV.f267596N;
                            if (adviceDetail != null) {
                                aVarV.f267593K.c(new C14145b(adviceDetail.getTitle(), adviceDetail.getAdviceId(), aVarV.f267597O, com.avito.android.seller_coach.hints_dialog.vm.a.le(adviceDetail)));
                            }
                            fVar2 = fVar3;
                        }
                        if (fVar2 != null) {
                            com.avito.android.lib.util.g.a(a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, cVar2.getContext(), new f(fVar2.f267611b, fVar2.f267610a, cVar2)));
                            break;
                        }
                        break;
                    default:
                        int i14 = c.f267553V;
                        cVar2.r();
                        break;
                }
            }
        });
        setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.avito.android.seller_coach.hints_dialog.view.b
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                int i14 = c.f267553V;
                c cVar2 = this.f267552b;
                cVar2.V().ke();
                cVar2.dismiss();
            }
        });
        R(new a());
        this.f267570U = new b();
    }

    public final com.avito.android.seller_coach.hints_dialog.vm.a V() {
        return (com.avito.android.seller_coach.hints_dialog.vm.a) this.f267563N.getValue();
    }

    @Override // com.avito.android.lib.design.bottom_sheet.d, androidx.appcompat.app.A, androidx.view.r, android.app.Dialog
    public final void onCreate(@Y61.l Bundle bundle) {
        this.f267557H.b(this);
        super.onCreate(bundle);
        com.avito.android.seller_coach.hints_dialog.vm.a aVarV = V();
        C13908a c13908a = this.f267555F;
        String str = c13908a.f6747a;
        String str2 = c13908a.f6748b;
        aVarV.f267600R = str;
        aVarV.f267597O = str2;
        aVarV.f267601S = this.f267556G;
        com.avito.konveyor.adapter.j jVar = this.f267559J;
        if (jVar == null) {
            jVar = null;
        }
        this.f267566Q.setAdapter(jVar);
        Set<TV0.d<?, ?>> set = this.f267561L;
        Iterator<T> it = (set != null ? set : null).iterator();
        while (it.hasNext()) {
            TV0.d dVar = (TV0.d) it.next();
            boolean z12 = dVar instanceof com.avito.android.seller_coach.hints_dialog.item.hint.d;
            b bVar = this.f267570U;
            if (z12) {
                ((com.avito.android.seller_coach.hints_dialog.item.hint.d) dVar).D0(bVar);
            }
            if (dVar instanceof com.avito.android.seller_coach.hints_dialog.item.empty_hints.d) {
                ((com.avito.android.seller_coach.hints_dialog.item.empty_hints.d) dVar).D0(bVar);
            }
        }
        V().f267602T.observe(this.f267554E.getViewLifecycleOwner(), new e(new C7993c()));
        this.f267569T.b(this.f267564O.e().t0(new d()));
        V().ne();
    }

    @Override // com.avito.android.lib.design.bottom_sheet.d, android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f267569T.e();
        super.onDetachedFromWindow();
    }
}
