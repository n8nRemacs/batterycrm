package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: Slider.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/ui/input/pointer/C;", "pointerInput", "", "offset", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/input/pointer/C;F)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class Kf extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.ui.input.pointer.C, Float, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l0.e f35018l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Kf(l0.e eVar) {
        super(2);
        this.f35018l = eVar;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.ui.input.pointer.C c12, Float f12) {
        float fFloatValue = f12.floatValue();
        c12.a();
        this.f35018l.f406839b = fFloatValue;
        return kotlin.G0.f406611a;
    }
}
