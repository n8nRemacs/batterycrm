package okhttp3.internal.ws;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.AdvertStatus;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import okio.C44802l;
import okio.C44805o;
import okio.InterfaceC44803m;

/* compiled from: WebSocketWriter.kt */
@s0
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u001a\u0010\u0014J\u001d\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0010¢\u0006\u0004\b\u001d\u0010\u0014J\u000f\u0010\u001e\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010 R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010*R\u0016\u0010,\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010 R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00101\u001a\u0004\u0018\u0001008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00104\u001a\u0004\u0018\u0001038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00066"}, d2 = {"Lokhttp3/internal/ws/WebSocketWriter;", "Ljava/io/Closeable;", "", "isClient", "Lokio/m;", "sink", "Ljava/util/Random;", "random", "perMessageDeflate", "noContextTakeover", "", "minimumDeflateSize", "<init>", "(ZLokio/m;Ljava/util/Random;ZZJ)V", "", "opcode", "Lokio/o;", "payload", "Lkotlin/G0;", "writeControlFrame", "(ILokio/o;)V", "writePing", "(Lokio/o;)V", "writePong", "code", "reason", "writeClose", "formatOpcode", "data", "writeMessageFrame", "close", "()V", "Z", "Lokio/m;", "getSink", "()Lokio/m;", "Ljava/util/Random;", "getRandom", "()Ljava/util/Random;", "J", "Lokio/l;", "messageBuffer", "Lokio/l;", "sinkBuffer", "writerClosed", "Lokhttp3/internal/ws/MessageDeflater;", "messageDeflater", "Lokhttp3/internal/ws/MessageDeflater;", "", "maskKey", "[B", "Lokio/l$a;", "maskCursor", "Lokio/l$a;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WebSocketWriter implements Closeable {
    private final boolean isClient;

    @l
    private final C44802l.a maskCursor;

    @l
    private final byte[] maskKey;

    @k
    private final C44802l messageBuffer = new C44802l();

    @l
    private MessageDeflater messageDeflater;
    private final long minimumDeflateSize;
    private final boolean noContextTakeover;
    private final boolean perMessageDeflate;

    @k
    private final Random random;

    @k
    private final InterfaceC44803m sink;

    @k
    private final C44802l sinkBuffer;
    private boolean writerClosed;

    public WebSocketWriter(boolean z12, @k InterfaceC44803m interfaceC44803m, @k Random random, boolean z13, boolean z14, long j12) {
        this.isClient = z12;
        this.sink = interfaceC44803m;
        this.random = random;
        this.perMessageDeflate = z13;
        this.noContextTakeover = z14;
        this.minimumDeflateSize = j12;
        this.sinkBuffer = interfaceC44803m.getF420043c();
        this.maskKey = z12 ? new byte[4] : null;
        this.maskCursor = z12 ? new C44802l.a() : null;
    }

    private final void writeControlFrame(int opcode, C44805o payload) throws IOException {
        if (this.writerClosed) {
            throw new IOException(AdvertStatus.CLOSED);
        }
        int iD2 = payload.d();
        if (iD2 > 125) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        this.sinkBuffer.D(opcode | 128);
        if (this.isClient) {
            this.sinkBuffer.D(iD2 | 128);
            this.random.nextBytes(this.maskKey);
            this.sinkBuffer.m268write(this.maskKey);
            if (iD2 > 0) {
                C44802l c44802l = this.sinkBuffer;
                long j12 = c44802l.f420125c;
                payload.u(payload.d(), c44802l);
                this.sinkBuffer.p(this.maskCursor);
                this.maskCursor.b(j12);
                WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        } else {
            this.sinkBuffer.D(iD2);
            C44802l c44802l2 = this.sinkBuffer;
            c44802l2.getClass();
            payload.u(payload.d(), c44802l2);
        }
        this.sink.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        MessageDeflater messageDeflater = this.messageDeflater;
        if (messageDeflater != null) {
            messageDeflater.close();
        }
    }

    @k
    public final Random getRandom() {
        return this.random;
    }

    @k
    public final InterfaceC44803m getSink() {
        return this.sink;
    }

    public final void writeClose(int code, @l C44805o reason) throws EOFException {
        C44805o c44805oW0 = C44805o.f420140f;
        if (code != 0 || reason != null) {
            if (code != 0) {
                WebSocketProtocol.INSTANCE.validateCloseCode(code);
            }
            C44802l c44802l = new C44802l();
            c44802l.J(code);
            if (reason != null) {
                reason.u(reason.d(), c44802l);
            }
            c44805oW0 = c44802l.W0(c44802l.f420125c);
        }
        try {
            writeControlFrame(8, c44805oW0);
        } finally {
            this.writerClosed = true;
        }
    }

    public final void writeMessageFrame(int formatOpcode, @k C44805o data) throws IOException {
        if (this.writerClosed) {
            throw new IOException(AdvertStatus.CLOSED);
        }
        this.messageBuffer.B(data);
        int i12 = formatOpcode | 128;
        if (this.perMessageDeflate && data.d() >= this.minimumDeflateSize) {
            MessageDeflater messageDeflater = this.messageDeflater;
            if (messageDeflater == null) {
                messageDeflater = new MessageDeflater(this.noContextTakeover);
                this.messageDeflater = messageDeflater;
            }
            messageDeflater.deflate(this.messageBuffer);
            i12 = formatOpcode | 192;
        }
        long j12 = this.messageBuffer.f420125c;
        this.sinkBuffer.D(i12);
        int i13 = this.isClient ? 128 : 0;
        if (j12 <= 125) {
            this.sinkBuffer.D(i13 | ((int) j12));
        } else if (j12 <= WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            this.sinkBuffer.D(i13 | WebSocketProtocol.PAYLOAD_SHORT);
            this.sinkBuffer.J((int) j12);
        } else {
            this.sinkBuffer.D(i13 | 127);
            this.sinkBuffer.I(j12);
        }
        if (this.isClient) {
            this.random.nextBytes(this.maskKey);
            this.sinkBuffer.m268write(this.maskKey);
            if (j12 > 0) {
                this.messageBuffer.p(this.maskCursor);
                this.maskCursor.b(0L);
                WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        }
        this.sinkBuffer.write(this.messageBuffer, j12);
        this.sink.Q4();
    }

    public final void writePing(@k C44805o payload) {
        writeControlFrame(9, payload);
    }

    public final void writePong(@k C44805o payload) throws IOException {
        writeControlFrame(10, payload);
    }
}
