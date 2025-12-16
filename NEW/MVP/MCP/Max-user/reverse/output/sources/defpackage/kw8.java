package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface kw8 {
    void b(int i, za4 za4Var, long j, int i2);

    void d(long j, int i, int i2, int i3);

    void flush();

    void g(int i, long j);

    ByteBuffer getInputBuffer(int i);

    ByteBuffer getOutputBuffer(int i);

    MediaFormat getOutputFormat();

    int h();

    int i(MediaCodec.BufferInfo bufferInfo);

    void j(int i);

    void k(Surface surface);

    void l(int i);

    default boolean m(r5j r5jVar) {
        return false;
    }

    void n();

    void release();

    void setParameters(Bundle bundle);

    void t(hx8 hx8Var, Handler handler);
}
