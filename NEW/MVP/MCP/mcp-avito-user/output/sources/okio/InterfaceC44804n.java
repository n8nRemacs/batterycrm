package okio;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import kotlin.Metadata;

/* compiled from: BufferedSource.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002\u0082\u0001\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lokio/n;", "Lokio/e0;", "Ljava/nio/channels/ReadableByteChannel;", "Lokio/l;", "Lokio/Y;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: okio.n, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public interface InterfaceC44804n extends e0, ReadableByteChannel {
    long E1(@Y61.k c0 c0Var);

    boolean F0(long j12, @Y61.k C44805o c44805o);

    long I3();

    long J1();

    void U4(@Y61.k C44802l c44802l, long j12);

    @Y61.k
    C44805o W0(long j12);

    boolean W2();

    @Y61.k
    String X1(long j12);

    long Y2();

    @Y61.k
    String d4(long j12);

    @Y61.k
    byte[] j4();

    @Y61.k
    String n2();

    @Y61.k
    byte[] p5(long j12);

    @Y61.k
    Y peek();

    @Y61.k
    C44805o q1();

    byte readByte();

    void readFully(@Y61.k byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    boolean request(long j12);

    @Y61.k
    InputStream s6();

    void skip(long j12);

    int t6(@Y61.k P p12);

    @Y61.k
    /* renamed from: v */
    C44802l getF420047c();

    @Y61.k
    String w4(@Y61.k Charset charset);

    void x5(long j12);

    @Y61.k
    String z1(long j12, @Y61.k Charset charset);
}
