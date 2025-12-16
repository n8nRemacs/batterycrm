package defpackage;

import androidx.media3.muxer.MuxerException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class w3a implements s9a {
    public static final zjd Y;
    public static final zjd Z;
    public int X;
    public final FileOutputStream a;
    public final fa6 b;
    public final d4a c;
    public final ArrayList d;
    public final ArrayList o;

    static {
        t76 t76Var = wg7.b;
        Object[] objArr = {"video/av01", "video/3gpp", "video/avc", "video/hevc", "video/mp4v-es", "video/x-vnd.on2.vp9", "video/apv", "video/dolby-vision"};
        pyi.a(8, objArr);
        Y = wg7.h(8, objArr);
        Z = wg7.q("audio/mp4a-latm", "audio/3gpp", "audio/amr-wb", "audio/opus", "audio/vorbis", "audio/raw");
    }

    public w3a(FileOutputStream fileOutputStream) {
        this.a = fileOutputStream;
        FileChannel channel = fileOutputStream.getChannel();
        fa6 fa6Var = new fa6(7);
        this.b = fa6Var;
        this.c = new d4a(channel, fa6Var);
        this.d = new ArrayList();
        this.o = new ArrayList();
    }

    @Override // defpackage.s9a
    public final void A(ry9 ry9Var) {
        hsi.a("Unsupported metadata", qxi.b(ry9Var));
        this.b.o(ry9Var);
    }

    @Override // defpackage.s9a
    public final void J(int i, ByteBuffer byteBuffer, zu0 zu0Var) throws MuxerException {
        cfg cfgVar = (cfg) this.d.get(i);
        try {
            if (this.o.contains(cfgVar)) {
                throw null;
            }
            this.c.h(cfgVar, byteBuffer, zu0Var);
        } catch (IOException e) {
            throw new MuxerException("Failed to write sample for presentationTimeUs=" + zu0Var.a + ", size=" + zu0Var.b, e);
        }
    }

    @Override // defpackage.s9a
    public final int c0(hf6 hf6Var) {
        int i = this.X;
        this.X = i + 1;
        d4a d4aVar = this.c;
        d4aVar.getClass();
        cfg cfgVar = new cfg(i, hf6Var);
        ArrayList arrayList = d4aVar.c;
        arrayList.add(cfgVar);
        Collections.sort(arrayList, new ov5(12));
        this.d.add(cfgVar);
        return i;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws MuxerException, IOException {
        MuxerException muxerException;
        try {
            byte[] bArr = new byte[8];
            for (int i = 7; i >= 0; i--) {
                bArr[i] = (byte) 0;
            }
            hsi.b(bArr.length == 8);
            this.c.b();
            muxerException = null;
        } catch (IOException e) {
            muxerException = new MuxerException("Failed to finish writing data", e);
        }
        try {
            this.a.close();
        } catch (IOException e2) {
            if (muxerException == null) {
                muxerException = new MuxerException("Failed to close output stream", e2);
            } else {
                a8i.h("Mp4Muxer", "Failed to close output stream", e2);
            }
        }
        if (muxerException != null) {
            throw muxerException;
        }
    }
}
