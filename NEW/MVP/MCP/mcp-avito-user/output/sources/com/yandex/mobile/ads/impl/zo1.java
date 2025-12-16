package com.yandex.mobile.ads.impl;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes8.dex */
public final class zo1 {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f392320a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<View, a> f392321b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f392322c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet<View> f392323d = new HashSet<>();

    /* renamed from: e, reason: collision with root package name */
    private final HashSet<String> f392324e = new HashSet<>();

    /* renamed from: f, reason: collision with root package name */
    private final HashSet<String> f392325f = new HashSet<>();

    /* renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f392326g = new HashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private final WeakHashMap f392327h = new WeakHashMap();

    /* renamed from: i, reason: collision with root package name */
    private boolean f392328i;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final lp1 f392329a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f392330b = new ArrayList<>();

        public a(lp1 lp1Var, String str) {
            this.f392329a = lp1Var;
            a(str);
        }

        public final lp1 a() {
            return this.f392329a;
        }

        public final ArrayList<String> b() {
            return this.f392330b;
        }

        public final void a(String str) {
            this.f392330b.add(str);
        }
    }

    public final String a(View view) {
        if (this.f392320a.size() == 0) {
            return null;
        }
        String str = this.f392320a.get(view);
        if (str != null) {
            this.f392320a.remove(view);
        }
        return str;
    }

    public final View b(String str) {
        return this.f392322c.get(str);
    }

    public final int c(View view) {
        if (this.f392323d.contains(view)) {
            return 1;
        }
        return this.f392328i ? 2 : 3;
    }

    public final void d() {
        this.f392320a.clear();
        this.f392321b.clear();
        this.f392322c.clear();
        this.f392323d.clear();
        this.f392324e.clear();
        this.f392325f.clear();
        this.f392326g.clear();
        this.f392328i = false;
    }

    public final void e() {
        this.f392328i = true;
    }

    public final String a(String str) {
        return this.f392326g.get(str);
    }

    public final a b(View view) {
        a aVar = this.f392321b.get(view);
        if (aVar != null) {
            this.f392321b.remove(view);
        }
        return aVar;
    }

    public final void c() {
        Boolean bool;
        String str;
        uo1 uo1VarA = uo1.a();
        if (uo1VarA != null) {
            for (to1 to1Var : uo1VarA.c()) {
                View viewE = to1Var.e();
                if (to1Var.f()) {
                    String strH = to1Var.h();
                    if (viewE != null) {
                        if (viewE.isAttachedToWindow()) {
                            if (viewE.hasWindowFocus()) {
                                this.f392327h.remove(viewE);
                                bool = Boolean.FALSE;
                            } else if (this.f392327h.containsKey(viewE)) {
                                bool = (Boolean) this.f392327h.get(viewE);
                            } else {
                                WeakHashMap weakHashMap = this.f392327h;
                                Boolean bool2 = Boolean.FALSE;
                                weakHashMap.put(viewE, bool2);
                                bool = bool2;
                            }
                            if (!bool.booleanValue()) {
                                HashSet hashSet = new HashSet();
                                View view = viewE;
                                while (true) {
                                    if (view == null) {
                                        this.f392323d.addAll(hashSet);
                                        str = null;
                                        break;
                                    }
                                    String strC = aq1.c(view);
                                    if (strC != null) {
                                        str = strC;
                                        break;
                                    } else {
                                        hashSet.add(view);
                                        Object parent = view.getParent();
                                        view = parent instanceof View ? (View) parent : null;
                                    }
                                }
                            } else {
                                str = "noWindowFocus";
                            }
                        } else {
                            str = "notAttached";
                        }
                        if (str == null) {
                            this.f392324e.add(strH);
                            this.f392320a.put(viewE, strH);
                            Iterator it = to1Var.c().iterator();
                            while (it.hasNext()) {
                                lp1 lp1Var = (lp1) it.next();
                                View view2 = lp1Var.a().get();
                                if (view2 != null) {
                                    a aVar = this.f392321b.get(view2);
                                    if (aVar != null) {
                                        aVar.a(to1Var.h());
                                    } else {
                                        this.f392321b.put(view2, new a(lp1Var, to1Var.h()));
                                    }
                                }
                            }
                        } else if (str != "noWindowFocus") {
                            this.f392325f.add(strH);
                            this.f392322c.put(strH, viewE);
                            this.f392326g.put(strH, str);
                        }
                    } else {
                        this.f392325f.add(strH);
                        this.f392326g.put(strH, "noAdView");
                    }
                }
            }
        }
    }

    public final boolean d(View view) {
        if (!this.f392327h.containsKey(view)) {
            return true;
        }
        this.f392327h.put(view, Boolean.TRUE);
        return false;
    }

    public final HashSet<String> a() {
        return this.f392324e;
    }

    public final HashSet<String> b() {
        return this.f392325f;
    }
}
