package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.C42813m;
import kotlin.jvm.internal.C42815o;
import kotlin.jvm.internal.C42823x;
import kotlin.text.C43044a;
import kotlin.time.e;

/* compiled from: Primitives.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-serialization-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class M0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final Object f412792a;

    static {
        kotlin.jvm.internal.n0 n0Var = kotlin.jvm.internal.m0.f406844a;
        kotlin.reflect.d dVarB = n0Var.b(String.class);
        kotlin.jvm.internal.u0 u0Var = kotlin.jvm.internal.u0.f406856a;
        kotlin.Q q12 = new kotlin.Q(dVarB, V0.f412822a);
        kotlin.reflect.d dVarB2 = n0Var.b(Character.TYPE);
        int i12 = kotlin.jvm.internal.r.f406849a;
        kotlin.Q q13 = new kotlin.Q(dVarB2, r.f412904a);
        kotlin.Q q14 = new kotlin.Q(n0Var.b(char[].class), C43423q.f412903c);
        kotlin.reflect.d dVarB3 = n0Var.b(Double.TYPE);
        int i13 = C42823x.f406860a;
        kotlin.Q q15 = new kotlin.Q(dVarB3, F.f412769a);
        kotlin.Q q16 = new kotlin.Q(n0Var.b(double[].class), E.f412763c);
        kotlin.reflect.d dVarB4 = n0Var.b(Float.TYPE);
        int i14 = kotlin.jvm.internal.A.f406820a;
        kotlin.Q q17 = new kotlin.Q(dVarB4, M.f412790a);
        kotlin.Q q18 = new kotlin.Q(n0Var.b(float[].class), L.f412787c);
        kotlin.reflect.d dVarB5 = n0Var.b(Long.TYPE);
        int i15 = kotlin.jvm.internal.Q.f406822a;
        kotlin.Q q19 = new kotlin.Q(dVarB5, C43412k0.f412877a);
        kotlin.Q q22 = new kotlin.Q(n0Var.b(long[].class), C43410j0.f412873c);
        kotlin.reflect.d dVarB6 = n0Var.b(kotlin.w0.class);
        int i16 = kotlin.w0.f410662c;
        kotlin.Q q23 = new kotlin.Q(dVarB6, j1.f412874a);
        kotlin.Q q24 = new kotlin.Q(n0Var.b(kotlin.x0.class), i1.f412870c);
        kotlin.reflect.d dVarB7 = n0Var.b(Integer.TYPE);
        int i17 = kotlin.jvm.internal.J.f406821a;
        kotlin.Q q25 = new kotlin.Q(dVarB7, Y.f412835a);
        kotlin.Q q26 = new kotlin.Q(n0Var.b(int[].class), X.f412826c);
        kotlin.reflect.d dVarB8 = n0Var.b(kotlin.s0.class);
        int i18 = kotlin.s0.f410475c;
        kotlin.Q q27 = new kotlin.Q(dVarB8, g1.f412860a);
        kotlin.Q q28 = new kotlin.Q(n0Var.b(kotlin.t0.class), f1.f412856c);
        kotlin.reflect.d dVarB9 = n0Var.b(Short.TYPE);
        int i19 = kotlin.jvm.internal.q0.f406848a;
        kotlin.Q q29 = new kotlin.Q(dVarB9, U0.f412820a);
        kotlin.Q q32 = new kotlin.Q(n0Var.b(short[].class), T0.f412818c);
        kotlin.reflect.d dVarB10 = n0Var.b(kotlin.C0.class);
        int i22 = kotlin.C0.f406602c;
        kotlin.Q q33 = new kotlin.Q(dVarB10, m1.f412893a);
        kotlin.Q q34 = new kotlin.Q(n0Var.b(kotlin.D0.class), l1.f412888c);
        kotlin.reflect.d dVarB11 = n0Var.b(Byte.TYPE);
        int i23 = C42815o.f406846a;
        kotlin.Q q35 = new kotlin.Q(dVarB11, C43413l.f412881a);
        kotlin.Q q36 = new kotlin.Q(n0Var.b(byte[].class), C43411k.f412876c);
        kotlin.reflect.d dVarB12 = n0Var.b(kotlin.o0.class);
        int i24 = kotlin.o0.f406874c;
        kotlin.Q q37 = new kotlin.Q(dVarB12, d1.f412850a);
        kotlin.Q q38 = new kotlin.Q(n0Var.b(kotlin.p0.class), c1.f412849c);
        kotlin.reflect.d dVarB13 = n0Var.b(Boolean.TYPE);
        int i25 = C42813m.f406843a;
        kotlin.Q q39 = new kotlin.Q(dVarB13, C43407i.f412866a);
        kotlin.Q q42 = new kotlin.Q(n0Var.b(boolean[].class), C43405h.f412862c);
        kotlin.reflect.d dVarB14 = n0Var.b(kotlin.G0.class);
        kotlin.G0 g02 = kotlin.G0.f406611a;
        kotlin.Q q43 = new kotlin.Q(dVarB14, n1.f412897b);
        kotlin.Q q44 = new kotlin.Q(n0Var.b(Void.class), C43431u0.f412916a);
        kotlin.reflect.d dVarB15 = n0Var.b(kotlin.time.e.class);
        e.a aVar = kotlin.time.e.f410651c;
        f412792a = kotlin.collections.P0.g(q12, q13, q14, q15, q16, q17, q18, q19, q22, q23, q24, q25, q26, q27, q28, q29, q32, q33, q34, q35, q36, q37, q38, q39, q42, q43, q44, new kotlin.Q(dVarB15, G.f412771a));
    }

    public static final String a(String str) {
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        char cCharAt = str.charAt(0);
        sb2.append((Object) (Character.isLowerCase(cCharAt) ? C43044a.e(cCharAt) : String.valueOf(cCharAt)));
        sb2.append(str.substring(1));
        return sb2.toString();
    }
}
