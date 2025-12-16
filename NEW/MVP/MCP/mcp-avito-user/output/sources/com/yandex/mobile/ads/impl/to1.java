package com.yandex.mobile.ads.impl;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class to1 extends j6 {

    /* renamed from: k, reason: collision with root package name */
    private static final Pattern f390263k = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a, reason: collision with root package name */
    private final l6 f390264a;

    /* renamed from: b, reason: collision with root package name */
    private final k6 f390265b;

    /* renamed from: d, reason: collision with root package name */
    private xo1 f390267d;

    /* renamed from: e, reason: collision with root package name */
    private o6 f390268e;

    /* renamed from: i, reason: collision with root package name */
    private boolean f390272i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f390273j;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f390266c = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private boolean f390269f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f390270g = false;

    /* renamed from: h, reason: collision with root package name */
    private final String f390271h = UUID.randomUUID().toString();

    public to1(k6 k6Var, l6 l6Var) {
        o6 yo1Var;
        this.f390265b = k6Var;
        this.f390264a = l6Var;
        b(null);
        if (l6Var.a() == m6.f387864b || l6Var.a() == m6.f387866d) {
            yo1Var = new yo1(l6Var.h());
        } else {
            yo1Var = new cp1(l6Var.e(), l6Var.d());
        }
        this.f390268e = yo1Var;
        this.f390268e.a();
        uo1.a().a(this);
        this.f390268e.a(k6Var);
    }

    private void b(View view) {
        this.f390267d = new xo1(view);
    }

    public final void a(@j.N JSONObject jSONObject) {
        if (this.f390273j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
        wp1.b(this.f390268e.e(), jSONObject);
        this.f390273j = true;
    }

    public final ArrayList c() {
        return this.f390266c;
    }

    public final void d() {
        if (this.f390272i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
        wp1.b(this.f390268e.e());
        this.f390272i = true;
    }

    public final View e() {
        return this.f390267d.get();
    }

    public final boolean f() {
        return this.f390269f && !this.f390270g;
    }

    public final boolean g() {
        return this.f390269f;
    }

    public final String h() {
        return this.f390271h;
    }

    public final o6 i() {
        return this.f390268e;
    }

    public final boolean j() {
        return this.f390270g;
    }

    public final boolean k() {
        return this.f390265b.b();
    }

    public final boolean l() {
        return this.f390265b.c();
    }

    @Override // com.yandex.mobile.ads.impl.j6
    public final void b() {
        if (this.f390269f) {
            return;
        }
        this.f390269f = true;
        uo1.a().b(this);
        wp1.a(this.f390268e.e(), cq1.a().d());
        this.f390268e.a(this, this.f390264a);
    }

    @Override // com.yandex.mobile.ads.impl.j6
    public final void a(View view, dx dxVar, @j.P String str) {
        lp1 lp1Var;
        if (this.f390270g) {
            return;
        }
        if (str != null) {
            if (str.length() > 50) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if (!f390263k.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
        Iterator it = this.f390266c.iterator();
        while (true) {
            if (!it.hasNext()) {
                lp1Var = null;
                break;
            } else {
                lp1Var = (lp1) it.next();
                if (lp1Var.a().get() == view) {
                    break;
                }
            }
        }
        if (lp1Var == null) {
            this.f390266c.add(new lp1(view, dxVar, str));
        }
    }

    @Override // com.yandex.mobile.ads.impl.j6
    public final void a() {
        if (this.f390270g) {
            return;
        }
        this.f390267d.clear();
        if (!this.f390270g) {
            this.f390266c.clear();
        }
        this.f390270g = true;
        wp1.a(this.f390268e.e());
        uo1.a().c(this);
        this.f390268e.b();
        this.f390268e = null;
    }

    @Override // com.yandex.mobile.ads.impl.j6
    public final void a(View view) {
        if (this.f390270g || e() == view) {
            return;
        }
        b(view);
        this.f390268e.f();
        Collection<to1> collectionB = uo1.a().b();
        if (collectionB == null || collectionB.isEmpty()) {
            return;
        }
        for (to1 to1Var : collectionB) {
            if (to1Var != this && to1Var.e() == view) {
                to1Var.f390267d.clear();
            }
        }
    }
}
