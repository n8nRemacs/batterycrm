package defpackage;

import android.view.Surface;

/* loaded from: classes2.dex */
public final class nld {
    public final vgb a;
    public final Surface b;

    public nld(vgb vgbVar, Surface surface) {
        this.a = vgbVar;
        this.b = surface;
    }

    public final boolean equals(Object obj) {
        nld nldVar = obj instanceof nld ? (nld) obj : null;
        if (nldVar == null) {
            return false;
        }
        return this.a.equals(nldVar.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
