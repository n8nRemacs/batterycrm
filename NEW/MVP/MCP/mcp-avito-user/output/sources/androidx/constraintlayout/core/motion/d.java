package androidx.constraintlayout.core.motion;

import java.util.LinkedHashMap;

/* compiled from: MotionConstrainedPoint.java */
/* loaded from: classes.dex */
class d implements Comparable<d> {

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap<String, a> f43251b = new LinkedHashMap<>();

    public final void a(f fVar) {
        fVar.f43256a.getClass();
        fVar.f43256a.getClass();
        fVar.f43256a.getClass();
        fVar.f43256a.getClass();
        fVar.f43258c.getClass();
        for (String str : fVar.f43256a.f43380a.keySet()) {
            a aVar = fVar.f43256a.f43380a.get(str);
            if (aVar != null) {
                this.f43251b.put(str, aVar);
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(d dVar) {
        dVar.getClass();
        return Float.compare(0.0f, 0.0f);
    }
}
