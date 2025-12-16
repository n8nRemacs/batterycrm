package com.google.android.exoplayer2;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: DeviceInfo.java */
/* renamed from: com.google.android.exoplayer2.n, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36533n implements InterfaceC36525h {

    /* renamed from: b, reason: collision with root package name */
    public final int f345766b;

    /* renamed from: c, reason: collision with root package name */
    public final int f345767c;

    /* renamed from: d, reason: collision with root package name */
    public final int f345768d;

    /* compiled from: DeviceInfo.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.exoplayer2.n$a */
    public @interface a {
    }

    public C36533n(int i12, int i13, int i14) {
        this.f345766b = i12;
        this.f345767c = i13;
        this.f345768d = i14;
    }

    public final boolean equals(@j.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36533n)) {
            return false;
        }
        C36533n c36533n = (C36533n) obj;
        return this.f345766b == c36533n.f345766b && this.f345767c == c36533n.f345767c && this.f345768d == c36533n.f345768d;
    }

    public final int hashCode() {
        return ((((527 + this.f345766b) * 31) + this.f345767c) * 31) + this.f345768d;
    }
}
