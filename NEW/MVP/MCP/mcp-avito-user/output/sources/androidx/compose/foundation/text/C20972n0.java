package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.internal.C22096n;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;

/* compiled from: ContextMenu.android.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20972n0 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f31738l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f31739m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C22096n f31740n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f31741o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20972n0(TextFieldSelectionState textFieldSelectionState, boolean z12, C22096n c22096n, int i12) {
        super(2);
        this.f31738l = textFieldSelectionState;
        this.f31739m = z12;
        this.f31740n = c22096n;
        this.f31741o = i12;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) throws Throwable {
        int i12;
        boolean z12;
        num.intValue();
        int iA2 = C22066f2.a(this.f31741o | 1);
        C22096n c22096n = this.f31740n;
        androidx.compose.runtime.B bE2 = a12.E(2103477555);
        int i13 = iA2 & 6;
        TextFieldSelectionState textFieldSelectionState = this.f31738l;
        if (i13 == 0) {
            i12 = (bE2.u(textFieldSelectionState) ? 4 : 2) | iA2;
        } else {
            i12 = iA2;
        }
        int i14 = iA2 & 48;
        boolean z13 = this.f31739m;
        if (i14 == 0) {
            i12 |= bE2.j(z13) ? 32 : 16;
        }
        if ((iA2 & 384) == 0) {
            i12 |= bE2.u(c22096n) ? 256 : 128;
        }
        if (bE2.p(i12 & 1, (i12 & 147) != 146)) {
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
            boolean zU2 = bE2.u(t12);
            Object objT4 = bE2.t();
            if (zU2 || objT4 == obj) {
                objT4 = new C20987r0(t12);
                bE2.H(objT4);
            }
            Y41.l lVarA = androidx.compose.foundation.text.input.internal.selection.X.a((Y41.p) objT4, sVar, textFieldSelectionState, interfaceC22204y1);
            Object objT5 = bE2.t();
            if (objT5 == obj) {
                objT5 = new C20960k0(sVar);
                bE2.H(objT5);
            }
            Y41.a aVar = (Y41.a) objT5;
            boolean zU3 = bE2.u(t12) | bE2.u(textFieldSelectionState);
            Object objT6 = bE2.t();
            if (zU3 || objT6 == obj) {
                objT6 = new C20968m0(t12, interfaceC22204y1, textFieldSelectionState);
                bE2.H(objT6);
            }
            z12 = z13;
            androidx.compose.foundation.contextmenu.f.b(sVar, aVar, lVarA, null, z13, (Y41.a) objT6, c22096n, bE2, ((i12 << 9) & 57344) | 54 | ((i12 << 12) & 3670016), 8);
        } else {
            z12 = z13;
            bE2.f();
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C20972n0(textFieldSelectionState, z12, c22096n, iA2);
        }
        return kotlin.G0.f406611a;
    }
}
