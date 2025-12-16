package u11;

import j.N;
import java.nio.ShortBuffer;
import okhttp3.internal.http2.Settings;

/* compiled from: DownMixAudioRemixer.java */
/* renamed from: u11.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C48765b implements InterfaceC48764a {
    @Override // u11.InterfaceC48764a
    public final int a(int i12) {
        return i12 / 2;
    }

    @Override // u11.InterfaceC48764a
    public final void b(@N ShortBuffer shortBuffer, @N ShortBuffer shortBuffer2) {
        int iMin = Math.min(shortBuffer.remaining() / 2, shortBuffer2.remaining());
        for (int i12 = 0; i12 < iMin; i12++) {
            int i13 = shortBuffer.get() + Short.MIN_VALUE;
            int i14 = shortBuffer.get() + Short.MIN_VALUE;
            int i15 = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
            int i16 = (i13 < 32768 || i14 < 32768) ? (i13 * i14) / 32768 : (((i13 + i14) * 2) - ((i13 * i14) / 32768)) - Settings.DEFAULT_INITIAL_WINDOW_SIZE;
            if (i16 != 65536) {
                i15 = i16;
            }
            shortBuffer2.put((short) (i15 - 32768));
        }
    }
}
