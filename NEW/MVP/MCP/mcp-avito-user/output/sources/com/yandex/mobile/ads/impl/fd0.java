package com.yandex.mobile.ads.impl;

import androidx.media3.common.C23088b;

/* loaded from: classes8.dex */
public class fd0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f385280a;

    /* renamed from: b, reason: collision with root package name */
    public final int f385281b;

    /* renamed from: c, reason: collision with root package name */
    public final int f385282c;

    /* renamed from: d, reason: collision with root package name */
    public final long f385283d;

    /* renamed from: e, reason: collision with root package name */
    public final int f385284e;

    public fd0(Object obj) {
        this(obj, -1L);
    }

    public final fd0 a(Object obj) {
        return this.f385280a.equals(obj) ? this : new fd0(obj, this.f385281b, this.f385282c, this.f385283d, this.f385284e);
    }

    public final boolean equals(@j.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fd0)) {
            return false;
        }
        fd0 fd0Var = (fd0) obj;
        return this.f385280a.equals(fd0Var.f385280a) && this.f385281b == fd0Var.f385281b && this.f385282c == fd0Var.f385282c && this.f385283d == fd0Var.f385283d && this.f385284e == fd0Var.f385284e;
    }

    public final int hashCode() {
        return ((((((C23088b.a(527, 31, this.f385280a) + this.f385281b) * 31) + this.f385282c) * 31) + ((int) this.f385283d)) * 31) + this.f385284e;
    }

    public fd0(Object obj, long j12) {
        this(obj, -1, -1, j12, -1);
    }

    public fd0(int i12, long j12, Object obj) {
        this(obj, -1, -1, j12, i12);
    }

    public final boolean a() {
        return this.f385281b != -1;
    }

    public fd0(Object obj, int i12, int i13, long j12) {
        this(obj, i12, i13, j12, -1);
    }

    public fd0(fd0 fd0Var) {
        this.f385280a = fd0Var.f385280a;
        this.f385281b = fd0Var.f385281b;
        this.f385282c = fd0Var.f385282c;
        this.f385283d = fd0Var.f385283d;
        this.f385284e = fd0Var.f385284e;
    }

    private fd0(Object obj, int i12, int i13, long j12, int i14) {
        this.f385280a = obj;
        this.f385281b = i12;
        this.f385282c = i13;
        this.f385283d = j12;
        this.f385284e = i14;
    }
}
