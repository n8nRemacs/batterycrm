package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes8.dex */
public final class b51 {

    /* renamed from: h, reason: collision with root package name */
    private static final Comparator<a> f383789h = new A(0);

    /* renamed from: i, reason: collision with root package name */
    private static final Comparator<a> f383790i = new A(1);

    /* renamed from: a, reason: collision with root package name */
    private final int f383791a;

    /* renamed from: e, reason: collision with root package name */
    private int f383795e;

    /* renamed from: f, reason: collision with root package name */
    private int f383796f;

    /* renamed from: g, reason: collision with root package name */
    private int f383797g;

    /* renamed from: c, reason: collision with root package name */
    private final a[] f383793c = new a[5];

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<a> f383792b = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    private int f383794d = -1;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f383798a;

        /* renamed from: b, reason: collision with root package name */
        public int f383799b;

        /* renamed from: c, reason: collision with root package name */
        public float f383800c;

        private a() {
        }

        public /* synthetic */ a(int i12) {
            this();
        }
    }

    public b51(int i12) {
        this.f383791a = i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(a aVar, a aVar2) {
        return aVar.f383798a - aVar2.f383798a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int b(a aVar, a aVar2) {
        return Float.compare(aVar.f383800c, aVar2.f383800c);
    }

    public final void a(int i12, float f12) {
        a aVar;
        if (this.f383794d != 1) {
            Collections.sort(this.f383792b, f383789h);
            this.f383794d = 1;
        }
        int i13 = this.f383797g;
        int i14 = 0;
        if (i13 > 0) {
            a[] aVarArr = this.f383793c;
            int i15 = i13 - 1;
            this.f383797g = i15;
            aVar = aVarArr[i15];
        } else {
            aVar = new a(i14);
        }
        int i16 = this.f383795e;
        this.f383795e = i16 + 1;
        aVar.f383798a = i16;
        aVar.f383799b = i12;
        aVar.f383800c = f12;
        this.f383792b.add(aVar);
        this.f383796f += i12;
        while (true) {
            int i17 = this.f383796f;
            int i18 = this.f383791a;
            if (i17 <= i18) {
                return;
            }
            int i19 = i17 - i18;
            a aVar2 = this.f383792b.get(0);
            int i22 = aVar2.f383799b;
            if (i22 <= i19) {
                this.f383796f -= i22;
                this.f383792b.remove(0);
                int i23 = this.f383797g;
                if (i23 < 5) {
                    a[] aVarArr2 = this.f383793c;
                    this.f383797g = i23 + 1;
                    aVarArr2[i23] = aVar2;
                }
            } else {
                aVar2.f383799b = i22 - i19;
                this.f383796f -= i19;
            }
        }
    }

    public final void b() {
        this.f383792b.clear();
        this.f383794d = -1;
        this.f383795e = 0;
        this.f383796f = 0;
    }

    public final float a() {
        if (this.f383794d != 0) {
            Collections.sort(this.f383792b, f383790i);
            this.f383794d = 0;
        }
        float f12 = 0.5f * this.f383796f;
        int i12 = 0;
        for (int i13 = 0; i13 < this.f383792b.size(); i13++) {
            a aVar = this.f383792b.get(i13);
            i12 += aVar.f383799b;
            if (i12 >= f12) {
                return aVar.f383800c;
            }
        }
        if (this.f383792b.isEmpty()) {
            return Float.NaN;
        }
        return ((a) androidx.appcompat.app.r.j(1, this.f383792b)).f383800c;
    }
}
