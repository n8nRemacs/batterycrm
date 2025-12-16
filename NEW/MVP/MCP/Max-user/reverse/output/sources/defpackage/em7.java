package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class em7 {
    public final MediaCodec a;
    public final int b;
    public final ByteBuffer c;
    public final wu1 d;
    public final tu1 e;
    public final AtomicBoolean f = new AtomicBoolean(false);
    public long g = 0;
    public boolean h = false;

    public em7(MediaCodec mediaCodec, int i) {
        mediaCodec.getClass();
        this.a = mediaCodec;
        z5j.d(i);
        this.b = i;
        this.c = mediaCodec.getInputBuffer(i);
        AtomicReference atomicReference = new AtomicReference();
        this.d = ixi.a(new tu0(atomicReference, 5));
        tu1 tu1Var = (tu1) atomicReference.get();
        tu1Var.getClass();
        this.e = tu1Var;
    }

    public final void a() {
        tu1 tu1Var = this.e;
        if (this.f.getAndSet(true)) {
            return;
        }
        try {
            this.a.queueInputBuffer(this.b, 0, 0, 0L, 0);
            tu1Var.b(null);
        } catch (IllegalStateException e) {
            tu1Var.d(e);
        }
    }

    public final void b() {
        tu1 tu1Var = this.e;
        ByteBuffer byteBuffer = this.c;
        if (this.f.getAndSet(true)) {
            return;
        }
        try {
            this.a.queueInputBuffer(this.b, byteBuffer.position(), byteBuffer.limit(), this.g, this.h ? 4 : 0);
            tu1Var.b(null);
        } catch (IllegalStateException e) {
            tu1Var.d(e);
        }
    }
}
