package defpackage;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class ia2 extends xi0 {
    public final /* synthetic */ int i;
    public Serializable j;
    public Object k;

    public ia2(int i) {
        this.i = i;
        switch (i) {
            case 1:
                this.j = new ReentrantLock();
                this.k = new ArrayList();
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0188  */
    @Override // defpackage.l50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.nio.ByteBuffer r18) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ia2.c(java.nio.ByteBuffer):void");
    }

    @Override // defpackage.xi0
    public final i50 g(i50 i50Var) throws AudioProcessor$UnhandledAudioFormatException {
        switch (this.i) {
            case 0:
                int i = i50Var.c;
                int[] iArr = (int[]) this.j;
                if (iArr == null) {
                    return i50.e;
                }
                int i2 = i50Var.b;
                if (!zxg.M(i)) {
                    throw new AudioProcessor$UnhandledAudioFormatException(i50Var);
                }
                boolean z = i2 != iArr.length;
                int i3 = 0;
                while (i3 < iArr.length) {
                    int i4 = iArr[i3];
                    if (i4 >= i2) {
                        throw new AudioProcessor$UnhandledAudioFormatException("Channel map (" + Arrays.toString(iArr) + ") trying to access non-existent input channel.", i50Var);
                    }
                    z |= i4 != i3;
                    i3++;
                }
                return z ? new i50(i50Var.a, iArr.length, i) : i50.e;
            default:
                return i50Var;
        }
    }

    @Override // defpackage.xi0
    public void h() {
        switch (this.i) {
            case 0:
                this.k = (int[]) this.j;
                break;
        }
    }

    @Override // defpackage.xi0
    public void j() {
        switch (this.i) {
            case 0:
                this.k = null;
                this.j = null;
                break;
        }
    }
}
