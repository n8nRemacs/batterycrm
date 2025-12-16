package defpackage;

/* loaded from: classes.dex */
public final class id7 implements xwg, bf7, n7g {
    public final fjb a;
    public static final s90 b = new s90("camerax.core.imageAnalysis.backpressureStrategy", zc7.class, null);
    public static final s90 c = new s90("camerax.core.imageAnalysis.imageQueueDepth", Integer.TYPE, null);
    public static final s90 d = new s90("camerax.core.imageAnalysis.imageReaderProxyProvider", mf7.class, null);
    public static final s90 o = new s90("camerax.core.imageAnalysis.outputImageFormat", cd7.class, null);
    public static final s90 X = new s90("camerax.core.imageAnalysis.onePixelShiftEnabled", Boolean.class, null);
    public static final s90 Y = new s90("camerax.core.imageAnalysis.outputImageRotationEnabled", Boolean.class, null);

    public id7(fjb fjbVar) {
        this.a = fjbVar;
    }

    @Override // defpackage.ebd
    public final ao3 getConfig() {
        return this.a;
    }

    @Override // defpackage.re7
    public final int getInputFormat() {
        return 35;
    }
}
