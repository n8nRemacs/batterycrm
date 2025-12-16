package androidx.compose.material3;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.runtime.A;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import kotlin.Metadata;

/* compiled from: TouchExplorationStateProvider.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Ol {
    /* JADX WARN: Removed duplicated region for block: B:32:0x0067  */
    @androidx.compose.runtime.InterfaceC22132o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(androidx.view.Lifecycle r6, Y41.l r7, Y41.a r8, androidx.compose.runtime.A r9, int r10) {
        /*
            r0 = -1703772404(0xffffffff9a727f0c, float:-5.0147055E-23)
            androidx.compose.runtime.B r9 = r9.E(r0)
            boolean r0 = r9.u(r6)
            if (r0 == 0) goto Lf
            r0 = 4
            goto L10
        Lf:
            r0 = 2
        L10:
            r0 = r0 | r10
            boolean r1 = r9.u(r7)
            r2 = 32
            if (r1 == 0) goto L1b
            r1 = r2
            goto L1d
        L1b:
            r1 = 16
        L1d:
            r0 = r0 | r1
            boolean r1 = r9.u(r8)
            r3 = 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L28
            r1 = r3
            goto L2a
        L28:
            r1 = 128(0x80, float:1.8E-43)
        L2a:
            r0 = r0 | r1
            r1 = r0 & 147(0x93, float:2.06E-43)
            r4 = 146(0x92, float:2.05E-43)
            if (r1 != r4) goto L3c
            boolean r1 = r9.c()
            if (r1 != 0) goto L38
            goto L3c
        L38:
            r9.f()
            goto L77
        L3c:
            r1 = -1018043936(0xffffffffc351e1e0, float:-209.88232)
            r9.I(r1)
            r1 = r0 & 112(0x70, float:1.57E-43)
            r4 = 0
            r5 = 1
            if (r1 != r2) goto L4a
            r1 = r5
            goto L4b
        L4a:
            r1 = r4
        L4b:
            boolean r2 = r9.u(r6)
            r1 = r1 | r2
            r0 = r0 & 896(0x380, float:1.256E-42)
            if (r0 != r3) goto L55
            goto L56
        L55:
            r5 = r4
        L56:
            r0 = r1 | r5
            java.lang.Object r1 = r9.t()
            if (r0 != 0) goto L67
            androidx.compose.runtime.A$a r0 = androidx.compose.runtime.A.f37866a
            r0.getClass()
            androidx.compose.runtime.A$a$a r0 = androidx.compose.runtime.A.a.f37868b
            if (r1 != r0) goto L6f
        L67:
            androidx.compose.material3.Kl r1 = new androidx.compose.material3.Kl
            r1.<init>(r6, r7, r8)
            r9.H(r1)
        L6f:
            Y41.l r1 = (Y41.l) r1
            r9.X(r4)
            androidx.compose.runtime.C22187u0.a(r6, r1, r9)
        L77:
            androidx.compose.runtime.c2 r9 = r9.Z()
            if (r9 == 0) goto L84
            androidx.compose.material3.Ll r0 = new androidx.compose.material3.Ll
            r0.<init>(r6, r7, r8, r10)
            r9.f38184d = r0
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.Ol.a(androidx.lifecycle.Lifecycle, Y41.l, Y41.a, androidx.compose.runtime.A, int):void");
    }

    @InterfaceC22132o
    @Y61.k
    public static final androidx.compose.runtime.I3 b(@Y61.l androidx.compose.runtime.A a12) {
        a12.I(-906157724);
        Context context = (Context) a12.o(AndroidCompositionLocals_androidKt.f41069b);
        a12.I(-1014858715);
        Object objT = a12.t();
        androidx.compose.runtime.A.f37866a.getClass();
        Object obj = A.a.f37868b;
        if (objT == obj) {
            objT = (AccessibilityManager) context.getSystemService("accessibility");
            a12.H(objT);
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) objT;
        a12.O();
        a12.I(-1014858590);
        Object objT2 = a12.t();
        if (objT2 == obj) {
            objT2 = new AccessibilityManagerAccessibilityStateChangeListenerC21722m9();
            a12.H(objT2);
        }
        AccessibilityManagerAccessibilityStateChangeListenerC21722m9 accessibilityManagerAccessibilityStateChangeListenerC21722m9 = (AccessibilityManagerAccessibilityStateChangeListenerC21722m9) objT2;
        a12.O();
        Lifecycle lifecycle = ((InterfaceC22983P) a12.o(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).getLifecycle();
        a12.I(-1014858487);
        boolean zU2 = a12.u(accessibilityManager);
        Object objT3 = a12.t();
        if (zU2 || objT3 == obj) {
            objT3 = new Ml(accessibilityManagerAccessibilityStateChangeListenerC21722m9, accessibilityManager);
            a12.H(objT3);
        }
        Y41.l lVar = (Y41.l) objT3;
        a12.O();
        a12.I(-1014858321);
        boolean zU3 = a12.u(accessibilityManager);
        Object objT4 = a12.t();
        if (zU3 || objT4 == obj) {
            objT4 = new Nl(accessibilityManagerAccessibilityStateChangeListenerC21722m9, accessibilityManager);
            a12.H(objT4);
        }
        a12.O();
        a(lifecycle, lVar, (Y41.a) objT4, a12, 0);
        a12.O();
        return accessibilityManagerAccessibilityStateChangeListenerC21722m9;
    }
}
