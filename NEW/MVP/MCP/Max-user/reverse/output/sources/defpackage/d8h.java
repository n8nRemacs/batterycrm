package defpackage;

import android.util.Range;

/* loaded from: classes2.dex */
public final class d8h {
    public final Range a;
    public final gsc b;
    public final fb0 c;

    public d8h(Range range, gsc gscVar, fb0 fb0Var) {
        this.a = range;
        this.b = gscVar;
        this.c = fb0Var;
    }

    public final String toString() {
        return "VideoMessageQuality(fps=" + this.a + "|color=" + u75.d + "|encoder=" + this.b + "|video=" + this.c + ")";
    }
}
