package com.akita.compose.component.avatar.group;

import Y41.r;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.v;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: AvatarGroupScope.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/akita/compose/component/avatar/i;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Landroidx/compose/ui/v;", "modifier", "Lkotlin/G0;", "invoke", "(Lcom/akita/compose/component/avatar/i;Landroidx/compose/ui/v;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class i extends N implements r<com.akita.compose.component.avatar.i, v, A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C22096n f60319l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(C22096n c22096n) {
        super(4);
        this.f60319l = c22096n;
    }

    @Override // Y41.r
    public final G0 invoke(com.akita.compose.component.avatar.i iVar, v vVar, A a12, Integer num) {
        int i12;
        com.akita.compose.component.avatar.i iVar2 = iVar;
        v vVar2 = vVar;
        A a13 = a12;
        int iIntValue = num.intValue();
        if ((iIntValue & 14) == 0) {
            i12 = (a13.B(iVar2) ? 4 : 2) | iIntValue;
        } else {
            i12 = iIntValue;
        }
        if ((iIntValue & 112) == 0) {
            i12 |= a13.B(vVar2) ? 32 : 16;
        }
        if ((i12 & 731) == 146 && a13.c()) {
            a13.f();
        } else {
            com.akita.compose.component.avatar.h.b(iVar2, vVar2, iVar2.f60328c, this.f60319l, a13, i12 & WebSocketProtocol.PAYLOAD_SHORT, 0);
        }
        return G0.f406611a;
    }
}
