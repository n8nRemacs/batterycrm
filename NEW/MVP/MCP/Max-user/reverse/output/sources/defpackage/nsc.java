package defpackage;

import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import androidx.camera.video.internal.compat.quirk.VideoQualityQuirk;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class nsc implements cf5 {
    public static final HashMap d;
    public final cf5 a;
    public final l22 b;
    public final i17 c;

    static {
        HashMap map = new HashMap();
        d = map;
        map.put(1, fb0.i);
        map.put(8, fb0.g);
        map.put(6, fb0.f);
        map.put(5, fb0.e);
        map.put(4, fb0.d);
        map.put(0, fb0.h);
    }

    public nsc(l22 l22Var, cf5 cf5Var, i17 i17Var) {
        this.a = cf5Var;
        this.b = l22Var;
        this.c = i17Var;
    }

    @Override // defpackage.cf5
    public final boolean i(int i) {
        if (!this.a.i(i)) {
            return false;
        }
        fb0 fb0Var = (fb0) d.get(Integer.valueOf(i));
        if (fb0Var == null) {
            return true;
        }
        Iterator it = this.c.f(VideoQualityQuirk.class).iterator();
        while (it.hasNext()) {
            VideoQualityQuirk videoQualityQuirk = (VideoQualityQuirk) it.next();
            if (videoQualityQuirk != null && videoQualityQuirk.a(this.b, fb0Var) && (!(videoQualityQuirk instanceof SurfaceProcessingQuirk) || !((SurfaceProcessingQuirk) videoQualityQuirk).b())) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.cf5
    public final df5 n(int i) {
        if (i(i)) {
            return this.a.n(i);
        }
        return null;
    }
}
