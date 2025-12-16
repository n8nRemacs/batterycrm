package defpackage;

import com.facebook.animated.gif.GifImage;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class qc3 extends pk4 {
    public ywf d;
    public boolean o;

    @Override // defpackage.sc3, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            try {
                ywf ywfVar = this.d;
                if (ywfVar == null) {
                    return;
                }
                this.d = null;
                synchronized (ywfVar) {
                    vc3.P((vc3) ywfVar.c);
                    ywfVar.c = null;
                    vc3.Q((ArrayList) ywfVar.d);
                    ywfVar.d = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.sc3, defpackage.pe7
    public final synchronized int getHeight() {
        ywf ywfVar;
        ywfVar = this.d;
        return ywfVar == null ? 0 : ((GifImage) ywfVar.a).h();
    }

    @Override // defpackage.sc3
    public final synchronized int getSizeInBytes() {
        ywf ywfVar;
        ywfVar = this.d;
        return ywfVar == null ? 0 : ((GifImage) ywfVar.a).j();
    }

    @Override // defpackage.sc3, defpackage.pe7
    public final synchronized int getWidth() {
        ywf ywfVar;
        ywfVar = this.d;
        return ywfVar == null ? 0 : ((GifImage) ywfVar.a).k();
    }

    @Override // defpackage.sc3
    public final synchronized boolean isClosed() {
        return this.d == null;
    }

    @Override // defpackage.gj0, defpackage.sc3
    public final boolean isStateful() {
        return this.o;
    }
}
