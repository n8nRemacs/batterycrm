package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.pm.PackageInfo;
import java.util.List;

/* renamed from: com.my.tracker.obfuscated.x, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37849x {

    /* renamed from: l, reason: collision with root package name */
    private static volatile C37849x f365854l;

    /* renamed from: b, reason: collision with root package name */
    private final l0 f365856b;

    /* renamed from: a, reason: collision with root package name */
    private final C37832f f365855a = new C37832f();

    /* renamed from: c, reason: collision with root package name */
    private final C37845t f365857c = new C37845t();

    /* renamed from: d, reason: collision with root package name */
    private final C37826a0 f365858d = new C37826a0();

    /* renamed from: e, reason: collision with root package name */
    private final i0 f365859e = new i0();

    /* renamed from: f, reason: collision with root package name */
    private final t0 f365860f = new t0();

    /* renamed from: g, reason: collision with root package name */
    private final n0 f365861g = new n0();

    /* renamed from: h, reason: collision with root package name */
    private final C37834h f365862h = new C37834h();

    /* renamed from: i, reason: collision with root package name */
    private final C37847v f365863i = new C37847v();

    /* renamed from: j, reason: collision with root package name */
    private final C37837k f365864j = new C37837k();

    /* renamed from: k, reason: collision with root package name */
    private final C37850y f365865k = new C37850y();

    private C37849x(f2 f2Var) {
        this.f365856b = new l0(f2Var);
    }

    public static C37849x a(f2 f2Var) {
        C37849x c37849x = f365854l;
        if (c37849x == null) {
            synchronized (C37849x.class) {
                try {
                    c37849x = f365854l;
                    if (c37849x == null) {
                        c37849x = new C37849x(f2Var);
                        f365854l = c37849x;
                    }
                } finally {
                }
            }
        }
        return c37849x;
    }

    public void b(Context context) {
        this.f365855a.c(context);
        this.f365856b.b(context);
        this.f365857c.d(context);
        this.f365858d.c(context);
        this.f365859e.c(context);
        this.f365860f.b(context);
        this.f365861g.b(context);
        this.f365862h.b(context);
        this.f365863i.b(context);
        this.f365864j.b(context);
        this.f365865k.b(context);
    }

    public void a(Context context) {
        this.f365855a.a(context);
        this.f365856b.a(context);
        this.f365857c.a(context);
        this.f365858d.a(context);
        this.f365859e.a(context);
        this.f365860f.a(context);
        this.f365861g.a(context);
        this.f365862h.a(context);
        this.f365863i.a(context);
        this.f365864j.a(context);
        this.f365865k.a(context);
    }

    public void a(a1 a1Var, Context context) {
        this.f365855a.a(a1Var, context);
        this.f365856b.a(a1Var, context);
        this.f365857c.a(a1Var, context);
        this.f365858d.a(a1Var, context);
        this.f365859e.a(a1Var, context);
        this.f365860f.a(a1Var, context);
        this.f365861g.a(a1Var, context);
        this.f365862h.a(a1Var, context);
        this.f365863i.c(a1Var, context);
        this.f365864j.a(a1Var, context);
        this.f365865k.a(a1Var, context);
    }

    public void a(List<PackageInfo> list, boolean z12, boolean z13) {
        this.f365862h.c(list);
        this.f365863i.a(z12);
        this.f365861g.a(z13);
    }
}
