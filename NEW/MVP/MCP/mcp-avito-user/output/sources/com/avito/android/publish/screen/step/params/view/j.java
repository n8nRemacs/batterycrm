package com.avito.android.publish.screen.step.params.view;

import Ie0.InterfaceC14065a;
import Ie0.d;
import Ie0.f;
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
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.tooltip.b;
import com.avito.android.lib.design.tooltip.i;
import com.avito.android.lib.design.tooltip.r;
import com.avito.android.publish.ActionMode;
import com.avito.android.publish.C33862g0;
import com.avito.android.publish.details.InterfaceC33763k;
import com.avito.android.publish.details.RunnableC33786s;
import com.avito.android.publish.objects.N0;
import com.avito.android.publish.slots.item_info.c;
import com.avito.android.remote.model.category_parameters.TooltipOptions;
import com.avito.android.remote.model.category_parameters.slot.item_info.Confetti;
import com.avito.android.util.A6;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.K2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;

/* compiled from: PublishDetailsView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/params/view/j;", "Lcom/avito/android/publish/screen/step/params/view/d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j implements com.avito.android.publish.screen.step.params.view.d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f241603a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.recycler.data_aware.c f241604b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC14065a, G0> f241605c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f241606d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Q1 f241607e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Context f241608f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.progress_overlay.l f241609g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.progress_overlay.l f241610h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.details.auto_description.k f241611i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public f.e f241612j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public Boolean f241613k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public f.d f241614l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final C33862g0 f241615m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public com.avito.android.publish.screen.step.params.view.i f241616n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public N0 f241617o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f241618p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final LinearLayoutManager f241619q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public m f241620r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public com.avito.android.publish.view.e f241621s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.tooltip.k f241622t;

    /* compiled from: PublishDetailsView.kt */
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
            try {
                ActionMode actionMode2 = ActionMode.f231832b;
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: PublishDetailsView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ d.b f241623l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ j f241624m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d.b bVar, j jVar) {
            super(0);
            this.f241623l = bVar;
            this.f241624m = jVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.a
        public final G0 invoke() {
            DeepLink deepLink = ((d.b.l) this.f241623l).f8427c;
            if (deepLink != null) {
                this.f241624m.f241605c.invoke(new InterfaceC14065a.c.C0473c(deepLink, null, 2, 0 == true ? 1 : 0));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: PublishDetailsView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/publish/screen/step/params/view/j$c", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f241626c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f241627d;

        public c(int i12, boolean z12) {
            this.f241626c = i12;
            this.f241627d = z12;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            j jVar = j.this;
            A6.b(jVar.f241618p.getViewTreeObserver(), this);
            jVar.g(this.f241626c, this.f241627d);
        }
    }

    /* compiled from: PublishDetailsView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/publish/screen/step/params/view/j$d", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d extends RecyclerView.r {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f241629c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f241630d;

        public d(int i12, boolean z12) {
            this.f241629c = i12;
            this.f241630d = z12;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void k(@Y61.k RecyclerView recyclerView, int i12, int i13) {
            j jVar = j.this;
            jVar.f241618p.v0(this);
            LinearLayoutManager linearLayoutManager = jVar.f241619q;
            int i14 = this.f241629c;
            View viewZ = linearLayoutManager.Z(i14);
            if (viewZ == null) {
                return;
            }
            if (this.f241630d) {
                viewZ.addOnLayoutChangeListener(new com.avito.android.publish.screen.step.params.view.k(viewZ, jVar, viewZ, i14));
            } else {
                jVar.h(viewZ, i14);
            }
        }
    }

    /* compiled from: PublishDetailsView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<G0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            j.this.f241605c.invoke(new InterfaceC14065a.d.C14075b(true));
            return G0.f406611a;
        }
    }

    /* compiled from: PublishDetailsView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<G0> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            j.this.f241605c.invoke(new InterfaceC14065a.d.C14075b(false, 1, null));
            return G0.f406611a;
        }
    }

    /* compiled from: PublishDetailsView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<G0> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            j.this.f241605c.invoke(InterfaceC14065a.d.e.f8305a);
            return G0.f406611a;
        }
    }

    /* compiled from: PublishDetailsView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<G0> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            j.this.f241605c.invoke(new InterfaceC14065a.d.C14075b(false, 1, null));
            return G0.f406611a;
        }
    }

    /* compiled from: PublishDetailsView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<G0> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            j.this.f241605c.invoke(new InterfaceC14065a.d.C14075b(true));
            return G0.f406611a;
        }
    }

    /* compiled from: PublishDetailsView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.screen.step.params.view.j$j, reason: collision with other inner class name */
    public static final class C7233j extends N implements Y41.a<G0> {
        public C7233j() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            j.this.f241605c.invoke(new InterfaceC14065a.d.C14075b(false, 1, null));
            return G0.f406611a;
        }
    }

    /* compiled from: PublishDetailsView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final k f241637l = new k();

        public k() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    /* compiled from: PublishDetailsView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<G0> {
        public l() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            j.this.f241605c.invoke(new InterfaceC14065a.d.C14075b(false, 1, null));
            return G0.f406611a;
        }
    }

    /* compiled from: PublishDetailsView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/publish/screen/step/params/view/j$m", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class m extends RecyclerView.r {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f241639b;

        public m(Y41.a<G0> aVar) {
            this.f241639b = aVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void i(int i12, @Y61.k RecyclerView recyclerView) {
            if (i12 == 1) {
                this.f241639b.invoke();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(@Y61.k ViewGroup viewGroup, @Y61.k RecyclerView.Adapter<?> adapter, @Y61.k com.avito.android.recycler.data_aware.c cVar, @Y61.k Y41.l<? super InterfaceC14065a, G0> lVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k Q1 q12, boolean z12, boolean z13, boolean z14, long j12, @Y61.l com.avito.android.publish.slots.images_groups_recommendations.analytics.d dVar) {
        this.f241603a = viewGroup;
        this.f241604b = cVar;
        this.f241605c = lVar;
        this.f241606d = interfaceC28373a;
        this.f241607e = q12;
        Context context = viewGroup.getContext();
        this.f241608f = context;
        View viewFindViewById = viewGroup.findViewById(R.id.publish_root);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        com.avito.android.progress_overlay.l lVar2 = new com.avito.android.progress_overlay.l((ViewGroup) viewFindViewById, R.id.recycler_view, interfaceC28373a, R.layout.publish_progress_overlay, 0, 16, null);
        this.f241609g = lVar2;
        View viewFindViewById2 = viewGroup.findViewById(R.id.publish_root);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f241610h = new com.avito.android.progress_overlay.l((ViewGroup) viewFindViewById2, 0, interfaceC28373a, R.layout.publish_progress_overlay_black, C35835l0.d(R.attr.transparentBlack, context), 2, null);
        View viewFindViewById3 = viewGroup.findViewById(R.id.publish_root);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f241611i = new com.avito.android.publish.details.auto_description.k((ViewGroup) viewFindViewById3, R.id.recycler_view, interfaceC28373a);
        C33862g0 c33862g0 = new C33862g0(viewGroup.getRootView(), Boolean.valueOf(z13));
        this.f241615m = c33862g0;
        View viewFindViewById4 = viewGroup.findViewById(R.id.recycler_view);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById4;
        this.f241618p = recyclerView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        this.f241619q = linearLayoutManager;
        c33862g0.c(C35835l0.j(R.attr.ic_arrowBack24, context));
        i(ActionMode.f231836f);
        recyclerView.setLayoutManager(linearLayoutManager);
        RecyclerView.j itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.f53829c = j12;
        }
        RecyclerView.j itemAnimator2 = recyclerView.getItemAnimator();
        if (itemAnimator2 != null) {
            itemAnimator2.f53832f = j12;
        }
        View viewFindViewById5 = viewGroup.findViewById(R.id.publish_root);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        recyclerView.o(new com.avito.android.publish.view.p((FrameLayout) viewFindViewById5));
        if (z14) {
            recyclerView.l(new com.avito.android.blueprints.publish.header.a(recyclerView.getResources()), -1);
        }
        recyclerView.setAdapter(adapter);
        if (dVar != null) {
            com.avito.android.publish.slots.images_groups_recommendations.analytics.a aVar = new com.avito.android.publish.slots.images_groups_recommendations.analytics.a(recyclerView, dVar);
            recyclerView.o(aVar);
            recyclerView.m(aVar);
        }
        lVar2.f231600j = new n(this);
    }

    @Override // com.avito.android.publish.screen.step.params.view.actions.q
    public final void W() {
        K2.d(this.f241603a, true);
    }

    @Override // com.avito.android.publish.screen.step.params.view.actions.q
    public final void a(@Y61.k Y41.a<G0> aVar) {
        m mVar = new m(aVar);
        this.f241618p.o(mVar);
        this.f241620r = mVar;
    }

    @Override // com.avito.android.publish.screen.step.params.view.actions.q
    public final void b() {
        m mVar = this.f241620r;
        if (mVar != null) {
            this.f241618p.v0(mVar);
        }
        this.f241620r = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // com.avito.android.publish.screen.step.params.view.d
    public final void c(@Y61.k Ie0.f fVar) {
        this.f241604b.c(fVar.f8437i);
        f.e eVar = this.f241612j;
        f.e eVar2 = fVar.f8430b;
        if (!new com.avito.android.lib.util.c(eVar2, eVar).f181333c && eVar2 != null) {
            boolean z12 = eVar2 instanceof f.e.b;
            com.avito.android.progress_overlay.l lVar = this.f241609g;
            if (z12) {
                lVar.j();
            } else if (eVar2 instanceof f.e.a) {
                lVar.a("");
            } else if (eVar2 instanceof f.e.c) {
                lVar.k(null);
            }
            this.f241612j = eVar2;
        }
        f.d dVar = this.f241614l;
        f.d dVar2 = fVar.f8431c;
        if (!new com.avito.android.lib.util.c(dVar2, dVar).f181333c && dVar2 != null) {
            boolean z13 = dVar2 instanceof f.d.a;
            com.avito.android.publish.details.auto_description.k kVar = this.f241611i;
            if (z13) {
                kVar.a(((f.d.a) dVar2).f8447a);
                d(false);
            } else if (dVar2 instanceof f.d.b) {
                f.d.b bVar = (f.d.b) dVar2;
                kVar.k(bVar.f8449b);
                kVar.m(bVar.f8448a, bVar.f8450c);
                d(false);
            } else if (dVar2 instanceof f.d.c) {
                kVar.j();
                d(true);
            }
            this.f241614l = dVar2;
        }
        Boolean bool = this.f241613k;
        boolean z14 = fVar.f8432d;
        Boolean boolValueOf = Boolean.valueOf(z14);
        if (!new com.avito.android.lib.util.c(boolValueOf, bool).f181333c) {
            com.avito.android.progress_overlay.l lVar2 = this.f241610h;
            if (z14) {
                lVar2.k(null);
            } else {
                lVar2.j();
            }
            this.f241613k = boolValueOf;
        }
        boolean z15 = fVar.f8433e;
        if (!z15 || this.f241621s == null) {
            com.avito.android.publish.view.e eVar3 = this.f241621s;
            RecyclerView recyclerView = this.f241618p;
            if (eVar3 != null) {
                recyclerView.v0(eVar3);
            }
            if (z15) {
                com.avito.android.publish.view.e eVar4 = new com.avito.android.publish.view.e(new com.avito.android.publish.screen.step.params.view.m(this));
                this.f241621s = eVar4;
                recyclerView.o(eVar4);
            } else {
                this.f241621s = null;
            }
        }
        f.C0480f c0480f = fVar.f8434f;
        String str = c0480f.f8455a;
        if (str == null) {
            str = "";
        }
        C33862g0 c33862g0 = this.f241615m;
        c33862g0.f236022a.setNavigationTitle(str);
        Integer num = c0480f.f8456b;
        if (num != null) {
            c33862g0.c(C35835l0.j(num.intValue(), this.f241608f));
        }
        i(c0480f.f8457c);
        com.avito.android.publish.screen.step.params.view.i iVar = this.f241616n;
        if (iVar != null) {
            f.a aVar = iVar.f241597j;
            f.a aVar2 = fVar.f8435g;
            if (!new com.avito.android.lib.util.c(aVar2, aVar).f181333c) {
                boolean z16 = aVar2.f8440c;
                com.avito.android.publish.screen.step.params.view.actions.l lVar3 = iVar.f241590c;
                if (z16) {
                    lVar3.d(aVar2.f8442e);
                } else {
                    lVar3.e();
                }
                boolean z17 = aVar2.f8439b;
                com.avito.android.publish.screen.step.params.view.actions.b bVar2 = iVar.f241595h;
                if (z17) {
                    bVar2.f();
                } else {
                    bVar2.o();
                }
                if (aVar2.f8441d) {
                    bVar2.m();
                } else {
                    bVar2.g();
                }
                String str2 = aVar2.f8438a;
                if (str2 != null) {
                    bVar2.r(str2);
                }
                iVar.f241597j = aVar2;
            }
            f.c cVar = fVar.f8436h;
            boolean z18 = cVar.f8443a;
            InterfaceC33763k interfaceC33763k = iVar.f241596i;
            if (z18) {
                interfaceC33763k.t();
            } else {
                interfaceC33763k.c();
            }
            interfaceC33763k.h(cVar.f8444b);
            interfaceC33763k.e(cVar.f8445c, cVar.f8446d);
        }
    }

    public final void d(boolean z12) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = this.f241603a;
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

    public final com.avito.android.publish.screen.step.params.view.e e() {
        com.avito.android.publish.screen.step.params.view.i iVar = this.f241616n;
        if (iVar != null) {
            return iVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void f(@Y61.k d.b bVar) {
        View viewZ;
        if (bVar instanceof d.b.f) {
            this.f241615m.d(((d.b.f) bVar).f8420a);
            return;
        }
        boolean z12 = bVar instanceof d.b.g;
        ViewGroup viewGroup = this.f241603a;
        if (z12) {
            com.avito.android.publish.slots.item_info.c cVar = new com.avito.android.publish.slots.item_info.c(viewGroup);
            Confetti confetti = ((d.b.g) bVar).f8421a;
            cVar.b(new c.a(confetti.getDelay(), confetti.getCount(), confetti.getRadius(), confetti.getDuration()));
            return;
        }
        if (bVar instanceof d.b.l) {
            d.b.l lVar = (d.b.l) bVar;
            b bVar2 = new b(bVar, this);
            com.avito.android.lib.design.tooltip.k kVar = this.f241622t;
            if (kVar != null) {
                kVar.dismiss();
            }
            this.f241622t = null;
            TooltipOptions tooltipOptions = lVar.f8426b;
            if (tooltipOptions == null || (viewZ = this.f241619q.Z(lVar.f8425a)) == null) {
                return;
            }
            com.avito.android.lib.design.tooltip.k kVar2 = new com.avito.android.lib.design.tooltip.k(viewZ.getContext(), 0, 0, 6, null);
            kVar2.f181224j = new r.d(new i.a(new b.a()));
            int i12 = kVar2.f181229o;
            kVar2.f181228n = -1;
            kVar2.f181229o = i12;
            com.avito.android.lib.design.tooltip.p.a(kVar2, new o(tooltipOptions, bVar2, this));
            this.f241622t = kVar2.f(viewZ);
            return;
        }
        if (bVar instanceof d.b.a) {
            K2.d(viewGroup, true);
            return;
        }
        if (bVar instanceof d.b.j) {
            com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, this.f241603a, com.avito.android.printable_text.b.f(((d.b.j) bVar).f8423a), null, null, null, null, 0, null, null, false, false, null, null, 4094);
            return;
        }
        if (bVar instanceof d.b.e) {
            d.b.e eVar = (d.b.e) bVar;
            com.avito.android.user_address.e.b(viewGroup, null, eVar.f8418a, eVar.f8419b);
            return;
        }
        if (bVar instanceof d.b.c) {
            d.b.c cVar2 = (d.b.c) bVar;
            g(cVar2.f8413a, cVar2.f8414b);
            return;
        }
        if (bVar instanceof d.b.C0478b) {
            int i13 = ((d.b.C0478b) bVar).f8412a;
            if (i13 < 0) {
                return;
            }
            this.f241618p.getViewTreeObserver().addOnGlobalLayoutListener(new com.avito.android.publish.screen.step.params.view.l(new l0.f(), this, i13));
            return;
        }
        if (bVar instanceof d.b.C0479d) {
            d.b.C0479d c0479d = (d.b.C0479d) bVar;
            ((com.avito.android.publish.screen.step.params.view.i) e()).a(c0479d.f8415a, c0479d.f8416b, c0479d.f8417c);
        } else if (bVar instanceof d.b.h) {
            ((com.avito.android.publish.screen.step.params.view.i) e()).f241594g.j3(((d.b.h) bVar).f8422a);
        } else if (bVar instanceof d.b.i) {
            com.avito.android.publish.screen.step.params.view.e eVarE = e();
            ((d.b.i) bVar).getClass();
            ((com.avito.android.publish.screen.step.params.view.i) eVarE).a(null, null, null);
        } else if (bVar instanceof d.b.k) {
            ((com.avito.android.publish.screen.step.params.view.i) e()).f241594g.i(((d.b.k) bVar).f8424a);
        }
    }

    public final void g(int i12, boolean z12) {
        if (i12 >= 0) {
            LinearLayoutManager linearLayoutManager = this.f241619q;
            if (i12 < linearLayoutManager.o0()) {
                View viewZ = linearLayoutManager.Z(i12);
                if (viewZ != null) {
                    h(viewZ, i12);
                    return;
                }
                RecyclerView recyclerView = this.f241618p;
                if (recyclerView.getChildCount() == 0) {
                    recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new c(i12, z12));
                } else {
                    recyclerView.o(new d(i12, z12));
                    linearLayoutManager.l1(i12);
                }
            }
        }
    }

    public final void h(View view, int i12) {
        com.avito.android.publish.screen.step.params.view.i iVar = (com.avito.android.publish.screen.step.params.view.i) e();
        int height = iVar.f241589b.B().invoke().booleanValue() ? iVar.f241588a.getHeight() : iVar.f241594g.getHeight();
        RecyclerView recyclerView = this.f241618p;
        recyclerView.post(new RunnableC33786s(this, i12, view.getHeight() > recyclerView.getHeight() - height ? (recyclerView.getHeight() - view.getHeight()) - height : 0, 2));
    }

    public final void i(ActionMode actionMode) {
        C33862g0 c33862g0 = this.f241615m;
        c33862g0.a(actionMode);
        int iOrdinal = actionMode.ordinal();
        if (iOrdinal == 0) {
            c33862g0.b(new i(), new C7233j());
            return;
        }
        if (iOrdinal == 1) {
            c33862g0.b(new e(), new f());
        } else if (iOrdinal != 3) {
            c33862g0.b(k.f241637l, new l());
        } else {
            c33862g0.b(new g(), new h());
        }
    }

    public /* synthetic */ j(ViewGroup viewGroup, RecyclerView.Adapter adapter, com.avito.android.recycler.data_aware.c cVar, Y41.l lVar, InterfaceC28373a interfaceC28373a, Q1 q12, boolean z12, boolean z13, boolean z14, long j12, com.avito.android.publish.slots.images_groups_recommendations.analytics.d dVar, int i12, C42822w c42822w) {
        this(viewGroup, adapter, cVar, lVar, interfaceC28373a, q12, z12, (i12 & 128) != 0 ? false : z13, (i12 & 256) != 0 ? true : z14, (i12 & 512) != 0 ? 500L : j12, (i12 & 1024) != 0 ? null : dVar);
    }
}
