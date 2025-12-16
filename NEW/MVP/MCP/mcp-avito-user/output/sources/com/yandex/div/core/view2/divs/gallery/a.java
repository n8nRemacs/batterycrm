package com.yandex.div.core.view2.divs.gallery;

import Y41.p;
import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C22829k0;
import androidx.core.view.C22833m0;
import androidx.recyclerview.widget.DivLinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.yandex.div.core.InterfaceC37911f;
import com.yandex.div.core.InterfaceC37915j;
import com.yandex.div.core.dagger.z;
import com.yandex.div.core.state.q;
import com.yandex.div.core.view2.C38029k;
import com.yandex.div.core.view2.C38040w;
import com.yandex.div.core.view2.N;
import com.yandex.div.core.view2.P;
import com.yandex.div.core.view2.divs.AbstractC38005v1;
import com.yandex.div.core.view2.divs.C37931a;
import com.yandex.div.core.view2.divs.C38006w;
import com.yandex.div.core.view2.divs.H2;
import com.yandex.div.core.view2.divs.J2;
import com.yandex.div.core.view2.divs.widgets.B;
import com.yandex.div.core.view2.divs.widgets.o;
import com.yandex.div.core.view2.divs.widgets.t;
import com.yandex.div.core.view2.divs.widgets.w;
import com.yandex.div.core.view2.divs.widgets.x;
import com.yandex.div.core.widget.j;
import com.yandex.div.internal.n;
import com.yandex.div.internal.widget.i;
import com.yandex.div2.AbstractC38330g;
import com.yandex.div2.DivGallery;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: DivGalleryBinder.kt */
@z
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/div/core/view2/divs/gallery/a;", "Lcom/yandex/div/core/view2/N;", "Lcom/yandex/div2/DivGallery;", "Lcom/yandex/div/core/view2/divs/widgets/o;", "a", "b", "c", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class a implements N<DivGallery, o> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C38006w f368416a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final P f368417b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final dagger.internal.f f368418c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.yandex.div.core.downloader.k f368419d;

    /* compiled from: DivGalleryBinder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/yandex/div/core/view2/divs/gallery/a$a;", "Lcom/yandex/div/core/view2/divs/v1;", "Lcom/yandex/div/core/view2/divs/gallery/a$b;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div.core.view2.divs.gallery.a$a, reason: collision with other inner class name */
    public static final class C10874a extends AbstractC38005v1<b> {

        /* renamed from: i, reason: collision with root package name */
        @k
        public final C38029k f368420i;

        /* renamed from: j, reason: collision with root package name */
        @k
        public final C38040w f368421j;

        /* renamed from: k, reason: collision with root package name */
        @k
        public final P f368422k;

        /* renamed from: l, reason: collision with root package name */
        @k
        public final p<View, AbstractC38330g, G0> f368423l;

        /* renamed from: m, reason: collision with root package name */
        @k
        public final com.yandex.div.core.state.f f368424m;

        /* renamed from: n, reason: collision with root package name */
        @k
        public final WeakHashMap<AbstractC38330g, Long> f368425n;

        /* renamed from: o, reason: collision with root package name */
        public long f368426o;

        /* renamed from: p, reason: collision with root package name */
        @k
        public final ArrayList f368427p;

        /* JADX WARN: Multi-variable type inference failed */
        public C10874a(@k List<? extends AbstractC38330g> list, @k C38029k c38029k, @k C38040w c38040w, @k P p12, @k p<? super View, ? super AbstractC38330g, G0> pVar, @k com.yandex.div.core.state.f fVar) {
            super(list, c38029k);
            this.f368420i = c38029k;
            this.f368421j = c38040w;
            this.f368422k = p12;
            this.f368423l = pVar;
            this.f368424m = fVar;
            this.f368425n = new WeakHashMap<>();
            this.f368427p = new ArrayList();
            setHasStableIds(true);
            k();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.f368847f.getF38299e();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final long getItemId(int i12) {
            AbstractC38330g abstractC38330g = (AbstractC38330g) this.f368847f.get(i12);
            WeakHashMap<AbstractC38330g, Long> weakHashMap = this.f368425n;
            Long l12 = weakHashMap.get(abstractC38330g);
            if (l12 != null) {
                return l12.longValue();
            }
            long j12 = this.f368426o;
            this.f368426o = 1 + j12;
            weakHashMap.put(abstractC38330g, Long.valueOf(j12));
            return j12;
        }

        @Override // F21.b
        @k
        public final List<InterfaceC37911f> getSubscriptions() {
            return this.f368427p;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.C r7, int r8) {
            /*
                r6 = this;
                com.yandex.div.core.view2.divs.gallery.a$b r7 = (com.yandex.div.core.view2.divs.gallery.a.b) r7
                com.yandex.div.core.view2.divs.u1 r0 = r6.f368847f
                java.lang.Object r0 = r0.get(r8)
                com.yandex.div2.g r0 = (com.yandex.div2.AbstractC38330g) r0
                com.yandex.div.core.view2.k r1 = r6.f368420i
                com.yandex.div.json.expressions.e r2 = r1.getExpressionResolver()
                com.yandex.div2.g r3 = r7.f368431e
                com.yandex.div.core.widget.j r4 = r7.f368428b
                if (r3 == 0) goto L2e
                android.view.View r3 = r4.getChild()
                if (r3 == 0) goto L2e
                com.yandex.div.core.view2.animations.a r3 = com.yandex.div.core.view2.animations.a.f367913a
                com.yandex.div2.g r5 = r7.f368431e
                r3.getClass()
                boolean r3 = com.yandex.div.core.view2.animations.a.b(r5, r0, r2)
                if (r3 == 0) goto L2e
                android.view.View r2 = r4.getChild()
                goto L3f
            L2e:
                com.yandex.div.core.view2.P r3 = r7.f368430d
                android.view.View r2 = r3.n(r0, r2)
                com.yandex.div.core.view2.divs.widgets.C r3 = com.yandex.div.core.view2.divs.widgets.C.f368870a
                r3.getClass()
                com.yandex.div.core.view2.divs.widgets.C.a(r4, r1)
                r4.addView(r2)
            L3f:
                r7.f368431e = r0
                com.yandex.div.core.view2.w r7 = r7.f368429c
                com.yandex.div.core.state.f r3 = r6.f368424m
                r7.b(r2, r0, r1, r3)
                java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
                r8 = 2131365282(0x7f0a0da2, float:1.8350425E38)
                r4.setTag(r8, r7)
                com.yandex.div.core.view2.w r7 = r6.f368421j
                r7.a()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.gallery.a.C10874a.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$C, int):void");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.C onCreateViewHolder(ViewGroup viewGroup, int i12) {
            return new b(new j(this.f368420i.getContext(), null, 0, 6, null), this.f368421j, this.f368422k);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onViewAttachedToWindow(RecyclerView.C c12) {
            b bVar = (b) c12;
            super.onViewAttachedToWindow(bVar);
            AbstractC38330g abstractC38330g = bVar.f368431e;
            if (abstractC38330g == null) {
                return;
            }
            this.f368423l.invoke(bVar.f368428b, abstractC38330g);
        }
    }

    /* compiled from: DivGalleryBinder.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/view2/divs/gallery/a$b;", "Landroidx/recyclerview/widget/RecyclerView$C;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b extends RecyclerView.C {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final j f368428b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final C38040w f368429c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final P f368430d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public AbstractC38330g f368431e;

        public b(@k j jVar, @k C38040w c38040w, @k P p12) {
            super(jVar);
            this.f368428b = jVar;
            this.f368429c = c38040w;
            this.f368430d = p12;
        }
    }

    /* compiled from: DivGalleryBinder.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/view2/divs/gallery/a$c;", "Landroidx/recyclerview/widget/RecyclerView$r;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class c extends RecyclerView.r {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C38029k f368432b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final o f368433c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final RecyclerView.m f368434d;

        /* renamed from: e, reason: collision with root package name */
        public final int f368435e;

        /* renamed from: f, reason: collision with root package name */
        public int f368436f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f368437g;

        /* JADX WARN: Multi-variable type inference failed */
        public c(@k C38029k c38029k, @k o oVar, @k com.yandex.div.core.view2.divs.gallery.c cVar, @k DivGallery divGallery) {
            this.f368432b = c38029k;
            this.f368433c = oVar;
            this.f368434d = (RecyclerView.m) cVar;
            c38029k.getF369129G().getClass();
            this.f368435e = 0;
        }

        /* JADX WARN: Type inference failed for: r1v3, types: [androidx.recyclerview.widget.RecyclerView$m, com.yandex.div.core.view2.divs.gallery.c] */
        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void i(int i12, @k RecyclerView recyclerView) {
            if (i12 == 1) {
                this.f368437g = false;
            }
            if (i12 == 0) {
                this.f368432b.getDiv2Component().b();
                ?? r12 = this.f368434d;
                r12.f();
                r12.l();
                InterfaceC37915j interfaceC37915j = InterfaceC37915j.f367563a;
            }
        }

        /* JADX WARN: Type inference failed for: r4v11, types: [androidx.recyclerview.widget.RecyclerView$m, com.yandex.div.core.view2.divs.gallery.c] */
        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void k(@k RecyclerView recyclerView, int i12, int i13) {
            int iWidth = this.f368435e;
            if (iWidth <= 0) {
                iWidth = this.f368434d.width() / 20;
            }
            int iAbs = Math.abs(i13) + Math.abs(i12) + this.f368436f;
            this.f368436f = iAbs;
            if (iAbs <= iWidth) {
                return;
            }
            this.f368436f = 0;
            boolean z12 = this.f368437g;
            C38029k c38029k = this.f368432b;
            if (!z12) {
                this.f368437g = true;
                c38029k.getDiv2Component().b();
                InterfaceC37915j interfaceC37915j = InterfaceC37915j.f367563a;
            }
            o oVar = this.f368433c;
            Iterator<View> it = new C22829k0(oVar).iterator();
            while (true) {
                C22833m0 c22833m0 = (C22833m0) it;
                if (!c22833m0.hasNext()) {
                    return;
                }
                View view = (View) c22833m0.next();
                oVar.getClass();
                int iU2 = RecyclerView.U(view);
                RecyclerView.Adapter adapter = oVar.getAdapter();
                if (adapter == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.yandex.div.core.view2.divs.gallery.DivGalleryBinder.GalleryAdapter");
                }
                AbstractC38330g abstractC38330g = (AbstractC38330g) ((C10874a) adapter).f368845d.get(iU2);
                c38029k.getDiv2Component().t().d(c38029k, view, abstractC38330g, C37931a.u(abstractC38330g.a()));
            }
        }
    }

    /* compiled from: DivGalleryBinder.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class d {
        static {
            int[] iArr = new int[DivGallery.ScrollMode.values().length];
            iArr[1] = 1;
            iArr[0] = 2;
            int[] iArr2 = new int[DivGallery.Orientation.values().length];
            iArr2[0] = 1;
            iArr2[1] = 2;
        }
    }

    /* compiled from: DivGalleryBinder.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/yandex/div/core/view2/divs/gallery/a$e", "Lcom/yandex/div/core/view2/divs/widgets/w;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class e extends w {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f368438a;

        public e(ArrayList arrayList) {
            this.f368438a = arrayList;
        }

        @Override // com.yandex.div.core.view2.divs.widgets.w
        public final void n(@k t tVar) {
            this.f368438a.add(tVar);
        }
    }

    /* compiled from: DivGalleryBinder.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/View;", "itemView", "Lcom/yandex/div2/g;", "div", "Lkotlin/G0;", "invoke", "(Landroid/view/View;Lcom/yandex/div2/g;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends kotlin.jvm.internal.N implements p<View, AbstractC38330g, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ C38029k f368440m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C38029k c38029k) {
            super(2);
            this.f368440m = c38029k;
        }

        @Override // Y41.p
        public final G0 invoke(View view, AbstractC38330g abstractC38330g) {
            List<? extends AbstractC38330g> listSingletonList = Collections.singletonList(abstractC38330g);
            a.this.a(view, listSingletonList, this.f368440m);
            return G0.f406611a;
        }
    }

    /* compiled from: DivGalleryBinder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "<anonymous parameter 0>", "Lkotlin/G0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends kotlin.jvm.internal.N implements Y41.l<Object, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ o f368442m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ DivGallery f368443n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ C38029k f368444o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ com.yandex.div.json.expressions.e f368445p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(o oVar, DivGallery divGallery, C38029k c38029k, com.yandex.div.json.expressions.e eVar) {
            super(1);
            this.f368442m = oVar;
            this.f368443n = divGallery;
            this.f368444o = c38029k;
            this.f368445p = eVar;
        }

        @Override // Y41.l
        public final G0 invoke(Object obj) {
            a.this.getClass();
            a.c(this.f368442m, this.f368443n, this.f368444o, this.f368445p);
            return G0.f406611a;
        }
    }

    @Inject
    public a(@k C38006w c38006w, @k P p12, @k dagger.internal.f fVar, @k com.yandex.div.core.downloader.k kVar) {
        this.f368416a = c38006w;
        this.f368417b = p12;
        this.f368418c = fVar;
        this.f368419d = kVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v0, types: [android.view.View, android.view.ViewGroup, androidx.recyclerview.widget.RecyclerView, com.yandex.div.core.view2.divs.widgets.o] */
    /* JADX WARN: Type inference failed for: r4v9, types: [androidx.recyclerview.widget.DivLinearLayoutManager] */
    public static void c(o oVar, DivGallery divGallery, C38029k c38029k, com.yandex.div.json.expressions.e eVar) {
        Long lA2;
        com.yandex.div.json.expressions.b<Long> bVar;
        i iVar;
        int iIntValue;
        H2 pagerSnapStartHelper;
        DisplayMetrics displayMetrics = oVar.getResources().getDisplayMetrics();
        DivGallery.Orientation orientationA = divGallery.f371522t.a(eVar);
        int i12 = 1;
        int i13 = orientationA == DivGallery.Orientation.HORIZONTAL ? 0 : 1;
        com.yandex.div.json.expressions.b<Long> bVar2 = divGallery.f371509g;
        long jLongValue = (bVar2 == null || (lA2 = bVar2.a(eVar)) == null) ? 1L : lA2.longValue();
        oVar.setClipChildren(false);
        com.yandex.div.json.expressions.b<Long> bVar3 = divGallery.f371519q;
        if (jLongValue == 1) {
            bVar = bVar3;
            iVar = new i(0, C37931a.o(bVar3.a(eVar), displayMetrics), 0, 0, 0, 0, i13, 61, null);
        } else {
            bVar = bVar3;
            int iO2 = C37931a.o(bVar.a(eVar), displayMetrics);
            com.yandex.div.json.expressions.b<Long> bVar4 = divGallery.f371512j;
            if (bVar4 == null) {
                bVar4 = bVar;
            }
            iVar = new i(0, iO2, C37931a.o(bVar4.a(eVar), displayMetrics), 0, 0, 0, i13, 57, null);
        }
        i iVar2 = iVar;
        int itemDecorationCount = oVar.getItemDecorationCount() - 1;
        if (itemDecorationCount >= 0) {
            while (true) {
                int i14 = itemDecorationCount - 1;
                oVar.s0(itemDecorationCount);
                if (i14 < 0) {
                    break;
                } else {
                    itemDecorationCount = i14;
                }
            }
        }
        oVar.l(iVar2, -1);
        int iOrdinal = divGallery.f371526x.a(eVar).ordinal();
        B b12 = null;
        if (iOrdinal == 0) {
            H2 pagerSnapStartHelper2 = oVar.getPagerSnapStartHelper();
            if (pagerSnapStartHelper2 == null) {
                pagerSnapStartHelper2 = new H2();
                oVar.setPagerSnapStartHelper(pagerSnapStartHelper2);
            }
            pagerSnapStartHelper2.b(oVar);
            pagerSnapStartHelper2.f368093f = kotlin.math.b.b(bVar.a(eVar).longValue() * com.yandex.div.internal.util.p.f370185a.density);
        } else if (iOrdinal == 1 && (pagerSnapStartHelper = oVar.getPagerSnapStartHelper()) != null) {
            pagerSnapStartHelper.b(null);
        }
        DivGridLayoutManager divLinearLayoutManager = jLongValue == 1 ? new DivLinearLayoutManager(c38029k, oVar, divGallery, i13) : new DivGridLayoutManager(c38029k, oVar, divGallery, i13);
        oVar.setLayoutManager(divLinearLayoutManager);
        oVar.s();
        com.yandex.div.core.state.k currentState = c38029k.getCurrentState();
        if (currentState != null) {
            String strValueOf = divGallery.f371518p;
            if (strValueOf == null) {
                strValueOf = String.valueOf(divGallery.hashCode());
            }
            com.yandex.div.core.state.l lVar = (com.yandex.div.core.state.l) currentState.a(strValueOf);
            Integer numValueOf = lVar == null ? null : Integer.valueOf(lVar.f367668a);
            if (numValueOf == null) {
                long jLongValue2 = divGallery.f371513k.a(eVar).longValue();
                long j12 = jLongValue2 >> 31;
                if (j12 == 0 || j12 == -1) {
                    iIntValue = (int) jLongValue2;
                } else {
                    int i15 = n.f370123a;
                    iIntValue = jLongValue2 > 0 ? Integer.MAX_VALUE : BeduinInputModel.MIN_TEXT_VERSION;
                }
            } else {
                iIntValue = numValueOf.intValue();
            }
            Integer numValueOf2 = lVar == null ? null : Integer.valueOf(lVar.f367669b);
            Object layoutManager = oVar.getLayoutManager();
            com.yandex.div.core.view2.divs.gallery.c cVar = layoutManager instanceof com.yandex.div.core.view2.divs.gallery.c ? (com.yandex.div.core.view2.divs.gallery.c) layoutManager : null;
            if (numValueOf2 == null && iIntValue == 0) {
                if (cVar != null) {
                    cVar.v(iIntValue);
                }
            } else if (numValueOf2 != null) {
                if (cVar != null) {
                    cVar.y(iIntValue, numValueOf2.intValue());
                }
            } else if (cVar != null) {
                cVar.v(iIntValue);
            }
            oVar.o(new q(strValueOf, currentState, divLinearLayoutManager));
        }
        oVar.o(new c(c38029k, oVar, divLinearLayoutManager, divGallery));
        if (divGallery.f371524v.a(eVar).booleanValue()) {
            int iOrdinal2 = orientationA.ordinal();
            if (iOrdinal2 != 0) {
                if (iOrdinal2 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                i12 = 2;
            }
            b12 = new B(i12);
        }
        oVar.setOnInterceptTouchEventListener(b12);
    }

    public final void a(View view, List<? extends AbstractC38330g> list, C38029k c38029k) {
        AbstractC38330g abstractC38330gC;
        ArrayList arrayList = new ArrayList();
        x.a(new e(arrayList), view);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            t tVar = (t) it.next();
            com.yandex.div.core.state.f path = tVar.getPath();
            if (path != null) {
                Object arrayList2 = linkedHashMap.get(path);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(path, arrayList2);
                }
                ((Collection) arrayList2).add(tVar);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            com.yandex.div.core.state.f path2 = ((t) it2.next()).getPath();
            if (path2 != null) {
                arrayList3.add(path2);
            }
        }
        com.yandex.div.core.state.b.f367653a.getClass();
        for (com.yandex.div.core.state.f fVar : com.yandex.div.core.state.b.a(arrayList3)) {
            Iterator<T> it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    abstractC38330gC = null;
                    break;
                }
                AbstractC38330g abstractC38330g = (AbstractC38330g) it3.next();
                com.yandex.div.core.state.b.f367653a.getClass();
                abstractC38330gC = com.yandex.div.core.state.b.c(abstractC38330g, fVar);
                if (abstractC38330gC != null) {
                    break;
                }
            }
            List list2 = (List) linkedHashMap.get(fVar);
            if (abstractC38330gC != null && list2 != null) {
                C38040w c38040w = (C38040w) this.f368418c.get();
                com.yandex.div.core.state.f fVarB = fVar.b();
                Iterator it4 = list2.iterator();
                while (it4.hasNext()) {
                    c38040w.b((t) it4.next(), abstractC38330gC, c38029k, fVarB);
                }
            }
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void b(@k o oVar, @k DivGallery divGallery, @k C38029k c38029k, @k com.yandex.div.core.state.f fVar) {
        DivGallery div = oVar.getDiv();
        if (divGallery.equals(div)) {
            RecyclerView.Adapter adapter = oVar.getAdapter();
            if (adapter == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.yandex.div.core.view2.divs.gallery.DivGalleryBinder.GalleryAdapter");
            }
            C10874a c10874a = (C10874a) adapter;
            c10874a.j(this.f368419d);
            c10874a.g();
            c10874a.k();
            a(oVar, divGallery.f371520r, c38029k);
            return;
        }
        C38006w c38006w = this.f368416a;
        if (div != null) {
            c38006w.h(c38029k, oVar, div);
        }
        F21.b bVarA = com.yandex.div.core.util.e.a(oVar);
        bVarA.g();
        c38006w.d(oVar, divGallery, div, c38029k);
        com.yandex.div.json.expressions.e expressionResolver = c38029k.getExpressionResolver();
        g gVar = new g(oVar, divGallery, c38029k, expressionResolver);
        bVarA.e(divGallery.f371522t.d(expressionResolver, gVar));
        bVarA.e(divGallery.f371526x.d(expressionResolver, gVar));
        bVarA.e(divGallery.f371519q.d(expressionResolver, gVar));
        bVarA.e(divGallery.f371524v.d(expressionResolver, gVar));
        com.yandex.div.json.expressions.b<Long> bVar = divGallery.f371509g;
        if (bVar != null) {
            bVarA.e(bVar.d(expressionResolver, gVar));
        }
        oVar.setRecycledViewPool(new J2(c38029k.getReleaseViewVisitor$div_release()));
        oVar.setScrollingTouchSlop(1);
        oVar.setClipToPadding(false);
        oVar.setOverScrollMode(2);
        f fVar2 = new f(c38029k);
        oVar.setAdapter(new C10874a(divGallery.f371520r, c38029k, (C38040w) this.f368418c.get(), this.f368417b, fVar2, fVar));
        oVar.setDiv(divGallery);
        c(oVar, divGallery, c38029k, expressionResolver);
    }
}
