package com.google.android.exoplayer2;

import com.google.android.exoplayer2.util.C36585a;
import j.InterfaceC42167x;
import java.util.Locale;

/* compiled from: PlaybackParameters.java */
/* loaded from: classes6.dex */
public final class c0 implements InterfaceC36525h {

    /* renamed from: e, reason: collision with root package name */
    public static final c0 f344179e = new c0(1.0f, 1.0f);

    /* renamed from: b, reason: collision with root package name */
    public final float f344180b;

    /* renamed from: c, reason: collision with root package name */
    public final float f344181c;

    /* renamed from: d, reason: collision with root package name */
    public final int f344182d;

    public c0(@InterfaceC42167x float f12, @InterfaceC42167x float f13) {
        C36585a.b(f12 > 0.0f);
        C36585a.b(f13 > 0.0f);
        this.f344180b = f12;
        this.f344181c = f13;
        this.f344182d = Math.round(f12 * 1000.0f);
    }

    public final boolean equals(@j.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c0.class != obj.getClass()) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.f344180b == c0Var.f344180b && this.f344181c == c0Var.f344181c;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f344181c) + ((Float.floatToRawIntBits(this.f344180b) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f344180b), Float.valueOf(this.f344181c)};
        int i12 = com.google.android.exoplayer2.util.U.f348106a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
