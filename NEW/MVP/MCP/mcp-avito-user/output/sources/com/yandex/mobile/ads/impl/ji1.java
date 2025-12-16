package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.facebook.imageutils.JfifUtil;
import j.InterfaceC42167x;

/* loaded from: classes8.dex */
public final class ji1 implements rg {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f386882e = 0;

    /* renamed from: a, reason: collision with root package name */
    @j.F
    public final int f386883a;

    /* renamed from: b, reason: collision with root package name */
    @j.F
    public final int f386884b;

    /* renamed from: c, reason: collision with root package name */
    @j.F
    public final int f386885c;

    /* renamed from: d, reason: collision with root package name */
    @InterfaceC42167x
    public final float f386886d;

    public ji1(@j.F int i12, @j.F int i13, @j.F int i14, @InterfaceC42167x float f12) {
        this.f386883a = i12;
        this.f386884b = i13;
        this.f386885c = i14;
        this.f386886d = f12;
    }

    private static ji1 a(Bundle bundle) {
        return new ji1(bundle.getInt(Integer.toString(0, 36), 0), bundle.getInt(Integer.toString(1, 36), 0), bundle.getInt(Integer.toString(2, 36), 0), bundle.getFloat(Integer.toString(3, 36), 1.0f));
    }

    public final boolean equals(@j.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ji1)) {
            return false;
        }
        ji1 ji1Var = (ji1) obj;
        return this.f386883a == ji1Var.f386883a && this.f386884b == ji1Var.f386884b && this.f386885c == ji1Var.f386885c && this.f386886d == ji1Var.f386886d;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f386886d) + ((((((this.f386883a + JfifUtil.MARKER_EOI) * 31) + this.f386884b) * 31) + this.f386885c) * 31);
    }
}
