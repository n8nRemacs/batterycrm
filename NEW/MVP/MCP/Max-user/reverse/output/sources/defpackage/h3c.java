package defpackage;

import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.exoplayer.video.VideoSink$VideoSinkException;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class h3c implements och {
    public final /* synthetic */ m3c b;

    public h3c(m3c m3cVar) {
        this.b = m3cVar;
    }

    @Override // defpackage.och
    public final void a(VideoSink$VideoSinkException videoSink$VideoSinkException) {
        Iterator it = this.b.h.iterator();
        while (it.hasNext()) {
            j3c j3cVar = (j3c) it.next();
            VideoFrameProcessingException videoFrameProcessingExceptionA = VideoFrameProcessingException.a(videoSink$VideoSinkException);
            j3cVar.h.execute(new se5(j3cVar, j3cVar.g, videoFrameProcessingExceptionA, 28));
        }
    }

    @Override // defpackage.och
    public final void b() {
        Iterator it = this.b.h.iterator();
        while (it.hasNext()) {
            j3c j3cVar = (j3c) it.next();
            och ochVar = j3cVar.g;
            Executor executor = j3cVar.h;
            Objects.requireNonNull(ochVar);
            executor.execute(new i3c(ochVar, 1));
        }
    }

    @Override // defpackage.och
    public final void g(sch schVar) {
        Iterator it = this.b.h.iterator();
        while (it.hasNext()) {
            j3c j3cVar = (j3c) it.next();
            j3cVar.h.execute(new k79(j3cVar.g, 28, schVar));
        }
    }

    @Override // defpackage.och
    public final void onFirstFrameRendered() {
        Iterator it = this.b.h.iterator();
        while (it.hasNext()) {
            j3c j3cVar = (j3c) it.next();
            och ochVar = j3cVar.g;
            Executor executor = j3cVar.h;
            Objects.requireNonNull(ochVar);
            executor.execute(new i3c(ochVar, 2));
        }
    }
}
