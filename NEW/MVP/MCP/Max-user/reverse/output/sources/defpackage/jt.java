package defpackage;

import android.os.Process;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;

/* loaded from: classes.dex */
public final class jt implements Runnable {
    public final /* synthetic */ int a = 0;
    public boolean b;
    public final /* synthetic */ Object c;

    public jt(q0f q0fVar, boolean z) {
        this.c = q0fVar;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        int i = 0;
        switch (this.a) {
            case 0:
                this.b = false;
                AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) this.c;
                int i2 = AspectRatioFrameLayout.d;
                aspectRatioFrameLayout.getClass();
                return;
            default:
                int threadPriority = Process.getThreadPriority(Process.myTid());
                try {
                    Process.setThreadPriority(10);
                    Object socketLock = ((q0f) this.c).getSocketLock();
                    q0f q0fVar = (q0f) this.c;
                    synchronized (socketLock) {
                        q0fVar.safelyDoIfSocketExists(new m9i(q0fVar, i));
                        b0f signalingLogger = q0fVar.getSignalingLogger();
                        String strA = q0fVar.n;
                        if (signalingLogger.c.shouldHideSensitiveInformation()) {
                            strA = qaj.a(strA);
                        }
                        signalingLogger.b.log(signalingLogger.a, "Connect to " + strA);
                        q0fVar.safelyCreateNewSocket(q0fVar.n, new xpb(q0fVar, 7, this));
                    }
                    return;
                } finally {
                    Process.setThreadPriority(threadPriority);
                }
        }
    }

    public jt(AspectRatioFrameLayout aspectRatioFrameLayout) {
        this.c = aspectRatioFrameLayout;
    }
}
