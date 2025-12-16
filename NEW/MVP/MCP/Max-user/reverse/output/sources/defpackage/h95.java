package defpackage;

/* loaded from: classes.dex */
public final class h95 {
    public final zjd a;

    public h95(ao6 ao6Var) {
        this.a = ((tg7) ao6Var.b).i();
        hsi.a("The sequence must contain at least one EditedMediaItem.", !r3.isEmpty());
        hsi.a("If the first item in the sequence is a Gap, then forceAudioTrack or forceVideoTrack flag must be set", !g95.c(((g95) r3.get(0)).a));
    }

    public final boolean a() {
        int i = 0;
        while (true) {
            zjd zjdVar = this.a;
            if (i >= zjdVar.d) {
                return false;
            }
            if (g95.c(((g95) zjdVar.get(i)).a)) {
                return true;
            }
            i++;
        }
    }
}
