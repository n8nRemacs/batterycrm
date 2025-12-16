package com.google.android.exoplayer2.extractor.wav;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.f;
import com.google.android.exoplayer2.util.F;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* compiled from: WavHeaderReader.java */
/* loaded from: classes6.dex */
final class c {

    /* compiled from: WavHeaderReader.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f345382a;

        /* renamed from: b, reason: collision with root package name */
        public final long f345383b;

        public a(int i12, long j12) {
            this.f345382a = i12;
            this.f345383b = j12;
        }

        public static a a(f fVar, F f12) {
            fVar.a(f12.f348070a, 0, 8, false);
            f12.B(0);
            return new a(f12.d(), f12.i());
        }
    }

    public static boolean a(f fVar) {
        F f12 = new F(8);
        int i12 = a.a(fVar, f12).f345382a;
        if (i12 != 1380533830 && i12 != 1380333108) {
            return false;
        }
        fVar.a(f12.f348070a, 0, 4, false);
        f12.B(0);
        return f12.d() == 1463899717;
    }

    public static a b(int i12, f fVar, F f12) throws ParserException, EOFException, InterruptedIOException {
        a aVarA = a.a(fVar, f12);
        while (true) {
            int i13 = aVarA.f345382a;
            if (i13 == i12) {
                return aVarA;
            }
            long j12 = aVarA.f345383b + 8;
            if (j12 > 2147483647L) {
                throw ParserException.c("Chunk is too large (~2GB+) to skip; id: " + i13);
            }
            fVar.i((int) j12);
            aVarA = a.a(fVar, f12);
        }
    }
}
