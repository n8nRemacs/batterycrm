package com.google.android.exoplayer2;

import com.google.android.exoplayer2.util.C36585a;
import j.InterfaceC42167x;
import java.util.Arrays;

/* compiled from: PercentageRating.java */
/* loaded from: classes6.dex */
public final class a0 extends g0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f343742c;

    public a0() {
        this.f343742c = -1.0f;
    }

    public final boolean equals(@j.P Object obj) {
        if (obj instanceof a0) {
            return this.f343742c == ((a0) obj).f343742c;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f343742c)});
    }

    public a0(@InterfaceC42167x float f12) {
        C36585a.a("percent must be in the range of [0, 100]", f12 >= 0.0f && f12 <= 100.0f);
        this.f343742c = f12;
    }
}
