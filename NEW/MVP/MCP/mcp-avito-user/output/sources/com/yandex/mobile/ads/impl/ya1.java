package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.x91;

/* loaded from: classes8.dex */
public final class ya1 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f391983a = new byte[10];

    /* renamed from: b, reason: collision with root package name */
    private boolean f391984b;

    /* renamed from: c, reason: collision with root package name */
    private int f391985c;

    /* renamed from: d, reason: collision with root package name */
    private long f391986d;

    /* renamed from: e, reason: collision with root package name */
    private int f391987e;

    /* renamed from: f, reason: collision with root package name */
    private int f391988f;

    /* renamed from: g, reason: collision with root package name */
    private int f391989g;

    public final void a() {
        this.f391984b = false;
        this.f391985c = 0;
    }

    public final void a(su suVar) {
        if (this.f391984b) {
            return;
        }
        suVar.a(this.f391983a, 0, 10);
        suVar.c();
        byte[] bArr = this.f391983a;
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b12 = bArr[7];
            if ((b12 & 254) == 186) {
                i = 40 << ((bArr[((b12 & 255) == 187 ? 1 : 0) != 0 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        if (i == 0) {
            return;
        }
        this.f391984b = true;
    }

    public final void a(x91 x91Var, long j12, int i12, int i13, int i14, @j.P x91.a aVar) {
        db.b("TrueHD chunk samples must be contiguous in the sample queue.", this.f391989g <= i13 + i14);
        if (this.f391984b) {
            int i15 = this.f391985c;
            int i16 = i15 + 1;
            this.f391985c = i16;
            if (i15 == 0) {
                this.f391986d = j12;
                this.f391987e = i12;
                this.f391988f = 0;
            }
            this.f391988f += i13;
            this.f391989g = i14;
            if (i16 >= 16) {
                a(x91Var, aVar);
            }
        }
    }

    public final void a(x91 x91Var, @j.P x91.a aVar) {
        if (this.f391985c > 0) {
            x91Var.a(this.f391986d, this.f391987e, this.f391988f, this.f391989g, aVar);
            this.f391985c = 0;
        }
    }
}
