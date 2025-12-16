package androidx.media3.common;

import android.os.Bundle;
import java.util.Arrays;

/* compiled from: HeartRating.java */
/* renamed from: androidx.media3.common.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23128y extends J {

    /* renamed from: f, reason: collision with root package name */
    public static final String f47965f;

    /* renamed from: g, reason: collision with root package name */
    public static final String f47966g;

    /* renamed from: h, reason: collision with root package name */
    @androidx.media3.common.util.J
    public static final C23088b f47967h;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f47968d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f47969e;

    static {
        int i12 = androidx.media3.common.util.M.f47887a;
        f47965f = Integer.toString(1, 36);
        f47966g = Integer.toString(2, 36);
        f47967h = new C23088b(6);
    }

    public C23128y() {
        this.f47968d = false;
        this.f47969e = false;
    }

    @Override // androidx.media3.common.J
    public final boolean a() {
        return this.f47968d;
    }

    public final boolean equals(@j.P Object obj) {
        if (!(obj instanceof C23128y)) {
            return false;
        }
        C23128y c23128y = (C23128y) obj;
        return this.f47969e == c23128y.f47969e && this.f47968d == c23128y.f47968d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f47968d), Boolean.valueOf(this.f47969e)});
    }

    @Override // androidx.media3.common.InterfaceC23096j
    @androidx.media3.common.util.J
    public final Bundle k() {
        Bundle bundle = new Bundle();
        bundle.putInt(J.f47263b, 0);
        bundle.putBoolean(f47965f, this.f47968d);
        bundle.putBoolean(f47966g, this.f47969e);
        return bundle;
    }

    public C23128y(boolean z12) {
        this.f47968d = true;
        this.f47969e = z12;
    }
}
