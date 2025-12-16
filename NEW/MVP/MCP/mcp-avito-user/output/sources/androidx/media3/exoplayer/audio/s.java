package androidx.media3.exoplayer.audio;

import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.J;
import com.google.common.base.M;
import java.nio.ByteBuffer;

/* compiled from: OggOpusAudioPacketizer.java */
@J
/* loaded from: classes.dex */
public final class s {

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f48983d = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, -128, -69, 0, 0, 0, 0, 0};

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f48984e = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: a, reason: collision with root package name */
    public ByteBuffer f48985a = AudioProcessor.f47559a;

    /* renamed from: c, reason: collision with root package name */
    public int f48987c = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f48986b = 2;

    public static void a(ByteBuffer byteBuffer, long j12, int i12, int i13, boolean z12) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(z12 ? (byte) 2 : (byte) 0);
        byteBuffer.putLong(j12);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i12);
        byteBuffer.putInt(0);
        long j13 = i13;
        M.e("out of range: %s", (j13 >> 8) == 0, j13);
        byteBuffer.put((byte) j13);
    }
}
