package androidx.core.graphics;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.core.graphics.C22764d;
import j.N;
import j.P;
import j.X;

/* compiled from: BlendModeColorFilterCompat.java */
/* renamed from: androidx.core.graphics.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C22763c {

    /* compiled from: BlendModeColorFilterCompat.java */
    @X
    /* renamed from: androidx.core.graphics.c$a */
    public static class a {
        public static ColorFilter a(int i12, Object obj) {
            return new BlendModeColorFilter(i12, (BlendMode) obj);
        }
    }

    @P
    public static ColorFilter a(int i12, @N BlendModeCompat blendModeCompat) {
        if (Build.VERSION.SDK_INT >= 29) {
            Object objA = C22764d.b.a(blendModeCompat);
            if (objA != null) {
                return a.a(i12, objA);
            }
            return null;
        }
        PorterDuff.Mode modeA = C22764d.a(blendModeCompat);
        if (modeA != null) {
            return new PorterDuffColorFilter(i12, modeA);
        }
        return null;
    }
}
