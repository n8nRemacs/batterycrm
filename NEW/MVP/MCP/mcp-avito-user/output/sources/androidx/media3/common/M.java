package androidx.media3.common;

import android.os.Bundle;
import androidx.media3.common.util.C23110a;
import j.InterfaceC42167x;
import java.util.Arrays;

/* compiled from: StarRating.java */
/* loaded from: classes.dex */
public final class M extends J {

    /* renamed from: f, reason: collision with root package name */
    public static final String f47356f;

    /* renamed from: g, reason: collision with root package name */
    public static final String f47357g;

    /* renamed from: h, reason: collision with root package name */
    @androidx.media3.common.util.J
    public static final C23088b f47358h;

    /* renamed from: d, reason: collision with root package name */
    @j.F
    public final int f47359d;

    /* renamed from: e, reason: collision with root package name */
    public final float f47360e;

    static {
        int i12 = androidx.media3.common.util.M.f47887a;
        f47356f = Integer.toString(1, 36);
        f47357g = Integer.toString(2, 36);
        f47358h = new C23088b(23);
    }

    public M(@j.F int i12) {
        C23110a.a("maxStars must be a positive integer", i12 > 0);
        this.f47359d = i12;
        this.f47360e = -1.0f;
    }

    @Override // androidx.media3.common.J
    public final boolean a() {
        return this.f47360e != -1.0f;
    }

    public final boolean equals(@j.P Object obj) {
        if (!(obj instanceof M)) {
            return false;
        }
        M m12 = (M) obj;
        return this.f47359d == m12.f47359d && this.f47360e == m12.f47360e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f47359d), Float.valueOf(this.f47360e)});
    }

    @Override // androidx.media3.common.InterfaceC23096j
    @androidx.media3.common.util.J
    public final Bundle k() {
        Bundle bundle = new Bundle();
        bundle.putInt(J.f47263b, 2);
        bundle.putInt(f47356f, this.f47359d);
        bundle.putFloat(f47357g, this.f47360e);
        return bundle;
    }

    public M(@j.F int i12, @InterfaceC42167x float f12) {
        boolean z12 = false;
        C23110a.a("maxStars must be a positive integer", i12 > 0);
        if (f12 >= 0.0f && f12 <= i12) {
            z12 = true;
        }
        C23110a.a("starRating is out of range [0, maxStars]", z12);
        this.f47359d = i12;
        this.f47360e = f12;
    }
}
