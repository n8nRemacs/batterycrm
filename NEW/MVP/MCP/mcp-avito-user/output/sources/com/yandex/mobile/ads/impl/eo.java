package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.h9;
import java.util.Arrays;
import shark.AndroidResourceIdNames;

/* loaded from: classes8.dex */
public final class eo implements h9 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f385038a;

    /* renamed from: b, reason: collision with root package name */
    private final int f385039b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private final byte[] f385040c;

    /* renamed from: d, reason: collision with root package name */
    private int f385041d;

    /* renamed from: e, reason: collision with root package name */
    private int f385042e;

    /* renamed from: f, reason: collision with root package name */
    private int f385043f;

    /* renamed from: g, reason: collision with root package name */
    private g9[] f385044g;

    public eo() {
        this(0);
    }

    public final synchronized void a(int i12) {
        boolean z12 = i12 < this.f385041d;
        this.f385041d = i12;
        if (z12) {
            e();
        }
    }

    public final int b() {
        return this.f385039b;
    }

    public final synchronized int c() {
        return this.f385042e * this.f385039b;
    }

    public final synchronized void d() {
        if (this.f385038a) {
            a(0);
        }
    }

    public final synchronized void e() {
        try {
            int i12 = 0;
            int iMax = Math.max(0, pc1.a(this.f385041d, this.f385039b) - this.f385042e);
            int i13 = this.f385043f;
            if (iMax >= i13) {
                return;
            }
            if (this.f385040c != null) {
                int i14 = i13 - 1;
                while (i12 <= i14) {
                    g9 g9Var = this.f385044g[i12];
                    g9Var.getClass();
                    if (g9Var.f385615a == this.f385040c) {
                        i12++;
                    } else {
                        g9 g9Var2 = this.f385044g[i14];
                        g9Var2.getClass();
                        if (g9Var2.f385615a != this.f385040c) {
                            i14--;
                        } else {
                            g9[] g9VarArr = this.f385044g;
                            g9VarArr[i12] = g9Var2;
                            g9VarArr[i14] = g9Var;
                            i14--;
                            i12++;
                        }
                    }
                }
                iMax = Math.max(iMax, i12);
                if (iMax >= this.f385043f) {
                    return;
                }
            }
            Arrays.fill(this.f385044g, iMax, this.f385043f, (Object) null);
            this.f385043f = iMax;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public eo(int i12) {
        this.f385038a = true;
        this.f385039b = AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        this.f385043f = 0;
        this.f385044g = new g9[100];
        this.f385040c = null;
    }

    public final synchronized g9 a() {
        g9 g9Var;
        try {
            int i12 = this.f385042e + 1;
            this.f385042e = i12;
            int i13 = this.f385043f;
            if (i13 > 0) {
                g9[] g9VarArr = this.f385044g;
                int i14 = i13 - 1;
                this.f385043f = i14;
                g9Var = g9VarArr[i14];
                g9Var.getClass();
                this.f385044g[this.f385043f] = null;
            } else {
                g9 g9Var2 = new g9(0, new byte[this.f385039b]);
                g9[] g9VarArr2 = this.f385044g;
                if (i12 > g9VarArr2.length) {
                    this.f385044g = (g9[]) Arrays.copyOf(g9VarArr2, g9VarArr2.length * 2);
                }
                g9Var = g9Var2;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return g9Var;
    }

    public final synchronized void a(g9 g9Var) {
        g9[] g9VarArr = this.f385044g;
        int i12 = this.f385043f;
        this.f385043f = i12 + 1;
        g9VarArr[i12] = g9Var;
        this.f385042e--;
        notifyAll();
    }

    public final synchronized void a(@j.P h9.a aVar) {
        while (aVar != null) {
            try {
                g9[] g9VarArr = this.f385044g;
                int i12 = this.f385043f;
                this.f385043f = i12 + 1;
                g9VarArr[i12] = aVar.a();
                this.f385042e--;
                aVar = aVar.next();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        notifyAll();
    }
}
