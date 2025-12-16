package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.C21011f1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22137p;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.internal.C22096n;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;

/* compiled from: ContextMenu.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21064w0 {
    @InterfaceC22132o
    @InterfaceC22137p
    public static final void a(@Y61.k C21011f1 c21011f1, @Y61.k C22096n c22096n, @Y61.l androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(-1985516685);
        if ((i12 & 6) == 0) {
            i13 = (bE2.u(c21011f1) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= bE2.u(c22096n) ? 32 : 16;
        }
        if (bE2.p(i13 & 1, (i13 & 19) != 18)) {
            Object objT = bE2.t();
            androidx.compose.runtime.A.f37866a.getClass();
            Object obj = A.a.f37868b;
            if (objT == obj) {
                objT = new androidx.compose.foundation.contextmenu.s(null, 1, null);
                bE2.H(objT);
            }
            androidx.compose.foundation.contextmenu.s sVar = (androidx.compose.foundation.contextmenu.s) objT;
            Object objT2 = bE2.t();
            if (objT2 == obj) {
                objT2 = C22187u0.h(EmptyCoroutineContext.INSTANCE, bE2);
                bE2.H(objT2);
            }
            kotlinx.coroutines.T t12 = (kotlinx.coroutines.T) objT2;
            Object objT3 = bE2.t();
            if (objT3 == obj) {
                F1.f30249b.getClass();
                objT3 = C22126m3.g(F1.a(0));
                bE2.H(objT3);
            }
            InterfaceC22204y1 interfaceC22204y1 = (InterfaceC22204y1) objT3;
            Object objT4 = bE2.t();
            if (objT4 == obj) {
                objT4 = new C20868g0(sVar);
                bE2.H(objT4);
            }
            Y41.a aVar = (Y41.a) objT4;
            Y41.l lVarA = androidx.compose.foundation.text.selection.A1.a(sVar, c21011f1, interfaceC22204y1);
            boolean zK2 = c21011f1.k();
            boolean zU2 = bE2.u(t12) | bE2.u(c21011f1);
            Object objT5 = bE2.t();
            if (zU2 || objT5 == obj) {
                objT5 = new C20876i0(t12, interfaceC22204y1, c21011f1);
                bE2.H(objT5);
            }
            androidx.compose.foundation.contextmenu.f.b(sVar, aVar, lVarA, null, zK2, (Y41.a) objT5, c22096n, bE2, ((i13 << 15) & 3670016) | 54, 8);
        } else {
            bE2.f();
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C20956j0(c21011f1, c22096n, i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(@Y61.k androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r4, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            boolean r0 = r5 instanceof androidx.compose.foundation.text.C21056u0
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.text.u0 r0 = (androidx.compose.foundation.text.C21056u0) r0
            int r1 = r0.f32244t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32244t = r1
            goto L18
        L13:
            androidx.compose.foundation.text.u0 r0 = new androidx.compose.foundation.text.u0
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f32243s
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r0.f32244t
            r2 = 1
            if (r1 == 0) goto L3b
            if (r1 != r2) goto L33
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r4 = r0.f32241q
            kotlin.C42729a0.b(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            r5.booleanValue()
            r4.getClass()
            r4 = 0
            throw r4
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            kotlin.C42729a0.b(r5)
            r4.getClass()
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.C21064w0.b(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008b A[PHI: r2 r5 r8 r9
  0x008b: PHI (r2v3 ??) = (r2v1 ??), (r2v10 ??) binds: [B:20:0x0058, B:34:0x0087] A[DONT_GENERATE, DONT_INLINE]
  0x008b: PHI (r5v3 int) = (r5v1 int), (r5v12 int) binds: [B:20:0x0058, B:34:0x0087] A[DONT_GENERATE, DONT_INLINE]
  0x008b: PHI (r8v3 androidx.compose.foundation.text.selection.f1) = (r8v0 androidx.compose.foundation.text.selection.f1), (r8v9 androidx.compose.foundation.text.selection.f1) binds: [B:20:0x0058, B:34:0x0087] A[DONT_GENERATE, DONT_INLINE]
  0x008b: PHI (r9v10 int) = (r9v6 int), (r9v12 int) binds: [B:20:0x0058, B:34:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v3 */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(@Y61.k androidx.compose.foundation.text.selection.C21011f1 r8, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            Method dump skipped, instructions count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.C21064w0.c(androidx.compose.foundation.text.selection.f1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
