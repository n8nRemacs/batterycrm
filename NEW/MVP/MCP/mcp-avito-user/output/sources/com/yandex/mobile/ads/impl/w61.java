package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.yandex.mobile.ads.impl.rg;
import j.InterfaceC42167x;
import java.util.Arrays;

/* loaded from: classes8.dex */
public final class w61 extends mw0 {

    /* renamed from: d, reason: collision with root package name */
    public static final rg.a<w61> f391297d = new Q0(12);

    /* renamed from: b, reason: collision with root package name */
    @j.F
    private final int f391298b;

    /* renamed from: c, reason: collision with root package name */
    private final float f391299c;

    public w61(@j.F int i12) {
        db.a("maxStars must be a positive integer", i12 > 0);
        this.f391298b = i12;
        this.f391299c = -1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static w61 b(Bundle bundle) {
        db.a(bundle.getInt(Integer.toString(0, 36), -1) == 2);
        int i12 = bundle.getInt(Integer.toString(1, 36), 5);
        float f12 = bundle.getFloat(Integer.toString(2, 36), -1.0f);
        return f12 == -1.0f ? new w61(i12) : new w61(i12, f12);
    }

    public final boolean equals(@j.P Object obj) {
        if (!(obj instanceof w61)) {
            return false;
        }
        w61 w61Var = (w61) obj;
        return this.f391298b == w61Var.f391298b && this.f391299c == w61Var.f391299c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f391298b), Float.valueOf(this.f391299c)});
    }

    public w61(@j.F int i12, @InterfaceC42167x float f12) {
        boolean z12 = false;
        db.a("maxStars must be a positive integer", i12 > 0);
        if (f12 >= 0.0f && f12 <= i12) {
            z12 = true;
        }
        db.a("starRating is out of range [0, maxStars]", z12);
        this.f391298b = i12;
        this.f391299c = f12;
    }
}
