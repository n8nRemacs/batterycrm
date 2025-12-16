package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: ConstraintWidgetContainer.java */
/* loaded from: classes.dex */
public class d extends m {

    /* renamed from: A0, reason: collision with root package name */
    public final androidx.constraintlayout.core.e f43576A0;

    /* renamed from: B0, reason: collision with root package name */
    public int f43577B0;

    /* renamed from: C0, reason: collision with root package name */
    public int f43578C0;

    /* renamed from: D0, reason: collision with root package name */
    public int f43579D0;

    /* renamed from: E0, reason: collision with root package name */
    public int f43580E0;

    /* renamed from: F0, reason: collision with root package name */
    public c[] f43581F0;

    /* renamed from: G0, reason: collision with root package name */
    public c[] f43582G0;

    /* renamed from: H0, reason: collision with root package name */
    public int f43583H0;

    /* renamed from: I0, reason: collision with root package name */
    public boolean f43584I0;

    /* renamed from: J0, reason: collision with root package name */
    public boolean f43585J0;

    /* renamed from: K0, reason: collision with root package name */
    public WeakReference<ConstraintAnchor> f43586K0;

    /* renamed from: L0, reason: collision with root package name */
    public WeakReference<ConstraintAnchor> f43587L0;

    /* renamed from: M0, reason: collision with root package name */
    public WeakReference<ConstraintAnchor> f43588M0;

    /* renamed from: N0, reason: collision with root package name */
    public WeakReference<ConstraintAnchor> f43589N0;

    /* renamed from: O0, reason: collision with root package name */
    public final HashSet<ConstraintWidget> f43590O0;

    /* renamed from: P0, reason: collision with root package name */
    public final b.a f43591P0;

    /* renamed from: v0, reason: collision with root package name */
    public final androidx.constraintlayout.core.widgets.analyzer.b f43592v0 = new androidx.constraintlayout.core.widgets.analyzer.b(this);

    /* renamed from: w0, reason: collision with root package name */
    public final androidx.constraintlayout.core.widgets.analyzer.e f43593w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f43594x0;

    /* renamed from: y0, reason: collision with root package name */
    public b.InterfaceC1703b f43595y0;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f43596z0;

    public d() {
        androidx.constraintlayout.core.widgets.analyzer.e eVar = new androidx.constraintlayout.core.widgets.analyzer.e();
        eVar.f43502b = true;
        eVar.f43503c = true;
        eVar.f43505e = new ArrayList<>();
        new ArrayList();
        eVar.f43506f = null;
        eVar.f43507g = new b.a();
        eVar.f43508h = new ArrayList<>();
        eVar.f43501a = this;
        eVar.f43504d = this;
        this.f43593w0 = eVar;
        this.f43595y0 = null;
        this.f43596z0 = false;
        this.f43576A0 = new androidx.constraintlayout.core.e();
        this.f43579D0 = 0;
        this.f43580E0 = 0;
        this.f43581F0 = new c[4];
        this.f43582G0 = new c[4];
        this.f43583H0 = 257;
        this.f43584I0 = false;
        this.f43585J0 = false;
        this.f43586K0 = null;
        this.f43587L0 = null;
        this.f43588M0 = null;
        this.f43589N0 = null;
        this.f43590O0 = new HashSet<>();
        this.f43591P0 = new b.a();
    }

    public static void Y(ConstraintWidget constraintWidget, b.InterfaceC1703b interfaceC1703b, b.a aVar) {
        int i12;
        int i13;
        if (interfaceC1703b == null) {
            return;
        }
        if (constraintWidget.f43446i0 == 8 || (constraintWidget instanceof f) || (constraintWidget instanceof a)) {
            aVar.f43493e = 0;
            aVar.f43494f = 0;
            return;
        }
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.f43423U;
        aVar.f43489a = dimensionBehaviourArr[0];
        aVar.f43490b = dimensionBehaviourArr[1];
        aVar.f43491c = constraintWidget.u();
        aVar.f43492d = constraintWidget.o();
        aVar.f43497i = false;
        aVar.f43498j = 0;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = aVar.f43489a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.f43477d;
        boolean z12 = dimensionBehaviour == dimensionBehaviour2;
        boolean z13 = aVar.f43490b == dimensionBehaviour2;
        boolean z14 = z12 && constraintWidget.f43427Y > 0.0f;
        boolean z15 = z13 && constraintWidget.f43427Y > 0.0f;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.f43476c;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.f43475b;
        if (z12 && constraintWidget.x(0) && constraintWidget.f43463r == 0 && !z14) {
            aVar.f43489a = dimensionBehaviour3;
            if (z13 && constraintWidget.f43465s == 0) {
                aVar.f43489a = dimensionBehaviour4;
            }
            z12 = false;
        }
        if (z13 && constraintWidget.x(1) && constraintWidget.f43465s == 0 && !z15) {
            aVar.f43490b = dimensionBehaviour3;
            if (z12 && constraintWidget.f43463r == 0) {
                aVar.f43490b = dimensionBehaviour4;
            }
            z13 = false;
        }
        if (constraintWidget.E()) {
            aVar.f43489a = dimensionBehaviour4;
            z12 = false;
        }
        if (constraintWidget.F()) {
            aVar.f43490b = dimensionBehaviour4;
            z13 = false;
        }
        int[] iArr = constraintWidget.f43467t;
        if (z14) {
            if (iArr[0] == 4) {
                aVar.f43489a = dimensionBehaviour4;
            } else if (!z13) {
                if (aVar.f43490b == dimensionBehaviour4) {
                    i13 = aVar.f43492d;
                } else {
                    aVar.f43489a = dimensionBehaviour3;
                    interfaceC1703b.a(constraintWidget, aVar);
                    i13 = aVar.f43494f;
                }
                aVar.f43489a = dimensionBehaviour4;
                aVar.f43491c = (int) (constraintWidget.f43427Y * i13);
            }
        }
        if (z15) {
            if (iArr[1] == 4) {
                aVar.f43490b = dimensionBehaviour4;
            } else if (!z12) {
                if (aVar.f43489a == dimensionBehaviour4) {
                    i12 = aVar.f43491c;
                } else {
                    aVar.f43490b = dimensionBehaviour3;
                    interfaceC1703b.a(constraintWidget, aVar);
                    i12 = aVar.f43493e;
                }
                aVar.f43490b = dimensionBehaviour4;
                if (constraintWidget.f43428Z == -1) {
                    aVar.f43492d = (int) (i12 / constraintWidget.f43427Y);
                } else {
                    aVar.f43492d = (int) (constraintWidget.f43427Y * i12);
                }
            }
        }
        interfaceC1703b.a(constraintWidget, aVar);
        constraintWidget.S(aVar.f43493e);
        constraintWidget.P(aVar.f43494f);
        constraintWidget.f43407E = aVar.f43496h;
        constraintWidget.M(aVar.f43495g);
        aVar.f43498j = 0;
    }

    @Override // androidx.constraintlayout.core.widgets.m, androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void G() {
        this.f43576A0.t();
        this.f43577B0 = 0;
        this.f43578C0 = 0;
        super.G();
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void T(boolean z12, boolean z13) {
        super.T(z12, z13);
        int size = this.f43661u0.size();
        for (int i12 = 0; i12 < size; i12++) {
            this.f43661u0.get(i12).T(z12, z13);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0616  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0671  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0687  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x06b1  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x06bc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:403:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x06dc  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x06fe  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x07e4  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x080e  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x0852  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x086f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:504:0x087b A[LOOP:13: B:503:0x0879->B:504:0x087b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:516:0x08e4  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x0900  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x090d  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x0910  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x0950 A[PHI: r19 r22
  0x0950: PHI (r19v10 boolean) = (r19v9 boolean), (r19v13 boolean), (r19v13 boolean) binds: [B:521:0x090e, B:529:0x0930, B:530:0x0932] A[DONT_GENERATE, DONT_INLINE]
  0x0950: PHI (r22v9 boolean) = (r22v8 boolean), (r22v11 boolean), (r22v11 boolean) binds: [B:521:0x090e, B:529:0x0930, B:530:0x0932] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:537:0x0955  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x0957  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x096a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0137  */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v13 */
    @Override // androidx.constraintlayout.core.widgets.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V() {
        /*
            Method dump skipped, instructions count: 2424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.d.V():void");
    }

    public final void W(ConstraintWidget constraintWidget, int i12) {
        if (i12 == 0) {
            int i13 = this.f43579D0 + 1;
            c[] cVarArr = this.f43582G0;
            if (i13 >= cVarArr.length) {
                this.f43582G0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
            }
            c[] cVarArr2 = this.f43582G0;
            int i14 = this.f43579D0;
            cVarArr2[i14] = new c(constraintWidget, 0, this.f43596z0);
            this.f43579D0 = i14 + 1;
            return;
        }
        if (i12 == 1) {
            int i15 = this.f43580E0 + 1;
            c[] cVarArr3 = this.f43581F0;
            if (i15 >= cVarArr3.length) {
                this.f43581F0 = (c[]) Arrays.copyOf(cVarArr3, cVarArr3.length * 2);
            }
            c[] cVarArr4 = this.f43581F0;
            int i16 = this.f43580E0;
            cVarArr4[i16] = new c(constraintWidget, 1, this.f43596z0);
            this.f43580E0 = i16 + 1;
        }
    }

    public final void X(androidx.constraintlayout.core.e eVar) {
        boolean Z12 = Z(64);
        e(eVar, Z12);
        int size = this.f43661u0.size();
        boolean z12 = false;
        for (int i12 = 0; i12 < size; i12++) {
            ConstraintWidget constraintWidget = this.f43661u0.get(i12);
            boolean[] zArr = constraintWidget.f43422T;
            zArr[0] = false;
            zArr[1] = false;
            if (constraintWidget instanceof a) {
                z12 = true;
            }
        }
        if (z12) {
            for (int i13 = 0; i13 < size; i13++) {
                ConstraintWidget constraintWidget2 = this.f43661u0.get(i13);
                if (constraintWidget2 instanceof a) {
                    a aVar = (a) constraintWidget2;
                    for (int i14 = 0; i14 < aVar.f43648v0; i14++) {
                        ConstraintWidget constraintWidget3 = aVar.f43647u0[i14];
                        if (aVar.f43483x0 || constraintWidget3.f()) {
                            int i15 = aVar.f43482w0;
                            if (i15 == 0 || i15 == 1) {
                                constraintWidget3.f43422T[0] = true;
                            } else if (i15 == 2 || i15 == 3) {
                                constraintWidget3.f43422T[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet<ConstraintWidget> hashSet = this.f43590O0;
        hashSet.clear();
        for (int i16 = 0; i16 < size; i16++) {
            ConstraintWidget constraintWidget4 = this.f43661u0.get(i16);
            constraintWidget4.getClass();
            boolean z13 = constraintWidget4 instanceof l;
            if (z13 || (constraintWidget4 instanceof f)) {
                if (z13) {
                    hashSet.add(constraintWidget4);
                } else {
                    constraintWidget4.e(eVar, Z12);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator<ConstraintWidget> it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                l lVar = (l) it.next();
                for (int i17 = 0; i17 < lVar.f43648v0; i17++) {
                    if (hashSet.contains(lVar.f43647u0[i17])) {
                        lVar.e(eVar, Z12);
                        hashSet.remove(lVar);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator<ConstraintWidget> it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    it2.next().e(eVar, Z12);
                }
                hashSet.clear();
            }
        }
        boolean z14 = androidx.constraintlayout.core.e.f43211p;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.f43476c;
        if (z14) {
            HashSet<ConstraintWidget> hashSet2 = new HashSet<>();
            for (int i18 = 0; i18 < size; i18++) {
                ConstraintWidget constraintWidget5 = this.f43661u0.get(i18);
                constraintWidget5.getClass();
                if (!(constraintWidget5 instanceof l) && !(constraintWidget5 instanceof f)) {
                    hashSet2.add(constraintWidget5);
                }
            }
            d(this, eVar, hashSet2, this.f43423U[0] == dimensionBehaviour ? 0 : 1, false);
            Iterator<ConstraintWidget> it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                ConstraintWidget next = it3.next();
                i.a(this, eVar, next);
                next.e(eVar, Z12);
            }
        } else {
            for (int i19 = 0; i19 < size; i19++) {
                ConstraintWidget constraintWidget6 = this.f43661u0.get(i19);
                if (constraintWidget6 instanceof d) {
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget6.f43423U;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[0];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = dimensionBehaviourArr[1];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.f43475b;
                    if (dimensionBehaviour2 == dimensionBehaviour) {
                        constraintWidget6.Q(dimensionBehaviour4);
                    }
                    if (dimensionBehaviour3 == dimensionBehaviour) {
                        constraintWidget6.R(dimensionBehaviour4);
                    }
                    constraintWidget6.e(eVar, Z12);
                    if (dimensionBehaviour2 == dimensionBehaviour) {
                        constraintWidget6.Q(dimensionBehaviour2);
                    }
                    if (dimensionBehaviour3 == dimensionBehaviour) {
                        constraintWidget6.R(dimensionBehaviour3);
                    }
                } else {
                    i.a(this, eVar, constraintWidget6);
                    if (!(constraintWidget6 instanceof l) && !(constraintWidget6 instanceof f)) {
                        constraintWidget6.e(eVar, Z12);
                    }
                }
            }
        }
        if (this.f43579D0 > 0) {
            b.a(this, eVar, null, 0);
        }
        if (this.f43580E0 > 0) {
            b.a(this, eVar, null, 1);
        }
    }

    public final boolean Z(int i12) {
        return (this.f43583H0 & i12) == i12;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void r(StringBuilder sb2) {
        sb2.append(this.f43447j + ":{\n");
        StringBuilder sb3 = new StringBuilder("  actualWidth:");
        sb3.append(this.f43425W);
        sb2.append(sb3.toString());
        sb2.append("\n");
        sb2.append("  actualHeight:" + this.f43426X);
        sb2.append("\n");
        Iterator<ConstraintWidget> it = this.f43661u0.iterator();
        while (it.hasNext()) {
            it.next().r(sb2);
            sb2.append(",\n");
        }
        sb2.append("}");
    }
}
