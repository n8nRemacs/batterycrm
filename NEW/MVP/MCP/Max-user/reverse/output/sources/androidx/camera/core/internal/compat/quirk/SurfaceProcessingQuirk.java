package androidx.camera.core.internal.compat.quirk;

import defpackage.cuc;
import defpackage.i17;
import java.util.Iterator;

/* loaded from: classes.dex */
public interface SurfaceProcessingQuirk extends cuc {
    static boolean d(i17 i17Var) {
        Iterator it = i17Var.f(SurfaceProcessingQuirk.class).iterator();
        while (it.hasNext()) {
            if (((SurfaceProcessingQuirk) it.next()).b()) {
                return true;
            }
        }
        return false;
    }

    default boolean b() {
        return true;
    }
}
