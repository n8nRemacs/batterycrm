package u11;

import j.N;
import java.nio.ShortBuffer;

/* compiled from: UpMixAudioRemixer.java */
/* loaded from: classes7.dex */
public class d implements InterfaceC48764a {
    @Override // u11.InterfaceC48764a
    public final int a(int i12) {
        return i12 * 2;
    }

    @Override // u11.InterfaceC48764a
    public final void b(@N ShortBuffer shortBuffer, @N ShortBuffer shortBuffer2) {
        int iMin = Math.min(shortBuffer.remaining(), shortBuffer2.remaining() / 2);
        for (int i12 = 0; i12 < iMin; i12++) {
            short s5 = shortBuffer.get();
            shortBuffer2.put(s5);
            shortBuffer2.put(s5);
        }
    }
}
