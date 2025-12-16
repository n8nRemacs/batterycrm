package androidx.media3.common;

import android.os.Bundle;
import androidx.media3.common.util.C23110a;
import j.InterfaceC42167x;
import java.util.Arrays;

/* compiled from: PercentageRating.java */
/* loaded from: classes.dex */
public final class F extends J {

    /* renamed from: e, reason: collision with root package name */
    public static final String f47229e;

    /* renamed from: f, reason: collision with root package name */
    @androidx.media3.common.util.J
    public static final C23088b f47230f;

    /* renamed from: d, reason: collision with root package name */
    public final float f47231d;

    static {
        int i12 = androidx.media3.common.util.M.f47887a;
        f47229e = Integer.toString(1, 36);
        f47230f = new C23088b(17);
    }

    public F() {
        this.f47231d = -1.0f;
    }

    @Override // androidx.media3.common.J
    public final boolean a() {
        return this.f47231d != -1.0f;
    }

    public final boolean equals(@j.P Object obj) {
        if (obj instanceof F) {
            return this.f47231d == ((F) obj).f47231d;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f47231d)});
    }

    @Override // androidx.media3.common.InterfaceC23096j
    @androidx.media3.common.util.J
    public final Bundle k() {
        Bundle bundle = new Bundle();
        bundle.putInt(J.f47263b, 1);
        bundle.putFloat(f47229e, this.f47231d);
        return bundle;
    }

    public F(@InterfaceC42167x float f12) {
        C23110a.a("percent must be in the range of [0, 100]", f12 >= 0.0f && f12 <= 100.0f);
        this.f47231d = f12;
    }
}
