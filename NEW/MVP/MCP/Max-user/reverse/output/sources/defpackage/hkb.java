package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import java.util.Objects;

/* loaded from: classes.dex */
public final class hkb {
    public final OutputConfiguration a;
    public long b = 1;

    public hkb(OutputConfiguration outputConfiguration) {
        this.a = outputConfiguration;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hkb)) {
            return false;
        }
        hkb hkbVar = (hkb) obj;
        return Objects.equals(this.a, hkbVar.a) && this.b == hkbVar.b;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 31;
        return Long.hashCode(this.b) ^ ((iHashCode << 5) - iHashCode);
    }
}
