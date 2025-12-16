package com.my.target;

import android.content.Context;
import android.widget.FrameLayout;
import e11.C39852a1;
import e11.C39883l;
import e11.C39884l0;
import e11.C39897p1;
import e11.C39906t;

/* loaded from: classes7.dex */
public class U {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public final C39897p1 f364613a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    public final Y0 f364614b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final Context f364615c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    public final C39906t f364616d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f364617e = true;

    public U(@j.N C39897p1 c39897p1, @j.P Y0 y02, @j.N Context context) {
        this.f364613a = c39897p1;
        this.f364614b = y02;
        this.f364615c = context;
        this.f364616d = new C39906t(context);
    }

    @j.N
    public final N0 a(@j.N C39884l0 c39884l0, @j.N m7 m7Var, @j.N C39852a1 c39852a1, @j.P FrameLayout frameLayout, @j.N b4 b4Var) {
        if (!c39884l0.f394672M.isEmpty()) {
            return new T0(((C39883l) c39884l0.f394672M.get(0)).f394670H, m7Var, c39852a1, b4Var, frameLayout, this.f364616d, this.f364615c);
        }
        if (c39884l0.f394673N == null) {
            return new Z0(m7Var, c39852a1, b4Var, frameLayout, this.f364616d, this.f364615c);
        }
        g1 g1Var = new g1(m7Var, c39852a1, b4Var, frameLayout, this.f364616d, this.f364615c);
        g1Var.addView(g1Var.f364488b);
        g1Var.addView(g1Var.f364494h);
        g1Var.addView(g1Var.f364495i);
        g1Var.addView(g1Var.f364499m);
        g1Var.addView(c39852a1);
        return g1Var;
    }
}
