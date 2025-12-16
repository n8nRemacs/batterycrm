package defpackage;

import android.media.MediaMetadataRetriever;

/* loaded from: classes2.dex */
public final class hd8 extends tj6 {
    public final nm0 f;
    public v08 g;
    public final MediaMetadataRetriever h;
    public final int i;
    public volatile long j;

    public hd8(m0g m0gVar, yi5 yi5Var, lv4 lv4Var) {
        super(m0gVar, yi5Var);
        this.f = new nm0(null);
        this.h = new MediaMetadataRetriever();
        nv4 nv4VarB = lv4Var.b();
        int iOrdinal = nv4VarB.ordinal();
        if (iOrdinal == 0) {
            this.i = 5;
            return;
        }
        if (iOrdinal == 1) {
            this.i = 10;
        } else if (iOrdinal == 2) {
            this.i = 20;
        } else {
            throw new IllegalStateException("unknown performance class " + nv4VarB);
        }
    }
}
