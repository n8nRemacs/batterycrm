package com.avito.android.multi_message_send.composable;

import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: MultiMessageSendScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/akita/compose/component/navbar/i;", "Lkotlin/G0;", "invoke", "(Lcom/akita/compose/component/navbar/i;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.multi_message_send.composable.u, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32873u extends kotlin.jvm.internal.N implements Y41.q<com.akita.compose.component.navbar.i, androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ G20.f f206576l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<G20.b, G0> f206577m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C32873u(G20.f fVar, Y41.l<? super G20.b, G0> lVar) {
        super(3);
        this.f206576l = fVar;
        this.f206577m = lVar;
    }

    @Override // Y41.q
    public final G0 invoke(com.akita.compose.component.navbar.i iVar, androidx.compose.runtime.A a12, Integer num) {
        com.akita.compose.component.navbar.i iVar2 = iVar;
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num.intValue();
        if ((iIntValue & 14) == 0) {
            iIntValue |= a13.B(iVar2) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && a13.c()) {
            a13.f();
        } else {
            G20.f fVar = this.f206576l;
            if (kotlin.jvm.internal.L.f(fVar.f6263f, Boolean.TRUE)) {
                com.akita.compose.component.navbar.h.c(iVar2, u0.i.c(a13, R.string.multi_message_send_reset_checkbox_text), new C32872t(fVar, this.f206577m), null, null, a13, iIntValue & 14, 12);
            }
        }
        return G0.f406611a;
    }
}
