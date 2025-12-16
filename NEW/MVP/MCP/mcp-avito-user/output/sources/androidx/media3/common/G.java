package androidx.media3.common;

import android.os.Bundle;
import androidx.media3.common.util.C23110a;
import j.InterfaceC42167x;
import java.util.Locale;

/* compiled from: PlaybackParameters.java */
/* loaded from: classes.dex */
public final class G implements InterfaceC23096j {

    /* renamed from: e, reason: collision with root package name */
    public static final G f47232e = new G(1.0f);

    /* renamed from: f, reason: collision with root package name */
    public static final String f47233f;

    /* renamed from: g, reason: collision with root package name */
    public static final String f47234g;

    /* renamed from: h, reason: collision with root package name */
    @androidx.media3.common.util.J
    public static final C23088b f47235h;

    /* renamed from: b, reason: collision with root package name */
    public final float f47236b;

    /* renamed from: c, reason: collision with root package name */
    public final float f47237c;

    /* renamed from: d, reason: collision with root package name */
    public final int f47238d;

    static {
        int i12 = androidx.media3.common.util.M.f47887a;
        f47233f = Integer.toString(0, 36);
        f47234g = Integer.toString(1, 36);
        f47235h = new C23088b(19);
    }

    public G(@InterfaceC42167x float f12) {
        this(f12, 1.0f);
    }

    public final boolean equals(@j.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || G.class != obj.getClass()) {
            return false;
        }
        G g12 = (G) obj;
        return this.f47236b == g12.f47236b && this.f47237c == g12.f47237c;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f47237c) + ((Float.floatToRawIntBits(this.f47236b) + 527) * 31);
    }

    @Override // androidx.media3.common.InterfaceC23096j
    @androidx.media3.common.util.J
    public final Bundle k() {
        Bundle bundle = new Bundle();
        bundle.putFloat(f47233f, this.f47236b);
        bundle.putFloat(f47234g, this.f47237c);
        return bundle;
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f47236b), Float.valueOf(this.f47237c)};
        int i12 = androidx.media3.common.util.M.f47887a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }

    public G(@InterfaceC42167x float f12, @InterfaceC42167x float f13) {
        C23110a.b(f12 > 0.0f);
        C23110a.b(f13 > 0.0f);
        this.f47236b = f12;
        this.f47237c = f13;
        this.f47238d = Math.round(f12 * 1000.0f);
    }
}
