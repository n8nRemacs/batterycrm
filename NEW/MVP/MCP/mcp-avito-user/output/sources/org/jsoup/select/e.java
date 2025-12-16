package org.jsoup.select;

import org.jsoup.nodes.k;

/* compiled from: NodeTraversor.java */
/* loaded from: classes7.dex */
public class e {
    public static void a(k kVar, f fVar) {
        k kVarK = kVar;
        int i12 = 0;
        while (kVarK != null) {
            fVar.b(kVarK, i12);
            if (kVarK.l() > 0) {
                kVarK = kVarK.k(0);
                i12++;
            } else {
                while (kVarK.u() == null && i12 > 0) {
                    fVar.a(kVarK, i12);
                    kVarK = kVarK.f421096b;
                    i12--;
                }
                fVar.a(kVarK, i12);
                if (kVarK == kVar) {
                    return;
                } else {
                    kVarK = kVarK.u();
                }
            }
        }
    }
}
