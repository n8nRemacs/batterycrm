package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class th5 implements zh5 {
    public final s5g a;
    public final p5g b;

    public th5(j09 j09Var, ArrayList arrayList) {
        s5g n5gVar;
        if (j09Var instanceof b09) {
            n5gVar = new n5g(e3d.oneme_chatmedia_viewer_save_single_photo);
        } else if (j09Var instanceof h09) {
            n5gVar = new n5g(e3d.oneme_chatmedia_viewer_save_single_video);
        } else {
            if (!(j09Var instanceof tz8)) {
                throw new NoWhenBranchMatchedException();
            }
            n5gVar = s5g.b;
        }
        Iterator it = arrayList.iterator();
        char c = 0;
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            jd3 jd3Var = (jd3) it.next();
            if (jd3Var instanceof od7) {
                i++;
            } else {
                if (!(jd3Var instanceof s0h)) {
                    throw new NoWhenBranchMatchedException();
                }
                i2++;
            }
        }
        if (i == arrayList.size()) {
            c = 1;
        } else if (i2 == arrayList.size()) {
            c = 2;
        }
        p5g p5gVar = new p5g(c != 1 ? c != 2 ? e3d.oneme_chatmedia_viewer_save_all_medias : e3d.oneme_chatmedia_viewer_save_all_videos : e3d.oneme_chatmedia_viewer_save_all_photos, ys.D(new Object[]{Integer.valueOf(arrayList.size())}));
        this.a = n5gVar;
        this.b = p5gVar;
    }
}
