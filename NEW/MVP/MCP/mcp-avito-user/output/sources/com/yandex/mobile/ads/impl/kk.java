package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.yandex.mobile.ads.impl.rg;
import java.util.Arrays;

/* loaded from: classes8.dex */
public final class kk implements rg {

    /* renamed from: f, reason: collision with root package name */
    public static final rg.a<kk> f387176f = new L0(29);

    /* renamed from: a, reason: collision with root package name */
    public final int f387177a;

    /* renamed from: b, reason: collision with root package name */
    public final int f387178b;

    /* renamed from: c, reason: collision with root package name */
    public final int f387179c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    public final byte[] f387180d;

    /* renamed from: e, reason: collision with root package name */
    private int f387181e;

    public kk(int i12, int i13, int i14, @j.P byte[] bArr) {
        this.f387177a = i12;
        this.f387178b = i13;
        this.f387179c = i14;
        this.f387180d = bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static kk a(Bundle bundle) {
        return new kk(bundle.getInt(Integer.toString(0, 36), -1), bundle.getInt(Integer.toString(1, 36), -1), bundle.getInt(Integer.toString(2, 36), -1), bundle.getByteArray(Integer.toString(3, 36)));
    }

    public final boolean equals(@j.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kk.class != obj.getClass()) {
            return false;
        }
        kk kkVar = (kk) obj;
        return this.f387177a == kkVar.f387177a && this.f387178b == kkVar.f387178b && this.f387179c == kkVar.f387179c && Arrays.equals(this.f387180d, kkVar.f387180d);
    }

    public final int hashCode() {
        if (this.f387181e == 0) {
            this.f387181e = Arrays.hashCode(this.f387180d) + ((((((this.f387177a + 527) * 31) + this.f387178b) * 31) + this.f387179c) * 31);
        }
        return this.f387181e;
    }

    public final String toString() {
        StringBuilder sbA = Cif.a("ColorInfo(");
        sbA.append(this.f387177a);
        sbA.append(", ");
        sbA.append(this.f387178b);
        sbA.append(", ");
        sbA.append(this.f387179c);
        sbA.append(", ");
        return androidx.appcompat.app.r.s(")", sbA, this.f387180d != null);
    }
}
