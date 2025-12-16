package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.view.Surface;
import androidx.media3.transformer.ExportException;
import java.nio.ByteBuffer;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class sk4 {
    public final MediaCodec.BufferInfo a;
    public final MediaFormat b;
    public final hf6 c;
    public final MediaCodec d;
    public final Surface e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final AtomicBoolean i;
    public hf6 j;
    public ByteBuffer k;
    public int l;
    public int m;
    public boolean n;
    public boolean o;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061 A[Catch: Exception -> 0x007e, TryCatch #0 {Exception -> 0x007e, blocks: (B:19:0x0052, B:21:0x0061, B:23:0x0067, B:25:0x006f, B:29:0x0078, B:34:0x0084, B:35:0x0088), top: B:69:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public sk4(android.content.Context r10, defpackage.hf6 r11, android.media.MediaFormat r12, java.lang.String r13, boolean r14, android.view.Surface r15) throws androidx.media3.transformer.ExportException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sk4.<init>(android.content.Context, hf6, android.media.MediaFormat, java.lang.String, boolean, android.view.Surface):void");
    }

    public static hf6 a(MediaFormat mediaFormat, boolean z, ty9 ty9Var) {
        hf6 hf6VarB = vui.b(mediaFormat);
        ff6 ff6VarA = hf6VarB.a();
        ff6VarA.k = ty9Var;
        if (z && hf6VarB.H == -1 && Objects.equals(hf6VarB.n, "audio/raw")) {
            ff6VarA.G = 2;
        }
        return new hf6(ff6VarA);
    }

    public final ExportException b(RuntimeException runtimeException) {
        boolean z = this.g;
        return ExportException.c(runtimeException, z ? 3002 : 4002, new i21(this.b.toString(), c(), this.h, z));
    }

    public final String c() {
        int i = Build.VERSION.SDK_INT;
        MediaCodec mediaCodec = this.d;
        return i >= 29 ? mediaCodec.getCanonicalName() : mediaCodec.getName();
    }

    public final ByteBuffer d() {
        if (!g(true)) {
            return null;
        }
        long j = this.a.presentationTimeUs;
        LinkedHashMap linkedHashMap = ah4.a;
        synchronized (ah4.class) {
            synchronized (ah4.class) {
            }
            return this.k;
        }
        return this.k;
    }

    public final boolean e() {
        return this.o && this.m == -1;
    }

    public final boolean f(ph4 ph4Var) throws ExportException {
        MediaCodec mediaCodec = this.d;
        if (this.n) {
            return false;
        }
        if (this.l < 0) {
            try {
                int iDequeueInputBuffer = mediaCodec.dequeueInputBuffer(0L);
                this.l = iDequeueInputBuffer;
                if (iDequeueInputBuffer < 0) {
                    return false;
                }
                try {
                    ph4Var.o = mediaCodec.getInputBuffer(iDequeueInputBuffer);
                    ph4Var.w();
                } catch (RuntimeException e) {
                    a8i.f("DefaultCodec", "MediaCodec error", e);
                    throw b(e);
                }
            } catch (RuntimeException e2) {
                a8i.f("DefaultCodec", "MediaCodec error", e2);
                throw b(e2);
            }
        }
        ph4Var.o.getClass();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(boolean r12) throws androidx.media3.transformer.ExportException {
        /*
            Method dump skipped, instructions count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sk4.g(boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(defpackage.ph4 r10) throws android.media.MediaCodec.CryptoException, androidx.media3.transformer.ExportException {
        /*
            r9 = this;
            boolean r0 = r9.n
            r1 = 1
            r0 = r0 ^ r1
            java.lang.String r2 = "Input buffer can not be queued after the input stream has ended."
            defpackage.hsi.f(r2, r0)
            java.nio.ByteBuffer r0 = r10.o
            r2 = 0
            if (r0 == 0) goto L21
            boolean r0 = r0.hasRemaining()
            if (r0 == 0) goto L21
            java.nio.ByteBuffer r0 = r10.o
            int r0 = r0.position()
            java.nio.ByteBuffer r3 = r10.o
            int r3 = r3.remaining()
            goto L23
        L21:
            r0 = r2
            r3 = r0
        L23:
            long r4 = r10.Y
            r6 = 4
            boolean r7 = r10.j(r6)
            if (r7 == 0) goto L56
            r9.n = r1
            java.util.LinkedHashMap r7 = defpackage.ah4.a
            java.lang.Class<ah4> r7 = defpackage.ah4.class
            monitor-enter(r7)
            java.lang.Class<ah4> r8 = defpackage.ah4.class
            monitor-enter(r8)     // Catch: java.lang.Throwable -> L53
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L53
            monitor-exit(r7)
            boolean r7 = r9.g
            if (r7 == 0) goto L4f
            java.nio.ByteBuffer r0 = r10.o
            if (r0 == 0) goto L48
            boolean r0 = r0.hasRemaining()
            if (r0 != 0) goto L47
            goto L48
        L47:
            r1 = r2
        L48:
            defpackage.hsi.g(r1)
            r4 = 0
            r3 = r2
            goto L58
        L4f:
            r2 = r0
            goto L58
        L51:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L53
            throw r10
        L53:
            r0 = move-exception
            r10 = r0
            goto L51
        L56:
            r6 = r2
            goto L4f
        L58:
            android.media.MediaCodec r0 = r9.d     // Catch: java.lang.RuntimeException -> L75
            int r1 = r9.l     // Catch: java.lang.RuntimeException -> L75
            r0.queueInputBuffer(r1, r2, r3, r4, r6)     // Catch: java.lang.RuntimeException -> L75
            java.util.LinkedHashMap r0 = defpackage.ah4.a
            java.lang.Class<ah4> r1 = defpackage.ah4.class
            monitor-enter(r1)
            java.lang.Class<ah4> r0 = defpackage.ah4.class
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L72
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L72
            monitor-exit(r1)
            r0 = -1
            r9.l = r0
            r0 = 0
            r10.o = r0
            return
        L70:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L72
            throw r10
        L72:
            r0 = move-exception
            r10 = r0
            goto L70
        L75:
            r0 = move-exception
            r10 = r0
            java.lang.String r0 = "DefaultCodec"
            java.lang.String r1 = "MediaCodec error"
            defpackage.a8i.f(r0, r1, r10)
            androidx.media3.transformer.ExportException r10 = r9.b(r10)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sk4.h(ph4):void");
    }

    public final void i() {
        this.k = null;
        Surface surface = this.e;
        if (surface != null) {
            surface.release();
        }
        this.d.release();
    }

    public final void j() throws ExportException {
        MediaCodec.BufferInfo bufferInfo = this.a;
        hsi.h(bufferInfo);
        k(bufferInfo.presentationTimeUs, false);
    }

    public final void k(long j, boolean z) throws ExportException {
        MediaCodec mediaCodec = this.d;
        this.k = null;
        try {
            if (z) {
                mediaCodec.releaseOutputBuffer(this.m, j * 1000);
                LinkedHashMap linkedHashMap = ah4.a;
                synchronized (ah4.class) {
                    try {
                        synchronized (ah4.class) {
                        }
                    } finally {
                    }
                }
            } else {
                mediaCodec.releaseOutputBuffer(this.m, false);
            }
            this.m = -1;
        } catch (RuntimeException e) {
            a8i.f("DefaultCodec", "MediaCodec error", e);
            throw b(e);
        }
    }
}
