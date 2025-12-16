package com.facebook.imageutils;

import com.facebook.infer.annotation.Nullsafe;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

@Nullsafe
/* loaded from: classes15.dex */
public class JfifUtil {
    public static final int APP1_EXIF_MAGIC = 1165519206;
    public static final int MARKER_APP1 = 225;
    public static final int MARKER_EOI = 217;
    public static final int MARKER_ESCAPE_BYTE = 0;
    public static final int MARKER_FIRST_BYTE = 255;
    public static final int MARKER_RST0 = 208;
    public static final int MARKER_RST7 = 215;
    public static final int MARKER_SOFn = 192;
    public static final int MARKER_SOI = 216;
    public static final int MARKER_SOS = 218;
    public static final int MARKER_TEM = 1;

    public static int getAutoRotateAngleFromOrientation(int i12) {
        if (i12 == 3) {
            return 180;
        }
        if (i12 != 6) {
            return i12 != 8 ? 0 : 270;
        }
        return 90;
    }

    public static int getOrientation(byte[] bArr) {
        return getOrientation(new ByteArrayInputStream(bArr));
    }

    public static boolean moveToMarker(InputStream inputStream, int i12) throws IOException {
        inputStream.getClass();
        while (a.a(inputStream, 1, false) == 255) {
            int iA2 = 255;
            while (iA2 == 255) {
                iA2 = a.a(inputStream, 1, false);
            }
            if (i12 == 192) {
                switch (iA2) {
                    case 192:
                    case 193:
                    case 194:
                    case 195:
                    case 197:
                    case 198:
                    case 199:
                    case 201:
                    case 202:
                    case 203:
                    case 205:
                    case 206:
                    case 207:
                        return true;
                }
            }
            if (iA2 == i12) {
                return true;
            }
            if (iA2 != 216 && iA2 != 1) {
                if (iA2 == 217 || iA2 == 218) {
                    return false;
                }
                inputStream.skip(a.a(inputStream, 2, false) - 2);
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int getOrientation(java.io.InputStream r5) {
        /*
            r0 = 225(0xe1, float:3.15E-43)
            r1 = 0
            boolean r0 = moveToMarker(r5, r0)     // Catch: java.io.IOException -> L2f
            if (r0 == 0) goto L26
            r0 = 2
            int r2 = com.facebook.imageutils.a.a(r5, r0, r1)     // Catch: java.io.IOException -> L2f
            int r3 = r2 + (-2)
            r4 = 6
            if (r3 <= r4) goto L26
            r3 = 4
            int r3 = com.facebook.imageutils.a.a(r5, r3, r1)     // Catch: java.io.IOException -> L2f
            int r0 = com.facebook.imageutils.a.a(r5, r0, r1)     // Catch: java.io.IOException -> L2f
            int r2 = r2 + (-8)
            r4 = 1165519206(0x45786966, float:3974.5874)
            if (r3 != r4) goto L26
            if (r0 != 0) goto L26
            goto L27
        L26:
            r2 = r1
        L27:
            if (r2 != 0) goto L2a
            return r1
        L2a:
            int r5 = com.facebook.imageutils.b.a(r2, r5)     // Catch: java.io.IOException -> L2f
            return r5
        L2f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imageutils.JfifUtil.getOrientation(java.io.InputStream):int");
    }
}
