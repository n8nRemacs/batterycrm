package defpackage;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.webrtc.DataChannel;
import ru.ok.android.webrtc.protocol.exceptions.RtcInternalHandleException;

/* loaded from: classes2.dex */
public final class ae4 {
    public final DataChannel a;
    public final y6d b;
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList d = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList e = new CopyOnWriteArrayList();

    public ae4(DataChannel dataChannel, y6d y6dVar) {
        this.a = dataChannel;
        this.b = y6dVar;
        dataChannel.registerObserver(new h79(this, dataChannel, false, 14));
    }

    public final void a(uud uudVar) {
        if (uudVar == null) {
            throw new IllegalArgumentException("Illegal 'listener' value: null");
        }
        this.d.add(uudVar);
    }

    public final boolean b() {
        return this.a.state() == DataChannel.State.OPEN;
    }

    public final void c(uud uudVar) {
        if (uudVar == null) {
            throw new IllegalArgumentException("Illegal 'listener' value: null");
        }
        this.d.remove(uudVar);
    }

    public final void d(ByteBuffer... byteBufferArr) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            try {
                ((uud) it.next()).getClass();
            } catch (Throwable th) {
                this.b.reportException("DataChannelRtcTransport", "rtc.datachannel.listen.send", new RtcInternalHandleException(th));
            }
        }
        this.a.sendMultiple(true, byteBufferArr);
    }

    public final boolean e(int i, byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("Illegal 'command' value: null");
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            try {
                ((uud) it.next()).getClass();
                ByteBuffer.wrap(bArr);
            } catch (Throwable th) {
                this.b.reportException("DataChannelRtcTransport", "rtc.datachannel.listen.send", new RtcInternalHandleException(th));
            }
        }
        return this.a.send(new DataChannel.Buffer(ByteBuffer.wrap(bArr), i == 2));
    }
}
