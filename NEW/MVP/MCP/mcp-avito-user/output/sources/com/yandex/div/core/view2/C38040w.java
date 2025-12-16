package com.yandex.div.core.view2;

import I21.b;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import com.yandex.div.core.view2.divs.C2;
import com.yandex.div.core.view2.divs.C37931a;
import com.yandex.div.core.view2.divs.C37962h2;
import com.yandex.div.core.view2.divs.C37990q0;
import com.yandex.div.core.view2.divs.C37991q1;
import com.yandex.div.core.view2.divs.C37998t0;
import com.yandex.div.core.view2.divs.C38006w;
import com.yandex.div.core.view2.divs.C38015x0;
import com.yandex.div.core.view2.divs.F0;
import com.yandex.div.core.view2.divs.G1;
import com.yandex.div.core.view2.divs.K0;
import com.yandex.div.core.view2.divs.K1;
import com.yandex.div.core.view2.divs.M1;
import com.yandex.div.core.view2.divs.R0;
import com.yandex.div.core.view2.divs.T0;
import com.yandex.div.core.view2.divs.Z1;
import com.yandex.div.core.view2.divs.y2;
import com.yandex.div.core.view2.divs.z2;
import com.yandex.div.json.ParsingException;
import com.yandex.div2.AbstractC38330g;
import com.yandex.div2.C38383i8;
import com.yandex.div2.n8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import u21.C48774a;
import u21.InterfaceC48776c;

/* compiled from: DivBinder.kt */
@com.yandex.div.core.dagger.z
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0011\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/view2/w;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div.core.view2.w, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38040w {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final L f369184a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C37962h2 f369185b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C37990q0 f369186c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final K1 f369187d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final K0 f369188e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C38015x0 f369189f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final F0 f369190g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.core.view2.divs.gallery.a f369191h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final C37991q1 f369192i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.core.view2.divs.tabs.c f369193j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final Z1 f369194k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final C37998t0 f369195l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final R0 f369196m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final M1 f369197n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final T0 f369198o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final G1 f369199p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final z2 f369200q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final C48774a f369201r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final C2 f369202s;

    @Inject
    public C38040w(@Y61.k L l12, @Y61.k C37962h2 c37962h2, @Y61.k C37990q0 c37990q0, @Y61.k K1 k12, @Y61.k K0 k02, @Y61.k C38015x0 c38015x0, @Y61.k F0 f02, @Y61.k com.yandex.div.core.view2.divs.gallery.a aVar, @Y61.k C37991q1 c37991q1, @Y61.k com.yandex.div.core.view2.divs.tabs.c cVar, @Y61.k Z1 z12, @Y61.k C37998t0 c37998t0, @Y61.k R0 r02, @Y61.k M1 m12, @Y61.k T0 t02, @Y61.k G1 g12, @Y61.k z2 z2Var, @Y61.k C48774a c48774a, @Y61.k C2 c22) {
        this.f369184a = l12;
        this.f369185b = c37962h2;
        this.f369186c = c37990q0;
        this.f369187d = k12;
        this.f369188e = k02;
        this.f369189f = c38015x0;
        this.f369190g = f02;
        this.f369191h = aVar;
        this.f369192i = c37991q1;
        this.f369193j = cVar;
        this.f369194k = z12;
        this.f369195l = c37998t0;
        this.f369196m = r02;
        this.f369197n = m12;
        this.f369198o = t02;
        this.f369199p = g12;
        this.f369200q = z2Var;
        this.f369201r = c48774a;
        this.f369202s = c22;
    }

    @j.K
    public final void a() {
        C2 c22 = this.f369202s;
        WeakHashMap<String, com.yandex.div.core.view2.divs.widgets.n> weakHashMap = c22.f368025a;
        Iterator<Map.Entry<String, com.yandex.div.core.view2.divs.widgets.n>> it = weakHashMap.entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            WeakHashMap<String, List<com.yandex.div.core.view2.divs.widgets.m>> weakHashMap2 = c22.f368026b;
            if (!zHasNext) {
                weakHashMap.clear();
                weakHashMap2.clear();
                return;
            }
            Map.Entry<String, com.yandex.div.core.view2.divs.widgets.n> next = it.next();
            String key = next.getKey();
            com.yandex.div.core.view2.divs.widgets.n value = next.getValue();
            List<com.yandex.div.core.view2.divs.widgets.m> list = weakHashMap2.get(key);
            if (list != null) {
                for (com.yandex.div.core.view2.divs.widgets.m mVar : list) {
                    ViewPager2 viewPager = value.getViewPager();
                    ViewPager2 viewPager2 = mVar.f7898c;
                    if (viewPager2 != viewPager) {
                        b.a aVar = mVar.f7900e;
                        if (viewPager2 != null) {
                            viewPager2.i(aVar);
                        }
                        if (viewPager.getAdapter() == null) {
                            throw new IllegalArgumentException("Attached pager adapter is null!");
                        }
                        viewPager.e(aVar);
                        mVar.f7898c = viewPager;
                        I21.a aVar2 = mVar.f7897b;
                        if (aVar2 != null) {
                            mVar.a(aVar2);
                        }
                    }
                }
            }
        }
    }

    @j.K
    public final void b(@Y61.k View view, @Y61.k AbstractC38330g abstractC38330g, @Y61.k C38029k c38029k, @Y61.k com.yandex.div.core.state.f fVar) {
        C48774a c48774a = this.f369201r;
        try {
            if (!this.f369184a.m(abstractC38330g, c38029k.getExpressionResolver()).booleanValue()) {
                com.yandex.div2.H hA2 = abstractC38330g.a();
                C37931a.f(view, hA2.getF374474u(), c38029k.getExpressionResolver());
                return;
            }
            com.yandex.div2.H hA3 = abstractC38330g.a();
            if (c48774a.b(hA3)) {
                for (InterfaceC48776c interfaceC48776c : c48774a.f439734a) {
                    if (interfaceC48776c.matches(hA3)) {
                        interfaceC48776c.beforeBindView(c38029k, view, hA3);
                    }
                }
            }
            if (abstractC38330g instanceof AbstractC38330g.q) {
                this.f369185b.j((com.yandex.div.core.view2.divs.widgets.k) view, ((AbstractC38330g.q) abstractC38330g).f375029c, c38029k);
            } else if (abstractC38330g instanceof AbstractC38330g.h) {
                this.f369188e.d((com.yandex.div.core.view2.divs.widgets.i) view, ((AbstractC38330g.h) abstractC38330g).f375020c, c38029k);
            } else if (abstractC38330g instanceof AbstractC38330g.f) {
                this.f369189f.a((com.yandex.div.core.view2.divs.widgets.g) view, ((AbstractC38330g.f) abstractC38330g).f375018c, c38029k);
            } else if (abstractC38330g instanceof AbstractC38330g.m) {
                this.f369187d.a((com.yandex.div.core.view2.divs.widgets.q) view, ((AbstractC38330g.m) abstractC38330g).f375025c, c38029k);
            } else if (abstractC38330g instanceof AbstractC38330g.c) {
                this.f369186c.b((ViewGroup) view, ((AbstractC38330g.c) abstractC38330g).f375015c, c38029k, fVar);
            } else if (abstractC38330g instanceof AbstractC38330g.C10942g) {
                this.f369190g.b((com.yandex.div.core.view2.divs.widgets.h) view, ((AbstractC38330g.C10942g) abstractC38330g).f375019c, c38029k, fVar);
            } else if (abstractC38330g instanceof AbstractC38330g.e) {
                this.f369191h.b((com.yandex.div.core.view2.divs.widgets.o) view, ((AbstractC38330g.e) abstractC38330g).f375017c, c38029k, fVar);
            } else if (abstractC38330g instanceof AbstractC38330g.k) {
                this.f369192i.c((com.yandex.div.core.view2.divs.widgets.n) view, ((AbstractC38330g.k) abstractC38330g).f375023c, c38029k, fVar);
            } else if (abstractC38330g instanceof AbstractC38330g.p) {
                this.f369193j.c((com.yandex.div.internal.widget.tabs.z) view, ((AbstractC38330g.p) abstractC38330g).f375028c, c38029k, this, fVar);
            } else if (abstractC38330g instanceof AbstractC38330g.o) {
                this.f369194k.a((com.yandex.div.core.view2.divs.widgets.t) view, ((AbstractC38330g.o) abstractC38330g).f375027c, c38029k, fVar);
            } else if (abstractC38330g instanceof AbstractC38330g.d) {
                c(view, ((AbstractC38330g.d) abstractC38330g).f375016c, c38029k);
            } else if (abstractC38330g instanceof AbstractC38330g.i) {
                this.f369196m.b((com.yandex.div.core.view2.divs.widgets.m) view, ((AbstractC38330g.i) abstractC38330g).f375021c, c38029k);
            } else if (abstractC38330g instanceof AbstractC38330g.n) {
                this.f369197n.a((com.yandex.div.core.view2.divs.widgets.r) view, ((AbstractC38330g.n) abstractC38330g).f375026c, c38029k);
            } else if (abstractC38330g instanceof AbstractC38330g.j) {
                this.f369198o.a((com.yandex.div.core.view2.divs.widgets.j) view, ((AbstractC38330g.j) abstractC38330g).f375022c, c38029k);
            } else if (abstractC38330g instanceof AbstractC38330g.l) {
                this.f369199p.a((com.yandex.div.core.view2.divs.widgets.p) view, ((AbstractC38330g.l) abstractC38330g).f375024c, c38029k);
            } else {
                if (!(abstractC38330g instanceof AbstractC38330g.r)) {
                    throw new NoWhenBranchMatchedException();
                }
                d(view, ((AbstractC38330g.r) abstractC38330g).f375030c, c38029k);
            }
            G0 g02 = G0.f406611a;
            if (abstractC38330g instanceof AbstractC38330g.d) {
                return;
            }
            c48774a.a(c38029k, view, abstractC38330g.a());
        } catch (ParsingException e12) {
            if (!com.yandex.div.core.expression.b.a(e12)) {
                throw e12;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(android.view.View r11, com.yandex.div2.C38584w0 r12, com.yandex.div.core.view2.C38029k r13) {
        /*
            r10 = this;
            com.yandex.div.core.view2.divs.t0 r0 = r10.f369195l
            r0.getClass()
            boolean r1 = r11 instanceof com.yandex.div.core.view2.divs.widgets.f
            if (r1 != 0) goto Ld
            int r11 = com.yandex.div.internal.n.f370123a
            goto Lcc
        Ld:
            r1 = r11
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            int r2 = r1.getChildCount()
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L1d
            android.view.View r2 = androidx.core.view.o0.a(r1, r3)
            goto L1e
        L1d:
            r2 = r4
        L1e:
            r5 = 2131365278(0x7f0a0d9e, float:1.8350417E38)
            if (r2 != 0) goto L25
            r6 = r4
            goto L29
        L25:
            java.lang.Object r6 = r2.getTag(r5)
        L29:
            boolean r7 = r6 instanceof com.yandex.div2.C38584w0
            if (r7 == 0) goto L30
            com.yandex.div2.w0 r6 = (com.yandex.div2.C38584w0) r6
            goto L31
        L30:
            r6 = r4
        L31:
            boolean r7 = kotlin.jvm.internal.L.f(r6, r12)
            if (r7 == 0) goto L39
            goto Lcc
        L39:
            com.yandex.div.core.view2.divs.w r7 = r0.f368720a
            if (r6 == 0) goto L40
            r7.h(r13, r2, r6)
        L40:
            r7.d(r11, r12, r4, r13)
            com.yandex.div.core.dagger.j r6 = r13.getViewComponent()
            com.yandex.div.core.view2.S r6 = r6.f()
            int r6 = r6.a(r4)
            r11.setTag(r4)
            r11.setId(r6)
            com.yandex.div.core.U r11 = r0.f368722c
            if (r11 != 0) goto L5b
            goto Lc7
        L5b:
            java.lang.String r6 = r12.f376856i
            boolean r7 = r11.isCustomTypeSupported(r6)
            r8 = 1
            if (r7 != r8) goto Lc7
            if (r2 != 0) goto L67
            goto L80
        L67:
            java.lang.Object r7 = r2.getTag(r5)
            boolean r9 = r7 instanceof com.yandex.div2.C38584w0
            if (r9 == 0) goto L72
            r4 = r7
            com.yandex.div2.w0 r4 = (com.yandex.div2.C38584w0) r4
        L72:
            if (r4 != 0) goto L76
            r4 = r3
            goto L7c
        L76:
            java.lang.String r4 = r4.f376856i
            boolean r4 = kotlin.jvm.internal.L.f(r4, r6)
        L7c:
            if (r4 != r8) goto L80
            r4 = r2
            goto L87
        L80:
            android.view.View r4 = r11.createView(r12, r13)
            r4.setTag(r5, r12)
        L87:
            r11.bindView(r4, r12, r13)
            boolean r11 = kotlin.jvm.internal.L.f(r2, r4)
            if (r11 != 0) goto Lc1
            com.yandex.div.core.dagger.j r11 = r13.getViewComponent()
            com.yandex.div.core.view2.S r11 = r11.f()
            java.lang.String r2 = r12.f376861n
            int r11 = r11.a(r2)
            r4.setTag(r2)
            r4.setId(r11)
            int r11 = r1.getChildCount()
            if (r11 == 0) goto Lb8
            com.yandex.div.core.view2.divs.widgets.D r11 = r13.getReleaseViewVisitor$div_release()
            android.view.View r2 = androidx.core.view.o0.a(r1, r3)
            com.yandex.div.core.view2.divs.widgets.x.a(r11, r2)
            r1.removeViewAt(r3)
        Lb8:
            android.view.ViewGroup$LayoutParams r11 = new android.view.ViewGroup$LayoutParams
            r2 = -1
            r11.<init>(r2, r2)
            r1.addView(r4, r11)
        Lc1:
            u21.a r11 = r0.f368723d
            r11.a(r13, r4, r12)
            goto Lcc
        Lc7:
            com.yandex.div.core.W r11 = r0.f368721b
            r11.a(r13)
        Lcc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.C38040w.c(android.view.View, com.yandex.div2.w0, com.yandex.div.core.view2.k):void");
    }

    public final void d(View view, C38383i8 c38383i8, C38029k c38029k) {
        com.yandex.div.core.player.i iVar;
        z2 z2Var;
        C38383i8 c38383i82;
        com.yandex.div.core.view2.divs.widgets.v vVar = (com.yandex.div.core.view2.divs.widgets.v) view;
        z2 z2Var2 = this.f369200q;
        z2Var2.getClass();
        C38383i8 div = vVar.getDiv();
        if (c38383i8.equals(div)) {
            return;
        }
        com.yandex.div.json.expressions.e expressionResolver = c38029k.getExpressionResolver();
        vVar.g();
        vVar.setDiv$div_release(c38383i8);
        C38006w c38006w = z2Var2.f369052a;
        if (div != null) {
            c38006w.h(c38029k, vVar, div);
        }
        vVar.removeAllViews();
        com.yandex.div.core.player.c cVarH = c38029k.getDiv2Component().h();
        List<n8> list = c38383i8.f375352F;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (n8 n8Var : list) {
            Uri uriA = n8Var.f375874d.a(expressionResolver);
            String strA = n8Var.f375872b.a(expressionResolver);
            n8.c cVar = n8Var.f375873c;
            if (cVar == null) {
                z2Var = z2Var2;
                c38383i82 = div;
                iVar = null;
            } else {
                z2Var = z2Var2;
                int iLongValue = (int) cVar.f375881b.a(expressionResolver).longValue();
                Long lA2 = cVar.f375880a.a(expressionResolver);
                c38383i82 = div;
                iVar = new com.yandex.div.core.player.i(iLongValue, (int) lA2.longValue());
            }
            com.yandex.div.json.expressions.b<Long> bVar = n8Var.f375871a;
            arrayList.add(new com.yandex.div.core.player.j(uriA, strA, iVar, bVar == null ? null : bVar.a(expressionResolver)));
            div = c38383i82;
            z2Var2 = z2Var;
        }
        z2 z2Var3 = z2Var2;
        c38383i8.f375361e.a(expressionResolver).getClass();
        c38383i8.f375375s.a(expressionResolver).getClass();
        c38383i8.f375378v.a(expressionResolver).getClass();
        com.yandex.div.core.player.b bVarA = cVarH.a();
        vVar.addView(c38029k.getDiv2Component().h().b(vVar.getContext()));
        c38006w.d(vVar, c38383i8, div, c38029k);
        String str = c38383i8.f375367k;
        if (str == null) {
            return;
        }
        vVar.e(z2Var3.f369053b.a(c38029k, str, new y2(bVarA)));
    }
}
