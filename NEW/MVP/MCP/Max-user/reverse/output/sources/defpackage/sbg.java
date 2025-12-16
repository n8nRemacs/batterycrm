package defpackage;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;

/* loaded from: classes.dex */
public final class sbg extends xi0 {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    @Override // defpackage.l50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.nio.ByteBuffer r12) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sbg.c(java.nio.ByteBuffer):void");
    }

    @Override // defpackage.xi0
    public final i50 g(i50 i50Var) throws AudioProcessor$UnhandledAudioFormatException {
        int i = i50Var.c;
        if (i == 3 || i == 2 || i == 268435456 || i == 21 || i == 1342177280 || i == 22 || i == 1610612736 || i == 4) {
            return i != 2 ? new i50(i50Var.a, i50Var.b, 2) : i50.e;
        }
        throw new AudioProcessor$UnhandledAudioFormatException(i50Var);
    }
}
