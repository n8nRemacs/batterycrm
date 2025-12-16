package com.avito.android.publish.screen.objects.view;

import Ge0.InterfaceC13872a;
import Ge0.d;
import Ge0.f;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.C23503n;
import androidx.transition.Q;
import com.avito.android.Q1;
import com.avito.android.R;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.lib.design.shadow_layout.ShadowFrameLayout;
import com.avito.android.publish.ActionMode;
import com.avito.android.publish.C33862g0;
import com.avito.android.publish.details.InterfaceC33778p;
import com.avito.android.publish.details.RunnableC33786s;
import com.avito.android.publish.objects.N0;
import com.avito.android.util.A6;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.K2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ObjectFillFormView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/objects/view/m;", "Lcom/avito/android/publish/screen/objects/view/g;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class m implements com.avito.android.publish.screen.objects.view.g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f240358a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.recycler.data_aware.c f240359b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC13872a, G0> f240360c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f240361d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Q1 f240362e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f240363f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Context f240364g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.progress_overlay.l f240365h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.progress_overlay.l f240366i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.details.auto_description.k f240367j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final C33862g0 f240368k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public l f240369l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public N0 f240370m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f240371n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final LinearLayoutManager f240372o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public j f240373p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public com.avito.android.publish.view.e f240374q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.tooltip.k f240375r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public com.avito.android.publish.imv.c f240376s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public f.d f240377t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.l
    public Boolean f240378u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.l
    public f.b.c f240379v;

    /* compiled from: ObjectFillFormView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ActionMode.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ActionMode actionMode = ActionMode.f231832b;
                iArr[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: ObjectFillFormView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/publish/screen/objects/view/m$b", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f240381c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f240382d;

        public b(int i12, boolean z12) {
            this.f240381c = i12;
            this.f240382d = z12;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            m mVar = m.this;
            A6.b(mVar.f240371n.getViewTreeObserver(), this);
            mVar.f(this.f240381c, this.f240382d);
        }
    }

    /* compiled from: ObjectFillFormView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/publish/screen/objects/view/m$c", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends RecyclerView.r {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f240384c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f240385d;

        public c(int i12, boolean z12) {
            this.f240384c = i12;
            this.f240385d = z12;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void k(@Y61.k RecyclerView recyclerView, int i12, int i13) {
            m mVar = m.this;
            mVar.f240371n.v0(this);
            LinearLayoutManager linearLayoutManager = mVar.f240372o;
            int i14 = this.f240384c;
            View viewZ = linearLayoutManager.Z(i14);
            if (viewZ == null) {
                return;
            }
            if (this.f240385d) {
                viewZ.addOnLayoutChangeListener(new n(viewZ, mVar, viewZ, i14));
            } else {
                mVar.g(viewZ, i14);
            }
        }
    }

    /* compiled from: ObjectFillFormView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            m.this.f240360c.invoke(new InterfaceC13872a.c(true));
            return G0.f406611a;
        }
    }

    /* compiled from: ObjectFillFormView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<G0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            m.this.f240360c.invoke(new InterfaceC13872a.c(false, 1, null));
            return G0.f406611a;
        }
    }

    /* compiled from: ObjectFillFormView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<G0> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            m.this.f240360c.invoke(InterfaceC13872a.f.f6635a);
            return G0.f406611a;
        }
    }

    /* compiled from: ObjectFillFormView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<G0> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            m.this.f240360c.invoke(new InterfaceC13872a.c(false, 1, null));
            return G0.f406611a;
        }
    }

    /* compiled from: ObjectFillFormView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final h f240390l = new h();

        public h() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    /* compiled from: ObjectFillFormView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<G0> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            m.this.f240360c.invoke(new InterfaceC13872a.c(false, 1, null));
            return G0.f406611a;
        }
    }

    /* compiled from: ObjectFillFormView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/publish/screen/objects/view/m$j", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class j extends RecyclerView.r {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ N f240392b;

        /* JADX WARN: Multi-variable type inference failed */
        public j(Y41.a<G0> aVar) {
            this.f240392b = (N) aVar;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void i(int i12, @Y61.k RecyclerView recyclerView) {
            if (i12 == 1) {
                this.f240392b.invoke();
            }
        }
    }

    public m() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m(ViewGroup viewGroup, RecyclerView.Adapter adapter, com.avito.android.recycler.data_aware.c cVar, Y41.l lVar, InterfaceC28373a interfaceC28373a, Q1 q12, u3.l lVar2, boolean z12, boolean z13, boolean z14, long j12, com.avito.android.publish.slots.images_groups_recommendations.analytics.d dVar, int i12, C42822w c42822w) {
        boolean z15 = (i12 & 256) != 0 ? false : z13;
        boolean z16 = (i12 & 512) != 0 ? true : z14;
        long j13 = (i12 & 1024) != 0 ? 500L : j12;
        com.avito.android.publish.slots.images_groups_recommendations.analytics.d dVar2 = (i12 & 2048) != 0 ? null : dVar;
        this.f240358a = viewGroup;
        this.f240359b = cVar;
        this.f240360c = lVar;
        this.f240361d = interfaceC28373a;
        this.f240362e = q12;
        this.f240363f = z12;
        Context context = viewGroup.getContext();
        this.f240364g = context;
        View viewFindViewById = viewGroup.findViewById(R.id.publish_root);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        com.avito.android.publish.slots.images_groups_recommendations.analytics.d dVar3 = dVar2;
        com.avito.android.progress_overlay.l lVar3 = new com.avito.android.progress_overlay.l((ViewGroup) viewFindViewById, R.id.recycler_view, interfaceC28373a, R.layout.publish_progress_overlay, 0, 16, null);
        this.f240365h = lVar3;
        View viewFindViewById2 = viewGroup.findViewById(R.id.publish_root);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f240366i = new com.avito.android.progress_overlay.l((ViewGroup) viewFindViewById2, 0, interfaceC28373a, R.layout.publish_progress_overlay_black, C35835l0.d(R.attr.transparentBlack, context), 2, null);
        View viewFindViewById3 = viewGroup.findViewById(R.id.publish_root);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f240367j = new com.avito.android.publish.details.auto_description.k((ViewGroup) viewFindViewById3, R.id.recycler_view, interfaceC28373a);
        C33862g0 c33862g0 = new C33862g0(viewGroup.getRootView(), Boolean.valueOf(z15));
        this.f240368k = c33862g0;
        View viewFindViewById4 = viewGroup.findViewById(R.id.recycler_view);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById4;
        this.f240371n = recyclerView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        this.f240372o = linearLayoutManager;
        if (((SimpleTestGroupWithNone) lVar2.f439745a.f439749b).b()) {
            c33862g0.c(C35835l0.j(R.attr.ic_close24, context));
            h(z12 ? ActionMode.f231835e : ActionMode.f231836f);
        } else {
            c33862g0.c(C35835l0.j(R.attr.ic_arrowBack24, context));
            h(ActionMode.f231836f);
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        RecyclerView.j itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.f53829c = j13;
        }
        RecyclerView.j itemAnimator2 = recyclerView.getItemAnimator();
        if (itemAnimator2 != null) {
            itemAnimator2.f53832f = j13;
        }
        View viewFindViewById5 = viewGroup.findViewById(R.id.publish_root);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        recyclerView.o(new com.avito.android.publish.view.p((FrameLayout) viewFindViewById5));
        if (z16) {
            recyclerView.l(new com.avito.android.blueprints.publish.header.a(recyclerView.getResources()), -1);
        }
        recyclerView.setAdapter(adapter);
        if (dVar3 != null) {
            com.avito.android.publish.slots.images_groups_recommendations.analytics.a aVar = new com.avito.android.publish.slots.images_groups_recommendations.analytics.a(recyclerView, dVar3);
            recyclerView.o(aVar);
            recyclerView.m(aVar);
        }
        lVar3.f231600j = new q(this);
    }

    @Override // com.avito.android.publish.screen.objects.view.actions.d
    public final void W() {
        K2.d(this.f240358a, true);
    }

    @Override // com.avito.android.publish.screen.objects.view.actions.d
    public final void a(@Y61.k Y41.a<G0> aVar) {
        j jVar = new j(aVar);
        this.f240371n.o(jVar);
        this.f240373p = jVar;
    }

    @Override // com.avito.android.publish.screen.objects.view.actions.d
    public final void b() {
        j jVar = this.f240373p;
        if (jVar != null) {
            this.f240371n.v0(jVar);
        }
        this.f240373p = null;
    }

    @Override // com.avito.android.publish.screen.objects.view.g
    public final void c(@Y61.k Ge0.f fVar) {
        this.f240359b.c(fVar.f6689c);
        f.d dVar = this.f240377t;
        f.c cVar = fVar.f6688b;
        f.d dVar2 = cVar.f6691a;
        if (!new com.avito.android.lib.util.c(dVar2, dVar).f181333c && dVar2 != null) {
            boolean z12 = dVar2 instanceof f.d.b;
            com.avito.android.progress_overlay.l lVar = this.f240365h;
            if (z12) {
                lVar.j();
            } else if (dVar2 instanceof f.d.a) {
                lVar.a("");
            } else if (dVar2 instanceof f.d.c) {
                lVar.k(null);
            }
            this.f240377t = dVar2;
        }
        f.b.c cVar2 = this.f240379v;
        f.b.c cVar3 = cVar.f6692b;
        if (!new com.avito.android.lib.util.c(cVar3, cVar2).f181333c && cVar3 != null) {
            this.f240367j.j();
            d(true);
            this.f240379v = cVar3;
        }
        Boolean bool = this.f240378u;
        boolean z13 = cVar.f6693c;
        Boolean boolValueOf = Boolean.valueOf(z13);
        if (!new com.avito.android.lib.util.c(boolValueOf, bool).f181333c) {
            com.avito.android.progress_overlay.l lVar2 = this.f240366i;
            if (z13) {
                lVar2.k(null);
            } else {
                lVar2.j();
            }
            this.f240378u = boolValueOf;
        }
        String str = cVar.f6694d;
        if (str == null) {
            str = "";
        }
        this.f240368k.f236022a.setNavigationTitle(str);
        com.avito.android.publish.view.e eVar = this.f240374q;
        RecyclerView recyclerView = this.f240371n;
        if (eVar != null) {
            recyclerView.v0(eVar);
        }
        if (this.f240374q == null) {
            this.f240374q = new com.avito.android.publish.view.e(new p(this));
        }
        com.avito.android.publish.view.e eVar2 = this.f240374q;
        if (eVar2 != null) {
            recyclerView.o(eVar2);
        }
        com.avito.android.publish.imv.a aVar = cVar.f6695e;
        if (aVar != null) {
            com.avito.android.publish.imv.c cVar4 = this.f240376s;
            if (cVar4 == null) {
                cVar4 = new com.avito.android.publish.imv.c(this.f240364g);
                this.f240376s = cVar4;
                N0 n02 = this.f240370m;
                if (n02 != null) {
                    ShadowFrameLayout shadowFrameLayout = cVar4.f236063b;
                    n02.f237525d = shadowFrameLayout;
                    n02.f237522a.addView(shadowFrameLayout, new FrameLayout.LayoutParams(-1, -2, 80));
                    n02.a(shadowFrameLayout, n02.f237523b, n02.f237524c);
                }
            }
            cVar4.a(aVar, new o(this));
        }
        boolean z14 = cVar.f6696f && aVar != null;
        N0 n03 = this.f240370m;
        if (n03 != null) {
            n03.f237524c = z14;
            ShadowFrameLayout shadowFrameLayout2 = n03.f237525d;
            if (shadowFrameLayout2 != null) {
                n03.a(shadowFrameLayout2, n03.f237523b, z14);
            }
        }
    }

    public final void d(boolean z12) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = this.f240358a;
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getRootView().findViewById(R.id.app_bar);
        if (viewGroup3 == null || (viewGroup = (ViewGroup) viewGroup2.getRootView().findViewById(R.id.footer)) == null) {
            return;
        }
        ViewGroup viewGroup4 = (ViewGroup) viewGroup2.getRootView();
        C23503n c23503n = new C23503n();
        c23503n.f54670g.add(viewGroup3);
        c23503n.f54670g.add(viewGroup);
        Q.a(viewGroup4, c23503n);
        if (z12) {
            D6.H(viewGroup3);
            D6.H(viewGroup);
        } else {
            D6.g(viewGroup3);
            D6.w(viewGroup);
        }
    }

    public final void e(@Y61.k Ge0.d dVar) {
        if (dVar instanceof d.h) {
            ((d.h) dVar).getClass();
            this.f240368k.d(null);
            return;
        }
        if (dVar instanceof d.j) {
            ((d.j) dVar).getClass();
            throw null;
        }
        if (dVar instanceof d.w) {
            d.w wVar = (d.w) dVar;
            com.avito.android.lib.design.tooltip.k kVar = this.f240375r;
            if (kVar != null) {
                kVar.dismiss();
            }
            this.f240375r = null;
            wVar.getClass();
            return;
        }
        boolean z12 = dVar instanceof d.a;
        ViewGroup viewGroup = this.f240358a;
        if (z12) {
            K2.d(viewGroup, true);
            return;
        }
        if (dVar instanceof d.t) {
            com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
            ((d.t) dVar).getClass();
            com.avito.android.component.toast.c.b(cVar, this.f240358a, com.avito.android.printable_text.b.f(null), null, null, null, null, 0, null, null, false, false, null, null, 4094);
            return;
        }
        if (dVar instanceof d.g) {
            ((d.g) dVar).getClass();
            com.avito.android.user_address.e.b(viewGroup, null, null, null);
            return;
        }
        if (dVar instanceof d.f) {
            d.f fVar = (d.f) dVar;
            f(fVar.f6671a, fVar.f6672b);
            return;
        }
        l lVar = this.f240369l;
        if (lVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        boolean z13 = dVar instanceof d.v;
        InterfaceC33778p interfaceC33778p = lVar.f240352e;
        if (z13) {
            ((d.v) dVar).getClass();
            interfaceC33778p.i(null);
        } else if (dVar instanceof d.o) {
            interfaceC33778p.j3(((d.o) dVar).f6680a);
        } else if (dVar instanceof d.p) {
            k kVar2 = new k(lVar);
            ((d.p) dVar).getClass();
            interfaceC33778p.l(null, null, kVar2);
        }
    }

    public final void f(int i12, boolean z12) {
        if (i12 >= 0) {
            LinearLayoutManager linearLayoutManager = this.f240372o;
            if (i12 < linearLayoutManager.o0()) {
                View viewZ = linearLayoutManager.Z(i12);
                if (viewZ != null) {
                    g(viewZ, i12);
                    return;
                }
                RecyclerView recyclerView = this.f240371n;
                if (recyclerView.getChildCount() == 0) {
                    recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new b(i12, z12));
                } else {
                    recyclerView.o(new c(i12, z12));
                    linearLayoutManager.l1(i12);
                }
            }
        }
    }

    public final void g(View view, int i12) {
        l lVar = this.f240369l;
        if (lVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        int height = lVar.f240351d.B().invoke().booleanValue() ? lVar.f240348a.getHeight() : lVar.f240352e.getHeight();
        RecyclerView recyclerView = this.f240371n;
        recyclerView.post(new RunnableC33786s(this, i12, view.getHeight() > recyclerView.getHeight() - height ? (recyclerView.getHeight() - view.getHeight()) - height : 0, 1));
    }

    public final void h(ActionMode actionMode) {
        C33862g0 c33862g0 = this.f240368k;
        c33862g0.a(actionMode);
        int iOrdinal = actionMode.ordinal();
        if (iOrdinal == 1) {
            c33862g0.b(new d(), new e());
        } else if (iOrdinal != 3) {
            c33862g0.b(h.f240390l, new i());
        } else {
            c33862g0.a(ActionMode.f231835e);
            c33862g0.b(new f(), new g());
        }
    }
}
