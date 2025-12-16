package kotlin.reflect.jvm.internal.impl.types.error;

import Y61.k;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.u0;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.j;
import kotlin.reflect.jvm.internal.impl.types.J0;
import kotlin.reflect.jvm.internal.impl.types.O;
import kotlin.reflect.jvm.internal.impl.types.Y;
import kotlin.reflect.jvm.internal.impl.types.n0;
import kotlin.reflect.jvm.internal.impl.types.q0;
import kotlin.reflect.jvm.internal.impl.types.x0;

/* compiled from: ErrorType.kt */
/* loaded from: classes8.dex */
public final class f extends Y {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final q0 f410185c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final j f410186d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ErrorTypeKind f410187e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final List<x0> f410188f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f410189g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final String[] f410190h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final String f410191i;

    /* JADX WARN: Multi-variable type inference failed */
    @X41.j
    public f(@k q0 q0Var, @k j jVar, @k ErrorTypeKind errorTypeKind, @k List<? extends x0> list, boolean z12, @k String... strArr) {
        this.f410185c = q0Var;
        this.f410186d = jVar;
        this.f410187e = errorTypeKind;
        this.f410188f = list;
        this.f410189g = z12;
        this.f410190h = strArr;
        u0 u0Var = u0.f406856a;
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        this.f410191i = String.format(errorTypeKind.f410175b, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.O
    @k
    public final List<x0> F0() {
        return this.f410188f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.O
    @k
    public final n0 G0() {
        n0.f410236c.getClass();
        return n0.f410237d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.O
    @k
    public final q0 H0() {
        return this.f410185c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.O
    public final boolean I0() {
        return this.f410189g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.Y
    @k
    /* renamed from: O0 */
    public final Y L0(boolean z12) {
        String[] strArr = this.f410190h;
        return new f(this.f410185c, this.f410186d, this.f410187e, this.f410188f, z12, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.O
    @k
    public final j n() {
        return this.f410186d;
    }

    public f(q0 q0Var, j jVar, ErrorTypeKind errorTypeKind, List list, boolean z12, String[] strArr, int i12, C42822w c42822w) {
        this(q0Var, jVar, errorTypeKind, (i12 & 8) != 0 ? C42784z0.f406748b : list, (i12 & 16) != 0 ? false : z12, strArr);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.O
    /* renamed from: J0 */
    public final O M0(kotlin.reflect.jvm.internal.impl.types.checker.i iVar) {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.J0
    /* renamed from: M0 */
    public final J0 J0(kotlin.reflect.jvm.internal.impl.types.checker.i iVar) {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.Y, kotlin.reflect.jvm.internal.impl.types.J0
    public final J0 N0(n0 n0Var) {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.Y
    @k
    /* renamed from: P0 */
    public final Y N0(@k n0 n0Var) {
        return this;
    }
}
