package defpackage;

import java.nio.ByteBuffer;
import org.webrtc.EncodedImage;

/* loaded from: classes2.dex */
public final class j8i extends Thread {
    public EncodedImage X;
    public final /* synthetic */ ek6 Y;
    public final Object a = new Object();
    public final Object b = new Object();
    public ae4 c;
    public volatile boolean d;
    public ByteBuffer o;

    public j8i(ek6 ek6Var, ae4 ae4Var) {
        this.Y = ek6Var;
        this.c = ae4Var;
        setName("SSFrameSender");
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x011a, code lost:
    
        r18.d = true;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j8i.run():void");
    }
}
