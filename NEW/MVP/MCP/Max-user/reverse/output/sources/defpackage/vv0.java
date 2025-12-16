package defpackage;

import java.nio.channels.WritableByteChannel;

/* loaded from: classes.dex */
public interface vv0 extends b4f, WritableByteChannel {
    vv0 E(int i, byte[] bArr);

    vv0 I(String str);

    vv0 K(xx0 xx0Var);

    vv0 N(long j);

    vv0 e0(long j);

    @Override // defpackage.b4f, java.io.Flushable
    void flush();

    qu0 getBuffer();

    vv0 u();

    vv0 write(byte[] bArr);

    vv0 writeByte(int i);

    vv0 writeInt(int i);

    vv0 writeShort(int i);
}
