package com.akita.compose.theme.re23.preview;

import kotlin.Metadata;

/* compiled from: TooltipPreview.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class b4 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.T f65619l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.tooltip.t f65620m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(kotlinx.coroutines.T t12, com.akita.compose.component.tooltip.t tVar) {
        super(2);
        this.f65619l = t12;
        this.f65620m = tVar;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            a4 a4Var = new a4(this.f65619l, this.f65620m);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.component.button.m.c("Show tooltip", a4Var, com.akita.compose.theme.re23.b.c(a13).X1(), null, null, null, null, false, false, null, a13, 518, 1016);
        }
        return kotlin.G0.f406611a;
    }
}
