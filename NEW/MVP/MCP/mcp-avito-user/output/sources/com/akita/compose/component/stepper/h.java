package com.akita.compose.component.stepper;

import androidx.compose.animation.core.C20268c;
import androidx.compose.animation.core.C20318t;
import androidx.compose.ui.graphics.InterfaceC22276o0;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Stepper.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/o0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/o0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class h extends N implements Y41.l<InterfaceC22276o0, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Map<Integer, C20268c<Float, C20318t>> f62861l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f62862m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Map<Integer, C20268c<Float, C20318t>> map, int i12) {
        super(1);
        this.f62861l = map;
        this.f62862m = i12;
    }

    @Override // Y41.l
    public final G0 invoke(InterfaceC22276o0 interfaceC22276o0) {
        InterfaceC22276o0 interfaceC22276o02 = interfaceC22276o0;
        C20268c<Float, C20318t> c20268c = this.f62861l.get(Integer.valueOf(this.f62862m));
        interfaceC22276o02.g(c20268c != null ? c20268c.f().floatValue() : 0.0f);
        return G0.f406611a;
    }
}
