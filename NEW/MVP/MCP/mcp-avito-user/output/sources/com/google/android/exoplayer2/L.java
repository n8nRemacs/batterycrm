package com.google.android.exoplayer2;

import java.util.Arrays;

/* compiled from: HeartRating.java */
/* loaded from: classes6.dex */
public final class L extends g0 {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f343525c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f343526d;

    public L() {
        this.f343525c = false;
        this.f343526d = false;
    }

    public final boolean equals(@j.P Object obj) {
        if (!(obj instanceof L)) {
            return false;
        }
        L l12 = (L) obj;
        return this.f343526d == l12.f343526d && this.f343525c == l12.f343525c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f343525c), Boolean.valueOf(this.f343526d)});
    }

    public L(boolean z12) {
        this.f343525c = true;
        this.f343526d = z12;
    }
}
