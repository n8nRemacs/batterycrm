package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import j.InterfaceC42167x;
import java.util.Locale;

/* loaded from: classes8.dex */
public final class ct0 implements rg {

    /* renamed from: d, reason: collision with root package name */
    public static final ct0 f384452d = new ct0(1.0f, 1.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f384453a;

    /* renamed from: b, reason: collision with root package name */
    public final float f384454b;

    /* renamed from: c, reason: collision with root package name */
    private final int f384455c;

    public ct0(@InterfaceC42167x float f12, @InterfaceC42167x float f13) {
        db.a(f12 > 0.0f);
        db.a(f13 > 0.0f);
        this.f384453a = f12;
        this.f384454b = f13;
        this.f384455c = Math.round(f12 * 1000.0f);
    }

    public final long a(long j12) {
        return j12 * this.f384455c;
    }

    public final boolean equals(@j.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ct0.class != obj.getClass()) {
            return false;
        }
        ct0 ct0Var = (ct0) obj;
        return this.f384453a == ct0Var.f384453a && this.f384454b == ct0Var.f384454b;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f384454b) + ((Float.floatToRawIntBits(this.f384453a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f384453a), Float.valueOf(this.f384454b)};
        int i12 = pc1.f388768a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }

    private static ct0 a(Bundle bundle) {
        return new ct0(bundle.getFloat(Integer.toString(0, 36), 1.0f), bundle.getFloat(Integer.toString(1, 36), 1.0f));
    }
}
