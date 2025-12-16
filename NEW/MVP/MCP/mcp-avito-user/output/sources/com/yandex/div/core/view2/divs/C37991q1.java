package com.yandex.div.core.view2.divs;

import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.C22829k0;
import androidx.core.view.C22833m0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.yandex.div.core.InterfaceC37911f;
import com.yandex.div.core.InterfaceC37915j;
import com.yandex.div.core.view2.C38029k;
import com.yandex.div.core.view2.C38040w;
import com.yandex.div.core.view2.divs.E2;
import com.yandex.div.core.view2.divs.E2.a;
import com.yandex.div2.AbstractC38330g;
import com.yandex.div2.AbstractC38369h4;
import com.yandex.div2.C38236a4;
import com.yandex.div2.C38502q1;
import com.yandex.div2.C38561t4;
import com.yandex.div2.DivPager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.sequences.C43033p;

/* compiled from: DivPagerBinder.kt */
@com.yandex.div.core.dagger.z
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/div/core/view2/divs/q1;", "Lcom/yandex/div/core/view2/N;", "Lcom/yandex/div2/DivPager;", "Lcom/yandex/div/core/view2/divs/widgets/n;", "a", "b", "c", "d", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div.core.view2.divs.q1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37991q1 implements com.yandex.div.core.view2.N<DivPager, com.yandex.div.core.view2.divs.widgets.n> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C38006w f368645a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.core.view2.P f368646b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f368647c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.core.downloader.k f368648d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C37955g f368649e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C2 f368650f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public com.yandex.div.core.state.p f368651g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public a f368652h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public E2 f368653i;

    /* compiled from: DivPagerBinder.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/view2/divs/q1$a;", "Landroidx/viewpager2/widget/ViewPager2$i;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div.core.view2.divs.q1$a */
    public static final class a extends ViewPager2.i {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final DivPager f368654d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final C38029k f368655e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final RecyclerView f368656f;

        /* renamed from: g, reason: collision with root package name */
        public int f368657g = -1;

        /* renamed from: h, reason: collision with root package name */
        public final int f368658h;

        /* renamed from: i, reason: collision with root package name */
        public int f368659i;

        /* compiled from: View.kt */
        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "com/yandex/div/core/util/n", "core-ktx_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        /* renamed from: com.yandex.div.core.view2.divs.q1$a$a, reason: collision with other inner class name */
        public static final class ViewOnLayoutChangeListenerC10884a implements View.OnLayoutChangeListener {
            public ViewOnLayoutChangeListenerC10884a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(@Y61.k View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                view.removeOnLayoutChangeListener(this);
                a.this.a();
            }
        }

        public a(@Y61.k DivPager divPager, @Y61.k C38029k c38029k, @Y61.k RecyclerView recyclerView) {
            this.f368654d = divPager;
            this.f368655e = c38029k;
            this.f368656f = recyclerView;
            c38029k.getF369129G().getClass();
            this.f368658h = 0;
        }

        public final void a() {
            RecyclerView recyclerView = this.f368656f;
            Iterator<View> it = new C22829k0(recyclerView).iterator();
            while (true) {
                C22833m0 c22833m0 = (C22833m0) it;
                if (!c22833m0.hasNext()) {
                    return;
                }
                View view = (View) c22833m0.next();
                recyclerView.getClass();
                int iU2 = RecyclerView.U(view);
                if (iU2 == -1) {
                    int i12 = com.yandex.div.internal.n.f370123a;
                    return;
                } else {
                    AbstractC38330g abstractC38330g = this.f368654d.f371819o.get(iU2);
                    C38029k c38029k = this.f368655e;
                    c38029k.getDiv2Component().t().d(c38029k, view, abstractC38330g, C37931a.u(abstractC38330g.a()));
                }
            }
        }

        public final void b() {
            RecyclerView recyclerView = this.f368656f;
            if (C43033p.d(new C22829k0(recyclerView)) > 0) {
                a();
            } else if (!com.yandex.div.core.util.q.b(recyclerView) || recyclerView.isLayoutRequested()) {
                recyclerView.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC10884a());
            } else {
                a();
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public final void onPageScrolled(int i12, float f12, int i13) {
            super.onPageScrolled(i12, f12, i13);
            int i14 = this.f368658h;
            if (i14 <= 0) {
                RecyclerView.m layoutManager = this.f368656f.getLayoutManager();
                i14 = (layoutManager == null ? 0 : layoutManager.f53850p) / 20;
            }
            int i15 = this.f368659i + i13;
            this.f368659i = i15;
            if (i15 > i14) {
                this.f368659i = 0;
                b();
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public final void onPageSelected(int i12) {
            super.onPageSelected(i12);
            b();
            int i13 = this.f368657g;
            if (i12 == i13) {
                return;
            }
            RecyclerView recyclerView = this.f368656f;
            C38029k c38029k = this.f368655e;
            if (i13 != -1) {
                c38029k.A(recyclerView);
                c38029k.getDiv2Component().b();
                InterfaceC37915j interfaceC37915j = InterfaceC37915j.f367563a;
            }
            AbstractC38330g abstractC38330g = this.f368654d.f371819o.get(i12);
            if (C37931a.v(abstractC38330g.a())) {
                c38029k.k(recyclerView, abstractC38330g);
            }
            this.f368657g = i12;
        }
    }

    /* compiled from: DivPagerBinder.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/view2/divs/q1$b;", "Landroid/widget/FrameLayout;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div.core.view2.divs.q1$b */
    public static final class b extends FrameLayout {
        @Override // android.widget.FrameLayout, android.view.View
        public final void onMeasure(int i12, int i13) {
            if (getChildCount() == 0 || getChildAt(0).getLayoutParams().height != -1) {
                super.onMeasure(i12, View.MeasureSpec.makeMeasureSpec(0, 0));
            } else {
                super.onMeasure(i12, i13);
            }
        }
    }

    /* compiled from: DivPagerBinder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/yandex/div/core/view2/divs/q1$c;", "Lcom/yandex/div/core/view2/divs/v1;", "Lcom/yandex/div/core/view2/divs/q1$d;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div.core.view2.divs.q1$c */
    public static final class c extends AbstractC38005v1<d> {

        /* renamed from: i, reason: collision with root package name */
        @Y61.k
        public final C38029k f368661i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.k
        public final C38040w f368662j;

        /* renamed from: k, reason: collision with root package name */
        @Y61.k
        public final Y41.p<d, Integer, kotlin.G0> f368663k;

        /* renamed from: l, reason: collision with root package name */
        @Y61.k
        public final com.yandex.div.core.view2.P f368664l;

        /* renamed from: m, reason: collision with root package name */
        @Y61.k
        public final com.yandex.div.core.state.f f368665m;

        /* renamed from: n, reason: collision with root package name */
        @Y61.k
        public final ArrayList f368666n;

        /* JADX WARN: Multi-variable type inference failed */
        public c(@Y61.k List<? extends AbstractC38330g> list, @Y61.k C38029k c38029k, @Y61.k C38040w c38040w, @Y61.k Y41.p<? super d, ? super Integer, kotlin.G0> pVar, @Y61.k com.yandex.div.core.view2.P p12, @Y61.k com.yandex.div.core.state.f fVar, @Y61.k com.yandex.div.core.view2.divs.widgets.D d12) {
            super(list, c38029k);
            this.f368661i = c38029k;
            this.f368662j = c38040w;
            this.f368663k = pVar;
            this.f368664l = p12;
            this.f368665m = fVar;
            this.f368666n = new ArrayList();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.f368845d.size();
        }

        @Override // F21.b
        @Y61.k
        public final List<InterfaceC37911f> getSubscriptions() {
            return this.f368666n;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.C r7, int r8) {
            /*
                r6 = this;
                com.yandex.div.core.view2.divs.q1$d r7 = (com.yandex.div.core.view2.divs.C37991q1.d) r7
                java.util.ArrayList r0 = r6.f368845d
                java.lang.Object r0 = r0.get(r8)
                com.yandex.div2.g r0 = (com.yandex.div2.AbstractC38330g) r0
                com.yandex.div.core.view2.k r1 = r6.f368661i
                com.yandex.div.json.expressions.e r2 = r1.getExpressionResolver()
                com.yandex.div2.g r3 = r7.f368670e
                android.widget.FrameLayout r4 = r7.f368667b
                if (r3 == 0) goto L2f
                int r3 = r4.getChildCount()
                if (r3 == 0) goto L2f
                com.yandex.div.core.view2.animations.a r3 = com.yandex.div.core.view2.animations.a.f367913a
                com.yandex.div2.g r5 = r7.f368670e
                r3.getClass()
                boolean r3 = com.yandex.div.core.view2.animations.a.b(r5, r0, r2)
                if (r3 == 0) goto L2f
                r2 = 0
                android.view.View r2 = androidx.core.view.o0.a(r4, r2)
                goto L40
            L2f:
                com.yandex.div.core.view2.P r3 = r7.f368669d
                android.view.View r2 = r3.n(r0, r2)
                com.yandex.div.core.view2.divs.widgets.C r3 = com.yandex.div.core.view2.divs.widgets.C.f368870a
                r3.getClass()
                com.yandex.div.core.view2.divs.widgets.C.a(r4, r1)
                r4.addView(r2)
            L40:
                r7.f368670e = r0
                com.yandex.div.core.view2.w r3 = r7.f368668c
                com.yandex.div.core.state.f r4 = r6.f368665m
                r3.b(r2, r0, r1, r4)
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                Y41.p<com.yandex.div.core.view2.divs.q1$d, java.lang.Integer, kotlin.G0> r0 = r6.f368663k
                com.yandex.div.core.view2.divs.q1$e r0 = (com.yandex.div.core.view2.divs.C37991q1.e) r0
                r0.invoke(r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.C37991q1.c.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$C, int):void");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.C onCreateViewHolder(ViewGroup viewGroup, int i12) {
            b bVar = new b(this.f368661i.getContext());
            bVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return new d(bVar, this.f368662j, this.f368664l);
        }
    }

    /* compiled from: DivPagerBinder.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/view2/divs/q1$d;", "Landroidx/recyclerview/widget/RecyclerView$C;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div.core.view2.divs.q1$d */
    public static final class d extends RecyclerView.C {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final FrameLayout f368667b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final C38040w f368668c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final com.yandex.div.core.view2.P f368669d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public AbstractC38330g f368670e;

        public d(@Y61.k FrameLayout frameLayout, @Y61.k C38040w c38040w, @Y61.k com.yandex.div.core.view2.P p12) {
            super(frameLayout);
            this.f368667b = frameLayout;
            this.f368668c = c38040w;
            this.f368669d = p12;
        }
    }

    /* compiled from: DivPagerBinder.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/core/view2/divs/q1$d;", "holder", "", "position", "Lkotlin/G0;", "invoke", "(Lcom/yandex/div/core/view2/divs/q1$d;I)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div.core.view2.divs.q1$e */
    public static final class e extends kotlin.jvm.internal.N implements Y41.p<d, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ SparseArray<Float> f368671l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ DivPager f368672m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ com.yandex.div.json.expressions.e f368673n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(SparseArray<Float> sparseArray, DivPager divPager, com.yandex.div.json.expressions.e eVar) {
            super(2);
            this.f368671l = sparseArray;
            this.f368672m = divPager;
            this.f368673n = eVar;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(d dVar, Integer num) {
            d dVar2 = dVar;
            Float f12 = this.f368671l.get(num.intValue());
            if (f12 != null) {
                float fFloatValue = f12.floatValue();
                if (this.f368672m.f371822r.a(this.f368673n) == DivPager.Orientation.HORIZONTAL) {
                    dVar2.itemView.setTranslationX(fFloatValue);
                } else {
                    dVar2.itemView.setTranslationY(fFloatValue);
                }
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: DivPagerBinder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/div2/DivPager$Orientation;", "it", "Lkotlin/G0;", "invoke", "(Lcom/yandex/div2/DivPager$Orientation;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div.core.view2.divs.q1$f */
    public static final class f extends kotlin.jvm.internal.N implements Y41.l<DivPager.Orientation, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.yandex.div.core.view2.divs.widgets.n f368674l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ C37991q1 f368675m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ DivPager f368676n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ com.yandex.div.json.expressions.e f368677o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ SparseArray<Float> f368678p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(SparseArray sparseArray, C37991q1 c37991q1, com.yandex.div.core.view2.divs.widgets.n nVar, com.yandex.div.json.expressions.e eVar, DivPager divPager) {
            super(1);
            this.f368674l = nVar;
            this.f368675m = c37991q1;
            this.f368676n = divPager;
            this.f368677o = eVar;
            this.f368678p = sparseArray;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(DivPager.Orientation orientation) {
            int i12 = orientation == DivPager.Orientation.HORIZONTAL ? 0 : 1;
            com.yandex.div.core.view2.divs.widgets.n nVar = this.f368674l;
            nVar.setOrientation(i12);
            C37991q1 c37991q1 = this.f368675m;
            DivPager divPager = this.f368676n;
            com.yandex.div.json.expressions.e eVar = this.f368677o;
            C37991q1.b(this.f368678p, c37991q1, nVar, eVar, divPager);
            C37991q1.a(c37991q1, nVar, divPager, eVar);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: DivPagerBinder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "restrictParentScroll", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div.core.view2.divs.q1$g */
    public static final class g extends kotlin.jvm.internal.N implements Y41.l<Boolean, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.yandex.div.core.view2.divs.widgets.n f368679l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(com.yandex.div.core.view2.divs.widgets.n nVar) {
            super(1);
            this.f368679l = nVar;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Boolean bool) {
            this.f368679l.setOnInterceptTouchEventListener(bool.booleanValue() ? new com.yandex.div.core.view2.divs.widgets.B(1) : null);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: DivPagerBinder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "<anonymous parameter 0>", "Lkotlin/G0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div.core.view2.divs.q1$h */
    public static final class h extends kotlin.jvm.internal.N implements Y41.l<Object, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C37991q1 f368680l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.yandex.div.core.view2.divs.widgets.n f368681m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ DivPager f368682n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ com.yandex.div.json.expressions.e f368683o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ SparseArray<Float> f368684p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(SparseArray sparseArray, C37991q1 c37991q1, com.yandex.div.core.view2.divs.widgets.n nVar, com.yandex.div.json.expressions.e eVar, DivPager divPager) {
            super(1);
            this.f368680l = c37991q1;
            this.f368681m = nVar;
            this.f368682n = divPager;
            this.f368683o = eVar;
            this.f368684p = sparseArray;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Object obj) {
            C37991q1 c37991q1 = this.f368680l;
            com.yandex.div.core.view2.divs.widgets.n nVar = this.f368681m;
            DivPager divPager = this.f368682n;
            com.yandex.div.json.expressions.e eVar = this.f368683o;
            C37991q1.a(c37991q1, nVar, divPager, eVar);
            C37991q1.b(this.f368684p, c37991q1, nVar, eVar, divPager);
            return kotlin.G0.f406611a;
        }
    }

    @Inject
    public C37991q1(@Y61.k C38006w c38006w, @Y61.k com.yandex.div.core.view2.P p12, @Y61.k dagger.internal.f fVar, @Y61.k com.yandex.div.core.downloader.k kVar, @Y61.k C37955g c37955g, @Y61.k C2 c22) {
        this.f368645a = c38006w;
        this.f368646b = p12;
        this.f368647c = fVar;
        this.f368648d = kVar;
        this.f368649e = c37955g;
        this.f368650f = c22;
    }

    public static final void a(C37991q1 c37991q1, com.yandex.div.core.view2.divs.widgets.n nVar, DivPager divPager, com.yandex.div.json.expressions.e eVar) {
        c37991q1.getClass();
        DisplayMetrics displayMetrics = nVar.getResources().getDisplayMetrics();
        float fR2 = C37931a.R(divPager.f371818n, displayMetrics, eVar);
        float fD2 = d(divPager, nVar, eVar);
        ViewPager2 viewPager = nVar.getViewPager();
        com.yandex.div2.Y0 y02 = divPager.f371823s;
        com.yandex.div.internal.widget.j jVar = new com.yandex.div.internal.widget.j(C37931a.p(y02.f374037b.a(eVar), displayMetrics), C37931a.p(y02.f374038c.a(eVar), displayMetrics), C37931a.p(y02.f374039d.a(eVar), displayMetrics), C37931a.p(y02.f374036a.a(eVar), displayMetrics), fD2, fR2, divPager.f371822r.a(eVar) == DivPager.Orientation.HORIZONTAL ? 0 : 1);
        int itemDecorationCount = viewPager.getItemDecorationCount();
        for (int i12 = 0; i12 < itemDecorationCount; i12++) {
            viewPager.f55103k.s0(i12);
        }
        viewPager.f55103k.l(jVar, -1);
        Integer numE = e(divPager, eVar);
        if ((fD2 != 0.0f || (numE != null && numE.intValue() < 100)) && nVar.getViewPager().getOffscreenPageLimit() != 1) {
            nVar.getViewPager().setOffscreenPageLimit(1);
        }
    }

    public static final void b(final SparseArray sparseArray, final C37991q1 c37991q1, final com.yandex.div.core.view2.divs.widgets.n nVar, final com.yandex.div.json.expressions.e eVar, final DivPager divPager) {
        c37991q1.getClass();
        DisplayMetrics displayMetrics = nVar.getResources().getDisplayMetrics();
        final DivPager.Orientation orientationA = divPager.f371822r.a(eVar);
        final Integer numE = e(divPager, eVar);
        final float fR2 = C37931a.R(divPager.f371818n, displayMetrics, eVar);
        DivPager.Orientation orientation = DivPager.Orientation.HORIZONTAL;
        com.yandex.div2.Y0 y02 = divPager.f371823s;
        final float fP2 = orientationA == orientation ? C37931a.p(y02.f374037b.a(eVar), displayMetrics) : C37931a.p(y02.f374039d.a(eVar), displayMetrics);
        final float fP3 = orientationA == orientation ? C37931a.p(y02.f374038c.a(eVar), displayMetrics) : C37931a.p(y02.f374036a.a(eVar), displayMetrics);
        nVar.getViewPager().setPageTransformer(new ViewPager2.l() { // from class: com.yandex.div.core.view2.divs.p1
            /* JADX WARN: Removed duplicated region for block: B:57:0x00c6 A[PHI: r2
  0x00c6: PHI (r2v8 float) = (r2v6 float), (r2v6 float), (r2v5 float), (r2v5 float) binds: [B:80:0x00fe, B:69:0x00e5, B:64:0x00dc, B:56:0x00c4] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // androidx.viewpager2.widget.ViewPager2.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void a(android.view.View r14, float r15) {
                /*
                    Method dump skipped, instructions count: 307
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.C37988p1.a(android.view.View, float):void");
            }
        });
    }

    public static float d(DivPager divPager, com.yandex.div.core.view2.divs.widgets.n nVar, com.yandex.div.json.expressions.e eVar) {
        DisplayMetrics displayMetrics = nVar.getResources().getDisplayMetrics();
        AbstractC38369h4 abstractC38369h4 = divPager.f371820p;
        if (!(abstractC38369h4 instanceof AbstractC38369h4.d)) {
            if (abstractC38369h4 instanceof AbstractC38369h4.c) {
                return C37931a.R(((AbstractC38369h4.c) abstractC38369h4).f375272c.f373781a, displayMetrics, eVar);
            }
            throw new NoWhenBranchMatchedException();
        }
        int width = divPager.f371822r.a(eVar) == DivPager.Orientation.HORIZONTAL ? nVar.getViewPager().getWidth() : nVar.getViewPager().getHeight();
        int iDoubleValue = (int) ((AbstractC38369h4.d) abstractC38369h4).f375273c.f374165a.f376606a.a(eVar).doubleValue();
        float fR2 = C37931a.R(divPager.f371818n, displayMetrics, eVar);
        float f12 = (1 - (iDoubleValue / 100.0f)) * width;
        float f13 = 2;
        return (f12 - (fR2 * f13)) / f13;
    }

    public static Integer e(DivPager divPager, com.yandex.div.json.expressions.e eVar) {
        C38236a4 c38236a4;
        C38561t4 c38561t4;
        com.yandex.div.json.expressions.b<Double> bVar;
        Double dA2;
        AbstractC38369h4 abstractC38369h4 = divPager.f371820p;
        AbstractC38369h4.d dVar = abstractC38369h4 instanceof AbstractC38369h4.d ? (AbstractC38369h4.d) abstractC38369h4 : null;
        if (dVar == null || (c38236a4 = dVar.f375273c) == null || (c38561t4 = c38236a4.f374165a) == null || (bVar = c38561t4.f376606a) == null || (dA2 = bVar.a(eVar)) == null) {
            return null;
        }
        return Integer.valueOf((int) dA2.doubleValue());
    }

    public final void c(@Y61.k com.yandex.div.core.view2.divs.widgets.n nVar, @Y61.k DivPager divPager, @Y61.k C38029k c38029k, @Y61.k com.yandex.div.core.state.f fVar) {
        int iIntValue;
        String str = divPager.f371817m;
        if (str != null) {
            this.f368650f.f368025a.put(str, nVar);
        }
        com.yandex.div.json.expressions.e expressionResolver = c38029k.getExpressionResolver();
        DivPager div = nVar.getDiv();
        if (divPager.equals(div)) {
            RecyclerView.Adapter adapter = nVar.getViewPager().getAdapter();
            if (adapter == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.yandex.div.core.view2.divs.DivPagerBinder.PagerAdapter");
            }
            c cVar = (c) adapter;
            cVar.j(this.f368648d);
            cVar.notifyItemRangeChanged(0, cVar.f368845d.size());
            return;
        }
        F21.b bVarA = com.yandex.div.core.util.e.a(nVar);
        bVarA.g();
        nVar.setDiv$div_release(divPager);
        C38006w c38006w = this.f368645a;
        if (div != null) {
            c38006w.h(c38029k, nVar, div);
        }
        c38006w.d(nVar, divPager, div, c38029k);
        SparseArray sparseArray = new SparseArray();
        nVar.setRecycledViewPool(new J2(c38029k.getReleaseViewVisitor$div_release()));
        nVar.getViewPager().setAdapter(new c(divPager.f371819o, c38029k, (C38040w) this.f368647c.get(), new e(sparseArray, divPager, expressionResolver), this.f368646b, fVar, c38029k.getReleaseViewVisitor$div_release()));
        h hVar = new h(sparseArray, this, nVar, expressionResolver, divPager);
        com.yandex.div2.Y0 y02 = divPager.f371823s;
        bVarA.e(y02.f374037b.d(expressionResolver, hVar));
        bVarA.e(y02.f374038c.d(expressionResolver, hVar));
        bVarA.e(y02.f374039d.d(expressionResolver, hVar));
        bVarA.e(y02.f374036a.d(expressionResolver, hVar));
        C38502q1 c38502q1 = divPager.f371818n;
        bVarA.e(c38502q1.f376152b.d(expressionResolver, hVar));
        bVarA.e(c38502q1.f376151a.d(expressionResolver, hVar));
        AbstractC38369h4 abstractC38369h4 = divPager.f371820p;
        if (abstractC38369h4 instanceof AbstractC38369h4.c) {
            AbstractC38369h4.c cVar2 = (AbstractC38369h4.c) abstractC38369h4;
            bVarA.e(cVar2.f375272c.f373781a.f376152b.d(expressionResolver, hVar));
            bVarA.e(cVar2.f375272c.f373781a.f376151a.d(expressionResolver, hVar));
        } else {
            if (!(abstractC38369h4 instanceof AbstractC38369h4.d)) {
                throw new NoWhenBranchMatchedException();
            }
            bVarA.e(((AbstractC38369h4.d) abstractC38369h4).f375273c.f374165a.f376606a.d(expressionResolver, hVar));
            bVarA.e(new ViewOnLayoutChangeListenerC37996s1(nVar.getViewPager(), hVar));
        }
        kotlin.G0 g02 = kotlin.G0.f406611a;
        bVarA.e(divPager.f371822r.e(expressionResolver, new f(sparseArray, this, nVar, expressionResolver, divPager)));
        E2 e22 = this.f368653i;
        if (e22 != null) {
            ViewPager2 viewPager = nVar.getViewPager();
            ViewPager2.i iVar = e22.f368053d;
            if (iVar != null) {
                viewPager.i(iVar);
            }
            e22.f368053d = null;
        }
        E2 e23 = new E2(c38029k, divPager, this.f368649e);
        ViewPager2 viewPager2 = nVar.getViewPager();
        E2.a aVar = e23.new a();
        viewPager2.e(aVar);
        e23.f368053d = aVar;
        this.f368653i = e23;
        if (this.f368652h != null) {
            nVar.getViewPager().i(this.f368652h);
        }
        View childAt = nVar.getViewPager().getChildAt(0);
        if (childAt == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        this.f368652h = new a(divPager, c38029k, (RecyclerView) childAt);
        nVar.getViewPager().e(this.f368652h);
        com.yandex.div.core.state.k currentState = c38029k.getCurrentState();
        if (currentState != null) {
            String strValueOf = str == null ? String.valueOf(divPager.hashCode()) : str;
            com.yandex.div.core.state.m mVar = (com.yandex.div.core.state.m) currentState.a(strValueOf);
            if (this.f368651g != null) {
                nVar.getViewPager().i(this.f368651g);
            }
            this.f368651g = new com.yandex.div.core.state.p(strValueOf, currentState);
            nVar.getViewPager().e(this.f368651g);
            Integer numValueOf = mVar != null ? Integer.valueOf(mVar.f367670a) : null;
            if (numValueOf == null) {
                long jLongValue = divPager.f371812h.a(expressionResolver).longValue();
                long j12 = jLongValue >> 31;
                if (j12 == 0 || j12 == -1) {
                    iIntValue = (int) jLongValue;
                } else {
                    int i12 = com.yandex.div.internal.n.f370123a;
                    iIntValue = jLongValue > 0 ? Integer.MAX_VALUE : BeduinInputModel.MIN_TEXT_VERSION;
                }
            } else {
                iIntValue = numValueOf.intValue();
            }
            nVar.setCurrentItem$div_release(iIntValue);
        }
        bVarA.e(divPager.f371824t.e(expressionResolver, new g(nVar)));
    }
}
