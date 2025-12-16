package androidx.core.graphics;

import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import androidx.core.graphics.C22764d;
import j.N;
import j.P;
import j.X;

/* compiled from: PaintCompat.java */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f44779a = 0;

    /* compiled from: PaintCompat.java */
    @X
    public static class a {
    }

    /* compiled from: PaintCompat.java */
    @X
    public static class b {
        public static void a(com.airbnb.lottie.animation.a aVar, Object obj) {
            aVar.setBlendMode((BlendMode) obj);
        }
    }

    static {
        new ThreadLocal();
    }

    public static void a(@N com.airbnb.lottie.animation.a aVar, @P BlendModeCompat blendModeCompat) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.a(aVar, blendModeCompat != null ? C22764d.b.a(blendModeCompat) : null);
        } else if (blendModeCompat == null) {
            aVar.setXfermode(null);
        } else {
            PorterDuff.Mode modeA = C22764d.a(blendModeCompat);
            aVar.setXfermode(modeA != null ? new PorterDuffXfermode(modeA) : null);
        }
    }
}
