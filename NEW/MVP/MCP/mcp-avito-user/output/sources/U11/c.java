package u11;

import j.N;
import java.nio.ShortBuffer;

/* compiled from: PassThroughAudioRemixer.java */
/* loaded from: classes7.dex */
public class c implements InterfaceC48764a {
    @Override // u11.InterfaceC48764a
    public final void b(@N ShortBuffer shortBuffer, @N ShortBuffer shortBuffer2) {
        shortBuffer2.put(shortBuffer);
    }

    @Override // u11.InterfaceC48764a
    public final int a(int i12) {
        return i12;
    }
}
