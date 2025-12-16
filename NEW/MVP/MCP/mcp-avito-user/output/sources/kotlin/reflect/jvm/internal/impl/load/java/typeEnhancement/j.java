package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.C42822w;

/* compiled from: NullabilityQualifierWithMigrationStatus.kt */
/* loaded from: classes8.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final NullabilityQualifier f408345a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f408346b;

    public j(@Y61.k NullabilityQualifier nullabilityQualifier, boolean z12) {
        this.f408345a = nullabilityQualifier;
        this.f408346b = z12;
    }

    public static j a(j jVar, NullabilityQualifier nullabilityQualifier, boolean z12, int i12) {
        if ((i12 & 1) != 0) {
            nullabilityQualifier = jVar.f408345a;
        }
        if ((i12 & 2) != 0) {
            z12 = jVar.f408346b;
        }
        jVar.getClass();
        return new j(nullabilityQualifier, z12);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f408345a == jVar.f408345a && this.f408346b == jVar.f408346b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f408346b) + (this.f408345a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NullabilityQualifierWithMigrationStatus(qualifier=");
        sb2.append(this.f408345a);
        sb2.append(", isForWarningOnly=");
        return androidx.appcompat.app.r.x(sb2, this.f408346b, ')');
    }

    public /* synthetic */ j(NullabilityQualifier nullabilityQualifier, boolean z12, int i12, C42822w c42822w) {
        this(nullabilityQualifier, (i12 & 2) != 0 ? false : z12);
    }
}
