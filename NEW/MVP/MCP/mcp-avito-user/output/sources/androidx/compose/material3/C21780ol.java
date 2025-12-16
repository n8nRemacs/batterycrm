package androidx.compose.material3;

import androidx.compose.animation.core.C20288i1;
import androidx.compose.animation.core.C20300m1;
import androidx.compose.animation.core.C20318t;
import androidx.compose.runtime.C22082i3;
import androidx.compose.ui.graphics.C22274n0;
import kotlin.Metadata;

/* compiled from: Tooltip.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/v;", "invoke", "(Landroidx/compose/ui/v;Landroidx/compose/runtime/A;I)Landroidx/compose/ui/v;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.compose.material3.ol, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21780ol extends kotlin.jvm.internal.N implements Y41.q<androidx.compose.ui.v, androidx.compose.runtime.A, Integer, androidx.compose.ui.v> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C20288i1<Boolean> f37001l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21780ol(C20288i1<Boolean> c20288i1) {
        super(3);
        this.f37001l = c20288i1;
    }

    @Override // Y41.q
    public final androidx.compose.ui.v invoke(androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.ui.v vVar2 = vVar;
        androidx.compose.runtime.A a13 = a12;
        num.intValue();
        a13.I(-1498516085);
        C21757nl c21757nl = C21757nl.f36921l;
        a13.I(-1338768149);
        int i12 = kotlin.jvm.internal.A.f406820a;
        androidx.compose.animation.core.H1<Float, C20318t> h12 = androidx.compose.animation.core.J1.f26075a;
        a13.I(-142660079);
        C20288i1<Boolean> c20288i1 = this.f37001l;
        boolean zBooleanValue = c20288i1.f26317a.a().booleanValue();
        a13.I(-1553362193);
        float f12 = zBooleanValue ? 1.0f : 0.8f;
        a13.O();
        Float fValueOf = Float.valueOf(f12);
        C22082i3 c22082i3 = (C22082i3) c20288i1.f26320d;
        boolean zBooleanValue2 = ((Boolean) c22082i3.getF42167b()).booleanValue();
        a13.I(-1553362193);
        float f13 = zBooleanValue2 ? 1.0f : 0.8f;
        a13.O();
        C20288i1.d dVarD = C20300m1.d(c20288i1, fValueOf, Float.valueOf(f13), c21757nl.invoke(c20288i1.f(), a13, 0), h12, a13, 196608);
        a13.O();
        a13.O();
        C21734ml c21734ml = C21734ml.f36870l;
        a13.I(-1338768149);
        a13.I(-142660079);
        boolean zBooleanValue3 = c20288i1.f26317a.a().booleanValue();
        a13.I(2073045083);
        float f14 = zBooleanValue3 ? 1.0f : 0.0f;
        a13.O();
        Float fValueOf2 = Float.valueOf(f14);
        boolean zBooleanValue4 = ((Boolean) c22082i3.getF42167b()).booleanValue();
        a13.I(2073045083);
        float f15 = zBooleanValue4 ? 1.0f : 0.0f;
        a13.O();
        C20288i1.d dVarD2 = C20300m1.d(c20288i1, fValueOf2, Float.valueOf(f15), c21734ml.invoke(c20288i1.f(), a13, 0), h12, a13, 196608);
        a13.O();
        a13.O();
        androidx.compose.ui.v vVarB = C22274n0.b(vVar2, ((Number) dVarD.getF42167b()).floatValue(), ((Number) dVarD.getF42167b()).floatValue(), ((Number) dVarD2.getF42167b()).floatValue(), 0.0f, 0.0f, null, false, 131064);
        a13.O();
        return vVarB;
    }
}
