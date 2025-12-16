package com.yandex.mobile.ads.impl;

import java.util.ArrayList;

/* loaded from: classes8.dex */
public abstract class we implements gn {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f391389a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<ua1> f391390b = new ArrayList<>(1);

    /* renamed from: c, reason: collision with root package name */
    private int f391391c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    private kn f391392d;

    public we(boolean z12) {
        this.f391389a = z12;
    }

    @Override // com.yandex.mobile.ads.impl.gn
    public final void a(ua1 ua1Var) {
        ua1Var.getClass();
        if (this.f391390b.contains(ua1Var)) {
            return;
        }
        this.f391390b.add(ua1Var);
        this.f391391c++;
    }

    public final void b(kn knVar) {
        for (int i12 = 0; i12 < this.f391391c; i12++) {
            this.f391390b.get(i12).b();
        }
    }

    public final void c(kn knVar) {
        this.f391392d = knVar;
        for (int i12 = 0; i12 < this.f391391c; i12++) {
            this.f391390b.get(i12).b(knVar, this.f391389a);
        }
    }

    public final void f() {
        kn knVar = this.f391392d;
        int i12 = pc1.f388768a;
        for (int i13 = 0; i13 < this.f391391c; i13++) {
            this.f391390b.get(i13).a(knVar, this.f391389a);
        }
        this.f391392d = null;
    }

    public final void c(int i12) {
        kn knVar = this.f391392d;
        int i13 = pc1.f388768a;
        for (int i14 = 0; i14 < this.f391391c; i14++) {
            this.f391390b.get(i14).a(knVar, this.f391389a, i12);
        }
    }
}
