package defpackage;

import android.hardware.camera2.params.InputConfiguration;
import android.util.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class gie extends cie {
    public final xn3 i = new xn3(7);
    public boolean j = true;
    public boolean k = false;
    public final ArrayList l = new ArrayList();

    public final void f(hie hieVar) {
        Object objF;
        LinkedHashSet<kb0> linkedHashSet = (LinkedHashSet) this.a;
        w30 w30Var = (w30) this.b;
        h52 h52Var = hieVar.g;
        int i = h52Var.c;
        fjb fjbVar = h52Var.b;
        if (i != -1) {
            this.k = true;
            int i2 = w30Var.c;
            List list = hie.i;
            if (list.indexOf(Integer.valueOf(i)) < list.indexOf(Integer.valueOf(i2))) {
                i = i2;
            }
            w30Var.c = i;
        }
        s90 s90Var = h52.k;
        Object objF2 = ob0.f;
        try {
            objF2 = fjbVar.f(s90Var);
        } catch (IllegalArgumentException unused) {
        }
        Range range = (Range) objF2;
        Objects.requireNonNull(range);
        Range range2 = ob0.f;
        if (!range.equals(range2)) {
            x8a x8aVar = (x8a) w30Var.f;
            s90 s90Var2 = h52.k;
            x8aVar.getClass();
            try {
                objF = x8aVar.f(s90Var2);
            } catch (IllegalArgumentException unused2) {
                objF = range2;
            }
            if (((Range) objF).equals(range2)) {
                ((x8a) w30Var.f).n(h52.k, range);
            } else {
                x8a x8aVar2 = (x8a) w30Var.f;
                s90 s90Var3 = h52.k;
                Object objF3 = ob0.f;
                x8aVar2.getClass();
                try {
                    objF3 = x8aVar2.f(s90Var3);
                } catch (IllegalArgumentException unused3) {
                }
                if (!((Range) objF3).equals(range)) {
                    this.j = false;
                    gri.a("ValidatingBuilder", "Different ExpectedFrameRateRange values");
                }
            }
        }
        int iB = h52Var.b();
        if (iB != 0) {
            w30Var.getClass();
            if (iB != 0) {
                ((x8a) w30Var.f).n(xwg.q0, Integer.valueOf(iB));
            }
        }
        int iC = h52Var.c();
        if (iC != 0) {
            w30Var.getClass();
            if (iC != 0) {
                ((x8a) w30Var.f).n(xwg.r0, Integer.valueOf(iC));
            }
        }
        ryf ryfVar = h52Var.g;
        g9a g9aVar = (g9a) w30Var.g;
        HashSet hashSet = (HashSet) w30Var.e;
        g9aVar.a.putAll((Map) ryfVar.a);
        ((ArrayList) this.c).addAll(hieVar.c);
        ((ArrayList) this.d).addAll(hieVar.d);
        w30Var.a(h52Var.e);
        ((ArrayList) this.e).addAll(hieVar.e);
        fie fieVar = hieVar.f;
        if (fieVar != null) {
            this.l.add(fieVar);
        }
        InputConfiguration inputConfiguration = hieVar.h;
        if (inputConfiguration != null) {
            this.g = inputConfiguration;
        }
        linkedHashSet.addAll(hieVar.a);
        hashSet.addAll(Collections.unmodifiableList(h52Var.a));
        ArrayList arrayList = new ArrayList();
        for (kb0 kb0Var : linkedHashSet) {
            arrayList.add(kb0Var.a);
            Iterator it = kb0Var.b.iterator();
            while (it.hasNext()) {
                arrayList.add((zr4) it.next());
            }
        }
        if (!arrayList.containsAll(hashSet)) {
            gri.a("ValidatingBuilder", "Invalid configuration due to capture request surfaces are not a subset of surfaces");
            this.j = false;
        }
        kb0 kb0Var2 = hieVar.b;
        if (kb0Var2 != null) {
            kb0 kb0Var3 = (kb0) this.h;
            if (kb0Var3 == kb0Var2 || kb0Var3 == null) {
                this.h = kb0Var2;
            } else {
                gri.a("ValidatingBuilder", "Invalid configuration due to that two different postview output configs are set");
                this.j = false;
            }
        }
        w30Var.c(fjbVar);
    }

    public final hie g() {
        if (!this.j) {
            throw new IllegalArgumentException("Unsupported session configuration combination");
        }
        ArrayList arrayList = new ArrayList((LinkedHashSet) this.a);
        xn3 xn3Var = this.i;
        if (xn3Var.b) {
            Collections.sort(arrayList, new dj3(11, xn3Var));
        }
        return new hie(arrayList, new ArrayList((ArrayList) this.c), new ArrayList((ArrayList) this.d), new ArrayList((ArrayList) this.e), ((w30) this.b).d(), !this.l.isEmpty() ? new xc7(4, this) : null, (InputConfiguration) this.g, (kb0) this.h);
    }
}
