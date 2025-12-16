package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.yandex.mobile.ads.impl.rg;
import j.InterfaceC42167x;
import java.util.Arrays;

/* loaded from: classes8.dex */
public final class es0 extends mw0 {

    /* renamed from: c, reason: collision with root package name */
    public static final rg.a<es0> f385095c = new L0(11);

    /* renamed from: b, reason: collision with root package name */
    private final float f385096b;

    public es0() {
        this.f385096b = -1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static es0 b(Bundle bundle) {
        db.a(bundle.getInt(Integer.toString(0, 36), -1) == 1);
        float f12 = bundle.getFloat(Integer.toString(1, 36), -1.0f);
        return f12 == -1.0f ? new es0() : new es0(f12);
    }

    public final boolean equals(@j.P Object obj) {
        return (obj instanceof es0) && this.f385096b == ((es0) obj).f385096b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f385096b)});
    }

    public es0(@InterfaceC42167x float f12) {
        db.a("percent must be in the range of [0, 100]", f12 >= 0.0f && f12 <= 100.0f);
        this.f385096b = f12;
    }
}
