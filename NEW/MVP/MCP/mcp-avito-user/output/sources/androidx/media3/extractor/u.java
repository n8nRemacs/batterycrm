package androidx.media3.extractor;

/* compiled from: FlacFrameReader.java */
@androidx.media3.common.util.J
/* loaded from: classes.dex */
public final class u {

    /* compiled from: FlacFrameReader.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public long f51846a;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(androidx.media3.common.util.z r20, androidx.media3.extractor.x r21, int r22, androidx.media3.extractor.u.a r23) {
        /*
            Method dump skipped, instructions count: 197
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.u.a(androidx.media3.common.util.z, androidx.media3.extractor.x, int, androidx.media3.extractor.u$a):boolean");
    }

    public static int b(int i12, androidx.media3.common.util.z zVar) {
        switch (i12) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i12 - 2);
            case 6:
                return zVar.u() + 1;
            case 7:
                return zVar.z() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i12 - 8);
            default:
                return -1;
        }
    }
}
