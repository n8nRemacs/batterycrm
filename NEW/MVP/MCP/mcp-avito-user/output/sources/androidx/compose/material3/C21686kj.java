package androidx.compose.material3;

import androidx.compose.foundation.C20805p0;
import kotlin.Metadata;

/* compiled from: TextField.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/d;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/d;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.compose.material3.kj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21686kj extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.graphics.drawscope.d, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f36764l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C20805p0 f36765m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21686kj(float f12, C20805p0 c20805p0) {
        super(1);
        this.f36764l = f12;
        this.f36765m = c20805p0;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(androidx.compose.ui.graphics.drawscope.d dVar) {
        androidx.compose.ui.graphics.drawscope.d dVar2 = dVar;
        dVar2.y1();
        androidx.compose.ui.unit.h.f42849c.getClass();
        float f12 = this.f36764l;
        if (!androidx.compose.ui.unit.h.b(f12, 0.0f)) {
            float f40389c = dVar2.getF40389c() * f12;
            float fC2 = l0.n.c(dVar2.i()) - (f40389c / 2);
            androidx.compose.ui.graphics.drawscope.g.z1(dVar2, this.f36765m.f29790b, l0.h.a(0.0f, fC2), l0.h.a(l0.n.e(dVar2.i()), fC2), f40389c, 0.0f, 496);
        }
        return kotlin.G0.f406611a;
    }
}
