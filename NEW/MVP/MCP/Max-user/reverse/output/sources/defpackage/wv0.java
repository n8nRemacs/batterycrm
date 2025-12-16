package defpackage;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public interface wv0 extends x6f, ReadableByteChannel {
    long H(ux uxVar);

    String M(Charset charset);

    void O(qu0 qu0Var, long j);

    String T();

    int Y(ejb ejbVar);

    void d0(long j);

    xx0 e(long j);

    long f0();

    InputStream g0();

    String j(long j);

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    void skip(long j);
}
