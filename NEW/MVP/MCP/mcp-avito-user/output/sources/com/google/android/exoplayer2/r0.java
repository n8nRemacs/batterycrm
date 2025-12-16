package com.google.android.exoplayer2;

import java.util.Arrays;

/* compiled from: ThumbRating.java */
/* loaded from: classes6.dex */
public final class r0 extends g0 {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f345865c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f345866d;

    public r0() {
        this.f345865c = false;
        this.f345866d = false;
    }

    public final boolean equals(@j.P Object obj) {
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return this.f345866d == r0Var.f345866d && this.f345865c == r0Var.f345865c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f345865c), Boolean.valueOf(this.f345866d)});
    }

    public r0(boolean z12) {
        this.f345865c = true;
        this.f345866d = z12;
    }
}
