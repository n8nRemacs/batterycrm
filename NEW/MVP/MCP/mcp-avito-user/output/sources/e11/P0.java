package e11;

import android.content.Context;
import com.my.target.TextureViewSurfaceTextureListenerC37790i;

/* loaded from: classes7.dex */
public final class P0 {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final boolean f394457a;

        /* renamed from: b, reason: collision with root package name */
        public static final boolean f394458b;

        static {
            boolean z12;
            try {
                Class.forName(com.my.target.I.class.getName());
                z12 = true;
            } catch (Throwable unused) {
                z12 = false;
            }
            f394457a = z12;
            f394458b = true;
        }
    }

    @j.N
    public static com.my.target.P0 a(@j.N Context context, boolean z12) {
        if (z12) {
            try {
                if (a.f394457a) {
                    return new com.my.target.I(context);
                }
            } catch (Throwable th2) {
                th2.getMessage();
            }
        }
        return new TextureViewSurfaceTextureListenerC37790i();
    }
}
