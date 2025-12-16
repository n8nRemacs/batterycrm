package SZ0;

import android.graphics.Bitmap;
import android.media.Image;
import com.google.android.gms.common.internal.C36713l;
import com.google.android.gms.common.internal.C36729v;
import com.google.mlkit.common.MlKitException;
import j.N;
import java.nio.ByteBuffer;

/* compiled from: com.google.mlkit:vision-common@@17.2.0 */
@RX0.a
/* loaded from: classes6.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f15073a;

    static {
        new C36713l("MLKitImageUtils", "");
        f15073a = new e();
    }

    @N
    @RX0.a
    public static com.google.android.gms.dynamic.f a(@N com.google.mlkit.vision.common.a aVar) throws MlKitException {
        int i12 = aVar.f362449g;
        if (i12 == -1) {
            Bitmap bitmap = aVar.f362443a;
            C36729v.j(bitmap);
            return new com.google.android.gms.dynamic.f(bitmap);
        }
        if (i12 != 17) {
            if (i12 == 35) {
                return new com.google.android.gms.dynamic.f(aVar.b());
            }
            if (i12 != 842094169) {
                throw new MlKitException(AK.c.g(aVar.f362449g, "Unsupported image format: "), 3);
            }
        }
        ByteBuffer byteBuffer = aVar.f362444b;
        C36729v.j(byteBuffer);
        return new com.google.android.gms.dynamic.f(byteBuffer);
    }

    @RX0.a
    public static int b(@N com.google.mlkit.vision.common.a aVar) {
        int i12 = aVar.f362449g;
        if (i12 == -1) {
            Bitmap bitmap = aVar.f362443a;
            C36729v.j(bitmap);
            return bitmap.getAllocationByteCount();
        }
        if (i12 == 17 || i12 == 842094169) {
            ByteBuffer byteBuffer = aVar.f362444b;
            C36729v.j(byteBuffer);
            return byteBuffer.limit();
        }
        if (i12 != 35) {
            return 0;
        }
        Image.Plane[] planeArrC = aVar.c();
        C36729v.j(planeArrC);
        return (planeArrC[0].getBuffer().limit() * 3) / 2;
    }
}
