package com.my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.iab.omid.library.corpmailru.adsession.CreativeType;
import com.my.target.C37778c;
import com.my.target.G;
import com.my.target.Y0;
import com.my.target.b4;
import com.my.target.k1;
import e11.AbstractC39895p;
import e11.B1;
import e11.C39848C;
import e11.C39865f;
import e11.C39872h0;
import e11.C39875i0;
import e11.C39877j;
import e11.C39883l;
import e11.C39884l0;
import e11.C39913v0;
import e11.J1;
import e11.ViewOnClickListenerC39879j1;
import e11.ViewOnClickListenerC39908t1;
import e11.e2;
import e11.k2;
import e11.p2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes7.dex */
public final class X extends AbstractC37792j {

    /* renamed from: d, reason: collision with root package name */
    @j.N
    public final ArrayList<C39865f> f364632d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f364633e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    public Y0 f364634f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    public C39884l0 f364635g;

    /* renamed from: h, reason: collision with root package name */
    @j.P
    public WeakReference<i1> f364636h;

    /* renamed from: i, reason: collision with root package name */
    @j.P
    public C37803o0 f364637i;

    public static class a implements C37778c.InterfaceC10786c, G.a, b4.b {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        public final X f364638a;

        public a(@j.N X x12) {
            this.f364638a = x12;
        }

        @Override // com.my.target.i1.a
        public final void a() {
            this.f364638a.b();
        }

        @Override // com.my.target.i1.a
        public final void b(@j.N AbstractC39895p abstractC39895p, @j.N View view) {
            X x12 = this.f364638a;
            C37803o0 c37803o0 = x12.f364637i;
            if (c37803o0 != null) {
                c37803o0.f();
            }
            e11.H0 h02 = abstractC39895p.f394703b;
            e2 e2Var = abstractC39895p.f394702a;
            C37803o0 c37803o02 = new C37803o0(h02, e2Var, true);
            x12.f364637i = c37803o02;
            c37803o02.f365051i = new W(x12, view);
            k2.a(view.getContext(), e2Var.e("playbackStarted"));
        }

        @Override // com.my.target.i1.a
        public final void d(@j.N AbstractC39895p abstractC39895p, @j.N Context context) {
            X x12 = this.f364638a;
            x12.getClass();
            k2.a(context, abstractC39895p.f394702a.e("closedByUser"));
            x12.b();
        }

        @Override // com.my.target.G.a
        public final void e(float f12, float f13, @j.N Context context) {
            ArrayList<C39865f> arrayList = this.f364638a.f364632d;
            if (arrayList.isEmpty()) {
                return;
            }
            float f14 = f13 - f12;
            ArrayList arrayList2 = new ArrayList();
            Iterator<C39865f> it = arrayList.iterator();
            while (it.hasNext()) {
                C39865f next = it.next();
                float f15 = next.f394592d;
                if (f15 < 0.0f) {
                    float f16 = next.f394593e;
                    if (f16 >= 0.0f) {
                        f15 = (f13 / 100.0f) * f16;
                    }
                }
                if (f15 >= 0.0f && f15 <= f14) {
                    arrayList2.add(next);
                    it.remove();
                }
            }
            k2.a(context, arrayList2);
        }

        @Override // com.my.target.i1.a
        public final void f(@j.P AbstractC39895p abstractC39895p, @j.P String str, @j.N Context context) {
            if (abstractC39895p != null) {
                X x12 = this.f364638a;
                if (x12.c() == null) {
                    return;
                }
                J1 j12 = new J1();
                if (TextUtils.isEmpty(str)) {
                    j12.a(abstractC39895p, abstractC39895p.f394697C, context);
                } else {
                    j12.a(abstractC39895p, str, context);
                }
                boolean z12 = abstractC39895p instanceof C39883l;
                if (z12) {
                    k2.a(context, x12.f364635g.f394702a.e("click"));
                }
                x12.f364875a.onClick();
                if (z12 || (abstractC39895p instanceof C39884l0)) {
                    C39884l0 c39884l0 = x12.f364635g;
                    if (c39884l0.f394673N != null ? false : c39884l0.f394677R) {
                        x12.b();
                    }
                }
            }
        }

        @Override // com.my.target.G.a
        public final void g(@j.N AbstractC39895p abstractC39895p, @j.N String str, @j.N Context context) {
            this.f364638a.getClass();
            k2.a(context, abstractC39895p.f394702a.e(str));
        }

        public final void h(@j.N Context context) {
            i1 c37778c;
            X x12 = this.f364638a;
            x12.f364875a.onVideoCompleted();
            if (!x12.f364876b) {
                x12.f364876b = true;
                k2.a(context, x12.f364635g.f394702a.e("reward"));
                k1.b bVar = x12.f364877c;
                if (bVar != null) {
                    bVar.c(new com.my.target.ads.f());
                }
            }
            p2 p2Var = x12.f364635g.f394674O;
            i1 i1VarC = x12.c();
            ViewParent parent = i1VarC != null ? i1VarC.j().getParent() : null;
            if (p2Var == null || !(parent instanceof ViewGroup)) {
                return;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            i1 i1VarC2 = x12.c();
            if (i1VarC2 != null) {
                i1VarC2.destroy();
            }
            if (p2Var instanceof C39848C) {
                viewGroup.removeAllViews();
                Y0 y02 = x12.f364634f;
                if (y02 != null) {
                    y02.f();
                }
                x12.f364634f = Y0.a(p2Var, 2, null, viewGroup.getContext());
                G e1Var = "mraid".equals(p2Var.f394725x) ? new e1(viewGroup.getContext()) : new A0(viewGroup.getContext());
                x12.f364636h = new WeakReference<>(e1Var);
                e1Var.h(new a(x12));
                e1Var.f((C39848C) p2Var);
                viewGroup.addView(e1Var.j(), new FrameLayout.LayoutParams(-1, -1));
                return;
            }
            if (!(p2Var instanceof e11.P)) {
                if (p2Var instanceof C39884l0) {
                    viewGroup.removeAllViews();
                    C39884l0 c39884l0 = (C39884l0) p2Var;
                    Y0 y03 = x12.f364634f;
                    if (y03 != null) {
                        y03.f();
                    }
                    C39913v0<com.my.target.common.models.e> c39913v0 = c39884l0.f394673N;
                    Y0 y0A = Y0.a(c39884l0, c39913v0 != null ? 3 : 2, c39913v0, viewGroup.getContext());
                    x12.f364634f = y0A;
                    int i12 = c39884l0.f394679T;
                    boolean z12 = x12.f364633e;
                    if (i12 != 2) {
                        C39872h0 c39872h0 = new C39872h0(y0A, viewGroup.getContext());
                        c39872h0.f394606c = z12;
                        c37778c = new C37778c(c39872h0, c39884l0, new a(x12), viewGroup.getContext());
                    } else {
                        U u12 = new U(c39884l0.f394671L, y0A, viewGroup.getContext());
                        u12.f364617e = z12;
                        b4 b4Var = new b4(u12, c39884l0, new a(x12));
                        s1 s1Var = b4Var.f364738k;
                        c37778c = b4Var;
                        if (s1Var != null) {
                            boolean z13 = s1Var.f365133c.f394863Q;
                            b4 b4Var2 = s1Var.f365132b;
                            if (z13) {
                                b4Var2.d();
                                s1Var.e();
                                c37778c = b4Var;
                            } else {
                                N0 n02 = b4Var2.f364732e;
                                n02.e(true);
                                n02.a(0, null);
                                n02.d(false);
                                b4Var2.f364734g.setVisible(false);
                                c37778c = b4Var;
                            }
                        }
                    }
                    x12.f364636h = new WeakReference<>(c37778c);
                    viewGroup.addView(c37778c.j(), new FrameLayout.LayoutParams(-1, -1));
                    x12.f364635g = c39884l0;
                    return;
                }
                return;
            }
            viewGroup.removeAllViews();
            e11.P p12 = (e11.P) p2Var;
            Y0 y04 = x12.f364634f;
            if (y04 != null) {
                y04.f();
            }
            x12.f364634f = Y0.a(p12, 2, null, viewGroup.getContext());
            Context context2 = viewGroup.getContext();
            a aVar = new a(x12);
            B1 b12 = new B1(context2);
            G0 g02 = new G0(b12, aVar);
            x12.f364636h = new WeakReference<>(g02);
            com.my.target.common.models.b bVar2 = p12.f394456O;
            com.my.target.common.models.b bVar3 = p12.f394455N;
            com.my.target.common.models.b bVar4 = p12.f394741H;
            B1 b13 = g02.f364397c;
            b13.f394289i = bVar2;
            b13.f394288h = bVar3;
            Bitmap bitmapA = bVar4 != null ? bVar4.a() : null;
            if (bitmapA != null) {
                e11.r rVar = b13.f394282b;
                rVar.a(bitmapA, true);
                RelativeLayout.LayoutParams layoutParams = b13.f394283c;
                int i13 = -rVar.getMeasuredWidth();
                layoutParams.leftMargin = i13;
                layoutParams.bottomMargin = i13;
            }
            b13.a();
            b13.setAgeRestrictions(p12.f394708g);
            b13.getImageView().setOnClickListener(new com.avito.android.verification.verification_input_inn.o(14, g02, p12));
            b13.getCloseButton().setOnClickListener(new ViewOnClickListenerC39879j1(g02, 1));
            C37788h c37788h = p12.f394698D;
            if (c37788h != null) {
                ViewOnClickListenerC39908t1 viewOnClickListenerC39908t1 = new ViewOnClickListenerC39908t1(g02, c37788h);
                C39875i0 c39875i0 = b13.f394287g;
                c39875i0.setVisibility(0);
                c39875i0.setImageBitmap(c37788h.f364851a.a());
                c39875i0.setOnClickListener(viewOnClickListenerC39908t1);
                ArrayList arrayList = c37788h.f364853c;
                if (arrayList != null) {
                    D d12 = new D(arrayList, new C39877j());
                    g02.f364398d = d12;
                    d12.f364362e = new F0(g02, p12);
                }
            }
            g02.f364396b.b(p12, b13);
            viewGroup.addView(b12, new FrameLayout.LayoutParams(-1, -1));
        }

        @Override // com.my.target.G.a
        public final void a(@j.N WebView webView) {
            X x12 = this.f364638a;
            Y0 y02 = x12.f364634f;
            if (y02 == null || y02.f364659a != CreativeType.HTML_DISPLAY) {
                return;
            }
            y02.c(webView, new Y0.c[0]);
            i1 i1VarC = x12.c();
            if (i1VarC == null) {
                return;
            }
            View closeButton = i1VarC.getCloseButton();
            if (closeButton != null) {
                x12.f364634f.e(new Y0.c(closeButton, 0));
            }
            x12.f364634f.g();
        }

        @Override // com.my.target.G.a
        public final void b(@j.N Context context) {
        }

        @Override // com.my.target.G.a
        public final void c() {
        }
    }

    public X(@j.N C39884l0 c39884l0, @j.N e11.W0 w02, boolean z12, @j.N k1.a aVar) {
        super(aVar);
        this.f364635g = c39884l0;
        this.f364633e = z12;
        ArrayList<C39865f> arrayList = new ArrayList<>();
        this.f364632d = arrayList;
        arrayList.addAll(c39884l0.f394702a.f());
    }

    @j.k0
    @j.P
    public final i1 c() {
        WeakReference<i1> weakReference = this.f364636h;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }
}
