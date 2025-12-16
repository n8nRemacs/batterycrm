package androidx.compose.material3;

import android.view.View;
import androidx.compose.foundation.layout.InterfaceC20639x2;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22137p;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.SecureFlagPolicy;
import java.util.UUID;
import kotlin.Metadata;

/* compiled from: ModalBottomSheet.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0006²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u0017\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00048\nX\u008a\u0084\u0002"}, d2 = {"", "alpha", "Lkotlin/Function0;", "Lkotlin/G0;", "Landroidx/compose/runtime/o;", "currentContent", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.za, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22015za {

    /* compiled from: ModalBottomSheet.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.za$a */
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[SecureFlagPolicy.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                SecureFlagPolicy secureFlagPolicy = SecureFlagPolicy.f43062b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                SecureFlagPolicy secureFlagPolicy2 = SecureFlagPolicy.f43062b;
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x013f  */
    @androidx.compose.material3.InterfaceC21537e7
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22137p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k Y41.a r35, @Y61.l androidx.compose.ui.v r36, @Y61.l androidx.compose.material3.Me r37, float r38, @Y61.l androidx.compose.ui.graphics.h1 r39, long r40, long r42, float r44, long r45, @Y61.l androidx.compose.runtime.internal.C22096n r47, @Y61.l androidx.compose.foundation.layout.InterfaceC20639x2 r48, @Y61.l androidx.compose.material3.N9 r49, @Y61.k androidx.compose.runtime.internal.C22096n r50, @Y61.l androidx.compose.runtime.A r51, int r52) {
        /*
            Method dump skipped, instructions count: 749
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.C22015za.a(Y41.a, androidx.compose.ui.v, androidx.compose.material3.Me, float, androidx.compose.ui.graphics.h1, long, long, float, long, androidx.compose.runtime.internal.n, androidx.compose.foundation.layout.x2, androidx.compose.material3.N9, androidx.compose.runtime.internal.n, androidx.compose.runtime.A, int):void");
    }

    @InterfaceC22132o
    @InterfaceC22137p
    public static final void b(@Y61.k N9 n92, @Y61.k Y41.a aVar, @Y61.k InterfaceC20639x2 interfaceC20639x2, @Y61.k C22096n c22096n, @Y61.l androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(738805080);
        if ((i12 & 6) == 0) {
            i13 = (bE2.B(n92) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= bE2.u(aVar) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= bE2.B(interfaceC20639x2) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i13 |= bE2.u(c22096n) ? 2048 : 1024;
        }
        if ((i13 & 1171) == 1170 && bE2.c()) {
            bE2.f();
        } else {
            View view = (View) bE2.o(AndroidCompositionLocals_androidKt.f41073f);
            UUID uuid = (UUID) androidx.compose.runtime.saveable.j.c(new Object[0], null, C21860sa.f37273l, bE2, 3072, 6);
            B.b bVarI = bE2.i();
            InterfaceC22204y1 interfaceC22204y1M = C22126m3.m(c22096n, bE2);
            LayoutDirection layoutDirection = (LayoutDirection) bE2.o(androidx.compose.ui.platform.Q0.f41205n);
            bE2.I(173201889);
            Object objT = bE2.t();
            androidx.compose.runtime.A.f37866a.getClass();
            A.a.C1651a c1651a = A.a.f37868b;
            Object obj = objT;
            if (objT == c1651a) {
                P9 p92 = new P9(n92, aVar, view, uuid);
                C22096n c22096n2 = new C22096n(-114385661, new C21905ua(interfaceC20639x2, interfaceC22204y1M), true);
                p92.setParentCompositionContext(bVarI);
                ((C22082i3) p92.f35295p).setValue(c22096n2);
                p92.f35296q = true;
                bE2.H(p92);
                obj = p92;
            }
            P9 p93 = (P9) obj;
            bE2.X(false);
            bE2.I(173202877);
            boolean zU2 = bE2.u(p93) | bE2.B(layoutDirection);
            Object objT2 = bE2.t();
            if (zU2 || objT2 == c1651a) {
                objT2 = new C21815qa(p93, layoutDirection);
                bE2.H(objT2);
            }
            bE2.X(false);
            C22187u0.a(p93, (Y41.l) objT2, bE2);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C21837ra(n92, aVar, interfaceC20639x2, c22096n, i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(long r21, Y41.a r23, boolean r24, androidx.compose.runtime.A r25, int r26) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.C22015za.c(long, Y41.a, boolean, androidx.compose.runtime.A, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0097  */
    @androidx.compose.material3.InterfaceC21537e7
    @androidx.compose.runtime.InterfaceC22132o
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.material3.Me d(@Y61.l Y41.l r14, @Y61.l androidx.compose.runtime.A r15, int r16, int r17) {
        /*
            r6 = r15
            r0 = -1261794383(0xffffffffb4ca8bb1, float:-3.772707E-7)
            r15.I(r0)
            r0 = 1
            r1 = r17 & 1
            r2 = 0
            if (r1 == 0) goto Lf
            r8 = r2
            goto L10
        Lf:
            r8 = r0
        L10:
            r1 = r17 & 2
            if (r1 == 0) goto L18
            androidx.compose.material3.Ca r1 = androidx.compose.material3.Ca.f34599l
            r11 = r1
            goto L19
        L18:
            r11 = r14
        L19:
            androidx.compose.material3.SheetValue r10 = androidx.compose.material3.SheetValue.f35417b
            r1 = r16 & 14
            r1 = r1 | 384(0x180, float:5.38E-43)
            r3 = r16 & 112(0x70, float:1.57E-43)
            r1 = r1 | r3
            float r3 = androidx.compose.material3.Le.f35070a
            r3 = 1032784200(0x3d8f0948, float:0.06984192)
            r15.I(r3)
            androidx.compose.runtime.J3 r3 = androidx.compose.ui.platform.Q0.f41199h
            java.lang.Object r3 = r15.o(r3)
            r9 = r3
            androidx.compose.ui.unit.d r9 = (androidx.compose.ui.unit.d) r9
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r8)
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r11}
            androidx.compose.material3.Me$c r4 = androidx.compose.material3.Me.f35132e
            r4.getClass()
            androidx.compose.material3.Ne r4 = androidx.compose.material3.Ne.f35180l
            androidx.compose.material3.Oe r5 = new androidx.compose.material3.Oe
            r5.<init>(r8, r9, r11)
            androidx.compose.runtime.saveable.w r7 = androidx.compose.runtime.saveable.v.f38606a
            androidx.compose.runtime.saveable.w r13 = new androidx.compose.runtime.saveable.w
            r13.<init>(r5, r4)
            r4 = 1097108455(0x41648be7, float:14.284156)
            r15.I(r4)
            r4 = r1 & 14
            r4 = r4 ^ 6
            r5 = 4
            if (r4 <= r5) goto L61
            boolean r4 = r15.j(r8)
            if (r4 != 0) goto L65
        L61:
            r4 = r1 & 6
            if (r4 != r5) goto L67
        L65:
            r4 = r0
            goto L68
        L67:
            r4 = r2
        L68:
            boolean r5 = r15.B(r9)
            r4 = r4 | r5
            r5 = r1 & 112(0x70, float:1.57E-43)
            r5 = r5 ^ 48
            r7 = 32
            if (r5 <= r7) goto L7b
            boolean r5 = r15.B(r11)
            if (r5 != 0) goto L81
        L7b:
            r1 = r1 & 48
            if (r1 != r7) goto L80
            goto L81
        L80:
            r0 = r2
        L81:
            r0 = r0 | r4
            r12 = 0
            boolean r1 = r15.j(r12)
            r0 = r0 | r1
            java.lang.Object r1 = r15.t()
            if (r0 != 0) goto L97
            androidx.compose.runtime.A$a r0 = androidx.compose.runtime.A.f37866a
            r0.getClass()
            androidx.compose.runtime.A$a$a r0 = androidx.compose.runtime.A.a.f37868b
            if (r1 != r0) goto La0
        L97:
            androidx.compose.material3.Ke r1 = new androidx.compose.material3.Ke
            r7 = r1
            r7.<init>(r8, r9, r10, r11, r12)
            r15.H(r1)
        La0:
            r2 = r1
            Y41.a r2 = (Y41.a) r2
            r15.O()
            r4 = 0
            r5 = 4
            r0 = r3
            r1 = r13
            r3 = r15
            java.lang.Object r0 = androidx.compose.runtime.saveable.j.c(r0, r1, r2, r3, r4, r5)
            androidx.compose.material3.Me r0 = (androidx.compose.material3.Me) r0
            r15.O()
            r15.O()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.C22015za.d(Y41.l, androidx.compose.runtime.A, int, int):androidx.compose.material3.Me");
    }
}
