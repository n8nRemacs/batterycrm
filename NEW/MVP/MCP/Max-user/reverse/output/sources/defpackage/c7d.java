package defpackage;

import java.math.BigInteger;
import org.webrtc.RTCStats;

/* loaded from: classes2.dex */
public abstract class c7d {
    public static final zi4 b;
    public static final zi4 c;
    public static final zi4 d;
    public static final zi4 e;
    public static final /* synthetic */ yy7[] a = {new toc(c7d.class, "mimeType", "getMimeType(Lorg/webrtc/RTCStats;)Ljava/lang/String;", 1), ho7.d(vid.a, c7d.class, "decoderImplementation", "getDecoderImplementation(Lorg/webrtc/RTCStats;)Ljava/lang/String;", 1), new toc(c7d.class, "encoderImplementation", "getEncoderImplementation(Lorg/webrtc/RTCStats;)Ljava/lang/String;", 1), new toc(c7d.class, "sdpFmtpLine", "getSdpFmtpLine(Lorg/webrtc/RTCStats;)Ljava/lang/String;", 1), new toc(c7d.class, "payloadType", "getPayloadType(Lorg/webrtc/RTCStats;)Ljava/lang/Long;", 1), new toc(c7d.class, "channels", "getChannels(Lorg/webrtc/RTCStats;)Ljava/lang/Long;", 1)};
    public static final iqa f = new iqa(15);

    static {
        int i = 4;
        b = new zi4("mimeType", i);
        c = new zi4("decoderImplementation", i);
        d = new zi4("encoderImplementation", i);
        e = new zi4("sdpFmtpLine", i);
    }

    public static final BigInteger a(Object obj) {
        Number number = obj instanceof Number ? (Number) obj : null;
        if (number == null) {
            return null;
        }
        if (number instanceof BigInteger) {
            return (BigInteger) number;
        }
        if (!(number instanceof Long) && (number instanceof Integer)) {
            return BigInteger.valueOf(number.intValue());
        }
        return BigInteger.valueOf(number.longValue());
    }

    public static final Double b(Object obj) {
        Number number = obj instanceof Number ? (Number) obj : null;
        if (number != null) {
            return Double.valueOf(number.doubleValue());
        }
        return null;
    }

    public static final Long c(Object obj) {
        Number number = obj instanceof Number ? (Number) obj : null;
        if (number != null) {
            return Long.valueOf(number.longValue());
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String d(org.webrtc.RTCStats r3) {
        /*
            java.lang.String r0 = "address"
            java.util.Map r1 = r3.getMembers()
            java.lang.Object r0 = r1.get(r0)
            r1 = 0
            if (r0 == 0) goto L12
            java.lang.String r0 = r0.toString()
            goto L13
        L12:
            r0 = r1
        L13:
            if (r0 != 0) goto L16
            goto L43
        L16:
            java.lang.String r2 = "port"
            java.util.Map r3 = r3.getMembers()
            java.lang.Object r3 = r3.get(r2)
            if (r3 == 0) goto L35
            boolean r2 = r3 instanceof java.lang.Number
            if (r2 == 0) goto L29
            java.lang.Number r3 = (java.lang.Number) r3
            goto L2a
        L29:
            r3 = r1
        L2a:
            if (r3 == 0) goto L35
            int r3 = r3.intValue()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L36
        L35:
            r3 = r1
        L36:
            if (r3 == 0) goto L43
            int r3 = r3.intValue()
            java.lang.String r1 = ":"
            java.lang.String r3 = defpackage.xc0.e(r3, r0, r1)
            return r3
        L43:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c7d.d(org.webrtc.RTCStats):java.lang.String");
    }

    public static final String e(RTCStats rTCStats) {
        Object obj = rTCStats.getMembers().get("kind");
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }

    public static final BigInteger f(RTCStats rTCStats) {
        Object obj = rTCStats.getMembers().get("packetsLost");
        if (obj != null) {
            return a(obj);
        }
        return null;
    }

    public static final Long g(RTCStats rTCStats) {
        Object obj = rTCStats.getMembers().get("ssrc");
        if (obj != null) {
            return c(obj);
        }
        return null;
    }

    public static final String h(RTCStats rTCStats) {
        Object obj = rTCStats.getMembers().get("trackIdentifier");
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }

    public static final String i(RTCStats rTCStats) {
        Object obj = rTCStats.getMembers().get("transportId");
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }
}
