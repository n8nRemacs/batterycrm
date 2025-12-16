package defpackage;

import javax.net.ssl.SSLEngineResult;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class zxf {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[SSLEngineResult.HandshakeStatus.values().length];
        try {
            iArr[SSLEngineResult.HandshakeStatus.NEED_UNWRAP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SSLEngineResult.HandshakeStatus.NEED_TASK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SSLEngineResult.HandshakeStatus.NEED_WRAP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[SSLEngineResult.HandshakeStatus.FINISHED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
