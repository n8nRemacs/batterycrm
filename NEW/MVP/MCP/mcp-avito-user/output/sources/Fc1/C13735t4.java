package Fc1;

import java.util.LinkedHashMap;

/* renamed from: Fc1.t4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13735t4 {

    /* renamed from: a, reason: collision with root package name */
    public int f5833a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public kotlin.ranges.l f5834b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f5835c;

    public C13735t4() {
        int i12 = kotlin.jvm.internal.J.f406821a;
        this.f5833a = 0;
        kotlin.ranges.l.f406912f.getClass();
        this.f5834b = kotlin.ranges.l.f406913g;
        this.f5835c = new LinkedHashMap();
    }

    public final void a(@Y61.k C13672m3 c13672m3) {
        LinkedHashMap linkedHashMap = this.f5835c;
        if (linkedHashMap.containsKey("<s>")) {
            if (linkedHashMap.containsKey("<a>")) {
                kotlin.ranges.l lVar = (kotlin.ranges.l) linkedHashMap.get("<a>");
                if (lVar != null) {
                    c13672m3.invoke(null, new kotlin.ranges.l(lVar.f406905b, this.f5834b.f406905b, 1));
                }
                int i12 = this.f5834b.f406905b;
                linkedHashMap.put("<s>", new kotlin.ranges.l(i12, i12, 1));
                return;
            }
        } else if (linkedHashMap.containsKey("<a>")) {
            kotlin.ranges.l lVar2 = (kotlin.ranges.l) linkedHashMap.get("<a>");
            if (lVar2 != null) {
                c13672m3.invoke(new kotlin.ranges.l(lVar2.f406905b, this.f5834b.f406905b, 1), null);
            }
            linkedHashMap.remove("<s>");
            return;
        }
        linkedHashMap.put("<a>", this.f5834b);
    }

    public final void b(@Y61.k C13681n3 c13681n3) {
        LinkedHashMap linkedHashMap = this.f5835c;
        if (!linkedHashMap.containsKey("<s>")) {
            linkedHashMap.put("<s>", this.f5834b);
            return;
        }
        kotlin.ranges.l lVar = (kotlin.ranges.l) linkedHashMap.get("<s>");
        if (lVar != null) {
            int i12 = lVar.f406906c;
            int i13 = lVar.f406905b;
            if (i13 != i12) {
                c13681n3.invoke(new kotlin.ranges.l(i13, this.f5834b.f406905b, 1));
            }
        }
        linkedHashMap.remove("<s>");
    }

    public final void c(@Y61.k C13690o3 c13690o3) {
        LinkedHashMap linkedHashMap = this.f5835c;
        if (linkedHashMap.containsKey("<str>")) {
            kotlin.ranges.l lVar = (kotlin.ranges.l) linkedHashMap.get("<str>");
            lVar.getClass();
            if (!linkedHashMap.containsKey("<em>")) {
                linkedHashMap.put("<em>", this.f5834b);
                int i12 = this.f5834b.f406905b;
                int i13 = lVar.f406905b;
                if (i13 != i12) {
                    c13690o3.invoke(null, new kotlin.ranges.l(i13, this.f5834b.f406905b, 1), null);
                    return;
                }
                return;
            }
            kotlin.ranges.l lVar2 = (kotlin.ranges.l) linkedHashMap.get("<em>");
            if (lVar2 != null) {
                c13690o3.invoke(null, null, new kotlin.ranges.l(lVar2.f406905b, this.f5834b.f406905b, 1));
            }
            int i14 = this.f5834b.f406905b;
            linkedHashMap.put("<str>", new kotlin.ranges.l(i14, i14 + 4, 1));
        } else {
            if (!linkedHashMap.containsKey("<em>")) {
                linkedHashMap.put("<em>", this.f5834b);
                return;
            }
            kotlin.ranges.l lVar3 = (kotlin.ranges.l) linkedHashMap.get("<em>");
            if (lVar3 != null) {
                c13690o3.invoke(new kotlin.ranges.l(lVar3.f406905b, this.f5834b.f406905b, 1), null, null);
            }
        }
        linkedHashMap.remove("<em>");
    }

    public final void d(@Y61.k C13699p3 c13699p3) {
        LinkedHashMap linkedHashMap = this.f5835c;
        if (!linkedHashMap.containsKey("<str>")) {
            linkedHashMap.put("<str>", this.f5834b);
            return;
        }
        kotlin.ranges.l lVar = (kotlin.ranges.l) linkedHashMap.get("<str>");
        if (lVar != null) {
            int i12 = this.f5834b.f406905b;
            int i13 = lVar.f406905b;
            if (i13 != i12) {
                c13699p3.invoke(new kotlin.ranges.l(i13, this.f5834b.f406905b, 1));
            }
        }
        linkedHashMap.remove("<str>");
    }
}
