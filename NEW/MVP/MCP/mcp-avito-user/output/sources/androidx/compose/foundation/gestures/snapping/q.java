package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.C20304o;
import androidx.compose.animation.core.C20318t;
import androidx.compose.foundation.gestures.G1;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;

/* compiled from: SnapFlingBehavior.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/o;", "", "Landroidx/compose/animation/core/t;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/animation/core/o;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class q extends N implements Y41.l<C20304o<Float, C20318t>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f28040l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l0.e f28041m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ G1 f28042n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Float, G0> f28043o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q(float f12, l0.e eVar, G1 g12, Y41.l<? super Float, G0> lVar) {
        super(1);
        this.f28040l = f12;
        this.f28041m = eVar;
        this.f28042n = g12;
        this.f28043o = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(C20304o<Float, C20318t> c20304o) {
        C20304o<Float, C20318t> c20304o2 = c20304o;
        float fAbs = Math.abs(((Number) ((C22082i3) c20304o2.f26389e).getF42167b()).floatValue());
        float f12 = this.f28040l;
        float fAbs2 = Math.abs(f12);
        InterfaceC22204y1 interfaceC22204y1 = c20304o2.f26389e;
        Y41.l<Float, G0> lVar = this.f28043o;
        G1 g12 = this.f28042n;
        l0.e eVar = this.f28041m;
        if (fAbs >= fAbs2) {
            float fD2 = t.d(((Number) ((C22082i3) interfaceC22204y1).getF42167b()).floatValue(), f12);
            t.b(c20304o2, g12, lVar, fD2 - eVar.f406839b);
            c20304o2.a();
            eVar.f406839b = fD2;
        } else {
            C22082i3 c22082i3 = (C22082i3) interfaceC22204y1;
            t.b(c20304o2, g12, lVar, ((Number) c22082i3.getF42167b()).floatValue() - eVar.f406839b);
            eVar.f406839b = ((Number) c22082i3.getF42167b()).floatValue();
        }
        return G0.f406611a;
    }
}
