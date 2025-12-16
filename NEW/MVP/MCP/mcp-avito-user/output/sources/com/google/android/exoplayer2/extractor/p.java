package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.extractor.r;
import com.google.android.exoplayer2.util.F;
import j.P;
import java.util.Arrays;

/* compiled from: FlacMetadataReader.java */
/* loaded from: classes6.dex */
public final class p {

    /* compiled from: FlacMetadataReader.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @P
        public r f344972a;
    }

    public static r.a a(F f12) {
        f12.C(1);
        int iT2 = f12.t();
        long j12 = f12.f348071b + iT2;
        int i12 = iT2 / 18;
        long[] jArrCopyOf = new long[i12];
        long[] jArrCopyOf2 = new long[i12];
        int i13 = 0;
        while (true) {
            if (i13 >= i12) {
                break;
            }
            long jL2 = f12.l();
            if (jL2 == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i13);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i13);
                break;
            }
            jArrCopyOf[i13] = jL2;
            jArrCopyOf2[i13] = f12.l();
            f12.C(2);
            i13++;
        }
        f12.C((int) (j12 - f12.f348071b));
        return new r.a(jArrCopyOf, jArrCopyOf2);
    }
}
