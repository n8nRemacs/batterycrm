package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.x91;

/* loaded from: classes8.dex */
public final class t91 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f390131a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    public final String f390132b;

    /* renamed from: c, reason: collision with root package name */
    public final x91.a f390133c;

    /* renamed from: d, reason: collision with root package name */
    public final int f390134d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    public final byte[] f390135e;

    public t91(boolean z12, @j.P String str, int i12, byte[] bArr, int i13, int i14, @j.P byte[] bArr2) {
        db.a((bArr2 == null) ^ (i12 == 0));
        this.f390131a = z12;
        this.f390132b = str;
        this.f390134d = i12;
        this.f390135e = bArr2;
        this.f390133c = new x91.a(a(str), i13, i14, bArr);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static int a(@j.P String str) {
        if (str == null) {
            return 1;
        }
        char c12 = 65535;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals("cbc1")) {
                    c12 = 0;
                    break;
                }
                break;
            case 3046671:
                if (str.equals("cbcs")) {
                    c12 = 1;
                    break;
                }
                break;
            case 3049879:
                if (str.equals("cenc")) {
                    c12 = 2;
                    break;
                }
                break;
            case 3049895:
                if (str.equals("cens")) {
                    c12 = 3;
                    break;
                }
                break;
        }
        switch (c12) {
            case 0:
            case 1:
                return 2;
            default:
                ka0.d("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
            case 2:
            case 3:
                return 1;
        }
    }
}
