package androidx.media3.extractor.wav;

import androidx.media3.common.ParserException;
import androidx.media3.common.util.s;
import androidx.media3.common.util.z;
import androidx.media3.extractor.C23191j;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* compiled from: WavHeaderReader.java */
/* loaded from: classes.dex */
final class c {

    /* compiled from: WavHeaderReader.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f51884a;

        /* renamed from: b, reason: collision with root package name */
        public final long f51885b;

        public a(int i12, long j12) {
            this.f51884a = i12;
            this.f51885b = j12;
        }

        public static a a(C23191j c23191j, z zVar) {
            c23191j.a(zVar.f47962a, 0, 8, false);
            zVar.F(0);
            return new a(zVar.g(), zVar.l());
        }
    }

    public static boolean a(C23191j c23191j) {
        z zVar = new z(8);
        int i12 = a.a(c23191j, zVar).f51884a;
        if (i12 != 1380533830 && i12 != 1380333108) {
            return false;
        }
        c23191j.a(zVar.f47962a, 0, 4, false);
        zVar.F(0);
        if (zVar.g() == 1463899717) {
            return true;
        }
        s.c();
        return false;
    }

    public static a b(int i12, C23191j c23191j, z zVar) throws ParserException, EOFException, InterruptedIOException {
        a aVarA = a.a(c23191j, zVar);
        while (true) {
            int i13 = aVarA.f51884a;
            if (i13 == i12) {
                return aVarA;
            }
            s.g();
            long j12 = aVarA.f51885b + 8;
            if (j12 > 2147483647L) {
                throw ParserException.b("Chunk is too large (~2GB+) to skip; id: " + i13);
            }
            c23191j.i((int) j12);
            aVarA = a.a(c23191j, zVar);
        }
    }
}
