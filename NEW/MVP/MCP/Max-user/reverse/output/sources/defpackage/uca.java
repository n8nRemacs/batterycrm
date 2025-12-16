package defpackage;

import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public abstract class uca {
    public static final AtomicReference a = new AtomicReference(new HashMap());
    public static final k18 b;
    public static final kce c;
    public static final bwf d;
    public static final bwf e;

    static {
        pca pcaVar = sxi.a;
        b = (pcaVar != null ? pcaVar : null).a;
        if (pcaVar == null) {
            pcaVar = null;
        }
        c = pcaVar.c;
        d = new bwf(new yq9(3));
        e = new bwf(new yq9(4));
    }

    public static final sca a(String str, int i, boolean z) {
        String str2;
        boolean z2;
        no4 no4Var;
        while (true) {
            AtomicReference atomicReference = a;
            HashMap map = (HashMap) atomicReference.get();
            HashMap map2 = new HashMap(map);
            sca scaVar = (sca) map2.get(str);
            if (scaVar == null) {
                pca pcaVar = sxi.a;
                if (pcaVar == null) {
                    pcaVar = null;
                }
                w7b w7bVar = pcaVar.b;
                int iV = az1.v(i);
                if (iV == 0) {
                    no4Var = (no4) d.getValue();
                } else {
                    if (iV != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    no4Var = (no4) e.getValue();
                }
                str2 = str;
                z2 = z;
                sca scaVar2 = new sca(w7bVar, no4Var, (ExecutorService) b.getValue(), str2, z2);
                map2.put(str2, scaVar2);
                scaVar2.d();
                map2.put(str2, scaVar2);
                scaVar = scaVar2;
            } else {
                str2 = str;
                z2 = z;
            }
            while (!atomicReference.compareAndSet(map, map2)) {
                if (atomicReference.get() != map) {
                    break;
                }
            }
            if (z2) {
                boolean z3 = scaVar.e;
                scaVar.e = true;
                if (!z3 && scaVar.e) {
                    scaVar.d();
                }
            }
            return scaVar;
            str = str2;
            z = z2;
        }
    }
}
