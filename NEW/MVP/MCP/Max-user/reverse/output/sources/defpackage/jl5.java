package defpackage;

import android.content.Context;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.ExoTimeoutException;
import androidx.media3.transformer.ExportException;

/* loaded from: classes.dex */
public final class jl5 implements r3c {
    public final zt a;
    public final /* synthetic */ ggg b;

    public jl5(ggg gggVar, zt ztVar) {
        this.b = gggVar;
        this.a = ztVar;
    }

    @Override // defpackage.r3c
    public final void L0(PlaybackException playbackException) {
        Throwable cause = playbackException.getCause();
        if ((cause instanceof ExoTimeoutException) && ((ExoTimeoutException) cause).a == 1) {
            a8i.h("ExoPlayerAssetLoader", "Releasing the player timed out.", playbackException);
        } else {
            Object obj = ExportException.b.get(playbackException.b());
            this.a.c(ExportException.a(((Integer) (obj != null ? obj : 1000)).intValue(), playbackException));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // defpackage.r3c
    public final void e0(kgg kggVar) {
        zt ztVar = this.a;
        boolean z = true;
        try {
            ?? A = kggVar.a(1);
            int i = A;
            if (kggVar.a(2)) {
                i = A + 1;
            }
            for (int i2 = 0; i2 < kggVar.a.size(); i2++) {
                int i3 = ((jgg) kggVar.a.get(i2)).b.c;
                if (i3 != 1 && i3 != 2) {
                    wy1.p(i3, "Unsupported track type: ", "ExoPlayerAssetLoader");
                }
            }
            ggg gggVar = this.b;
            if (i > 0) {
                ztVar.a(i);
                ((em5) gggVar.c).play();
                return;
            }
            String strC = tfi.c((Context) gggVar.d, ((g95) gggVar.o).a);
            if (strC == null || !xz9.k(strC)) {
                z = false;
            }
            ztVar.c(ExportException.a(1001, new IllegalStateException(z ? "The asset loader has no audio or video track to output. Try setting an image duration on input image MediaItems." : "The asset loader has no audio or video track to output.")));
        } catch (RuntimeException e) {
            ztVar.c(ExportException.a(1000, e));
        }
    }

    @Override // defpackage.r3c
    public final void n0(s9g s9gVar, int i) {
        zt ztVar = this.a;
        ggg gggVar = this.b;
        try {
            if (gggVar.b != 1) {
                return;
            }
            q9g q9gVar = new q9g();
            s9gVar.n(0, q9gVar);
            if (q9gVar.k) {
                return;
            }
            long j = q9gVar.m;
            gggVar.b = (j <= 0 || j == -9223372036854775807L) ? 3 : 2;
            ztVar.d(j);
        } catch (RuntimeException e) {
            ztVar.c(ExportException.a(1000, e));
        }
    }
}
