package defpackage;

/* loaded from: classes.dex */
public final class fe7 implements xwg, bf7, ks7 {
    public static final s90 X;
    public static final s90 Y;
    public static final s90 Z;
    public static final s90 b;
    public static final s90 c;
    public static final s90 d;
    public static final s90 o;
    public static final s90 s0;
    public static final s90 t0;
    public static final s90 u0;
    public static final s90 v0;
    public final fjb a;

    static {
        Class cls = Integer.TYPE;
        b = new s90("camerax.core.imageCapture.captureMode", cls, null);
        c = new s90("camerax.core.imageCapture.flashMode", cls, null);
        d = new s90("camerax.core.imageCapture.captureBundle", f52.class, null);
        o = new s90("camerax.core.imageCapture.bufferFormat", Integer.class, null);
        X = new s90("camerax.core.imageCapture.outputFormat", Integer.class, null);
        Y = new s90("camerax.core.imageCapture.imageReaderProxyProvider", mf7.class, null);
        Z = new s90("camerax.core.imageCapture.useSoftwareJpegEncoder", Boolean.TYPE, null);
        s0 = new s90("camerax.core.imageCapture.flashType", cls, null);
        t0 = new s90("camerax.core.imageCapture.jpegCompressionQuality", cls, null);
        u0 = new s90("camerax.core.imageCapture.screenFlash", de7.class, null);
        v0 = new s90("camerax.core.useCase.isPostviewEnabled", Boolean.class, null);
    }

    public fe7(fjb fjbVar) {
        this.a = fjbVar;
    }

    @Override // defpackage.ebd
    public final ao3 getConfig() {
        return this.a;
    }

    @Override // defpackage.re7
    public final int getInputFormat() {
        return ((Integer) f(re7.x)).intValue();
    }
}
