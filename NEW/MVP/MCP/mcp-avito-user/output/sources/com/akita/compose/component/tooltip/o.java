package com.akita.compose.component.tooltip;

import androidx.compose.animation.core.C20268c;
import androidx.compose.animation.core.C20318t;
import androidx.compose.ui.graphics.InterfaceC22276o0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Tooltip.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/o0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/o0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class o extends N implements Y41.l<InterfaceC22276o0, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C20268c<Float, C20318t> f63529l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(C20268c<Float, C20318t> c20268c) {
        super(1);
        this.f63529l = c20268c;
    }

    @Override // Y41.l
    public final G0 invoke(InterfaceC22276o0 interfaceC22276o0) {
        interfaceC22276o0.setAlpha(this.f63529l.f().floatValue());
        return G0.f406611a;
    }
}
