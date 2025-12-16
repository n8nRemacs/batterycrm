package defpackage;

import java.nio.ByteBuffer;
import java.time.Instant;
import java.util.List;

/* loaded from: classes3.dex */
public interface bh8 {
    void cc(String str);

    void debug(String str);

    void debug(String str, Exception exc);

    void debug(String str, byte[] bArr);

    void decrypted(String str);

    void decrypted(String str, byte[] bArr);

    void encrypted(String str, byte[] bArr);

    void error(String str);

    void error(String str, Throwable th);

    vqc getQLog();

    void info(String str);

    boolean logRecovery();

    void raw(String str, ByteBuffer byteBuffer, int i, int i2);

    void raw(String str, byte[] bArr);

    void received(Instant instant, int i, btc btcVar);

    void receivedPacketInfo(String str);

    void recovery(String str);

    void recovery(String str, Instant instant);

    void secret(String str, byte[] bArr);

    void sent(Instant instant, List list);

    void sentPacketInfo(String str);

    void stream(String str);

    void warn(String str);
}
