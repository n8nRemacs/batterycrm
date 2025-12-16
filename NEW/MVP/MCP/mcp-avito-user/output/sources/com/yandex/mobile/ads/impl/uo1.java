package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes8.dex */
public final class uo1 {

    /* renamed from: c, reason: collision with root package name */
    private static uo1 f390608c = new uo1();

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<to1> f390609a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<to1> f390610b = new ArrayList<>();

    private uo1() {
    }

    public static uo1 a() {
        return f390608c;
    }

    public final Collection<to1> b() {
        return Collections.unmodifiableCollection(this.f390609a);
    }

    public final Collection<to1> c() {
        return Collections.unmodifiableCollection(this.f390610b);
    }

    public final void a(to1 to1Var) {
        this.f390609a.add(to1Var);
    }

    public final void b(to1 to1Var) {
        boolean z12 = this.f390610b.size() > 0;
        this.f390610b.add(to1Var);
        if (z12) {
            return;
        }
        cq1.a().b();
    }

    public final void c(to1 to1Var) {
        boolean z12 = this.f390610b.size() > 0;
        this.f390609a.remove(to1Var);
        this.f390610b.remove(to1Var);
        if (!z12 || this.f390610b.size() > 0) {
            return;
        }
        cq1.a().c();
    }
}
