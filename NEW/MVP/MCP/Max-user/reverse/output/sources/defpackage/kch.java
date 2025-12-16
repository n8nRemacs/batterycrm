package defpackage;

import android.content.Context;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.transformer.ExportException;
import java.util.List;

/* loaded from: classes.dex */
public final class kch implements s4h {
    public final t4h a;
    public final Object b = new Object();
    public final ehg c;
    public final boolean d;
    public final long e;
    public final int f;
    public int g;
    public int h;
    public final /* synthetic */ lch i;

    public kch(lch lchVar, Context context, r4h r4hVar, gf3 gf3Var, uy0 uy0Var, mni mniVar, List list, ehg ehgVar, long j, int i, boolean z) {
        this.i = lchVar;
        this.c = ehgVar;
        this.d = z;
        this.e = j;
        this.f = i;
        t4h t4hVarA = r4hVar.a(context, gf3Var, uy0Var, this, dx4.a, j, z);
        this.a = t4hVarA;
        t4hVarA.h(list);
        t4hVarA.o(mniVar);
    }

    @Override // defpackage.s4h
    public final void a(long j) throws InterruptedException {
        this.i.h = j;
        try {
            this.i.f.b();
        } catch (ExportException e) {
            this.c.accept(e);
        }
    }

    public final void b() {
        boolean z;
        int i;
        synchronized (this.b) {
            try {
                int i2 = this.h;
                if (i2 <= 0 || (i = this.g) >= this.f) {
                    z = false;
                } else {
                    z = true;
                    this.g = i + 1;
                    this.h = i2 - 1;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            this.a.k(-3L);
        }
    }

    @Override // defpackage.s4h
    public final void d(VideoFrameProcessingException videoFrameProcessingException) {
        this.c.accept(new ExportException("Video frame processing error", videoFrameProcessingException, 5001, 0));
    }

    @Override // defpackage.s4h
    public final void l(int i, int i2) {
        esf esfVarA;
        try {
            esfVarA = this.i.f.a(i, i2);
        } catch (ExportException e) {
            this.c.accept(e);
            esfVarA = null;
        }
        this.a.p(esfVarA);
    }

    @Override // defpackage.s4h
    public final void p(long j, boolean z) {
        if (this.d) {
            return;
        }
        synchronized (this.b) {
            this.h++;
        }
        b();
    }
}
