package androidx.constraintlayout.core.motion;

import java.util.HashMap;

/* compiled from: MotionPaths.java */
/* loaded from: classes.dex */
public class e implements Comparable<e> {

    /* renamed from: b, reason: collision with root package name */
    public float f43252b;

    /* renamed from: c, reason: collision with root package name */
    public float f43253c;

    /* renamed from: d, reason: collision with root package name */
    public float f43254d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap<String, a> f43255e = new HashMap<>();

    public final void a(f fVar) {
        fVar.f43257b.getClass();
        androidx.constraintlayout.core.motion.utils.d dVar = androidx.constraintlayout.core.motion.utils.d.f43283b;
        fVar.f43257b.getClass();
        fVar.f43258c.getClass();
        for (String str : fVar.f43256a.f43380a.keySet()) {
            a aVar = fVar.f43256a.f43380a.get(str);
            if (aVar != null) {
                this.f43255e.put(str, aVar);
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(e eVar) {
        return Float.compare(this.f43252b, eVar.f43252b);
    }
}
