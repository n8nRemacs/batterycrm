package androidx.compose.material3;

import androidx.compose.animation.core.C20304o;
import androidx.compose.animation.core.C20318t;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: SnapFlingBehavior.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/o;", "", "Landroidx/compose/animation/core/t;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/animation/core/o;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class Eg extends kotlin.jvm.internal.N implements Y41.l<C20304o<Float, C20318t>, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f34696l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Lg f34697m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l0.e f34698n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.gestures.G1 f34699o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Eg(float f12, androidx.compose.foundation.gestures.G1 g12, Lg lg2, l0.e eVar) {
        super(1);
        this.f34696l = f12;
        this.f34697m = lg2;
        this.f34698n = eVar;
        this.f34699o = g12;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(C20304o<Float, C20318t> c20304o) {
        C20304o<Float, C20318t> c20304o2 = c20304o;
        float fAbs = Math.abs(((Number) ((C22082i3) c20304o2.f26389e).getF42167b()).floatValue());
        float f12 = this.f34696l;
        float fAbs2 = Math.abs(f12);
        InterfaceC22204y1 interfaceC22204y1 = c20304o2.f26389e;
        l0.e eVar = this.f34698n;
        androidx.compose.foundation.gestures.G1 g12 = this.f34699o;
        if (fAbs >= fAbs2) {
            float fFloatValue = ((Number) ((C22082i3) interfaceC22204y1).getF42167b()).floatValue();
            this.f34697m.getClass();
            float f13 = Lg.f(fFloatValue, f12) - eVar.f406839b;
            if (Math.abs(f13 - g12.a(f13)) > 0.5f) {
                c20304o2.a();
            }
            c20304o2.a();
        } else {
            C22082i3 c22082i3 = (C22082i3) interfaceC22204y1;
            float fFloatValue2 = ((Number) c22082i3.getF42167b()).floatValue() - eVar.f406839b;
            if (Math.abs(fFloatValue2 - g12.a(fFloatValue2)) > 0.5f) {
                c20304o2.a();
            }
            eVar.f406839b = ((Number) c22082i3.getF42167b()).floatValue();
        }
        return kotlin.G0.f406611a;
    }
}
