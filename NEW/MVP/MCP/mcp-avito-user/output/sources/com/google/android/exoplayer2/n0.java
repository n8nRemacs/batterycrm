package com.google.android.exoplayer2;

import com.google.android.exoplayer2.util.C36585a;
import j.InterfaceC42167x;
import java.util.Arrays;

/* compiled from: StarRating.java */
/* loaded from: classes6.dex */
public final class n0 extends g0 {

    /* renamed from: c, reason: collision with root package name */
    @j.F
    public final int f345769c;

    /* renamed from: d, reason: collision with root package name */
    public final float f345770d;

    public n0(@j.F int i12) {
        C36585a.a("maxStars must be a positive integer", i12 > 0);
        this.f345769c = i12;
        this.f345770d = -1.0f;
    }

    public final boolean equals(@j.P Object obj) {
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return this.f345769c == n0Var.f345769c && this.f345770d == n0Var.f345770d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f345769c), Float.valueOf(this.f345770d)});
    }

    public n0(@j.F int i12, @InterfaceC42167x float f12) {
        boolean z12 = false;
        C36585a.a("maxStars must be a positive integer", i12 > 0);
        if (f12 >= 0.0f && f12 <= i12) {
            z12 = true;
        }
        C36585a.a("starRating is out of range [0, maxStars]", z12);
        this.f345769c = i12;
        this.f345770d = f12;
    }
}
