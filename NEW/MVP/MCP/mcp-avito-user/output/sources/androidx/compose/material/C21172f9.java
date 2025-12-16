package androidx.compose.material;

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
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*b\b\u0002\u0010\u0007\"-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u00032-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003¨\u0006\b"}, d2 = {"Lkotlin/Function1;", "Lkotlin/Function0;", "Lkotlin/G0;", "Landroidx/compose/runtime/o;", "Lkotlin/S;", "name", "content", "FadeInFadeOutTransition", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.material.f9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21172f9 {

    /* compiled from: SnackbarHost.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.material.f9$a */
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[SnackbarDuration.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                SnackbarDuration[] snackbarDurationArr = SnackbarDuration.f33186b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                SnackbarDuration[] snackbarDurationArr2 = SnackbarDuration.f33186b;
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @InterfaceC22132o
    @InterfaceC22137p
    public static final void a(U8 u82, androidx.compose.ui.v vVar, C22096n c22096n, androidx.compose.runtime.A a12, int i12) {
        ArrayList arrayList;
        boolean z12;
        androidx.compose.runtime.B bE2 = a12.E(2036134589);
        int i13 = (i12 & 6) == 0 ? ((i12 & 8) == 0 ? bE2.B(u82) : bE2.u(u82) ? 4 : 2) | i12 : i12;
        if ((i12 & 48) == 0) {
            i13 |= bE2.B(vVar) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= bE2.u(c22096n) ? 256 : 128;
        }
        if (bE2.p(i13 & 1, (i13 & 147) != 146)) {
            Object objT = bE2.t();
            androidx.compose.runtime.A.f37866a.getClass();
            if (objT == A.a.f37868b) {
                objT = new H4();
                bE2.H(objT);
            }
            H4 h42 = (H4) objT;
            A9.f32353b.getClass();
            String strA = B9.a(bE2, A9.f32360i);
            boolean zF2 = kotlin.jvm.internal.L.f(u82, h42.f32709a);
            ArrayList arrayList2 = h42.f32710b;
            if (zF2) {
                arrayList = arrayList2;
                z12 = false;
                bE2.C(1524617353);
                bE2.X(false);
            } else {
                bE2.C(1522020731);
                h42.f32709a = u82;
                ArrayList arrayList3 = new ArrayList(arrayList2.size());
                int size = arrayList2.size();
                for (int i14 = 0; i14 < size; i14++) {
                    arrayList3.add(((G4) arrayList2.get(i14)).f32661a);
                }
                ArrayList arrayList4 = new ArrayList(arrayList3);
                if (!arrayList4.contains(u82)) {
                    arrayList4.add(u82);
                }
                arrayList2.clear();
                ArrayList arrayListA = E0.d.a(arrayList4);
                int size2 = arrayListA.size();
                int i15 = 0;
                while (i15 < size2) {
                    U8 u83 = (U8) arrayListA.get(i15);
                    ArrayList arrayList5 = arrayList2;
                    arrayList5.add(new G4(u83, androidx.compose.runtime.internal.r.c(1471040642, new C21107a9(u83, u82, arrayList4, h42, strA), bE2)));
                    i15++;
                    arrayList2 = arrayList5;
                    size2 = size2;
                    arrayListA = arrayListA;
                    arrayList4 = arrayList4;
                }
                arrayList = arrayList2;
                z12 = false;
                bE2.X(false);
            }
            InterfaceC22215f.f39074a.getClass();
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, z12);
            int i16 = bE2.f37888Q;
            androidx.compose.runtime.O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVar);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar = InterfaceC22413h.a.f40791b;
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
            androidx.compose.runtime.R3.b(InterfaceC22413h.a.f40796g, bE2, interfaceC22365i0D);
            androidx.compose.runtime.R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i16))) {
                AK.c.y(i16, bE2, i16, pVar);
            }
            androidx.compose.runtime.R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            C20644z c20644z = C20644z.f28804a;
            h42.f32711c = C22190v.a(bE2);
            bE2.C(1801449988);
            int size3 = arrayList.size();
            for (int i17 = 0; i17 < size3; i17++) {
                G4 g42 = (G4) arrayList.get(i17);
                U8 u84 = g42.f32661a;
                bE2.K(2123994112, u84);
                g42.f32662b.invoke(androidx.compose.runtime.internal.r.c(2041982076, new C21120b9(u84, c22096n), bE2), bE2, 6);
                bE2.X(false);
            }
            bE2.X(false);
            bE2.X(true);
        } else {
            bE2.f();
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C21133c9(u82, vVar, c22096n, i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22137p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(@Y61.k androidx.compose.material.C21224j9 r5, @Y61.l androidx.compose.ui.v.a r6, @Y61.l androidx.compose.runtime.internal.C22096n r7, @Y61.l androidx.compose.runtime.A r8, int r9) {
        /*
            r0 = 431012348(0x19b0b9fc, float:1.8273092E-23)
            androidx.compose.runtime.B r8 = r8.E(r0)
            r0 = r9 & 6
            if (r0 != 0) goto L16
            boolean r0 = r8.B(r5)
            if (r0 == 0) goto L13
            r0 = 4
            goto L14
        L13:
            r0 = 2
        L14:
            r0 = r0 | r9
            goto L17
        L16:
            r0 = r9
        L17:
            r0 = r0 | 432(0x1b0, float:6.05E-43)
            r1 = r0 & 147(0x93, float:2.06E-43)
            r2 = 146(0x92, float:2.05E-43)
            if (r1 == r2) goto L21
            r1 = 1
            goto L22
        L21:
            r1 = 0
        L22:
            r2 = r0 & 1
            boolean r1 = r8.p(r2, r1)
            if (r1 == 0) goto L7b
            androidx.compose.ui.v$a r6 = androidx.compose.ui.v.f42878y1
            androidx.compose.material.w2 r7 = androidx.compose.material.C21388w2.f34317a
            r7.getClass()
            androidx.compose.runtime.internal.n r7 = androidx.compose.material.C21388w2.f34318b
            androidx.compose.runtime.y1 r1 = r5.f33722a
            androidx.compose.runtime.i3 r1 = (androidx.compose.runtime.C22082i3) r1
            java.lang.Object r1 = r1.getF42167b()
            androidx.compose.material.U8 r1 = (androidx.compose.material.U8) r1
            androidx.compose.runtime.J3 r2 = androidx.compose.ui.platform.Q0.f41192a
            java.lang.Object r2 = r8.o(r2)
            androidx.compose.ui.platform.c r2 = (androidx.compose.ui.platform.InterfaceC22458c) r2
            boolean r3 = r8.u(r1)
            boolean r4 = r8.u(r2)
            r3 = r3 | r4
            java.lang.Object r4 = r8.t()
            if (r3 != 0) goto L5d
            androidx.compose.runtime.A$a r3 = androidx.compose.runtime.A.f37866a
            r3.getClass()
            androidx.compose.runtime.A$a$a r3 = androidx.compose.runtime.A.a.f37868b
            if (r4 != r3) goto L66
        L5d:
            androidx.compose.material.d9 r4 = new androidx.compose.material.d9
            r3 = 0
            r4.<init>(r1, r2, r3)
            r8.H(r4)
        L66:
            Y41.p r4 = (Y41.p) r4
            androidx.compose.runtime.C22187u0.d(r4, r8, r1)
            androidx.compose.runtime.y1 r1 = r5.f33722a
            androidx.compose.runtime.i3 r1 = (androidx.compose.runtime.C22082i3) r1
            java.lang.Object r1 = r1.getF42167b()
            androidx.compose.material.U8 r1 = (androidx.compose.material.U8) r1
            r0 = r0 & 1008(0x3f0, float:1.413E-42)
            a(r1, r6, r7, r8, r0)
            goto L7e
        L7b:
            r8.f()
        L7e:
            androidx.compose.runtime.c2 r8 = r8.Z()
            if (r8 == 0) goto L8b
            androidx.compose.material.e9 r0 = new androidx.compose.material.e9
            r0.<init>(r5, r6, r7, r9)
            r8.f38184d = r0
        L8b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.C21172f9.b(androidx.compose.material.j9, androidx.compose.ui.v$a, androidx.compose.runtime.internal.n, androidx.compose.runtime.A, int):void");
    }
}
