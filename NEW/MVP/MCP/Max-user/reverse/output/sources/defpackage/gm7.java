package defpackage;

import android.hardware.camera2.params.InputConfiguration;
import java.util.Objects;

/* loaded from: classes.dex */
public class gm7 {
    public final InputConfiguration a;

    public gm7(Object obj) {
        this.a = (InputConfiguration) obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gm7)) {
            return false;
        }
        return Objects.equals(this.a, ((gm7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
