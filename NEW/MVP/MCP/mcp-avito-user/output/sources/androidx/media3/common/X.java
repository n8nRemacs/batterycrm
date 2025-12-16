package androidx.media3.common;

import android.os.Bundle;
import com.facebook.imageutils.JfifUtil;
import j.InterfaceC42167x;

/* compiled from: VideoSize.java */
/* loaded from: classes.dex */
public final class X implements InterfaceC23096j {

    /* renamed from: f, reason: collision with root package name */
    public static final X f47549f = new X();

    /* renamed from: g, reason: collision with root package name */
    public static final String f47550g;

    /* renamed from: h, reason: collision with root package name */
    public static final String f47551h;

    /* renamed from: i, reason: collision with root package name */
    public static final String f47552i;

    /* renamed from: j, reason: collision with root package name */
    public static final String f47553j;

    /* renamed from: k, reason: collision with root package name */
    @androidx.media3.common.util.J
    public static final S f47554k;

    /* renamed from: b, reason: collision with root package name */
    @j.F
    public final int f47555b;

    /* renamed from: c, reason: collision with root package name */
    @j.F
    public final int f47556c;

    /* renamed from: d, reason: collision with root package name */
    @j.F
    public final int f47557d;

    /* renamed from: e, reason: collision with root package name */
    @InterfaceC42167x
    public final float f47558e;

    static {
        int i12 = androidx.media3.common.util.M.f47887a;
        f47550g = Integer.toString(0, 36);
        f47551h = Integer.toString(1, 36);
        f47552i = Integer.toString(2, 36);
        f47553j = Integer.toString(3, 36);
        f47554k = new S(3);
    }

    @androidx.media3.common.util.J
    public X() {
        this(0, 0, 0, 1.0f);
    }

    public final boolean equals(@j.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X)) {
            return false;
        }
        X x12 = (X) obj;
        return this.f47555b == x12.f47555b && this.f47556c == x12.f47556c && this.f47557d == x12.f47557d && this.f47558e == x12.f47558e;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f47558e) + ((((((JfifUtil.MARKER_EOI + this.f47555b) * 31) + this.f47556c) * 31) + this.f47557d) * 31);
    }

    @Override // androidx.media3.common.InterfaceC23096j
    @androidx.media3.common.util.J
    public final Bundle k() {
        Bundle bundle = new Bundle();
        bundle.putInt(f47550g, this.f47555b);
        bundle.putInt(f47551h, this.f47556c);
        bundle.putInt(f47552i, this.f47557d);
        bundle.putFloat(f47553j, this.f47558e);
        return bundle;
    }

    @androidx.media3.common.util.J
    public X(@j.F int i12, @j.F int i13, @j.F int i14, @InterfaceC42167x float f12) {
        this.f47555b = i12;
        this.f47556c = i13;
        this.f47557d = i14;
        this.f47558e = f12;
    }
}
