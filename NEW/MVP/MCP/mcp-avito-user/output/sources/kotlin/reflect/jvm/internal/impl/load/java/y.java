package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.KotlinVersion;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: JavaNullabilityAnnotationsStatus.kt */
/* loaded from: classes8.dex */
public final class y {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f408417d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final y f408418e = new y(ReportLevel.f407959e, null, null, 6, null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ReportLevel f408419a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final KotlinVersion f408420b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ReportLevel f408421c;

    /* compiled from: JavaNullabilityAnnotationsStatus.kt */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public y(@Y61.k ReportLevel reportLevel, @Y61.l KotlinVersion kotlinVersion, @Y61.k ReportLevel reportLevel2) {
        this.f408419a = reportLevel;
        this.f408420b = kotlinVersion;
        this.f408421c = reportLevel2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f408419a == yVar.f408419a && L.f(this.f408420b, yVar.f408420b) && this.f408421c == yVar.f408421c;
    }

    public final int hashCode() {
        int iHashCode = this.f408419a.hashCode() * 31;
        KotlinVersion kotlinVersion = this.f408420b;
        return this.f408421c.hashCode() + ((iHashCode + (kotlinVersion == null ? 0 : kotlinVersion.getVersion())) * 31);
    }

    @Y61.k
    public final String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.f408419a + ", sinceVersion=" + this.f408420b + ", reportLevelAfter=" + this.f408421c + ')';
    }

    public /* synthetic */ y(ReportLevel reportLevel, KotlinVersion kotlinVersion, ReportLevel reportLevel2, int i12, C42822w c42822w) {
        this(reportLevel, (i12 & 2) != 0 ? new KotlinVersion(1, 0) : kotlinVersion, (i12 & 4) != 0 ? reportLevel : reportLevel2);
    }
}
