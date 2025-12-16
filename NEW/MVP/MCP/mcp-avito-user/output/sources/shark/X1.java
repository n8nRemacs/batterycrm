package shark;

import kotlin.Metadata;
import shark.M1;
import shark.q3;

/* compiled from: HeapValue.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/X1;", "", "shark-graph"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class X1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final L1 f438227a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final q3 f438228b;

    public X1(@Y61.k L1 l12, @Y61.k q3 q3Var) {
        this.f438227a = l12;
        this.f438228b = q3Var;
    }

    @Y61.l
    public final Boolean a() {
        q3 q3Var = this.f438228b;
        if (q3Var instanceof q3.a) {
            return Boolean.valueOf(((q3.a) q3Var).f438681a);
        }
        return null;
    }

    @Y61.l
    public final Integer b() {
        q3 q3Var = this.f438228b;
        if (q3Var instanceof q3.g) {
            return Integer.valueOf(((q3.g) q3Var).f438686a);
        }
        return null;
    }

    @Y61.l
    public final Long c() {
        q3 q3Var = this.f438228b;
        if (q3Var instanceof q3.h) {
            return Long.valueOf(((q3.h) q3Var).f438687a);
        }
        return null;
    }

    @Y61.l
    public final Long d() {
        q3 q3Var = this.f438228b;
        if (!(q3Var instanceof q3.i) || ((q3.i) q3Var).a()) {
            return null;
        }
        return Long.valueOf(((q3.i) q3Var).f438688a);
    }

    @Y61.l
    public final M1 e() {
        q3 q3Var = this.f438228b;
        if (!(q3Var instanceof q3.i)) {
            return null;
        }
        q3.i iVar = (q3.i) q3Var;
        if (iVar.a()) {
            return null;
        }
        return this.f438227a.f(iVar.f438688a);
    }

    @Y61.l
    public final Long f() {
        q3 q3Var = this.f438228b;
        if (q3Var instanceof q3.i) {
            return Long.valueOf(((q3.i) q3Var).f438688a);
        }
        return null;
    }

    public final boolean g() {
        q3 q3Var = this.f438228b;
        return (q3Var instanceof q3.i) && !((q3.i) q3Var).a();
    }

    public final boolean h() {
        q3 q3Var = this.f438228b;
        return (q3Var instanceof q3.i) && ((q3.i) q3Var).a();
    }

    @Y61.l
    public final String i() {
        M1.c cVarA;
        q3 q3Var = this.f438228b;
        if (!(q3Var instanceof q3.i) || ((q3.i) q3Var).a()) {
            return null;
        }
        M1 m1B = this.f438227a.b(((q3.i) q3Var).f438688a);
        if (m1B == null || (cVarA = m1B.a()) == null) {
            return null;
        }
        return cVarA.i();
    }
}
