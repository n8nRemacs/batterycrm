package com.akita.compose.component.toast_bar;

import androidx.compose.ui.graphics.InterfaceC22276o0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ToastBarHost.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/o0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/o0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.akita.compose.component.toast_bar.g, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C27358g extends N implements Y41.l<InterfaceC22276o0, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.animation.core.r f63248l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.animation.core.r f63249m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27358g(androidx.compose.animation.core.r rVar, androidx.compose.animation.core.r rVar2) {
        super(1);
        this.f63248l = rVar;
        this.f63249m = rVar2;
    }

    @Override // Y41.l
    public final G0 invoke(InterfaceC22276o0 interfaceC22276o0) {
        InterfaceC22276o0 interfaceC22276o02 = interfaceC22276o0;
        interfaceC22276o02.setAlpha(((Number) this.f63248l.getF42167b()).floatValue());
        interfaceC22276o02.g(((Number) this.f63249m.getF42167b()).floatValue());
        return G0.f406611a;
    }
}
