package com.akita.compose.theme.re23.preview;

import kotlin.Metadata;

/* compiled from: NavBarPreview.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/akita/compose/component/navbar/i;", "Lkotlin/G0;", "invoke", "(Lcom/akita/compose/component/navbar/i;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class B2 extends kotlin.jvm.internal.N implements Y41.q<com.akita.compose.component.navbar.i, androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kotlin.Q<String, com.akita.compose.component.navbar.u> f65261l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B2(kotlin.Q<String, com.akita.compose.component.navbar.u> q12) {
        super(3);
        this.f65261l = q12;
    }

    @Override // Y41.q
    public final kotlin.G0 invoke(com.akita.compose.component.navbar.i iVar, androidx.compose.runtime.A a12, Integer num) {
        com.akita.compose.component.navbar.i iVar2 = iVar;
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num.intValue();
        if ((iIntValue & 14) == 0) {
            iIntValue |= a13.B(iVar2) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && a13.c()) {
            a13.f();
        } else {
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.b.f63985c.getClass();
            int i12 = com.akita.compose.theme.re23.e.f64324T5;
            C27489z2 c27489z2 = C27489z2.f65943l;
            kotlin.Q<String, com.akita.compose.component.navbar.u> q12 = this.f65261l;
            int i13 = iIntValue & 14;
            com.akita.compose.component.navbar.h.a(iVar2, i12, c27489z2, null, q12.f406620c, a13, i13 | 384, 4);
            com.akita.compose.component.navbar.h.c(iVar2, "Add", A2.f65254l, null, q12.f406620c, a13, i13 | 432, 4);
        }
        return kotlin.G0.f406611a;
    }
}
