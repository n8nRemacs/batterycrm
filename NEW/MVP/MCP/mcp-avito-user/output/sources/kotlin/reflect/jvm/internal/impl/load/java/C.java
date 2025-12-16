package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Map;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: Jsr305Settings.kt */
/* loaded from: classes8.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ReportLevel f407906a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final ReportLevel f407907b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Map<kotlin.reflect.jvm.internal.impl.name.c, ReportLevel> f407908c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f407909d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f407910e;

    public C() {
        throw null;
    }

    public C(ReportLevel reportLevel, ReportLevel reportLevel2, Map map, int i12, C42822w c42822w) {
        reportLevel2 = (i12 & 2) != 0 ? null : reportLevel2;
        map = (i12 & 4) != 0 ? P0.c() : map;
        this.f407906a = reportLevel;
        this.f407907b = reportLevel2;
        this.f407908c = map;
        this.f407909d = C42727D.c(new B(this));
        ReportLevel reportLevel3 = ReportLevel.f407957c;
        this.f407910e = reportLevel == reportLevel3 && reportLevel2 == reportLevel3 && map.isEmpty();
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c12 = (C) obj;
        return this.f407906a == c12.f407906a && this.f407907b == c12.f407907b && L.f(this.f407908c, c12.f407908c);
    }

    public final int hashCode() {
        int iHashCode = this.f407906a.hashCode() * 31;
        ReportLevel reportLevel = this.f407907b;
        return this.f407908c.hashCode() + ((iHashCode + (reportLevel == null ? 0 : reportLevel.hashCode())) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Jsr305Settings(globalLevel=");
        sb2.append(this.f407906a);
        sb2.append(", migrationLevel=");
        sb2.append(this.f407907b);
        sb2.append(", userDefinedLevelForSpecificAnnotation=");
        return androidx.appcompat.app.r.w(sb2, this.f407908c, ')');
    }
}
