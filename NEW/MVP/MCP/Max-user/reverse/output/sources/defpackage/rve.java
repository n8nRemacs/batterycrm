package defpackage;

import java.util.concurrent.ExecutorService;
import org.webrtc.EglBase;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.audio.JavaAudioDeviceModule;

/* loaded from: classes2.dex */
public final class rve {
    public final ExecutorService a;
    public final y6d b;
    public volatile String c;
    public volatile PeerConnectionFactory d;
    public final lqa e;
    public r5j f;
    public JavaAudioDeviceModule g;
    public EglBase h;
    public final ys4 i;
    public final nob j;
    public int k = 0;
    public volatile v08 l;

    public rve(ExecutorService executorService, EglBase eglBase, y6d y6dVar, si1 si1Var, ys4 ys4Var, n81 n81Var) {
        this.a = executorService;
        this.b = y6dVar;
        this.i = ys4Var;
        this.e = new lqa(eglBase.getEglBaseContext(), y6dVar);
        EglBase.Context eglBaseContext = eglBase.getEglBaseContext();
        h79 h79Var = si1Var.s;
        nob nobVar = new nob(eglBaseContext, ((os0) h79Var.b).a || ((os0) h79Var.c).a, n81Var, si1Var, y6dVar);
        this.j = nobVar;
        ys4Var.a(nobVar);
        executorService.execute(new u02(this, eglBase, y6dVar, si1Var, 17));
    }
}
