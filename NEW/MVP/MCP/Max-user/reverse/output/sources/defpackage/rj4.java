package defpackage;

import android.media.AudioTrack;
import android.os.ConditionVariable;

/* loaded from: classes.dex */
public final class rj4 extends Thread {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rj4(Object obj, ConditionVariable conditionVariable, int i) {
        super("ExoPlayer:SimpleCacheInit");
        this.a = i;
        this.c = obj;
        this.b = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zj4 zj4Var = (zj4) this.c;
                AudioTrack audioTrack = (AudioTrack) this.b;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    return;
                } finally {
                    zj4Var.h.open();
                }
            case 1:
                synchronized (((a1f) this.c)) {
                    ((ConditionVariable) this.b).open();
                    a1f.a((a1f) this.c);
                    ((a1f) this.c).b.getClass();
                }
                return;
            default:
                synchronized (((b1f) this.c)) {
                    ((ConditionVariable) this.b).open();
                    b1f.a((b1f) this.c);
                    ((b1f) this.c).b.getClass();
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rj4(zj4 zj4Var, AudioTrack audioTrack) {
        super("ExoPlayer:AudioTrackReleaseThread");
        this.a = 0;
        this.c = zj4Var;
        this.b = audioTrack;
    }
}
