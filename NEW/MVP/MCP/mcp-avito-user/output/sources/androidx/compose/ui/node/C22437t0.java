package androidx.compose.ui.node;

import androidx.compose.ui.C22214e;
import androidx.compose.ui.node.C22439u0;
import androidx.compose.ui.v;
import java.util.HashSet;
import kotlin.Metadata;
import s0.C47949a;

/* compiled from: NodeChain.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/node/t0;", "", "a", "b", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.node.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22437t0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final LayoutNode f40874a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C22448z f40875b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public AbstractC22443w0 f40876c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final W0 f40877d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public v.d f40878e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public androidx.compose.runtime.collection.e<v.c> f40879f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public androidx.compose.runtime.collection.e<v.c> f40880g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public a f40881h;

    /* compiled from: NodeChain.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/node/t0$a;", "Landroidx/compose/ui/node/r;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.node.t0$a */
    public final class a implements r {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public v.d f40882a;

        /* renamed from: b, reason: collision with root package name */
        public int f40883b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public androidx.compose.runtime.collection.e<v.c> f40884c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public androidx.compose.runtime.collection.e<v.c> f40885d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f40886e;

        public a(@Y61.k v.d dVar, int i12, @Y61.k androidx.compose.runtime.collection.e<v.c> eVar, @Y61.k androidx.compose.runtime.collection.e<v.c> eVar2, boolean z12) {
            this.f40882a = dVar;
            this.f40883b = i12;
            this.f40884c = eVar;
            this.f40885d = eVar2;
            this.f40886e = z12;
        }

        public final boolean a(int i12, int i13) {
            androidx.compose.runtime.collection.e<v.c> eVar = this.f40884c;
            int i14 = this.f40883b;
            v.c cVar = eVar.f38260b[i12 + i14];
            v.c cVar2 = this.f40885d.f38260b[i14 + i13];
            C22439u0.a aVar = C22439u0.f40888a;
            return kotlin.jvm.internal.L.f(cVar, cVar2) || C22214e.a(cVar, cVar2);
        }
    }

    /* compiled from: NodeChain.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/t0$b;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.node.t0$b */
    public interface b {
    }

    public C22437t0(@Y61.k LayoutNode layoutNode) {
        this.f40874a = layoutNode;
        C22448z c22448z = new C22448z(layoutNode);
        this.f40875b = c22448z;
        this.f40876c = c22448z;
        W0 w02 = c22448z.f40957T;
        this.f40877d = w02;
        this.f40878e = w02;
    }

    public static final void a(C22437t0 c22437t0, v.d dVar, AbstractC22443w0 abstractC22443w0) {
        c22437t0.getClass();
        for (v.d dVar2 = dVar.f42884f; dVar2 != null; dVar2 = dVar2.f42884f) {
            if (dVar2 == C22439u0.f40888a) {
                LayoutNode layoutNodeK = c22437t0.f40874a.K();
                abstractC22443w0.f40913r = layoutNodeK != null ? layoutNodeK.f40615I.f40875b : null;
                c22437t0.f40876c = abstractC22443w0;
                return;
            } else {
                if ((dVar2.f42882d & 2) != 0) {
                    return;
                }
                dVar2.j2(abstractC22443w0);
            }
        }
    }

    public static v.d b(v.c cVar, v.d dVar) {
        v.d dVarA;
        if (cVar instanceof AbstractC22430p0) {
            dVarA = ((AbstractC22430p0) cVar).a();
            dVarA.f42882d = A0.f(dVarA);
        } else {
            C22403c c22403c = new C22403c();
            c22403c.f42882d = A0.d(cVar);
            c22403c.f40737p = cVar;
            c22403c.f40738q = true;
            c22403c.f40740s = new HashSet<>();
            dVarA = c22403c;
        }
        if (dVarA.f42893o) {
            C47949a.b("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        dVarA.f42888j = true;
        v.d dVar2 = dVar.f42885g;
        if (dVar2 != null) {
            dVar2.f42884f = dVarA;
            dVarA.f42885g = dVar2;
        }
        dVar.f42885g = dVarA;
        dVarA.f42884f = dVar;
        return dVarA;
    }

    public static v.d c(v.d dVar) {
        boolean z12 = dVar.f42893o;
        if (z12) {
            androidx.collection.M0<Object> m02 = A0.f40544a;
            if (!z12) {
                C47949a.b("autoInvalidateRemovedNode called on unattached node");
            }
            A0.a(dVar, -1, 2);
            dVar.h2();
            dVar.b2();
        }
        v.d dVar2 = dVar.f42885g;
        v.d dVar3 = dVar.f42884f;
        if (dVar2 != null) {
            dVar2.f42884f = dVar3;
            dVar.f42885g = null;
        }
        if (dVar3 != null) {
            dVar3.f42885g = dVar2;
            dVar.f42884f = null;
        }
        return dVar3;
    }

    public static void i(v.c cVar, v.c cVar2, v.d dVar) {
        if ((cVar instanceof AbstractC22430p0) && (cVar2 instanceof AbstractC22430p0)) {
            C22439u0.a aVar = C22439u0.f40888a;
            ((AbstractC22430p0) cVar2).b(dVar);
            if (dVar.f42893o) {
                A0.c(dVar);
                return;
            } else {
                dVar.f42889k = true;
                return;
            }
        }
        if (!(dVar instanceof C22403c)) {
            C47949a.b("Unknown Modifier.Node type");
            return;
        }
        C22403c c22403c = (C22403c) dVar;
        if (c22403c.f42893o) {
            c22403c.l2();
        }
        c22403c.f40737p = cVar2;
        c22403c.f42882d = A0.d(cVar2);
        if (c22403c.f42893o) {
            c22403c.k2(false);
        }
        if (dVar.f42893o) {
            A0.c(dVar);
        } else {
            dVar.f42889k = true;
        }
    }

    public final boolean d(int i12) {
        return (i12 & this.f40878e.f42883e) != 0;
    }

    public final void e() {
        C22448z c22448z;
        AbstractC22443w0 abstractC22443w0 = this.f40876c;
        while (true) {
            c22448z = this.f40875b;
            if (abstractC22443w0 == c22448z) {
                break;
            }
            abstractC22443w0.H1();
            abstractC22443w0 = abstractC22443w0.f40912q;
        }
        c22448z.H1();
        for (v.d dVar = this.f40878e; dVar != null; dVar = dVar.f42885g) {
            dVar.g2();
            if (dVar.f42888j) {
                androidx.collection.M0<Object> m02 = A0.f40544a;
                if (!dVar.f42893o) {
                    C47949a.b("autoInvalidateInsertedNode called on unattached node");
                }
                A0.a(dVar, -1, 1);
            }
            if (dVar.f42889k) {
                A0.c(dVar);
            }
            dVar.f42888j = false;
            dVar.f42889k = false;
        }
    }

    public final void f() {
        for (v.d dVar = this.f40877d; dVar != null; dVar = dVar.f42884f) {
            if (dVar.f42893o) {
                dVar.h2();
            }
        }
        AbstractC22443w0 abstractC22443w0 = this.f40876c;
        for (AbstractC22443w0 abstractC22443w02 = this.f40875b; abstractC22443w02 != abstractC22443w0; abstractC22443w02 = abstractC22443w02.f40913r) {
            I0 i02 = abstractC22443w02.f40907J;
            if (i02 != null) {
                i02.destroy();
            }
            abstractC22443w02.f40907J = null;
        }
        I0 i03 = abstractC22443w0.f40907J;
        if (i03 != null) {
            i03.destroy();
        }
        abstractC22443w0.f40907J = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x0279, code lost:
    
        r2 = r2 + 2;
        r21 = r21;
        r26 = r26;
        r12 = r24;
        r13 = r25;
        r19 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x028d, code lost:
    
        r3 = r3 + r19;
        r7 = r31;
        r15 = r33;
        r13 = r13;
        r1 = r22;
        r2 = r23;
        r14 = r32;
        r5 = r21;
        r4 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0164, code lost:
    
        r22 = r1;
        r23 = r2;
        r26 = r4;
        r21 = r5;
        r19 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0170, code lost:
    
        if ((r20 & 1) != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0172, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0175, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0176, code lost:
    
        r2 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0177, code lost:
    
        if (r2 > r3) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0179, code lost:
    
        if (r2 == r7) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x017b, code lost:
    
        if (r2 == r3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0189, code lost:
    
        if (r9[(r2 + 1) + r18] >= r9[(r2 - 1) + r18]) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x018c, code lost:
    
        r4 = r9[(r2 - 1) + r18];
        r5 = r4 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0195, code lost:
    
        r4 = r9[(r2 + 1) + r18];
        r5 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x019c, code lost:
    
        r14 = r12 - ((r13 - r5) - r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01a1, code lost:
    
        if (r3 == 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01a3, code lost:
    
        r15 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01a5, code lost:
    
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01a6, code lost:
    
        if (r5 != r4) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01a8, code lost:
    
        r24 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01ab, code lost:
    
        r24 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01ad, code lost:
    
        r15 = (r15 & r24) + r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b0, code lost:
    
        if (r5 <= r11) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01b2, code lost:
    
        if (r14 <= r6) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01b4, code lost:
    
        r24 = r12;
        r25 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01c2, code lost:
    
        if (r0.a(r5 - 1, r14 - 1) == false) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01c4, code lost:
    
        r5 = r5 - 1;
        r14 = r14 - 1;
        r12 = r24;
        r13 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01cc, code lost:
    
        r24 = r12;
        r25 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01d0, code lost:
    
        r9[r18 + r2] = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01d4, code lost:
    
        if (r1 == false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01d6, code lost:
    
        r12 = r20 - r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01d8, code lost:
    
        if (r12 < r7) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01da, code lost:
    
        if (r12 > r3) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01e0, code lost:
    
        if (r8[r18 + r12] < r5) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01e2, code lost:
    
        r12 = 0;
        r10[0] = r5;
        r1 = 1;
        r10[1] = r14;
        r2 = 2;
        r10[2] = r4;
        r3 = 3;
        r10[3] = r15;
        r10[4] = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(int r29, androidx.compose.runtime.collection.e<androidx.compose.ui.v.c> r30, androidx.compose.runtime.collection.e<androidx.compose.ui.v.c> r31, androidx.compose.ui.v.d r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 989
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.C22437t0.g(int, androidx.compose.runtime.collection.e, androidx.compose.runtime.collection.e, androidx.compose.ui.v$d, boolean):void");
    }

    public final void h() {
        LayoutNode layoutNode;
        L l12;
        v.d dVar = this.f40877d.f42884f;
        AbstractC22443w0 abstractC22443w0 = this.f40875b;
        v.d dVar2 = dVar;
        while (true) {
            layoutNode = this.f40874a;
            if (dVar2 == null) {
                break;
            }
            K kC2 = C22421l.c(dVar2);
            if (kC2 != null) {
                AbstractC22443w0 abstractC22443w02 = dVar2.f42887i;
                if (abstractC22443w02 != null) {
                    L l13 = (L) abstractC22443w02;
                    K k12 = l13.f40578T;
                    l13.f2(kC2);
                    l12 = l13;
                    if (k12 != dVar2) {
                        I0 i02 = l13.f40907J;
                        l12 = l13;
                        if (i02 != null) {
                            i02.invalidate();
                            l12 = l13;
                        }
                    }
                } else {
                    L l14 = new L(layoutNode, kC2);
                    dVar2.j2(l14);
                    l12 = l14;
                }
                abstractC22443w0.f40913r = l12;
                l12.f40912q = abstractC22443w0;
                abstractC22443w0 = l12;
            } else {
                dVar2.j2(abstractC22443w0);
            }
            dVar2 = dVar2.f42884f;
        }
        LayoutNode layoutNodeK = layoutNode.K();
        abstractC22443w0.f40913r = layoutNodeK != null ? layoutNodeK.f40615I.f40875b : null;
        this.f40876c = abstractC22443w0;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        v.d dVar = this.f40878e;
        W0 w02 = this.f40877d;
        if (dVar == w02) {
            sb2.append("]");
        } else {
            while (true) {
                if (dVar == null || dVar == w02) {
                    break;
                }
                sb2.append(String.valueOf(dVar));
                if (dVar.f42885g == w02) {
                    sb2.append("]");
                    break;
                }
                sb2.append(",");
                dVar = dVar.f42885g;
            }
        }
        return sb2.toString();
    }
}
