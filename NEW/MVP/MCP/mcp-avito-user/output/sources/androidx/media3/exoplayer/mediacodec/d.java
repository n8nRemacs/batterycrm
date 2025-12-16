package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.exoplayer.mediacodec.e;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: AsynchronousMediaCodecBufferEnqueuer.java */
/* loaded from: classes.dex */
class d extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f49342a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, Looper looper) {
        super(looper);
        this.f49342a = eVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) throws MediaCodec.CryptoException {
        e eVar = this.f49342a;
        ArrayDeque<e.a> arrayDeque = e.f49343g;
        eVar.getClass();
        int i12 = message.what;
        e.a aVar = null;
        if (i12 == 0) {
            e.a aVar2 = (e.a) message.obj;
            try {
                eVar.f49345a.queueInputBuffer(aVar2.f49351a, 0, aVar2.f49352b, aVar2.f49354d, aVar2.f49355e);
            } catch (RuntimeException e12) {
                AtomicReference<RuntimeException> atomicReference = eVar.f49348d;
                while (!atomicReference.compareAndSet(null, e12) && atomicReference.get() == null) {
                }
            }
            aVar = aVar2;
        } else if (i12 == 1) {
            e.a aVar3 = (e.a) message.obj;
            int i13 = aVar3.f49351a;
            MediaCodec.CryptoInfo cryptoInfo = aVar3.f49353c;
            long j12 = aVar3.f49354d;
            int i14 = aVar3.f49355e;
            try {
                synchronized (e.f49344h) {
                    eVar.f49345a.queueSecureInputBuffer(i13, 0, cryptoInfo, j12, i14);
                }
            } catch (RuntimeException e13) {
                AtomicReference<RuntimeException> atomicReference2 = eVar.f49348d;
                while (!atomicReference2.compareAndSet(null, e13) && atomicReference2.get() == null) {
                }
            }
            aVar = aVar3;
        } else if (i12 != 2) {
            AtomicReference<RuntimeException> atomicReference3 = eVar.f49348d;
            IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(message.what));
            while (!atomicReference3.compareAndSet(null, illegalStateException) && atomicReference3.get() == null) {
            }
        } else {
            eVar.f49349e.d();
        }
        if (aVar != null) {
            ArrayDeque<e.a> arrayDeque2 = e.f49343g;
            synchronized (arrayDeque2) {
                arrayDeque2.add(aVar);
            }
        }
    }
}
