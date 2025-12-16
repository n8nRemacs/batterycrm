package androidx.media3.extractor;

import androidx.media3.extractor.x;
import j.P;
import java.util.Arrays;

/* compiled from: FlacMetadataReader.java */
@androidx.media3.common.util.J
/* loaded from: classes.dex */
public final class v {

    /* compiled from: FlacMetadataReader.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @P
        public x f51847a;
    }

    public static x.a a(androidx.media3.common.util.z zVar) {
        zVar.G(1);
        int iW2 = zVar.w();
        long j12 = zVar.f47963b + iW2;
        int i12 = iW2 / 18;
        long[] jArrCopyOf = new long[i12];
        long[] jArrCopyOf2 = new long[i12];
        int i13 = 0;
        while (true) {
            if (i13 >= i12) {
                break;
            }
            long jO2 = zVar.o();
            if (jO2 == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i13);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i13);
                break;
            }
            jArrCopyOf[i13] = jO2;
            jArrCopyOf2[i13] = zVar.o();
            zVar.G(2);
            i13++;
        }
        zVar.G((int) (j12 - zVar.f47963b));
        return new x.a(jArrCopyOf, jArrCopyOf2);
    }
}
