package defpackage;

import android.util.SparseArray;
import androidx.media3.muxer.MuxerException;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public final class u9a {
    public static final long t = zxg.U(500);
    public final String a;
    public final p9a b;
    public final w7c c;
    public final SparseArray d;
    public final hf6 e;
    public final boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public long j;
    public long k;
    public long l;
    public s9a m;
    public int n;
    public boolean o;
    public boolean p;
    public long q;
    public volatile int r;
    public volatile int s;

    public u9a(String str, p9a p9aVar, w7c w7cVar, int i, hf6 hf6Var, boolean z) {
        this.a = str;
        this.b = p9aVar;
        this.c = w7cVar;
        boolean z2 = false;
        hsi.b(i == 0 || i == 1);
        this.n = i;
        this.f = z;
        if ((i == 0 && hf6Var == null) || (i == 1 && hf6Var != null)) {
            z2 = true;
        }
        hsi.a("appendVideoFormat must be present if and only if muxerMode is MUXER_MODE_MUX_PARTIAL.", z2);
        this.e = hf6Var;
        this.d = new SparseArray();
        this.i = -2;
        this.q = -9223372036854775807L;
        this.k = BuildConfig.MAX_TIME_TO_UPLOAD;
    }

    public static t9a c(SparseArray sparseArray) {
        if (sparseArray.size() == 0) {
            return null;
        }
        t9a t9aVar = (t9a) sparseArray.valueAt(0);
        for (int i = 1; i < sparseArray.size(); i++) {
            t9a t9aVar2 = (t9a) sparseArray.valueAt(i);
            if (t9aVar2.f < t9aVar.f) {
                t9aVar = t9aVar2;
            }
        }
        return t9aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007e A[EDGE_INSN: B:129:0x007e->B:27:0x007e BREAK  A[LOOP:0: B:35:0x0097->B:41:0x00a3], EDGE_INSN: B:133:0x007e->B:27:0x007e BREAK  A[LOOP:1: B:43:0x00a7->B:48:0x00b3]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.hf6 r14) throws androidx.media3.transformer.MuxerWrapper$AppendTrackFormatException {
        /*
            Method dump skipped, instructions count: 706
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u9a.a(hf6):void");
    }

    public final void b(int i) throws Exception {
        if (i == 0 && this.n == 1) {
            return;
        }
        this.g = false;
        s9a s9aVar = this.m;
        if (s9aVar != null) {
            try {
                s9aVar.close();
            } catch (MuxerException e) {
                if (i == 1) {
                    String message = e.getMessage();
                    message.getClass();
                    if (message.equals("Failed to stop the MediaMuxer")) {
                        return;
                    }
                }
                throw e;
            }
        }
    }

    public final boolean d(String str) {
        return this.b.a(xz9.h(str)).contains(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(int r10, java.nio.ByteBuffer r11, boolean r12, long r13) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u9a.e(int, java.nio.ByteBuffer, boolean, long):boolean");
    }
}
