package androidx.compose.foundation.text;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import kotlin.Metadata;

/* compiled from: ContextMenu.android.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20980p0 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.text.selection.L0 f31761l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C22096n f31762m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20980p0(androidx.compose.foundation.text.selection.L0 l02, C22096n c22096n, int i12) {
        super(2);
        this.f31761l = l02;
        this.f31762m = c22096n;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) throws Throwable {
        num.intValue();
        int iA2 = C22066f2.a(49);
        androidx.compose.foundation.text.selection.L0 l02 = this.f31761l;
        C22096n c22096n = this.f31762m;
        androidx.compose.runtime.B bE2 = a12.E(605522716);
        int i12 = (bE2.u(l02) ? 4 : 2) | iA2;
        if (bE2.p(i12 & 1, (i12 & 19) != 18)) {
            Object objT = bE2.t();
            androidx.compose.runtime.A.f37866a.getClass();
            A.a.C1651a c1651a = A.a.f37868b;
            if (objT == c1651a) {
                objT = new androidx.compose.foundation.contextmenu.s(null, 1, null);
                bE2.H(objT);
            }
            androidx.compose.foundation.contextmenu.s sVar = (androidx.compose.foundation.contextmenu.s) objT;
            Object objT2 = bE2.t();
            if (objT2 == c1651a) {
                objT2 = new C20976o0(sVar);
                bE2.H(objT2);
            }
            androidx.compose.foundation.contextmenu.f.b(sVar, (Y41.a) objT2, androidx.compose.foundation.text.selection.P0.a(sVar, l02), null, false, null, c22096n, bE2, 1572918, 56);
        } else {
            bE2.f();
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C20980p0(l02, c22096n, iA2);
        }
        return kotlin.G0.f406611a;
    }
}
