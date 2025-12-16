package androidx.constraintlayout.core.widgets.analyzer;

import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RunGroup.java */
/* loaded from: classes.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public p f43534a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList<p> f43535b;

    public static long a(f fVar, long j12) {
        p pVar = fVar.f43512d;
        if (pVar instanceof k) {
            return j12;
        }
        ArrayList arrayList = fVar.f43519k;
        int size = arrayList.size();
        long jMin = j12;
        for (int i12 = 0; i12 < size; i12++) {
            d dVar = (d) arrayList.get(i12);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f43512d != pVar) {
                    jMin = Math.min(jMin, a(fVar2, fVar2.f43514f + j12));
                }
            }
        }
        if (fVar != pVar.f43553i) {
            return jMin;
        }
        long j13 = pVar.j();
        long j14 = j12 - j13;
        return Math.min(Math.min(jMin, a(pVar.f43552h, j14)), j14 - r9.f43514f);
    }

    public static long b(f fVar, long j12) {
        p pVar = fVar.f43512d;
        if (pVar instanceof k) {
            return j12;
        }
        ArrayList arrayList = fVar.f43519k;
        int size = arrayList.size();
        long jMax = j12;
        for (int i12 = 0; i12 < size; i12++) {
            d dVar = (d) arrayList.get(i12);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f43512d != pVar) {
                    jMax = Math.max(jMax, b(fVar2, fVar2.f43514f + j12));
                }
            }
        }
        if (fVar != pVar.f43552h) {
            return jMax;
        }
        long j13 = pVar.j();
        long j14 = j12 + j13;
        return Math.max(Math.max(jMax, b(pVar.f43553i, j14)), j14 - r9.f43514f);
    }
}
