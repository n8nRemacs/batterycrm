package androidx.media3.extractor;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

/* compiled from: OpusUtil.java */
@androidx.media3.common.util.J
/* loaded from: classes.dex */
public class E {
    public static ArrayList a(byte[] bArr) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(((((bArr[11] & 255) << 8) | (bArr[10] & 255)) * 1000000000) / 48000).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static long b(byte b12, byte b13) {
        int i12;
        int i13 = b12 & 255;
        int i14 = b12 & 3;
        if (i14 != 0) {
            i12 = 2;
            if (i14 != 1 && i14 != 2) {
                i12 = b13 & 63;
            }
        } else {
            i12 = 1;
        }
        int i15 = i13 >> 3;
        return i12 * (i15 >= 16 ? 2500 << r6 : i15 >= 12 ? 10000 << (i15 & 1) : (i15 & 3) == 3 ? 60000 : 10000 << r6);
    }
}
