package androidx.compose.material3;

import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22137p;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: SnackbarHost.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*b\b\u0002\u0010\u0007\"-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u00032-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003¨\u0006\b"}, d2 = {"Lkotlin/Function1;", "Lkotlin/Function0;", "Lkotlin/G0;", "Landroidx/compose/runtime/o;", "Lkotlin/S;", "name", "content", "FadeInFadeOutTransition", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.ig, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21637ig {

    /* compiled from: SnackbarHost.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.ig$a */
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[SnackbarDuration.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @InterfaceC22132o
    @InterfaceC22137p
    public static final void a(Xf xf2, androidx.compose.ui.v vVar, Y41.q qVar, androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(-1316639904);
        int i13 = (i12 & 6) == 0 ? (bE2.B(xf2) ? 4 : 2) | i12 : i12;
        if ((i12 & 48) == 0) {
            i13 |= bE2.B(vVar) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= bE2.u(qVar) ? 256 : 128;
        }
        if ((i13 & 147) == 146 && bE2.c()) {
            bE2.f();
        } else {
            bE2.I(-733279506);
            Object objT = bE2.t();
            androidx.compose.runtime.A.f37866a.getClass();
            if (objT == A.a.f37868b) {
                objT = new E7();
                bE2.H(objT);
            }
            E7 e72 = (E7) objT;
            bE2.X(false);
            boolean zF2 = kotlin.jvm.internal.L.f(xf2, e72.f34667a);
            ArrayList arrayList = e72.f34668b;
            if (!zF2) {
                e72.f34667a = xf2;
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i14 = 0; i14 < size; i14++) {
                    arrayList2.add(((D7) arrayList.get(i14)).f34623a);
                }
                ArrayList arrayList3 = new ArrayList(arrayList2);
                if (!arrayList3.contains(xf2)) {
                    arrayList3.add(xf2);
                }
                arrayList.clear();
                ArrayList arrayListA = E0.d.a(arrayList3);
                int size2 = arrayListA.size();
                for (int i15 = 0; i15 < size2; i15++) {
                    Xf xf3 = (Xf) arrayListA.get(i15);
                    arrayList.add(new D7(xf3, androidx.compose.runtime.internal.r.b(bE2, -1654683077, new C21523dg(xf3, xf2, arrayList3, e72))));
                }
            }
            bE2.I(733328855);
            InterfaceC22215f.f39074a.getClass();
            InterfaceC22365i0 interfaceC22365i0E = C20632w.e(InterfaceC22215f.a.f39076b, false, bE2, 0);
            bE2.I(-1323940314);
            int i16 = bE2.f37888Q;
            androidx.compose.runtime.O1 o1S = bE2.S();
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar = InterfaceC22413h.a.f40791b;
            C22096n c22096nC = androidx.compose.ui.layout.M.c(vVar);
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar);
            } else {
                bE2.d();
            }
            androidx.compose.runtime.R3.b(InterfaceC22413h.a.f40796g, bE2, interfaceC22365i0E);
            androidx.compose.runtime.R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i16))) {
                AK.c.y(i16, bE2, i16, pVar);
            }
            androidx.compose.foundation.H.y(0, c22096nC, androidx.compose.runtime.J2.a(bE2), bE2, 2058660585);
            C20644z c20644z = C20644z.f28804a;
            e72.f34669c = C22190v.a(bE2);
            bE2.I(-733277083);
            int size3 = arrayList.size();
            for (int i17 = 0; i17 < size3; i17++) {
                D7 d72 = (D7) arrayList.get(i17);
                Xf xf4 = d72.f34623a;
                bE2.K(870027604, xf4);
                d72.f34624b.invoke(androidx.compose.runtime.internal.r.b(bE2, -1135367807, new C21546eg(qVar, xf4)), bE2, 6);
                bE2.X(false);
            }
            androidx.compose.foundation.H.B(bE2, false, false, true, false);
            bE2.X(false);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C21569fg(xf2, vVar, qVar, i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0095  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22137p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(@Y61.k androidx.compose.material3.C21729mg r8, @Y61.l androidx.compose.ui.v r9, @Y61.l androidx.compose.runtime.internal.C22096n r10, @Y61.l androidx.compose.runtime.A r11, int r12, int r13) {
        /*
            r0 = 464178177(0x1baacc01, float:2.8255975E-22)
            androidx.compose.runtime.B r11 = r11.E(r0)
            r0 = r12 & 6
            if (r0 != 0) goto L16
            boolean r0 = r11.B(r8)
            if (r0 == 0) goto L13
            r0 = 4
            goto L14
        L13:
            r0 = 2
        L14:
            r0 = r0 | r12
            goto L17
        L16:
            r0 = r12
        L17:
            r1 = r13 & 2
            if (r1 == 0) goto L1e
            r0 = r0 | 48
            goto L2e
        L1e:
            r2 = r12 & 48
            if (r2 != 0) goto L2e
            boolean r2 = r11.B(r9)
            if (r2 == 0) goto L2b
            r2 = 32
            goto L2d
        L2b:
            r2 = 16
        L2d:
            r0 = r0 | r2
        L2e:
            r2 = r13 & 4
            if (r2 == 0) goto L35
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L45
        L35:
            r3 = r12 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L45
            boolean r3 = r11.u(r10)
            if (r3 == 0) goto L42
            r3 = 256(0x100, float:3.59E-43)
            goto L44
        L42:
            r3 = 128(0x80, float:1.8E-43)
        L44:
            r0 = r0 | r3
        L45:
            r3 = r0 & 147(0x93, float:2.06E-43)
            r4 = 146(0x92, float:2.05E-43)
            if (r3 != r4) goto L58
            boolean r3 = r11.c()
            if (r3 != 0) goto L52
            goto L58
        L52:
            r11.f()
        L55:
            r4 = r9
            r5 = r10
            goto Lb7
        L58:
            if (r1 == 0) goto L5c
            androidx.compose.ui.v$a r9 = androidx.compose.ui.v.f42878y1
        L5c:
            if (r2 == 0) goto L65
            androidx.compose.material3.H3 r10 = androidx.compose.material3.H3.f34824a
            r10.getClass()
            androidx.compose.runtime.internal.n r10 = androidx.compose.material3.H3.f34825b
        L65:
            androidx.compose.runtime.y1 r1 = r8.f36841b
            androidx.compose.runtime.i3 r1 = (androidx.compose.runtime.C22082i3) r1
            java.lang.Object r1 = r1.getF42167b()
            androidx.compose.material3.Xf r1 = (androidx.compose.material3.Xf) r1
            androidx.compose.runtime.J3 r2 = androidx.compose.ui.platform.Q0.f41192a
            java.lang.Object r2 = r11.o(r2)
            androidx.compose.ui.platform.c r2 = (androidx.compose.ui.platform.InterfaceC22458c) r2
            r3 = -1401194142(0xffffffffac7b7962, float:-3.5736626E-12)
            r11.I(r3)
            boolean r3 = r11.B(r1)
            boolean r4 = r11.u(r2)
            r3 = r3 | r4
            java.lang.Object r4 = r11.t()
            if (r3 != 0) goto L95
            androidx.compose.runtime.A$a r3 = androidx.compose.runtime.A.f37866a
            r3.getClass()
            androidx.compose.runtime.A$a$a r3 = androidx.compose.runtime.A.a.f37868b
            if (r4 != r3) goto L9e
        L95:
            androidx.compose.material3.gg r4 = new androidx.compose.material3.gg
            r3 = 0
            r4.<init>(r1, r2, r3)
            r11.H(r4)
        L9e:
            Y41.p r4 = (Y41.p) r4
            r2 = 0
            r11.X(r2)
            androidx.compose.runtime.C22187u0.d(r4, r11, r1)
            androidx.compose.runtime.y1 r1 = r8.f36841b
            androidx.compose.runtime.i3 r1 = (androidx.compose.runtime.C22082i3) r1
            java.lang.Object r1 = r1.getF42167b()
            androidx.compose.material3.Xf r1 = (androidx.compose.material3.Xf) r1
            r0 = r0 & 1008(0x3f0, float:1.413E-42)
            a(r1, r9, r10, r11, r0)
            goto L55
        Lb7:
            androidx.compose.runtime.c2 r9 = r11.Z()
            if (r9 == 0) goto Lc8
            androidx.compose.material3.hg r10 = new androidx.compose.material3.hg
            r2 = r10
            r3 = r8
            r6 = r12
            r7 = r13
            r2.<init>(r3, r4, r5, r6, r7)
            r9.f38184d = r10
        Lc8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.C21637ig.b(androidx.compose.material3.mg, androidx.compose.ui.v, androidx.compose.runtime.internal.n, androidx.compose.runtime.A, int, int):void");
    }
}
