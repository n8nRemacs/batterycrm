package defpackage;

/* loaded from: classes.dex */
public final class t1h implements xwg, bf7, n7g {
    public static final s90 b = new s90("camerax.video.VideoCapture.videoOutput", uah.class, null);
    public static final s90 c = new s90("camerax.video.VideoCapture.videoEncoderInfoFinder", dn6.class, null);
    public static final s90 d = new s90("camerax.video.VideoCapture.forceEnableSurfaceProcessing", Boolean.class, null);
    public final fjb a;

    public t1h(fjb fjbVar) {
        z5j.b(fjbVar.a.containsKey(b));
        this.a = fjbVar;
    }

    @Override // defpackage.ebd
    public final ao3 getConfig() {
        return this.a;
    }

    @Override // defpackage.re7
    public final int getInputFormat() {
        return 34;
    }
}
