package androidx.constraintlayout.core.widgets;

import android.view.View;
import androidx.compose.foundation.H;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.analyzer.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class ConstraintWidget {

    /* renamed from: A, reason: collision with root package name */
    public int f43403A;

    /* renamed from: B, reason: collision with root package name */
    public float f43404B;

    /* renamed from: C, reason: collision with root package name */
    public int[] f43405C;

    /* renamed from: D, reason: collision with root package name */
    public float f43406D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f43407E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f43408F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f43409G;

    /* renamed from: H, reason: collision with root package name */
    public int f43410H;

    /* renamed from: I, reason: collision with root package name */
    public int f43411I;

    /* renamed from: J, reason: collision with root package name */
    public final ConstraintAnchor f43412J;

    /* renamed from: K, reason: collision with root package name */
    public final ConstraintAnchor f43413K;

    /* renamed from: L, reason: collision with root package name */
    public final ConstraintAnchor f43414L;

    /* renamed from: M, reason: collision with root package name */
    public final ConstraintAnchor f43415M;

    /* renamed from: N, reason: collision with root package name */
    public final ConstraintAnchor f43416N;

    /* renamed from: O, reason: collision with root package name */
    public final ConstraintAnchor f43417O;

    /* renamed from: P, reason: collision with root package name */
    public final ConstraintAnchor f43418P;

    /* renamed from: Q, reason: collision with root package name */
    public final ConstraintAnchor f43419Q;

    /* renamed from: R, reason: collision with root package name */
    public final ConstraintAnchor[] f43420R;

    /* renamed from: S, reason: collision with root package name */
    public final ArrayList<ConstraintAnchor> f43421S;

    /* renamed from: T, reason: collision with root package name */
    public final boolean[] f43422T;

    /* renamed from: U, reason: collision with root package name */
    public DimensionBehaviour[] f43423U;

    /* renamed from: V, reason: collision with root package name */
    public ConstraintWidget f43424V;

    /* renamed from: W, reason: collision with root package name */
    public int f43425W;

    /* renamed from: X, reason: collision with root package name */
    public int f43426X;

    /* renamed from: Y, reason: collision with root package name */
    public float f43427Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f43428Z;

    /* renamed from: a0, reason: collision with root package name */
    public int f43430a0;

    /* renamed from: b, reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.analyzer.c f43431b;

    /* renamed from: b0, reason: collision with root package name */
    public int f43432b0;

    /* renamed from: c, reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.analyzer.c f43433c;

    /* renamed from: c0, reason: collision with root package name */
    public int f43434c0;

    /* renamed from: d0, reason: collision with root package name */
    public int f43436d0;

    /* renamed from: e0, reason: collision with root package name */
    public int f43438e0;

    /* renamed from: f0, reason: collision with root package name */
    public float f43440f0;

    /* renamed from: g0, reason: collision with root package name */
    public float f43442g0;

    /* renamed from: h0, reason: collision with root package name */
    public View f43444h0;

    /* renamed from: i0, reason: collision with root package name */
    public int f43446i0;

    /* renamed from: j, reason: collision with root package name */
    public String f43447j;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f43448j0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f43449k;

    /* renamed from: k0, reason: collision with root package name */
    public String f43450k0;

    /* renamed from: l, reason: collision with root package name */
    public boolean f43451l;

    /* renamed from: l0, reason: collision with root package name */
    public int f43452l0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f43453m;

    /* renamed from: m0, reason: collision with root package name */
    public int f43454m0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f43455n;

    /* renamed from: n0, reason: collision with root package name */
    public final float[] f43456n0;

    /* renamed from: o, reason: collision with root package name */
    public int f43457o;

    /* renamed from: o0, reason: collision with root package name */
    public final ConstraintWidget[] f43458o0;

    /* renamed from: p, reason: collision with root package name */
    public int f43459p;

    /* renamed from: p0, reason: collision with root package name */
    public final ConstraintWidget[] f43460p0;

    /* renamed from: q, reason: collision with root package name */
    public int f43461q;

    /* renamed from: q0, reason: collision with root package name */
    public ConstraintWidget f43462q0;

    /* renamed from: r, reason: collision with root package name */
    public int f43463r;

    /* renamed from: r0, reason: collision with root package name */
    public ConstraintWidget f43464r0;

    /* renamed from: s, reason: collision with root package name */
    public int f43465s;

    /* renamed from: s0, reason: collision with root package name */
    public int f43466s0;

    /* renamed from: t, reason: collision with root package name */
    public final int[] f43467t;

    /* renamed from: t0, reason: collision with root package name */
    public int f43468t0;

    /* renamed from: u, reason: collision with root package name */
    public int f43469u;

    /* renamed from: v, reason: collision with root package name */
    public int f43470v;

    /* renamed from: w, reason: collision with root package name */
    public float f43471w;

    /* renamed from: x, reason: collision with root package name */
    public int f43472x;

    /* renamed from: y, reason: collision with root package name */
    public int f43473y;

    /* renamed from: z, reason: collision with root package name */
    public float f43474z;

    /* renamed from: a, reason: collision with root package name */
    public boolean f43429a = false;

    /* renamed from: d, reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.analyzer.l f43435d = null;

    /* renamed from: e, reason: collision with root package name */
    public n f43437e = null;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f43439f = {true, true};

    /* renamed from: g, reason: collision with root package name */
    public boolean f43441g = true;

    /* renamed from: h, reason: collision with root package name */
    public int f43443h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f43445i = -1;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class DimensionBehaviour {

        /* renamed from: b, reason: collision with root package name */
        public static final DimensionBehaviour f43475b;

        /* renamed from: c, reason: collision with root package name */
        public static final DimensionBehaviour f43476c;

        /* renamed from: d, reason: collision with root package name */
        public static final DimensionBehaviour f43477d;

        /* renamed from: e, reason: collision with root package name */
        public static final DimensionBehaviour f43478e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ DimensionBehaviour[] f43479f;

        static {
            DimensionBehaviour dimensionBehaviour = new DimensionBehaviour("FIXED", 0);
            f43475b = dimensionBehaviour;
            DimensionBehaviour dimensionBehaviour2 = new DimensionBehaviour("WRAP_CONTENT", 1);
            f43476c = dimensionBehaviour2;
            DimensionBehaviour dimensionBehaviour3 = new DimensionBehaviour("MATCH_CONSTRAINT", 2);
            f43477d = dimensionBehaviour3;
            DimensionBehaviour dimensionBehaviour4 = new DimensionBehaviour("MATCH_PARENT", 3);
            f43478e = dimensionBehaviour4;
            f43479f = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour2, dimensionBehaviour3, dimensionBehaviour4};
        }

        public DimensionBehaviour() {
            throw null;
        }

        public static DimensionBehaviour valueOf(String str) {
            return (DimensionBehaviour) Enum.valueOf(DimensionBehaviour.class, str);
        }

        public static DimensionBehaviour[] values() {
            return (DimensionBehaviour[]) f43479f.clone();
        }
    }

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43480a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f43481b;

        static {
            int[] iArr = new int[DimensionBehaviour.values().length];
            f43481b = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43481b[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f43481b[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f43481b[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ConstraintAnchor.Type.values().length];
            f43480a = iArr2;
            try {
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f43480a[2] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f43480a[3] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f43480a[4] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f43480a[5] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f43480a[6] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f43480a[7] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f43480a[8] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f43480a[0] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public ConstraintWidget() {
        new androidx.constraintlayout.core.state.h(0);
        this.f43449k = false;
        this.f43451l = false;
        this.f43453m = false;
        this.f43455n = false;
        this.f43457o = -1;
        this.f43459p = -1;
        this.f43461q = 0;
        this.f43463r = 0;
        this.f43465s = 0;
        this.f43467t = new int[2];
        this.f43469u = 0;
        this.f43470v = 0;
        this.f43471w = 1.0f;
        this.f43472x = 0;
        this.f43473y = 0;
        this.f43474z = 1.0f;
        this.f43403A = -1;
        this.f43404B = 1.0f;
        this.f43405C = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.f43406D = 0.0f;
        this.f43407E = false;
        this.f43409G = false;
        this.f43410H = 0;
        this.f43411I = 0;
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.f43393b);
        this.f43412J = constraintAnchor;
        ConstraintAnchor constraintAnchor2 = new ConstraintAnchor(this, ConstraintAnchor.Type.f43394c);
        this.f43413K = constraintAnchor2;
        ConstraintAnchor constraintAnchor3 = new ConstraintAnchor(this, ConstraintAnchor.Type.f43395d);
        this.f43414L = constraintAnchor3;
        ConstraintAnchor constraintAnchor4 = new ConstraintAnchor(this, ConstraintAnchor.Type.f43396e);
        this.f43415M = constraintAnchor4;
        ConstraintAnchor constraintAnchor5 = new ConstraintAnchor(this, ConstraintAnchor.Type.f43397f);
        this.f43416N = constraintAnchor5;
        ConstraintAnchor constraintAnchor6 = new ConstraintAnchor(this, ConstraintAnchor.Type.f43399h);
        this.f43417O = constraintAnchor6;
        ConstraintAnchor constraintAnchor7 = new ConstraintAnchor(this, ConstraintAnchor.Type.f43400i);
        this.f43418P = constraintAnchor7;
        ConstraintAnchor constraintAnchor8 = new ConstraintAnchor(this, ConstraintAnchor.Type.f43398g);
        this.f43419Q = constraintAnchor8;
        this.f43420R = new ConstraintAnchor[]{constraintAnchor, constraintAnchor3, constraintAnchor2, constraintAnchor4, constraintAnchor5, constraintAnchor8};
        ArrayList<ConstraintAnchor> arrayList = new ArrayList<>();
        this.f43421S = arrayList;
        this.f43422T = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.f43475b;
        this.f43423U = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.f43424V = null;
        this.f43425W = 0;
        this.f43426X = 0;
        this.f43427Y = 0.0f;
        this.f43428Z = -1;
        this.f43430a0 = 0;
        this.f43432b0 = 0;
        this.f43434c0 = 0;
        this.f43440f0 = 0.5f;
        this.f43442g0 = 0.5f;
        this.f43446i0 = 0;
        this.f43448j0 = false;
        this.f43450k0 = null;
        this.f43452l0 = 0;
        this.f43454m0 = 0;
        this.f43456n0 = new float[]{-1.0f, -1.0f};
        this.f43458o0 = new ConstraintWidget[]{null, null};
        this.f43460p0 = new ConstraintWidget[]{null, null};
        this.f43462q0 = null;
        this.f43464r0 = null;
        this.f43466s0 = -1;
        this.f43468t0 = -1;
        arrayList.add(constraintAnchor);
        arrayList.add(constraintAnchor2);
        arrayList.add(constraintAnchor3);
        arrayList.add(constraintAnchor4);
        arrayList.add(constraintAnchor6);
        arrayList.add(constraintAnchor7);
        arrayList.add(constraintAnchor8);
        arrayList.add(constraintAnchor5);
    }

    public static void K(int i12, int i13, String str, StringBuilder sb2) {
        if (i12 == i13) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(i12);
        sb2.append(",\n");
    }

    public static void L(StringBuilder sb2, String str, float f12, float f13) {
        if (f12 == f13) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(f12);
        sb2.append(",\n");
    }

    public static void s(StringBuilder sb2, String str, int i12, int i13, int i14, int i15, int i16, float f12) {
        sb2.append(str);
        sb2.append(" :  {\n");
        K(i12, 0, "      size", sb2);
        K(i13, 0, "      min", sb2);
        K(i14, Integer.MAX_VALUE, "      max", sb2);
        K(i15, 0, "      matchMin", sb2);
        K(i16, 0, "      matchDef", sb2);
        L(sb2, "      matchPercent", f12, 1.0f);
        sb2.append("    },\n");
    }

    public static void t(StringBuilder sb2, String str, ConstraintAnchor constraintAnchor) {
        if (constraintAnchor.f43389f == null) {
            return;
        }
        sb2.append("    ");
        sb2.append(str);
        sb2.append(" : [ '");
        sb2.append(constraintAnchor.f43389f);
        sb2.append("'");
        if (constraintAnchor.f43391h != Integer.MIN_VALUE || constraintAnchor.f43390g != 0) {
            sb2.append(",");
            sb2.append(constraintAnchor.f43390g);
            if (constraintAnchor.f43391h != Integer.MIN_VALUE) {
                sb2.append(",");
                sb2.append(constraintAnchor.f43391h);
                sb2.append(",");
            }
        }
        sb2.append(" ] ,\n");
    }

    public final boolean A(int i12) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        int i13 = i12 * 2;
        ConstraintAnchor[] constraintAnchorArr = this.f43420R;
        ConstraintAnchor constraintAnchor3 = constraintAnchorArr[i13];
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f43389f;
        return (constraintAnchor4 == null || constraintAnchor4.f43389f == constraintAnchor3 || (constraintAnchor2 = (constraintAnchor = constraintAnchorArr[i13 + 1]).f43389f) == null || constraintAnchor2.f43389f != constraintAnchor) ? false : true;
    }

    public final boolean B() {
        ConstraintAnchor constraintAnchor = this.f43412J;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f43389f;
        if (constraintAnchor2 != null && constraintAnchor2.f43389f == constraintAnchor) {
            return true;
        }
        ConstraintAnchor constraintAnchor3 = this.f43414L;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f43389f;
        return constraintAnchor4 != null && constraintAnchor4.f43389f == constraintAnchor3;
    }

    public final boolean C() {
        ConstraintAnchor constraintAnchor = this.f43413K;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f43389f;
        if (constraintAnchor2 != null && constraintAnchor2.f43389f == constraintAnchor) {
            return true;
        }
        ConstraintAnchor constraintAnchor3 = this.f43415M;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f43389f;
        return constraintAnchor4 != null && constraintAnchor4.f43389f == constraintAnchor3;
    }

    public final boolean D() {
        return this.f43441g && this.f43446i0 != 8;
    }

    public boolean E() {
        return this.f43449k || (this.f43412J.f43386c && this.f43414L.f43386c);
    }

    public boolean F() {
        return this.f43451l || (this.f43413K.f43386c && this.f43415M.f43386c);
    }

    public void G() {
        this.f43412J.j();
        this.f43413K.j();
        this.f43414L.j();
        this.f43415M.j();
        this.f43416N.j();
        this.f43417O.j();
        this.f43418P.j();
        this.f43419Q.j();
        this.f43424V = null;
        this.f43406D = 0.0f;
        this.f43425W = 0;
        this.f43426X = 0;
        this.f43427Y = 0.0f;
        this.f43428Z = -1;
        this.f43430a0 = 0;
        this.f43432b0 = 0;
        this.f43434c0 = 0;
        this.f43436d0 = 0;
        this.f43438e0 = 0;
        this.f43440f0 = 0.5f;
        this.f43442g0 = 0.5f;
        DimensionBehaviour[] dimensionBehaviourArr = this.f43423U;
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.f43475b;
        dimensionBehaviourArr[0] = dimensionBehaviour;
        dimensionBehaviourArr[1] = dimensionBehaviour;
        this.f43444h0 = null;
        this.f43446i0 = 0;
        this.f43452l0 = 0;
        this.f43454m0 = 0;
        float[] fArr = this.f43456n0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f43457o = -1;
        this.f43459p = -1;
        int[] iArr = this.f43405C;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f43463r = 0;
        this.f43465s = 0;
        this.f43471w = 1.0f;
        this.f43474z = 1.0f;
        this.f43470v = Integer.MAX_VALUE;
        this.f43473y = Integer.MAX_VALUE;
        this.f43469u = 0;
        this.f43472x = 0;
        this.f43403A = -1;
        this.f43404B = 1.0f;
        boolean[] zArr = this.f43439f;
        zArr[0] = true;
        zArr[1] = true;
        this.f43409G = false;
        boolean[] zArr2 = this.f43422T;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f43441g = true;
        int[] iArr2 = this.f43467t;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.f43443h = -1;
        this.f43445i = -1;
    }

    public final void H() {
        ConstraintWidget constraintWidget = this.f43424V;
        if (constraintWidget != null && (constraintWidget instanceof d)) {
            ((d) constraintWidget).getClass();
        }
        ArrayList<ConstraintAnchor> arrayList = this.f43421S;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            arrayList.get(i12).j();
        }
    }

    public final void I() {
        this.f43449k = false;
        this.f43451l = false;
        this.f43453m = false;
        this.f43455n = false;
        ArrayList<ConstraintAnchor> arrayList = this.f43421S;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            ConstraintAnchor constraintAnchor = arrayList.get(i12);
            constraintAnchor.f43386c = false;
            constraintAnchor.f43385b = 0;
        }
    }

    public void J(androidx.constraintlayout.core.c cVar) {
        this.f43412J.k();
        this.f43413K.k();
        this.f43414L.k();
        this.f43415M.k();
        this.f43416N.k();
        this.f43419Q.k();
        this.f43417O.k();
        this.f43418P.k();
    }

    public final void M(int i12) {
        this.f43434c0 = i12;
        this.f43407E = i12 > 0;
    }

    public final void N(int i12, int i13) {
        if (this.f43449k) {
            return;
        }
        this.f43412J.l(i12);
        this.f43414L.l(i13);
        this.f43430a0 = i12;
        this.f43425W = i13 - i12;
        this.f43449k = true;
    }

    public final void O(int i12, int i13) {
        if (this.f43451l) {
            return;
        }
        this.f43413K.l(i12);
        this.f43415M.l(i13);
        this.f43432b0 = i12;
        this.f43426X = i13 - i12;
        if (this.f43407E) {
            this.f43416N.l(i12 + this.f43434c0);
        }
        this.f43451l = true;
    }

    public final void P(int i12) {
        this.f43426X = i12;
        int i13 = this.f43438e0;
        if (i12 < i13) {
            this.f43426X = i13;
        }
    }

    public final void Q(DimensionBehaviour dimensionBehaviour) {
        this.f43423U[0] = dimensionBehaviour;
    }

    public final void R(DimensionBehaviour dimensionBehaviour) {
        this.f43423U[1] = dimensionBehaviour;
    }

    public final void S(int i12) {
        this.f43425W = i12;
        int i13 = this.f43436d0;
        if (i12 < i13) {
            this.f43425W = i13;
        }
    }

    public void T(boolean z12, boolean z13) {
        int i12;
        int i13;
        androidx.constraintlayout.core.widgets.analyzer.l lVar = this.f43435d;
        boolean z14 = z12 & lVar.f43551g;
        n nVar = this.f43437e;
        boolean z15 = z13 & nVar.f43551g;
        int i14 = lVar.f43552h.f43515g;
        int i15 = nVar.f43552h.f43515g;
        int i16 = lVar.f43553i.f43515g;
        int i17 = nVar.f43553i.f43515g;
        int i18 = i17 - i15;
        if (i16 - i14 < 0 || i18 < 0 || i14 == Integer.MIN_VALUE || i14 == Integer.MAX_VALUE || i15 == Integer.MIN_VALUE || i15 == Integer.MAX_VALUE || i16 == Integer.MIN_VALUE || i16 == Integer.MAX_VALUE || i17 == Integer.MIN_VALUE || i17 == Integer.MAX_VALUE) {
            i16 = 0;
            i17 = 0;
            i14 = 0;
            i15 = 0;
        }
        int i19 = i16 - i14;
        int i22 = i17 - i15;
        if (z14) {
            this.f43430a0 = i14;
        }
        if (z15) {
            this.f43432b0 = i15;
        }
        if (this.f43446i0 == 8) {
            this.f43425W = 0;
            this.f43426X = 0;
            return;
        }
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.f43475b;
        if (z14) {
            if (this.f43423U[0] == dimensionBehaviour && i19 < (i13 = this.f43425W)) {
                i19 = i13;
            }
            this.f43425W = i19;
            int i23 = this.f43436d0;
            if (i19 < i23) {
                this.f43425W = i23;
            }
        }
        if (z15) {
            if (this.f43423U[1] == dimensionBehaviour && i22 < (i12 = this.f43426X)) {
                i22 = i12;
            }
            this.f43426X = i22;
            int i24 = this.f43438e0;
            if (i22 < i24) {
                this.f43426X = i24;
            }
        }
    }

    public void U(androidx.constraintlayout.core.e eVar, boolean z12) {
        int i12;
        int i13;
        n nVar;
        androidx.constraintlayout.core.widgets.analyzer.l lVar;
        ConstraintAnchor constraintAnchor = this.f43412J;
        eVar.getClass();
        int iN2 = androidx.constraintlayout.core.e.n(constraintAnchor);
        int iN3 = androidx.constraintlayout.core.e.n(this.f43413K);
        int iN4 = androidx.constraintlayout.core.e.n(this.f43414L);
        int iN5 = androidx.constraintlayout.core.e.n(this.f43415M);
        if (z12 && (lVar = this.f43435d) != null) {
            androidx.constraintlayout.core.widgets.analyzer.f fVar = lVar.f43552h;
            if (fVar.f43518j) {
                androidx.constraintlayout.core.widgets.analyzer.f fVar2 = lVar.f43553i;
                if (fVar2.f43518j) {
                    iN2 = fVar.f43515g;
                    iN4 = fVar2.f43515g;
                }
            }
        }
        if (z12 && (nVar = this.f43437e) != null) {
            androidx.constraintlayout.core.widgets.analyzer.f fVar3 = nVar.f43552h;
            if (fVar3.f43518j) {
                androidx.constraintlayout.core.widgets.analyzer.f fVar4 = nVar.f43553i;
                if (fVar4.f43518j) {
                    iN3 = fVar3.f43515g;
                    iN5 = fVar4.f43515g;
                }
            }
        }
        int i14 = iN5 - iN3;
        if (iN4 - iN2 < 0 || i14 < 0 || iN2 == Integer.MIN_VALUE || iN2 == Integer.MAX_VALUE || iN3 == Integer.MIN_VALUE || iN3 == Integer.MAX_VALUE || iN4 == Integer.MIN_VALUE || iN4 == Integer.MAX_VALUE || iN5 == Integer.MIN_VALUE || iN5 == Integer.MAX_VALUE) {
            iN2 = 0;
            iN3 = 0;
            iN4 = 0;
            iN5 = 0;
        }
        int i15 = iN4 - iN2;
        int i16 = iN5 - iN3;
        this.f43430a0 = iN2;
        this.f43432b0 = iN3;
        if (this.f43446i0 == 8) {
            this.f43425W = 0;
            this.f43426X = 0;
            return;
        }
        DimensionBehaviour[] dimensionBehaviourArr = this.f43423U;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        DimensionBehaviour dimensionBehaviour2 = DimensionBehaviour.f43475b;
        if (dimensionBehaviour == dimensionBehaviour2 && i15 < (i13 = this.f43425W)) {
            i15 = i13;
        }
        if (dimensionBehaviourArr[1] == dimensionBehaviour2 && i16 < (i12 = this.f43426X)) {
            i16 = i12;
        }
        this.f43425W = i15;
        this.f43426X = i16;
        int i17 = this.f43438e0;
        if (i16 < i17) {
            this.f43426X = i17;
        }
        int i18 = this.f43436d0;
        if (i15 < i18) {
            this.f43425W = i18;
        }
        int i19 = this.f43470v;
        DimensionBehaviour dimensionBehaviour3 = DimensionBehaviour.f43477d;
        if (i19 > 0 && dimensionBehaviour == dimensionBehaviour3) {
            this.f43425W = Math.min(this.f43425W, i19);
        }
        int i22 = this.f43473y;
        if (i22 > 0 && this.f43423U[1] == dimensionBehaviour3) {
            this.f43426X = Math.min(this.f43426X, i22);
        }
        int i23 = this.f43425W;
        if (i15 != i23) {
            this.f43443h = i23;
        }
        int i24 = this.f43426X;
        if (i16 != i24) {
            this.f43445i = i24;
        }
    }

    public final void d(d dVar, androidx.constraintlayout.core.e eVar, HashSet<ConstraintWidget> hashSet, int i12, boolean z12) {
        if (z12) {
            if (!hashSet.contains(this)) {
                return;
            }
            i.a(dVar, eVar, this);
            hashSet.remove(this);
            e(eVar, dVar.Z(64));
        }
        if (i12 == 0) {
            HashSet<ConstraintAnchor> hashSet2 = this.f43412J.f43384a;
            if (hashSet2 != null) {
                Iterator<ConstraintAnchor> it = hashSet2.iterator();
                while (it.hasNext()) {
                    it.next().f43387d.d(dVar, eVar, hashSet, i12, true);
                }
            }
            HashSet<ConstraintAnchor> hashSet3 = this.f43414L.f43384a;
            if (hashSet3 != null) {
                Iterator<ConstraintAnchor> it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    it2.next().f43387d.d(dVar, eVar, hashSet, i12, true);
                }
                return;
            }
            return;
        }
        HashSet<ConstraintAnchor> hashSet4 = this.f43413K.f43384a;
        if (hashSet4 != null) {
            Iterator<ConstraintAnchor> it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                it3.next().f43387d.d(dVar, eVar, hashSet, i12, true);
            }
        }
        HashSet<ConstraintAnchor> hashSet5 = this.f43415M.f43384a;
        if (hashSet5 != null) {
            Iterator<ConstraintAnchor> it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                it4.next().f43387d.d(dVar, eVar, hashSet, i12, true);
            }
        }
        HashSet<ConstraintAnchor> hashSet6 = this.f43416N.f43384a;
        if (hashSet6 != null) {
            Iterator<ConstraintAnchor> it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                it5.next().f43387d.d(dVar, eVar, hashSet, i12, true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x05e3  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x066c  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x066f  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x06b4  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0719  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0721  */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(androidx.constraintlayout.core.e r60, boolean r61) {
        /*
            Method dump skipped, instructions count: 2013
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.e(androidx.constraintlayout.core.e, boolean):void");
    }

    public boolean f() {
        return this.f43446i0 != 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0505 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0529 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:326:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:356:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(androidx.constraintlayout.core.e r37, boolean r38, boolean r39, boolean r40, boolean r41, androidx.constraintlayout.core.SolverVariable r42, androidx.constraintlayout.core.SolverVariable r43, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour r44, boolean r45, androidx.constraintlayout.core.widgets.ConstraintAnchor r46, androidx.constraintlayout.core.widgets.ConstraintAnchor r47, int r48, int r49, int r50, int r51, float r52, boolean r53, boolean r54, boolean r55, boolean r56, boolean r57, int r58, int r59, int r60, int r61, float r62, boolean r63) {
        /*
            Method dump skipped, instructions count: 1416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.g(androidx.constraintlayout.core.e, boolean, boolean, boolean, boolean, androidx.constraintlayout.core.SolverVariable, androidx.constraintlayout.core.SolverVariable, androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour, boolean, androidx.constraintlayout.core.widgets.ConstraintAnchor, androidx.constraintlayout.core.widgets.ConstraintAnchor, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public final void h(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i12) {
        boolean z12;
        ConstraintAnchor.Type type3 = ConstraintAnchor.Type.f43398g;
        ConstraintAnchor.Type type4 = ConstraintAnchor.Type.f43400i;
        ConstraintAnchor.Type type5 = ConstraintAnchor.Type.f43399h;
        ConstraintAnchor.Type type6 = ConstraintAnchor.Type.f43393b;
        ConstraintAnchor.Type type7 = ConstraintAnchor.Type.f43394c;
        ConstraintAnchor.Type type8 = ConstraintAnchor.Type.f43395d;
        ConstraintAnchor.Type type9 = ConstraintAnchor.Type.f43396e;
        if (type == type3) {
            if (type2 != type3) {
                if (type2 == type6 || type2 == type8) {
                    h(type6, constraintWidget, type2, 0);
                    h(type8, constraintWidget, type2, 0);
                    m(type3).a(constraintWidget.m(type2), 0);
                    return;
                } else {
                    if (type2 == type7 || type2 == type9) {
                        h(type7, constraintWidget, type2, 0);
                        h(type9, constraintWidget, type2, 0);
                        m(type3).a(constraintWidget.m(type2), 0);
                        return;
                    }
                    return;
                }
            }
            ConstraintAnchor constraintAnchorM = m(type6);
            ConstraintAnchor constraintAnchorM2 = m(type8);
            ConstraintAnchor constraintAnchorM3 = m(type7);
            ConstraintAnchor constraintAnchorM4 = m(type9);
            boolean z13 = true;
            if ((constraintAnchorM == null || !constraintAnchorM.h()) && (constraintAnchorM2 == null || !constraintAnchorM2.h())) {
                h(type6, constraintWidget, type6, 0);
                h(type8, constraintWidget, type8, 0);
                z12 = true;
            } else {
                z12 = false;
            }
            if ((constraintAnchorM3 == null || !constraintAnchorM3.h()) && (constraintAnchorM4 == null || !constraintAnchorM4.h())) {
                h(type7, constraintWidget, type7, 0);
                h(type9, constraintWidget, type9, 0);
            } else {
                z13 = false;
            }
            if (z12 && z13) {
                m(type3).a(constraintWidget.m(type3), 0);
                return;
            } else if (z12) {
                m(type5).a(constraintWidget.m(type5), 0);
                return;
            } else {
                if (z13) {
                    m(type4).a(constraintWidget.m(type4), 0);
                    return;
                }
                return;
            }
        }
        if (type == type5 && (type2 == type6 || type2 == type8)) {
            ConstraintAnchor constraintAnchorM5 = m(type6);
            ConstraintAnchor constraintAnchorM6 = constraintWidget.m(type2);
            ConstraintAnchor constraintAnchorM7 = m(type8);
            constraintAnchorM5.a(constraintAnchorM6, 0);
            constraintAnchorM7.a(constraintAnchorM6, 0);
            m(type5).a(constraintAnchorM6, 0);
            return;
        }
        if (type == type4 && (type2 == type7 || type2 == type9)) {
            ConstraintAnchor constraintAnchorM8 = constraintWidget.m(type2);
            m(type7).a(constraintAnchorM8, 0);
            m(type9).a(constraintAnchorM8, 0);
            m(type4).a(constraintAnchorM8, 0);
            return;
        }
        if (type == type5 && type2 == type5) {
            m(type6).a(constraintWidget.m(type6), 0);
            m(type8).a(constraintWidget.m(type8), 0);
            m(type5).a(constraintWidget.m(type2), 0);
            return;
        }
        if (type == type4 && type2 == type4) {
            m(type7).a(constraintWidget.m(type7), 0);
            m(type9).a(constraintWidget.m(type9), 0);
            m(type4).a(constraintWidget.m(type2), 0);
            return;
        }
        ConstraintAnchor constraintAnchorM9 = m(type);
        ConstraintAnchor constraintAnchorM10 = constraintWidget.m(type2);
        if (constraintAnchorM9.i(constraintAnchorM10)) {
            ConstraintAnchor.Type type10 = ConstraintAnchor.Type.f43397f;
            if (type == type10) {
                ConstraintAnchor constraintAnchorM11 = m(type7);
                ConstraintAnchor constraintAnchorM12 = m(type9);
                if (constraintAnchorM11 != null) {
                    constraintAnchorM11.j();
                }
                if (constraintAnchorM12 != null) {
                    constraintAnchorM12.j();
                }
            } else if (type == type7 || type == type9) {
                ConstraintAnchor constraintAnchorM13 = m(type10);
                if (constraintAnchorM13 != null) {
                    constraintAnchorM13.j();
                }
                ConstraintAnchor constraintAnchorM14 = m(type3);
                if (constraintAnchorM14.f43389f != constraintAnchorM10) {
                    constraintAnchorM14.j();
                }
                ConstraintAnchor constraintAnchorF = m(type).f();
                ConstraintAnchor constraintAnchorM15 = m(type4);
                if (constraintAnchorM15.h()) {
                    constraintAnchorF.j();
                    constraintAnchorM15.j();
                }
            } else if (type == type6 || type == type8) {
                ConstraintAnchor constraintAnchorM16 = m(type3);
                if (constraintAnchorM16.f43389f != constraintAnchorM10) {
                    constraintAnchorM16.j();
                }
                ConstraintAnchor constraintAnchorF2 = m(type).f();
                ConstraintAnchor constraintAnchorM17 = m(type5);
                if (constraintAnchorM17.h()) {
                    constraintAnchorF2.j();
                    constraintAnchorM17.j();
                }
            }
            constraintAnchorM9.a(constraintAnchorM10, i12);
        }
    }

    public final void i(ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i12) {
        if (constraintAnchor.f43387d == this) {
            h(constraintAnchor.f43388e, constraintAnchor2.f43387d, constraintAnchor2.f43388e, i12);
        }
    }

    public void j(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> map) {
        this.f43457o = constraintWidget.f43457o;
        this.f43459p = constraintWidget.f43459p;
        this.f43463r = constraintWidget.f43463r;
        this.f43465s = constraintWidget.f43465s;
        int[] iArr = constraintWidget.f43467t;
        int i12 = iArr[0];
        int[] iArr2 = this.f43467t;
        iArr2[0] = i12;
        iArr2[1] = iArr[1];
        this.f43469u = constraintWidget.f43469u;
        this.f43470v = constraintWidget.f43470v;
        this.f43472x = constraintWidget.f43472x;
        this.f43473y = constraintWidget.f43473y;
        this.f43474z = constraintWidget.f43474z;
        this.f43403A = constraintWidget.f43403A;
        this.f43404B = constraintWidget.f43404B;
        int[] iArr3 = constraintWidget.f43405C;
        this.f43405C = Arrays.copyOf(iArr3, iArr3.length);
        this.f43406D = constraintWidget.f43406D;
        this.f43407E = constraintWidget.f43407E;
        this.f43408F = constraintWidget.f43408F;
        this.f43412J.j();
        this.f43413K.j();
        this.f43414L.j();
        this.f43415M.j();
        this.f43416N.j();
        this.f43417O.j();
        this.f43418P.j();
        this.f43419Q.j();
        this.f43423U = (DimensionBehaviour[]) Arrays.copyOf(this.f43423U, 2);
        this.f43424V = this.f43424V == null ? null : map.get(constraintWidget.f43424V);
        this.f43425W = constraintWidget.f43425W;
        this.f43426X = constraintWidget.f43426X;
        this.f43427Y = constraintWidget.f43427Y;
        this.f43428Z = constraintWidget.f43428Z;
        this.f43430a0 = constraintWidget.f43430a0;
        this.f43432b0 = constraintWidget.f43432b0;
        this.f43434c0 = constraintWidget.f43434c0;
        this.f43436d0 = constraintWidget.f43436d0;
        this.f43438e0 = constraintWidget.f43438e0;
        this.f43440f0 = constraintWidget.f43440f0;
        this.f43442g0 = constraintWidget.f43442g0;
        this.f43444h0 = constraintWidget.f43444h0;
        this.f43446i0 = constraintWidget.f43446i0;
        this.f43448j0 = constraintWidget.f43448j0;
        this.f43450k0 = constraintWidget.f43450k0;
        this.f43452l0 = constraintWidget.f43452l0;
        this.f43454m0 = constraintWidget.f43454m0;
        float[] fArr = constraintWidget.f43456n0;
        float f12 = fArr[0];
        float[] fArr2 = this.f43456n0;
        fArr2[0] = f12;
        fArr2[1] = fArr[1];
        ConstraintWidget[] constraintWidgetArr = constraintWidget.f43458o0;
        ConstraintWidget constraintWidget2 = constraintWidgetArr[0];
        ConstraintWidget[] constraintWidgetArr2 = this.f43458o0;
        constraintWidgetArr2[0] = constraintWidget2;
        constraintWidgetArr2[1] = constraintWidgetArr[1];
        ConstraintWidget[] constraintWidgetArr3 = constraintWidget.f43460p0;
        ConstraintWidget constraintWidget3 = constraintWidgetArr3[0];
        ConstraintWidget[] constraintWidgetArr4 = this.f43460p0;
        constraintWidgetArr4[0] = constraintWidget3;
        constraintWidgetArr4[1] = constraintWidgetArr3[1];
        ConstraintWidget constraintWidget4 = constraintWidget.f43462q0;
        this.f43462q0 = constraintWidget4 == null ? null : map.get(constraintWidget4);
        ConstraintWidget constraintWidget5 = constraintWidget.f43464r0;
        this.f43464r0 = constraintWidget5 != null ? map.get(constraintWidget5) : null;
    }

    public final void k(androidx.constraintlayout.core.e eVar) {
        eVar.k(this.f43412J);
        eVar.k(this.f43413K);
        eVar.k(this.f43414L);
        eVar.k(this.f43415M);
        if (this.f43434c0 > 0) {
            eVar.k(this.f43416N);
        }
    }

    public final void l() {
        if (this.f43435d == null) {
            this.f43435d = new androidx.constraintlayout.core.widgets.analyzer.l(this);
        }
        if (this.f43437e == null) {
            this.f43437e = new n(this);
        }
    }

    public ConstraintAnchor m(ConstraintAnchor.Type type) {
        switch (type.ordinal()) {
            case 0:
                return null;
            case 1:
                return this.f43412J;
            case 2:
                return this.f43413K;
            case 3:
                return this.f43414L;
            case 4:
                return this.f43415M;
            case 5:
                return this.f43416N;
            case 6:
                return this.f43419Q;
            case 7:
                return this.f43417O;
            case 8:
                return this.f43418P;
            default:
                throw new AssertionError(type.name());
        }
    }

    public final DimensionBehaviour n(int i12) {
        if (i12 == 0) {
            return this.f43423U[0];
        }
        if (i12 == 1) {
            return this.f43423U[1];
        }
        return null;
    }

    public final int o() {
        if (this.f43446i0 == 8) {
            return 0;
        }
        return this.f43426X;
    }

    public final ConstraintWidget p(int i12) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i12 != 0) {
            if (i12 == 1 && (constraintAnchor2 = (constraintAnchor = this.f43415M).f43389f) != null && constraintAnchor2.f43389f == constraintAnchor) {
                return constraintAnchor2.f43387d;
            }
            return null;
        }
        ConstraintAnchor constraintAnchor3 = this.f43414L;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f43389f;
        if (constraintAnchor4 == null || constraintAnchor4.f43389f != constraintAnchor3) {
            return null;
        }
        return constraintAnchor4.f43387d;
    }

    public final ConstraintWidget q(int i12) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i12 != 0) {
            if (i12 == 1 && (constraintAnchor2 = (constraintAnchor = this.f43413K).f43389f) != null && constraintAnchor2.f43389f == constraintAnchor) {
                return constraintAnchor2.f43387d;
            }
            return null;
        }
        ConstraintAnchor constraintAnchor3 = this.f43412J;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f43389f;
        if (constraintAnchor4 == null || constraintAnchor4.f43389f != constraintAnchor3) {
            return null;
        }
        return constraintAnchor4.f43387d;
    }

    public void r(StringBuilder sb2) {
        sb2.append("  " + this.f43447j + ":{\n");
        StringBuilder sb3 = new StringBuilder("    actualWidth:");
        sb3.append(this.f43425W);
        sb2.append(sb3.toString());
        sb2.append("\n");
        sb2.append("    actualHeight:" + this.f43426X);
        sb2.append("\n");
        sb2.append("    actualLeft:" + this.f43430a0);
        sb2.append("\n");
        sb2.append("    actualTop:" + this.f43432b0);
        sb2.append("\n");
        t(sb2, "left", this.f43412J);
        t(sb2, "top", this.f43413K);
        t(sb2, "right", this.f43414L);
        t(sb2, "bottom", this.f43415M);
        t(sb2, "baseline", this.f43416N);
        t(sb2, "centerX", this.f43417O);
        t(sb2, "centerY", this.f43418P);
        int i12 = this.f43425W;
        int i13 = this.f43436d0;
        int i14 = this.f43405C[0];
        int i15 = this.f43469u;
        int i16 = this.f43463r;
        float f12 = this.f43471w;
        float[] fArr = this.f43456n0;
        float f13 = fArr[0];
        s(sb2, "    width", i12, i13, i14, i15, i16, f12);
        int i17 = this.f43426X;
        int i18 = this.f43438e0;
        int i19 = this.f43405C[1];
        int i22 = this.f43472x;
        int i23 = this.f43465s;
        float f14 = this.f43474z;
        float f15 = fArr[1];
        s(sb2, "    height", i17, i18, i19, i22, i23, f14);
        float f16 = this.f43427Y;
        int i24 = this.f43428Z;
        if (f16 != 0.0f) {
            sb2.append("    dimensionRatio");
            sb2.append(" :  [");
            sb2.append(f16);
            sb2.append(",");
            sb2.append(i24);
            sb2.append("");
            sb2.append("],\n");
        }
        L(sb2, "    horizontalBias", this.f43440f0, 0.5f);
        L(sb2, "    verticalBias", this.f43442g0, 0.5f);
        K(this.f43452l0, 0, "    horizontalChainStyle", sb2);
        K(this.f43454m0, 0, "    verticalChainStyle", sb2);
        sb2.append("  }");
    }

    public String toString() {
        StringBuilder sbR = H.r("");
        sbR.append(this.f43450k0 != null ? AK.c.s(new StringBuilder("id: "), this.f43450k0, " ") : "");
        sbR.append("(");
        sbR.append(this.f43430a0);
        sbR.append(", ");
        sbR.append(this.f43432b0);
        sbR.append(") - (");
        sbR.append(this.f43425W);
        sbR.append(" x ");
        return AK.c.i(this.f43426X, ")", sbR);
    }

    public final int u() {
        if (this.f43446i0 == 8) {
            return 0;
        }
        return this.f43425W;
    }

    public final int v() {
        ConstraintWidget constraintWidget = this.f43424V;
        return (constraintWidget == null || !(constraintWidget instanceof d)) ? this.f43430a0 : ((d) constraintWidget).f43577B0 + this.f43430a0;
    }

    public final int w() {
        ConstraintWidget constraintWidget = this.f43424V;
        return (constraintWidget == null || !(constraintWidget instanceof d)) ? this.f43432b0 : ((d) constraintWidget).f43578C0 + this.f43432b0;
    }

    public final boolean x(int i12) {
        if (i12 == 0) {
            return (this.f43412J.f43389f != null ? 1 : 0) + (this.f43414L.f43389f != null ? 1 : 0) < 2;
        }
        return ((this.f43413K.f43389f != null ? 1 : 0) + (this.f43415M.f43389f != null ? 1 : 0)) + (this.f43416N.f43389f != null ? 1 : 0) < 2;
    }

    public final boolean y(int i12, int i13) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        ConstraintAnchor constraintAnchor3;
        ConstraintAnchor constraintAnchor4;
        if (i12 == 0) {
            ConstraintAnchor constraintAnchor5 = this.f43412J;
            ConstraintAnchor constraintAnchor6 = constraintAnchor5.f43389f;
            if (constraintAnchor6 != null && constraintAnchor6.f43386c && (constraintAnchor4 = (constraintAnchor3 = this.f43414L).f43389f) != null && constraintAnchor4.f43386c) {
                return (constraintAnchor4.d() - constraintAnchor3.e()) - (constraintAnchor5.e() + constraintAnchor5.f43389f.d()) >= i13;
            }
        } else {
            ConstraintAnchor constraintAnchor7 = this.f43413K;
            ConstraintAnchor constraintAnchor8 = constraintAnchor7.f43389f;
            if (constraintAnchor8 != null && constraintAnchor8.f43386c && (constraintAnchor2 = (constraintAnchor = this.f43415M).f43389f) != null && constraintAnchor2.f43386c) {
                return (constraintAnchor2.d() - constraintAnchor.e()) - (constraintAnchor7.e() + constraintAnchor7.f43389f.d()) >= i13;
            }
        }
        return false;
    }

    public final void z(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i12, int i13) {
        m(type).b(constraintWidget.m(type2), i12, i13, true);
    }
}
