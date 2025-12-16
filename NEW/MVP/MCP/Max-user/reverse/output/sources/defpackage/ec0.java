package defpackage;

import android.util.Range;

/* loaded from: classes.dex */
public final class ec0 {
    public wib a;
    public Range b;
    public Range c;
    public Integer d;

    public final fc0 a() {
        String strI = this.a == null ? " qualitySelector" : "";
        if (this.b == null) {
            strI = strI.concat(" frameRate");
        }
        if (this.c == null) {
            strI = az1.i(strI, " bitrate");
        }
        if (this.d == null) {
            strI = az1.i(strI, " aspectRatio");
        }
        if (strI.isEmpty()) {
            return new fc0(this.a, this.b, this.c, this.d.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(strI));
    }
}
