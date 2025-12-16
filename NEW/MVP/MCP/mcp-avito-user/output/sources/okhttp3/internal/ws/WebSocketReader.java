package okhttp3.internal.ws;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.AdvertStatus;
import com.avito.android.remote.model.SearchParamsConverterKt;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import java.util.zip.DataFormatException;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Settings;
import okio.C44802l;
import okio.C44805o;
import okio.InterfaceC44804n;

/* compiled from: WebSocketReader.kt */
@s0
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u00011B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u000eJ\r\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u000eJ\u000f\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0015R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u0015R\u0016\u0010\"\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u0015R\u0016\u0010#\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u0015R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010&R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010,\u001a\u0004\u0018\u00010+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010/\u001a\u0004\u0018\u00010.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00062"}, d2 = {"Lokhttp3/internal/ws/WebSocketReader;", "Ljava/io/Closeable;", "", "isClient", "Lokio/n;", SearchParamsConverterKt.SOURCE, "Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "frameCallback", "perMessageDeflate", "noContextTakeover", "<init>", "(ZLokio/n;Lokhttp3/internal/ws/WebSocketReader$FrameCallback;ZZ)V", "Lkotlin/G0;", "readHeader", "()V", "readControlFrame", "readMessageFrame", "readUntilNonControlFrame", "readMessage", "processNextFrame", "close", "Z", "Lokio/n;", "getSource", "()Lokio/n;", "Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", AdvertStatus.CLOSED, "", "opcode", "I", "", "frameLength", "J", "isFinalFrame", "isControlFrame", "readingCompressedMessage", "Lokio/l;", "controlFrameBuffer", "Lokio/l;", "messageFrameBuffer", "Lokhttp3/internal/ws/MessageInflater;", "messageInflater", "Lokhttp3/internal/ws/MessageInflater;", "", "maskKey", "[B", "Lokio/l$a;", "maskCursor", "Lokio/l$a;", "FrameCallback", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WebSocketReader implements Closeable {
    private boolean closed;

    @k
    private final FrameCallback frameCallback;
    private long frameLength;
    private final boolean isClient;
    private boolean isControlFrame;
    private boolean isFinalFrame;

    @l
    private final C44802l.a maskCursor;

    @l
    private final byte[] maskKey;

    @l
    private MessageInflater messageInflater;
    private final boolean noContextTakeover;
    private int opcode;
    private final boolean perMessageDeflate;
    private boolean readingCompressedMessage;

    @k
    private final InterfaceC44804n source;

    @k
    private final C44802l controlFrameBuffer = new C44802l();

    @k
    private final C44802l messageFrameBuffer = new C44802l();

    /* compiled from: WebSocketReader.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\u0005\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0007H&¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0007H&¢\u0006\u0004\b\f\u0010\tJ\u001f\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "", "", "text", "Lkotlin/G0;", "onReadMessage", "(Ljava/lang/String;)V", "Lokio/o;", "bytes", "(Lokio/o;)V", "payload", "onReadPing", "onReadPong", "", "code", "reason", "onReadClose", "(ILjava/lang/String;)V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface FrameCallback {
        void onReadClose(int code, @k String reason);

        void onReadMessage(@k String text);

        void onReadMessage(@k C44805o bytes);

        void onReadPing(@k C44805o payload);

        void onReadPong(@k C44805o payload);
    }

    public WebSocketReader(boolean z12, @k InterfaceC44804n interfaceC44804n, @k FrameCallback frameCallback, boolean z13, boolean z14) {
        this.isClient = z12;
        this.source = interfaceC44804n;
        this.frameCallback = frameCallback;
        this.perMessageDeflate = z13;
        this.noContextTakeover = z14;
        this.maskKey = z12 ? null : new byte[4];
        this.maskCursor = z12 ? null : new C44802l.a();
    }

    private final void readControlFrame() throws ProtocolException, EOFException {
        short s5;
        String strU;
        long j12 = this.frameLength;
        if (j12 > 0) {
            this.source.U4(this.controlFrameBuffer, j12);
            if (!this.isClient) {
                this.controlFrameBuffer.p(this.maskCursor);
                this.maskCursor.b(0L);
                WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        }
        switch (this.opcode) {
            case 8:
                C44802l c44802l = this.controlFrameBuffer;
                long j13 = c44802l.f420125c;
                if (j13 == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (j13 != 0) {
                    s5 = c44802l.readShort();
                    strU = this.controlFrameBuffer.u();
                    String strCloseCodeExceptionMessage = WebSocketProtocol.INSTANCE.closeCodeExceptionMessage(s5);
                    if (strCloseCodeExceptionMessage != null) {
                        throw new ProtocolException(strCloseCodeExceptionMessage);
                    }
                } else {
                    s5 = 1005;
                    strU = "";
                }
                this.frameCallback.onReadClose(s5, strU);
                this.closed = true;
                return;
            case 9:
                FrameCallback frameCallback = this.frameCallback;
                C44802l c44802l2 = this.controlFrameBuffer;
                frameCallback.onReadPing(c44802l2.W0(c44802l2.f420125c));
                return;
            case 10:
                FrameCallback frameCallback2 = this.frameCallback;
                C44802l c44802l3 = this.controlFrameBuffer;
                frameCallback2.onReadPong(c44802l3.W0(c44802l3.f420125c));
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + Util.toHexString(this.opcode));
        }
    }

    private final void readHeader() throws IOException {
        boolean z12;
        if (this.closed) {
            throw new IOException(AdvertStatus.CLOSED);
        }
        long timeoutNanos = this.source.getTimeout().getTimeoutNanos();
        this.source.getTimeout().clearTimeout();
        try {
            int iAnd = Util.and(this.source.readByte(), 255);
            this.source.getTimeout().timeout(timeoutNanos, TimeUnit.NANOSECONDS);
            int i12 = iAnd & 15;
            this.opcode = i12;
            boolean z13 = (iAnd & 128) != 0;
            this.isFinalFrame = z13;
            boolean z14 = (iAnd & 8) != 0;
            this.isControlFrame = z14;
            if (z14 && !z13) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z15 = (iAnd & 64) != 0;
            if (i12 == 1 || i12 == 2) {
                if (!z15) {
                    z12 = false;
                } else {
                    if (!this.perMessageDeflate) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z12 = true;
                }
                this.readingCompressedMessage = z12;
            } else if (z15) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((iAnd & 32) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((iAnd & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            int iAnd2 = Util.and(this.source.readByte(), 255);
            boolean z16 = (iAnd2 & 128) != 0;
            if (z16 == this.isClient) {
                throw new ProtocolException(this.isClient ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
            }
            long j12 = iAnd2 & 127;
            this.frameLength = j12;
            if (j12 == 126) {
                this.frameLength = Util.and(this.source.readShort(), Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            } else if (j12 == 127) {
                long j13 = this.source.readLong();
                this.frameLength = j13;
                if (j13 < 0) {
                    throw new ProtocolException("Frame length 0x" + Util.toHexString(this.frameLength) + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.isControlFrame && this.frameLength > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z16) {
                this.source.readFully(this.maskKey);
            }
        } catch (Throwable th2) {
            this.source.getTimeout().timeout(timeoutNanos, TimeUnit.NANOSECONDS);
            throw th2;
        }
    }

    private final void readMessage() throws IOException {
        while (!this.closed) {
            long j12 = this.frameLength;
            if (j12 > 0) {
                this.source.U4(this.messageFrameBuffer, j12);
                if (!this.isClient) {
                    this.messageFrameBuffer.p(this.maskCursor);
                    this.maskCursor.b(this.messageFrameBuffer.f420125c - this.frameLength);
                    WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                    this.maskCursor.close();
                }
            }
            if (this.isFinalFrame) {
                return;
            }
            readUntilNonControlFrame();
            if (this.opcode != 0) {
                throw new ProtocolException("Expected continuation opcode. Got: " + Util.toHexString(this.opcode));
            }
        }
        throw new IOException(AdvertStatus.CLOSED);
    }

    private final void readMessageFrame() throws DataFormatException, IOException {
        int i12 = this.opcode;
        if (i12 != 1 && i12 != 2) {
            throw new ProtocolException("Unknown opcode: " + Util.toHexString(i12));
        }
        readMessage();
        if (this.readingCompressedMessage) {
            MessageInflater messageInflater = this.messageInflater;
            if (messageInflater == null) {
                messageInflater = new MessageInflater(this.noContextTakeover);
                this.messageInflater = messageInflater;
            }
            messageInflater.inflate(this.messageFrameBuffer);
        }
        if (i12 == 1) {
            this.frameCallback.onReadMessage(this.messageFrameBuffer.u());
            return;
        }
        FrameCallback frameCallback = this.frameCallback;
        C44802l c44802l = this.messageFrameBuffer;
        frameCallback.onReadMessage(c44802l.W0(c44802l.f420125c));
    }

    private final void readUntilNonControlFrame() throws IOException {
        while (!this.closed) {
            readHeader();
            if (!this.isControlFrame) {
                return;
            } else {
                readControlFrame();
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        MessageInflater messageInflater = this.messageInflater;
        if (messageInflater != null) {
            messageInflater.close();
        }
    }

    @k
    public final InterfaceC44804n getSource() {
        return this.source;
    }

    public final void processNextFrame() {
        readHeader();
        if (this.isControlFrame) {
            readControlFrame();
        } else {
            readMessageFrame();
        }
    }
}
