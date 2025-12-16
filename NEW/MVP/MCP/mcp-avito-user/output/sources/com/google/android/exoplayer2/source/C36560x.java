package com.google.android.exoplayer2.source;

import androidx.media3.common.C23088b;

/* compiled from: MediaPeriodId.java */
/* renamed from: com.google.android.exoplayer2.source.x, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C36560x {

    /* renamed from: a, reason: collision with root package name */
    public final Object f346696a;

    /* renamed from: b, reason: collision with root package name */
    public final int f346697b;

    /* renamed from: c, reason: collision with root package name */
    public final int f346698c;

    /* renamed from: d, reason: collision with root package name */
    public final long f346699d;

    /* renamed from: e, reason: collision with root package name */
    public final int f346700e;

    public C36560x(Object obj, long j12) {
        this(obj, -1, -1, j12, -1);
    }

    public final boolean a() {
        return this.f346697b != -1;
    }

    public final boolean equals(@j.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36560x)) {
            return false;
        }
        C36560x c36560x = (C36560x) obj;
        return this.f346696a.equals(c36560x.f346696a) && this.f346697b == c36560x.f346697b && this.f346698c == c36560x.f346698c && this.f346699d == c36560x.f346699d && this.f346700e == c36560x.f346700e;
    }

    public final int hashCode() {
        return ((((((C23088b.a(527, 31, this.f346696a) + this.f346697b) * 31) + this.f346698c) * 31) + ((int) this.f346699d)) * 31) + this.f346700e;
    }

    public C36560x(C36560x c36560x) {
        this.f346696a = c36560x.f346696a;
        this.f346697b = c36560x.f346697b;
        this.f346698c = c36560x.f346698c;
        this.f346699d = c36560x.f346699d;
        this.f346700e = c36560x.f346700e;
    }

    public C36560x(Object obj, int i12, int i13, long j12, int i14) {
        this.f346696a = obj;
        this.f346697b = i12;
        this.f346698c = i13;
        this.f346699d = j12;
        this.f346700e = i14;
    }
}
