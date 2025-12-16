package com.google.android.exoplayer2.video;

import com.facebook.imageutils.JfifUtil;
import com.google.android.exoplayer2.InterfaceC36525h;
import j.F;
import j.InterfaceC42167x;
import j.P;

/* compiled from: VideoSize.java */
/* loaded from: classes6.dex */
public final class o implements InterfaceC36525h {

    /* renamed from: f, reason: collision with root package name */
    public static final o f348320f = new o();

    /* renamed from: b, reason: collision with root package name */
    @F
    public final int f348321b;

    /* renamed from: c, reason: collision with root package name */
    @F
    public final int f348322c;

    /* renamed from: d, reason: collision with root package name */
    @F
    public final int f348323d;

    /* renamed from: e, reason: collision with root package name */
    @InterfaceC42167x
    public final float f348324e;

    public o() {
        this(0, 0, 0, 1.0f);
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f348321b == oVar.f348321b && this.f348322c == oVar.f348322c && this.f348323d == oVar.f348323d && this.f348324e == oVar.f348324e;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f348324e) + ((((((JfifUtil.MARKER_EOI + this.f348321b) * 31) + this.f348322c) * 31) + this.f348323d) * 31);
    }

    public o(@F int i12, @F int i13, @F int i14, @InterfaceC42167x float f12) {
        this.f348321b = i12;
        this.f348322c = i13;
        this.f348323d = i14;
        this.f348324e = f12;
    }
}
