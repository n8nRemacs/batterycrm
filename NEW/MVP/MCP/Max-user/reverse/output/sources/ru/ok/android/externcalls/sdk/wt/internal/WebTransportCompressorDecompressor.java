package ru.ok.android.externcalls.sdk.wt.internal;

import defpackage.y6d;
import java.io.ByteArrayOutputStream;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.wt.internal.WebTransportSocket;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000  2\u00020\u0001:\u0001 B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u0014\u0010\u001f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001a¨\u0006!"}, d2 = {"Lru/ok/android/externcalls/sdk/wt/internal/WebTransportCompressorDecompressor;", "Lru/ok/android/externcalls/sdk/wt/internal/WebTransportSocket$CompressorDecompressor;", "Ly6d;", "log", "<init>", "(Ly6d;)V", "", "rawData", "", "offset", "length", "compress", "([BII)[B", "compressedData", "decompress", "Lqqg;", "release", "()V", "Ly6d;", "Ljava/util/zip/Deflater;", "deflater", "Ljava/util/zip/Deflater;", "Ljava/io/ByteArrayOutputStream;", "deflaterOutput", "Ljava/io/ByteArrayOutputStream;", "deflaterBuffer", "[B", "Ljava/util/zip/Inflater;", "inflater", "Ljava/util/zip/Inflater;", "inflaterOutput", "inflaterBuffer", "Companion", "wtsignaling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WebTransportCompressorDecompressor implements WebTransportSocket.CompressorDecompressor {
    private static final int BUFFER_SIZE = 512;
    public static final String COMPRESSION_NAME = "deflate-raw";
    private static final String TAG = "WebTransportCompressorDecompressor";
    private final y6d log;
    private final Deflater deflater = new Deflater(-1, true);
    private final ByteArrayOutputStream deflaterOutput = new ByteArrayOutputStream();
    private final byte[] deflaterBuffer = new byte[BUFFER_SIZE];
    private final Inflater inflater = new Inflater(true);
    private final ByteArrayOutputStream inflaterOutput = new ByteArrayOutputStream();
    private final byte[] inflaterBuffer = new byte[BUFFER_SIZE];

    public WebTransportCompressorDecompressor(y6d y6dVar) {
        this.log = y6dVar;
    }

    @Override // ru.ok.android.externcalls.sdk.wt.internal.WebTransportSocket.CompressorDecompressor
    public byte[] compress(byte[] rawData, int offset, int length) {
        this.deflater.reset();
        this.deflater.setInput(rawData, offset, length);
        this.deflater.finish();
        this.deflaterOutput.reset();
        while (!this.deflater.finished()) {
            this.deflaterOutput.write(this.deflaterBuffer, 0, this.deflater.deflate(this.deflaterBuffer));
        }
        return this.deflaterOutput.toByteArray();
    }

    @Override // ru.ok.android.externcalls.sdk.wt.internal.WebTransportSocket.CompressorDecompressor
    public byte[] decompress(byte[] compressedData, int offset, int length) throws DataFormatException {
        this.inflater.reset();
        this.inflater.setInput(compressedData, offset, length);
        this.inflaterOutput.reset();
        while (!this.inflater.finished()) {
            this.inflaterOutput.write(this.inflaterBuffer, 0, this.inflater.inflate(this.inflaterBuffer));
        }
        return this.inflaterOutput.toByteArray();
    }

    @Override // ru.ok.android.externcalls.sdk.wt.internal.WebTransportSocket.CompressorDecompressor
    public void release() {
        try {
            this.deflater.end();
            this.log.log(TAG, "deflater released");
        } catch (Throwable th) {
            this.log.logException(TAG, "Error finalizing deflater", th);
        }
        try {
            this.inflater.end();
            this.log.log(TAG, "inflater released");
        } catch (Throwable th2) {
            this.log.logException(TAG, "Error finalizing inflater", th2);
        }
    }
}
