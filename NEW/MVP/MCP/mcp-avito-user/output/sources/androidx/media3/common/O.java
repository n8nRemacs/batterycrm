package androidx.media3.common;

import android.os.Bundle;
import java.util.Arrays;

/* compiled from: ThumbRating.java */
/* loaded from: classes.dex */
public final class O extends J {

    /* renamed from: f, reason: collision with root package name */
    public static final String f47363f;

    /* renamed from: g, reason: collision with root package name */
    public static final String f47364g;

    /* renamed from: h, reason: collision with root package name */
    @androidx.media3.common.util.J
    public static final C23088b f47365h;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f47366d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f47367e;

    static {
        int i12 = androidx.media3.common.util.M.f47887a;
        f47363f = Integer.toString(1, 36);
        f47364g = Integer.toString(2, 36);
        f47365h = new C23088b(24);
    }

    public O() {
        this.f47366d = false;
        this.f47367e = false;
    }

    @Override // androidx.media3.common.J
    public final boolean a() {
        return this.f47366d;
    }

    public final boolean equals(@j.P Object obj) {
        if (!(obj instanceof O)) {
            return false;
        }
        O o12 = (O) obj;
        return this.f47367e == o12.f47367e && this.f47366d == o12.f47366d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f47366d), Boolean.valueOf(this.f47367e)});
    }

    @Override // androidx.media3.common.InterfaceC23096j
    @androidx.media3.common.util.J
    public final Bundle k() {
        Bundle bundle = new Bundle();
        bundle.putInt(J.f47263b, 3);
        bundle.putBoolean(f47363f, this.f47366d);
        bundle.putBoolean(f47364g, this.f47367e);
        return bundle;
    }

    public O(boolean z12) {
        this.f47366d = true;
        this.f47367e = z12;
    }
}
