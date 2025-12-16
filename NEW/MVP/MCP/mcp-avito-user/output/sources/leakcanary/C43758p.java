package leakcanary;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import shark.AndroidObjectInspectors;
import shark.AndroidReferenceMatchers;
import shark.C48249f;
import shark.C48356w1;
import shark.L2;
import shark.O2;
import shark.ObjectInspectors;
import shark.R2;
import shark.a3;
import shark.g3;

/* compiled from: HeapAnalysisConfig.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lleakcanary/p;", "", "leakcanary-android-release_release"}, k = 1, mv = {1, 4, 1})
/* renamed from: leakcanary.p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* data */ class C43758p {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final List<g3> f414111a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<R2> f414112b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final O2 f414113c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f414114d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final L2 f414115e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f414116f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Y41.a<a3> f414117g;

    public C43758p() {
        this(null, null, null, false, null, false, null, 127, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43758p)) {
            return false;
        }
        C43758p c43758p = (C43758p) obj;
        return kotlin.jvm.internal.L.f(this.f414111a, c43758p.f414111a) && kotlin.jvm.internal.L.f(this.f414112b, c43758p.f414112b) && kotlin.jvm.internal.L.f(this.f414113c, c43758p.f414113c) && this.f414114d == c43758p.f414114d && kotlin.jvm.internal.L.f(this.f414115e, c43758p.f414115e) && this.f414116f == c43758p.f414116f && kotlin.jvm.internal.L.f(this.f414117g, c43758p.f414117g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        List<g3> list = this.f414111a;
        int iHashCode = (list != null ? list.hashCode() : 0) * 31;
        List<R2> list2 = this.f414112b;
        int iHashCode2 = (iHashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        O2 o22 = this.f414113c;
        int iHashCode3 = (iHashCode2 + (o22 != null ? o22.hashCode() : 0)) * 31;
        boolean z12 = this.f414114d;
        int i12 = z12;
        if (z12 != 0) {
            i12 = 1;
        }
        int i13 = (iHashCode3 + i12) * 31;
        L2 l22 = this.f414115e;
        int iHashCode4 = (i13 + (l22 != null ? l22.hashCode() : 0)) * 31;
        boolean z13 = this.f414116f;
        int i14 = (iHashCode4 + (z13 ? 1 : z13 ? 1 : 0)) * 31;
        Y41.a<a3> aVar = this.f414117g;
        return i14 + (aVar != null ? aVar.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "HeapAnalysisConfig(referenceMatchers=" + this.f414111a + ", objectInspectors=" + this.f414112b + ", metadataExtractor=" + this.f414113c + ", computeRetainedHeapSize=" + this.f414114d + ", leakingObjectFinder=" + this.f414115e + ", stripHeapDump=" + this.f414116f + ", proguardMappingProvider=" + this.f414117g + ")";
    }

    public C43758p(List list, List list2, O2 o22, boolean z12, L2 l22, boolean z13, Y41.a aVar, int i12, C42822w c42822w) {
        if ((i12 & 1) != 0) {
            AndroidReferenceMatchers.f437999d.getClass();
            EnumSet enumSetAllOf = EnumSet.allOf(AndroidReferenceMatchers.class);
            ArrayList arrayList = new ArrayList();
            Iterator it = enumSetAllOf.iterator();
            while (it.hasNext()) {
                ((AndroidReferenceMatchers) it.next()).a(arrayList);
            }
            list = arrayList;
        }
        if ((i12 & 2) != 0) {
            AndroidObjectInspectors.f437950f.getClass();
            ObjectInspectors.f438176f.getClass();
            List listG0 = C42756l.g0(ObjectInspectors.values());
            AndroidObjectInspectors[] androidObjectInspectorsArrValues = AndroidObjectInspectors.values();
            ArrayList arrayList2 = new ArrayList(listG0.size() + androidObjectInspectorsArrValues.length);
            arrayList2.addAll(listG0);
            C42745f0.i(arrayList2, androidObjectInspectorsArrValues);
            list2 = arrayList2;
        }
        o22 = (i12 & 4) != 0 ? C48249f.f438274a : o22;
        z12 = (i12 & 8) != 0 ? true : z12;
        if ((i12 & 16) != 0) {
            AndroidObjectInspectors.f437950f.getClass();
            l22 = new C48356w1(AndroidObjectInspectors.f437949e);
        }
        z13 = (i12 & 32) != 0 ? false : z13;
        aVar = (i12 & 64) != 0 ? C43757o.f414110l : aVar;
        this.f414111a = list;
        this.f414112b = list2;
        this.f414113c = o22;
        this.f414114d = z12;
        this.f414115e = l22;
        this.f414116f = z13;
        this.f414117g = aVar;
    }
}
