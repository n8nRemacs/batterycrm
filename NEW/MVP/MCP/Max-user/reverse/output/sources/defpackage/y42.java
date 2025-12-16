package defpackage;

import android.util.Size;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class y42 {
    public final LinkedHashMap a = new LinkedHashMap();
    public final TreeMap b = new TreeMap(new zi3(false));
    public final gc0 c;
    public final gc0 d;

    public y42(sa9 sa9Var) {
        fb0 fb0Var = fb0.d;
        Iterator it = new ArrayList(fb0.l).iterator();
        while (true) {
            gc0 gc0Var = null;
            if (!it.hasNext()) {
                break;
            }
            fb0 fb0Var2 = (fb0) it.next();
            z5j.f("Currently only support ConstantQuality", fb0Var2 instanceof fb0);
            df5 df5VarZ = sa9Var.z(fb0Var2.a);
            if (df5VarZ != null) {
                gri.a("CapabilitiesByQuality", "profiles = " + df5VarZ);
                if (!df5VarZ.d().isEmpty()) {
                    int iA = df5VarZ.a();
                    int iB = df5VarZ.b();
                    List listC = df5VarZ.c();
                    List listD = df5VarZ.d();
                    z5j.a("Should contain at least one VideoProfile.", !listD.isEmpty());
                    gc0Var = new gc0(iA, iB, Collections.unmodifiableList(new ArrayList(listC)), Collections.unmodifiableList(new ArrayList(listD)), listC.isEmpty() ? null : (x90) listC.get(0), (z90) listD.get(0));
                }
                if (gc0Var == null) {
                    gri.i("CapabilitiesByQuality", "EncoderProfiles of quality " + fb0Var2 + " has no video validated profiles.");
                } else {
                    z90 z90Var = gc0Var.f;
                    this.b.put(new Size(z90Var.e, z90Var.f), fb0Var2);
                    this.a.put(fb0Var2, gc0Var);
                }
            }
        }
        if (this.a.isEmpty()) {
            gri.b("CapabilitiesByQuality", "No supported EncoderProfiles");
            this.d = null;
            this.c = null;
        } else {
            ArrayDeque arrayDeque = new ArrayDeque(this.a.values());
            this.c = (gc0) arrayDeque.peekFirst();
            this.d = (gc0) arrayDeque.peekLast();
        }
    }

    public final gc0 a(fb0 fb0Var) {
        z5j.a("Unknown quality: " + fb0Var, fb0.k.contains(fb0Var));
        return fb0Var == fb0.i ? this.c : fb0Var == fb0.h ? this.d : (gc0) this.a.get(fb0Var);
    }
}
