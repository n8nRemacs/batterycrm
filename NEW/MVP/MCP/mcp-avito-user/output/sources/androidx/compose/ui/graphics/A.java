package androidx.compose.ui.graphics;

import android.graphics.Shader;
import android.os.Build;
import kotlin.Metadata;

/* compiled from: AndroidTileMode.android.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class A {

    /* compiled from: AndroidTileMode.android.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[Shader.TileMode.values().length];
            try {
                iArr[Shader.TileMode.CLAMP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Shader.TileMode.MIRROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Shader.TileMode.REPEAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Y61.k
    public static final Shader.TileMode a(int i12) {
        p1.f39721b.getClass();
        if (p1.a(i12, 0)) {
            return Shader.TileMode.CLAMP;
        }
        if (p1.a(i12, p1.f39722c)) {
            return Shader.TileMode.REPEAT;
        }
        if (p1.a(i12, p1.f39723d)) {
            return Shader.TileMode.MIRROR;
        }
        if (!p1.a(i12, p1.f39724e)) {
            return Shader.TileMode.CLAMP;
        }
        if (Build.VERSION.SDK_INT < 31) {
            return Shader.TileMode.CLAMP;
        }
        q1.f39748a.getClass();
        return Shader.TileMode.DECAL;
    }
}
