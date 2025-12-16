package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import Y61.k;
import Y61.l;
import java.util.Collections;
import java.util.Set;
import kotlin.collections.b1;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.types.F;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Y;

/* compiled from: JavaTypeAttributes.kt */
/* loaded from: classes8.dex */
public final class a extends F {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TypeUsage f408271d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final JavaTypeFlexibility f408272e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f408273f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f408274g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Set<g0> f408275h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final Y f408276i;

    public /* synthetic */ a(TypeUsage typeUsage, JavaTypeFlexibility javaTypeFlexibility, boolean z12, boolean z13, Set set, Y y12, int i12, C42822w c42822w) {
        this(typeUsage, (i12 & 2) != 0 ? JavaTypeFlexibility.f408266b : javaTypeFlexibility, (i12 & 4) != 0 ? false : z12, (i12 & 8) != 0 ? false : z13, (i12 & 16) != 0 ? null : set, (i12 & 32) != 0 ? null : y12);
    }

    public static a e(a aVar, JavaTypeFlexibility javaTypeFlexibility, boolean z12, Set set, Y y12, int i12) {
        TypeUsage typeUsage = aVar.f408271d;
        if ((i12 & 2) != 0) {
            javaTypeFlexibility = aVar.f408272e;
        }
        JavaTypeFlexibility javaTypeFlexibility2 = javaTypeFlexibility;
        if ((i12 & 4) != 0) {
            z12 = aVar.f408273f;
        }
        boolean z13 = z12;
        boolean z14 = aVar.f408274g;
        if ((i12 & 16) != 0) {
            set = aVar.f408275h;
        }
        Set set2 = set;
        if ((i12 & 32) != 0) {
            y12 = aVar.f408276i;
        }
        aVar.getClass();
        return new a(typeUsage, javaTypeFlexibility2, z13, z14, set2, y12);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.F
    @l
    public final Y a() {
        return this.f408276i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.F
    @k
    public final TypeUsage b() {
        return this.f408271d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.F
    @l
    public final Set<g0> c() {
        return this.f408275h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.F
    public final F d(g0 g0Var) {
        Set<g0> set = this.f408275h;
        return e(this, null, false, set != null ? b1.i(set, g0Var) : Collections.singleton(g0Var), null, 47);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.F
    public final boolean equals(@l Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(aVar.f408276i, this.f408276i) && aVar.f408271d == this.f408271d && aVar.f408272e == this.f408272e && aVar.f408273f == this.f408273f && aVar.f408274g == this.f408274g;
    }

    @k
    public final a f(@k JavaTypeFlexibility javaTypeFlexibility) {
        return e(this, javaTypeFlexibility, false, null, null, 61);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.F
    public final int hashCode() {
        Y y12 = this.f408276i;
        int iHashCode = y12 != null ? y12.hashCode() : 0;
        int iHashCode2 = this.f408271d.hashCode() + (iHashCode * 31) + iHashCode;
        int iHashCode3 = this.f408272e.hashCode() + (iHashCode2 * 31) + iHashCode2;
        int i12 = (iHashCode3 * 31) + (this.f408273f ? 1 : 0) + iHashCode3;
        return (i12 * 31) + (this.f408274g ? 1 : 0) + i12;
    }

    @k
    public final String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.f408271d + ", flexibility=" + this.f408272e + ", isRaw=" + this.f408273f + ", isForAnnotationParameter=" + this.f408274g + ", visitedTypeParameters=" + this.f408275h + ", defaultType=" + this.f408276i + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(@k TypeUsage typeUsage, @k JavaTypeFlexibility javaTypeFlexibility, boolean z12, boolean z13, @l Set<? extends g0> set, @l Y y12) {
        super(typeUsage, set, y12);
        this.f408271d = typeUsage;
        this.f408272e = javaTypeFlexibility;
        this.f408273f = z12;
        this.f408274g = z13;
        this.f408275h = set;
        this.f408276i = y12;
    }
}
