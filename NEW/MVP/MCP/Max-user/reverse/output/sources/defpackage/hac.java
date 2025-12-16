package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class hac {
    public final Executor a;
    public bb0 b;
    public kk4 c;
    public r5j d;
    public tha e;
    public v1a f;
    public rha g;
    public qha h;
    public u1j i;
    public final i17 j;
    public final boolean k;

    public hac(Executor executor) {
        i17 i17Var = ov4.a;
        if (ov4.a.e(LowMemoryQuirk.class) != null) {
            this.a = new qee(executor);
        } else {
            this.a = executor;
        }
        this.j = i17Var;
        this.k = i17Var.d(IncorrectJpegMetadataQuirk.class);
    }

    public final jf7 a(cb0 cb0Var) throws Exception {
        xa0 xa0VarB;
        iac iacVar = cb0Var.a;
        xa0 xa0Var = (xa0) this.c.b(cb0Var);
        Object obj = xa0Var.a;
        int i = xa0Var.c;
        if ((i == 35 || this.k) && this.b.d == 256) {
            r5j r5jVar = this.d;
            ia0 ia0Var = new ia0(xa0Var, iacVar.d);
            r5jVar.getClass();
            try {
                if (i == 35) {
                    xa0VarB = r5j.B(ia0Var);
                } else {
                    if (i != 256 && i != 4101) {
                        throw new IllegalArgumentException("Unexpected format: " + i);
                    }
                    xa0VarB = r5jVar.A(ia0Var, i);
                }
                ((jf7) obj).close();
                Size size = xa0VarB.d;
                this.h.getClass();
                ov8 ov8Var = new ov8(ofi.c(size.getWidth(), size.getHeight(), 256, 2));
                jf7 jf7VarB = ImageProcessingUtil.b(ov8Var, (byte[]) xa0VarB.a);
                ov8Var.a();
                Objects.requireNonNull(jf7VarB);
                ck5 ck5Var = xa0VarB.b;
                Objects.requireNonNull(ck5Var);
                Rect rect = xa0VarB.e;
                int i2 = xa0VarB.f;
                Matrix matrix = xa0VarB.g;
                r02 r02Var = xa0VarB.h;
                fh6 fh6Var = (fh6) jf7VarB;
                Size size2 = new Size(fh6Var.getWidth(), fh6Var.getHeight());
                fh6Var.getFormat();
                xa0Var = new xa0(jf7VarB, ck5Var, fh6Var.getFormat(), size2, rect, i2, matrix, r02Var);
            } catch (Throwable th) {
                ((jf7) obj).close();
                throw th;
            }
        }
        this.g.getClass();
        jf7 jf7Var = (jf7) xa0Var.a;
        jke jkeVar = new jke(jf7Var, xa0Var.d, new ja0(jf7Var.getImageInfo().e(), jf7Var.getImageInfo().getTimestamp(), xa0Var.f, xa0Var.g));
        jkeVar.d(xa0Var.e);
        return jkeVar;
    }
}
