package defpackage;

import java.nio.ByteBuffer;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class wj0 implements bh8 {
    private static final String TIME_FORMAT_LONG = "yy-MM-dd'T'HH:mm:ss.SSS";
    public static final String TIME_FORMAT_SHORT = "mm:ss.SSS";
    private volatile boolean logStream;
    private Instant start;
    private volatile boolean logDebug = false;
    private volatile boolean logRawBytes = false;
    private volatile boolean logDecrypted = false;
    private volatile boolean logSecrets = false;
    private volatile boolean logPackets = false;
    private volatile boolean logInfo = false;
    private volatile boolean logWarning = false;
    private volatile boolean logStats = false;
    private volatile boolean logRecovery = false;
    private volatile boolean logCongestionControl = false;
    private volatile boolean logFlowControl = false;
    private volatile boolean useRelativeTime = false;
    private volatile DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern(TIME_FORMAT_SHORT);

    public String byteToHex(byte[] bArr) {
        String strI = "";
        for (byte b : bArr) {
            strI = az1.i(strI, String.format("%02x ", Byte.valueOf(b)));
        }
        return strI;
    }

    public String byteToHexBlock(byte[] bArr, int i) {
        String strI = "";
        int i2 = 0;
        while (i2 < i) {
            strI = az1.i(strI, String.format("%02x ", Byte.valueOf(bArr[i2])));
            i2++;
            if (i2 < bArr.length) {
                if (i2 % 16 == 0) {
                    strI = az1.i(strI, "\n");
                } else if (i2 % 8 == 0) {
                    strI = az1.i(strI, " ");
                }
            }
        }
        return strI;
    }

    @Override // defpackage.bh8
    public void cc(String str) {
        if (this.logCongestionControl) {
            log(formatTime(Instant.now()) + " " + str);
        }
    }

    @Override // defpackage.bh8
    public void debug(String str) {
        if (this.logDebug) {
            log(str);
        }
    }

    public void debugWithHexBlock(String str, byte[] bArr) {
        if (this.logDebug) {
            logWithHexDump(str + " (" + bArr.length + "): ", bArr, bArr.length);
        }
    }

    @Override // defpackage.bh8
    public void decrypted(String str, byte[] bArr) {
        if (this.logDecrypted) {
            logWithHexDump(str + " (" + bArr.length + "): ", bArr, bArr.length);
        }
    }

    @Override // defpackage.bh8
    public void encrypted(String str, byte[] bArr) {
    }

    @Override // defpackage.bh8
    public void error(String str) {
        log(formatTime() + " Error: " + str);
    }

    public void fc(String str) {
        if (this.logFlowControl) {
            log(formatTime(Instant.now()) + " " + str);
        }
    }

    public String formatTime() {
        return formatTime(Instant.now());
    }

    @Override // defpackage.bh8
    public vqc getQLog() {
        return new mni();
    }

    @Override // defpackage.bh8
    public void info(String str) {
        if (this.logInfo) {
            log(formatTime() + " " + str);
        }
    }

    public abstract void log(String str);

    public abstract void log(String str, Throwable th);

    public void logCongestionControl(boolean z) {
        this.logCongestionControl = z;
    }

    public void logDebug(boolean z) {
        this.logDebug = z;
    }

    public void logDecrypted(boolean z) {
        this.logDecrypted = z;
    }

    public boolean logFlowControl() {
        return this.logFlowControl;
    }

    public void logInfo(boolean z) {
        this.logInfo = z;
    }

    public void logPackets(boolean z) {
        this.logPackets = z;
    }

    public void logRaw(boolean z) {
        this.logRawBytes = z;
    }

    public void logRecovery(boolean z) {
        this.logRecovery = z;
    }

    public void logSecrets(boolean z) {
        this.logSecrets = z;
    }

    public void logStats(boolean z) {
        this.logStats = z;
    }

    public void logStream(boolean z) {
        this.logStream = z;
    }

    public void logWarning(boolean z) {
        this.logWarning = z;
    }

    public abstract void logWithHexDump(String str, ByteBuffer byteBuffer, int i, int i2);

    public abstract void logWithHexDump(String str, byte[] bArr, int i);

    @Override // defpackage.bh8
    public void raw(String str, byte[] bArr) {
        if (this.logRawBytes) {
            logWithHexDump(str + " (" + bArr.length + "): ", bArr, bArr.length);
        }
    }

    @Override // defpackage.bh8
    public void received(Instant instant, int i, btc btcVar) {
        if (this.logPackets) {
            log(formatTime(instant) + " <- (" + i + ") " + btcVar);
        }
    }

    @Override // defpackage.bh8
    public void receivedPacketInfo(String str) {
        String string;
        if (this.logPackets) {
            int length = formatTime(Instant.now()).length();
            if (length < 0) {
                throw new IllegalArgumentException(ho7.f(length, "count is negative: "));
            }
            if (length != 0) {
                string = " ";
                if (length != 1) {
                    if (1 > Integer.MAX_VALUE / length) {
                        throw new OutOfMemoryError(wy1.e(length, "Repeating 1 bytes String ", " times will produce a String exceeding maximum size."));
                    }
                    StringBuilder sb = new StringBuilder(length);
                    for (int i = 0; i < length; i++) {
                        sb.append(" ");
                    }
                    string = sb.toString();
                }
            } else {
                string = "";
            }
            log(string + " -< " + str);
        }
    }

    @Override // defpackage.bh8
    public void recovery(String str) {
        if (this.logRecovery) {
            log(formatTime() + " " + str);
        }
    }

    @Override // defpackage.bh8
    public void secret(String str, byte[] bArr) {
        if (this.logSecrets) {
            log(str + ": " + byteToHex(bArr));
        }
    }

    public void sent(Instant instant, btc btcVar) {
        synchronized (this) {
            try {
                if (this.useRelativeTime && this.start == null) {
                    this.start = instant;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.logPackets) {
            log(formatTime(instant) + " -> " + btcVar);
        }
    }

    @Override // defpackage.bh8
    public void sentPacketInfo(String str) {
        String string;
        if (this.logPackets) {
            int length = formatTime(Instant.now()).length();
            if (length < 0) {
                throw new IllegalArgumentException(ho7.f(length, "count is negative: "));
            }
            if (length != 0) {
                string = " ";
                if (length != 1) {
                    if (1 > Integer.MAX_VALUE / length) {
                        throw new OutOfMemoryError(wy1.e(length, "Repeating 1 bytes String ", " times will produce a String exceeding maximum size."));
                    }
                    StringBuilder sb = new StringBuilder(length);
                    for (int i = 0; i < length; i++) {
                        sb.append(" ");
                    }
                    string = sb.toString();
                }
            } else {
                string = "";
            }
            log(string + " >- " + str);
        }
    }

    public void stats(String str) {
        if (this.logStats) {
            log(str);
        }
    }

    @Override // defpackage.bh8
    public void stream(String str) {
        if (this.logStream) {
            log(formatTime(Instant.now()) + " " + str);
        }
    }

    public void timeFormat(zg8 zg8Var) {
        int iOrdinal = zg8Var.ordinal();
        if (iOrdinal == 0) {
            this.timeFormatter = DateTimeFormatter.ofPattern(TIME_FORMAT_SHORT);
        } else {
            if (iOrdinal != 1) {
                return;
            }
            this.timeFormatter = DateTimeFormatter.ofPattern(TIME_FORMAT_LONG);
        }
    }

    public void useRelativeTime(boolean z) {
        this.useRelativeTime = z;
    }

    @Override // defpackage.bh8
    public void warn(String str) {
        if (this.logWarning) {
            log(formatTime() + " " + str);
        }
    }

    @Override // defpackage.bh8
    public void error(String str, Throwable th) {
        log(formatTime() + " Error: " + str + ": " + th, th);
    }

    public String formatTime(Instant instant) {
        if (!this.useRelativeTime) {
            return this.timeFormatter.format(LocalDateTime.from((TemporalAccessor) instant.atZone(ZoneId.systemDefault())));
        }
        if (this.start == null) {
            this.start = instant;
        }
        return String.format("%.3f", Double.valueOf(Duration.between(this.start, instant).toNanos() / 1.0E9d));
    }

    public void logFlowControl(boolean z) {
        this.logFlowControl = z;
    }

    @Override // defpackage.bh8
    public boolean logRecovery() {
        return this.logRecovery;
    }

    @Override // defpackage.bh8
    public void debug(String str, Exception exc) {
        if (this.logDebug) {
            log(str, exc);
        }
    }

    public void debugWithHexBlock(String str, byte[] bArr, int i) {
        if (this.logDebug) {
            logWithHexDump(str + " (" + bArr.length + "): ", bArr, i);
        }
    }

    public void decrypted(String str, byte[] bArr, int i) {
        if (this.logDecrypted) {
            logWithHexDump(str + " (" + bArr.length + "): ", bArr, i);
        }
    }

    public void info(String str, byte[] bArr) {
        if (this.logInfo) {
            log(formatTime() + " " + str + " (" + bArr.length + "): " + uwi.a(bArr));
        }
    }

    @Override // defpackage.bh8
    public void raw(String str, ByteBuffer byteBuffer, int i, int i2) {
        if (this.logRawBytes) {
            logWithHexDump(str + " (" + i2 + "): ", byteBuffer, i, i2);
        }
    }

    public void received(Instant instant, int i, hf5 hf5Var, byte[] bArr, byte[] bArr2) {
        if (this.logPackets) {
            String time = formatTime(instant);
            String strValueOf = hf5Var != null ? Character.valueOf(hf5Var.name().charAt(0)) : "?";
            log(time + " <- (" + i + ") Packet " + strValueOf + "|.|L|dcid:" + uwi.a(bArr) + "|scid:" + uwi.a(bArr2));
        }
    }

    @Override // defpackage.bh8
    public void recovery(String str, Instant instant) {
        if (this.logRecovery) {
            log(String.format(str, formatTime(instant)));
        }
    }

    @Override // defpackage.bh8
    public void debug(String str, byte[] bArr) {
        if (this.logDebug) {
            log(str + " (" + bArr.length + "): " + byteToHex(bArr));
        }
    }

    @Override // defpackage.bh8
    public void decrypted(String str) {
        if (this.logDecrypted) {
            log(str);
        }
    }

    public void raw(String str, byte[] bArr, int i) {
        if (this.logRawBytes) {
            logWithHexDump(str + " (" + bArr.length + "): ", bArr, i);
        }
    }

    @Override // defpackage.bh8
    public void sent(Instant instant, List<btc> list) {
        synchronized (this) {
            try {
                if (this.useRelativeTime && this.start == null) {
                    this.start = instant;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.logPackets) {
            if (list.size() == 1) {
                log(formatTime(instant) + " -> " + list.get(0));
                return;
            }
            log(formatTime(instant) + " -> " + list);
        }
    }

    public String byteToHexBlock(ByteBuffer byteBuffer, int i, int i2) {
        String strI = "";
        int i3 = 0;
        while (i3 < i2) {
            strI = az1.i(strI, String.format("%02x ", Byte.valueOf(byteBuffer.get(i + i3))));
            i3++;
            if (i3 < i2) {
                if (i3 % 16 == 0) {
                    strI = az1.i(strI, "\n");
                } else if (i3 % 8 == 0) {
                    strI = az1.i(strI, " ");
                }
            }
        }
        return strI;
    }
}
