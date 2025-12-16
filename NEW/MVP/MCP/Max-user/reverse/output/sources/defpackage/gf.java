package defpackage;

import com.facebook.animated.gif.GifImage;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class gf {
    public static final GifImage a;
    public static final GifImage b;

    static {
        GifImage gifImage;
        GifImage gifImage2 = null;
        try {
            gifImage = (GifImage) GifImage.class.newInstance();
        } catch (Throwable unused) {
            gifImage = null;
        }
        a = gifImage;
        try {
            gifImage2 = (GifImage) Class.forName("com.facebook.animated.webp.WebPImage").newInstance();
        } catch (Throwable unused2) {
        }
        b = gifImage2;
    }

    public gf(t9f t9fVar, r2c r2cVar, boolean z) {
    }

    public static qc3 a(String str, ie7 ie7Var, GifImage gifImage) {
        ie7Var.getClass();
        k5i k5iVar = new k5i(gifImage);
        k5iVar.c = null;
        k5iVar.d = null;
        k5iVar.o = str;
        try {
            ywf ywfVar = new ywf(k5iVar);
            vc3.P((vc3) k5iVar.c);
            k5iVar.c = null;
            vc3.Q((ArrayList) k5iVar.d);
            k5iVar.d = null;
            qc3 qc3Var = new qc3();
            qc3Var.d = ywfVar;
            qc3Var.o = true;
            return qc3Var;
        } catch (Throwable th) {
            vc3.P((vc3) k5iVar.c);
            k5iVar.c = null;
            vc3.Q((ArrayList) k5iVar.d);
            k5iVar.d = null;
            throw th;
        }
    }
}
